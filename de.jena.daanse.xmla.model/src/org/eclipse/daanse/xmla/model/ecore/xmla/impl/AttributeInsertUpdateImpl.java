/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.math.BigInteger;

import org.eclipse.daanse.xmla.model.ecore.xmla.AttributeInsertUpdate;
import org.eclipse.daanse.xmla.model.ecore.xmla.KeysType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Insert Update</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AttributeInsertUpdateImpl#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AttributeInsertUpdateImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AttributeInsertUpdateImpl#getKeys <em>Keys</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AttributeInsertUpdateImpl#getTranslations <em>Translations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AttributeInsertUpdateImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AttributeInsertUpdateImpl#getCUSTOMROLLUP <em>CUSTOMROLLUP</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AttributeInsertUpdateImpl#getCUSTOMROLLUPPROPERTIES <em>CUSTOMROLLUPPROPERTIES</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AttributeInsertUpdateImpl#getUNARYOPERATOR <em>UNARYOPERATOR</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AttributeInsertUpdateImpl#getSKIPPEDLEVELS <em>SKIPPEDLEVELS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeInsertUpdateImpl extends MinimalEObjectImpl.Container implements AttributeInsertUpdate {
	/**
	 * The default value of the '{@link #getAttributeName() <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeName()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeName() <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeName()
	 * @generated
	 * @ordered
	 */
	protected String attributeName = ATTRIBUTE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKeys() <em>Keys</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeys()
	 * @generated
	 * @ordered
	 */
	protected KeysType1 keys;

	/**
	 * The cached value of the '{@link #getTranslations() <em>Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslations()
	 * @generated
	 * @ordered
	 */
	protected TranslationsType translations;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCUSTOMROLLUP() <em>CUSTOMROLLUP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCUSTOMROLLUP()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMROLLUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCUSTOMROLLUP() <em>CUSTOMROLLUP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCUSTOMROLLUP()
	 * @generated
	 * @ordered
	 */
	protected String cUSTOMROLLUP = CUSTOMROLLUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getCUSTOMROLLUPPROPERTIES() <em>CUSTOMROLLUPPROPERTIES</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCUSTOMROLLUPPROPERTIES()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMROLLUPPROPERTIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCUSTOMROLLUPPROPERTIES() <em>CUSTOMROLLUPPROPERTIES</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCUSTOMROLLUPPROPERTIES()
	 * @generated
	 * @ordered
	 */
	protected String cUSTOMROLLUPPROPERTIES = CUSTOMROLLUPPROPERTIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getUNARYOPERATOR() <em>UNARYOPERATOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUNARYOPERATOR()
	 * @generated
	 * @ordered
	 */
	protected static final String UNARYOPERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUNARYOPERATOR() <em>UNARYOPERATOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUNARYOPERATOR()
	 * @generated
	 * @ordered
	 */
	protected String uNARYOPERATOR = UNARYOPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSKIPPEDLEVELS() <em>SKIPPEDLEVELS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSKIPPEDLEVELS()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SKIPPEDLEVELS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSKIPPEDLEVELS() <em>SKIPPEDLEVELS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSKIPPEDLEVELS()
	 * @generated
	 * @ordered
	 */
	protected BigInteger sKIPPEDLEVELS = SKIPPEDLEVELS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeInsertUpdateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.ATTRIBUTE_INSERT_UPDATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttributeName() {
		return attributeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeName(String newAttributeName) {
		String oldAttributeName = attributeName;
		attributeName = newAttributeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ATTRIBUTE_INSERT_UPDATE__ATTRIBUTE_NAME, oldAttributeName, attributeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ATTRIBUTE_INSERT_UPDATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeysType1 getKeys() {
		return keys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeys(KeysType1 newKeys, NotificationChain msgs) {
		KeysType1 oldKeys = keys;
		keys = newKeys;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.ATTRIBUTE_INSERT_UPDATE__KEYS, oldKeys, newKeys);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeys(KeysType1 newKeys) {
		if (newKeys != keys) {
			NotificationChain msgs = null;
			if (keys != null)
				msgs = ((InternalEObject)keys).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.ATTRIBUTE_INSERT_UPDATE__KEYS, null, msgs);
			if (newKeys != null)
				msgs = ((InternalEObject)newKeys).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.ATTRIBUTE_INSERT_UPDATE__KEYS, null, msgs);
			msgs = basicSetKeys(newKeys, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ATTRIBUTE_INSERT_UPDATE__KEYS, newKeys, newKeys));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationsType getTranslations() {
		return translations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTranslations(TranslationsType newTranslations, NotificationChain msgs) {
		TranslationsType oldTranslations = translations;
		translations = newTranslations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.ATTRIBUTE_INSERT_UPDATE__TRANSLATIONS, oldTranslations, newTranslations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslations(TranslationsType newTranslations) {
		if (newTranslations != translations) {
			NotificationChain msgs = null;
			if (translations != null)
				msgs = ((InternalEObject)translations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.ATTRIBUTE_INSERT_UPDATE__TRANSLATIONS, null, msgs);
			if (newTranslations != null)
				msgs = ((InternalEObject)newTranslations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.ATTRIBUTE_INSERT_UPDATE__TRANSLATIONS, null, msgs);
			msgs = basicSetTranslations(newTranslations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ATTRIBUTE_INSERT_UPDATE__TRANSLATIONS, newTranslations, newTranslations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ATTRIBUTE_INSERT_UPDATE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCUSTOMROLLUP() {
		return cUSTOMROLLUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCUSTOMROLLUP(String newCUSTOMROLLUP) {
		String oldCUSTOMROLLUP = cUSTOMROLLUP;
		cUSTOMROLLUP = newCUSTOMROLLUP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ATTRIBUTE_INSERT_UPDATE__CUSTOMROLLUP, oldCUSTOMROLLUP, cUSTOMROLLUP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCUSTOMROLLUPPROPERTIES() {
		return cUSTOMROLLUPPROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCUSTOMROLLUPPROPERTIES(String newCUSTOMROLLUPPROPERTIES) {
		String oldCUSTOMROLLUPPROPERTIES = cUSTOMROLLUPPROPERTIES;
		cUSTOMROLLUPPROPERTIES = newCUSTOMROLLUPPROPERTIES;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ATTRIBUTE_INSERT_UPDATE__CUSTOMROLLUPPROPERTIES, oldCUSTOMROLLUPPROPERTIES, cUSTOMROLLUPPROPERTIES));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUNARYOPERATOR() {
		return uNARYOPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUNARYOPERATOR(String newUNARYOPERATOR) {
		String oldUNARYOPERATOR = uNARYOPERATOR;
		uNARYOPERATOR = newUNARYOPERATOR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ATTRIBUTE_INSERT_UPDATE__UNARYOPERATOR, oldUNARYOPERATOR, uNARYOPERATOR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSKIPPEDLEVELS() {
		return sKIPPEDLEVELS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSKIPPEDLEVELS(BigInteger newSKIPPEDLEVELS) {
		BigInteger oldSKIPPEDLEVELS = sKIPPEDLEVELS;
		sKIPPEDLEVELS = newSKIPPEDLEVELS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ATTRIBUTE_INSERT_UPDATE__SKIPPEDLEVELS, oldSKIPPEDLEVELS, sKIPPEDLEVELS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__KEYS:
				return basicSetKeys(null, msgs);
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__TRANSLATIONS:
				return basicSetTranslations(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__ATTRIBUTE_NAME:
				return getAttributeName();
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__NAME:
				return getName();
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__KEYS:
				return getKeys();
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__TRANSLATIONS:
				return getTranslations();
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__VALUE:
				return getValue();
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__CUSTOMROLLUP:
				return getCUSTOMROLLUP();
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__CUSTOMROLLUPPROPERTIES:
				return getCUSTOMROLLUPPROPERTIES();
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__UNARYOPERATOR:
				return getUNARYOPERATOR();
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__SKIPPEDLEVELS:
				return getSKIPPEDLEVELS();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__ATTRIBUTE_NAME:
				setAttributeName((String)newValue);
				return;
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__NAME:
				setName((String)newValue);
				return;
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__KEYS:
				setKeys((KeysType1)newValue);
				return;
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__TRANSLATIONS:
				setTranslations((TranslationsType)newValue);
				return;
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__VALUE:
				setValue((String)newValue);
				return;
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__CUSTOMROLLUP:
				setCUSTOMROLLUP((String)newValue);
				return;
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__CUSTOMROLLUPPROPERTIES:
				setCUSTOMROLLUPPROPERTIES((String)newValue);
				return;
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__UNARYOPERATOR:
				setUNARYOPERATOR((String)newValue);
				return;
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__SKIPPEDLEVELS:
				setSKIPPEDLEVELS((BigInteger)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__ATTRIBUTE_NAME:
				setAttributeName(ATTRIBUTE_NAME_EDEFAULT);
				return;
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__KEYS:
				setKeys((KeysType1)null);
				return;
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__TRANSLATIONS:
				setTranslations((TranslationsType)null);
				return;
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__CUSTOMROLLUP:
				setCUSTOMROLLUP(CUSTOMROLLUP_EDEFAULT);
				return;
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__CUSTOMROLLUPPROPERTIES:
				setCUSTOMROLLUPPROPERTIES(CUSTOMROLLUPPROPERTIES_EDEFAULT);
				return;
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__UNARYOPERATOR:
				setUNARYOPERATOR(UNARYOPERATOR_EDEFAULT);
				return;
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__SKIPPEDLEVELS:
				setSKIPPEDLEVELS(SKIPPEDLEVELS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__ATTRIBUTE_NAME:
				return ATTRIBUTE_NAME_EDEFAULT == null ? attributeName != null : !ATTRIBUTE_NAME_EDEFAULT.equals(attributeName);
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__KEYS:
				return keys != null;
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__TRANSLATIONS:
				return translations != null;
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__CUSTOMROLLUP:
				return CUSTOMROLLUP_EDEFAULT == null ? cUSTOMROLLUP != null : !CUSTOMROLLUP_EDEFAULT.equals(cUSTOMROLLUP);
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__CUSTOMROLLUPPROPERTIES:
				return CUSTOMROLLUPPROPERTIES_EDEFAULT == null ? cUSTOMROLLUPPROPERTIES != null : !CUSTOMROLLUPPROPERTIES_EDEFAULT.equals(cUSTOMROLLUPPROPERTIES);
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__UNARYOPERATOR:
				return UNARYOPERATOR_EDEFAULT == null ? uNARYOPERATOR != null : !UNARYOPERATOR_EDEFAULT.equals(uNARYOPERATOR);
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE__SKIPPEDLEVELS:
				return SKIPPEDLEVELS_EDEFAULT == null ? sKIPPEDLEVELS != null : !SKIPPEDLEVELS_EDEFAULT.equals(sKIPPEDLEVELS);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (attributeName: ");
		result.append(attributeName);
		result.append(", name: ");
		result.append(name);
		result.append(", value: ");
		result.append(value);
		result.append(", cUSTOMROLLUP: ");
		result.append(cUSTOMROLLUP);
		result.append(", cUSTOMROLLUPPROPERTIES: ");
		result.append(cUSTOMROLLUPPROPERTIES);
		result.append(", uNARYOPERATOR: ");
		result.append(uNARYOPERATOR);
		result.append(", sKIPPEDLEVELS: ");
		result.append(sKIPPEDLEVELS);
		result.append(')');
		return result.toString();
	}

} //AttributeInsertUpdateImpl
