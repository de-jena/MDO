/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.math.BigInteger;

import org.eclipse.daanse.xmla.model.ecore.xmla.AccessType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Account;
import org.eclipse.daanse.xmla.model.ecore.xmla.AccountsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ActionType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ActionsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ActionsType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.AggregateFunctionType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Aggregation;
import org.eclipse.daanse.xmla.model.ecore.xmla.AggregationAttribute;
import org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesign;
import org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesignAttribute;
import org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesignDimension;
import org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesignsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDimension;
import org.eclipse.daanse.xmla.model.ecore.xmla.AggregationFunctionType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AggregationInstance;
import org.eclipse.daanse.xmla.model.ecore.xmla.AggregationInstanceAttribute;
import org.eclipse.daanse.xmla.model.ecore.xmla.AggregationInstanceDimension;
import org.eclipse.daanse.xmla.model.ecore.xmla.AggregationInstanceMeasure;
import org.eclipse.daanse.xmla.model.ecore.xmla.AggregationInstancesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AggregationStorageType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AggregationTypeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AggregationUsageType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AggregationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AlgorithmParameter;
import org.eclipse.daanse.xmla.model.ecore.xmla.AlgorithmParametersType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AlgorithmType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AliasesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AllMemberAggregationUsageType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AllMemberTranslationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Alter;
import org.eclipse.daanse.xmla.model.ecore.xmla.AndOrType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Annotation;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType10;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType11;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType12;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType13;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType14;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType15;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType16;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType17;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType18;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType19;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType2;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType20;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType21;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType22;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType23;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType24;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType25;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType26;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType27;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType28;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType29;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType3;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType30;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType31;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType32;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType33;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType34;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType35;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType36;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType37;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType38;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType39;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType4;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType40;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType41;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType42;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType43;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType44;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType45;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType46;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType47;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType48;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType49;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType5;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType50;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType51;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType52;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType53;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType54;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType55;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType56;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType6;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType7;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType8;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType9;
import org.eclipse.daanse.xmla.model.ecore.xmla.AssembliesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AssembliesType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.Attach;
import org.eclipse.daanse.xmla.model.ecore.xmla.AttributeAllMemberTranslationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AttributeBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.AttributeHierarchyOptimizedStateType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AttributeHierarchyOptimizedStateType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.AttributeInsertUpdate;
import org.eclipse.daanse.xmla.model.ecore.xmla.AttributePermission;
import org.eclipse.daanse.xmla.model.ecore.xmla.AttributePermissionsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AttributePermissionsType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationship;
import org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationshipsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AttributeTranslation;
import org.eclipse.daanse.xmla.model.ecore.xmla.AttributesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AttributesType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.AttributesType2;
import org.eclipse.daanse.xmla.model.ecore.xmla.AttributesType3;
import org.eclipse.daanse.xmla.model.ecore.xmla.AttributesType4;
import org.eclipse.daanse.xmla.model.ecore.xmla.AttributesType5;
import org.eclipse.daanse.xmla.model.ecore.xmla.AttributesType6;
import org.eclipse.daanse.xmla.model.ecore.xmla.AttributesType7;
import org.eclipse.daanse.xmla.model.ecore.xmla.AttributesType8;
import org.eclipse.daanse.xmla.model.ecore.xmla.AxisFormatType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Backup;
import org.eclipse.daanse.xmla.model.ecore.xmla.Batch;
import org.eclipse.daanse.xmla.model.ecore.xmla.BeginSessionType;
import org.eclipse.daanse.xmla.model.ecore.xmla.BeginTransaction;
import org.eclipse.daanse.xmla.model.ecore.xmla.Bindings;
import org.eclipse.daanse.xmla.model.ecore.xmla.BoolBinop;
import org.eclipse.daanse.xmla.model.ecore.xmla.BooleanExpr;
import org.eclipse.daanse.xmla.model.ecore.xmla.CacheModeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.CalculatedMeasureBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.CalculationPropertiesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty;
import org.eclipse.daanse.xmla.model.ecore.xmla.CalculationTypeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.CalculationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Cancel;
import org.eclipse.daanse.xmla.model.ecore.xmla.CardinalityType;
import org.eclipse.daanse.xmla.model.ecore.xmla.CardinalityType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.CatalogLocationType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Cell;
import org.eclipse.daanse.xmla.model.ecore.xmla.CellPermission;
import org.eclipse.daanse.xmla.model.ecore.xmla.CellPermissionsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ClassifiedColumnsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ClearCache;
import org.eclipse.daanse.xmla.model.ecore.xmla.ClearResultType;
import org.eclipse.daanse.xmla.model.ecore.xmla.CloneDatabase;
import org.eclipse.daanse.xmla.model.ecore.xmla.ClrAssembly;
import org.eclipse.daanse.xmla.model.ecore.xmla.ClrAssemblyFile;
import org.eclipse.daanse.xmla.model.ecore.xmla.ColumnBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.ColumnType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ColumnsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ColumnsType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.ColumnsType2;
import org.eclipse.daanse.xmla.model.ecore.xmla.ColumnsType3;
import org.eclipse.daanse.xmla.model.ecore.xmla.ColumnsType4;
import org.eclipse.daanse.xmla.model.ecore.xmla.ComAssembly;
import org.eclipse.daanse.xmla.model.ecore.xmla.Command;
import org.eclipse.daanse.xmla.model.ecore.xmla.CommandsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.CommitTransaction;
import org.eclipse.daanse.xmla.model.ecore.xmla.ComparatorType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ConnectionStringSecurityType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ContentType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ContentType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.Create;
import org.eclipse.daanse.xmla.model.ecore.xmla.Cube;
import org.eclipse.daanse.xmla.model.ecore.xmla.CubeAttribute;
import org.eclipse.daanse.xmla.model.ecore.xmla.CubeAttributeBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimension;
import org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimensionBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimensionPermission;
import org.eclipse.daanse.xmla.model.ecore.xmla.CubeHierarchy;
import org.eclipse.daanse.xmla.model.ecore.xmla.CubePermission;
import org.eclipse.daanse.xmla.model.ecore.xmla.CubePermissionsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.CubeStorageModeEnumType;
import org.eclipse.daanse.xmla.model.ecore.xmla.CubesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.CurrentStorageModeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.CurrentStorageModeType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.CustomRollupColumnType;
import org.eclipse.daanse.xmla.model.ecore.xmla.CustomRollupPropertiesColumnType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DBCC;
import org.eclipse.daanse.xmla.model.ecore.xmla.DSVTableBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.DataAggregationType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DataBlock;
import org.eclipse.daanse.xmla.model.ecore.xmla.DataItem;
import org.eclipse.daanse.xmla.model.ecore.xmla.DataMiningMeasureGroupDimension;
import org.eclipse.daanse.xmla.model.ecore.xmla.DataSourcePermission;
import org.eclipse.daanse.xmla.model.ecore.xmla.DataSourcePermissionsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DataSourceView;
import org.eclipse.daanse.xmla.model.ecore.xmla.DataSourceViewBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.DataSourceViewsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DataSourcesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DataType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DataType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.DataType2;
import org.eclipse.daanse.xmla.model.ecore.xmla.DataType3;
import org.eclipse.daanse.xmla.model.ecore.xmla.DataTypeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DataTypeType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.Database;
import org.eclipse.daanse.xmla.model.ecore.xmla.DatabasePermission;
import org.eclipse.daanse.xmla.model.ecore.xmla.DatabasePermissionsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DatabasesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropConcatNullBehaviorType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdAutoExistsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdCompareCaseSensitiveStringFlagsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdMDXCompatibilityType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropMsmdSubqueriesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropNullCollationType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropOutputParameterAvailableType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPersistentIdTypeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPrepareAbortBehaviorType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropPrepareCommitBehaviorType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DbpropQuotedIdentifierCaseType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DegenerateMeasureGroupDimension;
import org.eclipse.daanse.xmla.model.ecore.xmla.Delete;
import org.eclipse.daanse.xmla.model.ecore.xmla.DesignAggregations;
import org.eclipse.daanse.xmla.model.ecore.xmla.Detach;
import org.eclipse.daanse.xmla.model.ecore.xmla.DialectType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Dimension;
import org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute;
import org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttributeTypeEnumType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DimensionBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.DimensionCurrentStorageModeEnumType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DimensionPermission;
import org.eclipse.daanse.xmla.model.ecore.xmla.DimensionPermissionsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DimensionPermissionsType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.DimensionsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DimensionsType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.DimensionsType2;
import org.eclipse.daanse.xmla.model.ecore.xmla.DimensionsType3;
import org.eclipse.daanse.xmla.model.ecore.xmla.DimensionsType4;
import org.eclipse.daanse.xmla.model.ecore.xmla.DimensionsType5;
import org.eclipse.daanse.xmla.model.ecore.xmla.DimensionsType6;
import org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverResponseType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DiscretizationMethodType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot;
import org.eclipse.daanse.xmla.model.ecore.xmla.DrillThroughAction;
import org.eclipse.daanse.xmla.model.ecore.xmla.Drop;
import org.eclipse.daanse.xmla.model.ecore.xmla.DurabilityGuaranteeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.EditionType;
import org.eclipse.daanse.xmla.model.ecore.xmla.EndOfDataType;
import org.eclipse.daanse.xmla.model.ecore.xmla.EndSessionType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration;
import org.eclipse.daanse.xmla.model.ecore.xmla.Event;
import org.eclipse.daanse.xmla.model.ecore.xmla.EventCategoryType;
import org.eclipse.daanse.xmla.model.ecore.xmla.EventColumn;
import org.eclipse.daanse.xmla.model.ecore.xmla.EventColumnID;
import org.eclipse.daanse.xmla.model.ecore.xmla.EventColumnListType;
import org.eclipse.daanse.xmla.model.ecore.xmla.EventColumnSubclassListType;
import org.eclipse.daanse.xmla.model.ecore.xmla.EventColumnSubclassType;
import org.eclipse.daanse.xmla.model.ecore.xmla.EventListType;
import org.eclipse.daanse.xmla.model.ecore.xmla.EventSessionType;
import org.eclipse.daanse.xmla.model.ecore.xmla.EventType;
import org.eclipse.daanse.xmla.model.ecore.xmla.EventType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.EventTypeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.EventsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ExecuteParameter;
import org.eclipse.daanse.xmla.model.ecore.xmla.ExecuteResponseType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ExecuteType;
import org.eclipse.daanse.xmla.model.ecore.xmla.FilesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.FiscalYearNameType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Folder;
import org.eclipse.daanse.xmla.model.ecore.xmla.FoldingParameters;
import org.eclipse.daanse.xmla.model.ecore.xmla.ForeignKeyColumnType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ForeignKeyColumnsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ForeignKeyColumnsType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.FormatType;
import org.eclipse.daanse.xmla.model.ecore.xmla.FormatType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.GlobalType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Group;
import org.eclipse.daanse.xmla.model.ecore.xmla.GroupingBehaviorType;
import org.eclipse.daanse.xmla.model.ecore.xmla.GroupsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.HideMemberIfType;
import org.eclipse.daanse.xmla.model.ecore.xmla.HierarchiesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.HierarchiesType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.HierarchiesType2;
import org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy;
import org.eclipse.daanse.xmla.model.ecore.xmla.HierarchyUniqueNameStyleType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ImageLoad;
import org.eclipse.daanse.xmla.model.ecore.xmla.ImageSave;
import org.eclipse.daanse.xmla.model.ecore.xmla.IncrementalProcessingNotification;
import org.eclipse.daanse.xmla.model.ecore.xmla.IncrementalProcessingNotificationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.InheritedBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.Insert;
import org.eclipse.daanse.xmla.model.ecore.xmla.InstanceSelectionType;
import org.eclipse.daanse.xmla.model.ecore.xmla.InvalidXmlCharactersType;
import org.eclipse.daanse.xmla.model.ecore.xmla.InvocationType;
import org.eclipse.daanse.xmla.model.ecore.xmla.InvocationType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.InvocationType2;
import org.eclipse.daanse.xmla.model.ecore.xmla.IsolationType;
import org.eclipse.daanse.xmla.model.ecore.xmla.KeepResultType;
import org.eclipse.daanse.xmla.model.ecore.xmla.KeyColumnType;
import org.eclipse.daanse.xmla.model.ecore.xmla.KeyColumnsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.KeyColumnsType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.KeyColumnsType2;
import org.eclipse.daanse.xmla.model.ecore.xmla.KeyColumnsType3;
import org.eclipse.daanse.xmla.model.ecore.xmla.KeyColumnsType4;
import org.eclipse.daanse.xmla.model.ecore.xmla.KeyDuplicateType;
import org.eclipse.daanse.xmla.model.ecore.xmla.KeyErrorActionType;
import org.eclipse.daanse.xmla.model.ecore.xmla.KeyErrorLimitActionType;
import org.eclipse.daanse.xmla.model.ecore.xmla.KeyNotFoundType;
import org.eclipse.daanse.xmla.model.ecore.xmla.KeysType;
import org.eclipse.daanse.xmla.model.ecore.xmla.KeysType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.Kpi;
import org.eclipse.daanse.xmla.model.ecore.xmla.KpisType;
import org.eclipse.daanse.xmla.model.ecore.xmla.KpisType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.Level;
import org.eclipse.daanse.xmla.model.ecore.xmla.LevelsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Location;
import org.eclipse.daanse.xmla.model.ecore.xmla.LocationBackup;
import org.eclipse.daanse.xmla.model.ecore.xmla.LocationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.LocationsType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.LocationsType2;
import org.eclipse.daanse.xmla.model.ecore.xmla.Lock;
import org.eclipse.daanse.xmla.model.ecore.xmla.MDXSupportType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject;
import org.eclipse.daanse.xmla.model.ecore.xmla.ManyToManyMeasureGroupDimension;
import org.eclipse.daanse.xmla.model.ecore.xmla.MaterializationType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MdpropAggregateCellUpdateType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MdpropFlatteningSupportType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxNonMeasureExpressionsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxRangeRowsetType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MdpropMdxSlicerType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MdxMissingMemberModeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MdxMissingMemberModeType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.MdxScript;
import org.eclipse.daanse.xmla.model.ecore.xmla.MdxScriptsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Measure;
import org.eclipse.daanse.xmla.model.ecore.xmla.MeasureBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup;
import org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupAttribute;
import org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupDimensionBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupStorageModeEnumType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupsType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.MeasuresType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MeasuresType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.MeasuresType2;
import org.eclipse.daanse.xmla.model.ecore.xmla.Member;
import org.eclipse.daanse.xmla.model.ecore.xmla.MemberUniqueNameStyleType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MembersType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MembersType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.MembersWithDataType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MemoryLockingModeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MergePartitions;
import org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel;
import org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelColumn;
import org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelPermission;
import org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelPermissionsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelingFlag;
import org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure;
import org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructurePermission;
import org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructurePermissionsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructuresType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ModeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ModelingFlagsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ModelingFlagsType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.NameColumnType;
import org.eclipse.daanse.xmla.model.ecore.xmla.NamingTemplateTranslationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.NotType;
import org.eclipse.daanse.xmla.model.ecore.xmla.NotificationTechniqueType;
import org.eclipse.daanse.xmla.model.ecore.xmla.NotificationTechniqueType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.NotifyTableChange;
import org.eclipse.daanse.xmla.model.ecore.xmla.NullKeyConvertedToUnknownType;
import org.eclipse.daanse.xmla.model.ecore.xmla.NullKeyNotAllowedType;
import org.eclipse.daanse.xmla.model.ecore.xmla.NullProcessingType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ObjectExpansion;
import org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference;
import org.eclipse.daanse.xmla.model.ecore.xmla.ObjectType;
import org.eclipse.daanse.xmla.model.ecore.xmla.OlapDataSource;
import org.eclipse.daanse.xmla.model.ecore.xmla.OnlineModeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.OptimizedStateType;
import org.eclipse.daanse.xmla.model.ecore.xmla.OptionalityType;
import org.eclipse.daanse.xmla.model.ecore.xmla.OrderByType;
import org.eclipse.daanse.xmla.model.ecore.xmla.OrdinalType;
import org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.OverrideBehaviorType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ParallelType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ParameterType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ParameterType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.ParameterType2;
import org.eclipse.daanse.xmla.model.ecore.xmla.Parameters;
import org.eclipse.daanse.xmla.model.ecore.xmla.ParametersType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Partition;
import org.eclipse.daanse.xmla.model.ecore.xmla.PartitionCurrentStorageModeEnumType;
import org.eclipse.daanse.xmla.model.ecore.xmla.PartitionModes;
import org.eclipse.daanse.xmla.model.ecore.xmla.PartitionStorageModeEnumType;
import org.eclipse.daanse.xmla.model.ecore.xmla.PartitionsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Permission;
import org.eclipse.daanse.xmla.model.ecore.xmla.PermissionSetType;
import org.eclipse.daanse.xmla.model.ecore.xmla.PersistenceType;
import org.eclipse.daanse.xmla.model.ecore.xmla.PersistenceType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.Perspective;
import org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveAction;
import org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveAttribute;
import org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveCalculation;
import org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveDimension;
import org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveHierarchy;
import org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveKpi;
import org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveMeasure;
import org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveMeasureGroup;
import org.eclipse.daanse.xmla.model.ecore.xmla.PerspectivesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.PredLeaf;
import org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCaching;
import org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingIncrementalProcessingBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingInheritedBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingQueryBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingTablesBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.ProcessingGroupType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ProcessingModeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ProcessingModeType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.ProcessingModeType2;
import org.eclipse.daanse.xmla.model.ecore.xmla.ProcessingModeType3;
import org.eclipse.daanse.xmla.model.ecore.xmla.ProcessingStateType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Properties;
import org.eclipse.daanse.xmla.model.ecore.xmla.PropertiesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList;
import org.eclipse.daanse.xmla.model.ecore.xmla.ProviderTypeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.PushedDataSource;
import org.eclipse.daanse.xmla.model.ecore.xmla.QueriesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.QueryBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.QueryNotification;
import org.eclipse.daanse.xmla.model.ecore.xmla.QueryNotificationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ReadDefinitionType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ReadSourceDataType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ReadType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ReadType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.ReferenceMeasureGroupDimension;
import org.eclipse.daanse.xmla.model.ecore.xmla.RefreshPolicyType;
import org.eclipse.daanse.xmla.model.ecore.xmla.RefreshPolicyType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.RegularMeasureGroupDimension;
import org.eclipse.daanse.xmla.model.ecore.xmla.RelationalDataSource;
import org.eclipse.daanse.xmla.model.ecore.xmla.RelationshipTypeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction;
import org.eclipse.daanse.xmla.model.ecore.xmla.ReportFormatParameter;
import org.eclipse.daanse.xmla.model.ecore.xmla.ReportFormatParametersType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ReportParameter;
import org.eclipse.daanse.xmla.model.ecore.xmla.ReportParametersType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ReportingFirstWeekOfMonthType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ReportingWeekToMonthPatternType;
import org.eclipse.daanse.xmla.model.ecore.xmla.RequestTypeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ResponseEncodingType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Restore;
import org.eclipse.daanse.xmla.model.ecore.xmla.RestrictionListType;
import org.eclipse.daanse.xmla.model.ecore.xmla.RestrictionsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ResultType;
import org.eclipse.daanse.xmla.model.ecore.xmla.RetentionModes;
import org.eclipse.daanse.xmla.model.ecore.xmla.Return;
import org.eclipse.daanse.xmla.model.ecore.xmla.ReturnType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Role;
import org.eclipse.daanse.xmla.model.ecore.xmla.RolesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.RolesType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.RollbackTransaction;
import org.eclipse.daanse.xmla.model.ecore.xmla.RootMemberIfType;
import org.eclipse.daanse.xmla.model.ecore.xmla.RootType;
import org.eclipse.daanse.xmla.model.ecore.xmla.RowBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.SQLQueryModeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.SafetyOptionsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn;
import org.eclipse.daanse.xmla.model.ecore.xmla.Scope;
import org.eclipse.daanse.xmla.model.ecore.xmla.ScriptCacheProcessingModeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ScriptErrorHandlingModeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.SecuredCellValueType;
import org.eclipse.daanse.xmla.model.ecore.xmla.SecurityType;
import org.eclipse.daanse.xmla.model.ecore.xmla.SecurityType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.Server;
import org.eclipse.daanse.xmla.model.ecore.xmla.ServerPropertiesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ServerProperty;
import org.eclipse.daanse.xmla.model.ecore.xmla.SessionType;
import org.eclipse.daanse.xmla.model.ecore.xmla.SetAuthContext;
import org.eclipse.daanse.xmla.model.ecore.xmla.ShareDimensionStorageType;
import org.eclipse.daanse.xmla.model.ecore.xmla.SkippedLevelsColumnType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Source;
import org.eclipse.daanse.xmla.model.ecore.xmla.SourcesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.StandardAction;
import org.eclipse.daanse.xmla.model.ecore.xmla.StateSupportType;
import org.eclipse.daanse.xmla.model.ecore.xmla.StateType;
import org.eclipse.daanse.xmla.model.ecore.xmla.StateType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.StateType2;
import org.eclipse.daanse.xmla.model.ecore.xmla.StateType3;
import org.eclipse.daanse.xmla.model.ecore.xmla.StateType4;
import org.eclipse.daanse.xmla.model.ecore.xmla.StateType5;
import org.eclipse.daanse.xmla.model.ecore.xmla.StateType6;
import org.eclipse.daanse.xmla.model.ecore.xmla.Statement;
import org.eclipse.daanse.xmla.model.ecore.xmla.StorageModeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.StorageModeType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.StorageModeType2;
import org.eclipse.daanse.xmla.model.ecore.xmla.StorageModeType3;
import org.eclipse.daanse.xmla.model.ecore.xmla.Subscribe;
import org.eclipse.daanse.xmla.model.ecore.xmla.Synchronize;
import org.eclipse.daanse.xmla.model.ecore.xmla.SynchronizeSecurityType;
import org.eclipse.daanse.xmla.model.ecore.xmla.TableBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.TableMiningStructureColumn;
import org.eclipse.daanse.xmla.model.ecore.xmla.TableNotification;
import org.eclipse.daanse.xmla.model.ecore.xmla.TableNotificationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.TableNotificationsType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.TargetType;
import org.eclipse.daanse.xmla.model.ecore.xmla.TargetType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.TargetTypeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.TargetTypeType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.TargetTypeType2;
import org.eclipse.daanse.xmla.model.ecore.xmla.TimeAttributeBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.TimeBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.Trace;
import org.eclipse.daanse.xmla.model.ecore.xmla.TraceColumns;
import org.eclipse.daanse.xmla.model.ecore.xmla.TraceDefinitionProviderInfo;
import org.eclipse.daanse.xmla.model.ecore.xmla.TraceEvent;
import org.eclipse.daanse.xmla.model.ecore.xmla.TraceEventCategories;
import org.eclipse.daanse.xmla.model.ecore.xmla.TraceFilter;
import org.eclipse.daanse.xmla.model.ecore.xmla.TracesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Translation;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationInsertUpdate;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationType;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType10;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType11;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType12;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType13;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType14;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType15;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType16;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType17;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType18;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType19;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType2;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType20;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType21;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType22;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType3;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType4;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType5;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType6;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType7;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType8;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType9;
import org.eclipse.daanse.xmla.model.ecore.xmla.TrimmingType;
import org.eclipse.daanse.xmla.model.ecore.xmla.TypeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.TypeType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.TypeType10;
import org.eclipse.daanse.xmla.model.ecore.xmla.TypeType11;
import org.eclipse.daanse.xmla.model.ecore.xmla.TypeType12;
import org.eclipse.daanse.xmla.model.ecore.xmla.TypeType13;
import org.eclipse.daanse.xmla.model.ecore.xmla.TypeType2;
import org.eclipse.daanse.xmla.model.ecore.xmla.TypeType3;
import org.eclipse.daanse.xmla.model.ecore.xmla.TypeType4;
import org.eclipse.daanse.xmla.model.ecore.xmla.TypeType5;
import org.eclipse.daanse.xmla.model.ecore.xmla.TypeType6;
import org.eclipse.daanse.xmla.model.ecore.xmla.TypeType7;
import org.eclipse.daanse.xmla.model.ecore.xmla.TypeType8;
import org.eclipse.daanse.xmla.model.ecore.xmla.TypeType9;
import org.eclipse.daanse.xmla.model.ecore.xmla.UnaryExpr;
import org.eclipse.daanse.xmla.model.ecore.xmla.UnaryOperatorColumnType;
import org.eclipse.daanse.xmla.model.ecore.xmla.UnknownMemberEnumType;
import org.eclipse.daanse.xmla.model.ecore.xmla.UnknownMemberTranslationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.UnknownMemberType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Unlock;
import org.eclipse.daanse.xmla.model.ecore.xmla.Unsubscribe;
import org.eclipse.daanse.xmla.model.ecore.xmla.Update;
import org.eclipse.daanse.xmla.model.ecore.xmla.UpdateCells;
import org.eclipse.daanse.xmla.model.ecore.xmla.UpdateIsolationLevelType;
import org.eclipse.daanse.xmla.model.ecore.xmla.UsageType;
import org.eclipse.daanse.xmla.model.ecore.xmla.UsageType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.UserDefinedGroupBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.ValueColumnType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ValuensType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ValuensType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.ValuensType2;
import org.eclipse.daanse.xmla.model.ecore.xmla.ValuensType3;
import org.eclipse.daanse.xmla.model.ecore.xmla.ValuensType4;
import org.eclipse.daanse.xmla.model.ecore.xmla.ValuensType5;
import org.eclipse.daanse.xmla.model.ecore.xmla.ValuensType6;
import org.eclipse.daanse.xmla.model.ecore.xmla.VersionType;
import org.eclipse.daanse.xmla.model.ecore.xmla.VisibilityType;
import org.eclipse.daanse.xmla.model.ecore.xmla.VisualModeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Where;
import org.eclipse.daanse.xmla.model.ecore.xmla.WhereAttribute;
import org.eclipse.daanse.xmla.model.ecore.xmla.WriteBackTableCreation;
import org.eclipse.daanse.xmla.model.ecore.xmla.WriteType;
import org.eclipse.daanse.xmla.model.ecore.xmla.WriteType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.WriteType2;
import org.eclipse.daanse.xmla.model.ecore.xmla.WriteType3;
import org.eclipse.daanse.xmla.model.ecore.xmla.WriteType4;
import org.eclipse.daanse.xmla.model.ecore.xmla.WriteType5;
import org.eclipse.daanse.xmla.model.ecore.xmla.WriteType6;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaFactory;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XmlaFactoryImpl extends EFactoryImpl implements XmlaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XmlaFactory init() {
		try {
			XmlaFactory theXmlaFactory = (XmlaFactory)EPackage.Registry.INSTANCE.getEFactory(XmlaPackage.eNS_URI);
			if (theXmlaFactory != null) {
				return theXmlaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XmlaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case XmlaPackage.ACCOUNT: return createAccount();
			case XmlaPackage.ACCOUNTS_TYPE: return createAccountsType();
			case XmlaPackage.ACTIONS_TYPE: return createActionsType();
			case XmlaPackage.ACTIONS_TYPE1: return createActionsType1();
			case XmlaPackage.ACTION_TYPE: return createActionType();
			case XmlaPackage.AGGREGATION: return createAggregation();
			case XmlaPackage.AGGREGATION_ATTRIBUTE: return createAggregationAttribute();
			case XmlaPackage.AGGREGATION_DESIGN: return createAggregationDesign();
			case XmlaPackage.AGGREGATION_DESIGN_ATTRIBUTE: return createAggregationDesignAttribute();
			case XmlaPackage.AGGREGATION_DESIGN_DIMENSION: return createAggregationDesignDimension();
			case XmlaPackage.AGGREGATION_DESIGNS_TYPE: return createAggregationDesignsType();
			case XmlaPackage.AGGREGATION_DIMENSION: return createAggregationDimension();
			case XmlaPackage.AGGREGATION_INSTANCE: return createAggregationInstance();
			case XmlaPackage.AGGREGATION_INSTANCE_ATTRIBUTE: return createAggregationInstanceAttribute();
			case XmlaPackage.AGGREGATION_INSTANCE_DIMENSION: return createAggregationInstanceDimension();
			case XmlaPackage.AGGREGATION_INSTANCE_MEASURE: return createAggregationInstanceMeasure();
			case XmlaPackage.AGGREGATION_INSTANCES_TYPE: return createAggregationInstancesType();
			case XmlaPackage.AGGREGATIONS_TYPE: return createAggregationsType();
			case XmlaPackage.ALGORITHM_PARAMETER: return createAlgorithmParameter();
			case XmlaPackage.ALGORITHM_PARAMETERS_TYPE: return createAlgorithmParametersType();
			case XmlaPackage.ALIASES_TYPE: return createAliasesType();
			case XmlaPackage.ALL_MEMBER_TRANSLATIONS_TYPE: return createAllMemberTranslationsType();
			case XmlaPackage.ALTER: return createAlter();
			case XmlaPackage.AND_OR_TYPE: return createAndOrType();
			case XmlaPackage.ANNOTATION: return createAnnotation();
			case XmlaPackage.ANNOTATIONS_TYPE: return createAnnotationsType();
			case XmlaPackage.ANNOTATIONS_TYPE1: return createAnnotationsType1();
			case XmlaPackage.ANNOTATIONS_TYPE2: return createAnnotationsType2();
			case XmlaPackage.ANNOTATIONS_TYPE3: return createAnnotationsType3();
			case XmlaPackage.ANNOTATIONS_TYPE4: return createAnnotationsType4();
			case XmlaPackage.ANNOTATIONS_TYPE5: return createAnnotationsType5();
			case XmlaPackage.ANNOTATIONS_TYPE6: return createAnnotationsType6();
			case XmlaPackage.ANNOTATIONS_TYPE7: return createAnnotationsType7();
			case XmlaPackage.ANNOTATIONS_TYPE8: return createAnnotationsType8();
			case XmlaPackage.ANNOTATIONS_TYPE9: return createAnnotationsType9();
			case XmlaPackage.ANNOTATIONS_TYPE10: return createAnnotationsType10();
			case XmlaPackage.ANNOTATIONS_TYPE11: return createAnnotationsType11();
			case XmlaPackage.ANNOTATIONS_TYPE12: return createAnnotationsType12();
			case XmlaPackage.ANNOTATIONS_TYPE13: return createAnnotationsType13();
			case XmlaPackage.ANNOTATIONS_TYPE14: return createAnnotationsType14();
			case XmlaPackage.ANNOTATIONS_TYPE15: return createAnnotationsType15();
			case XmlaPackage.ANNOTATIONS_TYPE16: return createAnnotationsType16();
			case XmlaPackage.ANNOTATIONS_TYPE17: return createAnnotationsType17();
			case XmlaPackage.ANNOTATIONS_TYPE18: return createAnnotationsType18();
			case XmlaPackage.ANNOTATIONS_TYPE19: return createAnnotationsType19();
			case XmlaPackage.ANNOTATIONS_TYPE20: return createAnnotationsType20();
			case XmlaPackage.ANNOTATIONS_TYPE21: return createAnnotationsType21();
			case XmlaPackage.ANNOTATIONS_TYPE22: return createAnnotationsType22();
			case XmlaPackage.ANNOTATIONS_TYPE23: return createAnnotationsType23();
			case XmlaPackage.ANNOTATIONS_TYPE24: return createAnnotationsType24();
			case XmlaPackage.ANNOTATIONS_TYPE25: return createAnnotationsType25();
			case XmlaPackage.ANNOTATIONS_TYPE26: return createAnnotationsType26();
			case XmlaPackage.ANNOTATIONS_TYPE27: return createAnnotationsType27();
			case XmlaPackage.ANNOTATIONS_TYPE28: return createAnnotationsType28();
			case XmlaPackage.ANNOTATIONS_TYPE29: return createAnnotationsType29();
			case XmlaPackage.ANNOTATIONS_TYPE30: return createAnnotationsType30();
			case XmlaPackage.ANNOTATIONS_TYPE31: return createAnnotationsType31();
			case XmlaPackage.ANNOTATIONS_TYPE32: return createAnnotationsType32();
			case XmlaPackage.ANNOTATIONS_TYPE33: return createAnnotationsType33();
			case XmlaPackage.ANNOTATIONS_TYPE34: return createAnnotationsType34();
			case XmlaPackage.ANNOTATIONS_TYPE35: return createAnnotationsType35();
			case XmlaPackage.ANNOTATIONS_TYPE36: return createAnnotationsType36();
			case XmlaPackage.ANNOTATIONS_TYPE37: return createAnnotationsType37();
			case XmlaPackage.ANNOTATIONS_TYPE38: return createAnnotationsType38();
			case XmlaPackage.ANNOTATIONS_TYPE39: return createAnnotationsType39();
			case XmlaPackage.ANNOTATIONS_TYPE40: return createAnnotationsType40();
			case XmlaPackage.ANNOTATIONS_TYPE41: return createAnnotationsType41();
			case XmlaPackage.ANNOTATIONS_TYPE42: return createAnnotationsType42();
			case XmlaPackage.ANNOTATIONS_TYPE43: return createAnnotationsType43();
			case XmlaPackage.ANNOTATIONS_TYPE44: return createAnnotationsType44();
			case XmlaPackage.ANNOTATIONS_TYPE45: return createAnnotationsType45();
			case XmlaPackage.ANNOTATIONS_TYPE46: return createAnnotationsType46();
			case XmlaPackage.ANNOTATIONS_TYPE47: return createAnnotationsType47();
			case XmlaPackage.ANNOTATIONS_TYPE48: return createAnnotationsType48();
			case XmlaPackage.ANNOTATIONS_TYPE49: return createAnnotationsType49();
			case XmlaPackage.ANNOTATIONS_TYPE50: return createAnnotationsType50();
			case XmlaPackage.ANNOTATIONS_TYPE51: return createAnnotationsType51();
			case XmlaPackage.ANNOTATIONS_TYPE52: return createAnnotationsType52();
			case XmlaPackage.ANNOTATIONS_TYPE53: return createAnnotationsType53();
			case XmlaPackage.ANNOTATIONS_TYPE54: return createAnnotationsType54();
			case XmlaPackage.ANNOTATIONS_TYPE55: return createAnnotationsType55();
			case XmlaPackage.ANNOTATIONS_TYPE56: return createAnnotationsType56();
			case XmlaPackage.ASSEMBLIES_TYPE: return createAssembliesType();
			case XmlaPackage.ASSEMBLIES_TYPE1: return createAssembliesType1();
			case XmlaPackage.ATTACH: return createAttach();
			case XmlaPackage.ATTRIBUTE_ALL_MEMBER_TRANSLATIONS_TYPE: return createAttributeAllMemberTranslationsType();
			case XmlaPackage.ATTRIBUTE_BINDING: return createAttributeBinding();
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE: return createAttributeInsertUpdate();
			case XmlaPackage.ATTRIBUTE_PERMISSION: return createAttributePermission();
			case XmlaPackage.ATTRIBUTE_PERMISSIONS_TYPE: return createAttributePermissionsType();
			case XmlaPackage.ATTRIBUTE_PERMISSIONS_TYPE1: return createAttributePermissionsType1();
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP: return createAttributeRelationship();
			case XmlaPackage.ATTRIBUTE_RELATIONSHIPS_TYPE: return createAttributeRelationshipsType();
			case XmlaPackage.ATTRIBUTES_TYPE: return createAttributesType();
			case XmlaPackage.ATTRIBUTES_TYPE1: return createAttributesType1();
			case XmlaPackage.ATTRIBUTES_TYPE2: return createAttributesType2();
			case XmlaPackage.ATTRIBUTES_TYPE3: return createAttributesType3();
			case XmlaPackage.ATTRIBUTES_TYPE4: return createAttributesType4();
			case XmlaPackage.ATTRIBUTES_TYPE5: return createAttributesType5();
			case XmlaPackage.ATTRIBUTES_TYPE6: return createAttributesType6();
			case XmlaPackage.ATTRIBUTES_TYPE7: return createAttributesType7();
			case XmlaPackage.ATTRIBUTES_TYPE8: return createAttributesType8();
			case XmlaPackage.ATTRIBUTE_TRANSLATION: return createAttributeTranslation();
			case XmlaPackage.BACKUP: return createBackup();
			case XmlaPackage.BATCH: return createBatch();
			case XmlaPackage.BEGIN_SESSION_TYPE: return createBeginSessionType();
			case XmlaPackage.BEGIN_TRANSACTION: return createBeginTransaction();
			case XmlaPackage.BINDINGS: return createBindings();
			case XmlaPackage.BOOL_BINOP: return createBoolBinop();
			case XmlaPackage.BOOLEAN_EXPR: return createBooleanExpr();
			case XmlaPackage.CALCULATED_MEASURE_BINDING: return createCalculatedMeasureBinding();
			case XmlaPackage.CALCULATION_PROPERTIES_TYPE: return createCalculationPropertiesType();
			case XmlaPackage.CALCULATION_PROPERTY: return createCalculationProperty();
			case XmlaPackage.CALCULATIONS_TYPE: return createCalculationsType();
			case XmlaPackage.CANCEL: return createCancel();
			case XmlaPackage.CELL: return createCell();
			case XmlaPackage.CELL_PERMISSION: return createCellPermission();
			case XmlaPackage.CELL_PERMISSIONS_TYPE: return createCellPermissionsType();
			case XmlaPackage.CLASSIFIED_COLUMNS_TYPE: return createClassifiedColumnsType();
			case XmlaPackage.CLEAR_CACHE: return createClearCache();
			case XmlaPackage.CLEAR_RESULT_TYPE: return createClearResultType();
			case XmlaPackage.CLONE_DATABASE: return createCloneDatabase();
			case XmlaPackage.CLR_ASSEMBLY: return createClrAssembly();
			case XmlaPackage.CLR_ASSEMBLY_FILE: return createClrAssemblyFile();
			case XmlaPackage.COLUMN_BINDING: return createColumnBinding();
			case XmlaPackage.COLUMNS_TYPE: return createColumnsType();
			case XmlaPackage.COLUMNS_TYPE1: return createColumnsType1();
			case XmlaPackage.COLUMNS_TYPE2: return createColumnsType2();
			case XmlaPackage.COLUMNS_TYPE3: return createColumnsType3();
			case XmlaPackage.COLUMNS_TYPE4: return createColumnsType4();
			case XmlaPackage.COLUMN_TYPE: return createColumnType();
			case XmlaPackage.COM_ASSEMBLY: return createComAssembly();
			case XmlaPackage.COMMAND: return createCommand();
			case XmlaPackage.COMMANDS_TYPE: return createCommandsType();
			case XmlaPackage.COMMIT_TRANSACTION: return createCommitTransaction();
			case XmlaPackage.COMPARATOR_TYPE: return createComparatorType();
			case XmlaPackage.CREATE: return createCreate();
			case XmlaPackage.CUBE: return createCube();
			case XmlaPackage.CUBE_ATTRIBUTE: return createCubeAttribute();
			case XmlaPackage.CUBE_ATTRIBUTE_BINDING: return createCubeAttributeBinding();
			case XmlaPackage.CUBE_DIMENSION: return createCubeDimension();
			case XmlaPackage.CUBE_DIMENSION_BINDING: return createCubeDimensionBinding();
			case XmlaPackage.CUBE_DIMENSION_PERMISSION: return createCubeDimensionPermission();
			case XmlaPackage.CUBE_HIERARCHY: return createCubeHierarchy();
			case XmlaPackage.CUBE_PERMISSION: return createCubePermission();
			case XmlaPackage.CUBE_PERMISSIONS_TYPE: return createCubePermissionsType();
			case XmlaPackage.CUBES_TYPE: return createCubesType();
			case XmlaPackage.CURRENT_STORAGE_MODE_TYPE: return createCurrentStorageModeType();
			case XmlaPackage.CURRENT_STORAGE_MODE_TYPE1: return createCurrentStorageModeType1();
			case XmlaPackage.CUSTOM_ROLLUP_COLUMN_TYPE: return createCustomRollupColumnType();
			case XmlaPackage.CUSTOM_ROLLUP_PROPERTIES_COLUMN_TYPE: return createCustomRollupPropertiesColumnType();
			case XmlaPackage.DATABASE: return createDatabase();
			case XmlaPackage.DATABASE_PERMISSION: return createDatabasePermission();
			case XmlaPackage.DATABASE_PERMISSIONS_TYPE: return createDatabasePermissionsType();
			case XmlaPackage.DATABASES_TYPE: return createDatabasesType();
			case XmlaPackage.DATA_BLOCK: return createDataBlock();
			case XmlaPackage.DATA_ITEM: return createDataItem();
			case XmlaPackage.DATA_MINING_MEASURE_GROUP_DIMENSION: return createDataMiningMeasureGroupDimension();
			case XmlaPackage.DATA_SOURCE_PERMISSION: return createDataSourcePermission();
			case XmlaPackage.DATA_SOURCE_PERMISSIONS_TYPE: return createDataSourcePermissionsType();
			case XmlaPackage.DATA_SOURCES_TYPE: return createDataSourcesType();
			case XmlaPackage.DATA_SOURCE_VIEW: return createDataSourceView();
			case XmlaPackage.DATA_SOURCE_VIEW_BINDING: return createDataSourceViewBinding();
			case XmlaPackage.DATA_SOURCE_VIEWS_TYPE: return createDataSourceViewsType();
			case XmlaPackage.DATA_TYPE: return createDataType();
			case XmlaPackage.DATA_TYPE1: return createDataType1();
			case XmlaPackage.DATA_TYPE2: return createDataType2();
			case XmlaPackage.DATA_TYPE3: return createDataType3();
			case XmlaPackage.DBCC: return createDBCC();
			case XmlaPackage.DEGENERATE_MEASURE_GROUP_DIMENSION: return createDegenerateMeasureGroupDimension();
			case XmlaPackage.DELETE: return createDelete();
			case XmlaPackage.DESIGN_AGGREGATIONS: return createDesignAggregations();
			case XmlaPackage.DETACH: return createDetach();
			case XmlaPackage.DIMENSION: return createDimension();
			case XmlaPackage.DIMENSION_ATTRIBUTE: return createDimensionAttribute();
			case XmlaPackage.DIMENSION_BINDING: return createDimensionBinding();
			case XmlaPackage.DIMENSION_PERMISSION: return createDimensionPermission();
			case XmlaPackage.DIMENSION_PERMISSIONS_TYPE: return createDimensionPermissionsType();
			case XmlaPackage.DIMENSION_PERMISSIONS_TYPE1: return createDimensionPermissionsType1();
			case XmlaPackage.DIMENSIONS_TYPE: return createDimensionsType();
			case XmlaPackage.DIMENSIONS_TYPE1: return createDimensionsType1();
			case XmlaPackage.DIMENSIONS_TYPE2: return createDimensionsType2();
			case XmlaPackage.DIMENSIONS_TYPE3: return createDimensionsType3();
			case XmlaPackage.DIMENSIONS_TYPE4: return createDimensionsType4();
			case XmlaPackage.DIMENSIONS_TYPE5: return createDimensionsType5();
			case XmlaPackage.DIMENSIONS_TYPE6: return createDimensionsType6();
			case XmlaPackage.DISCOVER_RESPONSE_TYPE: return createDiscoverResponseType();
			case XmlaPackage.DISCOVER_TYPE: return createDiscoverType();
			case XmlaPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case XmlaPackage.DRILL_THROUGH_ACTION: return createDrillThroughAction();
			case XmlaPackage.DROP: return createDrop();
			case XmlaPackage.DSV_TABLE_BINDING: return createDSVTableBinding();
			case XmlaPackage.END_OF_DATA_TYPE: return createEndOfDataType();
			case XmlaPackage.END_SESSION_TYPE: return createEndSessionType();
			case XmlaPackage.ERROR_CONFIGURATION: return createErrorConfiguration();
			case XmlaPackage.EVENT: return createEvent();
			case XmlaPackage.EVENT_CATEGORY_TYPE: return createEventCategoryType();
			case XmlaPackage.EVENT_COLUMN: return createEventColumn();
			case XmlaPackage.EVENT_COLUMN_ID: return createEventColumnID();
			case XmlaPackage.EVENT_COLUMN_LIST_TYPE: return createEventColumnListType();
			case XmlaPackage.EVENT_COLUMN_SUBCLASS_LIST_TYPE: return createEventColumnSubclassListType();
			case XmlaPackage.EVENT_COLUMN_SUBCLASS_TYPE: return createEventColumnSubclassType();
			case XmlaPackage.EVENT_LIST_TYPE: return createEventListType();
			case XmlaPackage.EVENT_SESSION_TYPE: return createEventSessionType();
			case XmlaPackage.EVENTS_TYPE: return createEventsType();
			case XmlaPackage.EVENT_TYPE: return createEventType();
			case XmlaPackage.EVENT_TYPE1: return createEventType1();
			case XmlaPackage.EVENT_TYPE_TYPE: return createEventTypeType();
			case XmlaPackage.EXECUTE_PARAMETER: return createExecuteParameter();
			case XmlaPackage.EXECUTE_RESPONSE_TYPE: return createExecuteResponseType();
			case XmlaPackage.EXECUTE_TYPE: return createExecuteType();
			case XmlaPackage.FILES_TYPE: return createFilesType();
			case XmlaPackage.FOLDER: return createFolder();
			case XmlaPackage.FOLDING_PARAMETERS: return createFoldingParameters();
			case XmlaPackage.FOREIGN_KEY_COLUMNS_TYPE: return createForeignKeyColumnsType();
			case XmlaPackage.FOREIGN_KEY_COLUMNS_TYPE1: return createForeignKeyColumnsType1();
			case XmlaPackage.FOREIGN_KEY_COLUMN_TYPE: return createForeignKeyColumnType();
			case XmlaPackage.GLOBAL_TYPE: return createGlobalType();
			case XmlaPackage.GROUP: return createGroup();
			case XmlaPackage.GROUPS_TYPE: return createGroupsType();
			case XmlaPackage.HIERARCHIES_TYPE: return createHierarchiesType();
			case XmlaPackage.HIERARCHIES_TYPE1: return createHierarchiesType1();
			case XmlaPackage.HIERARCHIES_TYPE2: return createHierarchiesType2();
			case XmlaPackage.HIERARCHY: return createHierarchy();
			case XmlaPackage.IMAGE_LOAD: return createImageLoad();
			case XmlaPackage.IMAGE_SAVE: return createImageSave();
			case XmlaPackage.INCREMENTAL_PROCESSING_NOTIFICATION: return createIncrementalProcessingNotification();
			case XmlaPackage.INCREMENTAL_PROCESSING_NOTIFICATIONS_TYPE: return createIncrementalProcessingNotificationsType();
			case XmlaPackage.INHERITED_BINDING: return createInheritedBinding();
			case XmlaPackage.INSERT: return createInsert();
			case XmlaPackage.KEEP_RESULT_TYPE: return createKeepResultType();
			case XmlaPackage.KEY_COLUMNS_TYPE: return createKeyColumnsType();
			case XmlaPackage.KEY_COLUMNS_TYPE1: return createKeyColumnsType1();
			case XmlaPackage.KEY_COLUMNS_TYPE2: return createKeyColumnsType2();
			case XmlaPackage.KEY_COLUMNS_TYPE3: return createKeyColumnsType3();
			case XmlaPackage.KEY_COLUMNS_TYPE4: return createKeyColumnsType4();
			case XmlaPackage.KEY_COLUMN_TYPE: return createKeyColumnType();
			case XmlaPackage.KEYS_TYPE: return createKeysType();
			case XmlaPackage.KEYS_TYPE1: return createKeysType1();
			case XmlaPackage.KPI: return createKpi();
			case XmlaPackage.KPIS_TYPE: return createKpisType();
			case XmlaPackage.KPIS_TYPE1: return createKpisType1();
			case XmlaPackage.LEVEL: return createLevel();
			case XmlaPackage.LEVELS_TYPE: return createLevelsType();
			case XmlaPackage.LOCATION: return createLocation();
			case XmlaPackage.LOCATION_BACKUP: return createLocationBackup();
			case XmlaPackage.LOCATIONS_TYPE: return createLocationsType();
			case XmlaPackage.LOCATIONS_TYPE1: return createLocationsType1();
			case XmlaPackage.LOCATIONS_TYPE2: return createLocationsType2();
			case XmlaPackage.LOCK: return createLock();
			case XmlaPackage.MAJOR_OBJECT: return createMajorObject();
			case XmlaPackage.MANY_TO_MANY_MEASURE_GROUP_DIMENSION: return createManyToManyMeasureGroupDimension();
			case XmlaPackage.MDX_SCRIPT: return createMdxScript();
			case XmlaPackage.MDX_SCRIPTS_TYPE: return createMdxScriptsType();
			case XmlaPackage.MEASURE: return createMeasure();
			case XmlaPackage.MEASURE_BINDING: return createMeasureBinding();
			case XmlaPackage.MEASURE_GROUP: return createMeasureGroup();
			case XmlaPackage.MEASURE_GROUP_ATTRIBUTE: return createMeasureGroupAttribute();
			case XmlaPackage.MEASURE_GROUP_BINDING: return createMeasureGroupBinding();
			case XmlaPackage.MEASURE_GROUP_DIMENSION_BINDING: return createMeasureGroupDimensionBinding();
			case XmlaPackage.MEASURE_GROUPS_TYPE: return createMeasureGroupsType();
			case XmlaPackage.MEASURE_GROUPS_TYPE1: return createMeasureGroupsType1();
			case XmlaPackage.MEASURES_TYPE: return createMeasuresType();
			case XmlaPackage.MEASURES_TYPE1: return createMeasuresType1();
			case XmlaPackage.MEASURES_TYPE2: return createMeasuresType2();
			case XmlaPackage.MEMBER: return createMember();
			case XmlaPackage.MEMBERS_TYPE: return createMembersType();
			case XmlaPackage.MEMBERS_TYPE1: return createMembersType1();
			case XmlaPackage.MERGE_PARTITIONS: return createMergePartitions();
			case XmlaPackage.MINING_MODEL: return createMiningModel();
			case XmlaPackage.MINING_MODEL_COLUMN: return createMiningModelColumn();
			case XmlaPackage.MINING_MODELING_FLAG: return createMiningModelingFlag();
			case XmlaPackage.MINING_MODEL_PERMISSION: return createMiningModelPermission();
			case XmlaPackage.MINING_MODEL_PERMISSIONS_TYPE: return createMiningModelPermissionsType();
			case XmlaPackage.MINING_MODELS_TYPE: return createMiningModelsType();
			case XmlaPackage.MINING_STRUCTURE: return createMiningStructure();
			case XmlaPackage.MINING_STRUCTURE_PERMISSION: return createMiningStructurePermission();
			case XmlaPackage.MINING_STRUCTURE_PERMISSIONS_TYPE: return createMiningStructurePermissionsType();
			case XmlaPackage.MINING_STRUCTURES_TYPE: return createMiningStructuresType();
			case XmlaPackage.MODELING_FLAGS_TYPE: return createModelingFlagsType();
			case XmlaPackage.MODELING_FLAGS_TYPE1: return createModelingFlagsType1();
			case XmlaPackage.NAME_COLUMN_TYPE: return createNameColumnType();
			case XmlaPackage.NAMING_TEMPLATE_TRANSLATIONS_TYPE: return createNamingTemplateTranslationsType();
			case XmlaPackage.NOTIFY_TABLE_CHANGE: return createNotifyTableChange();
			case XmlaPackage.NOT_TYPE: return createNotType();
			case XmlaPackage.OBJECT: return createObject();
			case XmlaPackage.OBJECT_REFERENCE: return createObjectReference();
			case XmlaPackage.OBJECT_TYPE: return createObjectType();
			case XmlaPackage.OLAP_DATA_SOURCE: return createOlapDataSource();
			case XmlaPackage.ORDINAL_TYPE: return createOrdinalType();
			case XmlaPackage.OUT_OF_LINE_BINDING: return createOutOfLineBinding();
			case XmlaPackage.PARALLEL_TYPE: return createParallelType();
			case XmlaPackage.PARAMETERS: return createParameters();
			case XmlaPackage.PARAMETERS_TYPE: return createParametersType();
			case XmlaPackage.PARAMETER_TYPE2: return createParameterType2();
			case XmlaPackage.PARTITION: return createPartition();
			case XmlaPackage.PARTITIONS_TYPE: return createPartitionsType();
			case XmlaPackage.PERMISSION: return createPermission();
			case XmlaPackage.PERSPECTIVE: return createPerspective();
			case XmlaPackage.PERSPECTIVE_ACTION: return createPerspectiveAction();
			case XmlaPackage.PERSPECTIVE_ATTRIBUTE: return createPerspectiveAttribute();
			case XmlaPackage.PERSPECTIVE_CALCULATION: return createPerspectiveCalculation();
			case XmlaPackage.PERSPECTIVE_DIMENSION: return createPerspectiveDimension();
			case XmlaPackage.PERSPECTIVE_HIERARCHY: return createPerspectiveHierarchy();
			case XmlaPackage.PERSPECTIVE_KPI: return createPerspectiveKpi();
			case XmlaPackage.PERSPECTIVE_MEASURE: return createPerspectiveMeasure();
			case XmlaPackage.PERSPECTIVE_MEASURE_GROUP: return createPerspectiveMeasureGroup();
			case XmlaPackage.PERSPECTIVES_TYPE: return createPerspectivesType();
			case XmlaPackage.PRED_LEAF: return createPredLeaf();
			case XmlaPackage.PROACTIVE_CACHING: return createProactiveCaching();
			case XmlaPackage.PROACTIVE_CACHING_INCREMENTAL_PROCESSING_BINDING: return createProactiveCachingIncrementalProcessingBinding();
			case XmlaPackage.PROACTIVE_CACHING_INHERITED_BINDING: return createProactiveCachingInheritedBinding();
			case XmlaPackage.PROACTIVE_CACHING_QUERY_BINDING: return createProactiveCachingQueryBinding();
			case XmlaPackage.PROACTIVE_CACHING_TABLES_BINDING: return createProactiveCachingTablesBinding();
			case XmlaPackage.PROCESS: return createProcess();
			case XmlaPackage.PROPERTIES: return createProperties();
			case XmlaPackage.PROPERTIES_TYPE: return createPropertiesType();
			case XmlaPackage.PROPERTY_LIST: return createPropertyList();
			case XmlaPackage.PUSHED_DATA_SOURCE: return createPushedDataSource();
			case XmlaPackage.QUERIES_TYPE: return createQueriesType();
			case XmlaPackage.QUERY_BINDING: return createQueryBinding();
			case XmlaPackage.QUERY_NOTIFICATION: return createQueryNotification();
			case XmlaPackage.QUERY_NOTIFICATIONS_TYPE: return createQueryNotificationsType();
			case XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION: return createReferenceMeasureGroupDimension();
			case XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION: return createRegularMeasureGroupDimension();
			case XmlaPackage.RELATIONAL_DATA_SOURCE: return createRelationalDataSource();
			case XmlaPackage.REPORT_ACTION: return createReportAction();
			case XmlaPackage.REPORT_FORMAT_PARAMETER: return createReportFormatParameter();
			case XmlaPackage.REPORT_FORMAT_PARAMETERS_TYPE: return createReportFormatParametersType();
			case XmlaPackage.REPORT_PARAMETER: return createReportParameter();
			case XmlaPackage.REPORT_PARAMETERS_TYPE: return createReportParametersType();
			case XmlaPackage.RESTORE: return createRestore();
			case XmlaPackage.RESTRICTION_LIST_TYPE: return createRestrictionListType();
			case XmlaPackage.RESTRICTIONS_TYPE: return createRestrictionsType();
			case XmlaPackage.RESULT_TYPE: return createResultType();
			case XmlaPackage.RETURN: return createReturn();
			case XmlaPackage.RETURN_TYPE: return createReturnType();
			case XmlaPackage.ROLE: return createRole();
			case XmlaPackage.ROLES_TYPE: return createRolesType();
			case XmlaPackage.ROLES_TYPE1: return createRolesType1();
			case XmlaPackage.ROLLBACK_TRANSACTION: return createRollbackTransaction();
			case XmlaPackage.ROOT_TYPE: return createRootType();
			case XmlaPackage.ROW_BINDING: return createRowBinding();
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN: return createScalarMiningStructureColumn();
			case XmlaPackage.SERVER: return createServer();
			case XmlaPackage.SERVER_PROPERTIES_TYPE: return createServerPropertiesType();
			case XmlaPackage.SERVER_PROPERTY: return createServerProperty();
			case XmlaPackage.SESSION_TYPE: return createSessionType();
			case XmlaPackage.SET_AUTH_CONTEXT: return createSetAuthContext();
			case XmlaPackage.SKIPPED_LEVELS_COLUMN_TYPE: return createSkippedLevelsColumnType();
			case XmlaPackage.SOURCE: return createSource();
			case XmlaPackage.SOURCES_TYPE: return createSourcesType();
			case XmlaPackage.STANDARD_ACTION: return createStandardAction();
			case XmlaPackage.STATEMENT: return createStatement();
			case XmlaPackage.STORAGE_MODE_TYPE: return createStorageModeType();
			case XmlaPackage.STORAGE_MODE_TYPE2: return createStorageModeType2();
			case XmlaPackage.STORAGE_MODE_TYPE3: return createStorageModeType3();
			case XmlaPackage.SUBSCRIBE: return createSubscribe();
			case XmlaPackage.SYNCHRONIZE: return createSynchronize();
			case XmlaPackage.TABLE_BINDING: return createTableBinding();
			case XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN: return createTableMiningStructureColumn();
			case XmlaPackage.TABLE_NOTIFICATION: return createTableNotification();
			case XmlaPackage.TABLE_NOTIFICATIONS_TYPE: return createTableNotificationsType();
			case XmlaPackage.TABLE_NOTIFICATIONS_TYPE1: return createTableNotificationsType1();
			case XmlaPackage.TARGET_TYPE: return createTargetType();
			case XmlaPackage.TARGET_TYPE1: return createTargetType1();
			case XmlaPackage.TIME_ATTRIBUTE_BINDING: return createTimeAttributeBinding();
			case XmlaPackage.TIME_BINDING: return createTimeBinding();
			case XmlaPackage.TRACE: return createTrace();
			case XmlaPackage.TRACE_COLUMNS: return createTraceColumns();
			case XmlaPackage.TRACE_DEFINITION_PROVIDER_INFO: return createTraceDefinitionProviderInfo();
			case XmlaPackage.TRACE_EVENT: return createTraceEvent();
			case XmlaPackage.TRACE_EVENT_CATEGORIES: return createTraceEventCategories();
			case XmlaPackage.TRACE_FILTER: return createTraceFilter();
			case XmlaPackage.TRACES_TYPE: return createTracesType();
			case XmlaPackage.TRANSLATION: return createTranslation();
			case XmlaPackage.TRANSLATION_INSERT_UPDATE: return createTranslationInsertUpdate();
			case XmlaPackage.TRANSLATIONS_TYPE: return createTranslationsType();
			case XmlaPackage.TRANSLATIONS_TYPE1: return createTranslationsType1();
			case XmlaPackage.TRANSLATIONS_TYPE2: return createTranslationsType2();
			case XmlaPackage.TRANSLATIONS_TYPE3: return createTranslationsType3();
			case XmlaPackage.TRANSLATIONS_TYPE4: return createTranslationsType4();
			case XmlaPackage.TRANSLATIONS_TYPE5: return createTranslationsType5();
			case XmlaPackage.TRANSLATIONS_TYPE6: return createTranslationsType6();
			case XmlaPackage.TRANSLATIONS_TYPE7: return createTranslationsType7();
			case XmlaPackage.TRANSLATIONS_TYPE8: return createTranslationsType8();
			case XmlaPackage.TRANSLATIONS_TYPE9: return createTranslationsType9();
			case XmlaPackage.TRANSLATIONS_TYPE10: return createTranslationsType10();
			case XmlaPackage.TRANSLATIONS_TYPE11: return createTranslationsType11();
			case XmlaPackage.TRANSLATIONS_TYPE12: return createTranslationsType12();
			case XmlaPackage.TRANSLATIONS_TYPE13: return createTranslationsType13();
			case XmlaPackage.TRANSLATIONS_TYPE14: return createTranslationsType14();
			case XmlaPackage.TRANSLATIONS_TYPE15: return createTranslationsType15();
			case XmlaPackage.TRANSLATIONS_TYPE16: return createTranslationsType16();
			case XmlaPackage.TRANSLATIONS_TYPE17: return createTranslationsType17();
			case XmlaPackage.TRANSLATIONS_TYPE18: return createTranslationsType18();
			case XmlaPackage.TRANSLATIONS_TYPE19: return createTranslationsType19();
			case XmlaPackage.TRANSLATIONS_TYPE20: return createTranslationsType20();
			case XmlaPackage.TRANSLATIONS_TYPE21: return createTranslationsType21();
			case XmlaPackage.TRANSLATIONS_TYPE22: return createTranslationsType22();
			case XmlaPackage.TRANSLATION_TYPE: return createTranslationType();
			case XmlaPackage.TYPE_TYPE6: return createTypeType6();
			case XmlaPackage.UNARY_EXPR: return createUnaryExpr();
			case XmlaPackage.UNARY_OPERATOR_COLUMN_TYPE: return createUnaryOperatorColumnType();
			case XmlaPackage.UNKNOWN_MEMBER_TRANSLATIONS_TYPE: return createUnknownMemberTranslationsType();
			case XmlaPackage.UNKNOWN_MEMBER_TYPE: return createUnknownMemberType();
			case XmlaPackage.UNLOCK: return createUnlock();
			case XmlaPackage.UNSUBSCRIBE: return createUnsubscribe();
			case XmlaPackage.UPDATE: return createUpdate();
			case XmlaPackage.UPDATE_CELLS: return createUpdateCells();
			case XmlaPackage.USER_DEFINED_GROUP_BINDING: return createUserDefinedGroupBinding();
			case XmlaPackage.VALUE_COLUMN_TYPE: return createValueColumnType();
			case XmlaPackage.VERSION_TYPE: return createVersionType();
			case XmlaPackage.WHERE: return createWhere();
			case XmlaPackage.WHERE_ATTRIBUTE: return createWhereAttribute();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case XmlaPackage.ACCESS_TYPE:
				return createAccessTypeFromString(eDataType, initialValue);
			case XmlaPackage.AGGREGATE_FUNCTION_TYPE:
				return createAggregateFunctionTypeFromString(eDataType, initialValue);
			case XmlaPackage.AGGREGATION_FUNCTION_TYPE:
				return createAggregationFunctionTypeFromString(eDataType, initialValue);
			case XmlaPackage.AGGREGATION_STORAGE_TYPE:
				return createAggregationStorageTypeFromString(eDataType, initialValue);
			case XmlaPackage.AGGREGATION_TYPE_TYPE:
				return createAggregationTypeTypeFromString(eDataType, initialValue);
			case XmlaPackage.AGGREGATION_USAGE_TYPE:
				return createAggregationUsageTypeFromString(eDataType, initialValue);
			case XmlaPackage.ALGORITHM_TYPE:
				return createAlgorithmTypeFromString(eDataType, initialValue);
			case XmlaPackage.ALL_MEMBER_AGGREGATION_USAGE_TYPE:
				return createAllMemberAggregationUsageTypeFromString(eDataType, initialValue);
			case XmlaPackage.ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE_TYPE:
				return createAttributeHierarchyOptimizedStateTypeFromString(eDataType, initialValue);
			case XmlaPackage.ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE_TYPE1:
				return createAttributeHierarchyOptimizedStateType1FromString(eDataType, initialValue);
			case XmlaPackage.AXIS_FORMAT_TYPE:
				return createAxisFormatTypeFromString(eDataType, initialValue);
			case XmlaPackage.CACHE_MODE_TYPE:
				return createCacheModeTypeFromString(eDataType, initialValue);
			case XmlaPackage.CALCULATION_TYPE_TYPE:
				return createCalculationTypeTypeFromString(eDataType, initialValue);
			case XmlaPackage.CARDINALITY_TYPE:
				return createCardinalityTypeFromString(eDataType, initialValue);
			case XmlaPackage.CARDINALITY_TYPE1:
				return createCardinalityType1FromString(eDataType, initialValue);
			case XmlaPackage.CATALOG_LOCATION_TYPE:
				return createCatalogLocationTypeFromString(eDataType, initialValue);
			case XmlaPackage.CONNECTION_STRING_SECURITY_TYPE:
				return createConnectionStringSecurityTypeFromString(eDataType, initialValue);
			case XmlaPackage.CONTENT_TYPE:
				return createContentTypeFromString(eDataType, initialValue);
			case XmlaPackage.CONTENT_TYPE1:
				return createContentType1FromString(eDataType, initialValue);
			case XmlaPackage.CUBE_STORAGE_MODE_ENUM_TYPE:
				return createCubeStorageModeEnumTypeFromString(eDataType, initialValue);
			case XmlaPackage.DATA_AGGREGATION_TYPE:
				return createDataAggregationTypeFromString(eDataType, initialValue);
			case XmlaPackage.DATA_TYPE_TYPE:
				return createDataTypeTypeFromString(eDataType, initialValue);
			case XmlaPackage.DATA_TYPE_TYPE1:
				return createDataTypeType1FromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_CONCAT_NULL_BEHAVIOR_TYPE:
				return createDbpropConcatNullBehaviorTypeFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_MSMD_AUTO_EXISTS_TYPE:
				return createDbpropMsmdAutoExistsTypeFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_MSMD_COMPARE_CASE_SENSITIVE_STRING_FLAGS_TYPE:
				return createDbpropMsmdCompareCaseSensitiveStringFlagsTypeFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_MSMD_MDX_COMPATIBILITY_TYPE:
				return createDbpropMsmdMDXCompatibilityTypeFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_MSMD_SUBQUERIES_TYPE:
				return createDbpropMsmdSubqueriesTypeFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_NULL_COLLATION_TYPE:
				return createDbpropNullCollationTypeFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_OUTPUT_PARAMETER_AVAILABLE_TYPE:
				return createDbpropOutputParameterAvailableTypeFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_PERSISTENT_ID_TYPE_TYPE:
				return createDbpropPersistentIdTypeTypeFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_PREPARE_ABORT_BEHAVIOR_TYPE:
				return createDbpropPrepareAbortBehaviorTypeFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_PREPARE_COMMIT_BEHAVIOR_TYPE:
				return createDbpropPrepareCommitBehaviorTypeFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_QUOTED_IDENTIFIER_CASE_TYPE:
				return createDbpropQuotedIdentifierCaseTypeFromString(eDataType, initialValue);
			case XmlaPackage.DIALECT_TYPE:
				return createDialectTypeFromString(eDataType, initialValue);
			case XmlaPackage.DIMENSION_ATTRIBUTE_TYPE_ENUM_TYPE:
				return createDimensionAttributeTypeEnumTypeFromString(eDataType, initialValue);
			case XmlaPackage.DIMENSION_CURRENT_STORAGE_MODE_ENUM_TYPE:
				return createDimensionCurrentStorageModeEnumTypeFromString(eDataType, initialValue);
			case XmlaPackage.DISCRETIZATION_METHOD_TYPE:
				return createDiscretizationMethodTypeFromString(eDataType, initialValue);
			case XmlaPackage.DURABILITY_GUARANTEE_TYPE:
				return createDurabilityGuaranteeTypeFromString(eDataType, initialValue);
			case XmlaPackage.EDITION_TYPE:
				return createEditionTypeFromString(eDataType, initialValue);
			case XmlaPackage.FISCAL_YEAR_NAME_TYPE:
				return createFiscalYearNameTypeFromString(eDataType, initialValue);
			case XmlaPackage.FORMAT_TYPE:
				return createFormatTypeFromString(eDataType, initialValue);
			case XmlaPackage.FORMAT_TYPE1:
				return createFormatType1FromString(eDataType, initialValue);
			case XmlaPackage.GROUPING_BEHAVIOR_TYPE:
				return createGroupingBehaviorTypeFromString(eDataType, initialValue);
			case XmlaPackage.HIDE_MEMBER_IF_TYPE:
				return createHideMemberIfTypeFromString(eDataType, initialValue);
			case XmlaPackage.HIERARCHY_UNIQUE_NAME_STYLE_TYPE:
				return createHierarchyUniqueNameStyleTypeFromString(eDataType, initialValue);
			case XmlaPackage.INSTANCE_SELECTION_TYPE:
				return createInstanceSelectionTypeFromString(eDataType, initialValue);
			case XmlaPackage.INVALID_XML_CHARACTERS_TYPE:
				return createInvalidXmlCharactersTypeFromString(eDataType, initialValue);
			case XmlaPackage.INVOCATION_TYPE:
				return createInvocationTypeFromString(eDataType, initialValue);
			case XmlaPackage.INVOCATION_TYPE1:
				return createInvocationType1FromString(eDataType, initialValue);
			case XmlaPackage.INVOCATION_TYPE2:
				return createInvocationType2FromString(eDataType, initialValue);
			case XmlaPackage.ISOLATION_TYPE:
				return createIsolationTypeFromString(eDataType, initialValue);
			case XmlaPackage.KEY_DUPLICATE_TYPE:
				return createKeyDuplicateTypeFromString(eDataType, initialValue);
			case XmlaPackage.KEY_ERROR_ACTION_TYPE:
				return createKeyErrorActionTypeFromString(eDataType, initialValue);
			case XmlaPackage.KEY_ERROR_LIMIT_ACTION_TYPE:
				return createKeyErrorLimitActionTypeFromString(eDataType, initialValue);
			case XmlaPackage.KEY_NOT_FOUND_TYPE:
				return createKeyNotFoundTypeFromString(eDataType, initialValue);
			case XmlaPackage.MATERIALIZATION_TYPE:
				return createMaterializationTypeFromString(eDataType, initialValue);
			case XmlaPackage.MDPROP_AGGREGATE_CELL_UPDATE_TYPE:
				return createMdpropAggregateCellUpdateTypeFromString(eDataType, initialValue);
			case XmlaPackage.MDPROP_FLATTENING_SUPPORT_TYPE:
				return createMdpropFlatteningSupportTypeFromString(eDataType, initialValue);
			case XmlaPackage.MDPROP_MDX_NON_MEASURE_EXPRESSIONS_TYPE:
				return createMdpropMdxNonMeasureExpressionsTypeFromString(eDataType, initialValue);
			case XmlaPackage.MDPROP_MDX_RANGE_ROWSET_TYPE:
				return createMdpropMdxRangeRowsetTypeFromString(eDataType, initialValue);
			case XmlaPackage.MDPROP_MDX_SLICER_TYPE:
				return createMdpropMdxSlicerTypeFromString(eDataType, initialValue);
			case XmlaPackage.MDX_MISSING_MEMBER_MODE_TYPE:
				return createMdxMissingMemberModeTypeFromString(eDataType, initialValue);
			case XmlaPackage.MDX_MISSING_MEMBER_MODE_TYPE1:
				return createMdxMissingMemberModeType1FromString(eDataType, initialValue);
			case XmlaPackage.MDX_SUPPORT_TYPE:
				return createMDXSupportTypeFromString(eDataType, initialValue);
			case XmlaPackage.MEASURE_GROUP_STORAGE_MODE_ENUM_TYPE:
				return createMeasureGroupStorageModeEnumTypeFromString(eDataType, initialValue);
			case XmlaPackage.MEMBERS_WITH_DATA_TYPE:
				return createMembersWithDataTypeFromString(eDataType, initialValue);
			case XmlaPackage.MEMBER_UNIQUE_NAME_STYLE_TYPE:
				return createMemberUniqueNameStyleTypeFromString(eDataType, initialValue);
			case XmlaPackage.MEMORY_LOCKING_MODE_TYPE:
				return createMemoryLockingModeTypeFromString(eDataType, initialValue);
			case XmlaPackage.MODE_TYPE:
				return createModeTypeFromString(eDataType, initialValue);
			case XmlaPackage.NOTIFICATION_TECHNIQUE_TYPE:
				return createNotificationTechniqueTypeFromString(eDataType, initialValue);
			case XmlaPackage.NOTIFICATION_TECHNIQUE_TYPE1:
				return createNotificationTechniqueType1FromString(eDataType, initialValue);
			case XmlaPackage.NULL_KEY_CONVERTED_TO_UNKNOWN_TYPE:
				return createNullKeyConvertedToUnknownTypeFromString(eDataType, initialValue);
			case XmlaPackage.NULL_KEY_NOT_ALLOWED_TYPE:
				return createNullKeyNotAllowedTypeFromString(eDataType, initialValue);
			case XmlaPackage.NULL_PROCESSING_TYPE:
				return createNullProcessingTypeFromString(eDataType, initialValue);
			case XmlaPackage.OBJECT_EXPANSION:
				return createObjectExpansionFromString(eDataType, initialValue);
			case XmlaPackage.ONLINE_MODE_TYPE:
				return createOnlineModeTypeFromString(eDataType, initialValue);
			case XmlaPackage.OPTIMIZED_STATE_TYPE:
				return createOptimizedStateTypeFromString(eDataType, initialValue);
			case XmlaPackage.OPTIONALITY_TYPE:
				return createOptionalityTypeFromString(eDataType, initialValue);
			case XmlaPackage.ORDER_BY_TYPE:
				return createOrderByTypeFromString(eDataType, initialValue);
			case XmlaPackage.OVERRIDE_BEHAVIOR_TYPE:
				return createOverrideBehaviorTypeFromString(eDataType, initialValue);
			case XmlaPackage.PARAMETER_TYPE:
				return createParameterTypeFromString(eDataType, initialValue);
			case XmlaPackage.PARAMETER_TYPE1:
				return createParameterType1FromString(eDataType, initialValue);
			case XmlaPackage.PARTITION_CURRENT_STORAGE_MODE_ENUM_TYPE:
				return createPartitionCurrentStorageModeEnumTypeFromString(eDataType, initialValue);
			case XmlaPackage.PARTITION_MODES:
				return createPartitionModesFromString(eDataType, initialValue);
			case XmlaPackage.PARTITION_STORAGE_MODE_ENUM_TYPE:
				return createPartitionStorageModeEnumTypeFromString(eDataType, initialValue);
			case XmlaPackage.PERMISSION_SET_TYPE:
				return createPermissionSetTypeFromString(eDataType, initialValue);
			case XmlaPackage.PERSISTENCE_TYPE:
				return createPersistenceTypeFromString(eDataType, initialValue);
			case XmlaPackage.PERSISTENCE_TYPE1:
				return createPersistenceType1FromString(eDataType, initialValue);
			case XmlaPackage.PROCESSING_GROUP_TYPE:
				return createProcessingGroupTypeFromString(eDataType, initialValue);
			case XmlaPackage.PROCESSING_MODE_TYPE:
				return createProcessingModeTypeFromString(eDataType, initialValue);
			case XmlaPackage.PROCESSING_MODE_TYPE1:
				return createProcessingModeType1FromString(eDataType, initialValue);
			case XmlaPackage.PROCESSING_MODE_TYPE2:
				return createProcessingModeType2FromString(eDataType, initialValue);
			case XmlaPackage.PROCESSING_MODE_TYPE3:
				return createProcessingModeType3FromString(eDataType, initialValue);
			case XmlaPackage.PROCESSING_STATE_TYPE:
				return createProcessingStateTypeFromString(eDataType, initialValue);
			case XmlaPackage.PROVIDER_TYPE_TYPE:
				return createProviderTypeTypeFromString(eDataType, initialValue);
			case XmlaPackage.READ_DEFINITION_TYPE:
				return createReadDefinitionTypeFromString(eDataType, initialValue);
			case XmlaPackage.READ_SOURCE_DATA_TYPE:
				return createReadSourceDataTypeFromString(eDataType, initialValue);
			case XmlaPackage.READ_TYPE:
				return createReadTypeFromString(eDataType, initialValue);
			case XmlaPackage.READ_TYPE1:
				return createReadType1FromString(eDataType, initialValue);
			case XmlaPackage.REFRESH_POLICY_TYPE:
				return createRefreshPolicyTypeFromString(eDataType, initialValue);
			case XmlaPackage.REFRESH_POLICY_TYPE1:
				return createRefreshPolicyType1FromString(eDataType, initialValue);
			case XmlaPackage.RELATIONSHIP_TYPE_TYPE:
				return createRelationshipTypeTypeFromString(eDataType, initialValue);
			case XmlaPackage.REPORTING_FIRST_WEEK_OF_MONTH_TYPE:
				return createReportingFirstWeekOfMonthTypeFromString(eDataType, initialValue);
			case XmlaPackage.REPORTING_WEEK_TO_MONTH_PATTERN_TYPE:
				return createReportingWeekToMonthPatternTypeFromString(eDataType, initialValue);
			case XmlaPackage.REQUEST_TYPE_TYPE:
				return createRequestTypeTypeFromString(eDataType, initialValue);
			case XmlaPackage.RESPONSE_ENCODING_TYPE:
				return createResponseEncodingTypeFromString(eDataType, initialValue);
			case XmlaPackage.RETENTION_MODES:
				return createRetentionModesFromString(eDataType, initialValue);
			case XmlaPackage.ROOT_MEMBER_IF_TYPE:
				return createRootMemberIfTypeFromString(eDataType, initialValue);
			case XmlaPackage.SAFETY_OPTIONS_TYPE:
				return createSafetyOptionsTypeFromString(eDataType, initialValue);
			case XmlaPackage.SCOPE:
				return createScopeFromString(eDataType, initialValue);
			case XmlaPackage.SCRIPT_CACHE_PROCESSING_MODE_TYPE:
				return createScriptCacheProcessingModeTypeFromString(eDataType, initialValue);
			case XmlaPackage.SCRIPT_ERROR_HANDLING_MODE_TYPE:
				return createScriptErrorHandlingModeTypeFromString(eDataType, initialValue);
			case XmlaPackage.SECURED_CELL_VALUE_TYPE:
				return createSecuredCellValueTypeFromString(eDataType, initialValue);
			case XmlaPackage.SECURITY_TYPE:
				return createSecurityTypeFromString(eDataType, initialValue);
			case XmlaPackage.SECURITY_TYPE1:
				return createSecurityType1FromString(eDataType, initialValue);
			case XmlaPackage.SHARE_DIMENSION_STORAGE_TYPE:
				return createShareDimensionStorageTypeFromString(eDataType, initialValue);
			case XmlaPackage.SQL_QUERY_MODE_TYPE:
				return createSQLQueryModeTypeFromString(eDataType, initialValue);
			case XmlaPackage.STATE_SUPPORT_TYPE:
				return createStateSupportTypeFromString(eDataType, initialValue);
			case XmlaPackage.STATE_TYPE:
				return createStateTypeFromString(eDataType, initialValue);
			case XmlaPackage.STATE_TYPE1:
				return createStateType1FromString(eDataType, initialValue);
			case XmlaPackage.STATE_TYPE2:
				return createStateType2FromString(eDataType, initialValue);
			case XmlaPackage.STATE_TYPE3:
				return createStateType3FromString(eDataType, initialValue);
			case XmlaPackage.STATE_TYPE4:
				return createStateType4FromString(eDataType, initialValue);
			case XmlaPackage.STATE_TYPE5:
				return createStateType5FromString(eDataType, initialValue);
			case XmlaPackage.STATE_TYPE6:
				return createStateType6FromString(eDataType, initialValue);
			case XmlaPackage.STORAGE_MODE_TYPE1:
				return createStorageModeType1FromString(eDataType, initialValue);
			case XmlaPackage.SYNCHRONIZE_SECURITY_TYPE:
				return createSynchronizeSecurityTypeFromString(eDataType, initialValue);
			case XmlaPackage.TARGET_TYPE_TYPE:
				return createTargetTypeTypeFromString(eDataType, initialValue);
			case XmlaPackage.TARGET_TYPE_TYPE1:
				return createTargetTypeType1FromString(eDataType, initialValue);
			case XmlaPackage.TARGET_TYPE_TYPE2:
				return createTargetTypeType2FromString(eDataType, initialValue);
			case XmlaPackage.TRIMMING_TYPE:
				return createTrimmingTypeFromString(eDataType, initialValue);
			case XmlaPackage.TYPE_TYPE:
				return createTypeTypeFromString(eDataType, initialValue);
			case XmlaPackage.TYPE_TYPE1:
				return createTypeType1FromString(eDataType, initialValue);
			case XmlaPackage.TYPE_TYPE2:
				return createTypeType2FromString(eDataType, initialValue);
			case XmlaPackage.TYPE_TYPE3:
				return createTypeType3FromString(eDataType, initialValue);
			case XmlaPackage.TYPE_TYPE4:
				return createTypeType4FromString(eDataType, initialValue);
			case XmlaPackage.TYPE_TYPE5:
				return createTypeType5FromString(eDataType, initialValue);
			case XmlaPackage.TYPE_TYPE7:
				return createTypeType7FromString(eDataType, initialValue);
			case XmlaPackage.TYPE_TYPE8:
				return createTypeType8FromString(eDataType, initialValue);
			case XmlaPackage.TYPE_TYPE9:
				return createTypeType9FromString(eDataType, initialValue);
			case XmlaPackage.TYPE_TYPE10:
				return createTypeType10FromString(eDataType, initialValue);
			case XmlaPackage.TYPE_TYPE11:
				return createTypeType11FromString(eDataType, initialValue);
			case XmlaPackage.TYPE_TYPE12:
				return createTypeType12FromString(eDataType, initialValue);
			case XmlaPackage.TYPE_TYPE13:
				return createTypeType13FromString(eDataType, initialValue);
			case XmlaPackage.UNKNOWN_MEMBER_ENUM_TYPE:
				return createUnknownMemberEnumTypeFromString(eDataType, initialValue);
			case XmlaPackage.UPDATE_ISOLATION_LEVEL_TYPE:
				return createUpdateIsolationLevelTypeFromString(eDataType, initialValue);
			case XmlaPackage.USAGE_TYPE:
				return createUsageTypeFromString(eDataType, initialValue);
			case XmlaPackage.USAGE_TYPE1:
				return createUsageType1FromString(eDataType, initialValue);
			case XmlaPackage.VALUENS_TYPE:
				return createValuensTypeFromString(eDataType, initialValue);
			case XmlaPackage.VALUENS_TYPE1:
				return createValuensType1FromString(eDataType, initialValue);
			case XmlaPackage.VALUENS_TYPE2:
				return createValuensType2FromString(eDataType, initialValue);
			case XmlaPackage.VALUENS_TYPE3:
				return createValuensType3FromString(eDataType, initialValue);
			case XmlaPackage.VALUENS_TYPE4:
				return createValuensType4FromString(eDataType, initialValue);
			case XmlaPackage.VALUENS_TYPE5:
				return createValuensType5FromString(eDataType, initialValue);
			case XmlaPackage.VALUENS_TYPE6:
				return createValuensType6FromString(eDataType, initialValue);
			case XmlaPackage.VISIBILITY_TYPE:
				return createVisibilityTypeFromString(eDataType, initialValue);
			case XmlaPackage.VISUAL_MODE_TYPE:
				return createVisualModeTypeFromString(eDataType, initialValue);
			case XmlaPackage.WRITE_BACK_TABLE_CREATION:
				return createWriteBackTableCreationFromString(eDataType, initialValue);
			case XmlaPackage.WRITE_TYPE:
				return createWriteTypeFromString(eDataType, initialValue);
			case XmlaPackage.WRITE_TYPE1:
				return createWriteType1FromString(eDataType, initialValue);
			case XmlaPackage.WRITE_TYPE2:
				return createWriteType2FromString(eDataType, initialValue);
			case XmlaPackage.WRITE_TYPE3:
				return createWriteType3FromString(eDataType, initialValue);
			case XmlaPackage.WRITE_TYPE4:
				return createWriteType4FromString(eDataType, initialValue);
			case XmlaPackage.WRITE_TYPE5:
				return createWriteType5FromString(eDataType, initialValue);
			case XmlaPackage.WRITE_TYPE6:
				return createWriteType6FromString(eDataType, initialValue);
			case XmlaPackage.ACCESS_TYPE_OBJECT:
				return createAccessTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.AGGREGATE_FUNCTION_TYPE_OBJECT:
				return createAggregateFunctionTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.AGGREGATION_FUNCTION_TYPE_OBJECT:
				return createAggregationFunctionTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.AGGREGATION_STORAGE_TYPE_OBJECT:
				return createAggregationStorageTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.AGGREGATION_TYPE_TYPE_OBJECT:
				return createAggregationTypeTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.AGGREGATION_USAGE_TYPE_OBJECT:
				return createAggregationUsageTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.ALGORITHM_TYPE_OBJECT:
				return createAlgorithmTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.ALL_MEMBER_AGGREGATION_USAGE_TYPE_OBJECT:
				return createAllMemberAggregationUsageTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE_TYPE_OBJECT:
				return createAttributeHierarchyOptimizedStateTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE_TYPE_OBJECT1:
				return createAttributeHierarchyOptimizedStateTypeObject1FromString(eDataType, initialValue);
			case XmlaPackage.AXIS_FORMAT_TYPE_OBJECT:
				return createAxisFormatTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.CACHE_MODE_TYPE_OBJECT:
				return createCacheModeTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.CALCULATION_TYPE_TYPE_OBJECT:
				return createCalculationTypeTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.CARDINALITY_TYPE_OBJECT:
				return createCardinalityTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.CARDINALITY_TYPE_OBJECT1:
				return createCardinalityTypeObject1FromString(eDataType, initialValue);
			case XmlaPackage.CATALOG_LOCATION_TYPE_OBJECT:
				return createCatalogLocationTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.CONNECTION_STRING_SECURITY_TYPE_OBJECT:
				return createConnectionStringSecurityTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.CONTENT_TYPE_OBJECT:
				return createContentTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.CONTENT_TYPE_OBJECT1:
				return createContentTypeObject1FromString(eDataType, initialValue);
			case XmlaPackage.CUBE_STORAGE_MODE_ENUM_TYPE_OBJECT:
				return createCubeStorageModeEnumTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.DATA_AGGREGATION_TYPE_OBJECT:
				return createDataAggregationTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.DATA_TYPE_TYPE_OBJECT:
				return createDataTypeTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.DATA_TYPE_TYPE_OBJECT1:
				return createDataTypeTypeObject1FromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_CONCAT_NULL_BEHAVIOR_TYPE_OBJECT:
				return createDbpropConcatNullBehaviorTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_MSMD_AUTO_EXISTS_TYPE_OBJECT:
				return createDbpropMsmdAutoExistsTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_MSMD_COMPARE_CASE_SENSITIVE_STRING_FLAGS_TYPE_OBJECT:
				return createDbpropMsmdCompareCaseSensitiveStringFlagsTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_MSMD_MDX_COMPATIBILITY_TYPE_OBJECT:
				return createDbpropMsmdMDXCompatibilityTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_MSMD_SUBQUERIES_TYPE_OBJECT:
				return createDbpropMsmdSubqueriesTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_NULL_COLLATION_TYPE_OBJECT:
				return createDbpropNullCollationTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_OUTPUT_PARAMETER_AVAILABLE_TYPE_OBJECT:
				return createDbpropOutputParameterAvailableTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_PERSISTENT_ID_TYPE_TYPE_OBJECT:
				return createDbpropPersistentIdTypeTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_PREPARE_ABORT_BEHAVIOR_TYPE_OBJECT:
				return createDbpropPrepareAbortBehaviorTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_PREPARE_COMMIT_BEHAVIOR_TYPE_OBJECT:
				return createDbpropPrepareCommitBehaviorTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.DBPROP_QUOTED_IDENTIFIER_CASE_TYPE_OBJECT:
				return createDbpropQuotedIdentifierCaseTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.DIALECT_TYPE_OBJECT:
				return createDialectTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.DIMENSION_ATTRIBUTE_TYPE_ENUM_TYPE_OBJECT:
				return createDimensionAttributeTypeEnumTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.DIMENSION_CURRENT_STORAGE_MODE_ENUM_TYPE_OBJECT:
				return createDimensionCurrentStorageModeEnumTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.DISCRETIZATION_METHOD_TYPE_OBJECT:
				return createDiscretizationMethodTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.DURABILITY_GUARANTEE_TYPE_OBJECT:
				return createDurabilityGuaranteeTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.EDITION_TYPE_OBJECT:
				return createEditionTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.FIRST_DAY_OF_WEEK_TYPE:
				return createFirstDayOfWeekTypeFromString(eDataType, initialValue);
			case XmlaPackage.FISCAL_FIRST_DAY_OF_MONTH_TYPE:
				return createFiscalFirstDayOfMonthTypeFromString(eDataType, initialValue);
			case XmlaPackage.FISCAL_FIRST_MONTH_TYPE:
				return createFiscalFirstMonthTypeFromString(eDataType, initialValue);
			case XmlaPackage.FISCAL_YEAR_NAME_TYPE_OBJECT:
				return createFiscalYearNameTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.FORMAT_TYPE_OBJECT:
				return createFormatTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.FORMAT_TYPE_OBJECT1:
				return createFormatTypeObject1FromString(eDataType, initialValue);
			case XmlaPackage.GROUPING_BEHAVIOR_TYPE_OBJECT:
				return createGroupingBehaviorTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.HIDE_MEMBER_IF_TYPE_OBJECT:
				return createHideMemberIfTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.HIERARCHY_UNIQUE_NAME_STYLE_TYPE_OBJECT:
				return createHierarchyUniqueNameStyleTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.ID_TYPE:
				return createIDTypeFromString(eDataType, initialValue);
			case XmlaPackage.ID_TYPE1:
				return createIDType1FromString(eDataType, initialValue);
			case XmlaPackage.INSTANCE_SELECTION_TYPE_OBJECT:
				return createInstanceSelectionTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.INVALID_XML_CHARACTERS_TYPE_OBJECT:
				return createInvalidXmlCharactersTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.INVOCATION_TYPE_OBJECT:
				return createInvocationTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.INVOCATION_TYPE_OBJECT1:
				return createInvocationTypeObject1FromString(eDataType, initialValue);
			case XmlaPackage.INVOCATION_TYPE_OBJECT2:
				return createInvocationTypeObject2FromString(eDataType, initialValue);
			case XmlaPackage.ISOLATION_TYPE_OBJECT:
				return createIsolationTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.KEY_DUPLICATE_TYPE_OBJECT:
				return createKeyDuplicateTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.KEY_ERROR_ACTION_TYPE_OBJECT:
				return createKeyErrorActionTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.KEY_ERROR_LIMIT_ACTION_TYPE_OBJECT:
				return createKeyErrorLimitActionTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.KEY_NOT_FOUND_TYPE_OBJECT:
				return createKeyNotFoundTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.MANUFACTURING_EXTRA_MONTH_QUARTER_TYPE:
				return createManufacturingExtraMonthQuarterTypeFromString(eDataType, initialValue);
			case XmlaPackage.MANUFACTURING_FIRST_MONTH_TYPE:
				return createManufacturingFirstMonthTypeFromString(eDataType, initialValue);
			case XmlaPackage.MANUFACTURING_FIRST_WEEK_OF_MONTH_TYPE:
				return createManufacturingFirstWeekOfMonthTypeFromString(eDataType, initialValue);
			case XmlaPackage.MATERIALIZATION_TYPE_OBJECT:
				return createMaterializationTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.MDPROP_AGGREGATE_CELL_UPDATE_TYPE_OBJECT:
				return createMdpropAggregateCellUpdateTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.MDPROP_FLATTENING_SUPPORT_TYPE_OBJECT:
				return createMdpropFlatteningSupportTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.MDPROP_MDX_NON_MEASURE_EXPRESSIONS_TYPE_OBJECT:
				return createMdpropMdxNonMeasureExpressionsTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.MDPROP_MDX_RANGE_ROWSET_TYPE_OBJECT:
				return createMdpropMdxRangeRowsetTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.MDPROP_MDX_SLICER_TYPE_OBJECT:
				return createMdpropMdxSlicerTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.MDX_MISSING_MEMBER_MODE_TYPE_OBJECT:
				return createMdxMissingMemberModeTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.MDX_MISSING_MEMBER_MODE_TYPE_OBJECT1:
				return createMdxMissingMemberModeTypeObject1FromString(eDataType, initialValue);
			case XmlaPackage.MDX_SUPPORT_TYPE_OBJECT:
				return createMDXSupportTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.MEASURE_GROUP_STORAGE_MODE_ENUM_TYPE_OBJECT:
				return createMeasureGroupStorageModeEnumTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.MEMBERS_WITH_DATA_TYPE_OBJECT:
				return createMembersWithDataTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.MEMBER_UNIQUE_NAME_STYLE_TYPE_OBJECT:
				return createMemberUniqueNameStyleTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.MEMORY_LOCKING_MODE_TYPE_OBJECT:
				return createMemoryLockingModeTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.MODE_TYPE_OBJECT:
				return createModeTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.NOTIFICATION_TECHNIQUE_TYPE_OBJECT:
				return createNotificationTechniqueTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.NOTIFICATION_TECHNIQUE_TYPE_OBJECT1:
				return createNotificationTechniqueTypeObject1FromString(eDataType, initialValue);
			case XmlaPackage.NULL_KEY_CONVERTED_TO_UNKNOWN_TYPE_OBJECT:
				return createNullKeyConvertedToUnknownTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.NULL_KEY_NOT_ALLOWED_TYPE_OBJECT:
				return createNullKeyNotAllowedTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.NULL_PROCESSING_TYPE_OBJECT:
				return createNullProcessingTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.OBJECT_EXPANSION_OBJECT:
				return createObjectExpansionObjectFromString(eDataType, initialValue);
			case XmlaPackage.ONLINE_MODE_TYPE_OBJECT:
				return createOnlineModeTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.OPTIMIZED_STATE_TYPE_OBJECT:
				return createOptimizedStateTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.OPTIONALITY_TYPE_OBJECT:
				return createOptionalityTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.ORDER_BY_TYPE_OBJECT:
				return createOrderByTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.OVERRIDE_BEHAVIOR_TYPE_OBJECT:
				return createOverrideBehaviorTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.PARAMETER_TYPE_OBJECT:
				return createParameterTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.PARAMETER_TYPE_OBJECT1:
				return createParameterTypeObject1FromString(eDataType, initialValue);
			case XmlaPackage.PARTITION_CURRENT_STORAGE_MODE_ENUM_TYPE_OBJECT:
				return createPartitionCurrentStorageModeEnumTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.PARTITION_MODES_OBJECT:
				return createPartitionModesObjectFromString(eDataType, initialValue);
			case XmlaPackage.PARTITION_STORAGE_MODE_ENUM_TYPE_OBJECT:
				return createPartitionStorageModeEnumTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.PERMISSION_SET_TYPE_OBJECT:
				return createPermissionSetTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.PERSISTENCE_TYPE_OBJECT:
				return createPersistenceTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.PERSISTENCE_TYPE_OBJECT1:
				return createPersistenceTypeObject1FromString(eDataType, initialValue);
			case XmlaPackage.PROCESSING_GROUP_TYPE_OBJECT:
				return createProcessingGroupTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.PROCESSING_MODE_TYPE_OBJECT:
				return createProcessingModeTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.PROCESSING_MODE_TYPE_OBJECT1:
				return createProcessingModeTypeObject1FromString(eDataType, initialValue);
			case XmlaPackage.PROCESSING_MODE_TYPE_OBJECT2:
				return createProcessingModeTypeObject2FromString(eDataType, initialValue);
			case XmlaPackage.PROCESSING_MODE_TYPE_OBJECT3:
				return createProcessingModeTypeObject3FromString(eDataType, initialValue);
			case XmlaPackage.PROCESSING_STATE_TYPE_OBJECT:
				return createProcessingStateTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.PROVIDER_TYPE_TYPE_OBJECT:
				return createProviderTypeTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.READ_DEFINITION_TYPE_OBJECT:
				return createReadDefinitionTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.READ_SOURCE_DATA_TYPE_OBJECT:
				return createReadSourceDataTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.READ_TYPE_OBJECT:
				return createReadTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.READ_TYPE_OBJECT1:
				return createReadTypeObject1FromString(eDataType, initialValue);
			case XmlaPackage.REFRESH_POLICY_TYPE_OBJECT:
				return createRefreshPolicyTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.REFRESH_POLICY_TYPE_OBJECT1:
				return createRefreshPolicyTypeObject1FromString(eDataType, initialValue);
			case XmlaPackage.RELATIONSHIP_TYPE_TYPE_OBJECT:
				return createRelationshipTypeTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.REPORTING_FIRST_MONTH_TYPE:
				return createReportingFirstMonthTypeFromString(eDataType, initialValue);
			case XmlaPackage.REPORTING_FIRST_WEEK_OF_MONTH_TYPE_OBJECT:
				return createReportingFirstWeekOfMonthTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.REPORTING_WEEK_TO_MONTH_PATTERN_TYPE_OBJECT:
				return createReportingWeekToMonthPatternTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.REQUEST_TYPE_TYPE_OBJECT:
				return createRequestTypeTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.RESPONSE_ENCODING_TYPE_OBJECT:
				return createResponseEncodingTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.RETENTION_MODES_OBJECT:
				return createRetentionModesObjectFromString(eDataType, initialValue);
			case XmlaPackage.ROOT_MEMBER_IF_TYPE_OBJECT:
				return createRootMemberIfTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.SAFETY_OPTIONS_TYPE_OBJECT:
				return createSafetyOptionsTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.SCOPE_OBJECT:
				return createScopeObjectFromString(eDataType, initialValue);
			case XmlaPackage.SCRIPT_CACHE_PROCESSING_MODE_TYPE_OBJECT:
				return createScriptCacheProcessingModeTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.SCRIPT_ERROR_HANDLING_MODE_TYPE_OBJECT:
				return createScriptErrorHandlingModeTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.SECURED_CELL_VALUE_TYPE_OBJECT:
				return createSecuredCellValueTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.SECURITY_TYPE_OBJECT:
				return createSecurityTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.SECURITY_TYPE_OBJECT1:
				return createSecurityTypeObject1FromString(eDataType, initialValue);
			case XmlaPackage.SHARE_DIMENSION_STORAGE_TYPE_OBJECT:
				return createShareDimensionStorageTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.SQL_QUERY_MODE_TYPE_OBJECT:
				return createSQLQueryModeTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.STATE_SUPPORT_TYPE_OBJECT:
				return createStateSupportTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.STATE_TYPE_OBJECT:
				return createStateTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.STATE_TYPE_OBJECT1:
				return createStateTypeObject1FromString(eDataType, initialValue);
			case XmlaPackage.STATE_TYPE_OBJECT2:
				return createStateTypeObject2FromString(eDataType, initialValue);
			case XmlaPackage.STATE_TYPE_OBJECT3:
				return createStateTypeObject3FromString(eDataType, initialValue);
			case XmlaPackage.STATE_TYPE_OBJECT4:
				return createStateTypeObject4FromString(eDataType, initialValue);
			case XmlaPackage.STATE_TYPE_OBJECT5:
				return createStateTypeObject5FromString(eDataType, initialValue);
			case XmlaPackage.STATE_TYPE_OBJECT6:
				return createStateTypeObject6FromString(eDataType, initialValue);
			case XmlaPackage.STORAGE_MODE_TYPE_OBJECT:
				return createStorageModeTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.SYNCHRONIZE_SECURITY_TYPE_OBJECT:
				return createSynchronizeSecurityTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.TARGET_TYPE_TYPE_OBJECT:
				return createTargetTypeTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.TARGET_TYPE_TYPE_OBJECT1:
				return createTargetTypeTypeObject1FromString(eDataType, initialValue);
			case XmlaPackage.TARGET_TYPE_TYPE_OBJECT2:
				return createTargetTypeTypeObject2FromString(eDataType, initialValue);
			case XmlaPackage.TRIMMING_TYPE_OBJECT:
				return createTrimmingTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.TYPE_TYPE_OBJECT:
				return createTypeTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.TYPE_TYPE_OBJECT1:
				return createTypeTypeObject1FromString(eDataType, initialValue);
			case XmlaPackage.TYPE_TYPE_OBJECT2:
				return createTypeTypeObject2FromString(eDataType, initialValue);
			case XmlaPackage.TYPE_TYPE_OBJECT3:
				return createTypeTypeObject3FromString(eDataType, initialValue);
			case XmlaPackage.TYPE_TYPE_OBJECT4:
				return createTypeTypeObject4FromString(eDataType, initialValue);
			case XmlaPackage.TYPE_TYPE_OBJECT5:
				return createTypeTypeObject5FromString(eDataType, initialValue);
			case XmlaPackage.TYPE_TYPE_OBJECT6:
				return createTypeTypeObject6FromString(eDataType, initialValue);
			case XmlaPackage.TYPE_TYPE_OBJECT7:
				return createTypeTypeObject7FromString(eDataType, initialValue);
			case XmlaPackage.TYPE_TYPE_OBJECT8:
				return createTypeTypeObject8FromString(eDataType, initialValue);
			case XmlaPackage.TYPE_TYPE_OBJECT9:
				return createTypeTypeObject9FromString(eDataType, initialValue);
			case XmlaPackage.TYPE_TYPE_OBJECT10:
				return createTypeTypeObject10FromString(eDataType, initialValue);
			case XmlaPackage.TYPE_TYPE_OBJECT11:
				return createTypeTypeObject11FromString(eDataType, initialValue);
			case XmlaPackage.TYPE_TYPE_OBJECT12:
				return createTypeTypeObject12FromString(eDataType, initialValue);
			case XmlaPackage.UNKNOWN_MEMBER_ENUM_TYPE_OBJECT:
				return createUnknownMemberEnumTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.UPDATE_ISOLATION_LEVEL_TYPE_OBJECT:
				return createUpdateIsolationLevelTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.USAGE_TYPE_OBJECT:
				return createUsageTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.USAGE_TYPE_OBJECT1:
				return createUsageTypeObject1FromString(eDataType, initialValue);
			case XmlaPackage.VALUENS_TYPE_OBJECT:
				return createValuensTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.VALUENS_TYPE_OBJECT1:
				return createValuensTypeObject1FromString(eDataType, initialValue);
			case XmlaPackage.VALUENS_TYPE_OBJECT2:
				return createValuensTypeObject2FromString(eDataType, initialValue);
			case XmlaPackage.VALUENS_TYPE_OBJECT3:
				return createValuensTypeObject3FromString(eDataType, initialValue);
			case XmlaPackage.VALUENS_TYPE_OBJECT4:
				return createValuensTypeObject4FromString(eDataType, initialValue);
			case XmlaPackage.VALUENS_TYPE_OBJECT5:
				return createValuensTypeObject5FromString(eDataType, initialValue);
			case XmlaPackage.VALUENS_TYPE_OBJECT6:
				return createValuensTypeObject6FromString(eDataType, initialValue);
			case XmlaPackage.VISIBILITY_TYPE_OBJECT:
				return createVisibilityTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.VISUAL_MODE_TYPE_OBJECT:
				return createVisualModeTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.WRITE_BACK_TABLE_CREATION_OBJECT:
				return createWriteBackTableCreationObjectFromString(eDataType, initialValue);
			case XmlaPackage.WRITE_TYPE_OBJECT:
				return createWriteTypeObjectFromString(eDataType, initialValue);
			case XmlaPackage.WRITE_TYPE_OBJECT1:
				return createWriteTypeObject1FromString(eDataType, initialValue);
			case XmlaPackage.WRITE_TYPE_OBJECT2:
				return createWriteTypeObject2FromString(eDataType, initialValue);
			case XmlaPackage.WRITE_TYPE_OBJECT3:
				return createWriteTypeObject3FromString(eDataType, initialValue);
			case XmlaPackage.WRITE_TYPE_OBJECT4:
				return createWriteTypeObject4FromString(eDataType, initialValue);
			case XmlaPackage.WRITE_TYPE_OBJECT5:
				return createWriteTypeObject5FromString(eDataType, initialValue);
			case XmlaPackage.WRITE_TYPE_OBJECT6:
				return createWriteTypeObject6FromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case XmlaPackage.ACCESS_TYPE:
				return convertAccessTypeToString(eDataType, instanceValue);
			case XmlaPackage.AGGREGATE_FUNCTION_TYPE:
				return convertAggregateFunctionTypeToString(eDataType, instanceValue);
			case XmlaPackage.AGGREGATION_FUNCTION_TYPE:
				return convertAggregationFunctionTypeToString(eDataType, instanceValue);
			case XmlaPackage.AGGREGATION_STORAGE_TYPE:
				return convertAggregationStorageTypeToString(eDataType, instanceValue);
			case XmlaPackage.AGGREGATION_TYPE_TYPE:
				return convertAggregationTypeTypeToString(eDataType, instanceValue);
			case XmlaPackage.AGGREGATION_USAGE_TYPE:
				return convertAggregationUsageTypeToString(eDataType, instanceValue);
			case XmlaPackage.ALGORITHM_TYPE:
				return convertAlgorithmTypeToString(eDataType, instanceValue);
			case XmlaPackage.ALL_MEMBER_AGGREGATION_USAGE_TYPE:
				return convertAllMemberAggregationUsageTypeToString(eDataType, instanceValue);
			case XmlaPackage.ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE_TYPE:
				return convertAttributeHierarchyOptimizedStateTypeToString(eDataType, instanceValue);
			case XmlaPackage.ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE_TYPE1:
				return convertAttributeHierarchyOptimizedStateType1ToString(eDataType, instanceValue);
			case XmlaPackage.AXIS_FORMAT_TYPE:
				return convertAxisFormatTypeToString(eDataType, instanceValue);
			case XmlaPackage.CACHE_MODE_TYPE:
				return convertCacheModeTypeToString(eDataType, instanceValue);
			case XmlaPackage.CALCULATION_TYPE_TYPE:
				return convertCalculationTypeTypeToString(eDataType, instanceValue);
			case XmlaPackage.CARDINALITY_TYPE:
				return convertCardinalityTypeToString(eDataType, instanceValue);
			case XmlaPackage.CARDINALITY_TYPE1:
				return convertCardinalityType1ToString(eDataType, instanceValue);
			case XmlaPackage.CATALOG_LOCATION_TYPE:
				return convertCatalogLocationTypeToString(eDataType, instanceValue);
			case XmlaPackage.CONNECTION_STRING_SECURITY_TYPE:
				return convertConnectionStringSecurityTypeToString(eDataType, instanceValue);
			case XmlaPackage.CONTENT_TYPE:
				return convertContentTypeToString(eDataType, instanceValue);
			case XmlaPackage.CONTENT_TYPE1:
				return convertContentType1ToString(eDataType, instanceValue);
			case XmlaPackage.CUBE_STORAGE_MODE_ENUM_TYPE:
				return convertCubeStorageModeEnumTypeToString(eDataType, instanceValue);
			case XmlaPackage.DATA_AGGREGATION_TYPE:
				return convertDataAggregationTypeToString(eDataType, instanceValue);
			case XmlaPackage.DATA_TYPE_TYPE:
				return convertDataTypeTypeToString(eDataType, instanceValue);
			case XmlaPackage.DATA_TYPE_TYPE1:
				return convertDataTypeType1ToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_CONCAT_NULL_BEHAVIOR_TYPE:
				return convertDbpropConcatNullBehaviorTypeToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_MSMD_AUTO_EXISTS_TYPE:
				return convertDbpropMsmdAutoExistsTypeToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_MSMD_COMPARE_CASE_SENSITIVE_STRING_FLAGS_TYPE:
				return convertDbpropMsmdCompareCaseSensitiveStringFlagsTypeToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_MSMD_MDX_COMPATIBILITY_TYPE:
				return convertDbpropMsmdMDXCompatibilityTypeToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_MSMD_SUBQUERIES_TYPE:
				return convertDbpropMsmdSubqueriesTypeToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_NULL_COLLATION_TYPE:
				return convertDbpropNullCollationTypeToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_OUTPUT_PARAMETER_AVAILABLE_TYPE:
				return convertDbpropOutputParameterAvailableTypeToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_PERSISTENT_ID_TYPE_TYPE:
				return convertDbpropPersistentIdTypeTypeToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_PREPARE_ABORT_BEHAVIOR_TYPE:
				return convertDbpropPrepareAbortBehaviorTypeToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_PREPARE_COMMIT_BEHAVIOR_TYPE:
				return convertDbpropPrepareCommitBehaviorTypeToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_QUOTED_IDENTIFIER_CASE_TYPE:
				return convertDbpropQuotedIdentifierCaseTypeToString(eDataType, instanceValue);
			case XmlaPackage.DIALECT_TYPE:
				return convertDialectTypeToString(eDataType, instanceValue);
			case XmlaPackage.DIMENSION_ATTRIBUTE_TYPE_ENUM_TYPE:
				return convertDimensionAttributeTypeEnumTypeToString(eDataType, instanceValue);
			case XmlaPackage.DIMENSION_CURRENT_STORAGE_MODE_ENUM_TYPE:
				return convertDimensionCurrentStorageModeEnumTypeToString(eDataType, instanceValue);
			case XmlaPackage.DISCRETIZATION_METHOD_TYPE:
				return convertDiscretizationMethodTypeToString(eDataType, instanceValue);
			case XmlaPackage.DURABILITY_GUARANTEE_TYPE:
				return convertDurabilityGuaranteeTypeToString(eDataType, instanceValue);
			case XmlaPackage.EDITION_TYPE:
				return convertEditionTypeToString(eDataType, instanceValue);
			case XmlaPackage.FISCAL_YEAR_NAME_TYPE:
				return convertFiscalYearNameTypeToString(eDataType, instanceValue);
			case XmlaPackage.FORMAT_TYPE:
				return convertFormatTypeToString(eDataType, instanceValue);
			case XmlaPackage.FORMAT_TYPE1:
				return convertFormatType1ToString(eDataType, instanceValue);
			case XmlaPackage.GROUPING_BEHAVIOR_TYPE:
				return convertGroupingBehaviorTypeToString(eDataType, instanceValue);
			case XmlaPackage.HIDE_MEMBER_IF_TYPE:
				return convertHideMemberIfTypeToString(eDataType, instanceValue);
			case XmlaPackage.HIERARCHY_UNIQUE_NAME_STYLE_TYPE:
				return convertHierarchyUniqueNameStyleTypeToString(eDataType, instanceValue);
			case XmlaPackage.INSTANCE_SELECTION_TYPE:
				return convertInstanceSelectionTypeToString(eDataType, instanceValue);
			case XmlaPackage.INVALID_XML_CHARACTERS_TYPE:
				return convertInvalidXmlCharactersTypeToString(eDataType, instanceValue);
			case XmlaPackage.INVOCATION_TYPE:
				return convertInvocationTypeToString(eDataType, instanceValue);
			case XmlaPackage.INVOCATION_TYPE1:
				return convertInvocationType1ToString(eDataType, instanceValue);
			case XmlaPackage.INVOCATION_TYPE2:
				return convertInvocationType2ToString(eDataType, instanceValue);
			case XmlaPackage.ISOLATION_TYPE:
				return convertIsolationTypeToString(eDataType, instanceValue);
			case XmlaPackage.KEY_DUPLICATE_TYPE:
				return convertKeyDuplicateTypeToString(eDataType, instanceValue);
			case XmlaPackage.KEY_ERROR_ACTION_TYPE:
				return convertKeyErrorActionTypeToString(eDataType, instanceValue);
			case XmlaPackage.KEY_ERROR_LIMIT_ACTION_TYPE:
				return convertKeyErrorLimitActionTypeToString(eDataType, instanceValue);
			case XmlaPackage.KEY_NOT_FOUND_TYPE:
				return convertKeyNotFoundTypeToString(eDataType, instanceValue);
			case XmlaPackage.MATERIALIZATION_TYPE:
				return convertMaterializationTypeToString(eDataType, instanceValue);
			case XmlaPackage.MDPROP_AGGREGATE_CELL_UPDATE_TYPE:
				return convertMdpropAggregateCellUpdateTypeToString(eDataType, instanceValue);
			case XmlaPackage.MDPROP_FLATTENING_SUPPORT_TYPE:
				return convertMdpropFlatteningSupportTypeToString(eDataType, instanceValue);
			case XmlaPackage.MDPROP_MDX_NON_MEASURE_EXPRESSIONS_TYPE:
				return convertMdpropMdxNonMeasureExpressionsTypeToString(eDataType, instanceValue);
			case XmlaPackage.MDPROP_MDX_RANGE_ROWSET_TYPE:
				return convertMdpropMdxRangeRowsetTypeToString(eDataType, instanceValue);
			case XmlaPackage.MDPROP_MDX_SLICER_TYPE:
				return convertMdpropMdxSlicerTypeToString(eDataType, instanceValue);
			case XmlaPackage.MDX_MISSING_MEMBER_MODE_TYPE:
				return convertMdxMissingMemberModeTypeToString(eDataType, instanceValue);
			case XmlaPackage.MDX_MISSING_MEMBER_MODE_TYPE1:
				return convertMdxMissingMemberModeType1ToString(eDataType, instanceValue);
			case XmlaPackage.MDX_SUPPORT_TYPE:
				return convertMDXSupportTypeToString(eDataType, instanceValue);
			case XmlaPackage.MEASURE_GROUP_STORAGE_MODE_ENUM_TYPE:
				return convertMeasureGroupStorageModeEnumTypeToString(eDataType, instanceValue);
			case XmlaPackage.MEMBERS_WITH_DATA_TYPE:
				return convertMembersWithDataTypeToString(eDataType, instanceValue);
			case XmlaPackage.MEMBER_UNIQUE_NAME_STYLE_TYPE:
				return convertMemberUniqueNameStyleTypeToString(eDataType, instanceValue);
			case XmlaPackage.MEMORY_LOCKING_MODE_TYPE:
				return convertMemoryLockingModeTypeToString(eDataType, instanceValue);
			case XmlaPackage.MODE_TYPE:
				return convertModeTypeToString(eDataType, instanceValue);
			case XmlaPackage.NOTIFICATION_TECHNIQUE_TYPE:
				return convertNotificationTechniqueTypeToString(eDataType, instanceValue);
			case XmlaPackage.NOTIFICATION_TECHNIQUE_TYPE1:
				return convertNotificationTechniqueType1ToString(eDataType, instanceValue);
			case XmlaPackage.NULL_KEY_CONVERTED_TO_UNKNOWN_TYPE:
				return convertNullKeyConvertedToUnknownTypeToString(eDataType, instanceValue);
			case XmlaPackage.NULL_KEY_NOT_ALLOWED_TYPE:
				return convertNullKeyNotAllowedTypeToString(eDataType, instanceValue);
			case XmlaPackage.NULL_PROCESSING_TYPE:
				return convertNullProcessingTypeToString(eDataType, instanceValue);
			case XmlaPackage.OBJECT_EXPANSION:
				return convertObjectExpansionToString(eDataType, instanceValue);
			case XmlaPackage.ONLINE_MODE_TYPE:
				return convertOnlineModeTypeToString(eDataType, instanceValue);
			case XmlaPackage.OPTIMIZED_STATE_TYPE:
				return convertOptimizedStateTypeToString(eDataType, instanceValue);
			case XmlaPackage.OPTIONALITY_TYPE:
				return convertOptionalityTypeToString(eDataType, instanceValue);
			case XmlaPackage.ORDER_BY_TYPE:
				return convertOrderByTypeToString(eDataType, instanceValue);
			case XmlaPackage.OVERRIDE_BEHAVIOR_TYPE:
				return convertOverrideBehaviorTypeToString(eDataType, instanceValue);
			case XmlaPackage.PARAMETER_TYPE:
				return convertParameterTypeToString(eDataType, instanceValue);
			case XmlaPackage.PARAMETER_TYPE1:
				return convertParameterType1ToString(eDataType, instanceValue);
			case XmlaPackage.PARTITION_CURRENT_STORAGE_MODE_ENUM_TYPE:
				return convertPartitionCurrentStorageModeEnumTypeToString(eDataType, instanceValue);
			case XmlaPackage.PARTITION_MODES:
				return convertPartitionModesToString(eDataType, instanceValue);
			case XmlaPackage.PARTITION_STORAGE_MODE_ENUM_TYPE:
				return convertPartitionStorageModeEnumTypeToString(eDataType, instanceValue);
			case XmlaPackage.PERMISSION_SET_TYPE:
				return convertPermissionSetTypeToString(eDataType, instanceValue);
			case XmlaPackage.PERSISTENCE_TYPE:
				return convertPersistenceTypeToString(eDataType, instanceValue);
			case XmlaPackage.PERSISTENCE_TYPE1:
				return convertPersistenceType1ToString(eDataType, instanceValue);
			case XmlaPackage.PROCESSING_GROUP_TYPE:
				return convertProcessingGroupTypeToString(eDataType, instanceValue);
			case XmlaPackage.PROCESSING_MODE_TYPE:
				return convertProcessingModeTypeToString(eDataType, instanceValue);
			case XmlaPackage.PROCESSING_MODE_TYPE1:
				return convertProcessingModeType1ToString(eDataType, instanceValue);
			case XmlaPackage.PROCESSING_MODE_TYPE2:
				return convertProcessingModeType2ToString(eDataType, instanceValue);
			case XmlaPackage.PROCESSING_MODE_TYPE3:
				return convertProcessingModeType3ToString(eDataType, instanceValue);
			case XmlaPackage.PROCESSING_STATE_TYPE:
				return convertProcessingStateTypeToString(eDataType, instanceValue);
			case XmlaPackage.PROVIDER_TYPE_TYPE:
				return convertProviderTypeTypeToString(eDataType, instanceValue);
			case XmlaPackage.READ_DEFINITION_TYPE:
				return convertReadDefinitionTypeToString(eDataType, instanceValue);
			case XmlaPackage.READ_SOURCE_DATA_TYPE:
				return convertReadSourceDataTypeToString(eDataType, instanceValue);
			case XmlaPackage.READ_TYPE:
				return convertReadTypeToString(eDataType, instanceValue);
			case XmlaPackage.READ_TYPE1:
				return convertReadType1ToString(eDataType, instanceValue);
			case XmlaPackage.REFRESH_POLICY_TYPE:
				return convertRefreshPolicyTypeToString(eDataType, instanceValue);
			case XmlaPackage.REFRESH_POLICY_TYPE1:
				return convertRefreshPolicyType1ToString(eDataType, instanceValue);
			case XmlaPackage.RELATIONSHIP_TYPE_TYPE:
				return convertRelationshipTypeTypeToString(eDataType, instanceValue);
			case XmlaPackage.REPORTING_FIRST_WEEK_OF_MONTH_TYPE:
				return convertReportingFirstWeekOfMonthTypeToString(eDataType, instanceValue);
			case XmlaPackage.REPORTING_WEEK_TO_MONTH_PATTERN_TYPE:
				return convertReportingWeekToMonthPatternTypeToString(eDataType, instanceValue);
			case XmlaPackage.REQUEST_TYPE_TYPE:
				return convertRequestTypeTypeToString(eDataType, instanceValue);
			case XmlaPackage.RESPONSE_ENCODING_TYPE:
				return convertResponseEncodingTypeToString(eDataType, instanceValue);
			case XmlaPackage.RETENTION_MODES:
				return convertRetentionModesToString(eDataType, instanceValue);
			case XmlaPackage.ROOT_MEMBER_IF_TYPE:
				return convertRootMemberIfTypeToString(eDataType, instanceValue);
			case XmlaPackage.SAFETY_OPTIONS_TYPE:
				return convertSafetyOptionsTypeToString(eDataType, instanceValue);
			case XmlaPackage.SCOPE:
				return convertScopeToString(eDataType, instanceValue);
			case XmlaPackage.SCRIPT_CACHE_PROCESSING_MODE_TYPE:
				return convertScriptCacheProcessingModeTypeToString(eDataType, instanceValue);
			case XmlaPackage.SCRIPT_ERROR_HANDLING_MODE_TYPE:
				return convertScriptErrorHandlingModeTypeToString(eDataType, instanceValue);
			case XmlaPackage.SECURED_CELL_VALUE_TYPE:
				return convertSecuredCellValueTypeToString(eDataType, instanceValue);
			case XmlaPackage.SECURITY_TYPE:
				return convertSecurityTypeToString(eDataType, instanceValue);
			case XmlaPackage.SECURITY_TYPE1:
				return convertSecurityType1ToString(eDataType, instanceValue);
			case XmlaPackage.SHARE_DIMENSION_STORAGE_TYPE:
				return convertShareDimensionStorageTypeToString(eDataType, instanceValue);
			case XmlaPackage.SQL_QUERY_MODE_TYPE:
				return convertSQLQueryModeTypeToString(eDataType, instanceValue);
			case XmlaPackage.STATE_SUPPORT_TYPE:
				return convertStateSupportTypeToString(eDataType, instanceValue);
			case XmlaPackage.STATE_TYPE:
				return convertStateTypeToString(eDataType, instanceValue);
			case XmlaPackage.STATE_TYPE1:
				return convertStateType1ToString(eDataType, instanceValue);
			case XmlaPackage.STATE_TYPE2:
				return convertStateType2ToString(eDataType, instanceValue);
			case XmlaPackage.STATE_TYPE3:
				return convertStateType3ToString(eDataType, instanceValue);
			case XmlaPackage.STATE_TYPE4:
				return convertStateType4ToString(eDataType, instanceValue);
			case XmlaPackage.STATE_TYPE5:
				return convertStateType5ToString(eDataType, instanceValue);
			case XmlaPackage.STATE_TYPE6:
				return convertStateType6ToString(eDataType, instanceValue);
			case XmlaPackage.STORAGE_MODE_TYPE1:
				return convertStorageModeType1ToString(eDataType, instanceValue);
			case XmlaPackage.SYNCHRONIZE_SECURITY_TYPE:
				return convertSynchronizeSecurityTypeToString(eDataType, instanceValue);
			case XmlaPackage.TARGET_TYPE_TYPE:
				return convertTargetTypeTypeToString(eDataType, instanceValue);
			case XmlaPackage.TARGET_TYPE_TYPE1:
				return convertTargetTypeType1ToString(eDataType, instanceValue);
			case XmlaPackage.TARGET_TYPE_TYPE2:
				return convertTargetTypeType2ToString(eDataType, instanceValue);
			case XmlaPackage.TRIMMING_TYPE:
				return convertTrimmingTypeToString(eDataType, instanceValue);
			case XmlaPackage.TYPE_TYPE:
				return convertTypeTypeToString(eDataType, instanceValue);
			case XmlaPackage.TYPE_TYPE1:
				return convertTypeType1ToString(eDataType, instanceValue);
			case XmlaPackage.TYPE_TYPE2:
				return convertTypeType2ToString(eDataType, instanceValue);
			case XmlaPackage.TYPE_TYPE3:
				return convertTypeType3ToString(eDataType, instanceValue);
			case XmlaPackage.TYPE_TYPE4:
				return convertTypeType4ToString(eDataType, instanceValue);
			case XmlaPackage.TYPE_TYPE5:
				return convertTypeType5ToString(eDataType, instanceValue);
			case XmlaPackage.TYPE_TYPE7:
				return convertTypeType7ToString(eDataType, instanceValue);
			case XmlaPackage.TYPE_TYPE8:
				return convertTypeType8ToString(eDataType, instanceValue);
			case XmlaPackage.TYPE_TYPE9:
				return convertTypeType9ToString(eDataType, instanceValue);
			case XmlaPackage.TYPE_TYPE10:
				return convertTypeType10ToString(eDataType, instanceValue);
			case XmlaPackage.TYPE_TYPE11:
				return convertTypeType11ToString(eDataType, instanceValue);
			case XmlaPackage.TYPE_TYPE12:
				return convertTypeType12ToString(eDataType, instanceValue);
			case XmlaPackage.TYPE_TYPE13:
				return convertTypeType13ToString(eDataType, instanceValue);
			case XmlaPackage.UNKNOWN_MEMBER_ENUM_TYPE:
				return convertUnknownMemberEnumTypeToString(eDataType, instanceValue);
			case XmlaPackage.UPDATE_ISOLATION_LEVEL_TYPE:
				return convertUpdateIsolationLevelTypeToString(eDataType, instanceValue);
			case XmlaPackage.USAGE_TYPE:
				return convertUsageTypeToString(eDataType, instanceValue);
			case XmlaPackage.USAGE_TYPE1:
				return convertUsageType1ToString(eDataType, instanceValue);
			case XmlaPackage.VALUENS_TYPE:
				return convertValuensTypeToString(eDataType, instanceValue);
			case XmlaPackage.VALUENS_TYPE1:
				return convertValuensType1ToString(eDataType, instanceValue);
			case XmlaPackage.VALUENS_TYPE2:
				return convertValuensType2ToString(eDataType, instanceValue);
			case XmlaPackage.VALUENS_TYPE3:
				return convertValuensType3ToString(eDataType, instanceValue);
			case XmlaPackage.VALUENS_TYPE4:
				return convertValuensType4ToString(eDataType, instanceValue);
			case XmlaPackage.VALUENS_TYPE5:
				return convertValuensType5ToString(eDataType, instanceValue);
			case XmlaPackage.VALUENS_TYPE6:
				return convertValuensType6ToString(eDataType, instanceValue);
			case XmlaPackage.VISIBILITY_TYPE:
				return convertVisibilityTypeToString(eDataType, instanceValue);
			case XmlaPackage.VISUAL_MODE_TYPE:
				return convertVisualModeTypeToString(eDataType, instanceValue);
			case XmlaPackage.WRITE_BACK_TABLE_CREATION:
				return convertWriteBackTableCreationToString(eDataType, instanceValue);
			case XmlaPackage.WRITE_TYPE:
				return convertWriteTypeToString(eDataType, instanceValue);
			case XmlaPackage.WRITE_TYPE1:
				return convertWriteType1ToString(eDataType, instanceValue);
			case XmlaPackage.WRITE_TYPE2:
				return convertWriteType2ToString(eDataType, instanceValue);
			case XmlaPackage.WRITE_TYPE3:
				return convertWriteType3ToString(eDataType, instanceValue);
			case XmlaPackage.WRITE_TYPE4:
				return convertWriteType4ToString(eDataType, instanceValue);
			case XmlaPackage.WRITE_TYPE5:
				return convertWriteType5ToString(eDataType, instanceValue);
			case XmlaPackage.WRITE_TYPE6:
				return convertWriteType6ToString(eDataType, instanceValue);
			case XmlaPackage.ACCESS_TYPE_OBJECT:
				return convertAccessTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.AGGREGATE_FUNCTION_TYPE_OBJECT:
				return convertAggregateFunctionTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.AGGREGATION_FUNCTION_TYPE_OBJECT:
				return convertAggregationFunctionTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.AGGREGATION_STORAGE_TYPE_OBJECT:
				return convertAggregationStorageTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.AGGREGATION_TYPE_TYPE_OBJECT:
				return convertAggregationTypeTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.AGGREGATION_USAGE_TYPE_OBJECT:
				return convertAggregationUsageTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.ALGORITHM_TYPE_OBJECT:
				return convertAlgorithmTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.ALL_MEMBER_AGGREGATION_USAGE_TYPE_OBJECT:
				return convertAllMemberAggregationUsageTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE_TYPE_OBJECT:
				return convertAttributeHierarchyOptimizedStateTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE_TYPE_OBJECT1:
				return convertAttributeHierarchyOptimizedStateTypeObject1ToString(eDataType, instanceValue);
			case XmlaPackage.AXIS_FORMAT_TYPE_OBJECT:
				return convertAxisFormatTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.CACHE_MODE_TYPE_OBJECT:
				return convertCacheModeTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.CALCULATION_TYPE_TYPE_OBJECT:
				return convertCalculationTypeTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.CARDINALITY_TYPE_OBJECT:
				return convertCardinalityTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.CARDINALITY_TYPE_OBJECT1:
				return convertCardinalityTypeObject1ToString(eDataType, instanceValue);
			case XmlaPackage.CATALOG_LOCATION_TYPE_OBJECT:
				return convertCatalogLocationTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.CONNECTION_STRING_SECURITY_TYPE_OBJECT:
				return convertConnectionStringSecurityTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.CONTENT_TYPE_OBJECT:
				return convertContentTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.CONTENT_TYPE_OBJECT1:
				return convertContentTypeObject1ToString(eDataType, instanceValue);
			case XmlaPackage.CUBE_STORAGE_MODE_ENUM_TYPE_OBJECT:
				return convertCubeStorageModeEnumTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.DATA_AGGREGATION_TYPE_OBJECT:
				return convertDataAggregationTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.DATA_TYPE_TYPE_OBJECT:
				return convertDataTypeTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.DATA_TYPE_TYPE_OBJECT1:
				return convertDataTypeTypeObject1ToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_CONCAT_NULL_BEHAVIOR_TYPE_OBJECT:
				return convertDbpropConcatNullBehaviorTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_MSMD_AUTO_EXISTS_TYPE_OBJECT:
				return convertDbpropMsmdAutoExistsTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_MSMD_COMPARE_CASE_SENSITIVE_STRING_FLAGS_TYPE_OBJECT:
				return convertDbpropMsmdCompareCaseSensitiveStringFlagsTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_MSMD_MDX_COMPATIBILITY_TYPE_OBJECT:
				return convertDbpropMsmdMDXCompatibilityTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_MSMD_SUBQUERIES_TYPE_OBJECT:
				return convertDbpropMsmdSubqueriesTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_NULL_COLLATION_TYPE_OBJECT:
				return convertDbpropNullCollationTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_OUTPUT_PARAMETER_AVAILABLE_TYPE_OBJECT:
				return convertDbpropOutputParameterAvailableTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_PERSISTENT_ID_TYPE_TYPE_OBJECT:
				return convertDbpropPersistentIdTypeTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_PREPARE_ABORT_BEHAVIOR_TYPE_OBJECT:
				return convertDbpropPrepareAbortBehaviorTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_PREPARE_COMMIT_BEHAVIOR_TYPE_OBJECT:
				return convertDbpropPrepareCommitBehaviorTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.DBPROP_QUOTED_IDENTIFIER_CASE_TYPE_OBJECT:
				return convertDbpropQuotedIdentifierCaseTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.DIALECT_TYPE_OBJECT:
				return convertDialectTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.DIMENSION_ATTRIBUTE_TYPE_ENUM_TYPE_OBJECT:
				return convertDimensionAttributeTypeEnumTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.DIMENSION_CURRENT_STORAGE_MODE_ENUM_TYPE_OBJECT:
				return convertDimensionCurrentStorageModeEnumTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.DISCRETIZATION_METHOD_TYPE_OBJECT:
				return convertDiscretizationMethodTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.DURABILITY_GUARANTEE_TYPE_OBJECT:
				return convertDurabilityGuaranteeTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.EDITION_TYPE_OBJECT:
				return convertEditionTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.FIRST_DAY_OF_WEEK_TYPE:
				return convertFirstDayOfWeekTypeToString(eDataType, instanceValue);
			case XmlaPackage.FISCAL_FIRST_DAY_OF_MONTH_TYPE:
				return convertFiscalFirstDayOfMonthTypeToString(eDataType, instanceValue);
			case XmlaPackage.FISCAL_FIRST_MONTH_TYPE:
				return convertFiscalFirstMonthTypeToString(eDataType, instanceValue);
			case XmlaPackage.FISCAL_YEAR_NAME_TYPE_OBJECT:
				return convertFiscalYearNameTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.FORMAT_TYPE_OBJECT:
				return convertFormatTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.FORMAT_TYPE_OBJECT1:
				return convertFormatTypeObject1ToString(eDataType, instanceValue);
			case XmlaPackage.GROUPING_BEHAVIOR_TYPE_OBJECT:
				return convertGroupingBehaviorTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.HIDE_MEMBER_IF_TYPE_OBJECT:
				return convertHideMemberIfTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.HIERARCHY_UNIQUE_NAME_STYLE_TYPE_OBJECT:
				return convertHierarchyUniqueNameStyleTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.ID_TYPE:
				return convertIDTypeToString(eDataType, instanceValue);
			case XmlaPackage.ID_TYPE1:
				return convertIDType1ToString(eDataType, instanceValue);
			case XmlaPackage.INSTANCE_SELECTION_TYPE_OBJECT:
				return convertInstanceSelectionTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.INVALID_XML_CHARACTERS_TYPE_OBJECT:
				return convertInvalidXmlCharactersTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.INVOCATION_TYPE_OBJECT:
				return convertInvocationTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.INVOCATION_TYPE_OBJECT1:
				return convertInvocationTypeObject1ToString(eDataType, instanceValue);
			case XmlaPackage.INVOCATION_TYPE_OBJECT2:
				return convertInvocationTypeObject2ToString(eDataType, instanceValue);
			case XmlaPackage.ISOLATION_TYPE_OBJECT:
				return convertIsolationTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.KEY_DUPLICATE_TYPE_OBJECT:
				return convertKeyDuplicateTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.KEY_ERROR_ACTION_TYPE_OBJECT:
				return convertKeyErrorActionTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.KEY_ERROR_LIMIT_ACTION_TYPE_OBJECT:
				return convertKeyErrorLimitActionTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.KEY_NOT_FOUND_TYPE_OBJECT:
				return convertKeyNotFoundTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.MANUFACTURING_EXTRA_MONTH_QUARTER_TYPE:
				return convertManufacturingExtraMonthQuarterTypeToString(eDataType, instanceValue);
			case XmlaPackage.MANUFACTURING_FIRST_MONTH_TYPE:
				return convertManufacturingFirstMonthTypeToString(eDataType, instanceValue);
			case XmlaPackage.MANUFACTURING_FIRST_WEEK_OF_MONTH_TYPE:
				return convertManufacturingFirstWeekOfMonthTypeToString(eDataType, instanceValue);
			case XmlaPackage.MATERIALIZATION_TYPE_OBJECT:
				return convertMaterializationTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.MDPROP_AGGREGATE_CELL_UPDATE_TYPE_OBJECT:
				return convertMdpropAggregateCellUpdateTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.MDPROP_FLATTENING_SUPPORT_TYPE_OBJECT:
				return convertMdpropFlatteningSupportTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.MDPROP_MDX_NON_MEASURE_EXPRESSIONS_TYPE_OBJECT:
				return convertMdpropMdxNonMeasureExpressionsTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.MDPROP_MDX_RANGE_ROWSET_TYPE_OBJECT:
				return convertMdpropMdxRangeRowsetTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.MDPROP_MDX_SLICER_TYPE_OBJECT:
				return convertMdpropMdxSlicerTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.MDX_MISSING_MEMBER_MODE_TYPE_OBJECT:
				return convertMdxMissingMemberModeTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.MDX_MISSING_MEMBER_MODE_TYPE_OBJECT1:
				return convertMdxMissingMemberModeTypeObject1ToString(eDataType, instanceValue);
			case XmlaPackage.MDX_SUPPORT_TYPE_OBJECT:
				return convertMDXSupportTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.MEASURE_GROUP_STORAGE_MODE_ENUM_TYPE_OBJECT:
				return convertMeasureGroupStorageModeEnumTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.MEMBERS_WITH_DATA_TYPE_OBJECT:
				return convertMembersWithDataTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.MEMBER_UNIQUE_NAME_STYLE_TYPE_OBJECT:
				return convertMemberUniqueNameStyleTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.MEMORY_LOCKING_MODE_TYPE_OBJECT:
				return convertMemoryLockingModeTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.MODE_TYPE_OBJECT:
				return convertModeTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.NOTIFICATION_TECHNIQUE_TYPE_OBJECT:
				return convertNotificationTechniqueTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.NOTIFICATION_TECHNIQUE_TYPE_OBJECT1:
				return convertNotificationTechniqueTypeObject1ToString(eDataType, instanceValue);
			case XmlaPackage.NULL_KEY_CONVERTED_TO_UNKNOWN_TYPE_OBJECT:
				return convertNullKeyConvertedToUnknownTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.NULL_KEY_NOT_ALLOWED_TYPE_OBJECT:
				return convertNullKeyNotAllowedTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.NULL_PROCESSING_TYPE_OBJECT:
				return convertNullProcessingTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.OBJECT_EXPANSION_OBJECT:
				return convertObjectExpansionObjectToString(eDataType, instanceValue);
			case XmlaPackage.ONLINE_MODE_TYPE_OBJECT:
				return convertOnlineModeTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.OPTIMIZED_STATE_TYPE_OBJECT:
				return convertOptimizedStateTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.OPTIONALITY_TYPE_OBJECT:
				return convertOptionalityTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.ORDER_BY_TYPE_OBJECT:
				return convertOrderByTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.OVERRIDE_BEHAVIOR_TYPE_OBJECT:
				return convertOverrideBehaviorTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.PARAMETER_TYPE_OBJECT:
				return convertParameterTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.PARAMETER_TYPE_OBJECT1:
				return convertParameterTypeObject1ToString(eDataType, instanceValue);
			case XmlaPackage.PARTITION_CURRENT_STORAGE_MODE_ENUM_TYPE_OBJECT:
				return convertPartitionCurrentStorageModeEnumTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.PARTITION_MODES_OBJECT:
				return convertPartitionModesObjectToString(eDataType, instanceValue);
			case XmlaPackage.PARTITION_STORAGE_MODE_ENUM_TYPE_OBJECT:
				return convertPartitionStorageModeEnumTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.PERMISSION_SET_TYPE_OBJECT:
				return convertPermissionSetTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.PERSISTENCE_TYPE_OBJECT:
				return convertPersistenceTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.PERSISTENCE_TYPE_OBJECT1:
				return convertPersistenceTypeObject1ToString(eDataType, instanceValue);
			case XmlaPackage.PROCESSING_GROUP_TYPE_OBJECT:
				return convertProcessingGroupTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.PROCESSING_MODE_TYPE_OBJECT:
				return convertProcessingModeTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.PROCESSING_MODE_TYPE_OBJECT1:
				return convertProcessingModeTypeObject1ToString(eDataType, instanceValue);
			case XmlaPackage.PROCESSING_MODE_TYPE_OBJECT2:
				return convertProcessingModeTypeObject2ToString(eDataType, instanceValue);
			case XmlaPackage.PROCESSING_MODE_TYPE_OBJECT3:
				return convertProcessingModeTypeObject3ToString(eDataType, instanceValue);
			case XmlaPackage.PROCESSING_STATE_TYPE_OBJECT:
				return convertProcessingStateTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.PROVIDER_TYPE_TYPE_OBJECT:
				return convertProviderTypeTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.READ_DEFINITION_TYPE_OBJECT:
				return convertReadDefinitionTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.READ_SOURCE_DATA_TYPE_OBJECT:
				return convertReadSourceDataTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.READ_TYPE_OBJECT:
				return convertReadTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.READ_TYPE_OBJECT1:
				return convertReadTypeObject1ToString(eDataType, instanceValue);
			case XmlaPackage.REFRESH_POLICY_TYPE_OBJECT:
				return convertRefreshPolicyTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.REFRESH_POLICY_TYPE_OBJECT1:
				return convertRefreshPolicyTypeObject1ToString(eDataType, instanceValue);
			case XmlaPackage.RELATIONSHIP_TYPE_TYPE_OBJECT:
				return convertRelationshipTypeTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.REPORTING_FIRST_MONTH_TYPE:
				return convertReportingFirstMonthTypeToString(eDataType, instanceValue);
			case XmlaPackage.REPORTING_FIRST_WEEK_OF_MONTH_TYPE_OBJECT:
				return convertReportingFirstWeekOfMonthTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.REPORTING_WEEK_TO_MONTH_PATTERN_TYPE_OBJECT:
				return convertReportingWeekToMonthPatternTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.REQUEST_TYPE_TYPE_OBJECT:
				return convertRequestTypeTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.RESPONSE_ENCODING_TYPE_OBJECT:
				return convertResponseEncodingTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.RETENTION_MODES_OBJECT:
				return convertRetentionModesObjectToString(eDataType, instanceValue);
			case XmlaPackage.ROOT_MEMBER_IF_TYPE_OBJECT:
				return convertRootMemberIfTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.SAFETY_OPTIONS_TYPE_OBJECT:
				return convertSafetyOptionsTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.SCOPE_OBJECT:
				return convertScopeObjectToString(eDataType, instanceValue);
			case XmlaPackage.SCRIPT_CACHE_PROCESSING_MODE_TYPE_OBJECT:
				return convertScriptCacheProcessingModeTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.SCRIPT_ERROR_HANDLING_MODE_TYPE_OBJECT:
				return convertScriptErrorHandlingModeTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.SECURED_CELL_VALUE_TYPE_OBJECT:
				return convertSecuredCellValueTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.SECURITY_TYPE_OBJECT:
				return convertSecurityTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.SECURITY_TYPE_OBJECT1:
				return convertSecurityTypeObject1ToString(eDataType, instanceValue);
			case XmlaPackage.SHARE_DIMENSION_STORAGE_TYPE_OBJECT:
				return convertShareDimensionStorageTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.SQL_QUERY_MODE_TYPE_OBJECT:
				return convertSQLQueryModeTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.STATE_SUPPORT_TYPE_OBJECT:
				return convertStateSupportTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.STATE_TYPE_OBJECT:
				return convertStateTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.STATE_TYPE_OBJECT1:
				return convertStateTypeObject1ToString(eDataType, instanceValue);
			case XmlaPackage.STATE_TYPE_OBJECT2:
				return convertStateTypeObject2ToString(eDataType, instanceValue);
			case XmlaPackage.STATE_TYPE_OBJECT3:
				return convertStateTypeObject3ToString(eDataType, instanceValue);
			case XmlaPackage.STATE_TYPE_OBJECT4:
				return convertStateTypeObject4ToString(eDataType, instanceValue);
			case XmlaPackage.STATE_TYPE_OBJECT5:
				return convertStateTypeObject5ToString(eDataType, instanceValue);
			case XmlaPackage.STATE_TYPE_OBJECT6:
				return convertStateTypeObject6ToString(eDataType, instanceValue);
			case XmlaPackage.STORAGE_MODE_TYPE_OBJECT:
				return convertStorageModeTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.SYNCHRONIZE_SECURITY_TYPE_OBJECT:
				return convertSynchronizeSecurityTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.TARGET_TYPE_TYPE_OBJECT:
				return convertTargetTypeTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.TARGET_TYPE_TYPE_OBJECT1:
				return convertTargetTypeTypeObject1ToString(eDataType, instanceValue);
			case XmlaPackage.TARGET_TYPE_TYPE_OBJECT2:
				return convertTargetTypeTypeObject2ToString(eDataType, instanceValue);
			case XmlaPackage.TRIMMING_TYPE_OBJECT:
				return convertTrimmingTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.TYPE_TYPE_OBJECT:
				return convertTypeTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.TYPE_TYPE_OBJECT1:
				return convertTypeTypeObject1ToString(eDataType, instanceValue);
			case XmlaPackage.TYPE_TYPE_OBJECT2:
				return convertTypeTypeObject2ToString(eDataType, instanceValue);
			case XmlaPackage.TYPE_TYPE_OBJECT3:
				return convertTypeTypeObject3ToString(eDataType, instanceValue);
			case XmlaPackage.TYPE_TYPE_OBJECT4:
				return convertTypeTypeObject4ToString(eDataType, instanceValue);
			case XmlaPackage.TYPE_TYPE_OBJECT5:
				return convertTypeTypeObject5ToString(eDataType, instanceValue);
			case XmlaPackage.TYPE_TYPE_OBJECT6:
				return convertTypeTypeObject6ToString(eDataType, instanceValue);
			case XmlaPackage.TYPE_TYPE_OBJECT7:
				return convertTypeTypeObject7ToString(eDataType, instanceValue);
			case XmlaPackage.TYPE_TYPE_OBJECT8:
				return convertTypeTypeObject8ToString(eDataType, instanceValue);
			case XmlaPackage.TYPE_TYPE_OBJECT9:
				return convertTypeTypeObject9ToString(eDataType, instanceValue);
			case XmlaPackage.TYPE_TYPE_OBJECT10:
				return convertTypeTypeObject10ToString(eDataType, instanceValue);
			case XmlaPackage.TYPE_TYPE_OBJECT11:
				return convertTypeTypeObject11ToString(eDataType, instanceValue);
			case XmlaPackage.TYPE_TYPE_OBJECT12:
				return convertTypeTypeObject12ToString(eDataType, instanceValue);
			case XmlaPackage.UNKNOWN_MEMBER_ENUM_TYPE_OBJECT:
				return convertUnknownMemberEnumTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.UPDATE_ISOLATION_LEVEL_TYPE_OBJECT:
				return convertUpdateIsolationLevelTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.USAGE_TYPE_OBJECT:
				return convertUsageTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.USAGE_TYPE_OBJECT1:
				return convertUsageTypeObject1ToString(eDataType, instanceValue);
			case XmlaPackage.VALUENS_TYPE_OBJECT:
				return convertValuensTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.VALUENS_TYPE_OBJECT1:
				return convertValuensTypeObject1ToString(eDataType, instanceValue);
			case XmlaPackage.VALUENS_TYPE_OBJECT2:
				return convertValuensTypeObject2ToString(eDataType, instanceValue);
			case XmlaPackage.VALUENS_TYPE_OBJECT3:
				return convertValuensTypeObject3ToString(eDataType, instanceValue);
			case XmlaPackage.VALUENS_TYPE_OBJECT4:
				return convertValuensTypeObject4ToString(eDataType, instanceValue);
			case XmlaPackage.VALUENS_TYPE_OBJECT5:
				return convertValuensTypeObject5ToString(eDataType, instanceValue);
			case XmlaPackage.VALUENS_TYPE_OBJECT6:
				return convertValuensTypeObject6ToString(eDataType, instanceValue);
			case XmlaPackage.VISIBILITY_TYPE_OBJECT:
				return convertVisibilityTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.VISUAL_MODE_TYPE_OBJECT:
				return convertVisualModeTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.WRITE_BACK_TABLE_CREATION_OBJECT:
				return convertWriteBackTableCreationObjectToString(eDataType, instanceValue);
			case XmlaPackage.WRITE_TYPE_OBJECT:
				return convertWriteTypeObjectToString(eDataType, instanceValue);
			case XmlaPackage.WRITE_TYPE_OBJECT1:
				return convertWriteTypeObject1ToString(eDataType, instanceValue);
			case XmlaPackage.WRITE_TYPE_OBJECT2:
				return convertWriteTypeObject2ToString(eDataType, instanceValue);
			case XmlaPackage.WRITE_TYPE_OBJECT3:
				return convertWriteTypeObject3ToString(eDataType, instanceValue);
			case XmlaPackage.WRITE_TYPE_OBJECT4:
				return convertWriteTypeObject4ToString(eDataType, instanceValue);
			case XmlaPackage.WRITE_TYPE_OBJECT5:
				return convertWriteTypeObject5ToString(eDataType, instanceValue);
			case XmlaPackage.WRITE_TYPE_OBJECT6:
				return convertWriteTypeObject6ToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account createAccount() {
		AccountImpl account = new AccountImpl();
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountsType createAccountsType() {
		AccountsTypeImpl accountsType = new AccountsTypeImpl();
		return accountsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionsType createActionsType() {
		ActionsTypeImpl actionsType = new ActionsTypeImpl();
		return actionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionsType1 createActionsType1() {
		ActionsType1Impl actionsType1 = new ActionsType1Impl();
		return actionsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType createActionType() {
		ActionTypeImpl actionType = new ActionTypeImpl();
		return actionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aggregation createAggregation() {
		AggregationImpl aggregation = new AggregationImpl();
		return aggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationAttribute createAggregationAttribute() {
		AggregationAttributeImpl aggregationAttribute = new AggregationAttributeImpl();
		return aggregationAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationDesign createAggregationDesign() {
		AggregationDesignImpl aggregationDesign = new AggregationDesignImpl();
		return aggregationDesign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationDesignAttribute createAggregationDesignAttribute() {
		AggregationDesignAttributeImpl aggregationDesignAttribute = new AggregationDesignAttributeImpl();
		return aggregationDesignAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationDesignDimension createAggregationDesignDimension() {
		AggregationDesignDimensionImpl aggregationDesignDimension = new AggregationDesignDimensionImpl();
		return aggregationDesignDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationDesignsType createAggregationDesignsType() {
		AggregationDesignsTypeImpl aggregationDesignsType = new AggregationDesignsTypeImpl();
		return aggregationDesignsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationDimension createAggregationDimension() {
		AggregationDimensionImpl aggregationDimension = new AggregationDimensionImpl();
		return aggregationDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationInstance createAggregationInstance() {
		AggregationInstanceImpl aggregationInstance = new AggregationInstanceImpl();
		return aggregationInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationInstanceAttribute createAggregationInstanceAttribute() {
		AggregationInstanceAttributeImpl aggregationInstanceAttribute = new AggregationInstanceAttributeImpl();
		return aggregationInstanceAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationInstanceDimension createAggregationInstanceDimension() {
		AggregationInstanceDimensionImpl aggregationInstanceDimension = new AggregationInstanceDimensionImpl();
		return aggregationInstanceDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationInstanceMeasure createAggregationInstanceMeasure() {
		AggregationInstanceMeasureImpl aggregationInstanceMeasure = new AggregationInstanceMeasureImpl();
		return aggregationInstanceMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationInstancesType createAggregationInstancesType() {
		AggregationInstancesTypeImpl aggregationInstancesType = new AggregationInstancesTypeImpl();
		return aggregationInstancesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationsType createAggregationsType() {
		AggregationsTypeImpl aggregationsType = new AggregationsTypeImpl();
		return aggregationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgorithmParameter createAlgorithmParameter() {
		AlgorithmParameterImpl algorithmParameter = new AlgorithmParameterImpl();
		return algorithmParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgorithmParametersType createAlgorithmParametersType() {
		AlgorithmParametersTypeImpl algorithmParametersType = new AlgorithmParametersTypeImpl();
		return algorithmParametersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasesType createAliasesType() {
		AliasesTypeImpl aliasesType = new AliasesTypeImpl();
		return aliasesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllMemberTranslationsType createAllMemberTranslationsType() {
		AllMemberTranslationsTypeImpl allMemberTranslationsType = new AllMemberTranslationsTypeImpl();
		return allMemberTranslationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alter createAlter() {
		AlterImpl alter = new AlterImpl();
		return alter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndOrType createAndOrType() {
		AndOrTypeImpl andOrType = new AndOrTypeImpl();
		return andOrType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType createAnnotationsType() {
		AnnotationsTypeImpl annotationsType = new AnnotationsTypeImpl();
		return annotationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType1 createAnnotationsType1() {
		AnnotationsType1Impl annotationsType1 = new AnnotationsType1Impl();
		return annotationsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType2 createAnnotationsType2() {
		AnnotationsType2Impl annotationsType2 = new AnnotationsType2Impl();
		return annotationsType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType3 createAnnotationsType3() {
		AnnotationsType3Impl annotationsType3 = new AnnotationsType3Impl();
		return annotationsType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType4 createAnnotationsType4() {
		AnnotationsType4Impl annotationsType4 = new AnnotationsType4Impl();
		return annotationsType4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType5 createAnnotationsType5() {
		AnnotationsType5Impl annotationsType5 = new AnnotationsType5Impl();
		return annotationsType5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType6 createAnnotationsType6() {
		AnnotationsType6Impl annotationsType6 = new AnnotationsType6Impl();
		return annotationsType6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType7 createAnnotationsType7() {
		AnnotationsType7Impl annotationsType7 = new AnnotationsType7Impl();
		return annotationsType7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType8 createAnnotationsType8() {
		AnnotationsType8Impl annotationsType8 = new AnnotationsType8Impl();
		return annotationsType8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType9 createAnnotationsType9() {
		AnnotationsType9Impl annotationsType9 = new AnnotationsType9Impl();
		return annotationsType9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType10 createAnnotationsType10() {
		AnnotationsType10Impl annotationsType10 = new AnnotationsType10Impl();
		return annotationsType10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType11 createAnnotationsType11() {
		AnnotationsType11Impl annotationsType11 = new AnnotationsType11Impl();
		return annotationsType11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType12 createAnnotationsType12() {
		AnnotationsType12Impl annotationsType12 = new AnnotationsType12Impl();
		return annotationsType12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType13 createAnnotationsType13() {
		AnnotationsType13Impl annotationsType13 = new AnnotationsType13Impl();
		return annotationsType13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType14 createAnnotationsType14() {
		AnnotationsType14Impl annotationsType14 = new AnnotationsType14Impl();
		return annotationsType14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType15 createAnnotationsType15() {
		AnnotationsType15Impl annotationsType15 = new AnnotationsType15Impl();
		return annotationsType15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType16 createAnnotationsType16() {
		AnnotationsType16Impl annotationsType16 = new AnnotationsType16Impl();
		return annotationsType16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType17 createAnnotationsType17() {
		AnnotationsType17Impl annotationsType17 = new AnnotationsType17Impl();
		return annotationsType17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType18 createAnnotationsType18() {
		AnnotationsType18Impl annotationsType18 = new AnnotationsType18Impl();
		return annotationsType18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType19 createAnnotationsType19() {
		AnnotationsType19Impl annotationsType19 = new AnnotationsType19Impl();
		return annotationsType19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType20 createAnnotationsType20() {
		AnnotationsType20Impl annotationsType20 = new AnnotationsType20Impl();
		return annotationsType20;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType21 createAnnotationsType21() {
		AnnotationsType21Impl annotationsType21 = new AnnotationsType21Impl();
		return annotationsType21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType22 createAnnotationsType22() {
		AnnotationsType22Impl annotationsType22 = new AnnotationsType22Impl();
		return annotationsType22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType23 createAnnotationsType23() {
		AnnotationsType23Impl annotationsType23 = new AnnotationsType23Impl();
		return annotationsType23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType24 createAnnotationsType24() {
		AnnotationsType24Impl annotationsType24 = new AnnotationsType24Impl();
		return annotationsType24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType25 createAnnotationsType25() {
		AnnotationsType25Impl annotationsType25 = new AnnotationsType25Impl();
		return annotationsType25;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType26 createAnnotationsType26() {
		AnnotationsType26Impl annotationsType26 = new AnnotationsType26Impl();
		return annotationsType26;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType27 createAnnotationsType27() {
		AnnotationsType27Impl annotationsType27 = new AnnotationsType27Impl();
		return annotationsType27;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType28 createAnnotationsType28() {
		AnnotationsType28Impl annotationsType28 = new AnnotationsType28Impl();
		return annotationsType28;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType29 createAnnotationsType29() {
		AnnotationsType29Impl annotationsType29 = new AnnotationsType29Impl();
		return annotationsType29;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType30 createAnnotationsType30() {
		AnnotationsType30Impl annotationsType30 = new AnnotationsType30Impl();
		return annotationsType30;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType31 createAnnotationsType31() {
		AnnotationsType31Impl annotationsType31 = new AnnotationsType31Impl();
		return annotationsType31;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType32 createAnnotationsType32() {
		AnnotationsType32Impl annotationsType32 = new AnnotationsType32Impl();
		return annotationsType32;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType33 createAnnotationsType33() {
		AnnotationsType33Impl annotationsType33 = new AnnotationsType33Impl();
		return annotationsType33;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType34 createAnnotationsType34() {
		AnnotationsType34Impl annotationsType34 = new AnnotationsType34Impl();
		return annotationsType34;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType35 createAnnotationsType35() {
		AnnotationsType35Impl annotationsType35 = new AnnotationsType35Impl();
		return annotationsType35;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType36 createAnnotationsType36() {
		AnnotationsType36Impl annotationsType36 = new AnnotationsType36Impl();
		return annotationsType36;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType37 createAnnotationsType37() {
		AnnotationsType37Impl annotationsType37 = new AnnotationsType37Impl();
		return annotationsType37;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType38 createAnnotationsType38() {
		AnnotationsType38Impl annotationsType38 = new AnnotationsType38Impl();
		return annotationsType38;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType39 createAnnotationsType39() {
		AnnotationsType39Impl annotationsType39 = new AnnotationsType39Impl();
		return annotationsType39;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType40 createAnnotationsType40() {
		AnnotationsType40Impl annotationsType40 = new AnnotationsType40Impl();
		return annotationsType40;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType41 createAnnotationsType41() {
		AnnotationsType41Impl annotationsType41 = new AnnotationsType41Impl();
		return annotationsType41;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType42 createAnnotationsType42() {
		AnnotationsType42Impl annotationsType42 = new AnnotationsType42Impl();
		return annotationsType42;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType43 createAnnotationsType43() {
		AnnotationsType43Impl annotationsType43 = new AnnotationsType43Impl();
		return annotationsType43;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType44 createAnnotationsType44() {
		AnnotationsType44Impl annotationsType44 = new AnnotationsType44Impl();
		return annotationsType44;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType45 createAnnotationsType45() {
		AnnotationsType45Impl annotationsType45 = new AnnotationsType45Impl();
		return annotationsType45;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType46 createAnnotationsType46() {
		AnnotationsType46Impl annotationsType46 = new AnnotationsType46Impl();
		return annotationsType46;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType47 createAnnotationsType47() {
		AnnotationsType47Impl annotationsType47 = new AnnotationsType47Impl();
		return annotationsType47;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType48 createAnnotationsType48() {
		AnnotationsType48Impl annotationsType48 = new AnnotationsType48Impl();
		return annotationsType48;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType49 createAnnotationsType49() {
		AnnotationsType49Impl annotationsType49 = new AnnotationsType49Impl();
		return annotationsType49;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType50 createAnnotationsType50() {
		AnnotationsType50Impl annotationsType50 = new AnnotationsType50Impl();
		return annotationsType50;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType51 createAnnotationsType51() {
		AnnotationsType51Impl annotationsType51 = new AnnotationsType51Impl();
		return annotationsType51;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType52 createAnnotationsType52() {
		AnnotationsType52Impl annotationsType52 = new AnnotationsType52Impl();
		return annotationsType52;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType53 createAnnotationsType53() {
		AnnotationsType53Impl annotationsType53 = new AnnotationsType53Impl();
		return annotationsType53;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType54 createAnnotationsType54() {
		AnnotationsType54Impl annotationsType54 = new AnnotationsType54Impl();
		return annotationsType54;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType55 createAnnotationsType55() {
		AnnotationsType55Impl annotationsType55 = new AnnotationsType55Impl();
		return annotationsType55;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType56 createAnnotationsType56() {
		AnnotationsType56Impl annotationsType56 = new AnnotationsType56Impl();
		return annotationsType56;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssembliesType createAssembliesType() {
		AssembliesTypeImpl assembliesType = new AssembliesTypeImpl();
		return assembliesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssembliesType1 createAssembliesType1() {
		AssembliesType1Impl assembliesType1 = new AssembliesType1Impl();
		return assembliesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attach createAttach() {
		AttachImpl attach = new AttachImpl();
		return attach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeAllMemberTranslationsType createAttributeAllMemberTranslationsType() {
		AttributeAllMemberTranslationsTypeImpl attributeAllMemberTranslationsType = new AttributeAllMemberTranslationsTypeImpl();
		return attributeAllMemberTranslationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeBinding createAttributeBinding() {
		AttributeBindingImpl attributeBinding = new AttributeBindingImpl();
		return attributeBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeInsertUpdate createAttributeInsertUpdate() {
		AttributeInsertUpdateImpl attributeInsertUpdate = new AttributeInsertUpdateImpl();
		return attributeInsertUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributePermission createAttributePermission() {
		AttributePermissionImpl attributePermission = new AttributePermissionImpl();
		return attributePermission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributePermissionsType createAttributePermissionsType() {
		AttributePermissionsTypeImpl attributePermissionsType = new AttributePermissionsTypeImpl();
		return attributePermissionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributePermissionsType1 createAttributePermissionsType1() {
		AttributePermissionsType1Impl attributePermissionsType1 = new AttributePermissionsType1Impl();
		return attributePermissionsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeRelationship createAttributeRelationship() {
		AttributeRelationshipImpl attributeRelationship = new AttributeRelationshipImpl();
		return attributeRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeRelationshipsType createAttributeRelationshipsType() {
		AttributeRelationshipsTypeImpl attributeRelationshipsType = new AttributeRelationshipsTypeImpl();
		return attributeRelationshipsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesType createAttributesType() {
		AttributesTypeImpl attributesType = new AttributesTypeImpl();
		return attributesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesType1 createAttributesType1() {
		AttributesType1Impl attributesType1 = new AttributesType1Impl();
		return attributesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesType2 createAttributesType2() {
		AttributesType2Impl attributesType2 = new AttributesType2Impl();
		return attributesType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesType3 createAttributesType3() {
		AttributesType3Impl attributesType3 = new AttributesType3Impl();
		return attributesType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesType4 createAttributesType4() {
		AttributesType4Impl attributesType4 = new AttributesType4Impl();
		return attributesType4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesType5 createAttributesType5() {
		AttributesType5Impl attributesType5 = new AttributesType5Impl();
		return attributesType5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesType6 createAttributesType6() {
		AttributesType6Impl attributesType6 = new AttributesType6Impl();
		return attributesType6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesType7 createAttributesType7() {
		AttributesType7Impl attributesType7 = new AttributesType7Impl();
		return attributesType7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesType8 createAttributesType8() {
		AttributesType8Impl attributesType8 = new AttributesType8Impl();
		return attributesType8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeTranslation createAttributeTranslation() {
		AttributeTranslationImpl attributeTranslation = new AttributeTranslationImpl();
		return attributeTranslation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Backup createBackup() {
		BackupImpl backup = new BackupImpl();
		return backup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Batch createBatch() {
		BatchImpl batch = new BatchImpl();
		return batch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeginSessionType createBeginSessionType() {
		BeginSessionTypeImpl beginSessionType = new BeginSessionTypeImpl();
		return beginSessionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeginTransaction createBeginTransaction() {
		BeginTransactionImpl beginTransaction = new BeginTransactionImpl();
		return beginTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bindings createBindings() {
		BindingsImpl bindings = new BindingsImpl();
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolBinop createBoolBinop() {
		BoolBinopImpl boolBinop = new BoolBinopImpl();
		return boolBinop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpr createBooleanExpr() {
		BooleanExprImpl booleanExpr = new BooleanExprImpl();
		return booleanExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculatedMeasureBinding createCalculatedMeasureBinding() {
		CalculatedMeasureBindingImpl calculatedMeasureBinding = new CalculatedMeasureBindingImpl();
		return calculatedMeasureBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculationPropertiesType createCalculationPropertiesType() {
		CalculationPropertiesTypeImpl calculationPropertiesType = new CalculationPropertiesTypeImpl();
		return calculationPropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculationProperty createCalculationProperty() {
		CalculationPropertyImpl calculationProperty = new CalculationPropertyImpl();
		return calculationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculationsType createCalculationsType() {
		CalculationsTypeImpl calculationsType = new CalculationsTypeImpl();
		return calculationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cancel createCancel() {
		CancelImpl cancel = new CancelImpl();
		return cancel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cell createCell() {
		CellImpl cell = new CellImpl();
		return cell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellPermission createCellPermission() {
		CellPermissionImpl cellPermission = new CellPermissionImpl();
		return cellPermission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellPermissionsType createCellPermissionsType() {
		CellPermissionsTypeImpl cellPermissionsType = new CellPermissionsTypeImpl();
		return cellPermissionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifiedColumnsType createClassifiedColumnsType() {
		ClassifiedColumnsTypeImpl classifiedColumnsType = new ClassifiedColumnsTypeImpl();
		return classifiedColumnsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearCache createClearCache() {
		ClearCacheImpl clearCache = new ClearCacheImpl();
		return clearCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearResultType createClearResultType() {
		ClearResultTypeImpl clearResultType = new ClearResultTypeImpl();
		return clearResultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloneDatabase createCloneDatabase() {
		CloneDatabaseImpl cloneDatabase = new CloneDatabaseImpl();
		return cloneDatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClrAssembly createClrAssembly() {
		ClrAssemblyImpl clrAssembly = new ClrAssemblyImpl();
		return clrAssembly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClrAssemblyFile createClrAssemblyFile() {
		ClrAssemblyFileImpl clrAssemblyFile = new ClrAssemblyFileImpl();
		return clrAssemblyFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnBinding createColumnBinding() {
		ColumnBindingImpl columnBinding = new ColumnBindingImpl();
		return columnBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnsType createColumnsType() {
		ColumnsTypeImpl columnsType = new ColumnsTypeImpl();
		return columnsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnsType1 createColumnsType1() {
		ColumnsType1Impl columnsType1 = new ColumnsType1Impl();
		return columnsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnsType2 createColumnsType2() {
		ColumnsType2Impl columnsType2 = new ColumnsType2Impl();
		return columnsType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnsType3 createColumnsType3() {
		ColumnsType3Impl columnsType3 = new ColumnsType3Impl();
		return columnsType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnsType4 createColumnsType4() {
		ColumnsType4Impl columnsType4 = new ColumnsType4Impl();
		return columnsType4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnType createColumnType() {
		ColumnTypeImpl columnType = new ColumnTypeImpl();
		return columnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComAssembly createComAssembly() {
		ComAssemblyImpl comAssembly = new ComAssemblyImpl();
		return comAssembly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command createCommand() {
		CommandImpl command = new CommandImpl();
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandsType createCommandsType() {
		CommandsTypeImpl commandsType = new CommandsTypeImpl();
		return commandsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommitTransaction createCommitTransaction() {
		CommitTransactionImpl commitTransaction = new CommitTransactionImpl();
		return commitTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparatorType createComparatorType() {
		ComparatorTypeImpl comparatorType = new ComparatorTypeImpl();
		return comparatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Create createCreate() {
		CreateImpl create = new CreateImpl();
		return create;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cube createCube() {
		CubeImpl cube = new CubeImpl();
		return cube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CubeAttribute createCubeAttribute() {
		CubeAttributeImpl cubeAttribute = new CubeAttributeImpl();
		return cubeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CubeAttributeBinding createCubeAttributeBinding() {
		CubeAttributeBindingImpl cubeAttributeBinding = new CubeAttributeBindingImpl();
		return cubeAttributeBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CubeDimension createCubeDimension() {
		CubeDimensionImpl cubeDimension = new CubeDimensionImpl();
		return cubeDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CubeDimensionBinding createCubeDimensionBinding() {
		CubeDimensionBindingImpl cubeDimensionBinding = new CubeDimensionBindingImpl();
		return cubeDimensionBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CubeDimensionPermission createCubeDimensionPermission() {
		CubeDimensionPermissionImpl cubeDimensionPermission = new CubeDimensionPermissionImpl();
		return cubeDimensionPermission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CubeHierarchy createCubeHierarchy() {
		CubeHierarchyImpl cubeHierarchy = new CubeHierarchyImpl();
		return cubeHierarchy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CubePermission createCubePermission() {
		CubePermissionImpl cubePermission = new CubePermissionImpl();
		return cubePermission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CubePermissionsType createCubePermissionsType() {
		CubePermissionsTypeImpl cubePermissionsType = new CubePermissionsTypeImpl();
		return cubePermissionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CubesType createCubesType() {
		CubesTypeImpl cubesType = new CubesTypeImpl();
		return cubesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentStorageModeType createCurrentStorageModeType() {
		CurrentStorageModeTypeImpl currentStorageModeType = new CurrentStorageModeTypeImpl();
		return currentStorageModeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentStorageModeType1 createCurrentStorageModeType1() {
		CurrentStorageModeType1Impl currentStorageModeType1 = new CurrentStorageModeType1Impl();
		return currentStorageModeType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomRollupColumnType createCustomRollupColumnType() {
		CustomRollupColumnTypeImpl customRollupColumnType = new CustomRollupColumnTypeImpl();
		return customRollupColumnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomRollupPropertiesColumnType createCustomRollupPropertiesColumnType() {
		CustomRollupPropertiesColumnTypeImpl customRollupPropertiesColumnType = new CustomRollupPropertiesColumnTypeImpl();
		return customRollupPropertiesColumnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database createDatabase() {
		DatabaseImpl database = new DatabaseImpl();
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabasePermission createDatabasePermission() {
		DatabasePermissionImpl databasePermission = new DatabasePermissionImpl();
		return databasePermission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabasePermissionsType createDatabasePermissionsType() {
		DatabasePermissionsTypeImpl databasePermissionsType = new DatabasePermissionsTypeImpl();
		return databasePermissionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabasesType createDatabasesType() {
		DatabasesTypeImpl databasesType = new DatabasesTypeImpl();
		return databasesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBlock createDataBlock() {
		DataBlockImpl dataBlock = new DataBlockImpl();
		return dataBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataItem createDataItem() {
		DataItemImpl dataItem = new DataItemImpl();
		return dataItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataMiningMeasureGroupDimension createDataMiningMeasureGroupDimension() {
		DataMiningMeasureGroupDimensionImpl dataMiningMeasureGroupDimension = new DataMiningMeasureGroupDimensionImpl();
		return dataMiningMeasureGroupDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourcePermission createDataSourcePermission() {
		DataSourcePermissionImpl dataSourcePermission = new DataSourcePermissionImpl();
		return dataSourcePermission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourcePermissionsType createDataSourcePermissionsType() {
		DataSourcePermissionsTypeImpl dataSourcePermissionsType = new DataSourcePermissionsTypeImpl();
		return dataSourcePermissionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourcesType createDataSourcesType() {
		DataSourcesTypeImpl dataSourcesType = new DataSourcesTypeImpl();
		return dataSourcesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourceView createDataSourceView() {
		DataSourceViewImpl dataSourceView = new DataSourceViewImpl();
		return dataSourceView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourceViewBinding createDataSourceViewBinding() {
		DataSourceViewBindingImpl dataSourceViewBinding = new DataSourceViewBindingImpl();
		return dataSourceViewBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourceViewsType createDataSourceViewsType() {
		DataSourceViewsTypeImpl dataSourceViewsType = new DataSourceViewsTypeImpl();
		return dataSourceViewsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType1 createDataType1() {
		DataType1Impl dataType1 = new DataType1Impl();
		return dataType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType2 createDataType2() {
		DataType2Impl dataType2 = new DataType2Impl();
		return dataType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType3 createDataType3() {
		DataType3Impl dataType3 = new DataType3Impl();
		return dataType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBCC createDBCC() {
		DBCCImpl dbcc = new DBCCImpl();
		return dbcc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DegenerateMeasureGroupDimension createDegenerateMeasureGroupDimension() {
		DegenerateMeasureGroupDimensionImpl degenerateMeasureGroupDimension = new DegenerateMeasureGroupDimensionImpl();
		return degenerateMeasureGroupDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delete createDelete() {
		DeleteImpl delete = new DeleteImpl();
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignAggregations createDesignAggregations() {
		DesignAggregationsImpl designAggregations = new DesignAggregationsImpl();
		return designAggregations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Detach createDetach() {
		DetachImpl detach = new DetachImpl();
		return detach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension createDimension() {
		DimensionImpl dimension = new DimensionImpl();
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionAttribute createDimensionAttribute() {
		DimensionAttributeImpl dimensionAttribute = new DimensionAttributeImpl();
		return dimensionAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionBinding createDimensionBinding() {
		DimensionBindingImpl dimensionBinding = new DimensionBindingImpl();
		return dimensionBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionPermission createDimensionPermission() {
		DimensionPermissionImpl dimensionPermission = new DimensionPermissionImpl();
		return dimensionPermission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionPermissionsType createDimensionPermissionsType() {
		DimensionPermissionsTypeImpl dimensionPermissionsType = new DimensionPermissionsTypeImpl();
		return dimensionPermissionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionPermissionsType1 createDimensionPermissionsType1() {
		DimensionPermissionsType1Impl dimensionPermissionsType1 = new DimensionPermissionsType1Impl();
		return dimensionPermissionsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionsType createDimensionsType() {
		DimensionsTypeImpl dimensionsType = new DimensionsTypeImpl();
		return dimensionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionsType1 createDimensionsType1() {
		DimensionsType1Impl dimensionsType1 = new DimensionsType1Impl();
		return dimensionsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionsType2 createDimensionsType2() {
		DimensionsType2Impl dimensionsType2 = new DimensionsType2Impl();
		return dimensionsType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionsType3 createDimensionsType3() {
		DimensionsType3Impl dimensionsType3 = new DimensionsType3Impl();
		return dimensionsType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionsType4 createDimensionsType4() {
		DimensionsType4Impl dimensionsType4 = new DimensionsType4Impl();
		return dimensionsType4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionsType5 createDimensionsType5() {
		DimensionsType5Impl dimensionsType5 = new DimensionsType5Impl();
		return dimensionsType5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionsType6 createDimensionsType6() {
		DimensionsType6Impl dimensionsType6 = new DimensionsType6Impl();
		return dimensionsType6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscoverResponseType createDiscoverResponseType() {
		DiscoverResponseTypeImpl discoverResponseType = new DiscoverResponseTypeImpl();
		return discoverResponseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscoverType createDiscoverType() {
		DiscoverTypeImpl discoverType = new DiscoverTypeImpl();
		return discoverType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrillThroughAction createDrillThroughAction() {
		DrillThroughActionImpl drillThroughAction = new DrillThroughActionImpl();
		return drillThroughAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Drop createDrop() {
		DropImpl drop = new DropImpl();
		return drop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSVTableBinding createDSVTableBinding() {
		DSVTableBindingImpl dsvTableBinding = new DSVTableBindingImpl();
		return dsvTableBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndOfDataType createEndOfDataType() {
		EndOfDataTypeImpl endOfDataType = new EndOfDataTypeImpl();
		return endOfDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndSessionType createEndSessionType() {
		EndSessionTypeImpl endSessionType = new EndSessionTypeImpl();
		return endSessionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorConfiguration createErrorConfiguration() {
		ErrorConfigurationImpl errorConfiguration = new ErrorConfigurationImpl();
		return errorConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventCategoryType createEventCategoryType() {
		EventCategoryTypeImpl eventCategoryType = new EventCategoryTypeImpl();
		return eventCategoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventColumn createEventColumn() {
		EventColumnImpl eventColumn = new EventColumnImpl();
		return eventColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventColumnID createEventColumnID() {
		EventColumnIDImpl eventColumnID = new EventColumnIDImpl();
		return eventColumnID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventColumnListType createEventColumnListType() {
		EventColumnListTypeImpl eventColumnListType = new EventColumnListTypeImpl();
		return eventColumnListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventColumnSubclassListType createEventColumnSubclassListType() {
		EventColumnSubclassListTypeImpl eventColumnSubclassListType = new EventColumnSubclassListTypeImpl();
		return eventColumnSubclassListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventColumnSubclassType createEventColumnSubclassType() {
		EventColumnSubclassTypeImpl eventColumnSubclassType = new EventColumnSubclassTypeImpl();
		return eventColumnSubclassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventListType createEventListType() {
		EventListTypeImpl eventListType = new EventListTypeImpl();
		return eventListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventSessionType createEventSessionType() {
		EventSessionTypeImpl eventSessionType = new EventSessionTypeImpl();
		return eventSessionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventsType createEventsType() {
		EventsTypeImpl eventsType = new EventsTypeImpl();
		return eventsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType createEventType() {
		EventTypeImpl eventType = new EventTypeImpl();
		return eventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType1 createEventType1() {
		EventType1Impl eventType1 = new EventType1Impl();
		return eventType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTypeType createEventTypeType() {
		EventTypeTypeImpl eventTypeType = new EventTypeTypeImpl();
		return eventTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecuteParameter createExecuteParameter() {
		ExecuteParameterImpl executeParameter = new ExecuteParameterImpl();
		return executeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecuteResponseType createExecuteResponseType() {
		ExecuteResponseTypeImpl executeResponseType = new ExecuteResponseTypeImpl();
		return executeResponseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecuteType createExecuteType() {
		ExecuteTypeImpl executeType = new ExecuteTypeImpl();
		return executeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilesType createFilesType() {
		FilesTypeImpl filesType = new FilesTypeImpl();
		return filesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Folder createFolder() {
		FolderImpl folder = new FolderImpl();
		return folder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoldingParameters createFoldingParameters() {
		FoldingParametersImpl foldingParameters = new FoldingParametersImpl();
		return foldingParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeignKeyColumnsType createForeignKeyColumnsType() {
		ForeignKeyColumnsTypeImpl foreignKeyColumnsType = new ForeignKeyColumnsTypeImpl();
		return foreignKeyColumnsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeignKeyColumnsType1 createForeignKeyColumnsType1() {
		ForeignKeyColumnsType1Impl foreignKeyColumnsType1 = new ForeignKeyColumnsType1Impl();
		return foreignKeyColumnsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeignKeyColumnType createForeignKeyColumnType() {
		ForeignKeyColumnTypeImpl foreignKeyColumnType = new ForeignKeyColumnTypeImpl();
		return foreignKeyColumnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalType createGlobalType() {
		GlobalTypeImpl globalType = new GlobalTypeImpl();
		return globalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupsType createGroupsType() {
		GroupsTypeImpl groupsType = new GroupsTypeImpl();
		return groupsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HierarchiesType createHierarchiesType() {
		HierarchiesTypeImpl hierarchiesType = new HierarchiesTypeImpl();
		return hierarchiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HierarchiesType1 createHierarchiesType1() {
		HierarchiesType1Impl hierarchiesType1 = new HierarchiesType1Impl();
		return hierarchiesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HierarchiesType2 createHierarchiesType2() {
		HierarchiesType2Impl hierarchiesType2 = new HierarchiesType2Impl();
		return hierarchiesType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hierarchy createHierarchy() {
		HierarchyImpl hierarchy = new HierarchyImpl();
		return hierarchy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageLoad createImageLoad() {
		ImageLoadImpl imageLoad = new ImageLoadImpl();
		return imageLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageSave createImageSave() {
		ImageSaveImpl imageSave = new ImageSaveImpl();
		return imageSave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncrementalProcessingNotification createIncrementalProcessingNotification() {
		IncrementalProcessingNotificationImpl incrementalProcessingNotification = new IncrementalProcessingNotificationImpl();
		return incrementalProcessingNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncrementalProcessingNotificationsType createIncrementalProcessingNotificationsType() {
		IncrementalProcessingNotificationsTypeImpl incrementalProcessingNotificationsType = new IncrementalProcessingNotificationsTypeImpl();
		return incrementalProcessingNotificationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritedBinding createInheritedBinding() {
		InheritedBindingImpl inheritedBinding = new InheritedBindingImpl();
		return inheritedBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Insert createInsert() {
		InsertImpl insert = new InsertImpl();
		return insert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeepResultType createKeepResultType() {
		KeepResultTypeImpl keepResultType = new KeepResultTypeImpl();
		return keepResultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyColumnsType createKeyColumnsType() {
		KeyColumnsTypeImpl keyColumnsType = new KeyColumnsTypeImpl();
		return keyColumnsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyColumnsType1 createKeyColumnsType1() {
		KeyColumnsType1Impl keyColumnsType1 = new KeyColumnsType1Impl();
		return keyColumnsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyColumnsType2 createKeyColumnsType2() {
		KeyColumnsType2Impl keyColumnsType2 = new KeyColumnsType2Impl();
		return keyColumnsType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyColumnsType3 createKeyColumnsType3() {
		KeyColumnsType3Impl keyColumnsType3 = new KeyColumnsType3Impl();
		return keyColumnsType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyColumnsType4 createKeyColumnsType4() {
		KeyColumnsType4Impl keyColumnsType4 = new KeyColumnsType4Impl();
		return keyColumnsType4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyColumnType createKeyColumnType() {
		KeyColumnTypeImpl keyColumnType = new KeyColumnTypeImpl();
		return keyColumnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeysType createKeysType() {
		KeysTypeImpl keysType = new KeysTypeImpl();
		return keysType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeysType1 createKeysType1() {
		KeysType1Impl keysType1 = new KeysType1Impl();
		return keysType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kpi createKpi() {
		KpiImpl kpi = new KpiImpl();
		return kpi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KpisType createKpisType() {
		KpisTypeImpl kpisType = new KpisTypeImpl();
		return kpisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KpisType1 createKpisType1() {
		KpisType1Impl kpisType1 = new KpisType1Impl();
		return kpisType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level createLevel() {
		LevelImpl level = new LevelImpl();
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelsType createLevelsType() {
		LevelsTypeImpl levelsType = new LevelsTypeImpl();
		return levelsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationBackup createLocationBackup() {
		LocationBackupImpl locationBackup = new LocationBackupImpl();
		return locationBackup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationsType createLocationsType() {
		LocationsTypeImpl locationsType = new LocationsTypeImpl();
		return locationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationsType1 createLocationsType1() {
		LocationsType1Impl locationsType1 = new LocationsType1Impl();
		return locationsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationsType2 createLocationsType2() {
		LocationsType2Impl locationsType2 = new LocationsType2Impl();
		return locationsType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lock createLock() {
		LockImpl lock = new LockImpl();
		return lock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MajorObject createMajorObject() {
		MajorObjectImpl majorObject = new MajorObjectImpl();
		return majorObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManyToManyMeasureGroupDimension createManyToManyMeasureGroupDimension() {
		ManyToManyMeasureGroupDimensionImpl manyToManyMeasureGroupDimension = new ManyToManyMeasureGroupDimensionImpl();
		return manyToManyMeasureGroupDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdxScript createMdxScript() {
		MdxScriptImpl mdxScript = new MdxScriptImpl();
		return mdxScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdxScriptsType createMdxScriptsType() {
		MdxScriptsTypeImpl mdxScriptsType = new MdxScriptsTypeImpl();
		return mdxScriptsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure createMeasure() {
		MeasureImpl measure = new MeasureImpl();
		return measure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureBinding createMeasureBinding() {
		MeasureBindingImpl measureBinding = new MeasureBindingImpl();
		return measureBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureGroup createMeasureGroup() {
		MeasureGroupImpl measureGroup = new MeasureGroupImpl();
		return measureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureGroupAttribute createMeasureGroupAttribute() {
		MeasureGroupAttributeImpl measureGroupAttribute = new MeasureGroupAttributeImpl();
		return measureGroupAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureGroupBinding createMeasureGroupBinding() {
		MeasureGroupBindingImpl measureGroupBinding = new MeasureGroupBindingImpl();
		return measureGroupBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureGroupDimensionBinding createMeasureGroupDimensionBinding() {
		MeasureGroupDimensionBindingImpl measureGroupDimensionBinding = new MeasureGroupDimensionBindingImpl();
		return measureGroupDimensionBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureGroupsType createMeasureGroupsType() {
		MeasureGroupsTypeImpl measureGroupsType = new MeasureGroupsTypeImpl();
		return measureGroupsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureGroupsType1 createMeasureGroupsType1() {
		MeasureGroupsType1Impl measureGroupsType1 = new MeasureGroupsType1Impl();
		return measureGroupsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuresType createMeasuresType() {
		MeasuresTypeImpl measuresType = new MeasuresTypeImpl();
		return measuresType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuresType1 createMeasuresType1() {
		MeasuresType1Impl measuresType1 = new MeasuresType1Impl();
		return measuresType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuresType2 createMeasuresType2() {
		MeasuresType2Impl measuresType2 = new MeasuresType2Impl();
		return measuresType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Member createMember() {
		MemberImpl member = new MemberImpl();
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MembersType createMembersType() {
		MembersTypeImpl membersType = new MembersTypeImpl();
		return membersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MembersType1 createMembersType1() {
		MembersType1Impl membersType1 = new MembersType1Impl();
		return membersType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergePartitions createMergePartitions() {
		MergePartitionsImpl mergePartitions = new MergePartitionsImpl();
		return mergePartitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningModel createMiningModel() {
		MiningModelImpl miningModel = new MiningModelImpl();
		return miningModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningModelColumn createMiningModelColumn() {
		MiningModelColumnImpl miningModelColumn = new MiningModelColumnImpl();
		return miningModelColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningModelingFlag createMiningModelingFlag() {
		MiningModelingFlagImpl miningModelingFlag = new MiningModelingFlagImpl();
		return miningModelingFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningModelPermission createMiningModelPermission() {
		MiningModelPermissionImpl miningModelPermission = new MiningModelPermissionImpl();
		return miningModelPermission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningModelPermissionsType createMiningModelPermissionsType() {
		MiningModelPermissionsTypeImpl miningModelPermissionsType = new MiningModelPermissionsTypeImpl();
		return miningModelPermissionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningModelsType createMiningModelsType() {
		MiningModelsTypeImpl miningModelsType = new MiningModelsTypeImpl();
		return miningModelsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningStructure createMiningStructure() {
		MiningStructureImpl miningStructure = new MiningStructureImpl();
		return miningStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningStructurePermission createMiningStructurePermission() {
		MiningStructurePermissionImpl miningStructurePermission = new MiningStructurePermissionImpl();
		return miningStructurePermission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningStructurePermissionsType createMiningStructurePermissionsType() {
		MiningStructurePermissionsTypeImpl miningStructurePermissionsType = new MiningStructurePermissionsTypeImpl();
		return miningStructurePermissionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningStructuresType createMiningStructuresType() {
		MiningStructuresTypeImpl miningStructuresType = new MiningStructuresTypeImpl();
		return miningStructuresType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelingFlagsType createModelingFlagsType() {
		ModelingFlagsTypeImpl modelingFlagsType = new ModelingFlagsTypeImpl();
		return modelingFlagsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelingFlagsType1 createModelingFlagsType1() {
		ModelingFlagsType1Impl modelingFlagsType1 = new ModelingFlagsType1Impl();
		return modelingFlagsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameColumnType createNameColumnType() {
		NameColumnTypeImpl nameColumnType = new NameColumnTypeImpl();
		return nameColumnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingTemplateTranslationsType createNamingTemplateTranslationsType() {
		NamingTemplateTranslationsTypeImpl namingTemplateTranslationsType = new NamingTemplateTranslationsTypeImpl();
		return namingTemplateTranslationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotifyTableChange createNotifyTableChange() {
		NotifyTableChangeImpl notifyTableChange = new NotifyTableChangeImpl();
		return notifyTableChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotType createNotType() {
		NotTypeImpl notType = new NotTypeImpl();
		return notType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.daanse.xmla.model.ecore.xmla.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectReference createObjectReference() {
		ObjectReferenceImpl objectReference = new ObjectReferenceImpl();
		return objectReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectType createObjectType() {
		ObjectTypeImpl objectType = new ObjectTypeImpl();
		return objectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OlapDataSource createOlapDataSource() {
		OlapDataSourceImpl olapDataSource = new OlapDataSourceImpl();
		return olapDataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrdinalType createOrdinalType() {
		OrdinalTypeImpl ordinalType = new OrdinalTypeImpl();
		return ordinalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutOfLineBinding createOutOfLineBinding() {
		OutOfLineBindingImpl outOfLineBinding = new OutOfLineBindingImpl();
		return outOfLineBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelType createParallelType() {
		ParallelTypeImpl parallelType = new ParallelTypeImpl();
		return parallelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameters createParameters() {
		ParametersImpl parameters = new ParametersImpl();
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametersType createParametersType() {
		ParametersTypeImpl parametersType = new ParametersTypeImpl();
		return parametersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType2 createParameterType2() {
		ParameterType2Impl parameterType2 = new ParameterType2Impl();
		return parameterType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Partition createPartition() {
		PartitionImpl partition = new PartitionImpl();
		return partition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionsType createPartitionsType() {
		PartitionsTypeImpl partitionsType = new PartitionsTypeImpl();
		return partitionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Permission createPermission() {
		PermissionImpl permission = new PermissionImpl();
		return permission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Perspective createPerspective() {
		PerspectiveImpl perspective = new PerspectiveImpl();
		return perspective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerspectiveAction createPerspectiveAction() {
		PerspectiveActionImpl perspectiveAction = new PerspectiveActionImpl();
		return perspectiveAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerspectiveAttribute createPerspectiveAttribute() {
		PerspectiveAttributeImpl perspectiveAttribute = new PerspectiveAttributeImpl();
		return perspectiveAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerspectiveCalculation createPerspectiveCalculation() {
		PerspectiveCalculationImpl perspectiveCalculation = new PerspectiveCalculationImpl();
		return perspectiveCalculation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerspectiveDimension createPerspectiveDimension() {
		PerspectiveDimensionImpl perspectiveDimension = new PerspectiveDimensionImpl();
		return perspectiveDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerspectiveHierarchy createPerspectiveHierarchy() {
		PerspectiveHierarchyImpl perspectiveHierarchy = new PerspectiveHierarchyImpl();
		return perspectiveHierarchy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerspectiveKpi createPerspectiveKpi() {
		PerspectiveKpiImpl perspectiveKpi = new PerspectiveKpiImpl();
		return perspectiveKpi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerspectiveMeasure createPerspectiveMeasure() {
		PerspectiveMeasureImpl perspectiveMeasure = new PerspectiveMeasureImpl();
		return perspectiveMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerspectiveMeasureGroup createPerspectiveMeasureGroup() {
		PerspectiveMeasureGroupImpl perspectiveMeasureGroup = new PerspectiveMeasureGroupImpl();
		return perspectiveMeasureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerspectivesType createPerspectivesType() {
		PerspectivesTypeImpl perspectivesType = new PerspectivesTypeImpl();
		return perspectivesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredLeaf createPredLeaf() {
		PredLeafImpl predLeaf = new PredLeafImpl();
		return predLeaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProactiveCaching createProactiveCaching() {
		ProactiveCachingImpl proactiveCaching = new ProactiveCachingImpl();
		return proactiveCaching;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProactiveCachingIncrementalProcessingBinding createProactiveCachingIncrementalProcessingBinding() {
		ProactiveCachingIncrementalProcessingBindingImpl proactiveCachingIncrementalProcessingBinding = new ProactiveCachingIncrementalProcessingBindingImpl();
		return proactiveCachingIncrementalProcessingBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProactiveCachingInheritedBinding createProactiveCachingInheritedBinding() {
		ProactiveCachingInheritedBindingImpl proactiveCachingInheritedBinding = new ProactiveCachingInheritedBindingImpl();
		return proactiveCachingInheritedBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProactiveCachingQueryBinding createProactiveCachingQueryBinding() {
		ProactiveCachingQueryBindingImpl proactiveCachingQueryBinding = new ProactiveCachingQueryBindingImpl();
		return proactiveCachingQueryBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProactiveCachingTablesBinding createProactiveCachingTablesBinding() {
		ProactiveCachingTablesBindingImpl proactiveCachingTablesBinding = new ProactiveCachingTablesBindingImpl();
		return proactiveCachingTablesBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.daanse.xmla.model.ecore.xmla.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Properties createProperties() {
		PropertiesImpl properties = new PropertiesImpl();
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesType createPropertiesType() {
		PropertiesTypeImpl propertiesType = new PropertiesTypeImpl();
		return propertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyList createPropertyList() {
		PropertyListImpl propertyList = new PropertyListImpl();
		return propertyList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PushedDataSource createPushedDataSource() {
		PushedDataSourceImpl pushedDataSource = new PushedDataSourceImpl();
		return pushedDataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueriesType createQueriesType() {
		QueriesTypeImpl queriesType = new QueriesTypeImpl();
		return queriesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryBinding createQueryBinding() {
		QueryBindingImpl queryBinding = new QueryBindingImpl();
		return queryBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryNotification createQueryNotification() {
		QueryNotificationImpl queryNotification = new QueryNotificationImpl();
		return queryNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryNotificationsType createQueryNotificationsType() {
		QueryNotificationsTypeImpl queryNotificationsType = new QueryNotificationsTypeImpl();
		return queryNotificationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceMeasureGroupDimension createReferenceMeasureGroupDimension() {
		ReferenceMeasureGroupDimensionImpl referenceMeasureGroupDimension = new ReferenceMeasureGroupDimensionImpl();
		return referenceMeasureGroupDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularMeasureGroupDimension createRegularMeasureGroupDimension() {
		RegularMeasureGroupDimensionImpl regularMeasureGroupDimension = new RegularMeasureGroupDimensionImpl();
		return regularMeasureGroupDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalDataSource createRelationalDataSource() {
		RelationalDataSourceImpl relationalDataSource = new RelationalDataSourceImpl();
		return relationalDataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportAction createReportAction() {
		ReportActionImpl reportAction = new ReportActionImpl();
		return reportAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportFormatParameter createReportFormatParameter() {
		ReportFormatParameterImpl reportFormatParameter = new ReportFormatParameterImpl();
		return reportFormatParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportFormatParametersType createReportFormatParametersType() {
		ReportFormatParametersTypeImpl reportFormatParametersType = new ReportFormatParametersTypeImpl();
		return reportFormatParametersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportParameter createReportParameter() {
		ReportParameterImpl reportParameter = new ReportParameterImpl();
		return reportParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportParametersType createReportParametersType() {
		ReportParametersTypeImpl reportParametersType = new ReportParametersTypeImpl();
		return reportParametersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Restore createRestore() {
		RestoreImpl restore = new RestoreImpl();
		return restore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictionListType createRestrictionListType() {
		RestrictionListTypeImpl restrictionListType = new RestrictionListTypeImpl();
		return restrictionListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictionsType createRestrictionsType() {
		RestrictionsTypeImpl restrictionsType = new RestrictionsTypeImpl();
		return restrictionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultType createResultType() {
		ResultTypeImpl resultType = new ResultTypeImpl();
		return resultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Return createReturn() {
		ReturnImpl return_ = new ReturnImpl();
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnType createReturnType() {
		ReturnTypeImpl returnType = new ReturnTypeImpl();
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolesType createRolesType() {
		RolesTypeImpl rolesType = new RolesTypeImpl();
		return rolesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolesType1 createRolesType1() {
		RolesType1Impl rolesType1 = new RolesType1Impl();
		return rolesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RollbackTransaction createRollbackTransaction() {
		RollbackTransactionImpl rollbackTransaction = new RollbackTransactionImpl();
		return rollbackTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootType createRootType() {
		RootTypeImpl rootType = new RootTypeImpl();
		return rootType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowBinding createRowBinding() {
		RowBindingImpl rowBinding = new RowBindingImpl();
		return rowBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalarMiningStructureColumn createScalarMiningStructureColumn() {
		ScalarMiningStructureColumnImpl scalarMiningStructureColumn = new ScalarMiningStructureColumnImpl();
		return scalarMiningStructureColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server createServer() {
		ServerImpl server = new ServerImpl();
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerPropertiesType createServerPropertiesType() {
		ServerPropertiesTypeImpl serverPropertiesType = new ServerPropertiesTypeImpl();
		return serverPropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerProperty createServerProperty() {
		ServerPropertyImpl serverProperty = new ServerPropertyImpl();
		return serverProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionType createSessionType() {
		SessionTypeImpl sessionType = new SessionTypeImpl();
		return sessionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetAuthContext createSetAuthContext() {
		SetAuthContextImpl setAuthContext = new SetAuthContextImpl();
		return setAuthContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkippedLevelsColumnType createSkippedLevelsColumnType() {
		SkippedLevelsColumnTypeImpl skippedLevelsColumnType = new SkippedLevelsColumnTypeImpl();
		return skippedLevelsColumnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source createSource() {
		SourceImpl source = new SourceImpl();
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourcesType createSourcesType() {
		SourcesTypeImpl sourcesType = new SourcesTypeImpl();
		return sourcesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardAction createStandardAction() {
		StandardActionImpl standardAction = new StandardActionImpl();
		return standardAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement createStatement() {
		StatementImpl statement = new StatementImpl();
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageModeType createStorageModeType() {
		StorageModeTypeImpl storageModeType = new StorageModeTypeImpl();
		return storageModeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageModeType2 createStorageModeType2() {
		StorageModeType2Impl storageModeType2 = new StorageModeType2Impl();
		return storageModeType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageModeType3 createStorageModeType3() {
		StorageModeType3Impl storageModeType3 = new StorageModeType3Impl();
		return storageModeType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscribe createSubscribe() {
		SubscribeImpl subscribe = new SubscribeImpl();
		return subscribe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Synchronize createSynchronize() {
		SynchronizeImpl synchronize = new SynchronizeImpl();
		return synchronize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableBinding createTableBinding() {
		TableBindingImpl tableBinding = new TableBindingImpl();
		return tableBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableMiningStructureColumn createTableMiningStructureColumn() {
		TableMiningStructureColumnImpl tableMiningStructureColumn = new TableMiningStructureColumnImpl();
		return tableMiningStructureColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableNotification createTableNotification() {
		TableNotificationImpl tableNotification = new TableNotificationImpl();
		return tableNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableNotificationsType createTableNotificationsType() {
		TableNotificationsTypeImpl tableNotificationsType = new TableNotificationsTypeImpl();
		return tableNotificationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableNotificationsType1 createTableNotificationsType1() {
		TableNotificationsType1Impl tableNotificationsType1 = new TableNotificationsType1Impl();
		return tableNotificationsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetType createTargetType() {
		TargetTypeImpl targetType = new TargetTypeImpl();
		return targetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetType1 createTargetType1() {
		TargetType1Impl targetType1 = new TargetType1Impl();
		return targetType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeAttributeBinding createTimeAttributeBinding() {
		TimeAttributeBindingImpl timeAttributeBinding = new TimeAttributeBindingImpl();
		return timeAttributeBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBinding createTimeBinding() {
		TimeBindingImpl timeBinding = new TimeBindingImpl();
		return timeBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace createTrace() {
		TraceImpl trace = new TraceImpl();
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceColumns createTraceColumns() {
		TraceColumnsImpl traceColumns = new TraceColumnsImpl();
		return traceColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceDefinitionProviderInfo createTraceDefinitionProviderInfo() {
		TraceDefinitionProviderInfoImpl traceDefinitionProviderInfo = new TraceDefinitionProviderInfoImpl();
		return traceDefinitionProviderInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceEvent createTraceEvent() {
		TraceEventImpl traceEvent = new TraceEventImpl();
		return traceEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceEventCategories createTraceEventCategories() {
		TraceEventCategoriesImpl traceEventCategories = new TraceEventCategoriesImpl();
		return traceEventCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceFilter createTraceFilter() {
		TraceFilterImpl traceFilter = new TraceFilterImpl();
		return traceFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracesType createTracesType() {
		TracesTypeImpl tracesType = new TracesTypeImpl();
		return tracesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Translation createTranslation() {
		TranslationImpl translation = new TranslationImpl();
		return translation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationInsertUpdate createTranslationInsertUpdate() {
		TranslationInsertUpdateImpl translationInsertUpdate = new TranslationInsertUpdateImpl();
		return translationInsertUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationsType createTranslationsType() {
		TranslationsTypeImpl translationsType = new TranslationsTypeImpl();
		return translationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationsType1 createTranslationsType1() {
		TranslationsType1Impl translationsType1 = new TranslationsType1Impl();
		return translationsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationsType2 createTranslationsType2() {
		TranslationsType2Impl translationsType2 = new TranslationsType2Impl();
		return translationsType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationsType3 createTranslationsType3() {
		TranslationsType3Impl translationsType3 = new TranslationsType3Impl();
		return translationsType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationsType4 createTranslationsType4() {
		TranslationsType4Impl translationsType4 = new TranslationsType4Impl();
		return translationsType4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationsType5 createTranslationsType5() {
		TranslationsType5Impl translationsType5 = new TranslationsType5Impl();
		return translationsType5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationsType6 createTranslationsType6() {
		TranslationsType6Impl translationsType6 = new TranslationsType6Impl();
		return translationsType6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationsType7 createTranslationsType7() {
		TranslationsType7Impl translationsType7 = new TranslationsType7Impl();
		return translationsType7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationsType8 createTranslationsType8() {
		TranslationsType8Impl translationsType8 = new TranslationsType8Impl();
		return translationsType8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationsType9 createTranslationsType9() {
		TranslationsType9Impl translationsType9 = new TranslationsType9Impl();
		return translationsType9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationsType10 createTranslationsType10() {
		TranslationsType10Impl translationsType10 = new TranslationsType10Impl();
		return translationsType10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationsType11 createTranslationsType11() {
		TranslationsType11Impl translationsType11 = new TranslationsType11Impl();
		return translationsType11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationsType12 createTranslationsType12() {
		TranslationsType12Impl translationsType12 = new TranslationsType12Impl();
		return translationsType12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationsType13 createTranslationsType13() {
		TranslationsType13Impl translationsType13 = new TranslationsType13Impl();
		return translationsType13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationsType14 createTranslationsType14() {
		TranslationsType14Impl translationsType14 = new TranslationsType14Impl();
		return translationsType14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationsType15 createTranslationsType15() {
		TranslationsType15Impl translationsType15 = new TranslationsType15Impl();
		return translationsType15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationsType16 createTranslationsType16() {
		TranslationsType16Impl translationsType16 = new TranslationsType16Impl();
		return translationsType16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationsType17 createTranslationsType17() {
		TranslationsType17Impl translationsType17 = new TranslationsType17Impl();
		return translationsType17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationsType18 createTranslationsType18() {
		TranslationsType18Impl translationsType18 = new TranslationsType18Impl();
		return translationsType18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationsType19 createTranslationsType19() {
		TranslationsType19Impl translationsType19 = new TranslationsType19Impl();
		return translationsType19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationsType20 createTranslationsType20() {
		TranslationsType20Impl translationsType20 = new TranslationsType20Impl();
		return translationsType20;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationsType21 createTranslationsType21() {
		TranslationsType21Impl translationsType21 = new TranslationsType21Impl();
		return translationsType21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationsType22 createTranslationsType22() {
		TranslationsType22Impl translationsType22 = new TranslationsType22Impl();
		return translationsType22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationType createTranslationType() {
		TranslationTypeImpl translationType = new TranslationTypeImpl();
		return translationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType6 createTypeType6() {
		TypeType6Impl typeType6 = new TypeType6Impl();
		return typeType6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryExpr createUnaryExpr() {
		UnaryExprImpl unaryExpr = new UnaryExprImpl();
		return unaryExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOperatorColumnType createUnaryOperatorColumnType() {
		UnaryOperatorColumnTypeImpl unaryOperatorColumnType = new UnaryOperatorColumnTypeImpl();
		return unaryOperatorColumnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownMemberTranslationsType createUnknownMemberTranslationsType() {
		UnknownMemberTranslationsTypeImpl unknownMemberTranslationsType = new UnknownMemberTranslationsTypeImpl();
		return unknownMemberTranslationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownMemberType createUnknownMemberType() {
		UnknownMemberTypeImpl unknownMemberType = new UnknownMemberTypeImpl();
		return unknownMemberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unlock createUnlock() {
		UnlockImpl unlock = new UnlockImpl();
		return unlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unsubscribe createUnsubscribe() {
		UnsubscribeImpl unsubscribe = new UnsubscribeImpl();
		return unsubscribe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Update createUpdate() {
		UpdateImpl update = new UpdateImpl();
		return update;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateCells createUpdateCells() {
		UpdateCellsImpl updateCells = new UpdateCellsImpl();
		return updateCells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserDefinedGroupBinding createUserDefinedGroupBinding() {
		UserDefinedGroupBindingImpl userDefinedGroupBinding = new UserDefinedGroupBindingImpl();
		return userDefinedGroupBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueColumnType createValueColumnType() {
		ValueColumnTypeImpl valueColumnType = new ValueColumnTypeImpl();
		return valueColumnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionType createVersionType() {
		VersionTypeImpl versionType = new VersionTypeImpl();
		return versionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Where createWhere() {
		WhereImpl where = new WhereImpl();
		return where;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhereAttribute createWhereAttribute() {
		WhereAttributeImpl whereAttribute = new WhereAttributeImpl();
		return whereAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessType createAccessTypeFromString(EDataType eDataType, String initialValue) {
		AccessType result = AccessType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateFunctionType createAggregateFunctionTypeFromString(EDataType eDataType, String initialValue) {
		AggregateFunctionType result = AggregateFunctionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregateFunctionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationFunctionType createAggregationFunctionTypeFromString(EDataType eDataType, String initialValue) {
		AggregationFunctionType result = AggregationFunctionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationFunctionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationStorageType createAggregationStorageTypeFromString(EDataType eDataType, String initialValue) {
		AggregationStorageType result = AggregationStorageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationStorageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationTypeType createAggregationTypeTypeFromString(EDataType eDataType, String initialValue) {
		AggregationTypeType result = AggregationTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationUsageType createAggregationUsageTypeFromString(EDataType eDataType, String initialValue) {
		AggregationUsageType result = AggregationUsageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationUsageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgorithmType createAlgorithmTypeFromString(EDataType eDataType, String initialValue) {
		AlgorithmType result = AlgorithmType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlgorithmTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllMemberAggregationUsageType createAllMemberAggregationUsageTypeFromString(EDataType eDataType, String initialValue) {
		AllMemberAggregationUsageType result = AllMemberAggregationUsageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllMemberAggregationUsageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeHierarchyOptimizedStateType createAttributeHierarchyOptimizedStateTypeFromString(EDataType eDataType, String initialValue) {
		AttributeHierarchyOptimizedStateType result = AttributeHierarchyOptimizedStateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeHierarchyOptimizedStateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeHierarchyOptimizedStateType1 createAttributeHierarchyOptimizedStateType1FromString(EDataType eDataType, String initialValue) {
		AttributeHierarchyOptimizedStateType1 result = AttributeHierarchyOptimizedStateType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeHierarchyOptimizedStateType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisFormatType createAxisFormatTypeFromString(EDataType eDataType, String initialValue) {
		AxisFormatType result = AxisFormatType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAxisFormatTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheModeType createCacheModeTypeFromString(EDataType eDataType, String initialValue) {
		CacheModeType result = CacheModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCacheModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculationTypeType createCalculationTypeTypeFromString(EDataType eDataType, String initialValue) {
		CalculationTypeType result = CalculationTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalculationTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardinalityType createCardinalityTypeFromString(EDataType eDataType, String initialValue) {
		CardinalityType result = CardinalityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCardinalityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardinalityType1 createCardinalityType1FromString(EDataType eDataType, String initialValue) {
		CardinalityType1 result = CardinalityType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCardinalityType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogLocationType createCatalogLocationTypeFromString(EDataType eDataType, String initialValue) {
		CatalogLocationType result = CatalogLocationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCatalogLocationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionStringSecurityType createConnectionStringSecurityTypeFromString(EDataType eDataType, String initialValue) {
		ConnectionStringSecurityType result = ConnectionStringSecurityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectionStringSecurityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentType createContentTypeFromString(EDataType eDataType, String initialValue) {
		ContentType result = ContentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentType1 createContentType1FromString(EDataType eDataType, String initialValue) {
		ContentType1 result = ContentType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContentType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CubeStorageModeEnumType createCubeStorageModeEnumTypeFromString(EDataType eDataType, String initialValue) {
		CubeStorageModeEnumType result = CubeStorageModeEnumType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCubeStorageModeEnumTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAggregationType createDataAggregationTypeFromString(EDataType eDataType, String initialValue) {
		DataAggregationType result = DataAggregationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataAggregationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeType createDataTypeTypeFromString(EDataType eDataType, String initialValue) {
		DataTypeType result = DataTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeType1 createDataTypeType1FromString(EDataType eDataType, String initialValue) {
		DataTypeType1 result = DataTypeType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropConcatNullBehaviorType createDbpropConcatNullBehaviorTypeFromString(EDataType eDataType, String initialValue) {
		DbpropConcatNullBehaviorType result = DbpropConcatNullBehaviorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropConcatNullBehaviorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropMsmdAutoExistsType createDbpropMsmdAutoExistsTypeFromString(EDataType eDataType, String initialValue) {
		DbpropMsmdAutoExistsType result = DbpropMsmdAutoExistsType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropMsmdAutoExistsTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropMsmdCompareCaseSensitiveStringFlagsType createDbpropMsmdCompareCaseSensitiveStringFlagsTypeFromString(EDataType eDataType, String initialValue) {
		DbpropMsmdCompareCaseSensitiveStringFlagsType result = DbpropMsmdCompareCaseSensitiveStringFlagsType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropMsmdCompareCaseSensitiveStringFlagsTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropMsmdMDXCompatibilityType createDbpropMsmdMDXCompatibilityTypeFromString(EDataType eDataType, String initialValue) {
		DbpropMsmdMDXCompatibilityType result = DbpropMsmdMDXCompatibilityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropMsmdMDXCompatibilityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropMsmdSubqueriesType createDbpropMsmdSubqueriesTypeFromString(EDataType eDataType, String initialValue) {
		DbpropMsmdSubqueriesType result = DbpropMsmdSubqueriesType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropMsmdSubqueriesTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropNullCollationType createDbpropNullCollationTypeFromString(EDataType eDataType, String initialValue) {
		DbpropNullCollationType result = DbpropNullCollationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropNullCollationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropOutputParameterAvailableType createDbpropOutputParameterAvailableTypeFromString(EDataType eDataType, String initialValue) {
		DbpropOutputParameterAvailableType result = DbpropOutputParameterAvailableType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropOutputParameterAvailableTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropPersistentIdTypeType createDbpropPersistentIdTypeTypeFromString(EDataType eDataType, String initialValue) {
		DbpropPersistentIdTypeType result = DbpropPersistentIdTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropPersistentIdTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropPrepareAbortBehaviorType createDbpropPrepareAbortBehaviorTypeFromString(EDataType eDataType, String initialValue) {
		DbpropPrepareAbortBehaviorType result = DbpropPrepareAbortBehaviorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropPrepareAbortBehaviorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropPrepareCommitBehaviorType createDbpropPrepareCommitBehaviorTypeFromString(EDataType eDataType, String initialValue) {
		DbpropPrepareCommitBehaviorType result = DbpropPrepareCommitBehaviorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropPrepareCommitBehaviorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropQuotedIdentifierCaseType createDbpropQuotedIdentifierCaseTypeFromString(EDataType eDataType, String initialValue) {
		DbpropQuotedIdentifierCaseType result = DbpropQuotedIdentifierCaseType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropQuotedIdentifierCaseTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DialectType createDialectTypeFromString(EDataType eDataType, String initialValue) {
		DialectType result = DialectType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDialectTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionAttributeTypeEnumType createDimensionAttributeTypeEnumTypeFromString(EDataType eDataType, String initialValue) {
		DimensionAttributeTypeEnumType result = DimensionAttributeTypeEnumType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDimensionAttributeTypeEnumTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionCurrentStorageModeEnumType createDimensionCurrentStorageModeEnumTypeFromString(EDataType eDataType, String initialValue) {
		DimensionCurrentStorageModeEnumType result = DimensionCurrentStorageModeEnumType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDimensionCurrentStorageModeEnumTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscretizationMethodType createDiscretizationMethodTypeFromString(EDataType eDataType, String initialValue) {
		DiscretizationMethodType result = DiscretizationMethodType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiscretizationMethodTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurabilityGuaranteeType createDurabilityGuaranteeTypeFromString(EDataType eDataType, String initialValue) {
		DurabilityGuaranteeType result = DurabilityGuaranteeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDurabilityGuaranteeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditionType createEditionTypeFromString(EDataType eDataType, String initialValue) {
		EditionType result = EditionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEditionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiscalYearNameType createFiscalYearNameTypeFromString(EDataType eDataType, String initialValue) {
		FiscalYearNameType result = FiscalYearNameType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFiscalYearNameTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormatType createFormatTypeFromString(EDataType eDataType, String initialValue) {
		FormatType result = FormatType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormatTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormatType1 createFormatType1FromString(EDataType eDataType, String initialValue) {
		FormatType1 result = FormatType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormatType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupingBehaviorType createGroupingBehaviorTypeFromString(EDataType eDataType, String initialValue) {
		GroupingBehaviorType result = GroupingBehaviorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupingBehaviorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HideMemberIfType createHideMemberIfTypeFromString(EDataType eDataType, String initialValue) {
		HideMemberIfType result = HideMemberIfType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHideMemberIfTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HierarchyUniqueNameStyleType createHierarchyUniqueNameStyleTypeFromString(EDataType eDataType, String initialValue) {
		HierarchyUniqueNameStyleType result = HierarchyUniqueNameStyleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHierarchyUniqueNameStyleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSelectionType createInstanceSelectionTypeFromString(EDataType eDataType, String initialValue) {
		InstanceSelectionType result = InstanceSelectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstanceSelectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidXmlCharactersType createInvalidXmlCharactersTypeFromString(EDataType eDataType, String initialValue) {
		InvalidXmlCharactersType result = InvalidXmlCharactersType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvalidXmlCharactersTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocationType createInvocationTypeFromString(EDataType eDataType, String initialValue) {
		InvocationType result = InvocationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvocationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocationType1 createInvocationType1FromString(EDataType eDataType, String initialValue) {
		InvocationType1 result = InvocationType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvocationType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocationType2 createInvocationType2FromString(EDataType eDataType, String initialValue) {
		InvocationType2 result = InvocationType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvocationType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsolationType createIsolationTypeFromString(EDataType eDataType, String initialValue) {
		IsolationType result = IsolationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIsolationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyDuplicateType createKeyDuplicateTypeFromString(EDataType eDataType, String initialValue) {
		KeyDuplicateType result = KeyDuplicateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKeyDuplicateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyErrorActionType createKeyErrorActionTypeFromString(EDataType eDataType, String initialValue) {
		KeyErrorActionType result = KeyErrorActionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKeyErrorActionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyErrorLimitActionType createKeyErrorLimitActionTypeFromString(EDataType eDataType, String initialValue) {
		KeyErrorLimitActionType result = KeyErrorLimitActionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKeyErrorLimitActionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyNotFoundType createKeyNotFoundTypeFromString(EDataType eDataType, String initialValue) {
		KeyNotFoundType result = KeyNotFoundType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKeyNotFoundTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaterializationType createMaterializationTypeFromString(EDataType eDataType, String initialValue) {
		MaterializationType result = MaterializationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaterializationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdpropAggregateCellUpdateType createMdpropAggregateCellUpdateTypeFromString(EDataType eDataType, String initialValue) {
		MdpropAggregateCellUpdateType result = MdpropAggregateCellUpdateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMdpropAggregateCellUpdateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdpropFlatteningSupportType createMdpropFlatteningSupportTypeFromString(EDataType eDataType, String initialValue) {
		MdpropFlatteningSupportType result = MdpropFlatteningSupportType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMdpropFlatteningSupportTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdpropMdxNonMeasureExpressionsType createMdpropMdxNonMeasureExpressionsTypeFromString(EDataType eDataType, String initialValue) {
		MdpropMdxNonMeasureExpressionsType result = MdpropMdxNonMeasureExpressionsType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMdpropMdxNonMeasureExpressionsTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdpropMdxRangeRowsetType createMdpropMdxRangeRowsetTypeFromString(EDataType eDataType, String initialValue) {
		MdpropMdxRangeRowsetType result = MdpropMdxRangeRowsetType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMdpropMdxRangeRowsetTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdpropMdxSlicerType createMdpropMdxSlicerTypeFromString(EDataType eDataType, String initialValue) {
		MdpropMdxSlicerType result = MdpropMdxSlicerType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMdpropMdxSlicerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdxMissingMemberModeType createMdxMissingMemberModeTypeFromString(EDataType eDataType, String initialValue) {
		MdxMissingMemberModeType result = MdxMissingMemberModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMdxMissingMemberModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdxMissingMemberModeType1 createMdxMissingMemberModeType1FromString(EDataType eDataType, String initialValue) {
		MdxMissingMemberModeType1 result = MdxMissingMemberModeType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMdxMissingMemberModeType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDXSupportType createMDXSupportTypeFromString(EDataType eDataType, String initialValue) {
		MDXSupportType result = MDXSupportType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMDXSupportTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureGroupStorageModeEnumType createMeasureGroupStorageModeEnumTypeFromString(EDataType eDataType, String initialValue) {
		MeasureGroupStorageModeEnumType result = MeasureGroupStorageModeEnumType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasureGroupStorageModeEnumTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MembersWithDataType createMembersWithDataTypeFromString(EDataType eDataType, String initialValue) {
		MembersWithDataType result = MembersWithDataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMembersWithDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemberUniqueNameStyleType createMemberUniqueNameStyleTypeFromString(EDataType eDataType, String initialValue) {
		MemberUniqueNameStyleType result = MemberUniqueNameStyleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMemberUniqueNameStyleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryLockingModeType createMemoryLockingModeTypeFromString(EDataType eDataType, String initialValue) {
		MemoryLockingModeType result = MemoryLockingModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMemoryLockingModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeType createModeTypeFromString(EDataType eDataType, String initialValue) {
		ModeType result = ModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationTechniqueType createNotificationTechniqueTypeFromString(EDataType eDataType, String initialValue) {
		NotificationTechniqueType result = NotificationTechniqueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNotificationTechniqueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationTechniqueType1 createNotificationTechniqueType1FromString(EDataType eDataType, String initialValue) {
		NotificationTechniqueType1 result = NotificationTechniqueType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNotificationTechniqueType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullKeyConvertedToUnknownType createNullKeyConvertedToUnknownTypeFromString(EDataType eDataType, String initialValue) {
		NullKeyConvertedToUnknownType result = NullKeyConvertedToUnknownType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNullKeyConvertedToUnknownTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullKeyNotAllowedType createNullKeyNotAllowedTypeFromString(EDataType eDataType, String initialValue) {
		NullKeyNotAllowedType result = NullKeyNotAllowedType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNullKeyNotAllowedTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullProcessingType createNullProcessingTypeFromString(EDataType eDataType, String initialValue) {
		NullProcessingType result = NullProcessingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNullProcessingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectExpansion createObjectExpansionFromString(EDataType eDataType, String initialValue) {
		ObjectExpansion result = ObjectExpansion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectExpansionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnlineModeType createOnlineModeTypeFromString(EDataType eDataType, String initialValue) {
		OnlineModeType result = OnlineModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOnlineModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimizedStateType createOptimizedStateTypeFromString(EDataType eDataType, String initialValue) {
		OptimizedStateType result = OptimizedStateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOptimizedStateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionalityType createOptionalityTypeFromString(EDataType eDataType, String initialValue) {
		OptionalityType result = OptionalityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOptionalityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderByType createOrderByTypeFromString(EDataType eDataType, String initialValue) {
		OrderByType result = OrderByType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderByTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverrideBehaviorType createOverrideBehaviorTypeFromString(EDataType eDataType, String initialValue) {
		OverrideBehaviorType result = OverrideBehaviorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOverrideBehaviorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType createParameterTypeFromString(EDataType eDataType, String initialValue) {
		ParameterType result = ParameterType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType1 createParameterType1FromString(EDataType eDataType, String initialValue) {
		ParameterType1 result = ParameterType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionCurrentStorageModeEnumType createPartitionCurrentStorageModeEnumTypeFromString(EDataType eDataType, String initialValue) {
		PartitionCurrentStorageModeEnumType result = PartitionCurrentStorageModeEnumType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPartitionCurrentStorageModeEnumTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionModes createPartitionModesFromString(EDataType eDataType, String initialValue) {
		PartitionModes result = PartitionModes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPartitionModesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionStorageModeEnumType createPartitionStorageModeEnumTypeFromString(EDataType eDataType, String initialValue) {
		PartitionStorageModeEnumType result = PartitionStorageModeEnumType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPartitionStorageModeEnumTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionSetType createPermissionSetTypeFromString(EDataType eDataType, String initialValue) {
		PermissionSetType result = PermissionSetType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPermissionSetTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceType createPersistenceTypeFromString(EDataType eDataType, String initialValue) {
		PersistenceType result = PersistenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersistenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceType1 createPersistenceType1FromString(EDataType eDataType, String initialValue) {
		PersistenceType1 result = PersistenceType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersistenceType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingGroupType createProcessingGroupTypeFromString(EDataType eDataType, String initialValue) {
		ProcessingGroupType result = ProcessingGroupType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessingGroupTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingModeType createProcessingModeTypeFromString(EDataType eDataType, String initialValue) {
		ProcessingModeType result = ProcessingModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessingModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingModeType1 createProcessingModeType1FromString(EDataType eDataType, String initialValue) {
		ProcessingModeType1 result = ProcessingModeType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessingModeType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingModeType2 createProcessingModeType2FromString(EDataType eDataType, String initialValue) {
		ProcessingModeType2 result = ProcessingModeType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessingModeType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingModeType3 createProcessingModeType3FromString(EDataType eDataType, String initialValue) {
		ProcessingModeType3 result = ProcessingModeType3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessingModeType3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingStateType createProcessingStateTypeFromString(EDataType eDataType, String initialValue) {
		ProcessingStateType result = ProcessingStateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessingStateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderTypeType createProviderTypeTypeFromString(EDataType eDataType, String initialValue) {
		ProviderTypeType result = ProviderTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProviderTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadDefinitionType createReadDefinitionTypeFromString(EDataType eDataType, String initialValue) {
		ReadDefinitionType result = ReadDefinitionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReadDefinitionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadSourceDataType createReadSourceDataTypeFromString(EDataType eDataType, String initialValue) {
		ReadSourceDataType result = ReadSourceDataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReadSourceDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadType createReadTypeFromString(EDataType eDataType, String initialValue) {
		ReadType result = ReadType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReadTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadType1 createReadType1FromString(EDataType eDataType, String initialValue) {
		ReadType1 result = ReadType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReadType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefreshPolicyType createRefreshPolicyTypeFromString(EDataType eDataType, String initialValue) {
		RefreshPolicyType result = RefreshPolicyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRefreshPolicyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefreshPolicyType1 createRefreshPolicyType1FromString(EDataType eDataType, String initialValue) {
		RefreshPolicyType1 result = RefreshPolicyType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRefreshPolicyType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipTypeType createRelationshipTypeTypeFromString(EDataType eDataType, String initialValue) {
		RelationshipTypeType result = RelationshipTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationshipTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportingFirstWeekOfMonthType createReportingFirstWeekOfMonthTypeFromString(EDataType eDataType, String initialValue) {
		ReportingFirstWeekOfMonthType result = ReportingFirstWeekOfMonthType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReportingFirstWeekOfMonthTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportingWeekToMonthPatternType createReportingWeekToMonthPatternTypeFromString(EDataType eDataType, String initialValue) {
		ReportingWeekToMonthPatternType result = ReportingWeekToMonthPatternType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReportingWeekToMonthPatternTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestTypeType createRequestTypeTypeFromString(EDataType eDataType, String initialValue) {
		RequestTypeType result = RequestTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseEncodingType createResponseEncodingTypeFromString(EDataType eDataType, String initialValue) {
		ResponseEncodingType result = ResponseEncodingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResponseEncodingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RetentionModes createRetentionModesFromString(EDataType eDataType, String initialValue) {
		RetentionModes result = RetentionModes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRetentionModesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootMemberIfType createRootMemberIfTypeFromString(EDataType eDataType, String initialValue) {
		RootMemberIfType result = RootMemberIfType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRootMemberIfTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyOptionsType createSafetyOptionsTypeFromString(EDataType eDataType, String initialValue) {
		SafetyOptionsType result = SafetyOptionsType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSafetyOptionsTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope createScopeFromString(EDataType eDataType, String initialValue) {
		Scope result = Scope.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptCacheProcessingModeType createScriptCacheProcessingModeTypeFromString(EDataType eDataType, String initialValue) {
		ScriptCacheProcessingModeType result = ScriptCacheProcessingModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScriptCacheProcessingModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptErrorHandlingModeType createScriptErrorHandlingModeTypeFromString(EDataType eDataType, String initialValue) {
		ScriptErrorHandlingModeType result = ScriptErrorHandlingModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScriptErrorHandlingModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecuredCellValueType createSecuredCellValueTypeFromString(EDataType eDataType, String initialValue) {
		SecuredCellValueType result = SecuredCellValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSecuredCellValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityType createSecurityTypeFromString(EDataType eDataType, String initialValue) {
		SecurityType result = SecurityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSecurityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityType1 createSecurityType1FromString(EDataType eDataType, String initialValue) {
		SecurityType1 result = SecurityType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSecurityType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShareDimensionStorageType createShareDimensionStorageTypeFromString(EDataType eDataType, String initialValue) {
		ShareDimensionStorageType result = ShareDimensionStorageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShareDimensionStorageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQLQueryModeType createSQLQueryModeTypeFromString(EDataType eDataType, String initialValue) {
		SQLQueryModeType result = SQLQueryModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSQLQueryModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateSupportType createStateSupportTypeFromString(EDataType eDataType, String initialValue) {
		StateSupportType result = StateSupportType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateSupportTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateType createStateTypeFromString(EDataType eDataType, String initialValue) {
		StateType result = StateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateType1 createStateType1FromString(EDataType eDataType, String initialValue) {
		StateType1 result = StateType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateType2 createStateType2FromString(EDataType eDataType, String initialValue) {
		StateType2 result = StateType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateType3 createStateType3FromString(EDataType eDataType, String initialValue) {
		StateType3 result = StateType3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateType3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateType4 createStateType4FromString(EDataType eDataType, String initialValue) {
		StateType4 result = StateType4.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateType4ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateType5 createStateType5FromString(EDataType eDataType, String initialValue) {
		StateType5 result = StateType5.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateType5ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateType6 createStateType6FromString(EDataType eDataType, String initialValue) {
		StateType6 result = StateType6.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateType6ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageModeType1 createStorageModeType1FromString(EDataType eDataType, String initialValue) {
		StorageModeType1 result = StorageModeType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStorageModeType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizeSecurityType createSynchronizeSecurityTypeFromString(EDataType eDataType, String initialValue) {
		SynchronizeSecurityType result = SynchronizeSecurityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSynchronizeSecurityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetTypeType createTargetTypeTypeFromString(EDataType eDataType, String initialValue) {
		TargetTypeType result = TargetTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTargetTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetTypeType1 createTargetTypeType1FromString(EDataType eDataType, String initialValue) {
		TargetTypeType1 result = TargetTypeType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTargetTypeType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetTypeType2 createTargetTypeType2FromString(EDataType eDataType, String initialValue) {
		TargetTypeType2 result = TargetTypeType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTargetTypeType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrimmingType createTrimmingTypeFromString(EDataType eDataType, String initialValue) {
		TrimmingType result = TrimmingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTrimmingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeTypeFromString(EDataType eDataType, String initialValue) {
		TypeType result = TypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType1 createTypeType1FromString(EDataType eDataType, String initialValue) {
		TypeType1 result = TypeType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType2 createTypeType2FromString(EDataType eDataType, String initialValue) {
		TypeType2 result = TypeType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType3 createTypeType3FromString(EDataType eDataType, String initialValue) {
		TypeType3 result = TypeType3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeType3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType4 createTypeType4FromString(EDataType eDataType, String initialValue) {
		TypeType4 result = TypeType4.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeType4ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType5 createTypeType5FromString(EDataType eDataType, String initialValue) {
		TypeType5 result = TypeType5.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeType5ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType7 createTypeType7FromString(EDataType eDataType, String initialValue) {
		TypeType7 result = TypeType7.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeType7ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType8 createTypeType8FromString(EDataType eDataType, String initialValue) {
		TypeType8 result = TypeType8.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeType8ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType9 createTypeType9FromString(EDataType eDataType, String initialValue) {
		TypeType9 result = TypeType9.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeType9ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType10 createTypeType10FromString(EDataType eDataType, String initialValue) {
		TypeType10 result = TypeType10.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeType10ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType11 createTypeType11FromString(EDataType eDataType, String initialValue) {
		TypeType11 result = TypeType11.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeType11ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType12 createTypeType12FromString(EDataType eDataType, String initialValue) {
		TypeType12 result = TypeType12.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeType12ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType13 createTypeType13FromString(EDataType eDataType, String initialValue) {
		TypeType13 result = TypeType13.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeType13ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownMemberEnumType createUnknownMemberEnumTypeFromString(EDataType eDataType, String initialValue) {
		UnknownMemberEnumType result = UnknownMemberEnumType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnknownMemberEnumTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateIsolationLevelType createUpdateIsolationLevelTypeFromString(EDataType eDataType, String initialValue) {
		UpdateIsolationLevelType result = UpdateIsolationLevelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpdateIsolationLevelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageType createUsageTypeFromString(EDataType eDataType, String initialValue) {
		UsageType result = UsageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUsageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageType1 createUsageType1FromString(EDataType eDataType, String initialValue) {
		UsageType1 result = UsageType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUsageType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuensType createValuensTypeFromString(EDataType eDataType, String initialValue) {
		ValuensType result = ValuensType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValuensTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuensType1 createValuensType1FromString(EDataType eDataType, String initialValue) {
		ValuensType1 result = ValuensType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValuensType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuensType2 createValuensType2FromString(EDataType eDataType, String initialValue) {
		ValuensType2 result = ValuensType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValuensType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuensType3 createValuensType3FromString(EDataType eDataType, String initialValue) {
		ValuensType3 result = ValuensType3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValuensType3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuensType4 createValuensType4FromString(EDataType eDataType, String initialValue) {
		ValuensType4 result = ValuensType4.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValuensType4ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuensType5 createValuensType5FromString(EDataType eDataType, String initialValue) {
		ValuensType5 result = ValuensType5.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValuensType5ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuensType6 createValuensType6FromString(EDataType eDataType, String initialValue) {
		ValuensType6 result = ValuensType6.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValuensType6ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityType createVisibilityTypeFromString(EDataType eDataType, String initialValue) {
		VisibilityType result = VisibilityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualModeType createVisualModeTypeFromString(EDataType eDataType, String initialValue) {
		VisualModeType result = VisualModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisualModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteBackTableCreation createWriteBackTableCreationFromString(EDataType eDataType, String initialValue) {
		WriteBackTableCreation result = WriteBackTableCreation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWriteBackTableCreationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteType createWriteTypeFromString(EDataType eDataType, String initialValue) {
		WriteType result = WriteType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWriteTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteType1 createWriteType1FromString(EDataType eDataType, String initialValue) {
		WriteType1 result = WriteType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWriteType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteType2 createWriteType2FromString(EDataType eDataType, String initialValue) {
		WriteType2 result = WriteType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWriteType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteType3 createWriteType3FromString(EDataType eDataType, String initialValue) {
		WriteType3 result = WriteType3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWriteType3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteType4 createWriteType4FromString(EDataType eDataType, String initialValue) {
		WriteType4 result = WriteType4.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWriteType4ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteType5 createWriteType5FromString(EDataType eDataType, String initialValue) {
		WriteType5 result = WriteType5.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWriteType5ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteType6 createWriteType6FromString(EDataType eDataType, String initialValue) {
		WriteType6 result = WriteType6.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWriteType6ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessType createAccessTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAccessTypeFromString(XmlaPackage.Literals.ACCESS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAccessTypeToString(XmlaPackage.Literals.ACCESS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateFunctionType createAggregateFunctionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAggregateFunctionTypeFromString(XmlaPackage.Literals.AGGREGATE_FUNCTION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregateFunctionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAggregateFunctionTypeToString(XmlaPackage.Literals.AGGREGATE_FUNCTION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationFunctionType createAggregationFunctionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAggregationFunctionTypeFromString(XmlaPackage.Literals.AGGREGATION_FUNCTION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationFunctionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAggregationFunctionTypeToString(XmlaPackage.Literals.AGGREGATION_FUNCTION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationStorageType createAggregationStorageTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAggregationStorageTypeFromString(XmlaPackage.Literals.AGGREGATION_STORAGE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationStorageTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAggregationStorageTypeToString(XmlaPackage.Literals.AGGREGATION_STORAGE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationTypeType createAggregationTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAggregationTypeTypeFromString(XmlaPackage.Literals.AGGREGATION_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAggregationTypeTypeToString(XmlaPackage.Literals.AGGREGATION_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationUsageType createAggregationUsageTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAggregationUsageTypeFromString(XmlaPackage.Literals.AGGREGATION_USAGE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationUsageTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAggregationUsageTypeToString(XmlaPackage.Literals.AGGREGATION_USAGE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgorithmType createAlgorithmTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAlgorithmTypeFromString(XmlaPackage.Literals.ALGORITHM_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlgorithmTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAlgorithmTypeToString(XmlaPackage.Literals.ALGORITHM_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllMemberAggregationUsageType createAllMemberAggregationUsageTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAllMemberAggregationUsageTypeFromString(XmlaPackage.Literals.ALL_MEMBER_AGGREGATION_USAGE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllMemberAggregationUsageTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAllMemberAggregationUsageTypeToString(XmlaPackage.Literals.ALL_MEMBER_AGGREGATION_USAGE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeHierarchyOptimizedStateType createAttributeHierarchyOptimizedStateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAttributeHierarchyOptimizedStateTypeFromString(XmlaPackage.Literals.ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeHierarchyOptimizedStateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAttributeHierarchyOptimizedStateTypeToString(XmlaPackage.Literals.ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeHierarchyOptimizedStateType1 createAttributeHierarchyOptimizedStateTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createAttributeHierarchyOptimizedStateType1FromString(XmlaPackage.Literals.ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeHierarchyOptimizedStateTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertAttributeHierarchyOptimizedStateType1ToString(XmlaPackage.Literals.ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisFormatType createAxisFormatTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAxisFormatTypeFromString(XmlaPackage.Literals.AXIS_FORMAT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAxisFormatTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAxisFormatTypeToString(XmlaPackage.Literals.AXIS_FORMAT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheModeType createCacheModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCacheModeTypeFromString(XmlaPackage.Literals.CACHE_MODE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCacheModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCacheModeTypeToString(XmlaPackage.Literals.CACHE_MODE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculationTypeType createCalculationTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCalculationTypeTypeFromString(XmlaPackage.Literals.CALCULATION_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalculationTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCalculationTypeTypeToString(XmlaPackage.Literals.CALCULATION_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardinalityType createCardinalityTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCardinalityTypeFromString(XmlaPackage.Literals.CARDINALITY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCardinalityTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCardinalityTypeToString(XmlaPackage.Literals.CARDINALITY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardinalityType1 createCardinalityTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createCardinalityType1FromString(XmlaPackage.Literals.CARDINALITY_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCardinalityTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertCardinalityType1ToString(XmlaPackage.Literals.CARDINALITY_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogLocationType createCatalogLocationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCatalogLocationTypeFromString(XmlaPackage.Literals.CATALOG_LOCATION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCatalogLocationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCatalogLocationTypeToString(XmlaPackage.Literals.CATALOG_LOCATION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionStringSecurityType createConnectionStringSecurityTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createConnectionStringSecurityTypeFromString(XmlaPackage.Literals.CONNECTION_STRING_SECURITY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectionStringSecurityTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConnectionStringSecurityTypeToString(XmlaPackage.Literals.CONNECTION_STRING_SECURITY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentType createContentTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createContentTypeFromString(XmlaPackage.Literals.CONTENT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContentTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertContentTypeToString(XmlaPackage.Literals.CONTENT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentType1 createContentTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createContentType1FromString(XmlaPackage.Literals.CONTENT_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContentTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertContentType1ToString(XmlaPackage.Literals.CONTENT_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CubeStorageModeEnumType createCubeStorageModeEnumTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCubeStorageModeEnumTypeFromString(XmlaPackage.Literals.CUBE_STORAGE_MODE_ENUM_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCubeStorageModeEnumTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCubeStorageModeEnumTypeToString(XmlaPackage.Literals.CUBE_STORAGE_MODE_ENUM_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAggregationType createDataAggregationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDataAggregationTypeFromString(XmlaPackage.Literals.DATA_AGGREGATION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataAggregationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDataAggregationTypeToString(XmlaPackage.Literals.DATA_AGGREGATION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeType createDataTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDataTypeTypeFromString(XmlaPackage.Literals.DATA_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDataTypeTypeToString(XmlaPackage.Literals.DATA_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeType1 createDataTypeTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createDataTypeType1FromString(XmlaPackage.Literals.DATA_TYPE_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertDataTypeType1ToString(XmlaPackage.Literals.DATA_TYPE_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropConcatNullBehaviorType createDbpropConcatNullBehaviorTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDbpropConcatNullBehaviorTypeFromString(XmlaPackage.Literals.DBPROP_CONCAT_NULL_BEHAVIOR_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropConcatNullBehaviorTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDbpropConcatNullBehaviorTypeToString(XmlaPackage.Literals.DBPROP_CONCAT_NULL_BEHAVIOR_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropMsmdAutoExistsType createDbpropMsmdAutoExistsTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDbpropMsmdAutoExistsTypeFromString(XmlaPackage.Literals.DBPROP_MSMD_AUTO_EXISTS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropMsmdAutoExistsTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDbpropMsmdAutoExistsTypeToString(XmlaPackage.Literals.DBPROP_MSMD_AUTO_EXISTS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropMsmdCompareCaseSensitiveStringFlagsType createDbpropMsmdCompareCaseSensitiveStringFlagsTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDbpropMsmdCompareCaseSensitiveStringFlagsTypeFromString(XmlaPackage.Literals.DBPROP_MSMD_COMPARE_CASE_SENSITIVE_STRING_FLAGS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropMsmdCompareCaseSensitiveStringFlagsTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDbpropMsmdCompareCaseSensitiveStringFlagsTypeToString(XmlaPackage.Literals.DBPROP_MSMD_COMPARE_CASE_SENSITIVE_STRING_FLAGS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropMsmdMDXCompatibilityType createDbpropMsmdMDXCompatibilityTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDbpropMsmdMDXCompatibilityTypeFromString(XmlaPackage.Literals.DBPROP_MSMD_MDX_COMPATIBILITY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropMsmdMDXCompatibilityTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDbpropMsmdMDXCompatibilityTypeToString(XmlaPackage.Literals.DBPROP_MSMD_MDX_COMPATIBILITY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropMsmdSubqueriesType createDbpropMsmdSubqueriesTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDbpropMsmdSubqueriesTypeFromString(XmlaPackage.Literals.DBPROP_MSMD_SUBQUERIES_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropMsmdSubqueriesTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDbpropMsmdSubqueriesTypeToString(XmlaPackage.Literals.DBPROP_MSMD_SUBQUERIES_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropNullCollationType createDbpropNullCollationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDbpropNullCollationTypeFromString(XmlaPackage.Literals.DBPROP_NULL_COLLATION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropNullCollationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDbpropNullCollationTypeToString(XmlaPackage.Literals.DBPROP_NULL_COLLATION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropOutputParameterAvailableType createDbpropOutputParameterAvailableTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDbpropOutputParameterAvailableTypeFromString(XmlaPackage.Literals.DBPROP_OUTPUT_PARAMETER_AVAILABLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropOutputParameterAvailableTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDbpropOutputParameterAvailableTypeToString(XmlaPackage.Literals.DBPROP_OUTPUT_PARAMETER_AVAILABLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropPersistentIdTypeType createDbpropPersistentIdTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDbpropPersistentIdTypeTypeFromString(XmlaPackage.Literals.DBPROP_PERSISTENT_ID_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropPersistentIdTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDbpropPersistentIdTypeTypeToString(XmlaPackage.Literals.DBPROP_PERSISTENT_ID_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropPrepareAbortBehaviorType createDbpropPrepareAbortBehaviorTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDbpropPrepareAbortBehaviorTypeFromString(XmlaPackage.Literals.DBPROP_PREPARE_ABORT_BEHAVIOR_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropPrepareAbortBehaviorTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDbpropPrepareAbortBehaviorTypeToString(XmlaPackage.Literals.DBPROP_PREPARE_ABORT_BEHAVIOR_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropPrepareCommitBehaviorType createDbpropPrepareCommitBehaviorTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDbpropPrepareCommitBehaviorTypeFromString(XmlaPackage.Literals.DBPROP_PREPARE_COMMIT_BEHAVIOR_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropPrepareCommitBehaviorTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDbpropPrepareCommitBehaviorTypeToString(XmlaPackage.Literals.DBPROP_PREPARE_COMMIT_BEHAVIOR_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbpropQuotedIdentifierCaseType createDbpropQuotedIdentifierCaseTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDbpropQuotedIdentifierCaseTypeFromString(XmlaPackage.Literals.DBPROP_QUOTED_IDENTIFIER_CASE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbpropQuotedIdentifierCaseTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDbpropQuotedIdentifierCaseTypeToString(XmlaPackage.Literals.DBPROP_QUOTED_IDENTIFIER_CASE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DialectType createDialectTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDialectTypeFromString(XmlaPackage.Literals.DIALECT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDialectTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDialectTypeToString(XmlaPackage.Literals.DIALECT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionAttributeTypeEnumType createDimensionAttributeTypeEnumTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDimensionAttributeTypeEnumTypeFromString(XmlaPackage.Literals.DIMENSION_ATTRIBUTE_TYPE_ENUM_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDimensionAttributeTypeEnumTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDimensionAttributeTypeEnumTypeToString(XmlaPackage.Literals.DIMENSION_ATTRIBUTE_TYPE_ENUM_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionCurrentStorageModeEnumType createDimensionCurrentStorageModeEnumTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDimensionCurrentStorageModeEnumTypeFromString(XmlaPackage.Literals.DIMENSION_CURRENT_STORAGE_MODE_ENUM_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDimensionCurrentStorageModeEnumTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDimensionCurrentStorageModeEnumTypeToString(XmlaPackage.Literals.DIMENSION_CURRENT_STORAGE_MODE_ENUM_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscretizationMethodType createDiscretizationMethodTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDiscretizationMethodTypeFromString(XmlaPackage.Literals.DISCRETIZATION_METHOD_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiscretizationMethodTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDiscretizationMethodTypeToString(XmlaPackage.Literals.DISCRETIZATION_METHOD_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurabilityGuaranteeType createDurabilityGuaranteeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDurabilityGuaranteeTypeFromString(XmlaPackage.Literals.DURABILITY_GUARANTEE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDurabilityGuaranteeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDurabilityGuaranteeTypeToString(XmlaPackage.Literals.DURABILITY_GUARANTEE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditionType createEditionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createEditionTypeFromString(XmlaPackage.Literals.EDITION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEditionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEditionTypeToString(XmlaPackage.Literals.EDITION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createFirstDayOfWeekTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFirstDayOfWeekTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createFiscalFirstDayOfMonthTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFiscalFirstDayOfMonthTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createFiscalFirstMonthTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFiscalFirstMonthTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiscalYearNameType createFiscalYearNameTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFiscalYearNameTypeFromString(XmlaPackage.Literals.FISCAL_YEAR_NAME_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFiscalYearNameTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFiscalYearNameTypeToString(XmlaPackage.Literals.FISCAL_YEAR_NAME_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormatType createFormatTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFormatTypeFromString(XmlaPackage.Literals.FORMAT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormatTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFormatTypeToString(XmlaPackage.Literals.FORMAT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormatType1 createFormatTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createFormatType1FromString(XmlaPackage.Literals.FORMAT_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormatTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertFormatType1ToString(XmlaPackage.Literals.FORMAT_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupingBehaviorType createGroupingBehaviorTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createGroupingBehaviorTypeFromString(XmlaPackage.Literals.GROUPING_BEHAVIOR_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupingBehaviorTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGroupingBehaviorTypeToString(XmlaPackage.Literals.GROUPING_BEHAVIOR_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HideMemberIfType createHideMemberIfTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createHideMemberIfTypeFromString(XmlaPackage.Literals.HIDE_MEMBER_IF_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHideMemberIfTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHideMemberIfTypeToString(XmlaPackage.Literals.HIDE_MEMBER_IF_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HierarchyUniqueNameStyleType createHierarchyUniqueNameStyleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createHierarchyUniqueNameStyleTypeFromString(XmlaPackage.Literals.HIERARCHY_UNIQUE_NAME_STYLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHierarchyUniqueNameStyleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHierarchyUniqueNameStyleTypeToString(XmlaPackage.Literals.HIERARCHY_UNIQUE_NAME_STYLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIDTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIDTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIDType1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIDType1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSelectionType createInstanceSelectionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createInstanceSelectionTypeFromString(XmlaPackage.Literals.INSTANCE_SELECTION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstanceSelectionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInstanceSelectionTypeToString(XmlaPackage.Literals.INSTANCE_SELECTION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidXmlCharactersType createInvalidXmlCharactersTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createInvalidXmlCharactersTypeFromString(XmlaPackage.Literals.INVALID_XML_CHARACTERS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvalidXmlCharactersTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInvalidXmlCharactersTypeToString(XmlaPackage.Literals.INVALID_XML_CHARACTERS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocationType createInvocationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createInvocationTypeFromString(XmlaPackage.Literals.INVOCATION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvocationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInvocationTypeToString(XmlaPackage.Literals.INVOCATION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocationType1 createInvocationTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createInvocationType1FromString(XmlaPackage.Literals.INVOCATION_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvocationTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertInvocationType1ToString(XmlaPackage.Literals.INVOCATION_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocationType2 createInvocationTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createInvocationType2FromString(XmlaPackage.Literals.INVOCATION_TYPE2, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvocationTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertInvocationType2ToString(XmlaPackage.Literals.INVOCATION_TYPE2, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsolationType createIsolationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createIsolationTypeFromString(XmlaPackage.Literals.ISOLATION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIsolationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIsolationTypeToString(XmlaPackage.Literals.ISOLATION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyDuplicateType createKeyDuplicateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createKeyDuplicateTypeFromString(XmlaPackage.Literals.KEY_DUPLICATE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKeyDuplicateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertKeyDuplicateTypeToString(XmlaPackage.Literals.KEY_DUPLICATE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyErrorActionType createKeyErrorActionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createKeyErrorActionTypeFromString(XmlaPackage.Literals.KEY_ERROR_ACTION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKeyErrorActionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertKeyErrorActionTypeToString(XmlaPackage.Literals.KEY_ERROR_ACTION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyErrorLimitActionType createKeyErrorLimitActionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createKeyErrorLimitActionTypeFromString(XmlaPackage.Literals.KEY_ERROR_LIMIT_ACTION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKeyErrorLimitActionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertKeyErrorLimitActionTypeToString(XmlaPackage.Literals.KEY_ERROR_LIMIT_ACTION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyNotFoundType createKeyNotFoundTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createKeyNotFoundTypeFromString(XmlaPackage.Literals.KEY_NOT_FOUND_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKeyNotFoundTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertKeyNotFoundTypeToString(XmlaPackage.Literals.KEY_NOT_FOUND_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createManufacturingExtraMonthQuarterTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertManufacturingExtraMonthQuarterTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createManufacturingFirstMonthTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertManufacturingFirstMonthTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createManufacturingFirstWeekOfMonthTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertManufacturingFirstWeekOfMonthTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaterializationType createMaterializationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMaterializationTypeFromString(XmlaPackage.Literals.MATERIALIZATION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaterializationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMaterializationTypeToString(XmlaPackage.Literals.MATERIALIZATION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdpropAggregateCellUpdateType createMdpropAggregateCellUpdateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMdpropAggregateCellUpdateTypeFromString(XmlaPackage.Literals.MDPROP_AGGREGATE_CELL_UPDATE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMdpropAggregateCellUpdateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMdpropAggregateCellUpdateTypeToString(XmlaPackage.Literals.MDPROP_AGGREGATE_CELL_UPDATE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdpropFlatteningSupportType createMdpropFlatteningSupportTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMdpropFlatteningSupportTypeFromString(XmlaPackage.Literals.MDPROP_FLATTENING_SUPPORT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMdpropFlatteningSupportTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMdpropFlatteningSupportTypeToString(XmlaPackage.Literals.MDPROP_FLATTENING_SUPPORT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdpropMdxNonMeasureExpressionsType createMdpropMdxNonMeasureExpressionsTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMdpropMdxNonMeasureExpressionsTypeFromString(XmlaPackage.Literals.MDPROP_MDX_NON_MEASURE_EXPRESSIONS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMdpropMdxNonMeasureExpressionsTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMdpropMdxNonMeasureExpressionsTypeToString(XmlaPackage.Literals.MDPROP_MDX_NON_MEASURE_EXPRESSIONS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdpropMdxRangeRowsetType createMdpropMdxRangeRowsetTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMdpropMdxRangeRowsetTypeFromString(XmlaPackage.Literals.MDPROP_MDX_RANGE_ROWSET_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMdpropMdxRangeRowsetTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMdpropMdxRangeRowsetTypeToString(XmlaPackage.Literals.MDPROP_MDX_RANGE_ROWSET_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdpropMdxSlicerType createMdpropMdxSlicerTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMdpropMdxSlicerTypeFromString(XmlaPackage.Literals.MDPROP_MDX_SLICER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMdpropMdxSlicerTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMdpropMdxSlicerTypeToString(XmlaPackage.Literals.MDPROP_MDX_SLICER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdxMissingMemberModeType createMdxMissingMemberModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMdxMissingMemberModeTypeFromString(XmlaPackage.Literals.MDX_MISSING_MEMBER_MODE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMdxMissingMemberModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMdxMissingMemberModeTypeToString(XmlaPackage.Literals.MDX_MISSING_MEMBER_MODE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdxMissingMemberModeType1 createMdxMissingMemberModeTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createMdxMissingMemberModeType1FromString(XmlaPackage.Literals.MDX_MISSING_MEMBER_MODE_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMdxMissingMemberModeTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertMdxMissingMemberModeType1ToString(XmlaPackage.Literals.MDX_MISSING_MEMBER_MODE_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDXSupportType createMDXSupportTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMDXSupportTypeFromString(XmlaPackage.Literals.MDX_SUPPORT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMDXSupportTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMDXSupportTypeToString(XmlaPackage.Literals.MDX_SUPPORT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureGroupStorageModeEnumType createMeasureGroupStorageModeEnumTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMeasureGroupStorageModeEnumTypeFromString(XmlaPackage.Literals.MEASURE_GROUP_STORAGE_MODE_ENUM_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasureGroupStorageModeEnumTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMeasureGroupStorageModeEnumTypeToString(XmlaPackage.Literals.MEASURE_GROUP_STORAGE_MODE_ENUM_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MembersWithDataType createMembersWithDataTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMembersWithDataTypeFromString(XmlaPackage.Literals.MEMBERS_WITH_DATA_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMembersWithDataTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMembersWithDataTypeToString(XmlaPackage.Literals.MEMBERS_WITH_DATA_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemberUniqueNameStyleType createMemberUniqueNameStyleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMemberUniqueNameStyleTypeFromString(XmlaPackage.Literals.MEMBER_UNIQUE_NAME_STYLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMemberUniqueNameStyleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMemberUniqueNameStyleTypeToString(XmlaPackage.Literals.MEMBER_UNIQUE_NAME_STYLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryLockingModeType createMemoryLockingModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMemoryLockingModeTypeFromString(XmlaPackage.Literals.MEMORY_LOCKING_MODE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMemoryLockingModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMemoryLockingModeTypeToString(XmlaPackage.Literals.MEMORY_LOCKING_MODE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeType createModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createModeTypeFromString(XmlaPackage.Literals.MODE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertModeTypeToString(XmlaPackage.Literals.MODE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationTechniqueType createNotificationTechniqueTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createNotificationTechniqueTypeFromString(XmlaPackage.Literals.NOTIFICATION_TECHNIQUE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNotificationTechniqueTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNotificationTechniqueTypeToString(XmlaPackage.Literals.NOTIFICATION_TECHNIQUE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationTechniqueType1 createNotificationTechniqueTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createNotificationTechniqueType1FromString(XmlaPackage.Literals.NOTIFICATION_TECHNIQUE_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNotificationTechniqueTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertNotificationTechniqueType1ToString(XmlaPackage.Literals.NOTIFICATION_TECHNIQUE_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullKeyConvertedToUnknownType createNullKeyConvertedToUnknownTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createNullKeyConvertedToUnknownTypeFromString(XmlaPackage.Literals.NULL_KEY_CONVERTED_TO_UNKNOWN_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNullKeyConvertedToUnknownTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNullKeyConvertedToUnknownTypeToString(XmlaPackage.Literals.NULL_KEY_CONVERTED_TO_UNKNOWN_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullKeyNotAllowedType createNullKeyNotAllowedTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createNullKeyNotAllowedTypeFromString(XmlaPackage.Literals.NULL_KEY_NOT_ALLOWED_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNullKeyNotAllowedTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNullKeyNotAllowedTypeToString(XmlaPackage.Literals.NULL_KEY_NOT_ALLOWED_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullProcessingType createNullProcessingTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createNullProcessingTypeFromString(XmlaPackage.Literals.NULL_PROCESSING_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNullProcessingTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNullProcessingTypeToString(XmlaPackage.Literals.NULL_PROCESSING_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectExpansion createObjectExpansionObjectFromString(EDataType eDataType, String initialValue) {
		return createObjectExpansionFromString(XmlaPackage.Literals.OBJECT_EXPANSION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectExpansionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertObjectExpansionToString(XmlaPackage.Literals.OBJECT_EXPANSION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnlineModeType createOnlineModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createOnlineModeTypeFromString(XmlaPackage.Literals.ONLINE_MODE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOnlineModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOnlineModeTypeToString(XmlaPackage.Literals.ONLINE_MODE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimizedStateType createOptimizedStateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createOptimizedStateTypeFromString(XmlaPackage.Literals.OPTIMIZED_STATE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOptimizedStateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOptimizedStateTypeToString(XmlaPackage.Literals.OPTIMIZED_STATE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionalityType createOptionalityTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createOptionalityTypeFromString(XmlaPackage.Literals.OPTIONALITY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOptionalityTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOptionalityTypeToString(XmlaPackage.Literals.OPTIONALITY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderByType createOrderByTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createOrderByTypeFromString(XmlaPackage.Literals.ORDER_BY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderByTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOrderByTypeToString(XmlaPackage.Literals.ORDER_BY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverrideBehaviorType createOverrideBehaviorTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createOverrideBehaviorTypeFromString(XmlaPackage.Literals.OVERRIDE_BEHAVIOR_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOverrideBehaviorTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOverrideBehaviorTypeToString(XmlaPackage.Literals.OVERRIDE_BEHAVIOR_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType createParameterTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createParameterTypeFromString(XmlaPackage.Literals.PARAMETER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertParameterTypeToString(XmlaPackage.Literals.PARAMETER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType1 createParameterTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createParameterType1FromString(XmlaPackage.Literals.PARAMETER_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertParameterType1ToString(XmlaPackage.Literals.PARAMETER_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionCurrentStorageModeEnumType createPartitionCurrentStorageModeEnumTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPartitionCurrentStorageModeEnumTypeFromString(XmlaPackage.Literals.PARTITION_CURRENT_STORAGE_MODE_ENUM_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPartitionCurrentStorageModeEnumTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPartitionCurrentStorageModeEnumTypeToString(XmlaPackage.Literals.PARTITION_CURRENT_STORAGE_MODE_ENUM_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionModes createPartitionModesObjectFromString(EDataType eDataType, String initialValue) {
		return createPartitionModesFromString(XmlaPackage.Literals.PARTITION_MODES, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPartitionModesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPartitionModesToString(XmlaPackage.Literals.PARTITION_MODES, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionStorageModeEnumType createPartitionStorageModeEnumTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPartitionStorageModeEnumTypeFromString(XmlaPackage.Literals.PARTITION_STORAGE_MODE_ENUM_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPartitionStorageModeEnumTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPartitionStorageModeEnumTypeToString(XmlaPackage.Literals.PARTITION_STORAGE_MODE_ENUM_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionSetType createPermissionSetTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPermissionSetTypeFromString(XmlaPackage.Literals.PERMISSION_SET_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPermissionSetTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPermissionSetTypeToString(XmlaPackage.Literals.PERMISSION_SET_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceType createPersistenceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPersistenceTypeFromString(XmlaPackage.Literals.PERSISTENCE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersistenceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPersistenceTypeToString(XmlaPackage.Literals.PERSISTENCE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceType1 createPersistenceTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createPersistenceType1FromString(XmlaPackage.Literals.PERSISTENCE_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersistenceTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertPersistenceType1ToString(XmlaPackage.Literals.PERSISTENCE_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingGroupType createProcessingGroupTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createProcessingGroupTypeFromString(XmlaPackage.Literals.PROCESSING_GROUP_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessingGroupTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProcessingGroupTypeToString(XmlaPackage.Literals.PROCESSING_GROUP_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingModeType createProcessingModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createProcessingModeTypeFromString(XmlaPackage.Literals.PROCESSING_MODE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessingModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProcessingModeTypeToString(XmlaPackage.Literals.PROCESSING_MODE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingModeType2 createProcessingModeTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createProcessingModeType2FromString(XmlaPackage.Literals.PROCESSING_MODE_TYPE2, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessingModeTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertProcessingModeType2ToString(XmlaPackage.Literals.PROCESSING_MODE_TYPE2, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingModeType1 createProcessingModeTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createProcessingModeType1FromString(XmlaPackage.Literals.PROCESSING_MODE_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessingModeTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertProcessingModeType1ToString(XmlaPackage.Literals.PROCESSING_MODE_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingModeType3 createProcessingModeTypeObject3FromString(EDataType eDataType, String initialValue) {
		return createProcessingModeType3FromString(XmlaPackage.Literals.PROCESSING_MODE_TYPE3, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessingModeTypeObject3ToString(EDataType eDataType, Object instanceValue) {
		return convertProcessingModeType3ToString(XmlaPackage.Literals.PROCESSING_MODE_TYPE3, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingStateType createProcessingStateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createProcessingStateTypeFromString(XmlaPackage.Literals.PROCESSING_STATE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessingStateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProcessingStateTypeToString(XmlaPackage.Literals.PROCESSING_STATE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderTypeType createProviderTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createProviderTypeTypeFromString(XmlaPackage.Literals.PROVIDER_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProviderTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProviderTypeTypeToString(XmlaPackage.Literals.PROVIDER_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadDefinitionType createReadDefinitionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createReadDefinitionTypeFromString(XmlaPackage.Literals.READ_DEFINITION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReadDefinitionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReadDefinitionTypeToString(XmlaPackage.Literals.READ_DEFINITION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadSourceDataType createReadSourceDataTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createReadSourceDataTypeFromString(XmlaPackage.Literals.READ_SOURCE_DATA_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReadSourceDataTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReadSourceDataTypeToString(XmlaPackage.Literals.READ_SOURCE_DATA_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadType createReadTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createReadTypeFromString(XmlaPackage.Literals.READ_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReadTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReadTypeToString(XmlaPackage.Literals.READ_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadType1 createReadTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createReadType1FromString(XmlaPackage.Literals.READ_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReadTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertReadType1ToString(XmlaPackage.Literals.READ_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefreshPolicyType createRefreshPolicyTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRefreshPolicyTypeFromString(XmlaPackage.Literals.REFRESH_POLICY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRefreshPolicyTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRefreshPolicyTypeToString(XmlaPackage.Literals.REFRESH_POLICY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefreshPolicyType1 createRefreshPolicyTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createRefreshPolicyType1FromString(XmlaPackage.Literals.REFRESH_POLICY_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRefreshPolicyTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertRefreshPolicyType1ToString(XmlaPackage.Literals.REFRESH_POLICY_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipTypeType createRelationshipTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRelationshipTypeTypeFromString(XmlaPackage.Literals.RELATIONSHIP_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationshipTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRelationshipTypeTypeToString(XmlaPackage.Literals.RELATIONSHIP_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createReportingFirstMonthTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReportingFirstMonthTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportingFirstWeekOfMonthType createReportingFirstWeekOfMonthTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createReportingFirstWeekOfMonthTypeFromString(XmlaPackage.Literals.REPORTING_FIRST_WEEK_OF_MONTH_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReportingFirstWeekOfMonthTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReportingFirstWeekOfMonthTypeToString(XmlaPackage.Literals.REPORTING_FIRST_WEEK_OF_MONTH_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportingWeekToMonthPatternType createReportingWeekToMonthPatternTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createReportingWeekToMonthPatternTypeFromString(XmlaPackage.Literals.REPORTING_WEEK_TO_MONTH_PATTERN_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReportingWeekToMonthPatternTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReportingWeekToMonthPatternTypeToString(XmlaPackage.Literals.REPORTING_WEEK_TO_MONTH_PATTERN_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestTypeType createRequestTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRequestTypeTypeFromString(XmlaPackage.Literals.REQUEST_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRequestTypeTypeToString(XmlaPackage.Literals.REQUEST_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseEncodingType createResponseEncodingTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createResponseEncodingTypeFromString(XmlaPackage.Literals.RESPONSE_ENCODING_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResponseEncodingTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResponseEncodingTypeToString(XmlaPackage.Literals.RESPONSE_ENCODING_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RetentionModes createRetentionModesObjectFromString(EDataType eDataType, String initialValue) {
		return createRetentionModesFromString(XmlaPackage.Literals.RETENTION_MODES, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRetentionModesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRetentionModesToString(XmlaPackage.Literals.RETENTION_MODES, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootMemberIfType createRootMemberIfTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRootMemberIfTypeFromString(XmlaPackage.Literals.ROOT_MEMBER_IF_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRootMemberIfTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRootMemberIfTypeToString(XmlaPackage.Literals.ROOT_MEMBER_IF_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyOptionsType createSafetyOptionsTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSafetyOptionsTypeFromString(XmlaPackage.Literals.SAFETY_OPTIONS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSafetyOptionsTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSafetyOptionsTypeToString(XmlaPackage.Literals.SAFETY_OPTIONS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope createScopeObjectFromString(EDataType eDataType, String initialValue) {
		return createScopeFromString(XmlaPackage.Literals.SCOPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertScopeToString(XmlaPackage.Literals.SCOPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptCacheProcessingModeType createScriptCacheProcessingModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createScriptCacheProcessingModeTypeFromString(XmlaPackage.Literals.SCRIPT_CACHE_PROCESSING_MODE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScriptCacheProcessingModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertScriptCacheProcessingModeTypeToString(XmlaPackage.Literals.SCRIPT_CACHE_PROCESSING_MODE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptErrorHandlingModeType createScriptErrorHandlingModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createScriptErrorHandlingModeTypeFromString(XmlaPackage.Literals.SCRIPT_ERROR_HANDLING_MODE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScriptErrorHandlingModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertScriptErrorHandlingModeTypeToString(XmlaPackage.Literals.SCRIPT_ERROR_HANDLING_MODE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecuredCellValueType createSecuredCellValueTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSecuredCellValueTypeFromString(XmlaPackage.Literals.SECURED_CELL_VALUE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSecuredCellValueTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSecuredCellValueTypeToString(XmlaPackage.Literals.SECURED_CELL_VALUE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityType createSecurityTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSecurityTypeFromString(XmlaPackage.Literals.SECURITY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSecurityTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSecurityTypeToString(XmlaPackage.Literals.SECURITY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityType1 createSecurityTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createSecurityType1FromString(XmlaPackage.Literals.SECURITY_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSecurityTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertSecurityType1ToString(XmlaPackage.Literals.SECURITY_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShareDimensionStorageType createShareDimensionStorageTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createShareDimensionStorageTypeFromString(XmlaPackage.Literals.SHARE_DIMENSION_STORAGE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShareDimensionStorageTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertShareDimensionStorageTypeToString(XmlaPackage.Literals.SHARE_DIMENSION_STORAGE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQLQueryModeType createSQLQueryModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSQLQueryModeTypeFromString(XmlaPackage.Literals.SQL_QUERY_MODE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSQLQueryModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSQLQueryModeTypeToString(XmlaPackage.Literals.SQL_QUERY_MODE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateSupportType createStateSupportTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createStateSupportTypeFromString(XmlaPackage.Literals.STATE_SUPPORT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateSupportTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStateSupportTypeToString(XmlaPackage.Literals.STATE_SUPPORT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateType createStateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createStateTypeFromString(XmlaPackage.Literals.STATE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStateTypeToString(XmlaPackage.Literals.STATE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateType4 createStateTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createStateType4FromString(XmlaPackage.Literals.STATE_TYPE4, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertStateType4ToString(XmlaPackage.Literals.STATE_TYPE4, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateType5 createStateTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createStateType5FromString(XmlaPackage.Literals.STATE_TYPE5, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertStateType5ToString(XmlaPackage.Literals.STATE_TYPE5, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateType1 createStateTypeObject3FromString(EDataType eDataType, String initialValue) {
		return createStateType1FromString(XmlaPackage.Literals.STATE_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateTypeObject3ToString(EDataType eDataType, Object instanceValue) {
		return convertStateType1ToString(XmlaPackage.Literals.STATE_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateType3 createStateTypeObject4FromString(EDataType eDataType, String initialValue) {
		return createStateType3FromString(XmlaPackage.Literals.STATE_TYPE3, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateTypeObject4ToString(EDataType eDataType, Object instanceValue) {
		return convertStateType3ToString(XmlaPackage.Literals.STATE_TYPE3, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateType2 createStateTypeObject5FromString(EDataType eDataType, String initialValue) {
		return createStateType2FromString(XmlaPackage.Literals.STATE_TYPE2, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateTypeObject5ToString(EDataType eDataType, Object instanceValue) {
		return convertStateType2ToString(XmlaPackage.Literals.STATE_TYPE2, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateType6 createStateTypeObject6FromString(EDataType eDataType, String initialValue) {
		return createStateType6FromString(XmlaPackage.Literals.STATE_TYPE6, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateTypeObject6ToString(EDataType eDataType, Object instanceValue) {
		return convertStateType6ToString(XmlaPackage.Literals.STATE_TYPE6, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageModeType1 createStorageModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createStorageModeType1FromString(XmlaPackage.Literals.STORAGE_MODE_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStorageModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStorageModeType1ToString(XmlaPackage.Literals.STORAGE_MODE_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizeSecurityType createSynchronizeSecurityTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSynchronizeSecurityTypeFromString(XmlaPackage.Literals.SYNCHRONIZE_SECURITY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSynchronizeSecurityTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSynchronizeSecurityTypeToString(XmlaPackage.Literals.SYNCHRONIZE_SECURITY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetTypeType1 createTargetTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTargetTypeType1FromString(XmlaPackage.Literals.TARGET_TYPE_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTargetTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTargetTypeType1ToString(XmlaPackage.Literals.TARGET_TYPE_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetTypeType createTargetTypeTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createTargetTypeTypeFromString(XmlaPackage.Literals.TARGET_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTargetTypeTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertTargetTypeTypeToString(XmlaPackage.Literals.TARGET_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetTypeType2 createTargetTypeTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createTargetTypeType2FromString(XmlaPackage.Literals.TARGET_TYPE_TYPE2, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTargetTypeTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertTargetTypeType2ToString(XmlaPackage.Literals.TARGET_TYPE_TYPE2, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrimmingType createTrimmingTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTrimmingTypeFromString(XmlaPackage.Literals.TRIMMING_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTrimmingTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTrimmingTypeToString(XmlaPackage.Literals.TRIMMING_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType4 createTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeType4FromString(XmlaPackage.Literals.TYPE_TYPE4, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeType4ToString(XmlaPackage.Literals.TYPE_TYPE4, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType5 createTypeTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createTypeType5FromString(XmlaPackage.Literals.TYPE_TYPE5, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeType5ToString(XmlaPackage.Literals.TYPE_TYPE5, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType2 createTypeTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createTypeType2FromString(XmlaPackage.Literals.TYPE_TYPE2, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeType2ToString(XmlaPackage.Literals.TYPE_TYPE2, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType1 createTypeTypeObject3FromString(EDataType eDataType, String initialValue) {
		return createTypeType1FromString(XmlaPackage.Literals.TYPE_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObject3ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeType1ToString(XmlaPackage.Literals.TYPE_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType12 createTypeTypeObject4FromString(EDataType eDataType, String initialValue) {
		return createTypeType12FromString(XmlaPackage.Literals.TYPE_TYPE12, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObject4ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeType12ToString(XmlaPackage.Literals.TYPE_TYPE12, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeTypeObject5FromString(EDataType eDataType, String initialValue) {
		return createTypeTypeFromString(XmlaPackage.Literals.TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObject5ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeTypeToString(XmlaPackage.Literals.TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType3 createTypeTypeObject6FromString(EDataType eDataType, String initialValue) {
		return createTypeType3FromString(XmlaPackage.Literals.TYPE_TYPE3, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObject6ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeType3ToString(XmlaPackage.Literals.TYPE_TYPE3, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType9 createTypeTypeObject7FromString(EDataType eDataType, String initialValue) {
		return createTypeType9FromString(XmlaPackage.Literals.TYPE_TYPE9, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObject7ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeType9ToString(XmlaPackage.Literals.TYPE_TYPE9, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType8 createTypeTypeObject8FromString(EDataType eDataType, String initialValue) {
		return createTypeType8FromString(XmlaPackage.Literals.TYPE_TYPE8, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObject8ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeType8ToString(XmlaPackage.Literals.TYPE_TYPE8, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType7 createTypeTypeObject9FromString(EDataType eDataType, String initialValue) {
		return createTypeType7FromString(XmlaPackage.Literals.TYPE_TYPE7, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObject9ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeType7ToString(XmlaPackage.Literals.TYPE_TYPE7, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType10 createTypeTypeObject10FromString(EDataType eDataType, String initialValue) {
		return createTypeType10FromString(XmlaPackage.Literals.TYPE_TYPE10, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObject10ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeType10ToString(XmlaPackage.Literals.TYPE_TYPE10, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType11 createTypeTypeObject11FromString(EDataType eDataType, String initialValue) {
		return createTypeType11FromString(XmlaPackage.Literals.TYPE_TYPE11, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObject11ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeType11ToString(XmlaPackage.Literals.TYPE_TYPE11, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType13 createTypeTypeObject12FromString(EDataType eDataType, String initialValue) {
		return createTypeType13FromString(XmlaPackage.Literals.TYPE_TYPE13, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObject12ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeType13ToString(XmlaPackage.Literals.TYPE_TYPE13, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownMemberEnumType createUnknownMemberEnumTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createUnknownMemberEnumTypeFromString(XmlaPackage.Literals.UNKNOWN_MEMBER_ENUM_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnknownMemberEnumTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUnknownMemberEnumTypeToString(XmlaPackage.Literals.UNKNOWN_MEMBER_ENUM_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateIsolationLevelType createUpdateIsolationLevelTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createUpdateIsolationLevelTypeFromString(XmlaPackage.Literals.UPDATE_ISOLATION_LEVEL_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpdateIsolationLevelTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUpdateIsolationLevelTypeToString(XmlaPackage.Literals.UPDATE_ISOLATION_LEVEL_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageType createUsageTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createUsageTypeFromString(XmlaPackage.Literals.USAGE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUsageTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUsageTypeToString(XmlaPackage.Literals.USAGE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageType1 createUsageTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createUsageType1FromString(XmlaPackage.Literals.USAGE_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUsageTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertUsageType1ToString(XmlaPackage.Literals.USAGE_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuensType1 createValuensTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createValuensType1FromString(XmlaPackage.Literals.VALUENS_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValuensTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertValuensType1ToString(XmlaPackage.Literals.VALUENS_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuensType2 createValuensTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createValuensType2FromString(XmlaPackage.Literals.VALUENS_TYPE2, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValuensTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertValuensType2ToString(XmlaPackage.Literals.VALUENS_TYPE2, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuensType createValuensTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createValuensTypeFromString(XmlaPackage.Literals.VALUENS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValuensTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertValuensTypeToString(XmlaPackage.Literals.VALUENS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuensType4 createValuensTypeObject3FromString(EDataType eDataType, String initialValue) {
		return createValuensType4FromString(XmlaPackage.Literals.VALUENS_TYPE4, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValuensTypeObject3ToString(EDataType eDataType, Object instanceValue) {
		return convertValuensType4ToString(XmlaPackage.Literals.VALUENS_TYPE4, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuensType3 createValuensTypeObject4FromString(EDataType eDataType, String initialValue) {
		return createValuensType3FromString(XmlaPackage.Literals.VALUENS_TYPE3, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValuensTypeObject4ToString(EDataType eDataType, Object instanceValue) {
		return convertValuensType3ToString(XmlaPackage.Literals.VALUENS_TYPE3, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuensType5 createValuensTypeObject5FromString(EDataType eDataType, String initialValue) {
		return createValuensType5FromString(XmlaPackage.Literals.VALUENS_TYPE5, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValuensTypeObject5ToString(EDataType eDataType, Object instanceValue) {
		return convertValuensType5ToString(XmlaPackage.Literals.VALUENS_TYPE5, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuensType6 createValuensTypeObject6FromString(EDataType eDataType, String initialValue) {
		return createValuensType6FromString(XmlaPackage.Literals.VALUENS_TYPE6, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValuensTypeObject6ToString(EDataType eDataType, Object instanceValue) {
		return convertValuensType6ToString(XmlaPackage.Literals.VALUENS_TYPE6, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityType createVisibilityTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createVisibilityTypeFromString(XmlaPackage.Literals.VISIBILITY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVisibilityTypeToString(XmlaPackage.Literals.VISIBILITY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualModeType createVisualModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createVisualModeTypeFromString(XmlaPackage.Literals.VISUAL_MODE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisualModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVisualModeTypeToString(XmlaPackage.Literals.VISUAL_MODE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteBackTableCreation createWriteBackTableCreationObjectFromString(EDataType eDataType, String initialValue) {
		return createWriteBackTableCreationFromString(XmlaPackage.Literals.WRITE_BACK_TABLE_CREATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWriteBackTableCreationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertWriteBackTableCreationToString(XmlaPackage.Literals.WRITE_BACK_TABLE_CREATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteType createWriteTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createWriteTypeFromString(XmlaPackage.Literals.WRITE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWriteTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertWriteTypeToString(XmlaPackage.Literals.WRITE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteType2 createWriteTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createWriteType2FromString(XmlaPackage.Literals.WRITE_TYPE2, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWriteTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertWriteType2ToString(XmlaPackage.Literals.WRITE_TYPE2, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteType4 createWriteTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createWriteType4FromString(XmlaPackage.Literals.WRITE_TYPE4, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWriteTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertWriteType4ToString(XmlaPackage.Literals.WRITE_TYPE4, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteType1 createWriteTypeObject3FromString(EDataType eDataType, String initialValue) {
		return createWriteType1FromString(XmlaPackage.Literals.WRITE_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWriteTypeObject3ToString(EDataType eDataType, Object instanceValue) {
		return convertWriteType1ToString(XmlaPackage.Literals.WRITE_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteType5 createWriteTypeObject4FromString(EDataType eDataType, String initialValue) {
		return createWriteType5FromString(XmlaPackage.Literals.WRITE_TYPE5, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWriteTypeObject4ToString(EDataType eDataType, Object instanceValue) {
		return convertWriteType5ToString(XmlaPackage.Literals.WRITE_TYPE5, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteType3 createWriteTypeObject5FromString(EDataType eDataType, String initialValue) {
		return createWriteType3FromString(XmlaPackage.Literals.WRITE_TYPE3, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWriteTypeObject5ToString(EDataType eDataType, Object instanceValue) {
		return convertWriteType3ToString(XmlaPackage.Literals.WRITE_TYPE3, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteType6 createWriteTypeObject6FromString(EDataType eDataType, String initialValue) {
		return createWriteType6FromString(XmlaPackage.Literals.WRITE_TYPE6, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWriteTypeObject6ToString(EDataType eDataType, Object instanceValue) {
		return convertWriteType6ToString(XmlaPackage.Literals.WRITE_TYPE6, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlaPackage getXmlaPackage() {
		return (XmlaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XmlaPackage getPackage() {
		return XmlaPackage.eINSTANCE;
	}

} //XmlaFactoryImpl
