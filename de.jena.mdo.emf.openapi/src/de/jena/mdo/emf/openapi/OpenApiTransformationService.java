package de.jena.mdo.emf.openapi;

import java.util.Optional;
import java.util.function.Predicate;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.media.IntegerSchema;
import io.swagger.v3.oas.models.media.NumberSchema;
import io.swagger.v3.oas.models.media.ObjectSchema;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.media.StringSchema;
import io.swagger.v3.oas.models.media.UUIDSchema;

public class OpenApiTransformationService {

	private static final String DOCUMENTATION = "documentation";
	private static final String GEN_MODEL_PACKAGE_ENS_URI = "http://www.eclipse.org/emf/2002/GenModel";

	public OpenAPI schemaFrom(EPackage ePackage) {

		OpenAPI openAPI = new OpenAPI();
		Info info = infoOf(ePackage);
		openAPI.setInfo(info);

		Components components = componentsOf(ePackage);
		openAPI.setComponents(components);
		return openAPI;

	}

	public Components componentsOf(EPackage ePackage) {

		Components components = new Components();
		ePackage.getEClassifiers().stream().filter(EClass.class::isInstance).map(EClass.class::cast)
				.forEachOrdered(eC -> components.addSchemas(eC.getName(), schemaOf(eC)));
		return components;
	}

	public Info infoOf(EPackage ePackage) {
		Info info = new Info();
		documentationOf(ePackage).ifPresent(info::setDescription);
		info.setTitle(ePackage.getName());
		return info;
	}

	public Schema<?> schemaOf(EClass eClass) {

		Schema<?> schema = new ObjectSchema();
		schema.setDefault(eClass.getDefaultValue());// really?
		schema.setName(eClass.getName());

		documentationOf(eClass).ifPresent(schema::setDescription);
		for (EAttribute eAttribute : eClass.getEAllAttributes()) {

			if (eAttribute.isRequired()) {
				schema.addRequiredItem(eAttribute.getName());

			}
			schema.addProperties(eAttribute.getName(), schemaOf(eAttribute));
		}

		return schema;
	}

	public Schema<?> schemaOf(EAttribute eAttribute) {
		Schema<?> schema = null;
		if (eAttribute.getUpperBound() != 0) {

			schema = extracted(eAttribute);
		} else {

		}
		schema.setType(DOCUMENTATION);
		schema.setMinItems(eAttribute.getLowerBound());
		schema.setMaxItems(eAttribute.getUpperBound());

		return schema;
	}

	private static Schema<?> extracted(EAttribute eAttribute) {
		Schema<?> schema;
		if (isUUIDSchema(eAttribute)) {
			schema = new UUIDSchema();
		} else if (isStringSchema(eAttribute)) {
			schema = new StringSchema();
		} else if (isNumberSchema(eAttribute)) {
			schema = new NumberSchema();
		} else if (isIntegerSchema(eAttribute)) {
			schema = new IntegerSchema();
//		} else if (false) {
//			schema = new BinarySchema();
//		}else if (false) {
//			schema = new BooleanSchema();
//		}else if (false) {
//			schema = new ByteArraySchema();
//		}else if (false) {
//			schema = new ComposedSchema();
//		}else if (false) {
//			schema = new DateSchema();
//		}else if (false) {
//			schema = new EmailSchema();
//		}else if (false) {
//			schema = new FileSchema();
//		}else if (false) {
//			schema = new MapSchema();
//		}else if (false) {
//			schema = new PasswordSchema();
		}else {
			schema = new StringSchema();
		}

		return schema;
	}

	private static boolean isIntegerSchema(EAttribute eAttribute) {
		return eAttribute.getEType() == EcorePackage.Literals.EBIG_INTEGER
				|| eAttribute.getEType() == EcorePackage.Literals.EINT
				|| eAttribute.getEType() == EcorePackage.Literals.EINTEGER_OBJECT;
	}

	private static boolean isNumberSchema(EAttribute eAttribute) {
		return eAttribute.getEType() == EcorePackage.Literals.EBIG_DECIMAL;
	}

	private static boolean isUUIDSchema(EAttribute eAttribute) {
		return eAttribute.getEType() == EcorePackage.Literals.ESTRING && false;
	}

	private static boolean isStringSchema(EAttribute eAttribute) {
		return eAttribute.getEType() == EcorePackage.Literals.ESTRING
				|| eAttribute.getEType() == EcorePackage.Literals.ESHORT
				|| eAttribute.getEType() == EcorePackage.Literals.ESHORT_OBJECT;
	}

	public static Optional<String> documentationOf(EModelElement eModelElement) {

		return eModelElement.getEAnnotations().stream().filter(isGenModelSource()).filter(hasDocumentationDetail())
				.filter(hasDetails()).findFirst().map(eA -> eA.getDetails().get(DOCUMENTATION));
	}

	private static Predicate<? super EAnnotation> hasDetails() {
		return eAnnotation -> eAnnotation.getDetails().size() > 1;
	}

	private static Predicate<? super EAnnotation> hasDocumentationDetail() {
		return eAnnotation -> eAnnotation.getDetails().containsKey(DOCUMENTATION);
	}

	private static Predicate<? super EAnnotation> isGenModelSource() {
		return aeAnnotation -> aeAnnotation.getSource().equals(GEN_MODEL_PACKAGE_ENS_URI);
	}
}