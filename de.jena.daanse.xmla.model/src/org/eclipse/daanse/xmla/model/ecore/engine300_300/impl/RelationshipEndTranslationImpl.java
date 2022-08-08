/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine300_300.impl;

import org.eclipse.daanse.xmla.model.ecore.engine300_300.AnnotationsType;
import org.eclipse.daanse.xmla.model.ecore.engine300_300.Engine300_300Package;
import org.eclipse.daanse.xmla.model.ecore.engine300_300.RelationshipEndTranslation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship End Translation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.RelationshipEndTranslationImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.RelationshipEndTranslationImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.RelationshipEndTranslationImpl#getCollectionCaption <em>Collection Caption</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.RelationshipEndTranslationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.RelationshipEndTranslationImpl#getDisplayFolder <em>Display Folder</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.RelationshipEndTranslationImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipEndTranslationImpl extends MinimalEObjectImpl.Container implements RelationshipEndTranslation {
	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final long LANGUAGE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected long language = LANGUAGE_EDEFAULT;

	/**
	 * This is true if the Language attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean languageESet;

	/**
	 * The default value of the '{@link #getCaption() <em>Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaption()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaption() <em>Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaption()
	 * @generated
	 * @ordered
	 */
	protected String caption = CAPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCollectionCaption() <em>Collection Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionCaption()
	 * @generated
	 * @ordered
	 */
	protected static final String COLLECTION_CAPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCollectionCaption() <em>Collection Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionCaption()
	 * @generated
	 * @ordered
	 */
	protected String collectionCaption = COLLECTION_CAPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayFolder() <em>Display Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_FOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayFolder() <em>Display Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayFolder()
	 * @generated
	 * @ordered
	 */
	protected String displayFolder = DISPLAY_FOLDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected AnnotationsType annotations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipEndTranslationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Engine300_300Package.Literals.RELATIONSHIP_END_TRANSLATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(long newLanguage) {
		long oldLanguage = language;
		language = newLanguage;
		boolean oldLanguageESet = languageESet;
		languageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300_300Package.RELATIONSHIP_END_TRANSLATION__LANGUAGE, oldLanguage, language, !oldLanguageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLanguage() {
		long oldLanguage = language;
		boolean oldLanguageESet = languageESet;
		language = LANGUAGE_EDEFAULT;
		languageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300_300Package.RELATIONSHIP_END_TRANSLATION__LANGUAGE, oldLanguage, LANGUAGE_EDEFAULT, oldLanguageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLanguage() {
		return languageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCaption() {
		return caption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaption(String newCaption) {
		String oldCaption = caption;
		caption = newCaption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300_300Package.RELATIONSHIP_END_TRANSLATION__CAPTION, oldCaption, caption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCollectionCaption() {
		return collectionCaption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionCaption(String newCollectionCaption) {
		String oldCollectionCaption = collectionCaption;
		collectionCaption = newCollectionCaption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300_300Package.RELATIONSHIP_END_TRANSLATION__COLLECTION_CAPTION, oldCollectionCaption, collectionCaption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300_300Package.RELATIONSHIP_END_TRANSLATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayFolder() {
		return displayFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayFolder(String newDisplayFolder) {
		String oldDisplayFolder = displayFolder;
		displayFolder = newDisplayFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300_300Package.RELATIONSHIP_END_TRANSLATION__DISPLAY_FOLDER, oldDisplayFolder, displayFolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(AnnotationsType newAnnotations, NotificationChain msgs) {
		AnnotationsType oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Engine300_300Package.RELATIONSHIP_END_TRANSLATION__ANNOTATIONS, oldAnnotations, newAnnotations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(AnnotationsType newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null)
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Engine300_300Package.RELATIONSHIP_END_TRANSLATION__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Engine300_300Package.RELATIONSHIP_END_TRANSLATION__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300_300Package.RELATIONSHIP_END_TRANSLATION__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Engine300_300Package.RELATIONSHIP_END_TRANSLATION__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
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
			case Engine300_300Package.RELATIONSHIP_END_TRANSLATION__LANGUAGE:
				return getLanguage();
			case Engine300_300Package.RELATIONSHIP_END_TRANSLATION__CAPTION:
				return getCaption();
			case Engine300_300Package.RELATIONSHIP_END_TRANSLATION__COLLECTION_CAPTION:
				return getCollectionCaption();
			case Engine300_300Package.RELATIONSHIP_END_TRANSLATION__DESCRIPTION:
				return getDescription();
			case Engine300_300Package.RELATIONSHIP_END_TRANSLATION__DISPLAY_FOLDER:
				return getDisplayFolder();
			case Engine300_300Package.RELATIONSHIP_END_TRANSLATION__ANNOTATIONS:
				return getAnnotations();
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
			case Engine300_300Package.RELATIONSHIP_END_TRANSLATION__LANGUAGE:
				setLanguage((Long)newValue);
				return;
			case Engine300_300Package.RELATIONSHIP_END_TRANSLATION__CAPTION:
				setCaption((String)newValue);
				return;
			case Engine300_300Package.RELATIONSHIP_END_TRANSLATION__COLLECTION_CAPTION:
				setCollectionCaption((String)newValue);
				return;
			case Engine300_300Package.RELATIONSHIP_END_TRANSLATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Engine300_300Package.RELATIONSHIP_END_TRANSLATION__DISPLAY_FOLDER:
				setDisplayFolder((String)newValue);
				return;
			case Engine300_300Package.RELATIONSHIP_END_TRANSLATION__ANNOTATIONS:
				setAnnotations((AnnotationsType)newValue);
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
			case Engine300_300Package.RELATIONSHIP_END_TRANSLATION__LANGUAGE:
				unsetLanguage();
				return;
			case Engine300_300Package.RELATIONSHIP_END_TRANSLATION__CAPTION:
				setCaption(CAPTION_EDEFAULT);
				return;
			case Engine300_300Package.RELATIONSHIP_END_TRANSLATION__COLLECTION_CAPTION:
				setCollectionCaption(COLLECTION_CAPTION_EDEFAULT);
				return;
			case Engine300_300Package.RELATIONSHIP_END_TRANSLATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Engine300_300Package.RELATIONSHIP_END_TRANSLATION__DISPLAY_FOLDER:
				setDisplayFolder(DISPLAY_FOLDER_EDEFAULT);
				return;
			case Engine300_300Package.RELATIONSHIP_END_TRANSLATION__ANNOTATIONS:
				setAnnotations((AnnotationsType)null);
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
			case Engine300_300Package.RELATIONSHIP_END_TRANSLATION__LANGUAGE:
				return isSetLanguage();
			case Engine300_300Package.RELATIONSHIP_END_TRANSLATION__CAPTION:
				return CAPTION_EDEFAULT == null ? caption != null : !CAPTION_EDEFAULT.equals(caption);
			case Engine300_300Package.RELATIONSHIP_END_TRANSLATION__COLLECTION_CAPTION:
				return COLLECTION_CAPTION_EDEFAULT == null ? collectionCaption != null : !COLLECTION_CAPTION_EDEFAULT.equals(collectionCaption);
			case Engine300_300Package.RELATIONSHIP_END_TRANSLATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Engine300_300Package.RELATIONSHIP_END_TRANSLATION__DISPLAY_FOLDER:
				return DISPLAY_FOLDER_EDEFAULT == null ? displayFolder != null : !DISPLAY_FOLDER_EDEFAULT.equals(displayFolder);
			case Engine300_300Package.RELATIONSHIP_END_TRANSLATION__ANNOTATIONS:
				return annotations != null;
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
		result.append(" (language: ");
		if (languageESet) result.append(language); else result.append("<unset>");
		result.append(", caption: ");
		result.append(caption);
		result.append(", collectionCaption: ");
		result.append(collectionCaption);
		result.append(", description: ");
		result.append(description);
		result.append(", displayFolder: ");
		result.append(displayFolder);
		result.append(')');
		return result.toString();
	}

} //RelationshipEndTranslationImpl
