/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.util;

import java.math.BigInteger;

import java.util.Map;

import org.eclipse.daanse.xmla.model.ecore.xmla.AccessType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Account;
import org.eclipse.daanse.xmla.model.ecore.xmla.AccountsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Action;
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
import org.eclipse.daanse.xmla.model.ecore.xmla.AssembliesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AssembliesType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.Assembly;
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
import org.eclipse.daanse.xmla.model.ecore.xmla.Binding;
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
import org.eclipse.daanse.xmla.model.ecore.xmla.DataSource;
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
import org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupDimension;
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
import org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructureColumn;
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
import org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingIncrementalProcessingBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingInheritedBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingObjectNotificationBinding;
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
import org.eclipse.daanse.xmla.model.ecore.xmla.TabularBinding;
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
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage
 * @generated
 */
public class XmlaValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final XmlaValidator INSTANCE = new XmlaValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.daanse.xmla.model.ecore.xmla";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlaValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return XmlaPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case XmlaPackage.ACCOUNT:
				return validateAccount((Account)value, diagnostics, context);
			case XmlaPackage.ACCOUNTS_TYPE:
				return validateAccountsType((AccountsType)value, diagnostics, context);
			case XmlaPackage.ACTION:
				return validateAction((Action)value, diagnostics, context);
			case XmlaPackage.ACTIONS_TYPE:
				return validateActionsType((ActionsType)value, diagnostics, context);
			case XmlaPackage.ACTIONS_TYPE1:
				return validateActionsType1((ActionsType1)value, diagnostics, context);
			case XmlaPackage.ACTION_TYPE:
				return validateActionType((ActionType)value, diagnostics, context);
			case XmlaPackage.AGGREGATION:
				return validateAggregation((Aggregation)value, diagnostics, context);
			case XmlaPackage.AGGREGATION_ATTRIBUTE:
				return validateAggregationAttribute((AggregationAttribute)value, diagnostics, context);
			case XmlaPackage.AGGREGATION_DESIGN:
				return validateAggregationDesign((AggregationDesign)value, diagnostics, context);
			case XmlaPackage.AGGREGATION_DESIGN_ATTRIBUTE:
				return validateAggregationDesignAttribute((AggregationDesignAttribute)value, diagnostics, context);
			case XmlaPackage.AGGREGATION_DESIGN_DIMENSION:
				return validateAggregationDesignDimension((AggregationDesignDimension)value, diagnostics, context);
			case XmlaPackage.AGGREGATION_DESIGNS_TYPE:
				return validateAggregationDesignsType((AggregationDesignsType)value, diagnostics, context);
			case XmlaPackage.AGGREGATION_DIMENSION:
				return validateAggregationDimension((AggregationDimension)value, diagnostics, context);
			case XmlaPackage.AGGREGATION_INSTANCE:
				return validateAggregationInstance((AggregationInstance)value, diagnostics, context);
			case XmlaPackage.AGGREGATION_INSTANCE_ATTRIBUTE:
				return validateAggregationInstanceAttribute((AggregationInstanceAttribute)value, diagnostics, context);
			case XmlaPackage.AGGREGATION_INSTANCE_DIMENSION:
				return validateAggregationInstanceDimension((AggregationInstanceDimension)value, diagnostics, context);
			case XmlaPackage.AGGREGATION_INSTANCE_MEASURE:
				return validateAggregationInstanceMeasure((AggregationInstanceMeasure)value, diagnostics, context);
			case XmlaPackage.AGGREGATION_INSTANCES_TYPE:
				return validateAggregationInstancesType((AggregationInstancesType)value, diagnostics, context);
			case XmlaPackage.AGGREGATIONS_TYPE:
				return validateAggregationsType((AggregationsType)value, diagnostics, context);
			case XmlaPackage.ALGORITHM_PARAMETER:
				return validateAlgorithmParameter((AlgorithmParameter)value, diagnostics, context);
			case XmlaPackage.ALGORITHM_PARAMETERS_TYPE:
				return validateAlgorithmParametersType((AlgorithmParametersType)value, diagnostics, context);
			case XmlaPackage.ALIASES_TYPE:
				return validateAliasesType((AliasesType)value, diagnostics, context);
			case XmlaPackage.ALL_MEMBER_TRANSLATIONS_TYPE:
				return validateAllMemberTranslationsType((AllMemberTranslationsType)value, diagnostics, context);
			case XmlaPackage.ALTER:
				return validateAlter((Alter)value, diagnostics, context);
			case XmlaPackage.AND_OR_TYPE:
				return validateAndOrType((AndOrType)value, diagnostics, context);
			case XmlaPackage.ANNOTATION:
				return validateAnnotation((Annotation)value, diagnostics, context);
			case XmlaPackage.ANNOTATIONS_TYPE:
				return validateAnnotationsType((AnnotationsType)value, diagnostics, context);
			case XmlaPackage.ASSEMBLIES_TYPE:
				return validateAssembliesType((AssembliesType)value, diagnostics, context);
			case XmlaPackage.ASSEMBLIES_TYPE1:
				return validateAssembliesType1((AssembliesType1)value, diagnostics, context);
			case XmlaPackage.ASSEMBLY:
				return validateAssembly((Assembly)value, diagnostics, context);
			case XmlaPackage.ATTACH:
				return validateAttach((Attach)value, diagnostics, context);
			case XmlaPackage.ATTRIBUTE_ALL_MEMBER_TRANSLATIONS_TYPE:
				return validateAttributeAllMemberTranslationsType((AttributeAllMemberTranslationsType)value, diagnostics, context);
			case XmlaPackage.ATTRIBUTE_BINDING:
				return validateAttributeBinding((AttributeBinding)value, diagnostics, context);
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE:
				return validateAttributeInsertUpdate((AttributeInsertUpdate)value, diagnostics, context);
			case XmlaPackage.ATTRIBUTE_PERMISSION:
				return validateAttributePermission((AttributePermission)value, diagnostics, context);
			case XmlaPackage.ATTRIBUTE_PERMISSIONS_TYPE:
				return validateAttributePermissionsType((AttributePermissionsType)value, diagnostics, context);
			case XmlaPackage.ATTRIBUTE_PERMISSIONS_TYPE1:
				return validateAttributePermissionsType1((AttributePermissionsType1)value, diagnostics, context);
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP:
				return validateAttributeRelationship((AttributeRelationship)value, diagnostics, context);
			case XmlaPackage.ATTRIBUTE_RELATIONSHIPS_TYPE:
				return validateAttributeRelationshipsType((AttributeRelationshipsType)value, diagnostics, context);
			case XmlaPackage.ATTRIBUTES_TYPE:
				return validateAttributesType((AttributesType)value, diagnostics, context);
			case XmlaPackage.ATTRIBUTES_TYPE1:
				return validateAttributesType1((AttributesType1)value, diagnostics, context);
			case XmlaPackage.ATTRIBUTES_TYPE2:
				return validateAttributesType2((AttributesType2)value, diagnostics, context);
			case XmlaPackage.ATTRIBUTES_TYPE3:
				return validateAttributesType3((AttributesType3)value, diagnostics, context);
			case XmlaPackage.ATTRIBUTES_TYPE4:
				return validateAttributesType4((AttributesType4)value, diagnostics, context);
			case XmlaPackage.ATTRIBUTES_TYPE5:
				return validateAttributesType5((AttributesType5)value, diagnostics, context);
			case XmlaPackage.ATTRIBUTES_TYPE6:
				return validateAttributesType6((AttributesType6)value, diagnostics, context);
			case XmlaPackage.ATTRIBUTES_TYPE7:
				return validateAttributesType7((AttributesType7)value, diagnostics, context);
			case XmlaPackage.ATTRIBUTES_TYPE8:
				return validateAttributesType8((AttributesType8)value, diagnostics, context);
			case XmlaPackage.ATTRIBUTE_TRANSLATION:
				return validateAttributeTranslation((AttributeTranslation)value, diagnostics, context);
			case XmlaPackage.BACKUP:
				return validateBackup((Backup)value, diagnostics, context);
			case XmlaPackage.BATCH:
				return validateBatch((Batch)value, diagnostics, context);
			case XmlaPackage.BEGIN_SESSION_TYPE:
				return validateBeginSessionType((BeginSessionType)value, diagnostics, context);
			case XmlaPackage.BEGIN_TRANSACTION:
				return validateBeginTransaction((BeginTransaction)value, diagnostics, context);
			case XmlaPackage.BINDING:
				return validateBinding((Binding)value, diagnostics, context);
			case XmlaPackage.BINDINGS:
				return validateBindings((Bindings)value, diagnostics, context);
			case XmlaPackage.BOOL_BINOP:
				return validateBoolBinop((BoolBinop)value, diagnostics, context);
			case XmlaPackage.BOOLEAN_EXPR:
				return validateBooleanExpr((BooleanExpr)value, diagnostics, context);
			case XmlaPackage.CALCULATED_MEASURE_BINDING:
				return validateCalculatedMeasureBinding((CalculatedMeasureBinding)value, diagnostics, context);
			case XmlaPackage.CALCULATION_PROPERTIES_TYPE:
				return validateCalculationPropertiesType((CalculationPropertiesType)value, diagnostics, context);
			case XmlaPackage.CALCULATION_PROPERTY:
				return validateCalculationProperty((CalculationProperty)value, diagnostics, context);
			case XmlaPackage.CALCULATIONS_TYPE:
				return validateCalculationsType((CalculationsType)value, diagnostics, context);
			case XmlaPackage.CANCEL:
				return validateCancel((Cancel)value, diagnostics, context);
			case XmlaPackage.CELL:
				return validateCell((Cell)value, diagnostics, context);
			case XmlaPackage.CELL_PERMISSION:
				return validateCellPermission((CellPermission)value, diagnostics, context);
			case XmlaPackage.CELL_PERMISSIONS_TYPE:
				return validateCellPermissionsType((CellPermissionsType)value, diagnostics, context);
			case XmlaPackage.CLASSIFIED_COLUMNS_TYPE:
				return validateClassifiedColumnsType((ClassifiedColumnsType)value, diagnostics, context);
			case XmlaPackage.CLEAR_CACHE:
				return validateClearCache((ClearCache)value, diagnostics, context);
			case XmlaPackage.CLEAR_RESULT_TYPE:
				return validateClearResultType((ClearResultType)value, diagnostics, context);
			case XmlaPackage.CLONE_DATABASE:
				return validateCloneDatabase((CloneDatabase)value, diagnostics, context);
			case XmlaPackage.CLR_ASSEMBLY:
				return validateClrAssembly((ClrAssembly)value, diagnostics, context);
			case XmlaPackage.CLR_ASSEMBLY_FILE:
				return validateClrAssemblyFile((ClrAssemblyFile)value, diagnostics, context);
			case XmlaPackage.COLUMN_BINDING:
				return validateColumnBinding((ColumnBinding)value, diagnostics, context);
			case XmlaPackage.COLUMNS_TYPE:
				return validateColumnsType((ColumnsType)value, diagnostics, context);
			case XmlaPackage.COLUMNS_TYPE1:
				return validateColumnsType1((ColumnsType1)value, diagnostics, context);
			case XmlaPackage.COLUMNS_TYPE2:
				return validateColumnsType2((ColumnsType2)value, diagnostics, context);
			case XmlaPackage.COLUMNS_TYPE3:
				return validateColumnsType3((ColumnsType3)value, diagnostics, context);
			case XmlaPackage.COLUMNS_TYPE4:
				return validateColumnsType4((ColumnsType4)value, diagnostics, context);
			case XmlaPackage.COLUMN_TYPE:
				return validateColumnType((ColumnType)value, diagnostics, context);
			case XmlaPackage.COM_ASSEMBLY:
				return validateComAssembly((ComAssembly)value, diagnostics, context);
			case XmlaPackage.COMMAND:
				return validateCommand((Command)value, diagnostics, context);
			case XmlaPackage.COMMANDS_TYPE:
				return validateCommandsType((CommandsType)value, diagnostics, context);
			case XmlaPackage.COMMIT_TRANSACTION:
				return validateCommitTransaction((CommitTransaction)value, diagnostics, context);
			case XmlaPackage.COMPARATOR_TYPE:
				return validateComparatorType((ComparatorType)value, diagnostics, context);
			case XmlaPackage.CREATE:
				return validateCreate((Create)value, diagnostics, context);
			case XmlaPackage.CUBE:
				return validateCube((Cube)value, diagnostics, context);
			case XmlaPackage.CUBE_ATTRIBUTE:
				return validateCubeAttribute((CubeAttribute)value, diagnostics, context);
			case XmlaPackage.CUBE_ATTRIBUTE_BINDING:
				return validateCubeAttributeBinding((CubeAttributeBinding)value, diagnostics, context);
			case XmlaPackage.CUBE_DIMENSION:
				return validateCubeDimension((CubeDimension)value, diagnostics, context);
			case XmlaPackage.CUBE_DIMENSION_BINDING:
				return validateCubeDimensionBinding((CubeDimensionBinding)value, diagnostics, context);
			case XmlaPackage.CUBE_DIMENSION_PERMISSION:
				return validateCubeDimensionPermission((CubeDimensionPermission)value, diagnostics, context);
			case XmlaPackage.CUBE_HIERARCHY:
				return validateCubeHierarchy((CubeHierarchy)value, diagnostics, context);
			case XmlaPackage.CUBE_PERMISSION:
				return validateCubePermission((CubePermission)value, diagnostics, context);
			case XmlaPackage.CUBE_PERMISSIONS_TYPE:
				return validateCubePermissionsType((CubePermissionsType)value, diagnostics, context);
			case XmlaPackage.CUBES_TYPE:
				return validateCubesType((CubesType)value, diagnostics, context);
			case XmlaPackage.CURRENT_STORAGE_MODE_TYPE:
				return validateCurrentStorageModeType((CurrentStorageModeType)value, diagnostics, context);
			case XmlaPackage.CURRENT_STORAGE_MODE_TYPE1:
				return validateCurrentStorageModeType1((CurrentStorageModeType1)value, diagnostics, context);
			case XmlaPackage.CUSTOM_ROLLUP_COLUMN_TYPE:
				return validateCustomRollupColumnType((CustomRollupColumnType)value, diagnostics, context);
			case XmlaPackage.CUSTOM_ROLLUP_PROPERTIES_COLUMN_TYPE:
				return validateCustomRollupPropertiesColumnType((CustomRollupPropertiesColumnType)value, diagnostics, context);
			case XmlaPackage.DATABASE:
				return validateDatabase((Database)value, diagnostics, context);
			case XmlaPackage.DATABASE_PERMISSION:
				return validateDatabasePermission((DatabasePermission)value, diagnostics, context);
			case XmlaPackage.DATABASE_PERMISSIONS_TYPE:
				return validateDatabasePermissionsType((DatabasePermissionsType)value, diagnostics, context);
			case XmlaPackage.DATABASES_TYPE:
				return validateDatabasesType((DatabasesType)value, diagnostics, context);
			case XmlaPackage.DATA_BLOCK:
				return validateDataBlock((DataBlock)value, diagnostics, context);
			case XmlaPackage.DATA_ITEM:
				return validateDataItem((DataItem)value, diagnostics, context);
			case XmlaPackage.DATA_MINING_MEASURE_GROUP_DIMENSION:
				return validateDataMiningMeasureGroupDimension((DataMiningMeasureGroupDimension)value, diagnostics, context);
			case XmlaPackage.DATA_SOURCE:
				return validateDataSource((DataSource)value, diagnostics, context);
			case XmlaPackage.DATA_SOURCE_PERMISSION:
				return validateDataSourcePermission((DataSourcePermission)value, diagnostics, context);
			case XmlaPackage.DATA_SOURCE_PERMISSIONS_TYPE:
				return validateDataSourcePermissionsType((DataSourcePermissionsType)value, diagnostics, context);
			case XmlaPackage.DATA_SOURCES_TYPE:
				return validateDataSourcesType((DataSourcesType)value, diagnostics, context);
			case XmlaPackage.DATA_SOURCE_VIEW:
				return validateDataSourceView((DataSourceView)value, diagnostics, context);
			case XmlaPackage.DATA_SOURCE_VIEW_BINDING:
				return validateDataSourceViewBinding((DataSourceViewBinding)value, diagnostics, context);
			case XmlaPackage.DATA_SOURCE_VIEWS_TYPE:
				return validateDataSourceViewsType((DataSourceViewsType)value, diagnostics, context);
			case XmlaPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case XmlaPackage.DATA_TYPE1:
				return validateDataType1((DataType1)value, diagnostics, context);
			case XmlaPackage.DATA_TYPE2:
				return validateDataType2((DataType2)value, diagnostics, context);
			case XmlaPackage.DATA_TYPE3:
				return validateDataType3((DataType3)value, diagnostics, context);
			case XmlaPackage.DBCC:
				return validateDBCC((DBCC)value, diagnostics, context);
			case XmlaPackage.DEGENERATE_MEASURE_GROUP_DIMENSION:
				return validateDegenerateMeasureGroupDimension((DegenerateMeasureGroupDimension)value, diagnostics, context);
			case XmlaPackage.DELETE:
				return validateDelete((Delete)value, diagnostics, context);
			case XmlaPackage.DESIGN_AGGREGATIONS:
				return validateDesignAggregations((DesignAggregations)value, diagnostics, context);
			case XmlaPackage.DETACH:
				return validateDetach((Detach)value, diagnostics, context);
			case XmlaPackage.DIMENSION:
				return validateDimension((Dimension)value, diagnostics, context);
			case XmlaPackage.DIMENSION_ATTRIBUTE:
				return validateDimensionAttribute((DimensionAttribute)value, diagnostics, context);
			case XmlaPackage.DIMENSION_BINDING:
				return validateDimensionBinding((DimensionBinding)value, diagnostics, context);
			case XmlaPackage.DIMENSION_PERMISSION:
				return validateDimensionPermission((DimensionPermission)value, diagnostics, context);
			case XmlaPackage.DIMENSION_PERMISSIONS_TYPE:
				return validateDimensionPermissionsType((DimensionPermissionsType)value, diagnostics, context);
			case XmlaPackage.DIMENSION_PERMISSIONS_TYPE1:
				return validateDimensionPermissionsType1((DimensionPermissionsType1)value, diagnostics, context);
			case XmlaPackage.DIMENSIONS_TYPE:
				return validateDimensionsType((DimensionsType)value, diagnostics, context);
			case XmlaPackage.DISCOVER_RESPONSE_TYPE:
				return validateDiscoverResponseType((DiscoverResponseType)value, diagnostics, context);
			case XmlaPackage.DISCOVER_TYPE:
				return validateDiscoverType((DiscoverType)value, diagnostics, context);
			case XmlaPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case XmlaPackage.DRILL_THROUGH_ACTION:
				return validateDrillThroughAction((DrillThroughAction)value, diagnostics, context);
			case XmlaPackage.DROP:
				return validateDrop((Drop)value, diagnostics, context);
			case XmlaPackage.DSV_TABLE_BINDING:
				return validateDSVTableBinding((DSVTableBinding)value, diagnostics, context);
			case XmlaPackage.END_OF_DATA_TYPE:
				return validateEndOfDataType((EndOfDataType)value, diagnostics, context);
			case XmlaPackage.END_SESSION_TYPE:
				return validateEndSessionType((EndSessionType)value, diagnostics, context);
			case XmlaPackage.ERROR_CONFIGURATION:
				return validateErrorConfiguration((ErrorConfiguration)value, diagnostics, context);
			case XmlaPackage.EVENT:
				return validateEvent((Event)value, diagnostics, context);
			case XmlaPackage.EVENT_CATEGORY_TYPE:
				return validateEventCategoryType((EventCategoryType)value, diagnostics, context);
			case XmlaPackage.EVENT_COLUMN:
				return validateEventColumn((EventColumn)value, diagnostics, context);
			case XmlaPackage.EVENT_COLUMN_ID:
				return validateEventColumnID((EventColumnID)value, diagnostics, context);
			case XmlaPackage.EVENT_COLUMN_LIST_TYPE:
				return validateEventColumnListType((EventColumnListType)value, diagnostics, context);
			case XmlaPackage.EVENT_COLUMN_SUBCLASS_LIST_TYPE:
				return validateEventColumnSubclassListType((EventColumnSubclassListType)value, diagnostics, context);
			case XmlaPackage.EVENT_COLUMN_SUBCLASS_TYPE:
				return validateEventColumnSubclassType((EventColumnSubclassType)value, diagnostics, context);
			case XmlaPackage.EVENT_LIST_TYPE:
				return validateEventListType((EventListType)value, diagnostics, context);
			case XmlaPackage.EVENT_SESSION_TYPE:
				return validateEventSessionType((EventSessionType)value, diagnostics, context);
			case XmlaPackage.EVENTS_TYPE:
				return validateEventsType((EventsType)value, diagnostics, context);
			case XmlaPackage.EVENT_TYPE:
				return validateEventType((EventType)value, diagnostics, context);
			case XmlaPackage.EVENT_TYPE1:
				return validateEventType1((EventType1)value, diagnostics, context);
			case XmlaPackage.EVENT_TYPE_TYPE:
				return validateEventTypeType((EventTypeType)value, diagnostics, context);
			case XmlaPackage.EXECUTE_PARAMETER:
				return validateExecuteParameter((ExecuteParameter)value, diagnostics, context);
			case XmlaPackage.EXECUTE_RESPONSE_TYPE:
				return validateExecuteResponseType((ExecuteResponseType)value, diagnostics, context);
			case XmlaPackage.EXECUTE_TYPE:
				return validateExecuteType((ExecuteType)value, diagnostics, context);
			case XmlaPackage.FILES_TYPE:
				return validateFilesType((FilesType)value, diagnostics, context);
			case XmlaPackage.FOLDER:
				return validateFolder((Folder)value, diagnostics, context);
			case XmlaPackage.FOLDING_PARAMETERS:
				return validateFoldingParameters((FoldingParameters)value, diagnostics, context);
			case XmlaPackage.FOREIGN_KEY_COLUMNS_TYPE:
				return validateForeignKeyColumnsType((ForeignKeyColumnsType)value, diagnostics, context);
			case XmlaPackage.FOREIGN_KEY_COLUMNS_TYPE1:
				return validateForeignKeyColumnsType1((ForeignKeyColumnsType1)value, diagnostics, context);
			case XmlaPackage.FOREIGN_KEY_COLUMN_TYPE:
				return validateForeignKeyColumnType((ForeignKeyColumnType)value, diagnostics, context);
			case XmlaPackage.GLOBAL_TYPE:
				return validateGlobalType((GlobalType)value, diagnostics, context);
			case XmlaPackage.GROUP:
				return validateGroup((Group)value, diagnostics, context);
			case XmlaPackage.GROUPS_TYPE:
				return validateGroupsType((GroupsType)value, diagnostics, context);
			case XmlaPackage.HIERARCHIES_TYPE:
				return validateHierarchiesType((HierarchiesType)value, diagnostics, context);
			case XmlaPackage.HIERARCHIES_TYPE1:
				return validateHierarchiesType1((HierarchiesType1)value, diagnostics, context);
			case XmlaPackage.HIERARCHIES_TYPE2:
				return validateHierarchiesType2((HierarchiesType2)value, diagnostics, context);
			case XmlaPackage.HIERARCHY:
				return validateHierarchy((Hierarchy)value, diagnostics, context);
			case XmlaPackage.IMAGE_LOAD:
				return validateImageLoad((ImageLoad)value, diagnostics, context);
			case XmlaPackage.IMAGE_SAVE:
				return validateImageSave((ImageSave)value, diagnostics, context);
			case XmlaPackage.INCREMENTAL_PROCESSING_NOTIFICATION:
				return validateIncrementalProcessingNotification((IncrementalProcessingNotification)value, diagnostics, context);
			case XmlaPackage.INCREMENTAL_PROCESSING_NOTIFICATIONS_TYPE:
				return validateIncrementalProcessingNotificationsType((IncrementalProcessingNotificationsType)value, diagnostics, context);
			case XmlaPackage.INHERITED_BINDING:
				return validateInheritedBinding((InheritedBinding)value, diagnostics, context);
			case XmlaPackage.INSERT:
				return validateInsert((Insert)value, diagnostics, context);
			case XmlaPackage.KEEP_RESULT_TYPE:
				return validateKeepResultType((KeepResultType)value, diagnostics, context);
			case XmlaPackage.KEY_COLUMNS_TYPE:
				return validateKeyColumnsType((KeyColumnsType)value, diagnostics, context);
			case XmlaPackage.KEY_COLUMNS_TYPE1:
				return validateKeyColumnsType1((KeyColumnsType1)value, diagnostics, context);
			case XmlaPackage.KEY_COLUMNS_TYPE2:
				return validateKeyColumnsType2((KeyColumnsType2)value, diagnostics, context);
			case XmlaPackage.KEY_COLUMNS_TYPE3:
				return validateKeyColumnsType3((KeyColumnsType3)value, diagnostics, context);
			case XmlaPackage.KEY_COLUMNS_TYPE4:
				return validateKeyColumnsType4((KeyColumnsType4)value, diagnostics, context);
			case XmlaPackage.KEY_COLUMN_TYPE:
				return validateKeyColumnType((KeyColumnType)value, diagnostics, context);
			case XmlaPackage.KEYS_TYPE:
				return validateKeysType((KeysType)value, diagnostics, context);
			case XmlaPackage.KEYS_TYPE1:
				return validateKeysType1((KeysType1)value, diagnostics, context);
			case XmlaPackage.KPI:
				return validateKpi((Kpi)value, diagnostics, context);
			case XmlaPackage.KPIS_TYPE:
				return validateKpisType((KpisType)value, diagnostics, context);
			case XmlaPackage.KPIS_TYPE1:
				return validateKpisType1((KpisType1)value, diagnostics, context);
			case XmlaPackage.LEVEL:
				return validateLevel((Level)value, diagnostics, context);
			case XmlaPackage.LEVELS_TYPE:
				return validateLevelsType((LevelsType)value, diagnostics, context);
			case XmlaPackage.LOCATION:
				return validateLocation((Location)value, diagnostics, context);
			case XmlaPackage.LOCATION_BACKUP:
				return validateLocationBackup((LocationBackup)value, diagnostics, context);
			case XmlaPackage.LOCATIONS_TYPE:
				return validateLocationsType((LocationsType)value, diagnostics, context);
			case XmlaPackage.LOCATIONS_TYPE1:
				return validateLocationsType1((LocationsType1)value, diagnostics, context);
			case XmlaPackage.LOCATIONS_TYPE2:
				return validateLocationsType2((LocationsType2)value, diagnostics, context);
			case XmlaPackage.LOCK:
				return validateLock((Lock)value, diagnostics, context);
			case XmlaPackage.MAJOR_OBJECT:
				return validateMajorObject((MajorObject)value, diagnostics, context);
			case XmlaPackage.MANY_TO_MANY_MEASURE_GROUP_DIMENSION:
				return validateManyToManyMeasureGroupDimension((ManyToManyMeasureGroupDimension)value, diagnostics, context);
			case XmlaPackage.MDX_SCRIPT:
				return validateMdxScript((MdxScript)value, diagnostics, context);
			case XmlaPackage.MDX_SCRIPTS_TYPE:
				return validateMdxScriptsType((MdxScriptsType)value, diagnostics, context);
			case XmlaPackage.MEASURE:
				return validateMeasure((Measure)value, diagnostics, context);
			case XmlaPackage.MEASURE_BINDING:
				return validateMeasureBinding((MeasureBinding)value, diagnostics, context);
			case XmlaPackage.MEASURE_GROUP:
				return validateMeasureGroup((MeasureGroup)value, diagnostics, context);
			case XmlaPackage.MEASURE_GROUP_ATTRIBUTE:
				return validateMeasureGroupAttribute((MeasureGroupAttribute)value, diagnostics, context);
			case XmlaPackage.MEASURE_GROUP_BINDING:
				return validateMeasureGroupBinding((MeasureGroupBinding)value, diagnostics, context);
			case XmlaPackage.MEASURE_GROUP_DIMENSION:
				return validateMeasureGroupDimension((MeasureGroupDimension)value, diagnostics, context);
			case XmlaPackage.MEASURE_GROUP_DIMENSION_BINDING:
				return validateMeasureGroupDimensionBinding((MeasureGroupDimensionBinding)value, diagnostics, context);
			case XmlaPackage.MEASURE_GROUPS_TYPE:
				return validateMeasureGroupsType((MeasureGroupsType)value, diagnostics, context);
			case XmlaPackage.MEASURE_GROUPS_TYPE1:
				return validateMeasureGroupsType1((MeasureGroupsType1)value, diagnostics, context);
			case XmlaPackage.MEASURES_TYPE:
				return validateMeasuresType((MeasuresType)value, diagnostics, context);
			case XmlaPackage.MEASURES_TYPE1:
				return validateMeasuresType1((MeasuresType1)value, diagnostics, context);
			case XmlaPackage.MEASURES_TYPE2:
				return validateMeasuresType2((MeasuresType2)value, diagnostics, context);
			case XmlaPackage.MEMBER:
				return validateMember((Member)value, diagnostics, context);
			case XmlaPackage.MEMBERS_TYPE:
				return validateMembersType((MembersType)value, diagnostics, context);
			case XmlaPackage.MEMBERS_TYPE1:
				return validateMembersType1((MembersType1)value, diagnostics, context);
			case XmlaPackage.MERGE_PARTITIONS:
				return validateMergePartitions((MergePartitions)value, diagnostics, context);
			case XmlaPackage.MINING_MODEL:
				return validateMiningModel((MiningModel)value, diagnostics, context);
			case XmlaPackage.MINING_MODEL_COLUMN:
				return validateMiningModelColumn((MiningModelColumn)value, diagnostics, context);
			case XmlaPackage.MINING_MODELING_FLAG:
				return validateMiningModelingFlag((MiningModelingFlag)value, diagnostics, context);
			case XmlaPackage.MINING_MODEL_PERMISSION:
				return validateMiningModelPermission((MiningModelPermission)value, diagnostics, context);
			case XmlaPackage.MINING_MODEL_PERMISSIONS_TYPE:
				return validateMiningModelPermissionsType((MiningModelPermissionsType)value, diagnostics, context);
			case XmlaPackage.MINING_MODELS_TYPE:
				return validateMiningModelsType((MiningModelsType)value, diagnostics, context);
			case XmlaPackage.MINING_STRUCTURE:
				return validateMiningStructure((MiningStructure)value, diagnostics, context);
			case XmlaPackage.MINING_STRUCTURE_COLUMN:
				return validateMiningStructureColumn((MiningStructureColumn)value, diagnostics, context);
			case XmlaPackage.MINING_STRUCTURE_PERMISSION:
				return validateMiningStructurePermission((MiningStructurePermission)value, diagnostics, context);
			case XmlaPackage.MINING_STRUCTURE_PERMISSIONS_TYPE:
				return validateMiningStructurePermissionsType((MiningStructurePermissionsType)value, diagnostics, context);
			case XmlaPackage.MINING_STRUCTURES_TYPE:
				return validateMiningStructuresType((MiningStructuresType)value, diagnostics, context);
			case XmlaPackage.MODELING_FLAGS_TYPE:
				return validateModelingFlagsType((ModelingFlagsType)value, diagnostics, context);
			case XmlaPackage.MODELING_FLAGS_TYPE1:
				return validateModelingFlagsType1((ModelingFlagsType1)value, diagnostics, context);
			case XmlaPackage.NAME_COLUMN_TYPE:
				return validateNameColumnType((NameColumnType)value, diagnostics, context);
			case XmlaPackage.NAMING_TEMPLATE_TRANSLATIONS_TYPE:
				return validateNamingTemplateTranslationsType((NamingTemplateTranslationsType)value, diagnostics, context);
			case XmlaPackage.NOTIFY_TABLE_CHANGE:
				return validateNotifyTableChange((NotifyTableChange)value, diagnostics, context);
			case XmlaPackage.NOT_TYPE:
				return validateNotType((NotType)value, diagnostics, context);
			case XmlaPackage.OBJECT:
				return validateObject((org.eclipse.daanse.xmla.model.ecore.xmla.Object)value, diagnostics, context);
			case XmlaPackage.OBJECT_REFERENCE:
				return validateObjectReference((ObjectReference)value, diagnostics, context);
			case XmlaPackage.OBJECT_TYPE:
				return validateObjectType((ObjectType)value, diagnostics, context);
			case XmlaPackage.OLAP_DATA_SOURCE:
				return validateOlapDataSource((OlapDataSource)value, diagnostics, context);
			case XmlaPackage.ORDINAL_TYPE:
				return validateOrdinalType((OrdinalType)value, diagnostics, context);
			case XmlaPackage.OUT_OF_LINE_BINDING:
				return validateOutOfLineBinding((OutOfLineBinding)value, diagnostics, context);
			case XmlaPackage.PARALLEL_TYPE:
				return validateParallelType((ParallelType)value, diagnostics, context);
			case XmlaPackage.PARAMETERS:
				return validateParameters((Parameters)value, diagnostics, context);
			case XmlaPackage.PARAMETERS_TYPE:
				return validateParametersType((ParametersType)value, diagnostics, context);
			case XmlaPackage.PARAMETER_TYPE2:
				return validateParameterType2((ParameterType2)value, diagnostics, context);
			case XmlaPackage.PARTITION:
				return validatePartition((Partition)value, diagnostics, context);
			case XmlaPackage.PARTITIONS_TYPE:
				return validatePartitionsType((PartitionsType)value, diagnostics, context);
			case XmlaPackage.PERMISSION:
				return validatePermission((Permission)value, diagnostics, context);
			case XmlaPackage.PERSPECTIVE:
				return validatePerspective((Perspective)value, diagnostics, context);
			case XmlaPackage.PERSPECTIVE_ACTION:
				return validatePerspectiveAction((PerspectiveAction)value, diagnostics, context);
			case XmlaPackage.PERSPECTIVE_ATTRIBUTE:
				return validatePerspectiveAttribute((PerspectiveAttribute)value, diagnostics, context);
			case XmlaPackage.PERSPECTIVE_CALCULATION:
				return validatePerspectiveCalculation((PerspectiveCalculation)value, diagnostics, context);
			case XmlaPackage.PERSPECTIVE_DIMENSION:
				return validatePerspectiveDimension((PerspectiveDimension)value, diagnostics, context);
			case XmlaPackage.PERSPECTIVE_HIERARCHY:
				return validatePerspectiveHierarchy((PerspectiveHierarchy)value, diagnostics, context);
			case XmlaPackage.PERSPECTIVE_KPI:
				return validatePerspectiveKpi((PerspectiveKpi)value, diagnostics, context);
			case XmlaPackage.PERSPECTIVE_MEASURE:
				return validatePerspectiveMeasure((PerspectiveMeasure)value, diagnostics, context);
			case XmlaPackage.PERSPECTIVE_MEASURE_GROUP:
				return validatePerspectiveMeasureGroup((PerspectiveMeasureGroup)value, diagnostics, context);
			case XmlaPackage.PERSPECTIVES_TYPE:
				return validatePerspectivesType((PerspectivesType)value, diagnostics, context);
			case XmlaPackage.PRED_LEAF:
				return validatePredLeaf((PredLeaf)value, diagnostics, context);
			case XmlaPackage.PROACTIVE_CACHING:
				return validateProactiveCaching((ProactiveCaching)value, diagnostics, context);
			case XmlaPackage.PROACTIVE_CACHING_BINDING:
				return validateProactiveCachingBinding((ProactiveCachingBinding)value, diagnostics, context);
			case XmlaPackage.PROACTIVE_CACHING_INCREMENTAL_PROCESSING_BINDING:
				return validateProactiveCachingIncrementalProcessingBinding((ProactiveCachingIncrementalProcessingBinding)value, diagnostics, context);
			case XmlaPackage.PROACTIVE_CACHING_INHERITED_BINDING:
				return validateProactiveCachingInheritedBinding((ProactiveCachingInheritedBinding)value, diagnostics, context);
			case XmlaPackage.PROACTIVE_CACHING_OBJECT_NOTIFICATION_BINDING:
				return validateProactiveCachingObjectNotificationBinding((ProactiveCachingObjectNotificationBinding)value, diagnostics, context);
			case XmlaPackage.PROACTIVE_CACHING_QUERY_BINDING:
				return validateProactiveCachingQueryBinding((ProactiveCachingQueryBinding)value, diagnostics, context);
			case XmlaPackage.PROACTIVE_CACHING_TABLES_BINDING:
				return validateProactiveCachingTablesBinding((ProactiveCachingTablesBinding)value, diagnostics, context);
			case XmlaPackage.PROCESS:
				return validateProcess((org.eclipse.daanse.xmla.model.ecore.xmla.Process)value, diagnostics, context);
			case XmlaPackage.PROPERTIES:
				return validateProperties((Properties)value, diagnostics, context);
			case XmlaPackage.PROPERTIES_TYPE:
				return validatePropertiesType((PropertiesType)value, diagnostics, context);
			case XmlaPackage.PROPERTY_LIST:
				return validatePropertyList((PropertyList)value, diagnostics, context);
			case XmlaPackage.PUSHED_DATA_SOURCE:
				return validatePushedDataSource((PushedDataSource)value, diagnostics, context);
			case XmlaPackage.QUERIES_TYPE:
				return validateQueriesType((QueriesType)value, diagnostics, context);
			case XmlaPackage.QUERY_BINDING:
				return validateQueryBinding((QueryBinding)value, diagnostics, context);
			case XmlaPackage.QUERY_NOTIFICATION:
				return validateQueryNotification((QueryNotification)value, diagnostics, context);
			case XmlaPackage.QUERY_NOTIFICATIONS_TYPE:
				return validateQueryNotificationsType((QueryNotificationsType)value, diagnostics, context);
			case XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION:
				return validateReferenceMeasureGroupDimension((ReferenceMeasureGroupDimension)value, diagnostics, context);
			case XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION:
				return validateRegularMeasureGroupDimension((RegularMeasureGroupDimension)value, diagnostics, context);
			case XmlaPackage.RELATIONAL_DATA_SOURCE:
				return validateRelationalDataSource((RelationalDataSource)value, diagnostics, context);
			case XmlaPackage.REPORT_ACTION:
				return validateReportAction((ReportAction)value, diagnostics, context);
			case XmlaPackage.REPORT_FORMAT_PARAMETER:
				return validateReportFormatParameter((ReportFormatParameter)value, diagnostics, context);
			case XmlaPackage.REPORT_FORMAT_PARAMETERS_TYPE:
				return validateReportFormatParametersType((ReportFormatParametersType)value, diagnostics, context);
			case XmlaPackage.REPORT_PARAMETER:
				return validateReportParameter((ReportParameter)value, diagnostics, context);
			case XmlaPackage.REPORT_PARAMETERS_TYPE:
				return validateReportParametersType((ReportParametersType)value, diagnostics, context);
			case XmlaPackage.RESTORE:
				return validateRestore((Restore)value, diagnostics, context);
			case XmlaPackage.RESTRICTION_LIST_TYPE:
				return validateRestrictionListType((RestrictionListType)value, diagnostics, context);
			case XmlaPackage.RESTRICTIONS_TYPE:
				return validateRestrictionsType((RestrictionsType)value, diagnostics, context);
			case XmlaPackage.RESULT_TYPE:
				return validateResultType((ResultType)value, diagnostics, context);
			case XmlaPackage.RETURN:
				return validateReturn((Return)value, diagnostics, context);
			case XmlaPackage.RETURN_TYPE:
				return validateReturnType((ReturnType)value, diagnostics, context);
			case XmlaPackage.ROLE:
				return validateRole((Role)value, diagnostics, context);
			case XmlaPackage.ROLES_TYPE:
				return validateRolesType((RolesType)value, diagnostics, context);
			case XmlaPackage.ROLES_TYPE1:
				return validateRolesType1((RolesType1)value, diagnostics, context);
			case XmlaPackage.ROLLBACK_TRANSACTION:
				return validateRollbackTransaction((RollbackTransaction)value, diagnostics, context);
			case XmlaPackage.ROOT_TYPE:
				return validateRootType((RootType)value, diagnostics, context);
			case XmlaPackage.ROW_BINDING:
				return validateRowBinding((RowBinding)value, diagnostics, context);
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN:
				return validateScalarMiningStructureColumn((ScalarMiningStructureColumn)value, diagnostics, context);
			case XmlaPackage.SERVER:
				return validateServer((Server)value, diagnostics, context);
			case XmlaPackage.SERVER_PROPERTIES_TYPE:
				return validateServerPropertiesType((ServerPropertiesType)value, diagnostics, context);
			case XmlaPackage.SERVER_PROPERTY:
				return validateServerProperty((ServerProperty)value, diagnostics, context);
			case XmlaPackage.SESSION_TYPE:
				return validateSessionType((SessionType)value, diagnostics, context);
			case XmlaPackage.SET_AUTH_CONTEXT:
				return validateSetAuthContext((SetAuthContext)value, diagnostics, context);
			case XmlaPackage.SKIPPED_LEVELS_COLUMN_TYPE:
				return validateSkippedLevelsColumnType((SkippedLevelsColumnType)value, diagnostics, context);
			case XmlaPackage.SOURCE:
				return validateSource((Source)value, diagnostics, context);
			case XmlaPackage.SOURCES_TYPE:
				return validateSourcesType((SourcesType)value, diagnostics, context);
			case XmlaPackage.STANDARD_ACTION:
				return validateStandardAction((StandardAction)value, diagnostics, context);
			case XmlaPackage.STATEMENT:
				return validateStatement((Statement)value, diagnostics, context);
			case XmlaPackage.STORAGE_MODE_TYPE:
				return validateStorageModeType((StorageModeType)value, diagnostics, context);
			case XmlaPackage.STORAGE_MODE_TYPE2:
				return validateStorageModeType2((StorageModeType2)value, diagnostics, context);
			case XmlaPackage.STORAGE_MODE_TYPE3:
				return validateStorageModeType3((StorageModeType3)value, diagnostics, context);
			case XmlaPackage.SUBSCRIBE:
				return validateSubscribe((Subscribe)value, diagnostics, context);
			case XmlaPackage.SYNCHRONIZE:
				return validateSynchronize((Synchronize)value, diagnostics, context);
			case XmlaPackage.TABLE_BINDING:
				return validateTableBinding((TableBinding)value, diagnostics, context);
			case XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN:
				return validateTableMiningStructureColumn((TableMiningStructureColumn)value, diagnostics, context);
			case XmlaPackage.TABLE_NOTIFICATION:
				return validateTableNotification((TableNotification)value, diagnostics, context);
			case XmlaPackage.TABLE_NOTIFICATIONS_TYPE:
				return validateTableNotificationsType((TableNotificationsType)value, diagnostics, context);
			case XmlaPackage.TABLE_NOTIFICATIONS_TYPE1:
				return validateTableNotificationsType1((TableNotificationsType1)value, diagnostics, context);
			case XmlaPackage.TABULAR_BINDING:
				return validateTabularBinding((TabularBinding)value, diagnostics, context);
			case XmlaPackage.TARGET_TYPE:
				return validateTargetType((TargetType)value, diagnostics, context);
			case XmlaPackage.TARGET_TYPE1:
				return validateTargetType1((TargetType1)value, diagnostics, context);
			case XmlaPackage.TIME_ATTRIBUTE_BINDING:
				return validateTimeAttributeBinding((TimeAttributeBinding)value, diagnostics, context);
			case XmlaPackage.TIME_BINDING:
				return validateTimeBinding((TimeBinding)value, diagnostics, context);
			case XmlaPackage.TRACE:
				return validateTrace((Trace)value, diagnostics, context);
			case XmlaPackage.TRACE_COLUMNS:
				return validateTraceColumns((TraceColumns)value, diagnostics, context);
			case XmlaPackage.TRACE_DEFINITION_PROVIDER_INFO:
				return validateTraceDefinitionProviderInfo((TraceDefinitionProviderInfo)value, diagnostics, context);
			case XmlaPackage.TRACE_EVENT:
				return validateTraceEvent((TraceEvent)value, diagnostics, context);
			case XmlaPackage.TRACE_EVENT_CATEGORIES:
				return validateTraceEventCategories((TraceEventCategories)value, diagnostics, context);
			case XmlaPackage.TRACE_FILTER:
				return validateTraceFilter((TraceFilter)value, diagnostics, context);
			case XmlaPackage.TRACES_TYPE:
				return validateTracesType((TracesType)value, diagnostics, context);
			case XmlaPackage.TRANSLATION:
				return validateTranslation((Translation)value, diagnostics, context);
			case XmlaPackage.TRANSLATION_INSERT_UPDATE:
				return validateTranslationInsertUpdate((TranslationInsertUpdate)value, diagnostics, context);
			case XmlaPackage.TRANSLATIONS_TYPE:
				return validateTranslationsType((TranslationsType)value, diagnostics, context);
			case XmlaPackage.TRANSLATION_TYPE:
				return validateTranslationType((TranslationType)value, diagnostics, context);
			case XmlaPackage.TYPE_TYPE6:
				return validateTypeType6((TypeType6)value, diagnostics, context);
			case XmlaPackage.UNARY_EXPR:
				return validateUnaryExpr((UnaryExpr)value, diagnostics, context);
			case XmlaPackage.UNARY_OPERATOR_COLUMN_TYPE:
				return validateUnaryOperatorColumnType((UnaryOperatorColumnType)value, diagnostics, context);
			case XmlaPackage.UNKNOWN_MEMBER_TRANSLATIONS_TYPE:
				return validateUnknownMemberTranslationsType((UnknownMemberTranslationsType)value, diagnostics, context);
			case XmlaPackage.UNKNOWN_MEMBER_TYPE:
				return validateUnknownMemberType((UnknownMemberType)value, diagnostics, context);
			case XmlaPackage.UNLOCK:
				return validateUnlock((Unlock)value, diagnostics, context);
			case XmlaPackage.UNSUBSCRIBE:
				return validateUnsubscribe((Unsubscribe)value, diagnostics, context);
			case XmlaPackage.UPDATE:
				return validateUpdate((Update)value, diagnostics, context);
			case XmlaPackage.UPDATE_CELLS:
				return validateUpdateCells((UpdateCells)value, diagnostics, context);
			case XmlaPackage.USER_DEFINED_GROUP_BINDING:
				return validateUserDefinedGroupBinding((UserDefinedGroupBinding)value, diagnostics, context);
			case XmlaPackage.VALUE_COLUMN_TYPE:
				return validateValueColumnType((ValueColumnType)value, diagnostics, context);
			case XmlaPackage.VERSION_TYPE:
				return validateVersionType((VersionType)value, diagnostics, context);
			case XmlaPackage.WHERE:
				return validateWhere((Where)value, diagnostics, context);
			case XmlaPackage.WHERE_ATTRIBUTE:
				return validateWhereAttribute((WhereAttribute)value, diagnostics, context);
			case XmlaPackage.ACCESS_TYPE:
				return validateAccessType((AccessType)value, diagnostics, context);
			case XmlaPackage.AGGREGATE_FUNCTION_TYPE:
				return validateAggregateFunctionType((AggregateFunctionType)value, diagnostics, context);
			case XmlaPackage.AGGREGATION_FUNCTION_TYPE:
				return validateAggregationFunctionType((AggregationFunctionType)value, diagnostics, context);
			case XmlaPackage.AGGREGATION_STORAGE_TYPE:
				return validateAggregationStorageType((AggregationStorageType)value, diagnostics, context);
			case XmlaPackage.AGGREGATION_TYPE_TYPE:
				return validateAggregationTypeType((AggregationTypeType)value, diagnostics, context);
			case XmlaPackage.AGGREGATION_USAGE_TYPE:
				return validateAggregationUsageType((AggregationUsageType)value, diagnostics, context);
			case XmlaPackage.ALGORITHM_TYPE:
				return validateAlgorithmType((AlgorithmType)value, diagnostics, context);
			case XmlaPackage.ALL_MEMBER_AGGREGATION_USAGE_TYPE:
				return validateAllMemberAggregationUsageType((AllMemberAggregationUsageType)value, diagnostics, context);
			case XmlaPackage.ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE_TYPE:
				return validateAttributeHierarchyOptimizedStateType((AttributeHierarchyOptimizedStateType)value, diagnostics, context);
			case XmlaPackage.ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE_TYPE1:
				return validateAttributeHierarchyOptimizedStateType1((AttributeHierarchyOptimizedStateType1)value, diagnostics, context);
			case XmlaPackage.AXIS_FORMAT_TYPE:
				return validateAxisFormatType((AxisFormatType)value, diagnostics, context);
			case XmlaPackage.CACHE_MODE_TYPE:
				return validateCacheModeType((CacheModeType)value, diagnostics, context);
			case XmlaPackage.CALCULATION_TYPE_TYPE:
				return validateCalculationTypeType((CalculationTypeType)value, diagnostics, context);
			case XmlaPackage.CARDINALITY_TYPE:
				return validateCardinalityType((CardinalityType)value, diagnostics, context);
			case XmlaPackage.CARDINALITY_TYPE1:
				return validateCardinalityType1((CardinalityType1)value, diagnostics, context);
			case XmlaPackage.CATALOG_LOCATION_TYPE:
				return validateCatalogLocationType((CatalogLocationType)value, diagnostics, context);
			case XmlaPackage.CONNECTION_STRING_SECURITY_TYPE:
				return validateConnectionStringSecurityType((ConnectionStringSecurityType)value, diagnostics, context);
			case XmlaPackage.CONTENT_TYPE:
				return validateContentType((ContentType)value, diagnostics, context);
			case XmlaPackage.CONTENT_TYPE1:
				return validateContentType1((ContentType1)value, diagnostics, context);
			case XmlaPackage.CUBE_STORAGE_MODE_ENUM_TYPE:
				return validateCubeStorageModeEnumType((CubeStorageModeEnumType)value, diagnostics, context);
			case XmlaPackage.DATA_AGGREGATION_TYPE:
				return validateDataAggregationType((DataAggregationType)value, diagnostics, context);
			case XmlaPackage.DATA_TYPE_TYPE:
				return validateDataTypeType((DataTypeType)value, diagnostics, context);
			case XmlaPackage.DATA_TYPE_TYPE1:
				return validateDataTypeType1((DataTypeType1)value, diagnostics, context);
			case XmlaPackage.DBPROP_CONCAT_NULL_BEHAVIOR_TYPE:
				return validateDbpropConcatNullBehaviorType((DbpropConcatNullBehaviorType)value, diagnostics, context);
			case XmlaPackage.DBPROP_MSMD_AUTO_EXISTS_TYPE:
				return validateDbpropMsmdAutoExistsType((DbpropMsmdAutoExistsType)value, diagnostics, context);
			case XmlaPackage.DBPROP_MSMD_COMPARE_CASE_SENSITIVE_STRING_FLAGS_TYPE:
				return validateDbpropMsmdCompareCaseSensitiveStringFlagsType((DbpropMsmdCompareCaseSensitiveStringFlagsType)value, diagnostics, context);
			case XmlaPackage.DBPROP_MSMD_MDX_COMPATIBILITY_TYPE:
				return validateDbpropMsmdMDXCompatibilityType((DbpropMsmdMDXCompatibilityType)value, diagnostics, context);
			case XmlaPackage.DBPROP_MSMD_SUBQUERIES_TYPE:
				return validateDbpropMsmdSubqueriesType((DbpropMsmdSubqueriesType)value, diagnostics, context);
			case XmlaPackage.DBPROP_NULL_COLLATION_TYPE:
				return validateDbpropNullCollationType((DbpropNullCollationType)value, diagnostics, context);
			case XmlaPackage.DBPROP_OUTPUT_PARAMETER_AVAILABLE_TYPE:
				return validateDbpropOutputParameterAvailableType((DbpropOutputParameterAvailableType)value, diagnostics, context);
			case XmlaPackage.DBPROP_PERSISTENT_ID_TYPE_TYPE:
				return validateDbpropPersistentIdTypeType((DbpropPersistentIdTypeType)value, diagnostics, context);
			case XmlaPackage.DBPROP_PREPARE_ABORT_BEHAVIOR_TYPE:
				return validateDbpropPrepareAbortBehaviorType((DbpropPrepareAbortBehaviorType)value, diagnostics, context);
			case XmlaPackage.DBPROP_PREPARE_COMMIT_BEHAVIOR_TYPE:
				return validateDbpropPrepareCommitBehaviorType((DbpropPrepareCommitBehaviorType)value, diagnostics, context);
			case XmlaPackage.DBPROP_QUOTED_IDENTIFIER_CASE_TYPE:
				return validateDbpropQuotedIdentifierCaseType((DbpropQuotedIdentifierCaseType)value, diagnostics, context);
			case XmlaPackage.DIALECT_TYPE:
				return validateDialectType((DialectType)value, diagnostics, context);
			case XmlaPackage.DIMENSION_ATTRIBUTE_TYPE_ENUM_TYPE:
				return validateDimensionAttributeTypeEnumType((DimensionAttributeTypeEnumType)value, diagnostics, context);
			case XmlaPackage.DIMENSION_CURRENT_STORAGE_MODE_ENUM_TYPE:
				return validateDimensionCurrentStorageModeEnumType((DimensionCurrentStorageModeEnumType)value, diagnostics, context);
			case XmlaPackage.DISCRETIZATION_METHOD_TYPE:
				return validateDiscretizationMethodType((DiscretizationMethodType)value, diagnostics, context);
			case XmlaPackage.DURABILITY_GUARANTEE_TYPE:
				return validateDurabilityGuaranteeType((DurabilityGuaranteeType)value, diagnostics, context);
			case XmlaPackage.EDITION_TYPE:
				return validateEditionType((EditionType)value, diagnostics, context);
			case XmlaPackage.FISCAL_YEAR_NAME_TYPE:
				return validateFiscalYearNameType((FiscalYearNameType)value, diagnostics, context);
			case XmlaPackage.FORMAT_TYPE:
				return validateFormatType((FormatType)value, diagnostics, context);
			case XmlaPackage.FORMAT_TYPE1:
				return validateFormatType1((FormatType1)value, diagnostics, context);
			case XmlaPackage.GROUPING_BEHAVIOR_TYPE:
				return validateGroupingBehaviorType((GroupingBehaviorType)value, diagnostics, context);
			case XmlaPackage.HIDE_MEMBER_IF_TYPE:
				return validateHideMemberIfType((HideMemberIfType)value, diagnostics, context);
			case XmlaPackage.HIERARCHY_UNIQUE_NAME_STYLE_TYPE:
				return validateHierarchyUniqueNameStyleType((HierarchyUniqueNameStyleType)value, diagnostics, context);
			case XmlaPackage.INSTANCE_SELECTION_TYPE:
				return validateInstanceSelectionType((InstanceSelectionType)value, diagnostics, context);
			case XmlaPackage.INVALID_XML_CHARACTERS_TYPE:
				return validateInvalidXmlCharactersType((InvalidXmlCharactersType)value, diagnostics, context);
			case XmlaPackage.INVOCATION_TYPE:
				return validateInvocationType((InvocationType)value, diagnostics, context);
			case XmlaPackage.INVOCATION_TYPE1:
				return validateInvocationType1((InvocationType1)value, diagnostics, context);
			case XmlaPackage.INVOCATION_TYPE2:
				return validateInvocationType2((InvocationType2)value, diagnostics, context);
			case XmlaPackage.ISOLATION_TYPE:
				return validateIsolationType((IsolationType)value, diagnostics, context);
			case XmlaPackage.KEY_DUPLICATE_TYPE:
				return validateKeyDuplicateType((KeyDuplicateType)value, diagnostics, context);
			case XmlaPackage.KEY_ERROR_ACTION_TYPE:
				return validateKeyErrorActionType((KeyErrorActionType)value, diagnostics, context);
			case XmlaPackage.KEY_ERROR_LIMIT_ACTION_TYPE:
				return validateKeyErrorLimitActionType((KeyErrorLimitActionType)value, diagnostics, context);
			case XmlaPackage.KEY_NOT_FOUND_TYPE:
				return validateKeyNotFoundType((KeyNotFoundType)value, diagnostics, context);
			case XmlaPackage.MATERIALIZATION_TYPE:
				return validateMaterializationType((MaterializationType)value, diagnostics, context);
			case XmlaPackage.MDPROP_AGGREGATE_CELL_UPDATE_TYPE:
				return validateMdpropAggregateCellUpdateType((MdpropAggregateCellUpdateType)value, diagnostics, context);
			case XmlaPackage.MDPROP_FLATTENING_SUPPORT_TYPE:
				return validateMdpropFlatteningSupportType((MdpropFlatteningSupportType)value, diagnostics, context);
			case XmlaPackage.MDPROP_MDX_NON_MEASURE_EXPRESSIONS_TYPE:
				return validateMdpropMdxNonMeasureExpressionsType((MdpropMdxNonMeasureExpressionsType)value, diagnostics, context);
			case XmlaPackage.MDPROP_MDX_RANGE_ROWSET_TYPE:
				return validateMdpropMdxRangeRowsetType((MdpropMdxRangeRowsetType)value, diagnostics, context);
			case XmlaPackage.MDPROP_MDX_SLICER_TYPE:
				return validateMdpropMdxSlicerType((MdpropMdxSlicerType)value, diagnostics, context);
			case XmlaPackage.MDX_MISSING_MEMBER_MODE_TYPE:
				return validateMdxMissingMemberModeType((MdxMissingMemberModeType)value, diagnostics, context);
			case XmlaPackage.MDX_MISSING_MEMBER_MODE_TYPE1:
				return validateMdxMissingMemberModeType1((MdxMissingMemberModeType1)value, diagnostics, context);
			case XmlaPackage.MDX_SUPPORT_TYPE:
				return validateMDXSupportType((MDXSupportType)value, diagnostics, context);
			case XmlaPackage.MEASURE_GROUP_STORAGE_MODE_ENUM_TYPE:
				return validateMeasureGroupStorageModeEnumType((MeasureGroupStorageModeEnumType)value, diagnostics, context);
			case XmlaPackage.MEMBERS_WITH_DATA_TYPE:
				return validateMembersWithDataType((MembersWithDataType)value, diagnostics, context);
			case XmlaPackage.MEMBER_UNIQUE_NAME_STYLE_TYPE:
				return validateMemberUniqueNameStyleType((MemberUniqueNameStyleType)value, diagnostics, context);
			case XmlaPackage.MEMORY_LOCKING_MODE_TYPE:
				return validateMemoryLockingModeType((MemoryLockingModeType)value, diagnostics, context);
			case XmlaPackage.MODE_TYPE:
				return validateModeType((ModeType)value, diagnostics, context);
			case XmlaPackage.NOTIFICATION_TECHNIQUE_TYPE:
				return validateNotificationTechniqueType((NotificationTechniqueType)value, diagnostics, context);
			case XmlaPackage.NOTIFICATION_TECHNIQUE_TYPE1:
				return validateNotificationTechniqueType1((NotificationTechniqueType1)value, diagnostics, context);
			case XmlaPackage.NULL_KEY_CONVERTED_TO_UNKNOWN_TYPE:
				return validateNullKeyConvertedToUnknownType((NullKeyConvertedToUnknownType)value, diagnostics, context);
			case XmlaPackage.NULL_KEY_NOT_ALLOWED_TYPE:
				return validateNullKeyNotAllowedType((NullKeyNotAllowedType)value, diagnostics, context);
			case XmlaPackage.NULL_PROCESSING_TYPE:
				return validateNullProcessingType((NullProcessingType)value, diagnostics, context);
			case XmlaPackage.OBJECT_EXPANSION:
				return validateObjectExpansion((ObjectExpansion)value, diagnostics, context);
			case XmlaPackage.ONLINE_MODE_TYPE:
				return validateOnlineModeType((OnlineModeType)value, diagnostics, context);
			case XmlaPackage.OPTIMIZED_STATE_TYPE:
				return validateOptimizedStateType((OptimizedStateType)value, diagnostics, context);
			case XmlaPackage.OPTIONALITY_TYPE:
				return validateOptionalityType((OptionalityType)value, diagnostics, context);
			case XmlaPackage.ORDER_BY_TYPE:
				return validateOrderByType((OrderByType)value, diagnostics, context);
			case XmlaPackage.OVERRIDE_BEHAVIOR_TYPE:
				return validateOverrideBehaviorType((OverrideBehaviorType)value, diagnostics, context);
			case XmlaPackage.PARAMETER_TYPE:
				return validateParameterType((ParameterType)value, diagnostics, context);
			case XmlaPackage.PARAMETER_TYPE1:
				return validateParameterType1((ParameterType1)value, diagnostics, context);
			case XmlaPackage.PARTITION_CURRENT_STORAGE_MODE_ENUM_TYPE:
				return validatePartitionCurrentStorageModeEnumType((PartitionCurrentStorageModeEnumType)value, diagnostics, context);
			case XmlaPackage.PARTITION_MODES:
				return validatePartitionModes((PartitionModes)value, diagnostics, context);
			case XmlaPackage.PARTITION_STORAGE_MODE_ENUM_TYPE:
				return validatePartitionStorageModeEnumType((PartitionStorageModeEnumType)value, diagnostics, context);
			case XmlaPackage.PERMISSION_SET_TYPE:
				return validatePermissionSetType((PermissionSetType)value, diagnostics, context);
			case XmlaPackage.PERSISTENCE_TYPE:
				return validatePersistenceType((PersistenceType)value, diagnostics, context);
			case XmlaPackage.PERSISTENCE_TYPE1:
				return validatePersistenceType1((PersistenceType1)value, diagnostics, context);
			case XmlaPackage.PROCESSING_GROUP_TYPE:
				return validateProcessingGroupType((ProcessingGroupType)value, diagnostics, context);
			case XmlaPackage.PROCESSING_MODE_TYPE:
				return validateProcessingModeType((ProcessingModeType)value, diagnostics, context);
			case XmlaPackage.PROCESSING_MODE_TYPE1:
				return validateProcessingModeType1((ProcessingModeType1)value, diagnostics, context);
			case XmlaPackage.PROCESSING_MODE_TYPE2:
				return validateProcessingModeType2((ProcessingModeType2)value, diagnostics, context);
			case XmlaPackage.PROCESSING_MODE_TYPE3:
				return validateProcessingModeType3((ProcessingModeType3)value, diagnostics, context);
			case XmlaPackage.PROCESSING_STATE_TYPE:
				return validateProcessingStateType((ProcessingStateType)value, diagnostics, context);
			case XmlaPackage.PROVIDER_TYPE_TYPE:
				return validateProviderTypeType((ProviderTypeType)value, diagnostics, context);
			case XmlaPackage.READ_DEFINITION_TYPE:
				return validateReadDefinitionType((ReadDefinitionType)value, diagnostics, context);
			case XmlaPackage.READ_SOURCE_DATA_TYPE:
				return validateReadSourceDataType((ReadSourceDataType)value, diagnostics, context);
			case XmlaPackage.READ_TYPE:
				return validateReadType((ReadType)value, diagnostics, context);
			case XmlaPackage.READ_TYPE1:
				return validateReadType1((ReadType1)value, diagnostics, context);
			case XmlaPackage.REFRESH_POLICY_TYPE:
				return validateRefreshPolicyType((RefreshPolicyType)value, diagnostics, context);
			case XmlaPackage.REFRESH_POLICY_TYPE1:
				return validateRefreshPolicyType1((RefreshPolicyType1)value, diagnostics, context);
			case XmlaPackage.RELATIONSHIP_TYPE_TYPE:
				return validateRelationshipTypeType((RelationshipTypeType)value, diagnostics, context);
			case XmlaPackage.REPORTING_FIRST_WEEK_OF_MONTH_TYPE:
				return validateReportingFirstWeekOfMonthType((ReportingFirstWeekOfMonthType)value, diagnostics, context);
			case XmlaPackage.REPORTING_WEEK_TO_MONTH_PATTERN_TYPE:
				return validateReportingWeekToMonthPatternType((ReportingWeekToMonthPatternType)value, diagnostics, context);
			case XmlaPackage.REQUEST_TYPE_TYPE:
				return validateRequestTypeType((RequestTypeType)value, diagnostics, context);
			case XmlaPackage.RESPONSE_ENCODING_TYPE:
				return validateResponseEncodingType((ResponseEncodingType)value, diagnostics, context);
			case XmlaPackage.RETENTION_MODES:
				return validateRetentionModes((RetentionModes)value, diagnostics, context);
			case XmlaPackage.ROOT_MEMBER_IF_TYPE:
				return validateRootMemberIfType((RootMemberIfType)value, diagnostics, context);
			case XmlaPackage.SAFETY_OPTIONS_TYPE:
				return validateSafetyOptionsType((SafetyOptionsType)value, diagnostics, context);
			case XmlaPackage.SCOPE:
				return validateScope((Scope)value, diagnostics, context);
			case XmlaPackage.SCRIPT_CACHE_PROCESSING_MODE_TYPE:
				return validateScriptCacheProcessingModeType((ScriptCacheProcessingModeType)value, diagnostics, context);
			case XmlaPackage.SCRIPT_ERROR_HANDLING_MODE_TYPE:
				return validateScriptErrorHandlingModeType((ScriptErrorHandlingModeType)value, diagnostics, context);
			case XmlaPackage.SECURED_CELL_VALUE_TYPE:
				return validateSecuredCellValueType((SecuredCellValueType)value, diagnostics, context);
			case XmlaPackage.SECURITY_TYPE:
				return validateSecurityType((SecurityType)value, diagnostics, context);
			case XmlaPackage.SECURITY_TYPE1:
				return validateSecurityType1((SecurityType1)value, diagnostics, context);
			case XmlaPackage.SHARE_DIMENSION_STORAGE_TYPE:
				return validateShareDimensionStorageType((ShareDimensionStorageType)value, diagnostics, context);
			case XmlaPackage.SQL_QUERY_MODE_TYPE:
				return validateSQLQueryModeType((SQLQueryModeType)value, diagnostics, context);
			case XmlaPackage.STATE_SUPPORT_TYPE:
				return validateStateSupportType((StateSupportType)value, diagnostics, context);
			case XmlaPackage.STATE_TYPE:
				return validateStateType((StateType)value, diagnostics, context);
			case XmlaPackage.STATE_TYPE1:
				return validateStateType1((StateType1)value, diagnostics, context);
			case XmlaPackage.STATE_TYPE2:
				return validateStateType2((StateType2)value, diagnostics, context);
			case XmlaPackage.STATE_TYPE3:
				return validateStateType3((StateType3)value, diagnostics, context);
			case XmlaPackage.STATE_TYPE4:
				return validateStateType4((StateType4)value, diagnostics, context);
			case XmlaPackage.STATE_TYPE5:
				return validateStateType5((StateType5)value, diagnostics, context);
			case XmlaPackage.STATE_TYPE6:
				return validateStateType6((StateType6)value, diagnostics, context);
			case XmlaPackage.STORAGE_MODE_TYPE1:
				return validateStorageModeType1((StorageModeType1)value, diagnostics, context);
			case XmlaPackage.SYNCHRONIZE_SECURITY_TYPE:
				return validateSynchronizeSecurityType((SynchronizeSecurityType)value, diagnostics, context);
			case XmlaPackage.TARGET_TYPE_TYPE:
				return validateTargetTypeType((TargetTypeType)value, diagnostics, context);
			case XmlaPackage.TARGET_TYPE_TYPE1:
				return validateTargetTypeType1((TargetTypeType1)value, diagnostics, context);
			case XmlaPackage.TARGET_TYPE_TYPE2:
				return validateTargetTypeType2((TargetTypeType2)value, diagnostics, context);
			case XmlaPackage.TRIMMING_TYPE:
				return validateTrimmingType((TrimmingType)value, diagnostics, context);
			case XmlaPackage.TYPE_TYPE:
				return validateTypeType((TypeType)value, diagnostics, context);
			case XmlaPackage.TYPE_TYPE1:
				return validateTypeType1((TypeType1)value, diagnostics, context);
			case XmlaPackage.TYPE_TYPE2:
				return validateTypeType2((TypeType2)value, diagnostics, context);
			case XmlaPackage.TYPE_TYPE3:
				return validateTypeType3((TypeType3)value, diagnostics, context);
			case XmlaPackage.TYPE_TYPE4:
				return validateTypeType4((TypeType4)value, diagnostics, context);
			case XmlaPackage.TYPE_TYPE5:
				return validateTypeType5((TypeType5)value, diagnostics, context);
			case XmlaPackage.TYPE_TYPE7:
				return validateTypeType7((TypeType7)value, diagnostics, context);
			case XmlaPackage.TYPE_TYPE8:
				return validateTypeType8((TypeType8)value, diagnostics, context);
			case XmlaPackage.TYPE_TYPE9:
				return validateTypeType9((TypeType9)value, diagnostics, context);
			case XmlaPackage.TYPE_TYPE10:
				return validateTypeType10((TypeType10)value, diagnostics, context);
			case XmlaPackage.TYPE_TYPE11:
				return validateTypeType11((TypeType11)value, diagnostics, context);
			case XmlaPackage.TYPE_TYPE12:
				return validateTypeType12((TypeType12)value, diagnostics, context);
			case XmlaPackage.TYPE_TYPE13:
				return validateTypeType13((TypeType13)value, diagnostics, context);
			case XmlaPackage.UNKNOWN_MEMBER_ENUM_TYPE:
				return validateUnknownMemberEnumType((UnknownMemberEnumType)value, diagnostics, context);
			case XmlaPackage.UPDATE_ISOLATION_LEVEL_TYPE:
				return validateUpdateIsolationLevelType((UpdateIsolationLevelType)value, diagnostics, context);
			case XmlaPackage.USAGE_TYPE:
				return validateUsageType((UsageType)value, diagnostics, context);
			case XmlaPackage.USAGE_TYPE1:
				return validateUsageType1((UsageType1)value, diagnostics, context);
			case XmlaPackage.VALUENS_TYPE:
				return validateValuensType((ValuensType)value, diagnostics, context);
			case XmlaPackage.VALUENS_TYPE1:
				return validateValuensType1((ValuensType1)value, diagnostics, context);
			case XmlaPackage.VALUENS_TYPE2:
				return validateValuensType2((ValuensType2)value, diagnostics, context);
			case XmlaPackage.VALUENS_TYPE3:
				return validateValuensType3((ValuensType3)value, diagnostics, context);
			case XmlaPackage.VALUENS_TYPE4:
				return validateValuensType4((ValuensType4)value, diagnostics, context);
			case XmlaPackage.VALUENS_TYPE5:
				return validateValuensType5((ValuensType5)value, diagnostics, context);
			case XmlaPackage.VALUENS_TYPE6:
				return validateValuensType6((ValuensType6)value, diagnostics, context);
			case XmlaPackage.VISIBILITY_TYPE:
				return validateVisibilityType((VisibilityType)value, diagnostics, context);
			case XmlaPackage.VISUAL_MODE_TYPE:
				return validateVisualModeType((VisualModeType)value, diagnostics, context);
			case XmlaPackage.WRITE_BACK_TABLE_CREATION:
				return validateWriteBackTableCreation((WriteBackTableCreation)value, diagnostics, context);
			case XmlaPackage.WRITE_TYPE:
				return validateWriteType((WriteType)value, diagnostics, context);
			case XmlaPackage.WRITE_TYPE1:
				return validateWriteType1((WriteType1)value, diagnostics, context);
			case XmlaPackage.WRITE_TYPE2:
				return validateWriteType2((WriteType2)value, diagnostics, context);
			case XmlaPackage.WRITE_TYPE3:
				return validateWriteType3((WriteType3)value, diagnostics, context);
			case XmlaPackage.WRITE_TYPE4:
				return validateWriteType4((WriteType4)value, diagnostics, context);
			case XmlaPackage.WRITE_TYPE5:
				return validateWriteType5((WriteType5)value, diagnostics, context);
			case XmlaPackage.WRITE_TYPE6:
				return validateWriteType6((WriteType6)value, diagnostics, context);
			case XmlaPackage.ACCESS_TYPE_OBJECT:
				return validateAccessTypeObject((AccessType)value, diagnostics, context);
			case XmlaPackage.AGGREGATE_FUNCTION_TYPE_OBJECT:
				return validateAggregateFunctionTypeObject((AggregateFunctionType)value, diagnostics, context);
			case XmlaPackage.AGGREGATION_FUNCTION_TYPE_OBJECT:
				return validateAggregationFunctionTypeObject((AggregationFunctionType)value, diagnostics, context);
			case XmlaPackage.AGGREGATION_STORAGE_TYPE_OBJECT:
				return validateAggregationStorageTypeObject((AggregationStorageType)value, diagnostics, context);
			case XmlaPackage.AGGREGATION_TYPE_TYPE_OBJECT:
				return validateAggregationTypeTypeObject((AggregationTypeType)value, diagnostics, context);
			case XmlaPackage.AGGREGATION_USAGE_TYPE_OBJECT:
				return validateAggregationUsageTypeObject((AggregationUsageType)value, diagnostics, context);
			case XmlaPackage.ALGORITHM_TYPE_OBJECT:
				return validateAlgorithmTypeObject((AlgorithmType)value, diagnostics, context);
			case XmlaPackage.ALL_MEMBER_AGGREGATION_USAGE_TYPE_OBJECT:
				return validateAllMemberAggregationUsageTypeObject((AllMemberAggregationUsageType)value, diagnostics, context);
			case XmlaPackage.ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE_TYPE_OBJECT:
				return validateAttributeHierarchyOptimizedStateTypeObject((AttributeHierarchyOptimizedStateType)value, diagnostics, context);
			case XmlaPackage.ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE_TYPE_OBJECT1:
				return validateAttributeHierarchyOptimizedStateTypeObject1((AttributeHierarchyOptimizedStateType1)value, diagnostics, context);
			case XmlaPackage.AXIS_FORMAT_TYPE_OBJECT:
				return validateAxisFormatTypeObject((AxisFormatType)value, diagnostics, context);
			case XmlaPackage.CACHE_MODE_TYPE_OBJECT:
				return validateCacheModeTypeObject((CacheModeType)value, diagnostics, context);
			case XmlaPackage.CALCULATION_TYPE_TYPE_OBJECT:
				return validateCalculationTypeTypeObject((CalculationTypeType)value, diagnostics, context);
			case XmlaPackage.CARDINALITY_TYPE_OBJECT:
				return validateCardinalityTypeObject((CardinalityType)value, diagnostics, context);
			case XmlaPackage.CARDINALITY_TYPE_OBJECT1:
				return validateCardinalityTypeObject1((CardinalityType1)value, diagnostics, context);
			case XmlaPackage.CATALOG_LOCATION_TYPE_OBJECT:
				return validateCatalogLocationTypeObject((CatalogLocationType)value, diagnostics, context);
			case XmlaPackage.CONNECTION_STRING_SECURITY_TYPE_OBJECT:
				return validateConnectionStringSecurityTypeObject((ConnectionStringSecurityType)value, diagnostics, context);
			case XmlaPackage.CONTENT_TYPE_OBJECT:
				return validateContentTypeObject((ContentType)value, diagnostics, context);
			case XmlaPackage.CONTENT_TYPE_OBJECT1:
				return validateContentTypeObject1((ContentType1)value, diagnostics, context);
			case XmlaPackage.CUBE_STORAGE_MODE_ENUM_TYPE_OBJECT:
				return validateCubeStorageModeEnumTypeObject((CubeStorageModeEnumType)value, diagnostics, context);
			case XmlaPackage.DATA_AGGREGATION_TYPE_OBJECT:
				return validateDataAggregationTypeObject((DataAggregationType)value, diagnostics, context);
			case XmlaPackage.DATA_TYPE_TYPE_OBJECT:
				return validateDataTypeTypeObject((DataTypeType)value, diagnostics, context);
			case XmlaPackage.DATA_TYPE_TYPE_OBJECT1:
				return validateDataTypeTypeObject1((DataTypeType1)value, diagnostics, context);
			case XmlaPackage.DBPROP_CONCAT_NULL_BEHAVIOR_TYPE_OBJECT:
				return validateDbpropConcatNullBehaviorTypeObject((DbpropConcatNullBehaviorType)value, diagnostics, context);
			case XmlaPackage.DBPROP_MSMD_AUTO_EXISTS_TYPE_OBJECT:
				return validateDbpropMsmdAutoExistsTypeObject((DbpropMsmdAutoExistsType)value, diagnostics, context);
			case XmlaPackage.DBPROP_MSMD_COMPARE_CASE_SENSITIVE_STRING_FLAGS_TYPE_OBJECT:
				return validateDbpropMsmdCompareCaseSensitiveStringFlagsTypeObject((DbpropMsmdCompareCaseSensitiveStringFlagsType)value, diagnostics, context);
			case XmlaPackage.DBPROP_MSMD_MDX_COMPATIBILITY_TYPE_OBJECT:
				return validateDbpropMsmdMDXCompatibilityTypeObject((DbpropMsmdMDXCompatibilityType)value, diagnostics, context);
			case XmlaPackage.DBPROP_MSMD_SUBQUERIES_TYPE_OBJECT:
				return validateDbpropMsmdSubqueriesTypeObject((DbpropMsmdSubqueriesType)value, diagnostics, context);
			case XmlaPackage.DBPROP_NULL_COLLATION_TYPE_OBJECT:
				return validateDbpropNullCollationTypeObject((DbpropNullCollationType)value, diagnostics, context);
			case XmlaPackage.DBPROP_OUTPUT_PARAMETER_AVAILABLE_TYPE_OBJECT:
				return validateDbpropOutputParameterAvailableTypeObject((DbpropOutputParameterAvailableType)value, diagnostics, context);
			case XmlaPackage.DBPROP_PERSISTENT_ID_TYPE_TYPE_OBJECT:
				return validateDbpropPersistentIdTypeTypeObject((DbpropPersistentIdTypeType)value, diagnostics, context);
			case XmlaPackage.DBPROP_PREPARE_ABORT_BEHAVIOR_TYPE_OBJECT:
				return validateDbpropPrepareAbortBehaviorTypeObject((DbpropPrepareAbortBehaviorType)value, diagnostics, context);
			case XmlaPackage.DBPROP_PREPARE_COMMIT_BEHAVIOR_TYPE_OBJECT:
				return validateDbpropPrepareCommitBehaviorTypeObject((DbpropPrepareCommitBehaviorType)value, diagnostics, context);
			case XmlaPackage.DBPROP_QUOTED_IDENTIFIER_CASE_TYPE_OBJECT:
				return validateDbpropQuotedIdentifierCaseTypeObject((DbpropQuotedIdentifierCaseType)value, diagnostics, context);
			case XmlaPackage.DIALECT_TYPE_OBJECT:
				return validateDialectTypeObject((DialectType)value, diagnostics, context);
			case XmlaPackage.DIMENSION_ATTRIBUTE_TYPE_ENUM_TYPE_OBJECT:
				return validateDimensionAttributeTypeEnumTypeObject((DimensionAttributeTypeEnumType)value, diagnostics, context);
			case XmlaPackage.DIMENSION_CURRENT_STORAGE_MODE_ENUM_TYPE_OBJECT:
				return validateDimensionCurrentStorageModeEnumTypeObject((DimensionCurrentStorageModeEnumType)value, diagnostics, context);
			case XmlaPackage.DISCRETIZATION_METHOD_TYPE_OBJECT:
				return validateDiscretizationMethodTypeObject((DiscretizationMethodType)value, diagnostics, context);
			case XmlaPackage.DURABILITY_GUARANTEE_TYPE_OBJECT:
				return validateDurabilityGuaranteeTypeObject((DurabilityGuaranteeType)value, diagnostics, context);
			case XmlaPackage.EDITION_TYPE_OBJECT:
				return validateEditionTypeObject((EditionType)value, diagnostics, context);
			case XmlaPackage.FIRST_DAY_OF_WEEK_TYPE:
				return validateFirstDayOfWeekType((BigInteger)value, diagnostics, context);
			case XmlaPackage.FISCAL_FIRST_DAY_OF_MONTH_TYPE:
				return validateFiscalFirstDayOfMonthType((BigInteger)value, diagnostics, context);
			case XmlaPackage.FISCAL_FIRST_MONTH_TYPE:
				return validateFiscalFirstMonthType((BigInteger)value, diagnostics, context);
			case XmlaPackage.FISCAL_YEAR_NAME_TYPE_OBJECT:
				return validateFiscalYearNameTypeObject((FiscalYearNameType)value, diagnostics, context);
			case XmlaPackage.FORMAT_TYPE_OBJECT:
				return validateFormatTypeObject((FormatType)value, diagnostics, context);
			case XmlaPackage.FORMAT_TYPE_OBJECT1:
				return validateFormatTypeObject1((FormatType1)value, diagnostics, context);
			case XmlaPackage.GROUPING_BEHAVIOR_TYPE_OBJECT:
				return validateGroupingBehaviorTypeObject((GroupingBehaviorType)value, diagnostics, context);
			case XmlaPackage.HIDE_MEMBER_IF_TYPE_OBJECT:
				return validateHideMemberIfTypeObject((HideMemberIfType)value, diagnostics, context);
			case XmlaPackage.HIERARCHY_UNIQUE_NAME_STYLE_TYPE_OBJECT:
				return validateHierarchyUniqueNameStyleTypeObject((HierarchyUniqueNameStyleType)value, diagnostics, context);
			case XmlaPackage.ID_TYPE:
				return validateIDType((String)value, diagnostics, context);
			case XmlaPackage.ID_TYPE1:
				return validateIDType1((String)value, diagnostics, context);
			case XmlaPackage.INSTANCE_SELECTION_TYPE_OBJECT:
				return validateInstanceSelectionTypeObject((InstanceSelectionType)value, diagnostics, context);
			case XmlaPackage.INVALID_XML_CHARACTERS_TYPE_OBJECT:
				return validateInvalidXmlCharactersTypeObject((InvalidXmlCharactersType)value, diagnostics, context);
			case XmlaPackage.INVOCATION_TYPE_OBJECT:
				return validateInvocationTypeObject((InvocationType)value, diagnostics, context);
			case XmlaPackage.INVOCATION_TYPE_OBJECT1:
				return validateInvocationTypeObject1((InvocationType1)value, diagnostics, context);
			case XmlaPackage.INVOCATION_TYPE_OBJECT2:
				return validateInvocationTypeObject2((InvocationType2)value, diagnostics, context);
			case XmlaPackage.ISOLATION_TYPE_OBJECT:
				return validateIsolationTypeObject((IsolationType)value, diagnostics, context);
			case XmlaPackage.KEY_DUPLICATE_TYPE_OBJECT:
				return validateKeyDuplicateTypeObject((KeyDuplicateType)value, diagnostics, context);
			case XmlaPackage.KEY_ERROR_ACTION_TYPE_OBJECT:
				return validateKeyErrorActionTypeObject((KeyErrorActionType)value, diagnostics, context);
			case XmlaPackage.KEY_ERROR_LIMIT_ACTION_TYPE_OBJECT:
				return validateKeyErrorLimitActionTypeObject((KeyErrorLimitActionType)value, diagnostics, context);
			case XmlaPackage.KEY_NOT_FOUND_TYPE_OBJECT:
				return validateKeyNotFoundTypeObject((KeyNotFoundType)value, diagnostics, context);
			case XmlaPackage.MANUFACTURING_EXTRA_MONTH_QUARTER_TYPE:
				return validateManufacturingExtraMonthQuarterType((BigInteger)value, diagnostics, context);
			case XmlaPackage.MANUFACTURING_FIRST_MONTH_TYPE:
				return validateManufacturingFirstMonthType((BigInteger)value, diagnostics, context);
			case XmlaPackage.MANUFACTURING_FIRST_WEEK_OF_MONTH_TYPE:
				return validateManufacturingFirstWeekOfMonthType((BigInteger)value, diagnostics, context);
			case XmlaPackage.MATERIALIZATION_TYPE_OBJECT:
				return validateMaterializationTypeObject((MaterializationType)value, diagnostics, context);
			case XmlaPackage.MDPROP_AGGREGATE_CELL_UPDATE_TYPE_OBJECT:
				return validateMdpropAggregateCellUpdateTypeObject((MdpropAggregateCellUpdateType)value, diagnostics, context);
			case XmlaPackage.MDPROP_FLATTENING_SUPPORT_TYPE_OBJECT:
				return validateMdpropFlatteningSupportTypeObject((MdpropFlatteningSupportType)value, diagnostics, context);
			case XmlaPackage.MDPROP_MDX_NON_MEASURE_EXPRESSIONS_TYPE_OBJECT:
				return validateMdpropMdxNonMeasureExpressionsTypeObject((MdpropMdxNonMeasureExpressionsType)value, diagnostics, context);
			case XmlaPackage.MDPROP_MDX_RANGE_ROWSET_TYPE_OBJECT:
				return validateMdpropMdxRangeRowsetTypeObject((MdpropMdxRangeRowsetType)value, diagnostics, context);
			case XmlaPackage.MDPROP_MDX_SLICER_TYPE_OBJECT:
				return validateMdpropMdxSlicerTypeObject((MdpropMdxSlicerType)value, diagnostics, context);
			case XmlaPackage.MDX_MISSING_MEMBER_MODE_TYPE_OBJECT:
				return validateMdxMissingMemberModeTypeObject((MdxMissingMemberModeType)value, diagnostics, context);
			case XmlaPackage.MDX_MISSING_MEMBER_MODE_TYPE_OBJECT1:
				return validateMdxMissingMemberModeTypeObject1((MdxMissingMemberModeType1)value, diagnostics, context);
			case XmlaPackage.MDX_SUPPORT_TYPE_OBJECT:
				return validateMDXSupportTypeObject((MDXSupportType)value, diagnostics, context);
			case XmlaPackage.MEASURE_GROUP_STORAGE_MODE_ENUM_TYPE_OBJECT:
				return validateMeasureGroupStorageModeEnumTypeObject((MeasureGroupStorageModeEnumType)value, diagnostics, context);
			case XmlaPackage.MEMBERS_WITH_DATA_TYPE_OBJECT:
				return validateMembersWithDataTypeObject((MembersWithDataType)value, diagnostics, context);
			case XmlaPackage.MEMBER_UNIQUE_NAME_STYLE_TYPE_OBJECT:
				return validateMemberUniqueNameStyleTypeObject((MemberUniqueNameStyleType)value, diagnostics, context);
			case XmlaPackage.MEMORY_LOCKING_MODE_TYPE_OBJECT:
				return validateMemoryLockingModeTypeObject((MemoryLockingModeType)value, diagnostics, context);
			case XmlaPackage.MODE_TYPE_OBJECT:
				return validateModeTypeObject((ModeType)value, diagnostics, context);
			case XmlaPackage.NOTIFICATION_TECHNIQUE_TYPE_OBJECT:
				return validateNotificationTechniqueTypeObject((NotificationTechniqueType)value, diagnostics, context);
			case XmlaPackage.NOTIFICATION_TECHNIQUE_TYPE_OBJECT1:
				return validateNotificationTechniqueTypeObject1((NotificationTechniqueType1)value, diagnostics, context);
			case XmlaPackage.NULL_KEY_CONVERTED_TO_UNKNOWN_TYPE_OBJECT:
				return validateNullKeyConvertedToUnknownTypeObject((NullKeyConvertedToUnknownType)value, diagnostics, context);
			case XmlaPackage.NULL_KEY_NOT_ALLOWED_TYPE_OBJECT:
				return validateNullKeyNotAllowedTypeObject((NullKeyNotAllowedType)value, diagnostics, context);
			case XmlaPackage.NULL_PROCESSING_TYPE_OBJECT:
				return validateNullProcessingTypeObject((NullProcessingType)value, diagnostics, context);
			case XmlaPackage.OBJECT_EXPANSION_OBJECT:
				return validateObjectExpansionObject((ObjectExpansion)value, diagnostics, context);
			case XmlaPackage.ONLINE_MODE_TYPE_OBJECT:
				return validateOnlineModeTypeObject((OnlineModeType)value, diagnostics, context);
			case XmlaPackage.OPTIMIZED_STATE_TYPE_OBJECT:
				return validateOptimizedStateTypeObject((OptimizedStateType)value, diagnostics, context);
			case XmlaPackage.OPTIONALITY_TYPE_OBJECT:
				return validateOptionalityTypeObject((OptionalityType)value, diagnostics, context);
			case XmlaPackage.ORDER_BY_TYPE_OBJECT:
				return validateOrderByTypeObject((OrderByType)value, diagnostics, context);
			case XmlaPackage.OVERRIDE_BEHAVIOR_TYPE_OBJECT:
				return validateOverrideBehaviorTypeObject((OverrideBehaviorType)value, diagnostics, context);
			case XmlaPackage.PARAMETER_TYPE_OBJECT:
				return validateParameterTypeObject((ParameterType)value, diagnostics, context);
			case XmlaPackage.PARAMETER_TYPE_OBJECT1:
				return validateParameterTypeObject1((ParameterType1)value, diagnostics, context);
			case XmlaPackage.PARTITION_CURRENT_STORAGE_MODE_ENUM_TYPE_OBJECT:
				return validatePartitionCurrentStorageModeEnumTypeObject((PartitionCurrentStorageModeEnumType)value, diagnostics, context);
			case XmlaPackage.PARTITION_MODES_OBJECT:
				return validatePartitionModesObject((PartitionModes)value, diagnostics, context);
			case XmlaPackage.PARTITION_STORAGE_MODE_ENUM_TYPE_OBJECT:
				return validatePartitionStorageModeEnumTypeObject((PartitionStorageModeEnumType)value, diagnostics, context);
			case XmlaPackage.PERMISSION_SET_TYPE_OBJECT:
				return validatePermissionSetTypeObject((PermissionSetType)value, diagnostics, context);
			case XmlaPackage.PERSISTENCE_TYPE_OBJECT:
				return validatePersistenceTypeObject((PersistenceType)value, diagnostics, context);
			case XmlaPackage.PERSISTENCE_TYPE_OBJECT1:
				return validatePersistenceTypeObject1((PersistenceType1)value, diagnostics, context);
			case XmlaPackage.PROCESSING_GROUP_TYPE_OBJECT:
				return validateProcessingGroupTypeObject((ProcessingGroupType)value, diagnostics, context);
			case XmlaPackage.PROCESSING_MODE_TYPE_OBJECT:
				return validateProcessingModeTypeObject((ProcessingModeType)value, diagnostics, context);
			case XmlaPackage.PROCESSING_MODE_TYPE_OBJECT1:
				return validateProcessingModeTypeObject1((ProcessingModeType2)value, diagnostics, context);
			case XmlaPackage.PROCESSING_MODE_TYPE_OBJECT2:
				return validateProcessingModeTypeObject2((ProcessingModeType1)value, diagnostics, context);
			case XmlaPackage.PROCESSING_MODE_TYPE_OBJECT3:
				return validateProcessingModeTypeObject3((ProcessingModeType3)value, diagnostics, context);
			case XmlaPackage.PROCESSING_STATE_TYPE_OBJECT:
				return validateProcessingStateTypeObject((ProcessingStateType)value, diagnostics, context);
			case XmlaPackage.PROVIDER_TYPE_TYPE_OBJECT:
				return validateProviderTypeTypeObject((ProviderTypeType)value, diagnostics, context);
			case XmlaPackage.READ_DEFINITION_TYPE_OBJECT:
				return validateReadDefinitionTypeObject((ReadDefinitionType)value, diagnostics, context);
			case XmlaPackage.READ_SOURCE_DATA_TYPE_OBJECT:
				return validateReadSourceDataTypeObject((ReadSourceDataType)value, diagnostics, context);
			case XmlaPackage.READ_TYPE_OBJECT:
				return validateReadTypeObject((ReadType)value, diagnostics, context);
			case XmlaPackage.READ_TYPE_OBJECT1:
				return validateReadTypeObject1((ReadType1)value, diagnostics, context);
			case XmlaPackage.REFRESH_POLICY_TYPE_OBJECT:
				return validateRefreshPolicyTypeObject((RefreshPolicyType)value, diagnostics, context);
			case XmlaPackage.REFRESH_POLICY_TYPE_OBJECT1:
				return validateRefreshPolicyTypeObject1((RefreshPolicyType1)value, diagnostics, context);
			case XmlaPackage.RELATIONSHIP_TYPE_TYPE_OBJECT:
				return validateRelationshipTypeTypeObject((RelationshipTypeType)value, diagnostics, context);
			case XmlaPackage.REPORTING_FIRST_MONTH_TYPE:
				return validateReportingFirstMonthType((BigInteger)value, diagnostics, context);
			case XmlaPackage.REPORTING_FIRST_WEEK_OF_MONTH_TYPE_OBJECT:
				return validateReportingFirstWeekOfMonthTypeObject((ReportingFirstWeekOfMonthType)value, diagnostics, context);
			case XmlaPackage.REPORTING_WEEK_TO_MONTH_PATTERN_TYPE_OBJECT:
				return validateReportingWeekToMonthPatternTypeObject((ReportingWeekToMonthPatternType)value, diagnostics, context);
			case XmlaPackage.REQUEST_TYPE_TYPE_OBJECT:
				return validateRequestTypeTypeObject((RequestTypeType)value, diagnostics, context);
			case XmlaPackage.RESPONSE_ENCODING_TYPE_OBJECT:
				return validateResponseEncodingTypeObject((ResponseEncodingType)value, diagnostics, context);
			case XmlaPackage.RETENTION_MODES_OBJECT:
				return validateRetentionModesObject((RetentionModes)value, diagnostics, context);
			case XmlaPackage.ROOT_MEMBER_IF_TYPE_OBJECT:
				return validateRootMemberIfTypeObject((RootMemberIfType)value, diagnostics, context);
			case XmlaPackage.SAFETY_OPTIONS_TYPE_OBJECT:
				return validateSafetyOptionsTypeObject((SafetyOptionsType)value, diagnostics, context);
			case XmlaPackage.SCOPE_OBJECT:
				return validateScopeObject((Scope)value, diagnostics, context);
			case XmlaPackage.SCRIPT_CACHE_PROCESSING_MODE_TYPE_OBJECT:
				return validateScriptCacheProcessingModeTypeObject((ScriptCacheProcessingModeType)value, diagnostics, context);
			case XmlaPackage.SCRIPT_ERROR_HANDLING_MODE_TYPE_OBJECT:
				return validateScriptErrorHandlingModeTypeObject((ScriptErrorHandlingModeType)value, diagnostics, context);
			case XmlaPackage.SECURED_CELL_VALUE_TYPE_OBJECT:
				return validateSecuredCellValueTypeObject((SecuredCellValueType)value, diagnostics, context);
			case XmlaPackage.SECURITY_TYPE_OBJECT:
				return validateSecurityTypeObject((SecurityType)value, diagnostics, context);
			case XmlaPackage.SECURITY_TYPE_OBJECT1:
				return validateSecurityTypeObject1((SecurityType1)value, diagnostics, context);
			case XmlaPackage.SHARE_DIMENSION_STORAGE_TYPE_OBJECT:
				return validateShareDimensionStorageTypeObject((ShareDimensionStorageType)value, diagnostics, context);
			case XmlaPackage.SQL_QUERY_MODE_TYPE_OBJECT:
				return validateSQLQueryModeTypeObject((SQLQueryModeType)value, diagnostics, context);
			case XmlaPackage.STATE_SUPPORT_TYPE_OBJECT:
				return validateStateSupportTypeObject((StateSupportType)value, diagnostics, context);
			case XmlaPackage.STATE_TYPE_OBJECT:
				return validateStateTypeObject((StateType)value, diagnostics, context);
			case XmlaPackage.STATE_TYPE_OBJECT1:
				return validateStateTypeObject1((StateType4)value, diagnostics, context);
			case XmlaPackage.STATE_TYPE_OBJECT2:
				return validateStateTypeObject2((StateType5)value, diagnostics, context);
			case XmlaPackage.STATE_TYPE_OBJECT3:
				return validateStateTypeObject3((StateType1)value, diagnostics, context);
			case XmlaPackage.STATE_TYPE_OBJECT4:
				return validateStateTypeObject4((StateType3)value, diagnostics, context);
			case XmlaPackage.STATE_TYPE_OBJECT5:
				return validateStateTypeObject5((StateType2)value, diagnostics, context);
			case XmlaPackage.STATE_TYPE_OBJECT6:
				return validateStateTypeObject6((StateType6)value, diagnostics, context);
			case XmlaPackage.STORAGE_MODE_TYPE_OBJECT:
				return validateStorageModeTypeObject((StorageModeType1)value, diagnostics, context);
			case XmlaPackage.SYNCHRONIZE_SECURITY_TYPE_OBJECT:
				return validateSynchronizeSecurityTypeObject((SynchronizeSecurityType)value, diagnostics, context);
			case XmlaPackage.TARGET_TYPE_TYPE_OBJECT:
				return validateTargetTypeTypeObject((TargetTypeType1)value, diagnostics, context);
			case XmlaPackage.TARGET_TYPE_TYPE_OBJECT1:
				return validateTargetTypeTypeObject1((TargetTypeType)value, diagnostics, context);
			case XmlaPackage.TARGET_TYPE_TYPE_OBJECT2:
				return validateTargetTypeTypeObject2((TargetTypeType2)value, diagnostics, context);
			case XmlaPackage.TRIMMING_TYPE_OBJECT:
				return validateTrimmingTypeObject((TrimmingType)value, diagnostics, context);
			case XmlaPackage.TYPE_TYPE_OBJECT:
				return validateTypeTypeObject((TypeType4)value, diagnostics, context);
			case XmlaPackage.TYPE_TYPE_OBJECT1:
				return validateTypeTypeObject1((TypeType5)value, diagnostics, context);
			case XmlaPackage.TYPE_TYPE_OBJECT2:
				return validateTypeTypeObject2((TypeType2)value, diagnostics, context);
			case XmlaPackage.TYPE_TYPE_OBJECT3:
				return validateTypeTypeObject3((TypeType1)value, diagnostics, context);
			case XmlaPackage.TYPE_TYPE_OBJECT4:
				return validateTypeTypeObject4((TypeType12)value, diagnostics, context);
			case XmlaPackage.TYPE_TYPE_OBJECT5:
				return validateTypeTypeObject5((TypeType)value, diagnostics, context);
			case XmlaPackage.TYPE_TYPE_OBJECT6:
				return validateTypeTypeObject6((TypeType3)value, diagnostics, context);
			case XmlaPackage.TYPE_TYPE_OBJECT7:
				return validateTypeTypeObject7((TypeType9)value, diagnostics, context);
			case XmlaPackage.TYPE_TYPE_OBJECT8:
				return validateTypeTypeObject8((TypeType8)value, diagnostics, context);
			case XmlaPackage.TYPE_TYPE_OBJECT9:
				return validateTypeTypeObject9((TypeType7)value, diagnostics, context);
			case XmlaPackage.TYPE_TYPE_OBJECT10:
				return validateTypeTypeObject10((TypeType10)value, diagnostics, context);
			case XmlaPackage.TYPE_TYPE_OBJECT11:
				return validateTypeTypeObject11((TypeType11)value, diagnostics, context);
			case XmlaPackage.TYPE_TYPE_OBJECT12:
				return validateTypeTypeObject12((TypeType13)value, diagnostics, context);
			case XmlaPackage.UNKNOWN_MEMBER_ENUM_TYPE_OBJECT:
				return validateUnknownMemberEnumTypeObject((UnknownMemberEnumType)value, diagnostics, context);
			case XmlaPackage.UPDATE_ISOLATION_LEVEL_TYPE_OBJECT:
				return validateUpdateIsolationLevelTypeObject((UpdateIsolationLevelType)value, diagnostics, context);
			case XmlaPackage.USAGE_TYPE_OBJECT:
				return validateUsageTypeObject((UsageType)value, diagnostics, context);
			case XmlaPackage.USAGE_TYPE_OBJECT1:
				return validateUsageTypeObject1((UsageType1)value, diagnostics, context);
			case XmlaPackage.VALUENS_TYPE_OBJECT:
				return validateValuensTypeObject((ValuensType1)value, diagnostics, context);
			case XmlaPackage.VALUENS_TYPE_OBJECT1:
				return validateValuensTypeObject1((ValuensType2)value, diagnostics, context);
			case XmlaPackage.VALUENS_TYPE_OBJECT2:
				return validateValuensTypeObject2((ValuensType)value, diagnostics, context);
			case XmlaPackage.VALUENS_TYPE_OBJECT3:
				return validateValuensTypeObject3((ValuensType4)value, diagnostics, context);
			case XmlaPackage.VALUENS_TYPE_OBJECT4:
				return validateValuensTypeObject4((ValuensType3)value, diagnostics, context);
			case XmlaPackage.VALUENS_TYPE_OBJECT5:
				return validateValuensTypeObject5((ValuensType5)value, diagnostics, context);
			case XmlaPackage.VALUENS_TYPE_OBJECT6:
				return validateValuensTypeObject6((ValuensType6)value, diagnostics, context);
			case XmlaPackage.VISIBILITY_TYPE_OBJECT:
				return validateVisibilityTypeObject((VisibilityType)value, diagnostics, context);
			case XmlaPackage.VISUAL_MODE_TYPE_OBJECT:
				return validateVisualModeTypeObject((VisualModeType)value, diagnostics, context);
			case XmlaPackage.WRITE_BACK_TABLE_CREATION_OBJECT:
				return validateWriteBackTableCreationObject((WriteBackTableCreation)value, diagnostics, context);
			case XmlaPackage.WRITE_TYPE_OBJECT:
				return validateWriteTypeObject((WriteType)value, diagnostics, context);
			case XmlaPackage.WRITE_TYPE_OBJECT1:
				return validateWriteTypeObject1((WriteType2)value, diagnostics, context);
			case XmlaPackage.WRITE_TYPE_OBJECT2:
				return validateWriteTypeObject2((WriteType4)value, diagnostics, context);
			case XmlaPackage.WRITE_TYPE_OBJECT3:
				return validateWriteTypeObject3((WriteType1)value, diagnostics, context);
			case XmlaPackage.WRITE_TYPE_OBJECT4:
				return validateWriteTypeObject4((WriteType5)value, diagnostics, context);
			case XmlaPackage.WRITE_TYPE_OBJECT5:
				return validateWriteTypeObject5((WriteType3)value, diagnostics, context);
			case XmlaPackage.WRITE_TYPE_OBJECT6:
				return validateWriteTypeObject6((WriteType6)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccount(Account account, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(account, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccountsType(AccountsType accountsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(accountsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(action, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionsType(ActionsType actionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionsType1(ActionsType1 actionsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionType(ActionType actionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregation(Aggregation aggregation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aggregation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationAttribute(AggregationAttribute aggregationAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aggregationAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationDesign(AggregationDesign aggregationDesign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aggregationDesign, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationDesignAttribute(AggregationDesignAttribute aggregationDesignAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aggregationDesignAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationDesignDimension(AggregationDesignDimension aggregationDesignDimension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aggregationDesignDimension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationDesignsType(AggregationDesignsType aggregationDesignsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aggregationDesignsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationDimension(AggregationDimension aggregationDimension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aggregationDimension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationInstance(AggregationInstance aggregationInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aggregationInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationInstanceAttribute(AggregationInstanceAttribute aggregationInstanceAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aggregationInstanceAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationInstanceDimension(AggregationInstanceDimension aggregationInstanceDimension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aggregationInstanceDimension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationInstanceMeasure(AggregationInstanceMeasure aggregationInstanceMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aggregationInstanceMeasure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationInstancesType(AggregationInstancesType aggregationInstancesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aggregationInstancesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationsType(AggregationsType aggregationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aggregationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlgorithmParameter(AlgorithmParameter algorithmParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(algorithmParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlgorithmParametersType(AlgorithmParametersType algorithmParametersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(algorithmParametersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAliasesType(AliasesType aliasesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aliasesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllMemberTranslationsType(AllMemberTranslationsType allMemberTranslationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allMemberTranslationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlter(Alter alter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(alter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAndOrType(AndOrType andOrType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(andOrType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotation(Annotation annotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotationsType(AnnotationsType annotationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssembliesType(AssembliesType assembliesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assembliesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssembliesType1(AssembliesType1 assembliesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assembliesType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssembly(Assembly assembly, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assembly, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttach(Attach attach, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attach, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeAllMemberTranslationsType(AttributeAllMemberTranslationsType attributeAllMemberTranslationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeAllMemberTranslationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeBinding(AttributeBinding attributeBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeInsertUpdate(AttributeInsertUpdate attributeInsertUpdate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeInsertUpdate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributePermission(AttributePermission attributePermission, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributePermission, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributePermissionsType(AttributePermissionsType attributePermissionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributePermissionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributePermissionsType1(AttributePermissionsType1 attributePermissionsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributePermissionsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeRelationship(AttributeRelationship attributeRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeRelationship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeRelationshipsType(AttributeRelationshipsType attributeRelationshipsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeRelationshipsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributesType(AttributesType attributesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributesType1(AttributesType1 attributesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributesType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributesType2(AttributesType2 attributesType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributesType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributesType3(AttributesType3 attributesType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributesType3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributesType4(AttributesType4 attributesType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributesType4, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributesType5(AttributesType5 attributesType5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributesType5, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributesType6(AttributesType6 attributesType6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributesType6, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributesType7(AttributesType7 attributesType7, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributesType7, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributesType8(AttributesType8 attributesType8, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributesType8, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeTranslation(AttributeTranslation attributeTranslation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeTranslation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackup(Backup backup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(backup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBatch(Batch batch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(batch, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBeginSessionType(BeginSessionType beginSessionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(beginSessionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBeginTransaction(BeginTransaction beginTransaction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(beginTransaction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinding(Binding binding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBindings(Bindings bindings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bindings, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolBinop(BoolBinop boolBinop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolBinop, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanExpr(BooleanExpr booleanExpr, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanExpr, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalculatedMeasureBinding(CalculatedMeasureBinding calculatedMeasureBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(calculatedMeasureBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalculationPropertiesType(CalculationPropertiesType calculationPropertiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(calculationPropertiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalculationProperty(CalculationProperty calculationProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(calculationProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalculationsType(CalculationsType calculationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(calculationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCancel(Cancel cancel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cancel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCell(Cell cell, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cell, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCellPermission(CellPermission cellPermission, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cellPermission, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCellPermissionsType(CellPermissionsType cellPermissionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cellPermissionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifiedColumnsType(ClassifiedColumnsType classifiedColumnsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classifiedColumnsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClearCache(ClearCache clearCache, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clearCache, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClearResultType(ClearResultType clearResultType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clearResultType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloneDatabase(CloneDatabase cloneDatabase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cloneDatabase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClrAssembly(ClrAssembly clrAssembly, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clrAssembly, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClrAssemblyFile(ClrAssemblyFile clrAssemblyFile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clrAssemblyFile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnBinding(ColumnBinding columnBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(columnBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnsType(ColumnsType columnsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(columnsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnsType1(ColumnsType1 columnsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(columnsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnsType2(ColumnsType2 columnsType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(columnsType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnsType3(ColumnsType3 columnsType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(columnsType3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnsType4(ColumnsType4 columnsType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(columnsType4, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnType(ColumnType columnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(columnType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComAssembly(ComAssembly comAssembly, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(comAssembly, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommand(Command command, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(command, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommandsType(CommandsType commandsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commandsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommitTransaction(CommitTransaction commitTransaction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commitTransaction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComparatorType(ComparatorType comparatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(comparatorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreate(Create create, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(create, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCube(Cube cube, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cube, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCubeAttribute(CubeAttribute cubeAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cubeAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCubeAttributeBinding(CubeAttributeBinding cubeAttributeBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cubeAttributeBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCubeDimension(CubeDimension cubeDimension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cubeDimension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCubeDimensionBinding(CubeDimensionBinding cubeDimensionBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cubeDimensionBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCubeDimensionPermission(CubeDimensionPermission cubeDimensionPermission, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cubeDimensionPermission, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCubeHierarchy(CubeHierarchy cubeHierarchy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cubeHierarchy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCubePermission(CubePermission cubePermission, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cubePermission, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCubePermissionsType(CubePermissionsType cubePermissionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cubePermissionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCubesType(CubesType cubesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cubesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrentStorageModeType(CurrentStorageModeType currentStorageModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(currentStorageModeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrentStorageModeType1(CurrentStorageModeType1 currentStorageModeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(currentStorageModeType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomRollupColumnType(CustomRollupColumnType customRollupColumnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customRollupColumnType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomRollupPropertiesColumnType(CustomRollupPropertiesColumnType customRollupPropertiesColumnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customRollupPropertiesColumnType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatabase(Database database, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(database, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatabasePermission(DatabasePermission databasePermission, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(databasePermission, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatabasePermissionsType(DatabasePermissionsType databasePermissionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(databasePermissionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatabasesType(DatabasesType databasesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(databasesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataBlock(DataBlock dataBlock, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataBlock, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataItem(DataItem dataItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataMiningMeasureGroupDimension(DataMiningMeasureGroupDimension dataMiningMeasureGroupDimension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataMiningMeasureGroupDimension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataSource(DataSource dataSource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataSource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataSourcePermission(DataSourcePermission dataSourcePermission, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataSourcePermission, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataSourcePermissionsType(DataSourcePermissionsType dataSourcePermissionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataSourcePermissionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataSourcesType(DataSourcesType dataSourcesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataSourcesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataSourceView(DataSourceView dataSourceView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataSourceView, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataSourceViewBinding(DataSourceViewBinding dataSourceViewBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataSourceViewBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataSourceViewsType(DataSourceViewsType dataSourceViewsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataSourceViewsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType1(DataType1 dataType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType2(DataType2 dataType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType3(DataType3 dataType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataType3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDBCC(DBCC dbcc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dbcc, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDegenerateMeasureGroupDimension(DegenerateMeasureGroupDimension degenerateMeasureGroupDimension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(degenerateMeasureGroupDimension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelete(Delete delete, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(delete, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDesignAggregations(DesignAggregations designAggregations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(designAggregations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetach(Detach detach, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(detach, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDimension(Dimension dimension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dimension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDimensionAttribute(DimensionAttribute dimensionAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dimensionAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDimensionBinding(DimensionBinding dimensionBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dimensionBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDimensionPermission(DimensionPermission dimensionPermission, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dimensionPermission, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDimensionPermissionsType(DimensionPermissionsType dimensionPermissionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dimensionPermissionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDimensionPermissionsType1(DimensionPermissionsType1 dimensionPermissionsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dimensionPermissionsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDimensionsType(DimensionsType dimensionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dimensionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscoverResponseType(DiscoverResponseType discoverResponseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(discoverResponseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscoverType(DiscoverType discoverType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(discoverType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDrillThroughAction(DrillThroughAction drillThroughAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(drillThroughAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDrop(Drop drop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(drop, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDSVTableBinding(DSVTableBinding dsvTableBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dsvTableBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndOfDataType(EndOfDataType endOfDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(endOfDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndSessionType(EndSessionType endSessionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(endSessionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateErrorConfiguration(ErrorConfiguration errorConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(errorConfiguration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent(Event event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(event, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventCategoryType(EventCategoryType eventCategoryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventCategoryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventColumn(EventColumn eventColumn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventColumn, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventColumnID(EventColumnID eventColumnID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventColumnID, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventColumnListType(EventColumnListType eventColumnListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventColumnListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventColumnSubclassListType(EventColumnSubclassListType eventColumnSubclassListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventColumnSubclassListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventColumnSubclassType(EventColumnSubclassType eventColumnSubclassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventColumnSubclassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventListType(EventListType eventListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventSessionType(EventSessionType eventSessionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventSessionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventsType(EventsType eventsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventType(EventType eventType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventType1(EventType1 eventType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventTypeType(EventTypeType eventTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecuteParameter(ExecuteParameter executeParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(executeParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecuteResponseType(ExecuteResponseType executeResponseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(executeResponseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecuteType(ExecuteType executeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(executeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilesType(FilesType filesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFolder(Folder folder, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(folder, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFoldingParameters(FoldingParameters foldingParameters, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(foldingParameters, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForeignKeyColumnsType(ForeignKeyColumnsType foreignKeyColumnsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(foreignKeyColumnsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForeignKeyColumnsType1(ForeignKeyColumnsType1 foreignKeyColumnsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(foreignKeyColumnsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForeignKeyColumnType(ForeignKeyColumnType foreignKeyColumnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(foreignKeyColumnType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalType(GlobalType globalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroup(Group group, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(group, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupsType(GroupsType groupsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(groupsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHierarchiesType(HierarchiesType hierarchiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hierarchiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHierarchiesType1(HierarchiesType1 hierarchiesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hierarchiesType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHierarchiesType2(HierarchiesType2 hierarchiesType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hierarchiesType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHierarchy(Hierarchy hierarchy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hierarchy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageLoad(ImageLoad imageLoad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imageLoad, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageSave(ImageSave imageSave, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imageSave, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncrementalProcessingNotification(IncrementalProcessingNotification incrementalProcessingNotification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(incrementalProcessingNotification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncrementalProcessingNotificationsType(IncrementalProcessingNotificationsType incrementalProcessingNotificationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(incrementalProcessingNotificationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInheritedBinding(InheritedBinding inheritedBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inheritedBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsert(Insert insert, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(insert, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeepResultType(KeepResultType keepResultType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(keepResultType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyColumnsType(KeyColumnsType keyColumnsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(keyColumnsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyColumnsType1(KeyColumnsType1 keyColumnsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(keyColumnsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyColumnsType2(KeyColumnsType2 keyColumnsType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(keyColumnsType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyColumnsType3(KeyColumnsType3 keyColumnsType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(keyColumnsType3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyColumnsType4(KeyColumnsType4 keyColumnsType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(keyColumnsType4, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyColumnType(KeyColumnType keyColumnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(keyColumnType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeysType(KeysType keysType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(keysType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeysType1(KeysType1 keysType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(keysType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKpi(Kpi kpi, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kpi, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKpisType(KpisType kpisType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kpisType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKpisType1(KpisType1 kpisType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kpisType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevel(Level level, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(level, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelsType(LevelsType levelsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(levelsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocation(Location location, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(location, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationBackup(LocationBackup locationBackup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locationBackup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationsType(LocationsType locationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationsType1(LocationsType1 locationsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locationsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationsType2(LocationsType2 locationsType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locationsType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLock(Lock lock, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lock, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMajorObject(MajorObject majorObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(majorObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManyToManyMeasureGroupDimension(ManyToManyMeasureGroupDimension manyToManyMeasureGroupDimension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(manyToManyMeasureGroupDimension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMdxScript(MdxScript mdxScript, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mdxScript, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMdxScriptsType(MdxScriptsType mdxScriptsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mdxScriptsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasure(Measure measure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureBinding(MeasureBinding measureBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureGroup(MeasureGroup measureGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureGroupAttribute(MeasureGroupAttribute measureGroupAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureGroupAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureGroupBinding(MeasureGroupBinding measureGroupBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureGroupBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureGroupDimension(MeasureGroupDimension measureGroupDimension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureGroupDimension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureGroupDimensionBinding(MeasureGroupDimensionBinding measureGroupDimensionBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureGroupDimensionBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureGroupsType(MeasureGroupsType measureGroupsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureGroupsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureGroupsType1(MeasureGroupsType1 measureGroupsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureGroupsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasuresType(MeasuresType measuresType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measuresType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasuresType1(MeasuresType1 measuresType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measuresType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasuresType2(MeasuresType2 measuresType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measuresType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMember(Member member, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(member, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMembersType(MembersType membersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(membersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMembersType1(MembersType1 membersType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(membersType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMergePartitions(MergePartitions mergePartitions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mergePartitions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMiningModel(MiningModel miningModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(miningModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMiningModelColumn(MiningModelColumn miningModelColumn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(miningModelColumn, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMiningModelingFlag(MiningModelingFlag miningModelingFlag, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(miningModelingFlag, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMiningModelPermission(MiningModelPermission miningModelPermission, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(miningModelPermission, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMiningModelPermissionsType(MiningModelPermissionsType miningModelPermissionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(miningModelPermissionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMiningModelsType(MiningModelsType miningModelsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(miningModelsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMiningStructure(MiningStructure miningStructure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(miningStructure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMiningStructureColumn(MiningStructureColumn miningStructureColumn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(miningStructureColumn, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMiningStructurePermission(MiningStructurePermission miningStructurePermission, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(miningStructurePermission, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMiningStructurePermissionsType(MiningStructurePermissionsType miningStructurePermissionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(miningStructurePermissionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMiningStructuresType(MiningStructuresType miningStructuresType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(miningStructuresType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelingFlagsType(ModelingFlagsType modelingFlagsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelingFlagsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelingFlagsType1(ModelingFlagsType1 modelingFlagsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelingFlagsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameColumnType(NameColumnType nameColumnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nameColumnType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamingTemplateTranslationsType(NamingTemplateTranslationsType namingTemplateTranslationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namingTemplateTranslationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotifyTableChange(NotifyTableChange notifyTableChange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(notifyTableChange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotType(NotType notType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(notType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject(org.eclipse.daanse.xmla.model.ecore.xmla.Object object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectReference(ObjectReference objectReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectType(ObjectType objectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOlapDataSource(OlapDataSource olapDataSource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(olapDataSource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrdinalType(OrdinalType ordinalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ordinalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutOfLineBinding(OutOfLineBinding outOfLineBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outOfLineBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParallelType(ParallelType parallelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parallelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameters(Parameters parameters, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameters, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParametersType(ParametersType parametersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parametersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterType2(ParameterType2 parameterType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartition(Partition partition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(partition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartitionsType(PartitionsType partitionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(partitionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePermission(Permission permission, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(permission, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerspective(Perspective perspective, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(perspective, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerspectiveAction(PerspectiveAction perspectiveAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(perspectiveAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerspectiveAttribute(PerspectiveAttribute perspectiveAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(perspectiveAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerspectiveCalculation(PerspectiveCalculation perspectiveCalculation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(perspectiveCalculation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerspectiveDimension(PerspectiveDimension perspectiveDimension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(perspectiveDimension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerspectiveHierarchy(PerspectiveHierarchy perspectiveHierarchy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(perspectiveHierarchy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerspectiveKpi(PerspectiveKpi perspectiveKpi, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(perspectiveKpi, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerspectiveMeasure(PerspectiveMeasure perspectiveMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(perspectiveMeasure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerspectiveMeasureGroup(PerspectiveMeasureGroup perspectiveMeasureGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(perspectiveMeasureGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerspectivesType(PerspectivesType perspectivesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(perspectivesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePredLeaf(PredLeaf predLeaf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(predLeaf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProactiveCaching(ProactiveCaching proactiveCaching, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(proactiveCaching, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProactiveCachingBinding(ProactiveCachingBinding proactiveCachingBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(proactiveCachingBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProactiveCachingIncrementalProcessingBinding(ProactiveCachingIncrementalProcessingBinding proactiveCachingIncrementalProcessingBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(proactiveCachingIncrementalProcessingBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProactiveCachingInheritedBinding(ProactiveCachingInheritedBinding proactiveCachingInheritedBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(proactiveCachingInheritedBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProactiveCachingObjectNotificationBinding(ProactiveCachingObjectNotificationBinding proactiveCachingObjectNotificationBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(proactiveCachingObjectNotificationBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProactiveCachingQueryBinding(ProactiveCachingQueryBinding proactiveCachingQueryBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(proactiveCachingQueryBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProactiveCachingTablesBinding(ProactiveCachingTablesBinding proactiveCachingTablesBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(proactiveCachingTablesBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess(org.eclipse.daanse.xmla.model.ecore.xmla.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(process, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperties(Properties properties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(properties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertiesType(PropertiesType propertiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyList(PropertyList propertyList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePushedDataSource(PushedDataSource pushedDataSource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pushedDataSource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQueriesType(QueriesType queriesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(queriesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQueryBinding(QueryBinding queryBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(queryBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQueryNotification(QueryNotification queryNotification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(queryNotification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQueryNotificationsType(QueryNotificationsType queryNotificationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(queryNotificationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceMeasureGroupDimension(ReferenceMeasureGroupDimension referenceMeasureGroupDimension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenceMeasureGroupDimension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegularMeasureGroupDimension(RegularMeasureGroupDimension regularMeasureGroupDimension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(regularMeasureGroupDimension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationalDataSource(RelationalDataSource relationalDataSource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relationalDataSource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportAction(ReportAction reportAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reportAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportFormatParameter(ReportFormatParameter reportFormatParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reportFormatParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportFormatParametersType(ReportFormatParametersType reportFormatParametersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reportFormatParametersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportParameter(ReportParameter reportParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reportParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportParametersType(ReportParametersType reportParametersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reportParametersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestore(Restore restore, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(restore, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestrictionListType(RestrictionListType restrictionListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(restrictionListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestrictionsType(RestrictionsType restrictionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(restrictionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultType(ResultType resultType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resultType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReturn(Return return_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(return_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReturnType(ReturnType returnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(returnType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole(Role role, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(role, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRolesType(RolesType rolesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rolesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRolesType1(RolesType1 rolesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rolesType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRollbackTransaction(RollbackTransaction rollbackTransaction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rollbackTransaction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRootType(RootType rootType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rootType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowBinding(RowBinding rowBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rowBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScalarMiningStructureColumn(ScalarMiningStructureColumn scalarMiningStructureColumn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scalarMiningStructureColumn, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServer(Server server, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(server, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServerPropertiesType(ServerPropertiesType serverPropertiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serverPropertiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServerProperty(ServerProperty serverProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serverProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSessionType(SessionType sessionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sessionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetAuthContext(SetAuthContext setAuthContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(setAuthContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSkippedLevelsColumnType(SkippedLevelsColumnType skippedLevelsColumnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(skippedLevelsColumnType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSource(Source source, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(source, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourcesType(SourcesType sourcesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sourcesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStandardAction(StandardAction standardAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(standardAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatement(Statement statement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(statement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorageModeType(StorageModeType storageModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(storageModeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorageModeType2(StorageModeType2 storageModeType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(storageModeType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorageModeType3(StorageModeType3 storageModeType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(storageModeType3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscribe(Subscribe subscribe, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subscribe, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSynchronize(Synchronize synchronize, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(synchronize, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableBinding(TableBinding tableBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableMiningStructureColumn(TableMiningStructureColumn tableMiningStructureColumn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableMiningStructureColumn, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableNotification(TableNotification tableNotification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableNotification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableNotificationsType(TableNotificationsType tableNotificationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableNotificationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableNotificationsType1(TableNotificationsType1 tableNotificationsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableNotificationsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTabularBinding(TabularBinding tabularBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tabularBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetType(TargetType targetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(targetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetType1(TargetType1 targetType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(targetType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeAttributeBinding(TimeAttributeBinding timeAttributeBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeAttributeBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeBinding(TimeBinding timeBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrace(Trace trace, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trace, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTraceColumns(TraceColumns traceColumns, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(traceColumns, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTraceDefinitionProviderInfo(TraceDefinitionProviderInfo traceDefinitionProviderInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(traceDefinitionProviderInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTraceEvent(TraceEvent traceEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(traceEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTraceEventCategories(TraceEventCategories traceEventCategories, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(traceEventCategories, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTraceFilter(TraceFilter traceFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(traceFilter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTracesType(TracesType tracesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tracesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTranslation(Translation translation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(translation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTranslationInsertUpdate(TranslationInsertUpdate translationInsertUpdate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(translationInsertUpdate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTranslationsType(TranslationsType translationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(translationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTranslationType(TranslationType translationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(translationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType6(TypeType6 typeType6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeType6, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnaryExpr(UnaryExpr unaryExpr, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unaryExpr, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnaryOperatorColumnType(UnaryOperatorColumnType unaryOperatorColumnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unaryOperatorColumnType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnknownMemberTranslationsType(UnknownMemberTranslationsType unknownMemberTranslationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unknownMemberTranslationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnknownMemberType(UnknownMemberType unknownMemberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unknownMemberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnlock(Unlock unlock, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unlock, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnsubscribe(Unsubscribe unsubscribe, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unsubscribe, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdate(Update update, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(update, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdateCells(UpdateCells updateCells, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(updateCells, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserDefinedGroupBinding(UserDefinedGroupBinding userDefinedGroupBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(userDefinedGroupBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueColumnType(ValueColumnType valueColumnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueColumnType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionType(VersionType versionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(versionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWhere(Where where, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(where, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWhereAttribute(WhereAttribute whereAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(whereAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessType(AccessType accessType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregateFunctionType(AggregateFunctionType aggregateFunctionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationFunctionType(AggregationFunctionType aggregationFunctionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationStorageType(AggregationStorageType aggregationStorageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationTypeType(AggregationTypeType aggregationTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationUsageType(AggregationUsageType aggregationUsageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlgorithmType(AlgorithmType algorithmType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllMemberAggregationUsageType(AllMemberAggregationUsageType allMemberAggregationUsageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeHierarchyOptimizedStateType(AttributeHierarchyOptimizedStateType attributeHierarchyOptimizedStateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeHierarchyOptimizedStateType1(AttributeHierarchyOptimizedStateType1 attributeHierarchyOptimizedStateType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAxisFormatType(AxisFormatType axisFormatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCacheModeType(CacheModeType cacheModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalculationTypeType(CalculationTypeType calculationTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardinalityType(CardinalityType cardinalityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardinalityType1(CardinalityType1 cardinalityType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCatalogLocationType(CatalogLocationType catalogLocationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionStringSecurityType(ConnectionStringSecurityType connectionStringSecurityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentType(ContentType contentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentType1(ContentType1 contentType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCubeStorageModeEnumType(CubeStorageModeEnumType cubeStorageModeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataAggregationType(DataAggregationType dataAggregationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeType(DataTypeType dataTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeType1(DataTypeType1 dataTypeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDbpropConcatNullBehaviorType(DbpropConcatNullBehaviorType dbpropConcatNullBehaviorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDbpropMsmdAutoExistsType(DbpropMsmdAutoExistsType dbpropMsmdAutoExistsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDbpropMsmdCompareCaseSensitiveStringFlagsType(DbpropMsmdCompareCaseSensitiveStringFlagsType dbpropMsmdCompareCaseSensitiveStringFlagsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDbpropMsmdMDXCompatibilityType(DbpropMsmdMDXCompatibilityType dbpropMsmdMDXCompatibilityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDbpropMsmdSubqueriesType(DbpropMsmdSubqueriesType dbpropMsmdSubqueriesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDbpropNullCollationType(DbpropNullCollationType dbpropNullCollationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDbpropOutputParameterAvailableType(DbpropOutputParameterAvailableType dbpropOutputParameterAvailableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDbpropPersistentIdTypeType(DbpropPersistentIdTypeType dbpropPersistentIdTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDbpropPrepareAbortBehaviorType(DbpropPrepareAbortBehaviorType dbpropPrepareAbortBehaviorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDbpropPrepareCommitBehaviorType(DbpropPrepareCommitBehaviorType dbpropPrepareCommitBehaviorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDbpropQuotedIdentifierCaseType(DbpropQuotedIdentifierCaseType dbpropQuotedIdentifierCaseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDialectType(DialectType dialectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDimensionAttributeTypeEnumType(DimensionAttributeTypeEnumType dimensionAttributeTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDimensionCurrentStorageModeEnumType(DimensionCurrentStorageModeEnumType dimensionCurrentStorageModeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscretizationMethodType(DiscretizationMethodType discretizationMethodType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurabilityGuaranteeType(DurabilityGuaranteeType durabilityGuaranteeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEditionType(EditionType editionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFiscalYearNameType(FiscalYearNameType fiscalYearNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormatType(FormatType formatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormatType1(FormatType1 formatType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupingBehaviorType(GroupingBehaviorType groupingBehaviorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHideMemberIfType(HideMemberIfType hideMemberIfType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHierarchyUniqueNameStyleType(HierarchyUniqueNameStyleType hierarchyUniqueNameStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceSelectionType(InstanceSelectionType instanceSelectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvalidXmlCharactersType(InvalidXmlCharactersType invalidXmlCharactersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvocationType(InvocationType invocationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvocationType1(InvocationType1 invocationType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvocationType2(InvocationType2 invocationType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIsolationType(IsolationType isolationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyDuplicateType(KeyDuplicateType keyDuplicateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyErrorActionType(KeyErrorActionType keyErrorActionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyErrorLimitActionType(KeyErrorLimitActionType keyErrorLimitActionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyNotFoundType(KeyNotFoundType keyNotFoundType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaterializationType(MaterializationType materializationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMdpropAggregateCellUpdateType(MdpropAggregateCellUpdateType mdpropAggregateCellUpdateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMdpropFlatteningSupportType(MdpropFlatteningSupportType mdpropFlatteningSupportType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMdpropMdxNonMeasureExpressionsType(MdpropMdxNonMeasureExpressionsType mdpropMdxNonMeasureExpressionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMdpropMdxRangeRowsetType(MdpropMdxRangeRowsetType mdpropMdxRangeRowsetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMdpropMdxSlicerType(MdpropMdxSlicerType mdpropMdxSlicerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMdxMissingMemberModeType(MdxMissingMemberModeType mdxMissingMemberModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMdxMissingMemberModeType1(MdxMissingMemberModeType1 mdxMissingMemberModeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMDXSupportType(MDXSupportType mdxSupportType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureGroupStorageModeEnumType(MeasureGroupStorageModeEnumType measureGroupStorageModeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMembersWithDataType(MembersWithDataType membersWithDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemberUniqueNameStyleType(MemberUniqueNameStyleType memberUniqueNameStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryLockingModeType(MemoryLockingModeType memoryLockingModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeType(ModeType modeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotificationTechniqueType(NotificationTechniqueType notificationTechniqueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotificationTechniqueType1(NotificationTechniqueType1 notificationTechniqueType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNullKeyConvertedToUnknownType(NullKeyConvertedToUnknownType nullKeyConvertedToUnknownType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNullKeyNotAllowedType(NullKeyNotAllowedType nullKeyNotAllowedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNullProcessingType(NullProcessingType nullProcessingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectExpansion(ObjectExpansion objectExpansion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnlineModeType(OnlineModeType onlineModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptimizedStateType(OptimizedStateType optimizedStateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptionalityType(OptionalityType optionalityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderByType(OrderByType orderByType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOverrideBehaviorType(OverrideBehaviorType overrideBehaviorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterType(ParameterType parameterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterType1(ParameterType1 parameterType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartitionCurrentStorageModeEnumType(PartitionCurrentStorageModeEnumType partitionCurrentStorageModeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartitionModes(PartitionModes partitionModes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartitionStorageModeEnumType(PartitionStorageModeEnumType partitionStorageModeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePermissionSetType(PermissionSetType permissionSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersistenceType(PersistenceType persistenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersistenceType1(PersistenceType1 persistenceType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessingGroupType(ProcessingGroupType processingGroupType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessingModeType(ProcessingModeType processingModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessingModeType1(ProcessingModeType1 processingModeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessingModeType2(ProcessingModeType2 processingModeType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessingModeType3(ProcessingModeType3 processingModeType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessingStateType(ProcessingStateType processingStateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProviderTypeType(ProviderTypeType providerTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadDefinitionType(ReadDefinitionType readDefinitionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadSourceDataType(ReadSourceDataType readSourceDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadType(ReadType readType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadType1(ReadType1 readType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefreshPolicyType(RefreshPolicyType refreshPolicyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefreshPolicyType1(RefreshPolicyType1 refreshPolicyType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipTypeType(RelationshipTypeType relationshipTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingFirstWeekOfMonthType(ReportingFirstWeekOfMonthType reportingFirstWeekOfMonthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingWeekToMonthPatternType(ReportingWeekToMonthPatternType reportingWeekToMonthPatternType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestTypeType(RequestTypeType requestTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseEncodingType(ResponseEncodingType responseEncodingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRetentionModes(RetentionModes retentionModes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRootMemberIfType(RootMemberIfType rootMemberIfType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSafetyOptionsType(SafetyOptionsType safetyOptionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScope(Scope scope, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScriptCacheProcessingModeType(ScriptCacheProcessingModeType scriptCacheProcessingModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScriptErrorHandlingModeType(ScriptErrorHandlingModeType scriptErrorHandlingModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecuredCellValueType(SecuredCellValueType securedCellValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityType(SecurityType securityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityType1(SecurityType1 securityType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShareDimensionStorageType(ShareDimensionStorageType shareDimensionStorageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSQLQueryModeType(SQLQueryModeType sqlQueryModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateSupportType(StateSupportType stateSupportType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateType(StateType stateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateType1(StateType1 stateType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateType2(StateType2 stateType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateType3(StateType3 stateType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateType4(StateType4 stateType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateType5(StateType5 stateType5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateType6(StateType6 stateType6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorageModeType1(StorageModeType1 storageModeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSynchronizeSecurityType(SynchronizeSecurityType synchronizeSecurityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetTypeType(TargetTypeType targetTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetTypeType1(TargetTypeType1 targetTypeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetTypeType2(TargetTypeType2 targetTypeType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrimmingType(TrimmingType trimmingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType(TypeType typeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType1(TypeType1 typeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType2(TypeType2 typeType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType3(TypeType3 typeType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType4(TypeType4 typeType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType5(TypeType5 typeType5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType7(TypeType7 typeType7, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType8(TypeType8 typeType8, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType9(TypeType9 typeType9, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType10(TypeType10 typeType10, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType11(TypeType11 typeType11, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType12(TypeType12 typeType12, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType13(TypeType13 typeType13, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnknownMemberEnumType(UnknownMemberEnumType unknownMemberEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdateIsolationLevelType(UpdateIsolationLevelType updateIsolationLevelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsageType(UsageType usageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsageType1(UsageType1 usageType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValuensType(ValuensType valuensType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValuensType1(ValuensType1 valuensType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValuensType2(ValuensType2 valuensType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValuensType3(ValuensType3 valuensType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValuensType4(ValuensType4 valuensType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValuensType5(ValuensType5 valuensType5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValuensType6(ValuensType6 valuensType6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibilityType(VisibilityType visibilityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisualModeType(VisualModeType visualModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteBackTableCreation(WriteBackTableCreation writeBackTableCreation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteType(WriteType writeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteType1(WriteType1 writeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteType2(WriteType2 writeType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteType3(WriteType3 writeType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteType4(WriteType4 writeType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteType5(WriteType5 writeType5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteType6(WriteType6 writeType6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessTypeObject(AccessType accessTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregateFunctionTypeObject(AggregateFunctionType aggregateFunctionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationFunctionTypeObject(AggregationFunctionType aggregationFunctionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationStorageTypeObject(AggregationStorageType aggregationStorageTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationTypeTypeObject(AggregationTypeType aggregationTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationUsageTypeObject(AggregationUsageType aggregationUsageTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlgorithmTypeObject(AlgorithmType algorithmTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllMemberAggregationUsageTypeObject(AllMemberAggregationUsageType allMemberAggregationUsageTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeHierarchyOptimizedStateTypeObject(AttributeHierarchyOptimizedStateType attributeHierarchyOptimizedStateTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeHierarchyOptimizedStateTypeObject1(AttributeHierarchyOptimizedStateType1 attributeHierarchyOptimizedStateTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAxisFormatTypeObject(AxisFormatType axisFormatTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCacheModeTypeObject(CacheModeType cacheModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalculationTypeTypeObject(CalculationTypeType calculationTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardinalityTypeObject(CardinalityType cardinalityTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardinalityTypeObject1(CardinalityType1 cardinalityTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCatalogLocationTypeObject(CatalogLocationType catalogLocationTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionStringSecurityTypeObject(ConnectionStringSecurityType connectionStringSecurityTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentTypeObject(ContentType contentTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentTypeObject1(ContentType1 contentTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCubeStorageModeEnumTypeObject(CubeStorageModeEnumType cubeStorageModeEnumTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataAggregationTypeObject(DataAggregationType dataAggregationTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeTypeObject(DataTypeType dataTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeTypeObject1(DataTypeType1 dataTypeTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDbpropConcatNullBehaviorTypeObject(DbpropConcatNullBehaviorType dbpropConcatNullBehaviorTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDbpropMsmdAutoExistsTypeObject(DbpropMsmdAutoExistsType dbpropMsmdAutoExistsTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDbpropMsmdCompareCaseSensitiveStringFlagsTypeObject(DbpropMsmdCompareCaseSensitiveStringFlagsType dbpropMsmdCompareCaseSensitiveStringFlagsTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDbpropMsmdMDXCompatibilityTypeObject(DbpropMsmdMDXCompatibilityType dbpropMsmdMDXCompatibilityTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDbpropMsmdSubqueriesTypeObject(DbpropMsmdSubqueriesType dbpropMsmdSubqueriesTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDbpropNullCollationTypeObject(DbpropNullCollationType dbpropNullCollationTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDbpropOutputParameterAvailableTypeObject(DbpropOutputParameterAvailableType dbpropOutputParameterAvailableTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDbpropPersistentIdTypeTypeObject(DbpropPersistentIdTypeType dbpropPersistentIdTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDbpropPrepareAbortBehaviorTypeObject(DbpropPrepareAbortBehaviorType dbpropPrepareAbortBehaviorTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDbpropPrepareCommitBehaviorTypeObject(DbpropPrepareCommitBehaviorType dbpropPrepareCommitBehaviorTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDbpropQuotedIdentifierCaseTypeObject(DbpropQuotedIdentifierCaseType dbpropQuotedIdentifierCaseTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDialectTypeObject(DialectType dialectTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDimensionAttributeTypeEnumTypeObject(DimensionAttributeTypeEnumType dimensionAttributeTypeEnumTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDimensionCurrentStorageModeEnumTypeObject(DimensionCurrentStorageModeEnumType dimensionCurrentStorageModeEnumTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscretizationMethodTypeObject(DiscretizationMethodType discretizationMethodTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurabilityGuaranteeTypeObject(DurabilityGuaranteeType durabilityGuaranteeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEditionTypeObject(EditionType editionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirstDayOfWeekType(BigInteger firstDayOfWeekType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFirstDayOfWeekType_Min(firstDayOfWeekType, diagnostics, context);
		if (result || diagnostics != null) result &= validateFirstDayOfWeekType_Max(firstDayOfWeekType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFirstDayOfWeekType_Min
	 */
	public static final BigInteger FIRST_DAY_OF_WEEK_TYPE__MIN__VALUE = new BigInteger("1");

	/**
	 * Validates the Min constraint of '<em>First Day Of Week Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirstDayOfWeekType_Min(BigInteger firstDayOfWeekType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = firstDayOfWeekType.compareTo(FIRST_DAY_OF_WEEK_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(XmlaPackage.Literals.FIRST_DAY_OF_WEEK_TYPE, firstDayOfWeekType, FIRST_DAY_OF_WEEK_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFirstDayOfWeekType_Max
	 */
	public static final BigInteger FIRST_DAY_OF_WEEK_TYPE__MAX__VALUE = new BigInteger("7");

	/**
	 * Validates the Max constraint of '<em>First Day Of Week Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirstDayOfWeekType_Max(BigInteger firstDayOfWeekType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = firstDayOfWeekType.compareTo(FIRST_DAY_OF_WEEK_TYPE__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(XmlaPackage.Literals.FIRST_DAY_OF_WEEK_TYPE, firstDayOfWeekType, FIRST_DAY_OF_WEEK_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFiscalFirstDayOfMonthType(BigInteger fiscalFirstDayOfMonthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFiscalFirstDayOfMonthType_Min(fiscalFirstDayOfMonthType, diagnostics, context);
		if (result || diagnostics != null) result &= validateFiscalFirstDayOfMonthType_Max(fiscalFirstDayOfMonthType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFiscalFirstDayOfMonthType_Min
	 */
	public static final BigInteger FISCAL_FIRST_DAY_OF_MONTH_TYPE__MIN__VALUE = new BigInteger("1");

	/**
	 * Validates the Min constraint of '<em>Fiscal First Day Of Month Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFiscalFirstDayOfMonthType_Min(BigInteger fiscalFirstDayOfMonthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = fiscalFirstDayOfMonthType.compareTo(FISCAL_FIRST_DAY_OF_MONTH_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(XmlaPackage.Literals.FISCAL_FIRST_DAY_OF_MONTH_TYPE, fiscalFirstDayOfMonthType, FISCAL_FIRST_DAY_OF_MONTH_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFiscalFirstDayOfMonthType_Max
	 */
	public static final BigInteger FISCAL_FIRST_DAY_OF_MONTH_TYPE__MAX__VALUE = new BigInteger("31");

	/**
	 * Validates the Max constraint of '<em>Fiscal First Day Of Month Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFiscalFirstDayOfMonthType_Max(BigInteger fiscalFirstDayOfMonthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = fiscalFirstDayOfMonthType.compareTo(FISCAL_FIRST_DAY_OF_MONTH_TYPE__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(XmlaPackage.Literals.FISCAL_FIRST_DAY_OF_MONTH_TYPE, fiscalFirstDayOfMonthType, FISCAL_FIRST_DAY_OF_MONTH_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFiscalFirstMonthType(BigInteger fiscalFirstMonthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFiscalFirstMonthType_Min(fiscalFirstMonthType, diagnostics, context);
		if (result || diagnostics != null) result &= validateFiscalFirstMonthType_Max(fiscalFirstMonthType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFiscalFirstMonthType_Min
	 */
	public static final BigInteger FISCAL_FIRST_MONTH_TYPE__MIN__VALUE = new BigInteger("1");

	/**
	 * Validates the Min constraint of '<em>Fiscal First Month Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFiscalFirstMonthType_Min(BigInteger fiscalFirstMonthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = fiscalFirstMonthType.compareTo(FISCAL_FIRST_MONTH_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(XmlaPackage.Literals.FISCAL_FIRST_MONTH_TYPE, fiscalFirstMonthType, FISCAL_FIRST_MONTH_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFiscalFirstMonthType_Max
	 */
	public static final BigInteger FISCAL_FIRST_MONTH_TYPE__MAX__VALUE = new BigInteger("12");

	/**
	 * Validates the Max constraint of '<em>Fiscal First Month Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFiscalFirstMonthType_Max(BigInteger fiscalFirstMonthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = fiscalFirstMonthType.compareTo(FISCAL_FIRST_MONTH_TYPE__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(XmlaPackage.Literals.FISCAL_FIRST_MONTH_TYPE, fiscalFirstMonthType, FISCAL_FIRST_MONTH_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFiscalYearNameTypeObject(FiscalYearNameType fiscalYearNameTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormatTypeObject(FormatType formatTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormatTypeObject1(FormatType1 formatTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupingBehaviorTypeObject(GroupingBehaviorType groupingBehaviorTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHideMemberIfTypeObject(HideMemberIfType hideMemberIfTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHierarchyUniqueNameStyleTypeObject(HierarchyUniqueNameStyleType hierarchyUniqueNameStyleTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIDType(String idType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIDType_Pattern(idType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIDType_Pattern
	 */
	public static final  PatternMatcher [][] ID_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9a-zA-Z]{8}-[0-9a-zA-Z]{4}-[0-9a-zA-Z] {4}-[0-9a-zA-Z]{4}-[0-9a-zA-Z]{12}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>ID Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIDType_Pattern(String idType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(XmlaPackage.Literals.ID_TYPE, idType, ID_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIDType1(String idType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIDType1_Pattern(idType1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIDType1_Pattern
	 */
	public static final  PatternMatcher [][] ID_TYPE1__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9a-zA-Z]{8}-[0-9a-zA-Z]{4}-[0-9a-zA-Z] {4}-[0-9a-zA-Z]{4}-[0-9a-zA-Z]{12}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>ID Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIDType1_Pattern(String idType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(XmlaPackage.Literals.ID_TYPE1, idType1, ID_TYPE1__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceSelectionTypeObject(InstanceSelectionType instanceSelectionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvalidXmlCharactersTypeObject(InvalidXmlCharactersType invalidXmlCharactersTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvocationTypeObject(InvocationType invocationTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvocationTypeObject1(InvocationType1 invocationTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvocationTypeObject2(InvocationType2 invocationTypeObject2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIsolationTypeObject(IsolationType isolationTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyDuplicateTypeObject(KeyDuplicateType keyDuplicateTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyErrorActionTypeObject(KeyErrorActionType keyErrorActionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyErrorLimitActionTypeObject(KeyErrorLimitActionType keyErrorLimitActionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyNotFoundTypeObject(KeyNotFoundType keyNotFoundTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManufacturingExtraMonthQuarterType(BigInteger manufacturingExtraMonthQuarterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateManufacturingExtraMonthQuarterType_Min(manufacturingExtraMonthQuarterType, diagnostics, context);
		if (result || diagnostics != null) result &= validateManufacturingExtraMonthQuarterType_Max(manufacturingExtraMonthQuarterType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateManufacturingExtraMonthQuarterType_Min
	 */
	public static final BigInteger MANUFACTURING_EXTRA_MONTH_QUARTER_TYPE__MIN__VALUE = new BigInteger("1");

	/**
	 * Validates the Min constraint of '<em>Manufacturing Extra Month Quarter Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManufacturingExtraMonthQuarterType_Min(BigInteger manufacturingExtraMonthQuarterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = manufacturingExtraMonthQuarterType.compareTo(MANUFACTURING_EXTRA_MONTH_QUARTER_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(XmlaPackage.Literals.MANUFACTURING_EXTRA_MONTH_QUARTER_TYPE, manufacturingExtraMonthQuarterType, MANUFACTURING_EXTRA_MONTH_QUARTER_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateManufacturingExtraMonthQuarterType_Max
	 */
	public static final BigInteger MANUFACTURING_EXTRA_MONTH_QUARTER_TYPE__MAX__VALUE = new BigInteger("4");

	/**
	 * Validates the Max constraint of '<em>Manufacturing Extra Month Quarter Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManufacturingExtraMonthQuarterType_Max(BigInteger manufacturingExtraMonthQuarterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = manufacturingExtraMonthQuarterType.compareTo(MANUFACTURING_EXTRA_MONTH_QUARTER_TYPE__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(XmlaPackage.Literals.MANUFACTURING_EXTRA_MONTH_QUARTER_TYPE, manufacturingExtraMonthQuarterType, MANUFACTURING_EXTRA_MONTH_QUARTER_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManufacturingFirstMonthType(BigInteger manufacturingFirstMonthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateManufacturingFirstMonthType_Min(manufacturingFirstMonthType, diagnostics, context);
		if (result || diagnostics != null) result &= validateManufacturingFirstMonthType_Max(manufacturingFirstMonthType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateManufacturingFirstMonthType_Min
	 */
	public static final BigInteger MANUFACTURING_FIRST_MONTH_TYPE__MIN__VALUE = new BigInteger("1");

	/**
	 * Validates the Min constraint of '<em>Manufacturing First Month Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManufacturingFirstMonthType_Min(BigInteger manufacturingFirstMonthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = manufacturingFirstMonthType.compareTo(MANUFACTURING_FIRST_MONTH_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(XmlaPackage.Literals.MANUFACTURING_FIRST_MONTH_TYPE, manufacturingFirstMonthType, MANUFACTURING_FIRST_MONTH_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateManufacturingFirstMonthType_Max
	 */
	public static final BigInteger MANUFACTURING_FIRST_MONTH_TYPE__MAX__VALUE = new BigInteger("12");

	/**
	 * Validates the Max constraint of '<em>Manufacturing First Month Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManufacturingFirstMonthType_Max(BigInteger manufacturingFirstMonthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = manufacturingFirstMonthType.compareTo(MANUFACTURING_FIRST_MONTH_TYPE__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(XmlaPackage.Literals.MANUFACTURING_FIRST_MONTH_TYPE, manufacturingFirstMonthType, MANUFACTURING_FIRST_MONTH_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManufacturingFirstWeekOfMonthType(BigInteger manufacturingFirstWeekOfMonthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateManufacturingFirstWeekOfMonthType_Min(manufacturingFirstWeekOfMonthType, diagnostics, context);
		if (result || diagnostics != null) result &= validateManufacturingFirstWeekOfMonthType_Max(manufacturingFirstWeekOfMonthType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateManufacturingFirstWeekOfMonthType_Min
	 */
	public static final BigInteger MANUFACTURING_FIRST_WEEK_OF_MONTH_TYPE__MIN__VALUE = new BigInteger("1");

	/**
	 * Validates the Min constraint of '<em>Manufacturing First Week Of Month Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManufacturingFirstWeekOfMonthType_Min(BigInteger manufacturingFirstWeekOfMonthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = manufacturingFirstWeekOfMonthType.compareTo(MANUFACTURING_FIRST_WEEK_OF_MONTH_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(XmlaPackage.Literals.MANUFACTURING_FIRST_WEEK_OF_MONTH_TYPE, manufacturingFirstWeekOfMonthType, MANUFACTURING_FIRST_WEEK_OF_MONTH_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateManufacturingFirstWeekOfMonthType_Max
	 */
	public static final BigInteger MANUFACTURING_FIRST_WEEK_OF_MONTH_TYPE__MAX__VALUE = new BigInteger("4");

	/**
	 * Validates the Max constraint of '<em>Manufacturing First Week Of Month Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManufacturingFirstWeekOfMonthType_Max(BigInteger manufacturingFirstWeekOfMonthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = manufacturingFirstWeekOfMonthType.compareTo(MANUFACTURING_FIRST_WEEK_OF_MONTH_TYPE__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(XmlaPackage.Literals.MANUFACTURING_FIRST_WEEK_OF_MONTH_TYPE, manufacturingFirstWeekOfMonthType, MANUFACTURING_FIRST_WEEK_OF_MONTH_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaterializationTypeObject(MaterializationType materializationTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMdpropAggregateCellUpdateTypeObject(MdpropAggregateCellUpdateType mdpropAggregateCellUpdateTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMdpropFlatteningSupportTypeObject(MdpropFlatteningSupportType mdpropFlatteningSupportTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMdpropMdxNonMeasureExpressionsTypeObject(MdpropMdxNonMeasureExpressionsType mdpropMdxNonMeasureExpressionsTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMdpropMdxRangeRowsetTypeObject(MdpropMdxRangeRowsetType mdpropMdxRangeRowsetTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMdpropMdxSlicerTypeObject(MdpropMdxSlicerType mdpropMdxSlicerTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMdxMissingMemberModeTypeObject(MdxMissingMemberModeType mdxMissingMemberModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMdxMissingMemberModeTypeObject1(MdxMissingMemberModeType1 mdxMissingMemberModeTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMDXSupportTypeObject(MDXSupportType mdxSupportTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureGroupStorageModeEnumTypeObject(MeasureGroupStorageModeEnumType measureGroupStorageModeEnumTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMembersWithDataTypeObject(MembersWithDataType membersWithDataTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemberUniqueNameStyleTypeObject(MemberUniqueNameStyleType memberUniqueNameStyleTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryLockingModeTypeObject(MemoryLockingModeType memoryLockingModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeTypeObject(ModeType modeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotificationTechniqueTypeObject(NotificationTechniqueType notificationTechniqueTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotificationTechniqueTypeObject1(NotificationTechniqueType1 notificationTechniqueTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNullKeyConvertedToUnknownTypeObject(NullKeyConvertedToUnknownType nullKeyConvertedToUnknownTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNullKeyNotAllowedTypeObject(NullKeyNotAllowedType nullKeyNotAllowedTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNullProcessingTypeObject(NullProcessingType nullProcessingTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectExpansionObject(ObjectExpansion objectExpansionObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnlineModeTypeObject(OnlineModeType onlineModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptimizedStateTypeObject(OptimizedStateType optimizedStateTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptionalityTypeObject(OptionalityType optionalityTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderByTypeObject(OrderByType orderByTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOverrideBehaviorTypeObject(OverrideBehaviorType overrideBehaviorTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterTypeObject(ParameterType parameterTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterTypeObject1(ParameterType1 parameterTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartitionCurrentStorageModeEnumTypeObject(PartitionCurrentStorageModeEnumType partitionCurrentStorageModeEnumTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartitionModesObject(PartitionModes partitionModesObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartitionStorageModeEnumTypeObject(PartitionStorageModeEnumType partitionStorageModeEnumTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePermissionSetTypeObject(PermissionSetType permissionSetTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersistenceTypeObject(PersistenceType persistenceTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersistenceTypeObject1(PersistenceType1 persistenceTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessingGroupTypeObject(ProcessingGroupType processingGroupTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessingModeTypeObject(ProcessingModeType processingModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessingModeTypeObject1(ProcessingModeType2 processingModeTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessingModeTypeObject2(ProcessingModeType1 processingModeTypeObject2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessingModeTypeObject3(ProcessingModeType3 processingModeTypeObject3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessingStateTypeObject(ProcessingStateType processingStateTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProviderTypeTypeObject(ProviderTypeType providerTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadDefinitionTypeObject(ReadDefinitionType readDefinitionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadSourceDataTypeObject(ReadSourceDataType readSourceDataTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadTypeObject(ReadType readTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadTypeObject1(ReadType1 readTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefreshPolicyTypeObject(RefreshPolicyType refreshPolicyTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefreshPolicyTypeObject1(RefreshPolicyType1 refreshPolicyTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipTypeTypeObject(RelationshipTypeType relationshipTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingFirstMonthType(BigInteger reportingFirstMonthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateReportingFirstMonthType_Min(reportingFirstMonthType, diagnostics, context);
		if (result || diagnostics != null) result &= validateReportingFirstMonthType_Max(reportingFirstMonthType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateReportingFirstMonthType_Min
	 */
	public static final BigInteger REPORTING_FIRST_MONTH_TYPE__MIN__VALUE = new BigInteger("1");

	/**
	 * Validates the Min constraint of '<em>Reporting First Month Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingFirstMonthType_Min(BigInteger reportingFirstMonthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = reportingFirstMonthType.compareTo(REPORTING_FIRST_MONTH_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(XmlaPackage.Literals.REPORTING_FIRST_MONTH_TYPE, reportingFirstMonthType, REPORTING_FIRST_MONTH_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateReportingFirstMonthType_Max
	 */
	public static final BigInteger REPORTING_FIRST_MONTH_TYPE__MAX__VALUE = new BigInteger("12");

	/**
	 * Validates the Max constraint of '<em>Reporting First Month Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingFirstMonthType_Max(BigInteger reportingFirstMonthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = reportingFirstMonthType.compareTo(REPORTING_FIRST_MONTH_TYPE__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(XmlaPackage.Literals.REPORTING_FIRST_MONTH_TYPE, reportingFirstMonthType, REPORTING_FIRST_MONTH_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingFirstWeekOfMonthTypeObject(ReportingFirstWeekOfMonthType reportingFirstWeekOfMonthTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportingWeekToMonthPatternTypeObject(ReportingWeekToMonthPatternType reportingWeekToMonthPatternTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestTypeTypeObject(RequestTypeType requestTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseEncodingTypeObject(ResponseEncodingType responseEncodingTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRetentionModesObject(RetentionModes retentionModesObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRootMemberIfTypeObject(RootMemberIfType rootMemberIfTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSafetyOptionsTypeObject(SafetyOptionsType safetyOptionsTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScopeObject(Scope scopeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScriptCacheProcessingModeTypeObject(ScriptCacheProcessingModeType scriptCacheProcessingModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScriptErrorHandlingModeTypeObject(ScriptErrorHandlingModeType scriptErrorHandlingModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecuredCellValueTypeObject(SecuredCellValueType securedCellValueTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityTypeObject(SecurityType securityTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityTypeObject1(SecurityType1 securityTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShareDimensionStorageTypeObject(ShareDimensionStorageType shareDimensionStorageTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSQLQueryModeTypeObject(SQLQueryModeType sqlQueryModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateSupportTypeObject(StateSupportType stateSupportTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateTypeObject(StateType stateTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateTypeObject1(StateType4 stateTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateTypeObject2(StateType5 stateTypeObject2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateTypeObject3(StateType1 stateTypeObject3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateTypeObject4(StateType3 stateTypeObject4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateTypeObject5(StateType2 stateTypeObject5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateTypeObject6(StateType6 stateTypeObject6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorageModeTypeObject(StorageModeType1 storageModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSynchronizeSecurityTypeObject(SynchronizeSecurityType synchronizeSecurityTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetTypeTypeObject(TargetTypeType1 targetTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetTypeTypeObject1(TargetTypeType targetTypeTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetTypeTypeObject2(TargetTypeType2 targetTypeTypeObject2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrimmingTypeObject(TrimmingType trimmingTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject(TypeType4 typeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject1(TypeType5 typeTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject2(TypeType2 typeTypeObject2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject3(TypeType1 typeTypeObject3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject4(TypeType12 typeTypeObject4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject5(TypeType typeTypeObject5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject6(TypeType3 typeTypeObject6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject7(TypeType9 typeTypeObject7, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject8(TypeType8 typeTypeObject8, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject9(TypeType7 typeTypeObject9, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject10(TypeType10 typeTypeObject10, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject11(TypeType11 typeTypeObject11, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject12(TypeType13 typeTypeObject12, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnknownMemberEnumTypeObject(UnknownMemberEnumType unknownMemberEnumTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdateIsolationLevelTypeObject(UpdateIsolationLevelType updateIsolationLevelTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsageTypeObject(UsageType usageTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsageTypeObject1(UsageType1 usageTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValuensTypeObject(ValuensType1 valuensTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValuensTypeObject1(ValuensType2 valuensTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValuensTypeObject2(ValuensType valuensTypeObject2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValuensTypeObject3(ValuensType4 valuensTypeObject3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValuensTypeObject4(ValuensType3 valuensTypeObject4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValuensTypeObject5(ValuensType5 valuensTypeObject5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValuensTypeObject6(ValuensType6 valuensTypeObject6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibilityTypeObject(VisibilityType visibilityTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisualModeTypeObject(VisualModeType visualModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteBackTableCreationObject(WriteBackTableCreation writeBackTableCreationObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteTypeObject(WriteType writeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteTypeObject1(WriteType2 writeTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteTypeObject2(WriteType4 writeTypeObject2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteTypeObject3(WriteType1 writeTypeObject3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteTypeObject4(WriteType5 writeTypeObject4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteTypeObject5(WriteType3 writeTypeObject5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteTypeObject6(WriteType6 writeTypeObject6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //XmlaValidator
