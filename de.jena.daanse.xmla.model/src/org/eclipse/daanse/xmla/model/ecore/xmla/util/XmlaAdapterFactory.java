/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.util;

import org.eclipse.daanse.xmla.model.ecore.xmla.Account;
import org.eclipse.daanse.xmla.model.ecore.xmla.AccountsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Action;
import org.eclipse.daanse.xmla.model.ecore.xmla.ActionType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ActionsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ActionsType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.Aggregation;
import org.eclipse.daanse.xmla.model.ecore.xmla.AggregationAttribute;
import org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesign;
import org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesignAttribute;
import org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesignDimension;
import org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesignsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDimension;
import org.eclipse.daanse.xmla.model.ecore.xmla.AggregationInstance;
import org.eclipse.daanse.xmla.model.ecore.xmla.AggregationInstanceAttribute;
import org.eclipse.daanse.xmla.model.ecore.xmla.AggregationInstanceDimension;
import org.eclipse.daanse.xmla.model.ecore.xmla.AggregationInstanceMeasure;
import org.eclipse.daanse.xmla.model.ecore.xmla.AggregationInstancesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AggregationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AlgorithmParameter;
import org.eclipse.daanse.xmla.model.ecore.xmla.AlgorithmParametersType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AliasesType;
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
import org.eclipse.daanse.xmla.model.ecore.xmla.Backup;
import org.eclipse.daanse.xmla.model.ecore.xmla.Batch;
import org.eclipse.daanse.xmla.model.ecore.xmla.BeginSessionType;
import org.eclipse.daanse.xmla.model.ecore.xmla.BeginTransaction;
import org.eclipse.daanse.xmla.model.ecore.xmla.Binding;
import org.eclipse.daanse.xmla.model.ecore.xmla.Bindings;
import org.eclipse.daanse.xmla.model.ecore.xmla.BoolBinop;
import org.eclipse.daanse.xmla.model.ecore.xmla.BooleanExpr;
import org.eclipse.daanse.xmla.model.ecore.xmla.CalculatedMeasureBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.CalculationPropertiesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty;
import org.eclipse.daanse.xmla.model.ecore.xmla.CalculationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Cancel;
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
import org.eclipse.daanse.xmla.model.ecore.xmla.CubesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.CurrentStorageModeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.CurrentStorageModeType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.CustomRollupColumnType;
import org.eclipse.daanse.xmla.model.ecore.xmla.CustomRollupPropertiesColumnType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DBCC;
import org.eclipse.daanse.xmla.model.ecore.xmla.DSVTableBinding;
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
import org.eclipse.daanse.xmla.model.ecore.xmla.Database;
import org.eclipse.daanse.xmla.model.ecore.xmla.DatabasePermission;
import org.eclipse.daanse.xmla.model.ecore.xmla.DatabasePermissionsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DatabasesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DegenerateMeasureGroupDimension;
import org.eclipse.daanse.xmla.model.ecore.xmla.Delete;
import org.eclipse.daanse.xmla.model.ecore.xmla.DesignAggregations;
import org.eclipse.daanse.xmla.model.ecore.xmla.Detach;
import org.eclipse.daanse.xmla.model.ecore.xmla.Dimension;
import org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute;
import org.eclipse.daanse.xmla.model.ecore.xmla.DimensionBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.DimensionPermission;
import org.eclipse.daanse.xmla.model.ecore.xmla.DimensionPermissionsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DimensionPermissionsType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.DimensionsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverResponseType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot;
import org.eclipse.daanse.xmla.model.ecore.xmla.DrillThroughAction;
import org.eclipse.daanse.xmla.model.ecore.xmla.Drop;
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
import org.eclipse.daanse.xmla.model.ecore.xmla.Folder;
import org.eclipse.daanse.xmla.model.ecore.xmla.FoldingParameters;
import org.eclipse.daanse.xmla.model.ecore.xmla.ForeignKeyColumnType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ForeignKeyColumnsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ForeignKeyColumnsType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.GlobalType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Group;
import org.eclipse.daanse.xmla.model.ecore.xmla.GroupsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.HierarchiesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.HierarchiesType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.HierarchiesType2;
import org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy;
import org.eclipse.daanse.xmla.model.ecore.xmla.ImageLoad;
import org.eclipse.daanse.xmla.model.ecore.xmla.ImageSave;
import org.eclipse.daanse.xmla.model.ecore.xmla.IncrementalProcessingNotification;
import org.eclipse.daanse.xmla.model.ecore.xmla.IncrementalProcessingNotificationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.InheritedBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.Insert;
import org.eclipse.daanse.xmla.model.ecore.xmla.KeepResultType;
import org.eclipse.daanse.xmla.model.ecore.xmla.KeyColumnType;
import org.eclipse.daanse.xmla.model.ecore.xmla.KeyColumnsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.KeyColumnsType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.KeyColumnsType2;
import org.eclipse.daanse.xmla.model.ecore.xmla.KeyColumnsType3;
import org.eclipse.daanse.xmla.model.ecore.xmla.KeyColumnsType4;
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
import org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject;
import org.eclipse.daanse.xmla.model.ecore.xmla.ManyToManyMeasureGroupDimension;
import org.eclipse.daanse.xmla.model.ecore.xmla.MdxScript;
import org.eclipse.daanse.xmla.model.ecore.xmla.MdxScriptsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Measure;
import org.eclipse.daanse.xmla.model.ecore.xmla.MeasureBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup;
import org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupAttribute;
import org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupDimension;
import org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupDimensionBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupsType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.MeasuresType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MeasuresType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.MeasuresType2;
import org.eclipse.daanse.xmla.model.ecore.xmla.Member;
import org.eclipse.daanse.xmla.model.ecore.xmla.MembersType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MembersType1;
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
import org.eclipse.daanse.xmla.model.ecore.xmla.ModelingFlagsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ModelingFlagsType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.NameColumnType;
import org.eclipse.daanse.xmla.model.ecore.xmla.NamingTemplateTranslationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.NotType;
import org.eclipse.daanse.xmla.model.ecore.xmla.NotifyTableChange;
import org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference;
import org.eclipse.daanse.xmla.model.ecore.xmla.ObjectType;
import org.eclipse.daanse.xmla.model.ecore.xmla.OlapDataSource;
import org.eclipse.daanse.xmla.model.ecore.xmla.OrdinalType;
import org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.ParallelType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ParameterType2;
import org.eclipse.daanse.xmla.model.ecore.xmla.Parameters;
import org.eclipse.daanse.xmla.model.ecore.xmla.ParametersType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Partition;
import org.eclipse.daanse.xmla.model.ecore.xmla.PartitionsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Permission;
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
import org.eclipse.daanse.xmla.model.ecore.xmla.Properties;
import org.eclipse.daanse.xmla.model.ecore.xmla.PropertiesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList;
import org.eclipse.daanse.xmla.model.ecore.xmla.PushedDataSource;
import org.eclipse.daanse.xmla.model.ecore.xmla.QueriesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.QueryBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.QueryNotification;
import org.eclipse.daanse.xmla.model.ecore.xmla.QueryNotificationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ReferenceMeasureGroupDimension;
import org.eclipse.daanse.xmla.model.ecore.xmla.RegularMeasureGroupDimension;
import org.eclipse.daanse.xmla.model.ecore.xmla.RelationalDataSource;
import org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction;
import org.eclipse.daanse.xmla.model.ecore.xmla.ReportFormatParameter;
import org.eclipse.daanse.xmla.model.ecore.xmla.ReportFormatParametersType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ReportParameter;
import org.eclipse.daanse.xmla.model.ecore.xmla.ReportParametersType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Restore;
import org.eclipse.daanse.xmla.model.ecore.xmla.RestrictionListType;
import org.eclipse.daanse.xmla.model.ecore.xmla.RestrictionsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ResultType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Return;
import org.eclipse.daanse.xmla.model.ecore.xmla.ReturnType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Role;
import org.eclipse.daanse.xmla.model.ecore.xmla.RolesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.RolesType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.RollbackTransaction;
import org.eclipse.daanse.xmla.model.ecore.xmla.RootType;
import org.eclipse.daanse.xmla.model.ecore.xmla.RowBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn;
import org.eclipse.daanse.xmla.model.ecore.xmla.Server;
import org.eclipse.daanse.xmla.model.ecore.xmla.ServerPropertiesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ServerProperty;
import org.eclipse.daanse.xmla.model.ecore.xmla.SessionType;
import org.eclipse.daanse.xmla.model.ecore.xmla.SetAuthContext;
import org.eclipse.daanse.xmla.model.ecore.xmla.SkippedLevelsColumnType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Source;
import org.eclipse.daanse.xmla.model.ecore.xmla.SourcesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.StandardAction;
import org.eclipse.daanse.xmla.model.ecore.xmla.Statement;
import org.eclipse.daanse.xmla.model.ecore.xmla.StorageModeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.StorageModeType2;
import org.eclipse.daanse.xmla.model.ecore.xmla.StorageModeType3;
import org.eclipse.daanse.xmla.model.ecore.xmla.Subscribe;
import org.eclipse.daanse.xmla.model.ecore.xmla.Synchronize;
import org.eclipse.daanse.xmla.model.ecore.xmla.TableBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.TableMiningStructureColumn;
import org.eclipse.daanse.xmla.model.ecore.xmla.TableNotification;
import org.eclipse.daanse.xmla.model.ecore.xmla.TableNotificationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.TableNotificationsType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.TabularBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.TargetType;
import org.eclipse.daanse.xmla.model.ecore.xmla.TargetType1;
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
import org.eclipse.daanse.xmla.model.ecore.xmla.TypeType6;
import org.eclipse.daanse.xmla.model.ecore.xmla.UnaryExpr;
import org.eclipse.daanse.xmla.model.ecore.xmla.UnaryOperatorColumnType;
import org.eclipse.daanse.xmla.model.ecore.xmla.UnknownMemberTranslationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.UnknownMemberType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Unlock;
import org.eclipse.daanse.xmla.model.ecore.xmla.Unsubscribe;
import org.eclipse.daanse.xmla.model.ecore.xmla.Update;
import org.eclipse.daanse.xmla.model.ecore.xmla.UpdateCells;
import org.eclipse.daanse.xmla.model.ecore.xmla.UserDefinedGroupBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.ValueColumnType;
import org.eclipse.daanse.xmla.model.ecore.xmla.VersionType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Where;
import org.eclipse.daanse.xmla.model.ecore.xmla.WhereAttribute;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage
 * @generated
 */
public class XmlaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XmlaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XmlaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmlaSwitch<Adapter> modelSwitch =
		new XmlaSwitch<Adapter>() {
			@Override
			public Adapter caseAccount(Account object) {
				return createAccountAdapter();
			}
			@Override
			public Adapter caseAccountsType(AccountsType object) {
				return createAccountsTypeAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseActionsType(ActionsType object) {
				return createActionsTypeAdapter();
			}
			@Override
			public Adapter caseActionsType1(ActionsType1 object) {
				return createActionsType1Adapter();
			}
			@Override
			public Adapter caseActionType(ActionType object) {
				return createActionTypeAdapter();
			}
			@Override
			public Adapter caseAggregation(Aggregation object) {
				return createAggregationAdapter();
			}
			@Override
			public Adapter caseAggregationAttribute(AggregationAttribute object) {
				return createAggregationAttributeAdapter();
			}
			@Override
			public Adapter caseAggregationDesign(AggregationDesign object) {
				return createAggregationDesignAdapter();
			}
			@Override
			public Adapter caseAggregationDesignAttribute(AggregationDesignAttribute object) {
				return createAggregationDesignAttributeAdapter();
			}
			@Override
			public Adapter caseAggregationDesignDimension(AggregationDesignDimension object) {
				return createAggregationDesignDimensionAdapter();
			}
			@Override
			public Adapter caseAggregationDesignsType(AggregationDesignsType object) {
				return createAggregationDesignsTypeAdapter();
			}
			@Override
			public Adapter caseAggregationDimension(AggregationDimension object) {
				return createAggregationDimensionAdapter();
			}
			@Override
			public Adapter caseAggregationInstance(AggregationInstance object) {
				return createAggregationInstanceAdapter();
			}
			@Override
			public Adapter caseAggregationInstanceAttribute(AggregationInstanceAttribute object) {
				return createAggregationInstanceAttributeAdapter();
			}
			@Override
			public Adapter caseAggregationInstanceDimension(AggregationInstanceDimension object) {
				return createAggregationInstanceDimensionAdapter();
			}
			@Override
			public Adapter caseAggregationInstanceMeasure(AggregationInstanceMeasure object) {
				return createAggregationInstanceMeasureAdapter();
			}
			@Override
			public Adapter caseAggregationInstancesType(AggregationInstancesType object) {
				return createAggregationInstancesTypeAdapter();
			}
			@Override
			public Adapter caseAggregationsType(AggregationsType object) {
				return createAggregationsTypeAdapter();
			}
			@Override
			public Adapter caseAlgorithmParameter(AlgorithmParameter object) {
				return createAlgorithmParameterAdapter();
			}
			@Override
			public Adapter caseAlgorithmParametersType(AlgorithmParametersType object) {
				return createAlgorithmParametersTypeAdapter();
			}
			@Override
			public Adapter caseAliasesType(AliasesType object) {
				return createAliasesTypeAdapter();
			}
			@Override
			public Adapter caseAllMemberTranslationsType(AllMemberTranslationsType object) {
				return createAllMemberTranslationsTypeAdapter();
			}
			@Override
			public Adapter caseAlter(Alter object) {
				return createAlterAdapter();
			}
			@Override
			public Adapter caseAndOrType(AndOrType object) {
				return createAndOrTypeAdapter();
			}
			@Override
			public Adapter caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
			}
			@Override
			public Adapter caseAnnotationsType(AnnotationsType object) {
				return createAnnotationsTypeAdapter();
			}
			@Override
			public Adapter caseAssembliesType(AssembliesType object) {
				return createAssembliesTypeAdapter();
			}
			@Override
			public Adapter caseAssembliesType1(AssembliesType1 object) {
				return createAssembliesType1Adapter();
			}
			@Override
			public Adapter caseAssembly(Assembly object) {
				return createAssemblyAdapter();
			}
			@Override
			public Adapter caseAttach(Attach object) {
				return createAttachAdapter();
			}
			@Override
			public Adapter caseAttributeAllMemberTranslationsType(AttributeAllMemberTranslationsType object) {
				return createAttributeAllMemberTranslationsTypeAdapter();
			}
			@Override
			public Adapter caseAttributeBinding(AttributeBinding object) {
				return createAttributeBindingAdapter();
			}
			@Override
			public Adapter caseAttributeInsertUpdate(AttributeInsertUpdate object) {
				return createAttributeInsertUpdateAdapter();
			}
			@Override
			public Adapter caseAttributePermission(AttributePermission object) {
				return createAttributePermissionAdapter();
			}
			@Override
			public Adapter caseAttributePermissionsType(AttributePermissionsType object) {
				return createAttributePermissionsTypeAdapter();
			}
			@Override
			public Adapter caseAttributePermissionsType1(AttributePermissionsType1 object) {
				return createAttributePermissionsType1Adapter();
			}
			@Override
			public Adapter caseAttributeRelationship(AttributeRelationship object) {
				return createAttributeRelationshipAdapter();
			}
			@Override
			public Adapter caseAttributeRelationshipsType(AttributeRelationshipsType object) {
				return createAttributeRelationshipsTypeAdapter();
			}
			@Override
			public Adapter caseAttributesType(AttributesType object) {
				return createAttributesTypeAdapter();
			}
			@Override
			public Adapter caseAttributesType1(AttributesType1 object) {
				return createAttributesType1Adapter();
			}
			@Override
			public Adapter caseAttributesType2(AttributesType2 object) {
				return createAttributesType2Adapter();
			}
			@Override
			public Adapter caseAttributesType3(AttributesType3 object) {
				return createAttributesType3Adapter();
			}
			@Override
			public Adapter caseAttributesType4(AttributesType4 object) {
				return createAttributesType4Adapter();
			}
			@Override
			public Adapter caseAttributesType5(AttributesType5 object) {
				return createAttributesType5Adapter();
			}
			@Override
			public Adapter caseAttributesType6(AttributesType6 object) {
				return createAttributesType6Adapter();
			}
			@Override
			public Adapter caseAttributesType7(AttributesType7 object) {
				return createAttributesType7Adapter();
			}
			@Override
			public Adapter caseAttributesType8(AttributesType8 object) {
				return createAttributesType8Adapter();
			}
			@Override
			public Adapter caseAttributeTranslation(AttributeTranslation object) {
				return createAttributeTranslationAdapter();
			}
			@Override
			public Adapter caseBackup(Backup object) {
				return createBackupAdapter();
			}
			@Override
			public Adapter caseBatch(Batch object) {
				return createBatchAdapter();
			}
			@Override
			public Adapter caseBeginSessionType(BeginSessionType object) {
				return createBeginSessionTypeAdapter();
			}
			@Override
			public Adapter caseBeginTransaction(BeginTransaction object) {
				return createBeginTransactionAdapter();
			}
			@Override
			public Adapter caseBinding(Binding object) {
				return createBindingAdapter();
			}
			@Override
			public Adapter caseBindings(Bindings object) {
				return createBindingsAdapter();
			}
			@Override
			public Adapter caseBoolBinop(BoolBinop object) {
				return createBoolBinopAdapter();
			}
			@Override
			public Adapter caseBooleanExpr(BooleanExpr object) {
				return createBooleanExprAdapter();
			}
			@Override
			public Adapter caseCalculatedMeasureBinding(CalculatedMeasureBinding object) {
				return createCalculatedMeasureBindingAdapter();
			}
			@Override
			public Adapter caseCalculationPropertiesType(CalculationPropertiesType object) {
				return createCalculationPropertiesTypeAdapter();
			}
			@Override
			public Adapter caseCalculationProperty(CalculationProperty object) {
				return createCalculationPropertyAdapter();
			}
			@Override
			public Adapter caseCalculationsType(CalculationsType object) {
				return createCalculationsTypeAdapter();
			}
			@Override
			public Adapter caseCancel(Cancel object) {
				return createCancelAdapter();
			}
			@Override
			public Adapter caseCell(Cell object) {
				return createCellAdapter();
			}
			@Override
			public Adapter caseCellPermission(CellPermission object) {
				return createCellPermissionAdapter();
			}
			@Override
			public Adapter caseCellPermissionsType(CellPermissionsType object) {
				return createCellPermissionsTypeAdapter();
			}
			@Override
			public Adapter caseClassifiedColumnsType(ClassifiedColumnsType object) {
				return createClassifiedColumnsTypeAdapter();
			}
			@Override
			public Adapter caseClearCache(ClearCache object) {
				return createClearCacheAdapter();
			}
			@Override
			public Adapter caseClearResultType(ClearResultType object) {
				return createClearResultTypeAdapter();
			}
			@Override
			public Adapter caseCloneDatabase(CloneDatabase object) {
				return createCloneDatabaseAdapter();
			}
			@Override
			public Adapter caseClrAssembly(ClrAssembly object) {
				return createClrAssemblyAdapter();
			}
			@Override
			public Adapter caseClrAssemblyFile(ClrAssemblyFile object) {
				return createClrAssemblyFileAdapter();
			}
			@Override
			public Adapter caseColumnBinding(ColumnBinding object) {
				return createColumnBindingAdapter();
			}
			@Override
			public Adapter caseColumnsType(ColumnsType object) {
				return createColumnsTypeAdapter();
			}
			@Override
			public Adapter caseColumnsType1(ColumnsType1 object) {
				return createColumnsType1Adapter();
			}
			@Override
			public Adapter caseColumnsType2(ColumnsType2 object) {
				return createColumnsType2Adapter();
			}
			@Override
			public Adapter caseColumnsType3(ColumnsType3 object) {
				return createColumnsType3Adapter();
			}
			@Override
			public Adapter caseColumnsType4(ColumnsType4 object) {
				return createColumnsType4Adapter();
			}
			@Override
			public Adapter caseColumnType(ColumnType object) {
				return createColumnTypeAdapter();
			}
			@Override
			public Adapter caseComAssembly(ComAssembly object) {
				return createComAssemblyAdapter();
			}
			@Override
			public Adapter caseCommand(Command object) {
				return createCommandAdapter();
			}
			@Override
			public Adapter caseCommandsType(CommandsType object) {
				return createCommandsTypeAdapter();
			}
			@Override
			public Adapter caseCommitTransaction(CommitTransaction object) {
				return createCommitTransactionAdapter();
			}
			@Override
			public Adapter caseComparatorType(ComparatorType object) {
				return createComparatorTypeAdapter();
			}
			@Override
			public Adapter caseCreate(Create object) {
				return createCreateAdapter();
			}
			@Override
			public Adapter caseCube(Cube object) {
				return createCubeAdapter();
			}
			@Override
			public Adapter caseCubeAttribute(CubeAttribute object) {
				return createCubeAttributeAdapter();
			}
			@Override
			public Adapter caseCubeAttributeBinding(CubeAttributeBinding object) {
				return createCubeAttributeBindingAdapter();
			}
			@Override
			public Adapter caseCubeDimension(CubeDimension object) {
				return createCubeDimensionAdapter();
			}
			@Override
			public Adapter caseCubeDimensionBinding(CubeDimensionBinding object) {
				return createCubeDimensionBindingAdapter();
			}
			@Override
			public Adapter caseCubeDimensionPermission(CubeDimensionPermission object) {
				return createCubeDimensionPermissionAdapter();
			}
			@Override
			public Adapter caseCubeHierarchy(CubeHierarchy object) {
				return createCubeHierarchyAdapter();
			}
			@Override
			public Adapter caseCubePermission(CubePermission object) {
				return createCubePermissionAdapter();
			}
			@Override
			public Adapter caseCubePermissionsType(CubePermissionsType object) {
				return createCubePermissionsTypeAdapter();
			}
			@Override
			public Adapter caseCubesType(CubesType object) {
				return createCubesTypeAdapter();
			}
			@Override
			public Adapter caseCurrentStorageModeType(CurrentStorageModeType object) {
				return createCurrentStorageModeTypeAdapter();
			}
			@Override
			public Adapter caseCurrentStorageModeType1(CurrentStorageModeType1 object) {
				return createCurrentStorageModeType1Adapter();
			}
			@Override
			public Adapter caseCustomRollupColumnType(CustomRollupColumnType object) {
				return createCustomRollupColumnTypeAdapter();
			}
			@Override
			public Adapter caseCustomRollupPropertiesColumnType(CustomRollupPropertiesColumnType object) {
				return createCustomRollupPropertiesColumnTypeAdapter();
			}
			@Override
			public Adapter caseDatabase(Database object) {
				return createDatabaseAdapter();
			}
			@Override
			public Adapter caseDatabasePermission(DatabasePermission object) {
				return createDatabasePermissionAdapter();
			}
			@Override
			public Adapter caseDatabasePermissionsType(DatabasePermissionsType object) {
				return createDatabasePermissionsTypeAdapter();
			}
			@Override
			public Adapter caseDatabasesType(DatabasesType object) {
				return createDatabasesTypeAdapter();
			}
			@Override
			public Adapter caseDataBlock(DataBlock object) {
				return createDataBlockAdapter();
			}
			@Override
			public Adapter caseDataItem(DataItem object) {
				return createDataItemAdapter();
			}
			@Override
			public Adapter caseDataMiningMeasureGroupDimension(DataMiningMeasureGroupDimension object) {
				return createDataMiningMeasureGroupDimensionAdapter();
			}
			@Override
			public Adapter caseDataSource(DataSource object) {
				return createDataSourceAdapter();
			}
			@Override
			public Adapter caseDataSourcePermission(DataSourcePermission object) {
				return createDataSourcePermissionAdapter();
			}
			@Override
			public Adapter caseDataSourcePermissionsType(DataSourcePermissionsType object) {
				return createDataSourcePermissionsTypeAdapter();
			}
			@Override
			public Adapter caseDataSourcesType(DataSourcesType object) {
				return createDataSourcesTypeAdapter();
			}
			@Override
			public Adapter caseDataSourceView(DataSourceView object) {
				return createDataSourceViewAdapter();
			}
			@Override
			public Adapter caseDataSourceViewBinding(DataSourceViewBinding object) {
				return createDataSourceViewBindingAdapter();
			}
			@Override
			public Adapter caseDataSourceViewsType(DataSourceViewsType object) {
				return createDataSourceViewsTypeAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseDataType1(DataType1 object) {
				return createDataType1Adapter();
			}
			@Override
			public Adapter caseDataType2(DataType2 object) {
				return createDataType2Adapter();
			}
			@Override
			public Adapter caseDataType3(DataType3 object) {
				return createDataType3Adapter();
			}
			@Override
			public Adapter caseDBCC(DBCC object) {
				return createDBCCAdapter();
			}
			@Override
			public Adapter caseDegenerateMeasureGroupDimension(DegenerateMeasureGroupDimension object) {
				return createDegenerateMeasureGroupDimensionAdapter();
			}
			@Override
			public Adapter caseDelete(Delete object) {
				return createDeleteAdapter();
			}
			@Override
			public Adapter caseDesignAggregations(DesignAggregations object) {
				return createDesignAggregationsAdapter();
			}
			@Override
			public Adapter caseDetach(Detach object) {
				return createDetachAdapter();
			}
			@Override
			public Adapter caseDimension(Dimension object) {
				return createDimensionAdapter();
			}
			@Override
			public Adapter caseDimensionAttribute(DimensionAttribute object) {
				return createDimensionAttributeAdapter();
			}
			@Override
			public Adapter caseDimensionBinding(DimensionBinding object) {
				return createDimensionBindingAdapter();
			}
			@Override
			public Adapter caseDimensionPermission(DimensionPermission object) {
				return createDimensionPermissionAdapter();
			}
			@Override
			public Adapter caseDimensionPermissionsType(DimensionPermissionsType object) {
				return createDimensionPermissionsTypeAdapter();
			}
			@Override
			public Adapter caseDimensionPermissionsType1(DimensionPermissionsType1 object) {
				return createDimensionPermissionsType1Adapter();
			}
			@Override
			public Adapter caseDimensionsType(DimensionsType object) {
				return createDimensionsTypeAdapter();
			}
			@Override
			public Adapter caseDiscoverResponseType(DiscoverResponseType object) {
				return createDiscoverResponseTypeAdapter();
			}
			@Override
			public Adapter caseDiscoverType(DiscoverType object) {
				return createDiscoverTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDrillThroughAction(DrillThroughAction object) {
				return createDrillThroughActionAdapter();
			}
			@Override
			public Adapter caseDrop(Drop object) {
				return createDropAdapter();
			}
			@Override
			public Adapter caseDSVTableBinding(DSVTableBinding object) {
				return createDSVTableBindingAdapter();
			}
			@Override
			public Adapter caseEndOfDataType(EndOfDataType object) {
				return createEndOfDataTypeAdapter();
			}
			@Override
			public Adapter caseEndSessionType(EndSessionType object) {
				return createEndSessionTypeAdapter();
			}
			@Override
			public Adapter caseErrorConfiguration(ErrorConfiguration object) {
				return createErrorConfigurationAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseEventCategoryType(EventCategoryType object) {
				return createEventCategoryTypeAdapter();
			}
			@Override
			public Adapter caseEventColumn(EventColumn object) {
				return createEventColumnAdapter();
			}
			@Override
			public Adapter caseEventColumnID(EventColumnID object) {
				return createEventColumnIDAdapter();
			}
			@Override
			public Adapter caseEventColumnListType(EventColumnListType object) {
				return createEventColumnListTypeAdapter();
			}
			@Override
			public Adapter caseEventColumnSubclassListType(EventColumnSubclassListType object) {
				return createEventColumnSubclassListTypeAdapter();
			}
			@Override
			public Adapter caseEventColumnSubclassType(EventColumnSubclassType object) {
				return createEventColumnSubclassTypeAdapter();
			}
			@Override
			public Adapter caseEventListType(EventListType object) {
				return createEventListTypeAdapter();
			}
			@Override
			public Adapter caseEventSessionType(EventSessionType object) {
				return createEventSessionTypeAdapter();
			}
			@Override
			public Adapter caseEventsType(EventsType object) {
				return createEventsTypeAdapter();
			}
			@Override
			public Adapter caseEventType(EventType object) {
				return createEventTypeAdapter();
			}
			@Override
			public Adapter caseEventType1(EventType1 object) {
				return createEventType1Adapter();
			}
			@Override
			public Adapter caseEventTypeType(EventTypeType object) {
				return createEventTypeTypeAdapter();
			}
			@Override
			public Adapter caseExecuteParameter(ExecuteParameter object) {
				return createExecuteParameterAdapter();
			}
			@Override
			public Adapter caseExecuteResponseType(ExecuteResponseType object) {
				return createExecuteResponseTypeAdapter();
			}
			@Override
			public Adapter caseExecuteType(ExecuteType object) {
				return createExecuteTypeAdapter();
			}
			@Override
			public Adapter caseFilesType(FilesType object) {
				return createFilesTypeAdapter();
			}
			@Override
			public Adapter caseFolder(Folder object) {
				return createFolderAdapter();
			}
			@Override
			public Adapter caseFoldingParameters(FoldingParameters object) {
				return createFoldingParametersAdapter();
			}
			@Override
			public Adapter caseForeignKeyColumnsType(ForeignKeyColumnsType object) {
				return createForeignKeyColumnsTypeAdapter();
			}
			@Override
			public Adapter caseForeignKeyColumnsType1(ForeignKeyColumnsType1 object) {
				return createForeignKeyColumnsType1Adapter();
			}
			@Override
			public Adapter caseForeignKeyColumnType(ForeignKeyColumnType object) {
				return createForeignKeyColumnTypeAdapter();
			}
			@Override
			public Adapter caseGlobalType(GlobalType object) {
				return createGlobalTypeAdapter();
			}
			@Override
			public Adapter caseGroup(Group object) {
				return createGroupAdapter();
			}
			@Override
			public Adapter caseGroupsType(GroupsType object) {
				return createGroupsTypeAdapter();
			}
			@Override
			public Adapter caseHierarchiesType(HierarchiesType object) {
				return createHierarchiesTypeAdapter();
			}
			@Override
			public Adapter caseHierarchiesType1(HierarchiesType1 object) {
				return createHierarchiesType1Adapter();
			}
			@Override
			public Adapter caseHierarchiesType2(HierarchiesType2 object) {
				return createHierarchiesType2Adapter();
			}
			@Override
			public Adapter caseHierarchy(Hierarchy object) {
				return createHierarchyAdapter();
			}
			@Override
			public Adapter caseImageLoad(ImageLoad object) {
				return createImageLoadAdapter();
			}
			@Override
			public Adapter caseImageSave(ImageSave object) {
				return createImageSaveAdapter();
			}
			@Override
			public Adapter caseIncrementalProcessingNotification(IncrementalProcessingNotification object) {
				return createIncrementalProcessingNotificationAdapter();
			}
			@Override
			public Adapter caseIncrementalProcessingNotificationsType(IncrementalProcessingNotificationsType object) {
				return createIncrementalProcessingNotificationsTypeAdapter();
			}
			@Override
			public Adapter caseInheritedBinding(InheritedBinding object) {
				return createInheritedBindingAdapter();
			}
			@Override
			public Adapter caseInsert(Insert object) {
				return createInsertAdapter();
			}
			@Override
			public Adapter caseKeepResultType(KeepResultType object) {
				return createKeepResultTypeAdapter();
			}
			@Override
			public Adapter caseKeyColumnsType(KeyColumnsType object) {
				return createKeyColumnsTypeAdapter();
			}
			@Override
			public Adapter caseKeyColumnsType1(KeyColumnsType1 object) {
				return createKeyColumnsType1Adapter();
			}
			@Override
			public Adapter caseKeyColumnsType2(KeyColumnsType2 object) {
				return createKeyColumnsType2Adapter();
			}
			@Override
			public Adapter caseKeyColumnsType3(KeyColumnsType3 object) {
				return createKeyColumnsType3Adapter();
			}
			@Override
			public Adapter caseKeyColumnsType4(KeyColumnsType4 object) {
				return createKeyColumnsType4Adapter();
			}
			@Override
			public Adapter caseKeyColumnType(KeyColumnType object) {
				return createKeyColumnTypeAdapter();
			}
			@Override
			public Adapter caseKeysType(KeysType object) {
				return createKeysTypeAdapter();
			}
			@Override
			public Adapter caseKeysType1(KeysType1 object) {
				return createKeysType1Adapter();
			}
			@Override
			public Adapter caseKpi(Kpi object) {
				return createKpiAdapter();
			}
			@Override
			public Adapter caseKpisType(KpisType object) {
				return createKpisTypeAdapter();
			}
			@Override
			public Adapter caseKpisType1(KpisType1 object) {
				return createKpisType1Adapter();
			}
			@Override
			public Adapter caseLevel(Level object) {
				return createLevelAdapter();
			}
			@Override
			public Adapter caseLevelsType(LevelsType object) {
				return createLevelsTypeAdapter();
			}
			@Override
			public Adapter caseLocation(Location object) {
				return createLocationAdapter();
			}
			@Override
			public Adapter caseLocationBackup(LocationBackup object) {
				return createLocationBackupAdapter();
			}
			@Override
			public Adapter caseLocationsType(LocationsType object) {
				return createLocationsTypeAdapter();
			}
			@Override
			public Adapter caseLocationsType1(LocationsType1 object) {
				return createLocationsType1Adapter();
			}
			@Override
			public Adapter caseLocationsType2(LocationsType2 object) {
				return createLocationsType2Adapter();
			}
			@Override
			public Adapter caseLock(Lock object) {
				return createLockAdapter();
			}
			@Override
			public Adapter caseMajorObject(MajorObject object) {
				return createMajorObjectAdapter();
			}
			@Override
			public Adapter caseManyToManyMeasureGroupDimension(ManyToManyMeasureGroupDimension object) {
				return createManyToManyMeasureGroupDimensionAdapter();
			}
			@Override
			public Adapter caseMdxScript(MdxScript object) {
				return createMdxScriptAdapter();
			}
			@Override
			public Adapter caseMdxScriptsType(MdxScriptsType object) {
				return createMdxScriptsTypeAdapter();
			}
			@Override
			public Adapter caseMeasure(Measure object) {
				return createMeasureAdapter();
			}
			@Override
			public Adapter caseMeasureBinding(MeasureBinding object) {
				return createMeasureBindingAdapter();
			}
			@Override
			public Adapter caseMeasureGroup(MeasureGroup object) {
				return createMeasureGroupAdapter();
			}
			@Override
			public Adapter caseMeasureGroupAttribute(MeasureGroupAttribute object) {
				return createMeasureGroupAttributeAdapter();
			}
			@Override
			public Adapter caseMeasureGroupBinding(MeasureGroupBinding object) {
				return createMeasureGroupBindingAdapter();
			}
			@Override
			public Adapter caseMeasureGroupDimension(MeasureGroupDimension object) {
				return createMeasureGroupDimensionAdapter();
			}
			@Override
			public Adapter caseMeasureGroupDimensionBinding(MeasureGroupDimensionBinding object) {
				return createMeasureGroupDimensionBindingAdapter();
			}
			@Override
			public Adapter caseMeasureGroupsType(MeasureGroupsType object) {
				return createMeasureGroupsTypeAdapter();
			}
			@Override
			public Adapter caseMeasureGroupsType1(MeasureGroupsType1 object) {
				return createMeasureGroupsType1Adapter();
			}
			@Override
			public Adapter caseMeasuresType(MeasuresType object) {
				return createMeasuresTypeAdapter();
			}
			@Override
			public Adapter caseMeasuresType1(MeasuresType1 object) {
				return createMeasuresType1Adapter();
			}
			@Override
			public Adapter caseMeasuresType2(MeasuresType2 object) {
				return createMeasuresType2Adapter();
			}
			@Override
			public Adapter caseMember(Member object) {
				return createMemberAdapter();
			}
			@Override
			public Adapter caseMembersType(MembersType object) {
				return createMembersTypeAdapter();
			}
			@Override
			public Adapter caseMembersType1(MembersType1 object) {
				return createMembersType1Adapter();
			}
			@Override
			public Adapter caseMergePartitions(MergePartitions object) {
				return createMergePartitionsAdapter();
			}
			@Override
			public Adapter caseMiningModel(MiningModel object) {
				return createMiningModelAdapter();
			}
			@Override
			public Adapter caseMiningModelColumn(MiningModelColumn object) {
				return createMiningModelColumnAdapter();
			}
			@Override
			public Adapter caseMiningModelingFlag(MiningModelingFlag object) {
				return createMiningModelingFlagAdapter();
			}
			@Override
			public Adapter caseMiningModelPermission(MiningModelPermission object) {
				return createMiningModelPermissionAdapter();
			}
			@Override
			public Adapter caseMiningModelPermissionsType(MiningModelPermissionsType object) {
				return createMiningModelPermissionsTypeAdapter();
			}
			@Override
			public Adapter caseMiningModelsType(MiningModelsType object) {
				return createMiningModelsTypeAdapter();
			}
			@Override
			public Adapter caseMiningStructure(MiningStructure object) {
				return createMiningStructureAdapter();
			}
			@Override
			public Adapter caseMiningStructureColumn(MiningStructureColumn object) {
				return createMiningStructureColumnAdapter();
			}
			@Override
			public Adapter caseMiningStructurePermission(MiningStructurePermission object) {
				return createMiningStructurePermissionAdapter();
			}
			@Override
			public Adapter caseMiningStructurePermissionsType(MiningStructurePermissionsType object) {
				return createMiningStructurePermissionsTypeAdapter();
			}
			@Override
			public Adapter caseMiningStructuresType(MiningStructuresType object) {
				return createMiningStructuresTypeAdapter();
			}
			@Override
			public Adapter caseModelingFlagsType(ModelingFlagsType object) {
				return createModelingFlagsTypeAdapter();
			}
			@Override
			public Adapter caseModelingFlagsType1(ModelingFlagsType1 object) {
				return createModelingFlagsType1Adapter();
			}
			@Override
			public Adapter caseNameColumnType(NameColumnType object) {
				return createNameColumnTypeAdapter();
			}
			@Override
			public Adapter caseNamingTemplateTranslationsType(NamingTemplateTranslationsType object) {
				return createNamingTemplateTranslationsTypeAdapter();
			}
			@Override
			public Adapter caseNotifyTableChange(NotifyTableChange object) {
				return createNotifyTableChangeAdapter();
			}
			@Override
			public Adapter caseNotType(NotType object) {
				return createNotTypeAdapter();
			}
			@Override
			public Adapter caseObject(org.eclipse.daanse.xmla.model.ecore.xmla.Object object) {
				return createObjectAdapter();
			}
			@Override
			public Adapter caseObjectReference(ObjectReference object) {
				return createObjectReferenceAdapter();
			}
			@Override
			public Adapter caseObjectType(ObjectType object) {
				return createObjectTypeAdapter();
			}
			@Override
			public Adapter caseOlapDataSource(OlapDataSource object) {
				return createOlapDataSourceAdapter();
			}
			@Override
			public Adapter caseOrdinalType(OrdinalType object) {
				return createOrdinalTypeAdapter();
			}
			@Override
			public Adapter caseOutOfLineBinding(OutOfLineBinding object) {
				return createOutOfLineBindingAdapter();
			}
			@Override
			public Adapter caseParallelType(ParallelType object) {
				return createParallelTypeAdapter();
			}
			@Override
			public Adapter caseParameters(Parameters object) {
				return createParametersAdapter();
			}
			@Override
			public Adapter caseParametersType(ParametersType object) {
				return createParametersTypeAdapter();
			}
			@Override
			public Adapter caseParameterType2(ParameterType2 object) {
				return createParameterType2Adapter();
			}
			@Override
			public Adapter casePartition(Partition object) {
				return createPartitionAdapter();
			}
			@Override
			public Adapter casePartitionsType(PartitionsType object) {
				return createPartitionsTypeAdapter();
			}
			@Override
			public Adapter casePermission(Permission object) {
				return createPermissionAdapter();
			}
			@Override
			public Adapter casePerspective(Perspective object) {
				return createPerspectiveAdapter();
			}
			@Override
			public Adapter casePerspectiveAction(PerspectiveAction object) {
				return createPerspectiveActionAdapter();
			}
			@Override
			public Adapter casePerspectiveAttribute(PerspectiveAttribute object) {
				return createPerspectiveAttributeAdapter();
			}
			@Override
			public Adapter casePerspectiveCalculation(PerspectiveCalculation object) {
				return createPerspectiveCalculationAdapter();
			}
			@Override
			public Adapter casePerspectiveDimension(PerspectiveDimension object) {
				return createPerspectiveDimensionAdapter();
			}
			@Override
			public Adapter casePerspectiveHierarchy(PerspectiveHierarchy object) {
				return createPerspectiveHierarchyAdapter();
			}
			@Override
			public Adapter casePerspectiveKpi(PerspectiveKpi object) {
				return createPerspectiveKpiAdapter();
			}
			@Override
			public Adapter casePerspectiveMeasure(PerspectiveMeasure object) {
				return createPerspectiveMeasureAdapter();
			}
			@Override
			public Adapter casePerspectiveMeasureGroup(PerspectiveMeasureGroup object) {
				return createPerspectiveMeasureGroupAdapter();
			}
			@Override
			public Adapter casePerspectivesType(PerspectivesType object) {
				return createPerspectivesTypeAdapter();
			}
			@Override
			public Adapter casePredLeaf(PredLeaf object) {
				return createPredLeafAdapter();
			}
			@Override
			public Adapter caseProactiveCaching(ProactiveCaching object) {
				return createProactiveCachingAdapter();
			}
			@Override
			public Adapter caseProactiveCachingBinding(ProactiveCachingBinding object) {
				return createProactiveCachingBindingAdapter();
			}
			@Override
			public Adapter caseProactiveCachingIncrementalProcessingBinding(ProactiveCachingIncrementalProcessingBinding object) {
				return createProactiveCachingIncrementalProcessingBindingAdapter();
			}
			@Override
			public Adapter caseProactiveCachingInheritedBinding(ProactiveCachingInheritedBinding object) {
				return createProactiveCachingInheritedBindingAdapter();
			}
			@Override
			public Adapter caseProactiveCachingObjectNotificationBinding(ProactiveCachingObjectNotificationBinding object) {
				return createProactiveCachingObjectNotificationBindingAdapter();
			}
			@Override
			public Adapter caseProactiveCachingQueryBinding(ProactiveCachingQueryBinding object) {
				return createProactiveCachingQueryBindingAdapter();
			}
			@Override
			public Adapter caseProactiveCachingTablesBinding(ProactiveCachingTablesBinding object) {
				return createProactiveCachingTablesBindingAdapter();
			}
			@Override
			public Adapter caseProcess(org.eclipse.daanse.xmla.model.ecore.xmla.Process object) {
				return createProcessAdapter();
			}
			@Override
			public Adapter caseProperties(Properties object) {
				return createPropertiesAdapter();
			}
			@Override
			public Adapter casePropertiesType(PropertiesType object) {
				return createPropertiesTypeAdapter();
			}
			@Override
			public Adapter casePropertyList(PropertyList object) {
				return createPropertyListAdapter();
			}
			@Override
			public Adapter casePushedDataSource(PushedDataSource object) {
				return createPushedDataSourceAdapter();
			}
			@Override
			public Adapter caseQueriesType(QueriesType object) {
				return createQueriesTypeAdapter();
			}
			@Override
			public Adapter caseQueryBinding(QueryBinding object) {
				return createQueryBindingAdapter();
			}
			@Override
			public Adapter caseQueryNotification(QueryNotification object) {
				return createQueryNotificationAdapter();
			}
			@Override
			public Adapter caseQueryNotificationsType(QueryNotificationsType object) {
				return createQueryNotificationsTypeAdapter();
			}
			@Override
			public Adapter caseReferenceMeasureGroupDimension(ReferenceMeasureGroupDimension object) {
				return createReferenceMeasureGroupDimensionAdapter();
			}
			@Override
			public Adapter caseRegularMeasureGroupDimension(RegularMeasureGroupDimension object) {
				return createRegularMeasureGroupDimensionAdapter();
			}
			@Override
			public Adapter caseRelationalDataSource(RelationalDataSource object) {
				return createRelationalDataSourceAdapter();
			}
			@Override
			public Adapter caseReportAction(ReportAction object) {
				return createReportActionAdapter();
			}
			@Override
			public Adapter caseReportFormatParameter(ReportFormatParameter object) {
				return createReportFormatParameterAdapter();
			}
			@Override
			public Adapter caseReportFormatParametersType(ReportFormatParametersType object) {
				return createReportFormatParametersTypeAdapter();
			}
			@Override
			public Adapter caseReportParameter(ReportParameter object) {
				return createReportParameterAdapter();
			}
			@Override
			public Adapter caseReportParametersType(ReportParametersType object) {
				return createReportParametersTypeAdapter();
			}
			@Override
			public Adapter caseRestore(Restore object) {
				return createRestoreAdapter();
			}
			@Override
			public Adapter caseRestrictionListType(RestrictionListType object) {
				return createRestrictionListTypeAdapter();
			}
			@Override
			public Adapter caseRestrictionsType(RestrictionsType object) {
				return createRestrictionsTypeAdapter();
			}
			@Override
			public Adapter caseResultType(ResultType object) {
				return createResultTypeAdapter();
			}
			@Override
			public Adapter caseReturn(Return object) {
				return createReturnAdapter();
			}
			@Override
			public Adapter caseReturnType(ReturnType object) {
				return createReturnTypeAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseRolesType(RolesType object) {
				return createRolesTypeAdapter();
			}
			@Override
			public Adapter caseRolesType1(RolesType1 object) {
				return createRolesType1Adapter();
			}
			@Override
			public Adapter caseRollbackTransaction(RollbackTransaction object) {
				return createRollbackTransactionAdapter();
			}
			@Override
			public Adapter caseRootType(RootType object) {
				return createRootTypeAdapter();
			}
			@Override
			public Adapter caseRowBinding(RowBinding object) {
				return createRowBindingAdapter();
			}
			@Override
			public Adapter caseScalarMiningStructureColumn(ScalarMiningStructureColumn object) {
				return createScalarMiningStructureColumnAdapter();
			}
			@Override
			public Adapter caseServer(Server object) {
				return createServerAdapter();
			}
			@Override
			public Adapter caseServerPropertiesType(ServerPropertiesType object) {
				return createServerPropertiesTypeAdapter();
			}
			@Override
			public Adapter caseServerProperty(ServerProperty object) {
				return createServerPropertyAdapter();
			}
			@Override
			public Adapter caseSessionType(SessionType object) {
				return createSessionTypeAdapter();
			}
			@Override
			public Adapter caseSetAuthContext(SetAuthContext object) {
				return createSetAuthContextAdapter();
			}
			@Override
			public Adapter caseSkippedLevelsColumnType(SkippedLevelsColumnType object) {
				return createSkippedLevelsColumnTypeAdapter();
			}
			@Override
			public Adapter caseSource(Source object) {
				return createSourceAdapter();
			}
			@Override
			public Adapter caseSourcesType(SourcesType object) {
				return createSourcesTypeAdapter();
			}
			@Override
			public Adapter caseStandardAction(StandardAction object) {
				return createStandardActionAdapter();
			}
			@Override
			public Adapter caseStatement(Statement object) {
				return createStatementAdapter();
			}
			@Override
			public Adapter caseStorageModeType(StorageModeType object) {
				return createStorageModeTypeAdapter();
			}
			@Override
			public Adapter caseStorageModeType2(StorageModeType2 object) {
				return createStorageModeType2Adapter();
			}
			@Override
			public Adapter caseStorageModeType3(StorageModeType3 object) {
				return createStorageModeType3Adapter();
			}
			@Override
			public Adapter caseSubscribe(Subscribe object) {
				return createSubscribeAdapter();
			}
			@Override
			public Adapter caseSynchronize(Synchronize object) {
				return createSynchronizeAdapter();
			}
			@Override
			public Adapter caseTableBinding(TableBinding object) {
				return createTableBindingAdapter();
			}
			@Override
			public Adapter caseTableMiningStructureColumn(TableMiningStructureColumn object) {
				return createTableMiningStructureColumnAdapter();
			}
			@Override
			public Adapter caseTableNotification(TableNotification object) {
				return createTableNotificationAdapter();
			}
			@Override
			public Adapter caseTableNotificationsType(TableNotificationsType object) {
				return createTableNotificationsTypeAdapter();
			}
			@Override
			public Adapter caseTableNotificationsType1(TableNotificationsType1 object) {
				return createTableNotificationsType1Adapter();
			}
			@Override
			public Adapter caseTabularBinding(TabularBinding object) {
				return createTabularBindingAdapter();
			}
			@Override
			public Adapter caseTargetType(TargetType object) {
				return createTargetTypeAdapter();
			}
			@Override
			public Adapter caseTargetType1(TargetType1 object) {
				return createTargetType1Adapter();
			}
			@Override
			public Adapter caseTimeAttributeBinding(TimeAttributeBinding object) {
				return createTimeAttributeBindingAdapter();
			}
			@Override
			public Adapter caseTimeBinding(TimeBinding object) {
				return createTimeBindingAdapter();
			}
			@Override
			public Adapter caseTrace(Trace object) {
				return createTraceAdapter();
			}
			@Override
			public Adapter caseTraceColumns(TraceColumns object) {
				return createTraceColumnsAdapter();
			}
			@Override
			public Adapter caseTraceDefinitionProviderInfo(TraceDefinitionProviderInfo object) {
				return createTraceDefinitionProviderInfoAdapter();
			}
			@Override
			public Adapter caseTraceEvent(TraceEvent object) {
				return createTraceEventAdapter();
			}
			@Override
			public Adapter caseTraceEventCategories(TraceEventCategories object) {
				return createTraceEventCategoriesAdapter();
			}
			@Override
			public Adapter caseTraceFilter(TraceFilter object) {
				return createTraceFilterAdapter();
			}
			@Override
			public Adapter caseTracesType(TracesType object) {
				return createTracesTypeAdapter();
			}
			@Override
			public Adapter caseTranslation(Translation object) {
				return createTranslationAdapter();
			}
			@Override
			public Adapter caseTranslationInsertUpdate(TranslationInsertUpdate object) {
				return createTranslationInsertUpdateAdapter();
			}
			@Override
			public Adapter caseTranslationsType(TranslationsType object) {
				return createTranslationsTypeAdapter();
			}
			@Override
			public Adapter caseTranslationType(TranslationType object) {
				return createTranslationTypeAdapter();
			}
			@Override
			public Adapter caseTypeType6(TypeType6 object) {
				return createTypeType6Adapter();
			}
			@Override
			public Adapter caseUnaryExpr(UnaryExpr object) {
				return createUnaryExprAdapter();
			}
			@Override
			public Adapter caseUnaryOperatorColumnType(UnaryOperatorColumnType object) {
				return createUnaryOperatorColumnTypeAdapter();
			}
			@Override
			public Adapter caseUnknownMemberTranslationsType(UnknownMemberTranslationsType object) {
				return createUnknownMemberTranslationsTypeAdapter();
			}
			@Override
			public Adapter caseUnknownMemberType(UnknownMemberType object) {
				return createUnknownMemberTypeAdapter();
			}
			@Override
			public Adapter caseUnlock(Unlock object) {
				return createUnlockAdapter();
			}
			@Override
			public Adapter caseUnsubscribe(Unsubscribe object) {
				return createUnsubscribeAdapter();
			}
			@Override
			public Adapter caseUpdate(Update object) {
				return createUpdateAdapter();
			}
			@Override
			public Adapter caseUpdateCells(UpdateCells object) {
				return createUpdateCellsAdapter();
			}
			@Override
			public Adapter caseUserDefinedGroupBinding(UserDefinedGroupBinding object) {
				return createUserDefinedGroupBindingAdapter();
			}
			@Override
			public Adapter caseValueColumnType(ValueColumnType object) {
				return createValueColumnTypeAdapter();
			}
			@Override
			public Adapter caseVersionType(VersionType object) {
				return createVersionTypeAdapter();
			}
			@Override
			public Adapter caseWhere(Where object) {
				return createWhereAdapter();
			}
			@Override
			public Adapter caseWhereAttribute(WhereAttribute object) {
				return createWhereAttributeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Account
	 * @generated
	 */
	public Adapter createAccountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AccountsType <em>Accounts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AccountsType
	 * @generated
	 */
	public Adapter createAccountsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ActionsType <em>Actions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ActionsType
	 * @generated
	 */
	public Adapter createActionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ActionsType1 <em>Actions Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ActionsType1
	 * @generated
	 */
	public Adapter createActionsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ActionType
	 * @generated
	 */
	public Adapter createActionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Aggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Aggregation
	 * @generated
	 */
	public Adapter createAggregationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationAttribute <em>Aggregation Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AggregationAttribute
	 * @generated
	 */
	public Adapter createAggregationAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesign <em>Aggregation Design</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesign
	 * @generated
	 */
	public Adapter createAggregationDesignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesignAttribute <em>Aggregation Design Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesignAttribute
	 * @generated
	 */
	public Adapter createAggregationDesignAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesignDimension <em>Aggregation Design Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesignDimension
	 * @generated
	 */
	public Adapter createAggregationDesignDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesignsType <em>Aggregation Designs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDesignsType
	 * @generated
	 */
	public Adapter createAggregationDesignsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDimension <em>Aggregation Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AggregationDimension
	 * @generated
	 */
	public Adapter createAggregationDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationInstance <em>Aggregation Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AggregationInstance
	 * @generated
	 */
	public Adapter createAggregationInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationInstanceAttribute <em>Aggregation Instance Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AggregationInstanceAttribute
	 * @generated
	 */
	public Adapter createAggregationInstanceAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationInstanceDimension <em>Aggregation Instance Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AggregationInstanceDimension
	 * @generated
	 */
	public Adapter createAggregationInstanceDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationInstanceMeasure <em>Aggregation Instance Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AggregationInstanceMeasure
	 * @generated
	 */
	public Adapter createAggregationInstanceMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationInstancesType <em>Aggregation Instances Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AggregationInstancesType
	 * @generated
	 */
	public Adapter createAggregationInstancesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationsType <em>Aggregations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AggregationsType
	 * @generated
	 */
	public Adapter createAggregationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AlgorithmParameter <em>Algorithm Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AlgorithmParameter
	 * @generated
	 */
	public Adapter createAlgorithmParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AlgorithmParametersType <em>Algorithm Parameters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AlgorithmParametersType
	 * @generated
	 */
	public Adapter createAlgorithmParametersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AliasesType <em>Aliases Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AliasesType
	 * @generated
	 */
	public Adapter createAliasesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AllMemberTranslationsType <em>All Member Translations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AllMemberTranslationsType
	 * @generated
	 */
	public Adapter createAllMemberTranslationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Alter <em>Alter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Alter
	 * @generated
	 */
	public Adapter createAlterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AndOrType <em>And Or Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AndOrType
	 * @generated
	 */
	public Adapter createAndOrTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType <em>Annotations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType
	 * @generated
	 */
	public Adapter createAnnotationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AssembliesType <em>Assemblies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AssembliesType
	 * @generated
	 */
	public Adapter createAssembliesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AssembliesType1 <em>Assemblies Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AssembliesType1
	 * @generated
	 */
	public Adapter createAssembliesType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Assembly <em>Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Assembly
	 * @generated
	 */
	public Adapter createAssemblyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Attach <em>Attach</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Attach
	 * @generated
	 */
	public Adapter createAttachAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeAllMemberTranslationsType <em>Attribute All Member Translations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AttributeAllMemberTranslationsType
	 * @generated
	 */
	public Adapter createAttributeAllMemberTranslationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeBinding <em>Attribute Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AttributeBinding
	 * @generated
	 */
	public Adapter createAttributeBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeInsertUpdate <em>Attribute Insert Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AttributeInsertUpdate
	 * @generated
	 */
	public Adapter createAttributeInsertUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributePermission <em>Attribute Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AttributePermission
	 * @generated
	 */
	public Adapter createAttributePermissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributePermissionsType <em>Attribute Permissions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AttributePermissionsType
	 * @generated
	 */
	public Adapter createAttributePermissionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributePermissionsType1 <em>Attribute Permissions Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AttributePermissionsType1
	 * @generated
	 */
	public Adapter createAttributePermissionsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationship <em>Attribute Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationship
	 * @generated
	 */
	public Adapter createAttributeRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationshipsType <em>Attribute Relationships Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationshipsType
	 * @generated
	 */
	public Adapter createAttributeRelationshipsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributesType <em>Attributes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AttributesType
	 * @generated
	 */
	public Adapter createAttributesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributesType1 <em>Attributes Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AttributesType1
	 * @generated
	 */
	public Adapter createAttributesType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributesType2 <em>Attributes Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AttributesType2
	 * @generated
	 */
	public Adapter createAttributesType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributesType3 <em>Attributes Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AttributesType3
	 * @generated
	 */
	public Adapter createAttributesType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributesType4 <em>Attributes Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AttributesType4
	 * @generated
	 */
	public Adapter createAttributesType4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributesType5 <em>Attributes Type5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AttributesType5
	 * @generated
	 */
	public Adapter createAttributesType5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributesType6 <em>Attributes Type6</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AttributesType6
	 * @generated
	 */
	public Adapter createAttributesType6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributesType7 <em>Attributes Type7</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AttributesType7
	 * @generated
	 */
	public Adapter createAttributesType7Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributesType8 <em>Attributes Type8</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AttributesType8
	 * @generated
	 */
	public Adapter createAttributesType8Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeTranslation <em>Attribute Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AttributeTranslation
	 * @generated
	 */
	public Adapter createAttributeTranslationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Backup <em>Backup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Backup
	 * @generated
	 */
	public Adapter createBackupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Batch <em>Batch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Batch
	 * @generated
	 */
	public Adapter createBatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.BeginSessionType <em>Begin Session Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.BeginSessionType
	 * @generated
	 */
	public Adapter createBeginSessionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.BeginTransaction <em>Begin Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.BeginTransaction
	 * @generated
	 */
	public Adapter createBeginTransactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Binding
	 * @generated
	 */
	public Adapter createBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Bindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Bindings
	 * @generated
	 */
	public Adapter createBindingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.BoolBinop <em>Bool Binop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.BoolBinop
	 * @generated
	 */
	public Adapter createBoolBinopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.BooleanExpr <em>Boolean Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.BooleanExpr
	 * @generated
	 */
	public Adapter createBooleanExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculatedMeasureBinding <em>Calculated Measure Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.CalculatedMeasureBinding
	 * @generated
	 */
	public Adapter createCalculatedMeasureBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationPropertiesType <em>Calculation Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.CalculationPropertiesType
	 * @generated
	 */
	public Adapter createCalculationPropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty <em>Calculation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty
	 * @generated
	 */
	public Adapter createCalculationPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationsType <em>Calculations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.CalculationsType
	 * @generated
	 */
	public Adapter createCalculationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cancel <em>Cancel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Cancel
	 * @generated
	 */
	public Adapter createCancelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Cell
	 * @generated
	 */
	public Adapter createCellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CellPermission <em>Cell Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.CellPermission
	 * @generated
	 */
	public Adapter createCellPermissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CellPermissionsType <em>Cell Permissions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.CellPermissionsType
	 * @generated
	 */
	public Adapter createCellPermissionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ClassifiedColumnsType <em>Classified Columns Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ClassifiedColumnsType
	 * @generated
	 */
	public Adapter createClassifiedColumnsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ClearCache <em>Clear Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ClearCache
	 * @generated
	 */
	public Adapter createClearCacheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ClearResultType <em>Clear Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ClearResultType
	 * @generated
	 */
	public Adapter createClearResultTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CloneDatabase <em>Clone Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.CloneDatabase
	 * @generated
	 */
	public Adapter createCloneDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ClrAssembly <em>Clr Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ClrAssembly
	 * @generated
	 */
	public Adapter createClrAssemblyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ClrAssemblyFile <em>Clr Assembly File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ClrAssemblyFile
	 * @generated
	 */
	public Adapter createClrAssemblyFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ColumnBinding <em>Column Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ColumnBinding
	 * @generated
	 */
	public Adapter createColumnBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ColumnsType <em>Columns Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ColumnsType
	 * @generated
	 */
	public Adapter createColumnsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ColumnsType1 <em>Columns Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ColumnsType1
	 * @generated
	 */
	public Adapter createColumnsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ColumnsType2 <em>Columns Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ColumnsType2
	 * @generated
	 */
	public Adapter createColumnsType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ColumnsType3 <em>Columns Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ColumnsType3
	 * @generated
	 */
	public Adapter createColumnsType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ColumnsType4 <em>Columns Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ColumnsType4
	 * @generated
	 */
	public Adapter createColumnsType4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ColumnType <em>Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ColumnType
	 * @generated
	 */
	public Adapter createColumnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ComAssembly <em>Com Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ComAssembly
	 * @generated
	 */
	public Adapter createComAssemblyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Command
	 * @generated
	 */
	public Adapter createCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CommandsType <em>Commands Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.CommandsType
	 * @generated
	 */
	public Adapter createCommandsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CommitTransaction <em>Commit Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.CommitTransaction
	 * @generated
	 */
	public Adapter createCommitTransactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ComparatorType <em>Comparator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ComparatorType
	 * @generated
	 */
	public Adapter createComparatorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Create <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Create
	 * @generated
	 */
	public Adapter createCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube <em>Cube</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Cube
	 * @generated
	 */
	public Adapter createCubeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeAttribute <em>Cube Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.CubeAttribute
	 * @generated
	 */
	public Adapter createCubeAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeAttributeBinding <em>Cube Attribute Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.CubeAttributeBinding
	 * @generated
	 */
	public Adapter createCubeAttributeBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimension <em>Cube Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimension
	 * @generated
	 */
	public Adapter createCubeDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimensionBinding <em>Cube Dimension Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimensionBinding
	 * @generated
	 */
	public Adapter createCubeDimensionBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimensionPermission <em>Cube Dimension Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimensionPermission
	 * @generated
	 */
	public Adapter createCubeDimensionPermissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeHierarchy <em>Cube Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.CubeHierarchy
	 * @generated
	 */
	public Adapter createCubeHierarchyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubePermission <em>Cube Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.CubePermission
	 * @generated
	 */
	public Adapter createCubePermissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubePermissionsType <em>Cube Permissions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.CubePermissionsType
	 * @generated
	 */
	public Adapter createCubePermissionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubesType <em>Cubes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.CubesType
	 * @generated
	 */
	public Adapter createCubesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CurrentStorageModeType <em>Current Storage Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.CurrentStorageModeType
	 * @generated
	 */
	public Adapter createCurrentStorageModeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CurrentStorageModeType1 <em>Current Storage Mode Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.CurrentStorageModeType1
	 * @generated
	 */
	public Adapter createCurrentStorageModeType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CustomRollupColumnType <em>Custom Rollup Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.CustomRollupColumnType
	 * @generated
	 */
	public Adapter createCustomRollupColumnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CustomRollupPropertiesColumnType <em>Custom Rollup Properties Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.CustomRollupPropertiesColumnType
	 * @generated
	 */
	public Adapter createCustomRollupPropertiesColumnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Database
	 * @generated
	 */
	public Adapter createDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DatabasePermission <em>Database Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DatabasePermission
	 * @generated
	 */
	public Adapter createDatabasePermissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DatabasePermissionsType <em>Database Permissions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DatabasePermissionsType
	 * @generated
	 */
	public Adapter createDatabasePermissionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DatabasesType <em>Databases Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DatabasesType
	 * @generated
	 */
	public Adapter createDatabasesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataBlock <em>Data Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DataBlock
	 * @generated
	 */
	public Adapter createDataBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataItem <em>Data Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DataItem
	 * @generated
	 */
	public Adapter createDataItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataMiningMeasureGroupDimension <em>Data Mining Measure Group Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DataMiningMeasureGroupDimension
	 * @generated
	 */
	public Adapter createDataMiningMeasureGroupDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DataSource
	 * @generated
	 */
	public Adapter createDataSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSourcePermission <em>Data Source Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DataSourcePermission
	 * @generated
	 */
	public Adapter createDataSourcePermissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSourcePermissionsType <em>Data Source Permissions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DataSourcePermissionsType
	 * @generated
	 */
	public Adapter createDataSourcePermissionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSourcesType <em>Data Sources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DataSourcesType
	 * @generated
	 */
	public Adapter createDataSourcesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSourceView <em>Data Source View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DataSourceView
	 * @generated
	 */
	public Adapter createDataSourceViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSourceViewBinding <em>Data Source View Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DataSourceViewBinding
	 * @generated
	 */
	public Adapter createDataSourceViewBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSourceViewsType <em>Data Source Views Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DataSourceViewsType
	 * @generated
	 */
	public Adapter createDataSourceViewsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataType1 <em>Data Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DataType1
	 * @generated
	 */
	public Adapter createDataType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataType2 <em>Data Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DataType2
	 * @generated
	 */
	public Adapter createDataType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataType3 <em>Data Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DataType3
	 * @generated
	 */
	public Adapter createDataType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DBCC <em>DBCC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DBCC
	 * @generated
	 */
	public Adapter createDBCCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DegenerateMeasureGroupDimension <em>Degenerate Measure Group Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DegenerateMeasureGroupDimension
	 * @generated
	 */
	public Adapter createDegenerateMeasureGroupDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Delete
	 * @generated
	 */
	public Adapter createDeleteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DesignAggregations <em>Design Aggregations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DesignAggregations
	 * @generated
	 */
	public Adapter createDesignAggregationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Detach <em>Detach</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Detach
	 * @generated
	 */
	public Adapter createDetachAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Dimension
	 * @generated
	 */
	public Adapter createDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute <em>Dimension Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute
	 * @generated
	 */
	public Adapter createDimensionAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionBinding <em>Dimension Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DimensionBinding
	 * @generated
	 */
	public Adapter createDimensionBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionPermission <em>Dimension Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DimensionPermission
	 * @generated
	 */
	public Adapter createDimensionPermissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionPermissionsType <em>Dimension Permissions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DimensionPermissionsType
	 * @generated
	 */
	public Adapter createDimensionPermissionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionPermissionsType1 <em>Dimension Permissions Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DimensionPermissionsType1
	 * @generated
	 */
	public Adapter createDimensionPermissionsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionsType <em>Dimensions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DimensionsType
	 * @generated
	 */
	public Adapter createDimensionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverResponseType <em>Discover Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverResponseType
	 * @generated
	 */
	public Adapter createDiscoverResponseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverType <em>Discover Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverType
	 * @generated
	 */
	public Adapter createDiscoverTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DrillThroughAction <em>Drill Through Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DrillThroughAction
	 * @generated
	 */
	public Adapter createDrillThroughActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Drop <em>Drop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Drop
	 * @generated
	 */
	public Adapter createDropAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DSVTableBinding <em>DSV Table Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DSVTableBinding
	 * @generated
	 */
	public Adapter createDSVTableBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EndOfDataType <em>End Of Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.EndOfDataType
	 * @generated
	 */
	public Adapter createEndOfDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EndSessionType <em>End Session Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.EndSessionType
	 * @generated
	 */
	public Adapter createEndSessionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration <em>Error Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration
	 * @generated
	 */
	public Adapter createErrorConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventCategoryType <em>Event Category Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.EventCategoryType
	 * @generated
	 */
	public Adapter createEventCategoryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventColumn <em>Event Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.EventColumn
	 * @generated
	 */
	public Adapter createEventColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventColumnID <em>Event Column ID</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.EventColumnID
	 * @generated
	 */
	public Adapter createEventColumnIDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventColumnListType <em>Event Column List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.EventColumnListType
	 * @generated
	 */
	public Adapter createEventColumnListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventColumnSubclassListType <em>Event Column Subclass List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.EventColumnSubclassListType
	 * @generated
	 */
	public Adapter createEventColumnSubclassListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventColumnSubclassType <em>Event Column Subclass Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.EventColumnSubclassType
	 * @generated
	 */
	public Adapter createEventColumnSubclassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventListType <em>Event List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.EventListType
	 * @generated
	 */
	public Adapter createEventListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSessionType <em>Event Session Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.EventSessionType
	 * @generated
	 */
	public Adapter createEventSessionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventsType <em>Events Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.EventsType
	 * @generated
	 */
	public Adapter createEventsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.EventType
	 * @generated
	 */
	public Adapter createEventTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventType1 <em>Event Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.EventType1
	 * @generated
	 */
	public Adapter createEventType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventTypeType <em>Event Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.EventTypeType
	 * @generated
	 */
	public Adapter createEventTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ExecuteParameter <em>Execute Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ExecuteParameter
	 * @generated
	 */
	public Adapter createExecuteParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ExecuteResponseType <em>Execute Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ExecuteResponseType
	 * @generated
	 */
	public Adapter createExecuteResponseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ExecuteType <em>Execute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ExecuteType
	 * @generated
	 */
	public Adapter createExecuteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.FilesType <em>Files Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.FilesType
	 * @generated
	 */
	public Adapter createFilesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Folder
	 * @generated
	 */
	public Adapter createFolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.FoldingParameters <em>Folding Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.FoldingParameters
	 * @generated
	 */
	public Adapter createFoldingParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ForeignKeyColumnsType <em>Foreign Key Columns Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ForeignKeyColumnsType
	 * @generated
	 */
	public Adapter createForeignKeyColumnsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ForeignKeyColumnsType1 <em>Foreign Key Columns Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ForeignKeyColumnsType1
	 * @generated
	 */
	public Adapter createForeignKeyColumnsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ForeignKeyColumnType <em>Foreign Key Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ForeignKeyColumnType
	 * @generated
	 */
	public Adapter createForeignKeyColumnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.GlobalType <em>Global Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.GlobalType
	 * @generated
	 */
	public Adapter createGlobalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Group
	 * @generated
	 */
	public Adapter createGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.GroupsType <em>Groups Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.GroupsType
	 * @generated
	 */
	public Adapter createGroupsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.HierarchiesType <em>Hierarchies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.HierarchiesType
	 * @generated
	 */
	public Adapter createHierarchiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.HierarchiesType1 <em>Hierarchies Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.HierarchiesType1
	 * @generated
	 */
	public Adapter createHierarchiesType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.HierarchiesType2 <em>Hierarchies Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.HierarchiesType2
	 * @generated
	 */
	public Adapter createHierarchiesType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy <em>Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy
	 * @generated
	 */
	public Adapter createHierarchyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ImageLoad <em>Image Load</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ImageLoad
	 * @generated
	 */
	public Adapter createImageLoadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ImageSave <em>Image Save</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ImageSave
	 * @generated
	 */
	public Adapter createImageSaveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.IncrementalProcessingNotification <em>Incremental Processing Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.IncrementalProcessingNotification
	 * @generated
	 */
	public Adapter createIncrementalProcessingNotificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.IncrementalProcessingNotificationsType <em>Incremental Processing Notifications Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.IncrementalProcessingNotificationsType
	 * @generated
	 */
	public Adapter createIncrementalProcessingNotificationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.InheritedBinding <em>Inherited Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.InheritedBinding
	 * @generated
	 */
	public Adapter createInheritedBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Insert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Insert
	 * @generated
	 */
	public Adapter createInsertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.KeepResultType <em>Keep Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.KeepResultType
	 * @generated
	 */
	public Adapter createKeepResultTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.KeyColumnsType <em>Key Columns Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.KeyColumnsType
	 * @generated
	 */
	public Adapter createKeyColumnsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.KeyColumnsType1 <em>Key Columns Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.KeyColumnsType1
	 * @generated
	 */
	public Adapter createKeyColumnsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.KeyColumnsType2 <em>Key Columns Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.KeyColumnsType2
	 * @generated
	 */
	public Adapter createKeyColumnsType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.KeyColumnsType3 <em>Key Columns Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.KeyColumnsType3
	 * @generated
	 */
	public Adapter createKeyColumnsType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.KeyColumnsType4 <em>Key Columns Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.KeyColumnsType4
	 * @generated
	 */
	public Adapter createKeyColumnsType4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.KeyColumnType <em>Key Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.KeyColumnType
	 * @generated
	 */
	public Adapter createKeyColumnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.KeysType <em>Keys Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.KeysType
	 * @generated
	 */
	public Adapter createKeysTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.KeysType1 <em>Keys Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.KeysType1
	 * @generated
	 */
	public Adapter createKeysType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Kpi <em>Kpi</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Kpi
	 * @generated
	 */
	public Adapter createKpiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.KpisType <em>Kpis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.KpisType
	 * @generated
	 */
	public Adapter createKpisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.KpisType1 <em>Kpis Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.KpisType1
	 * @generated
	 */
	public Adapter createKpisType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Level <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Level
	 * @generated
	 */
	public Adapter createLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.LevelsType <em>Levels Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.LevelsType
	 * @generated
	 */
	public Adapter createLevelsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.LocationBackup <em>Location Backup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.LocationBackup
	 * @generated
	 */
	public Adapter createLocationBackupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.LocationsType <em>Locations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.LocationsType
	 * @generated
	 */
	public Adapter createLocationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.LocationsType1 <em>Locations Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.LocationsType1
	 * @generated
	 */
	public Adapter createLocationsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.LocationsType2 <em>Locations Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.LocationsType2
	 * @generated
	 */
	public Adapter createLocationsType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Lock <em>Lock</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Lock
	 * @generated
	 */
	public Adapter createLockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject <em>Major Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject
	 * @generated
	 */
	public Adapter createMajorObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ManyToManyMeasureGroupDimension <em>Many To Many Measure Group Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ManyToManyMeasureGroupDimension
	 * @generated
	 */
	public Adapter createManyToManyMeasureGroupDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MdxScript <em>Mdx Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MdxScript
	 * @generated
	 */
	public Adapter createMdxScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MdxScriptsType <em>Mdx Scripts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MdxScriptsType
	 * @generated
	 */
	public Adapter createMdxScriptsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Measure
	 * @generated
	 */
	public Adapter createMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureBinding <em>Measure Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MeasureBinding
	 * @generated
	 */
	public Adapter createMeasureBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup <em>Measure Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup
	 * @generated
	 */
	public Adapter createMeasureGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupAttribute <em>Measure Group Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupAttribute
	 * @generated
	 */
	public Adapter createMeasureGroupAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupBinding <em>Measure Group Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupBinding
	 * @generated
	 */
	public Adapter createMeasureGroupBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupDimension <em>Measure Group Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupDimension
	 * @generated
	 */
	public Adapter createMeasureGroupDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupDimensionBinding <em>Measure Group Dimension Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupDimensionBinding
	 * @generated
	 */
	public Adapter createMeasureGroupDimensionBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupsType <em>Measure Groups Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupsType
	 * @generated
	 */
	public Adapter createMeasureGroupsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupsType1 <em>Measure Groups Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupsType1
	 * @generated
	 */
	public Adapter createMeasureGroupsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasuresType <em>Measures Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MeasuresType
	 * @generated
	 */
	public Adapter createMeasuresTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasuresType1 <em>Measures Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MeasuresType1
	 * @generated
	 */
	public Adapter createMeasuresType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasuresType2 <em>Measures Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MeasuresType2
	 * @generated
	 */
	public Adapter createMeasuresType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Member
	 * @generated
	 */
	public Adapter createMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MembersType <em>Members Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MembersType
	 * @generated
	 */
	public Adapter createMembersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MembersType1 <em>Members Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MembersType1
	 * @generated
	 */
	public Adapter createMembersType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MergePartitions <em>Merge Partitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MergePartitions
	 * @generated
	 */
	public Adapter createMergePartitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel <em>Mining Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel
	 * @generated
	 */
	public Adapter createMiningModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelColumn <em>Mining Model Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelColumn
	 * @generated
	 */
	public Adapter createMiningModelColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelingFlag <em>Mining Modeling Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelingFlag
	 * @generated
	 */
	public Adapter createMiningModelingFlagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelPermission <em>Mining Model Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelPermission
	 * @generated
	 */
	public Adapter createMiningModelPermissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelPermissionsType <em>Mining Model Permissions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelPermissionsType
	 * @generated
	 */
	public Adapter createMiningModelPermissionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelsType <em>Mining Models Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelsType
	 * @generated
	 */
	public Adapter createMiningModelsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure <em>Mining Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure
	 * @generated
	 */
	public Adapter createMiningStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructureColumn <em>Mining Structure Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructureColumn
	 * @generated
	 */
	public Adapter createMiningStructureColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructurePermission <em>Mining Structure Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructurePermission
	 * @generated
	 */
	public Adapter createMiningStructurePermissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructurePermissionsType <em>Mining Structure Permissions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructurePermissionsType
	 * @generated
	 */
	public Adapter createMiningStructurePermissionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructuresType <em>Mining Structures Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructuresType
	 * @generated
	 */
	public Adapter createMiningStructuresTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ModelingFlagsType <em>Modeling Flags Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ModelingFlagsType
	 * @generated
	 */
	public Adapter createModelingFlagsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ModelingFlagsType1 <em>Modeling Flags Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ModelingFlagsType1
	 * @generated
	 */
	public Adapter createModelingFlagsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.NameColumnType <em>Name Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.NameColumnType
	 * @generated
	 */
	public Adapter createNameColumnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.NamingTemplateTranslationsType <em>Naming Template Translations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.NamingTemplateTranslationsType
	 * @generated
	 */
	public Adapter createNamingTemplateTranslationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.NotifyTableChange <em>Notify Table Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.NotifyTableChange
	 * @generated
	 */
	public Adapter createNotifyTableChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.NotType <em>Not Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.NotType
	 * @generated
	 */
	public Adapter createNotTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference <em>Object Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference
	 * @generated
	 */
	public Adapter createObjectReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ObjectType
	 * @generated
	 */
	public Adapter createObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.OlapDataSource <em>Olap Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.OlapDataSource
	 * @generated
	 */
	public Adapter createOlapDataSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.OrdinalType <em>Ordinal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.OrdinalType
	 * @generated
	 */
	public Adapter createOrdinalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding <em>Out Of Line Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding
	 * @generated
	 */
	public Adapter createOutOfLineBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ParallelType <em>Parallel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ParallelType
	 * @generated
	 */
	public Adapter createParallelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Parameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Parameters
	 * @generated
	 */
	public Adapter createParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ParametersType <em>Parameters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ParametersType
	 * @generated
	 */
	public Adapter createParametersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ParameterType2 <em>Parameter Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ParameterType2
	 * @generated
	 */
	public Adapter createParameterType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Partition
	 * @generated
	 */
	public Adapter createPartitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PartitionsType <em>Partitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PartitionsType
	 * @generated
	 */
	public Adapter createPartitionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Permission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Permission
	 * @generated
	 */
	public Adapter createPermissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Perspective <em>Perspective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Perspective
	 * @generated
	 */
	public Adapter createPerspectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveAction <em>Perspective Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveAction
	 * @generated
	 */
	public Adapter createPerspectiveActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveAttribute <em>Perspective Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveAttribute
	 * @generated
	 */
	public Adapter createPerspectiveAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveCalculation <em>Perspective Calculation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveCalculation
	 * @generated
	 */
	public Adapter createPerspectiveCalculationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveDimension <em>Perspective Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveDimension
	 * @generated
	 */
	public Adapter createPerspectiveDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveHierarchy <em>Perspective Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveHierarchy
	 * @generated
	 */
	public Adapter createPerspectiveHierarchyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveKpi <em>Perspective Kpi</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveKpi
	 * @generated
	 */
	public Adapter createPerspectiveKpiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveMeasure <em>Perspective Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveMeasure
	 * @generated
	 */
	public Adapter createPerspectiveMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveMeasureGroup <em>Perspective Measure Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveMeasureGroup
	 * @generated
	 */
	public Adapter createPerspectiveMeasureGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PerspectivesType <em>Perspectives Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PerspectivesType
	 * @generated
	 */
	public Adapter createPerspectivesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PredLeaf <em>Pred Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PredLeaf
	 * @generated
	 */
	public Adapter createPredLeafAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCaching <em>Proactive Caching</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCaching
	 * @generated
	 */
	public Adapter createProactiveCachingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingBinding <em>Proactive Caching Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingBinding
	 * @generated
	 */
	public Adapter createProactiveCachingBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingIncrementalProcessingBinding <em>Proactive Caching Incremental Processing Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingIncrementalProcessingBinding
	 * @generated
	 */
	public Adapter createProactiveCachingIncrementalProcessingBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingInheritedBinding <em>Proactive Caching Inherited Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingInheritedBinding
	 * @generated
	 */
	public Adapter createProactiveCachingInheritedBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingObjectNotificationBinding <em>Proactive Caching Object Notification Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingObjectNotificationBinding
	 * @generated
	 */
	public Adapter createProactiveCachingObjectNotificationBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingQueryBinding <em>Proactive Caching Query Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingQueryBinding
	 * @generated
	 */
	public Adapter createProactiveCachingQueryBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingTablesBinding <em>Proactive Caching Tables Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingTablesBinding
	 * @generated
	 */
	public Adapter createProactiveCachingTablesBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Properties
	 * @generated
	 */
	public Adapter createPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertiesType <em>Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertiesType
	 * @generated
	 */
	public Adapter createPropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList <em>Property List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PropertyList
	 * @generated
	 */
	public Adapter createPropertyListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PushedDataSource <em>Pushed Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PushedDataSource
	 * @generated
	 */
	public Adapter createPushedDataSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.QueriesType <em>Queries Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.QueriesType
	 * @generated
	 */
	public Adapter createQueriesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.QueryBinding <em>Query Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.QueryBinding
	 * @generated
	 */
	public Adapter createQueryBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.QueryNotification <em>Query Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.QueryNotification
	 * @generated
	 */
	public Adapter createQueryNotificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.QueryNotificationsType <em>Query Notifications Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.QueryNotificationsType
	 * @generated
	 */
	public Adapter createQueryNotificationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReferenceMeasureGroupDimension <em>Reference Measure Group Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ReferenceMeasureGroupDimension
	 * @generated
	 */
	public Adapter createReferenceMeasureGroupDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.RegularMeasureGroupDimension <em>Regular Measure Group Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.RegularMeasureGroupDimension
	 * @generated
	 */
	public Adapter createRegularMeasureGroupDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.RelationalDataSource <em>Relational Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.RelationalDataSource
	 * @generated
	 */
	public Adapter createRelationalDataSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction <em>Report Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction
	 * @generated
	 */
	public Adapter createReportActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportFormatParameter <em>Report Format Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ReportFormatParameter
	 * @generated
	 */
	public Adapter createReportFormatParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportFormatParametersType <em>Report Format Parameters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ReportFormatParametersType
	 * @generated
	 */
	public Adapter createReportFormatParametersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportParameter <em>Report Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ReportParameter
	 * @generated
	 */
	public Adapter createReportParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportParametersType <em>Report Parameters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ReportParametersType
	 * @generated
	 */
	public Adapter createReportParametersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Restore <em>Restore</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Restore
	 * @generated
	 */
	public Adapter createRestoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.RestrictionListType <em>Restriction List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.RestrictionListType
	 * @generated
	 */
	public Adapter createRestrictionListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.RestrictionsType <em>Restrictions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.RestrictionsType
	 * @generated
	 */
	public Adapter createRestrictionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ResultType
	 * @generated
	 */
	public Adapter createResultTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Return <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Return
	 * @generated
	 */
	public Adapter createReturnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ReturnType
	 * @generated
	 */
	public Adapter createReturnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.RolesType <em>Roles Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.RolesType
	 * @generated
	 */
	public Adapter createRolesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.RolesType1 <em>Roles Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.RolesType1
	 * @generated
	 */
	public Adapter createRolesType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.RollbackTransaction <em>Rollback Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.RollbackTransaction
	 * @generated
	 */
	public Adapter createRollbackTransactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.RootType <em>Root Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.RootType
	 * @generated
	 */
	public Adapter createRootTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.RowBinding <em>Row Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.RowBinding
	 * @generated
	 */
	public Adapter createRowBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn <em>Scalar Mining Structure Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn
	 * @generated
	 */
	public Adapter createScalarMiningStructureColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Server
	 * @generated
	 */
	public Adapter createServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ServerPropertiesType <em>Server Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ServerPropertiesType
	 * @generated
	 */
	public Adapter createServerPropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ServerProperty <em>Server Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ServerProperty
	 * @generated
	 */
	public Adapter createServerPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.SessionType <em>Session Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.SessionType
	 * @generated
	 */
	public Adapter createSessionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.SetAuthContext <em>Set Auth Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.SetAuthContext
	 * @generated
	 */
	public Adapter createSetAuthContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.SkippedLevelsColumnType <em>Skipped Levels Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.SkippedLevelsColumnType
	 * @generated
	 */
	public Adapter createSkippedLevelsColumnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Source
	 * @generated
	 */
	public Adapter createSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.SourcesType <em>Sources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.SourcesType
	 * @generated
	 */
	public Adapter createSourcesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.StandardAction <em>Standard Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.StandardAction
	 * @generated
	 */
	public Adapter createStandardActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.StorageModeType <em>Storage Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.StorageModeType
	 * @generated
	 */
	public Adapter createStorageModeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.StorageModeType2 <em>Storage Mode Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.StorageModeType2
	 * @generated
	 */
	public Adapter createStorageModeType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.StorageModeType3 <em>Storage Mode Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.StorageModeType3
	 * @generated
	 */
	public Adapter createStorageModeType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Subscribe <em>Subscribe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Subscribe
	 * @generated
	 */
	public Adapter createSubscribeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Synchronize <em>Synchronize</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Synchronize
	 * @generated
	 */
	public Adapter createSynchronizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TableBinding <em>Table Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.TableBinding
	 * @generated
	 */
	public Adapter createTableBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TableMiningStructureColumn <em>Table Mining Structure Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.TableMiningStructureColumn
	 * @generated
	 */
	public Adapter createTableMiningStructureColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TableNotification <em>Table Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.TableNotification
	 * @generated
	 */
	public Adapter createTableNotificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TableNotificationsType <em>Table Notifications Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.TableNotificationsType
	 * @generated
	 */
	public Adapter createTableNotificationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TableNotificationsType1 <em>Table Notifications Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.TableNotificationsType1
	 * @generated
	 */
	public Adapter createTableNotificationsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TabularBinding <em>Tabular Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.TabularBinding
	 * @generated
	 */
	public Adapter createTabularBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TargetType <em>Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.TargetType
	 * @generated
	 */
	public Adapter createTargetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TargetType1 <em>Target Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.TargetType1
	 * @generated
	 */
	public Adapter createTargetType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TimeAttributeBinding <em>Time Attribute Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.TimeAttributeBinding
	 * @generated
	 */
	public Adapter createTimeAttributeBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TimeBinding <em>Time Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.TimeBinding
	 * @generated
	 */
	public Adapter createTimeBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Trace
	 * @generated
	 */
	public Adapter createTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TraceColumns <em>Trace Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.TraceColumns
	 * @generated
	 */
	public Adapter createTraceColumnsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TraceDefinitionProviderInfo <em>Trace Definition Provider Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.TraceDefinitionProviderInfo
	 * @generated
	 */
	public Adapter createTraceDefinitionProviderInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TraceEvent <em>Trace Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.TraceEvent
	 * @generated
	 */
	public Adapter createTraceEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TraceEventCategories <em>Trace Event Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.TraceEventCategories
	 * @generated
	 */
	public Adapter createTraceEventCategoriesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TraceFilter <em>Trace Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.TraceFilter
	 * @generated
	 */
	public Adapter createTraceFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TracesType <em>Traces Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.TracesType
	 * @generated
	 */
	public Adapter createTracesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Translation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Translation
	 * @generated
	 */
	public Adapter createTranslationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TranslationInsertUpdate <em>Translation Insert Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.TranslationInsertUpdate
	 * @generated
	 */
	public Adapter createTranslationInsertUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType <em>Translations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType
	 * @generated
	 */
	public Adapter createTranslationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TranslationType <em>Translation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.TranslationType
	 * @generated
	 */
	public Adapter createTranslationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TypeType6 <em>Type Type6</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.TypeType6
	 * @generated
	 */
	public Adapter createTypeType6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.UnaryExpr <em>Unary Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.UnaryExpr
	 * @generated
	 */
	public Adapter createUnaryExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.UnaryOperatorColumnType <em>Unary Operator Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.UnaryOperatorColumnType
	 * @generated
	 */
	public Adapter createUnaryOperatorColumnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.UnknownMemberTranslationsType <em>Unknown Member Translations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.UnknownMemberTranslationsType
	 * @generated
	 */
	public Adapter createUnknownMemberTranslationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.UnknownMemberType <em>Unknown Member Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.UnknownMemberType
	 * @generated
	 */
	public Adapter createUnknownMemberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Unlock <em>Unlock</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Unlock
	 * @generated
	 */
	public Adapter createUnlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Unsubscribe <em>Unsubscribe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Unsubscribe
	 * @generated
	 */
	public Adapter createUnsubscribeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Update <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Update
	 * @generated
	 */
	public Adapter createUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.UpdateCells <em>Update Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.UpdateCells
	 * @generated
	 */
	public Adapter createUpdateCellsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.UserDefinedGroupBinding <em>User Defined Group Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.UserDefinedGroupBinding
	 * @generated
	 */
	public Adapter createUserDefinedGroupBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ValueColumnType <em>Value Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ValueColumnType
	 * @generated
	 */
	public Adapter createValueColumnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.VersionType <em>Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.VersionType
	 * @generated
	 */
	public Adapter createVersionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Where <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.Where
	 * @generated
	 */
	public Adapter createWhereAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.xmla.WhereAttribute <em>Where Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.WhereAttribute
	 * @generated
	 */
	public Adapter createWhereAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //XmlaAdapterFactory
