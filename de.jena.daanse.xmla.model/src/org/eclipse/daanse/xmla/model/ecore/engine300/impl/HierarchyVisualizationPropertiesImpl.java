/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine300.impl;

import java.math.BigInteger;

import org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType2;
import org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package;
import org.eclipse.daanse.xmla.model.ecore.engine300.HierarchyVisualizationProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hierarchy Visualization Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.HierarchyVisualizationPropertiesImpl#getContextualNameRule <em>Contextual Name Rule</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.HierarchyVisualizationPropertiesImpl#getFolderPosition <em>Folder Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HierarchyVisualizationPropertiesImpl extends MinimalEObjectImpl.Container implements HierarchyVisualizationProperties {
	/**
	 * The default value of the '{@link #getContextualNameRule() <em>Contextual Name Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextualNameRule()
	 * @generated
	 * @ordered
	 */
	protected static final ContextualNameRuleType2 CONTEXTUAL_NAME_RULE_EDEFAULT = ContextualNameRuleType2.NONE;

	/**
	 * The cached value of the '{@link #getContextualNameRule() <em>Contextual Name Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextualNameRule()
	 * @generated
	 * @ordered
	 */
	protected ContextualNameRuleType2 contextualNameRule = CONTEXTUAL_NAME_RULE_EDEFAULT;

	/**
	 * This is true if the Contextual Name Rule attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean contextualNameRuleESet;

	/**
	 * The default value of the '{@link #getFolderPosition() <em>Folder Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFolderPosition()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger FOLDER_POSITION_EDEFAULT = new BigInteger("-1");

	/**
	 * The cached value of the '{@link #getFolderPosition() <em>Folder Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFolderPosition()
	 * @generated
	 * @ordered
	 */
	protected BigInteger folderPosition = FOLDER_POSITION_EDEFAULT;

	/**
	 * This is true if the Folder Position attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean folderPositionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HierarchyVisualizationPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Engine300Package.Literals.HIERARCHY_VISUALIZATION_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextualNameRuleType2 getContextualNameRule() {
		return contextualNameRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextualNameRule(ContextualNameRuleType2 newContextualNameRule) {
		ContextualNameRuleType2 oldContextualNameRule = contextualNameRule;
		contextualNameRule = newContextualNameRule == null ? CONTEXTUAL_NAME_RULE_EDEFAULT : newContextualNameRule;
		boolean oldContextualNameRuleESet = contextualNameRuleESet;
		contextualNameRuleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300Package.HIERARCHY_VISUALIZATION_PROPERTIES__CONTEXTUAL_NAME_RULE, oldContextualNameRule, contextualNameRule, !oldContextualNameRuleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContextualNameRule() {
		ContextualNameRuleType2 oldContextualNameRule = contextualNameRule;
		boolean oldContextualNameRuleESet = contextualNameRuleESet;
		contextualNameRule = CONTEXTUAL_NAME_RULE_EDEFAULT;
		contextualNameRuleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300Package.HIERARCHY_VISUALIZATION_PROPERTIES__CONTEXTUAL_NAME_RULE, oldContextualNameRule, CONTEXTUAL_NAME_RULE_EDEFAULT, oldContextualNameRuleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContextualNameRule() {
		return contextualNameRuleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getFolderPosition() {
		return folderPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFolderPosition(BigInteger newFolderPosition) {
		BigInteger oldFolderPosition = folderPosition;
		folderPosition = newFolderPosition;
		boolean oldFolderPositionESet = folderPositionESet;
		folderPositionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300Package.HIERARCHY_VISUALIZATION_PROPERTIES__FOLDER_POSITION, oldFolderPosition, folderPosition, !oldFolderPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFolderPosition() {
		BigInteger oldFolderPosition = folderPosition;
		boolean oldFolderPositionESet = folderPositionESet;
		folderPosition = FOLDER_POSITION_EDEFAULT;
		folderPositionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300Package.HIERARCHY_VISUALIZATION_PROPERTIES__FOLDER_POSITION, oldFolderPosition, FOLDER_POSITION_EDEFAULT, oldFolderPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFolderPosition() {
		return folderPositionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Engine300Package.HIERARCHY_VISUALIZATION_PROPERTIES__CONTEXTUAL_NAME_RULE:
				return getContextualNameRule();
			case Engine300Package.HIERARCHY_VISUALIZATION_PROPERTIES__FOLDER_POSITION:
				return getFolderPosition();
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
			case Engine300Package.HIERARCHY_VISUALIZATION_PROPERTIES__CONTEXTUAL_NAME_RULE:
				setContextualNameRule((ContextualNameRuleType2)newValue);
				return;
			case Engine300Package.HIERARCHY_VISUALIZATION_PROPERTIES__FOLDER_POSITION:
				setFolderPosition((BigInteger)newValue);
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
			case Engine300Package.HIERARCHY_VISUALIZATION_PROPERTIES__CONTEXTUAL_NAME_RULE:
				unsetContextualNameRule();
				return;
			case Engine300Package.HIERARCHY_VISUALIZATION_PROPERTIES__FOLDER_POSITION:
				unsetFolderPosition();
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
			case Engine300Package.HIERARCHY_VISUALIZATION_PROPERTIES__CONTEXTUAL_NAME_RULE:
				return isSetContextualNameRule();
			case Engine300Package.HIERARCHY_VISUALIZATION_PROPERTIES__FOLDER_POSITION:
				return isSetFolderPosition();
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
		result.append(" (contextualNameRule: ");
		if (contextualNameRuleESet) result.append(contextualNameRule); else result.append("<unset>");
		result.append(", folderPosition: ");
		if (folderPositionESet) result.append(folderPosition); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //HierarchyVisualizationPropertiesImpl
