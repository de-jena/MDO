/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Algorithm Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAlgorithmType()
 * @model extendedMetaData="name='Algorithm_._type'"
 * @generated
 */
public enum AlgorithmType implements Enumerator {
	/**
	 * The '<em><b>Microsoft Naive Bayes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICROSOFT_NAIVE_BAYES_VALUE
	 * @generated
	 * @ordered
	 */
	MICROSOFT_NAIVE_BAYES(0, "MicrosoftNaiveBayes", "Microsoft_Naive_Bayes"),

	/**
	 * The '<em><b>Microsoft Decision Trees</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICROSOFT_DECISION_TREES_VALUE
	 * @generated
	 * @ordered
	 */
	MICROSOFT_DECISION_TREES(1, "MicrosoftDecisionTrees", "Microsoft_Decision_Trees"),

	/**
	 * The '<em><b>Microsoft Clustering</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICROSOFT_CLUSTERING_VALUE
	 * @generated
	 * @ordered
	 */
	MICROSOFT_CLUSTERING(2, "MicrosoftClustering", "Microsoft_Clustering"),

	/**
	 * The '<em><b>Microsoft Neural Network</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICROSOFT_NEURAL_NETWORK_VALUE
	 * @generated
	 * @ordered
	 */
	MICROSOFT_NEURAL_NETWORK(3, "MicrosoftNeuralNetwork", "Microsoft_Neural_Network"),

	/**
	 * The '<em><b>Microsoft Logistic Regression</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICROSOFT_LOGISTIC_REGRESSION_VALUE
	 * @generated
	 * @ordered
	 */
	MICROSOFT_LOGISTIC_REGRESSION(4, "MicrosoftLogisticRegression", "Microsoft_Logistic_Regression"),

	/**
	 * The '<em><b>Microsoft Linear Regression</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICROSOFT_LINEAR_REGRESSION_VALUE
	 * @generated
	 * @ordered
	 */
	MICROSOFT_LINEAR_REGRESSION(5, "MicrosoftLinearRegression", "Microsoft_Linear_Regression"),

	/**
	 * The '<em><b>Microsoft Association Rules</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICROSOFT_ASSOCIATION_RULES_VALUE
	 * @generated
	 * @ordered
	 */
	MICROSOFT_ASSOCIATION_RULES(6, "MicrosoftAssociationRules", "Microsoft_Association_Rules"),

	/**
	 * The '<em><b>Microsoft Time Series</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICROSOFT_TIME_SERIES_VALUE
	 * @generated
	 * @ordered
	 */
	MICROSOFT_TIME_SERIES(7, "MicrosoftTimeSeries", "Microsoft_Time_Series"),

	/**
	 * The '<em><b>Microsoft Sequence Clustering</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICROSOFT_SEQUENCE_CLUSTERING_VALUE
	 * @generated
	 * @ordered
	 */
	MICROSOFT_SEQUENCE_CLUSTERING(8, "MicrosoftSequenceClustering", "Microsoft_Sequence_Clustering");

	/**
	 * The '<em><b>Microsoft Naive Bayes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICROSOFT_NAIVE_BAYES
	 * @model name="MicrosoftNaiveBayes" literal="Microsoft_Naive_Bayes"
	 * @generated
	 * @ordered
	 */
	public static final int MICROSOFT_NAIVE_BAYES_VALUE = 0;

	/**
	 * The '<em><b>Microsoft Decision Trees</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICROSOFT_DECISION_TREES
	 * @model name="MicrosoftDecisionTrees" literal="Microsoft_Decision_Trees"
	 * @generated
	 * @ordered
	 */
	public static final int MICROSOFT_DECISION_TREES_VALUE = 1;

	/**
	 * The '<em><b>Microsoft Clustering</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICROSOFT_CLUSTERING
	 * @model name="MicrosoftClustering" literal="Microsoft_Clustering"
	 * @generated
	 * @ordered
	 */
	public static final int MICROSOFT_CLUSTERING_VALUE = 2;

	/**
	 * The '<em><b>Microsoft Neural Network</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICROSOFT_NEURAL_NETWORK
	 * @model name="MicrosoftNeuralNetwork" literal="Microsoft_Neural_Network"
	 * @generated
	 * @ordered
	 */
	public static final int MICROSOFT_NEURAL_NETWORK_VALUE = 3;

	/**
	 * The '<em><b>Microsoft Logistic Regression</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICROSOFT_LOGISTIC_REGRESSION
	 * @model name="MicrosoftLogisticRegression" literal="Microsoft_Logistic_Regression"
	 * @generated
	 * @ordered
	 */
	public static final int MICROSOFT_LOGISTIC_REGRESSION_VALUE = 4;

	/**
	 * The '<em><b>Microsoft Linear Regression</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICROSOFT_LINEAR_REGRESSION
	 * @model name="MicrosoftLinearRegression" literal="Microsoft_Linear_Regression"
	 * @generated
	 * @ordered
	 */
	public static final int MICROSOFT_LINEAR_REGRESSION_VALUE = 5;

	/**
	 * The '<em><b>Microsoft Association Rules</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICROSOFT_ASSOCIATION_RULES
	 * @model name="MicrosoftAssociationRules" literal="Microsoft_Association_Rules"
	 * @generated
	 * @ordered
	 */
	public static final int MICROSOFT_ASSOCIATION_RULES_VALUE = 6;

	/**
	 * The '<em><b>Microsoft Time Series</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICROSOFT_TIME_SERIES
	 * @model name="MicrosoftTimeSeries" literal="Microsoft_Time_Series"
	 * @generated
	 * @ordered
	 */
	public static final int MICROSOFT_TIME_SERIES_VALUE = 7;

	/**
	 * The '<em><b>Microsoft Sequence Clustering</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICROSOFT_SEQUENCE_CLUSTERING
	 * @model name="MicrosoftSequenceClustering" literal="Microsoft_Sequence_Clustering"
	 * @generated
	 * @ordered
	 */
	public static final int MICROSOFT_SEQUENCE_CLUSTERING_VALUE = 8;

	/**
	 * An array of all the '<em><b>Algorithm Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AlgorithmType[] VALUES_ARRAY =
		new AlgorithmType[] {
			MICROSOFT_NAIVE_BAYES,
			MICROSOFT_DECISION_TREES,
			MICROSOFT_CLUSTERING,
			MICROSOFT_NEURAL_NETWORK,
			MICROSOFT_LOGISTIC_REGRESSION,
			MICROSOFT_LINEAR_REGRESSION,
			MICROSOFT_ASSOCIATION_RULES,
			MICROSOFT_TIME_SERIES,
			MICROSOFT_SEQUENCE_CLUSTERING,
		};

	/**
	 * A public read-only list of all the '<em><b>Algorithm Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AlgorithmType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Algorithm Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AlgorithmType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AlgorithmType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Algorithm Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AlgorithmType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AlgorithmType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Algorithm Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AlgorithmType get(int value) {
		switch (value) {
			case MICROSOFT_NAIVE_BAYES_VALUE: return MICROSOFT_NAIVE_BAYES;
			case MICROSOFT_DECISION_TREES_VALUE: return MICROSOFT_DECISION_TREES;
			case MICROSOFT_CLUSTERING_VALUE: return MICROSOFT_CLUSTERING;
			case MICROSOFT_NEURAL_NETWORK_VALUE: return MICROSOFT_NEURAL_NETWORK;
			case MICROSOFT_LOGISTIC_REGRESSION_VALUE: return MICROSOFT_LOGISTIC_REGRESSION;
			case MICROSOFT_LINEAR_REGRESSION_VALUE: return MICROSOFT_LINEAR_REGRESSION;
			case MICROSOFT_ASSOCIATION_RULES_VALUE: return MICROSOFT_ASSOCIATION_RULES;
			case MICROSOFT_TIME_SERIES_VALUE: return MICROSOFT_TIME_SERIES;
			case MICROSOFT_SEQUENCE_CLUSTERING_VALUE: return MICROSOFT_SEQUENCE_CLUSTERING;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AlgorithmType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //AlgorithmType
