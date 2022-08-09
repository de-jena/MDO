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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage
 * @generated
 */
public class XmlaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XmlaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlaSwitch() {
		if (modelPackage == null) {
			modelPackage = XmlaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case XmlaPackage.ACCOUNT: {
				Account account = (Account)theEObject;
				T result = caseAccount(account);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ACCOUNTS_TYPE: {
				AccountsType accountsType = (AccountsType)theEObject;
				T result = caseAccountsType(accountsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ACTIONS_TYPE: {
				ActionsType actionsType = (ActionsType)theEObject;
				T result = caseActionsType(actionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ACTIONS_TYPE1: {
				ActionsType1 actionsType1 = (ActionsType1)theEObject;
				T result = caseActionsType1(actionsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ACTION_TYPE: {
				ActionType actionType = (ActionType)theEObject;
				T result = caseActionType(actionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.AGGREGATION: {
				Aggregation aggregation = (Aggregation)theEObject;
				T result = caseAggregation(aggregation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.AGGREGATION_ATTRIBUTE: {
				AggregationAttribute aggregationAttribute = (AggregationAttribute)theEObject;
				T result = caseAggregationAttribute(aggregationAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.AGGREGATION_DESIGN: {
				AggregationDesign aggregationDesign = (AggregationDesign)theEObject;
				T result = caseAggregationDesign(aggregationDesign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.AGGREGATION_DESIGN_ATTRIBUTE: {
				AggregationDesignAttribute aggregationDesignAttribute = (AggregationDesignAttribute)theEObject;
				T result = caseAggregationDesignAttribute(aggregationDesignAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.AGGREGATION_DESIGN_DIMENSION: {
				AggregationDesignDimension aggregationDesignDimension = (AggregationDesignDimension)theEObject;
				T result = caseAggregationDesignDimension(aggregationDesignDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.AGGREGATION_DESIGNS_TYPE: {
				AggregationDesignsType aggregationDesignsType = (AggregationDesignsType)theEObject;
				T result = caseAggregationDesignsType(aggregationDesignsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.AGGREGATION_DIMENSION: {
				AggregationDimension aggregationDimension = (AggregationDimension)theEObject;
				T result = caseAggregationDimension(aggregationDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.AGGREGATION_INSTANCE: {
				AggregationInstance aggregationInstance = (AggregationInstance)theEObject;
				T result = caseAggregationInstance(aggregationInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.AGGREGATION_INSTANCE_ATTRIBUTE: {
				AggregationInstanceAttribute aggregationInstanceAttribute = (AggregationInstanceAttribute)theEObject;
				T result = caseAggregationInstanceAttribute(aggregationInstanceAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.AGGREGATION_INSTANCE_DIMENSION: {
				AggregationInstanceDimension aggregationInstanceDimension = (AggregationInstanceDimension)theEObject;
				T result = caseAggregationInstanceDimension(aggregationInstanceDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.AGGREGATION_INSTANCE_MEASURE: {
				AggregationInstanceMeasure aggregationInstanceMeasure = (AggregationInstanceMeasure)theEObject;
				T result = caseAggregationInstanceMeasure(aggregationInstanceMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.AGGREGATION_INSTANCES_TYPE: {
				AggregationInstancesType aggregationInstancesType = (AggregationInstancesType)theEObject;
				T result = caseAggregationInstancesType(aggregationInstancesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.AGGREGATIONS_TYPE: {
				AggregationsType aggregationsType = (AggregationsType)theEObject;
				T result = caseAggregationsType(aggregationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ALGORITHM_PARAMETER: {
				AlgorithmParameter algorithmParameter = (AlgorithmParameter)theEObject;
				T result = caseAlgorithmParameter(algorithmParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ALGORITHM_PARAMETERS_TYPE: {
				AlgorithmParametersType algorithmParametersType = (AlgorithmParametersType)theEObject;
				T result = caseAlgorithmParametersType(algorithmParametersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ALIASES_TYPE: {
				AliasesType aliasesType = (AliasesType)theEObject;
				T result = caseAliasesType(aliasesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ALL_MEMBER_TRANSLATIONS_TYPE: {
				AllMemberTranslationsType allMemberTranslationsType = (AllMemberTranslationsType)theEObject;
				T result = caseAllMemberTranslationsType(allMemberTranslationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ALTER: {
				Alter alter = (Alter)theEObject;
				T result = caseAlter(alter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.AND_OR_TYPE: {
				AndOrType andOrType = (AndOrType)theEObject;
				T result = caseAndOrType(andOrType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ANNOTATIONS_TYPE: {
				AnnotationsType annotationsType = (AnnotationsType)theEObject;
				T result = caseAnnotationsType(annotationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ASSEMBLIES_TYPE: {
				AssembliesType assembliesType = (AssembliesType)theEObject;
				T result = caseAssembliesType(assembliesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ASSEMBLIES_TYPE1: {
				AssembliesType1 assembliesType1 = (AssembliesType1)theEObject;
				T result = caseAssembliesType1(assembliesType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ASSEMBLY: {
				Assembly assembly = (Assembly)theEObject;
				T result = caseAssembly(assembly);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ATTACH: {
				Attach attach = (Attach)theEObject;
				T result = caseAttach(attach);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ATTRIBUTE_ALL_MEMBER_TRANSLATIONS_TYPE: {
				AttributeAllMemberTranslationsType attributeAllMemberTranslationsType = (AttributeAllMemberTranslationsType)theEObject;
				T result = caseAttributeAllMemberTranslationsType(attributeAllMemberTranslationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ATTRIBUTE_BINDING: {
				AttributeBinding attributeBinding = (AttributeBinding)theEObject;
				T result = caseAttributeBinding(attributeBinding);
				if (result == null) result = caseBinding(attributeBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ATTRIBUTE_INSERT_UPDATE: {
				AttributeInsertUpdate attributeInsertUpdate = (AttributeInsertUpdate)theEObject;
				T result = caseAttributeInsertUpdate(attributeInsertUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ATTRIBUTE_PERMISSION: {
				AttributePermission attributePermission = (AttributePermission)theEObject;
				T result = caseAttributePermission(attributePermission);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ATTRIBUTE_PERMISSIONS_TYPE: {
				AttributePermissionsType attributePermissionsType = (AttributePermissionsType)theEObject;
				T result = caseAttributePermissionsType(attributePermissionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ATTRIBUTE_PERMISSIONS_TYPE1: {
				AttributePermissionsType1 attributePermissionsType1 = (AttributePermissionsType1)theEObject;
				T result = caseAttributePermissionsType1(attributePermissionsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP: {
				AttributeRelationship attributeRelationship = (AttributeRelationship)theEObject;
				T result = caseAttributeRelationship(attributeRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ATTRIBUTE_RELATIONSHIPS_TYPE: {
				AttributeRelationshipsType attributeRelationshipsType = (AttributeRelationshipsType)theEObject;
				T result = caseAttributeRelationshipsType(attributeRelationshipsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ATTRIBUTES_TYPE: {
				AttributesType attributesType = (AttributesType)theEObject;
				T result = caseAttributesType(attributesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ATTRIBUTES_TYPE1: {
				AttributesType1 attributesType1 = (AttributesType1)theEObject;
				T result = caseAttributesType1(attributesType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ATTRIBUTES_TYPE2: {
				AttributesType2 attributesType2 = (AttributesType2)theEObject;
				T result = caseAttributesType2(attributesType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ATTRIBUTES_TYPE3: {
				AttributesType3 attributesType3 = (AttributesType3)theEObject;
				T result = caseAttributesType3(attributesType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ATTRIBUTES_TYPE4: {
				AttributesType4 attributesType4 = (AttributesType4)theEObject;
				T result = caseAttributesType4(attributesType4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ATTRIBUTES_TYPE5: {
				AttributesType5 attributesType5 = (AttributesType5)theEObject;
				T result = caseAttributesType5(attributesType5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ATTRIBUTES_TYPE6: {
				AttributesType6 attributesType6 = (AttributesType6)theEObject;
				T result = caseAttributesType6(attributesType6);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ATTRIBUTES_TYPE7: {
				AttributesType7 attributesType7 = (AttributesType7)theEObject;
				T result = caseAttributesType7(attributesType7);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ATTRIBUTES_TYPE8: {
				AttributesType8 attributesType8 = (AttributesType8)theEObject;
				T result = caseAttributesType8(attributesType8);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ATTRIBUTE_TRANSLATION: {
				AttributeTranslation attributeTranslation = (AttributeTranslation)theEObject;
				T result = caseAttributeTranslation(attributeTranslation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.BACKUP: {
				Backup backup = (Backup)theEObject;
				T result = caseBackup(backup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.BATCH: {
				Batch batch = (Batch)theEObject;
				T result = caseBatch(batch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.BEGIN_SESSION_TYPE: {
				BeginSessionType beginSessionType = (BeginSessionType)theEObject;
				T result = caseBeginSessionType(beginSessionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.BEGIN_TRANSACTION: {
				BeginTransaction beginTransaction = (BeginTransaction)theEObject;
				T result = caseBeginTransaction(beginTransaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.BINDING: {
				Binding binding = (Binding)theEObject;
				T result = caseBinding(binding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.BINDINGS: {
				Bindings bindings = (Bindings)theEObject;
				T result = caseBindings(bindings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.BOOL_BINOP: {
				BoolBinop boolBinop = (BoolBinop)theEObject;
				T result = caseBoolBinop(boolBinop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.BOOLEAN_EXPR: {
				BooleanExpr booleanExpr = (BooleanExpr)theEObject;
				T result = caseBooleanExpr(booleanExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.CALCULATED_MEASURE_BINDING: {
				CalculatedMeasureBinding calculatedMeasureBinding = (CalculatedMeasureBinding)theEObject;
				T result = caseCalculatedMeasureBinding(calculatedMeasureBinding);
				if (result == null) result = caseBinding(calculatedMeasureBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.CALCULATION_PROPERTIES_TYPE: {
				CalculationPropertiesType calculationPropertiesType = (CalculationPropertiesType)theEObject;
				T result = caseCalculationPropertiesType(calculationPropertiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.CALCULATION_PROPERTY: {
				CalculationProperty calculationProperty = (CalculationProperty)theEObject;
				T result = caseCalculationProperty(calculationProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.CALCULATIONS_TYPE: {
				CalculationsType calculationsType = (CalculationsType)theEObject;
				T result = caseCalculationsType(calculationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.CANCEL: {
				Cancel cancel = (Cancel)theEObject;
				T result = caseCancel(cancel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.CELL: {
				Cell cell = (Cell)theEObject;
				T result = caseCell(cell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.CELL_PERMISSION: {
				CellPermission cellPermission = (CellPermission)theEObject;
				T result = caseCellPermission(cellPermission);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.CELL_PERMISSIONS_TYPE: {
				CellPermissionsType cellPermissionsType = (CellPermissionsType)theEObject;
				T result = caseCellPermissionsType(cellPermissionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.CLASSIFIED_COLUMNS_TYPE: {
				ClassifiedColumnsType classifiedColumnsType = (ClassifiedColumnsType)theEObject;
				T result = caseClassifiedColumnsType(classifiedColumnsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.CLEAR_CACHE: {
				ClearCache clearCache = (ClearCache)theEObject;
				T result = caseClearCache(clearCache);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.CLEAR_RESULT_TYPE: {
				ClearResultType clearResultType = (ClearResultType)theEObject;
				T result = caseClearResultType(clearResultType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.CLONE_DATABASE: {
				CloneDatabase cloneDatabase = (CloneDatabase)theEObject;
				T result = caseCloneDatabase(cloneDatabase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.CLR_ASSEMBLY: {
				ClrAssembly clrAssembly = (ClrAssembly)theEObject;
				T result = caseClrAssembly(clrAssembly);
				if (result == null) result = caseAssembly(clrAssembly);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.CLR_ASSEMBLY_FILE: {
				ClrAssemblyFile clrAssemblyFile = (ClrAssemblyFile)theEObject;
				T result = caseClrAssemblyFile(clrAssemblyFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.COLUMN_BINDING: {
				ColumnBinding columnBinding = (ColumnBinding)theEObject;
				T result = caseColumnBinding(columnBinding);
				if (result == null) result = caseBinding(columnBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.COLUMNS_TYPE: {
				ColumnsType columnsType = (ColumnsType)theEObject;
				T result = caseColumnsType(columnsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.COLUMNS_TYPE1: {
				ColumnsType1 columnsType1 = (ColumnsType1)theEObject;
				T result = caseColumnsType1(columnsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.COLUMNS_TYPE2: {
				ColumnsType2 columnsType2 = (ColumnsType2)theEObject;
				T result = caseColumnsType2(columnsType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.COLUMNS_TYPE3: {
				ColumnsType3 columnsType3 = (ColumnsType3)theEObject;
				T result = caseColumnsType3(columnsType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.COLUMNS_TYPE4: {
				ColumnsType4 columnsType4 = (ColumnsType4)theEObject;
				T result = caseColumnsType4(columnsType4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.COLUMN_TYPE: {
				ColumnType columnType = (ColumnType)theEObject;
				T result = caseColumnType(columnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.COM_ASSEMBLY: {
				ComAssembly comAssembly = (ComAssembly)theEObject;
				T result = caseComAssembly(comAssembly);
				if (result == null) result = caseAssembly(comAssembly);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.COMMAND: {
				Command command = (Command)theEObject;
				T result = caseCommand(command);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.COMMANDS_TYPE: {
				CommandsType commandsType = (CommandsType)theEObject;
				T result = caseCommandsType(commandsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.COMMIT_TRANSACTION: {
				CommitTransaction commitTransaction = (CommitTransaction)theEObject;
				T result = caseCommitTransaction(commitTransaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.COMPARATOR_TYPE: {
				ComparatorType comparatorType = (ComparatorType)theEObject;
				T result = caseComparatorType(comparatorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.CREATE: {
				Create create = (Create)theEObject;
				T result = caseCreate(create);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.CUBE: {
				Cube cube = (Cube)theEObject;
				T result = caseCube(cube);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.CUBE_ATTRIBUTE: {
				CubeAttribute cubeAttribute = (CubeAttribute)theEObject;
				T result = caseCubeAttribute(cubeAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.CUBE_ATTRIBUTE_BINDING: {
				CubeAttributeBinding cubeAttributeBinding = (CubeAttributeBinding)theEObject;
				T result = caseCubeAttributeBinding(cubeAttributeBinding);
				if (result == null) result = caseBinding(cubeAttributeBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.CUBE_DIMENSION: {
				CubeDimension cubeDimension = (CubeDimension)theEObject;
				T result = caseCubeDimension(cubeDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.CUBE_DIMENSION_BINDING: {
				CubeDimensionBinding cubeDimensionBinding = (CubeDimensionBinding)theEObject;
				T result = caseCubeDimensionBinding(cubeDimensionBinding);
				if (result == null) result = caseBinding(cubeDimensionBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.CUBE_DIMENSION_PERMISSION: {
				CubeDimensionPermission cubeDimensionPermission = (CubeDimensionPermission)theEObject;
				T result = caseCubeDimensionPermission(cubeDimensionPermission);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.CUBE_HIERARCHY: {
				CubeHierarchy cubeHierarchy = (CubeHierarchy)theEObject;
				T result = caseCubeHierarchy(cubeHierarchy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.CUBE_PERMISSION: {
				CubePermission cubePermission = (CubePermission)theEObject;
				T result = caseCubePermission(cubePermission);
				if (result == null) result = casePermission(cubePermission);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.CUBE_PERMISSIONS_TYPE: {
				CubePermissionsType cubePermissionsType = (CubePermissionsType)theEObject;
				T result = caseCubePermissionsType(cubePermissionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.CUBES_TYPE: {
				CubesType cubesType = (CubesType)theEObject;
				T result = caseCubesType(cubesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.CURRENT_STORAGE_MODE_TYPE: {
				CurrentStorageModeType currentStorageModeType = (CurrentStorageModeType)theEObject;
				T result = caseCurrentStorageModeType(currentStorageModeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.CURRENT_STORAGE_MODE_TYPE1: {
				CurrentStorageModeType1 currentStorageModeType1 = (CurrentStorageModeType1)theEObject;
				T result = caseCurrentStorageModeType1(currentStorageModeType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.CUSTOM_ROLLUP_COLUMN_TYPE: {
				CustomRollupColumnType customRollupColumnType = (CustomRollupColumnType)theEObject;
				T result = caseCustomRollupColumnType(customRollupColumnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.CUSTOM_ROLLUP_PROPERTIES_COLUMN_TYPE: {
				CustomRollupPropertiesColumnType customRollupPropertiesColumnType = (CustomRollupPropertiesColumnType)theEObject;
				T result = caseCustomRollupPropertiesColumnType(customRollupPropertiesColumnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.DATABASE: {
				Database database = (Database)theEObject;
				T result = caseDatabase(database);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.DATABASE_PERMISSION: {
				DatabasePermission databasePermission = (DatabasePermission)theEObject;
				T result = caseDatabasePermission(databasePermission);
				if (result == null) result = casePermission(databasePermission);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.DATABASE_PERMISSIONS_TYPE: {
				DatabasePermissionsType databasePermissionsType = (DatabasePermissionsType)theEObject;
				T result = caseDatabasePermissionsType(databasePermissionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.DATABASES_TYPE: {
				DatabasesType databasesType = (DatabasesType)theEObject;
				T result = caseDatabasesType(databasesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.DATA_BLOCK: {
				DataBlock dataBlock = (DataBlock)theEObject;
				T result = caseDataBlock(dataBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.DATA_ITEM: {
				DataItem dataItem = (DataItem)theEObject;
				T result = caseDataItem(dataItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.DATA_MINING_MEASURE_GROUP_DIMENSION: {
				DataMiningMeasureGroupDimension dataMiningMeasureGroupDimension = (DataMiningMeasureGroupDimension)theEObject;
				T result = caseDataMiningMeasureGroupDimension(dataMiningMeasureGroupDimension);
				if (result == null) result = caseMeasureGroupDimension(dataMiningMeasureGroupDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.DATA_SOURCE: {
				DataSource dataSource = (DataSource)theEObject;
				T result = caseDataSource(dataSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.DATA_SOURCE_PERMISSION: {
				DataSourcePermission dataSourcePermission = (DataSourcePermission)theEObject;
				T result = caseDataSourcePermission(dataSourcePermission);
				if (result == null) result = casePermission(dataSourcePermission);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.DATA_SOURCE_PERMISSIONS_TYPE: {
				DataSourcePermissionsType dataSourcePermissionsType = (DataSourcePermissionsType)theEObject;
				T result = caseDataSourcePermissionsType(dataSourcePermissionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.DATA_SOURCES_TYPE: {
				DataSourcesType dataSourcesType = (DataSourcesType)theEObject;
				T result = caseDataSourcesType(dataSourcesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.DATA_SOURCE_VIEW: {
				DataSourceView dataSourceView = (DataSourceView)theEObject;
				T result = caseDataSourceView(dataSourceView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.DATA_SOURCE_VIEW_BINDING: {
				DataSourceViewBinding dataSourceViewBinding = (DataSourceViewBinding)theEObject;
				T result = caseDataSourceViewBinding(dataSourceViewBinding);
				if (result == null) result = caseBinding(dataSourceViewBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.DATA_SOURCE_VIEWS_TYPE: {
				DataSourceViewsType dataSourceViewsType = (DataSourceViewsType)theEObject;
				T result = caseDataSourceViewsType(dataSourceViewsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.DATA_TYPE1: {
				DataType1 dataType1 = (DataType1)theEObject;
				T result = caseDataType1(dataType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.DATA_TYPE2: {
				DataType2 dataType2 = (DataType2)theEObject;
				T result = caseDataType2(dataType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.DATA_TYPE3: {
				DataType3 dataType3 = (DataType3)theEObject;
				T result = caseDataType3(dataType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.DBCC: {
				DBCC dbcc = (DBCC)theEObject;
				T result = caseDBCC(dbcc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.DEGENERATE_MEASURE_GROUP_DIMENSION: {
				DegenerateMeasureGroupDimension degenerateMeasureGroupDimension = (DegenerateMeasureGroupDimension)theEObject;
				T result = caseDegenerateMeasureGroupDimension(degenerateMeasureGroupDimension);
				if (result == null) result = caseMeasureGroupDimension(degenerateMeasureGroupDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.DELETE: {
				Delete delete = (Delete)theEObject;
				T result = caseDelete(delete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.DESIGN_AGGREGATIONS: {
				DesignAggregations designAggregations = (DesignAggregations)theEObject;
				T result = caseDesignAggregations(designAggregations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.DETACH: {
				Detach detach = (Detach)theEObject;
				T result = caseDetach(detach);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.DIMENSION: {
				Dimension dimension = (Dimension)theEObject;
				T result = caseDimension(dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.DIMENSION_ATTRIBUTE: {
				DimensionAttribute dimensionAttribute = (DimensionAttribute)theEObject;
				T result = caseDimensionAttribute(dimensionAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.DIMENSION_BINDING: {
				DimensionBinding dimensionBinding = (DimensionBinding)theEObject;
				T result = caseDimensionBinding(dimensionBinding);
				if (result == null) result = caseBinding(dimensionBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.DIMENSION_PERMISSION: {
				DimensionPermission dimensionPermission = (DimensionPermission)theEObject;
				T result = caseDimensionPermission(dimensionPermission);
				if (result == null) result = casePermission(dimensionPermission);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.DIMENSION_PERMISSIONS_TYPE: {
				DimensionPermissionsType dimensionPermissionsType = (DimensionPermissionsType)theEObject;
				T result = caseDimensionPermissionsType(dimensionPermissionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.DIMENSION_PERMISSIONS_TYPE1: {
				DimensionPermissionsType1 dimensionPermissionsType1 = (DimensionPermissionsType1)theEObject;
				T result = caseDimensionPermissionsType1(dimensionPermissionsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.DIMENSIONS_TYPE: {
				DimensionsType dimensionsType = (DimensionsType)theEObject;
				T result = caseDimensionsType(dimensionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.DISCOVER_RESPONSE_TYPE: {
				DiscoverResponseType discoverResponseType = (DiscoverResponseType)theEObject;
				T result = caseDiscoverResponseType(discoverResponseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.DISCOVER_TYPE: {
				DiscoverType discoverType = (DiscoverType)theEObject;
				T result = caseDiscoverType(discoverType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.DRILL_THROUGH_ACTION: {
				DrillThroughAction drillThroughAction = (DrillThroughAction)theEObject;
				T result = caseDrillThroughAction(drillThroughAction);
				if (result == null) result = caseAction(drillThroughAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.DROP: {
				Drop drop = (Drop)theEObject;
				T result = caseDrop(drop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.DSV_TABLE_BINDING: {
				DSVTableBinding dsvTableBinding = (DSVTableBinding)theEObject;
				T result = caseDSVTableBinding(dsvTableBinding);
				if (result == null) result = caseTabularBinding(dsvTableBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.END_OF_DATA_TYPE: {
				EndOfDataType endOfDataType = (EndOfDataType)theEObject;
				T result = caseEndOfDataType(endOfDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.END_SESSION_TYPE: {
				EndSessionType endSessionType = (EndSessionType)theEObject;
				T result = caseEndSessionType(endSessionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ERROR_CONFIGURATION: {
				ErrorConfiguration errorConfiguration = (ErrorConfiguration)theEObject;
				T result = caseErrorConfiguration(errorConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.EVENT_CATEGORY_TYPE: {
				EventCategoryType eventCategoryType = (EventCategoryType)theEObject;
				T result = caseEventCategoryType(eventCategoryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.EVENT_COLUMN: {
				EventColumn eventColumn = (EventColumn)theEObject;
				T result = caseEventColumn(eventColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.EVENT_COLUMN_ID: {
				EventColumnID eventColumnID = (EventColumnID)theEObject;
				T result = caseEventColumnID(eventColumnID);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.EVENT_COLUMN_LIST_TYPE: {
				EventColumnListType eventColumnListType = (EventColumnListType)theEObject;
				T result = caseEventColumnListType(eventColumnListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.EVENT_COLUMN_SUBCLASS_LIST_TYPE: {
				EventColumnSubclassListType eventColumnSubclassListType = (EventColumnSubclassListType)theEObject;
				T result = caseEventColumnSubclassListType(eventColumnSubclassListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.EVENT_COLUMN_SUBCLASS_TYPE: {
				EventColumnSubclassType eventColumnSubclassType = (EventColumnSubclassType)theEObject;
				T result = caseEventColumnSubclassType(eventColumnSubclassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.EVENT_LIST_TYPE: {
				EventListType eventListType = (EventListType)theEObject;
				T result = caseEventListType(eventListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.EVENT_SESSION_TYPE: {
				EventSessionType eventSessionType = (EventSessionType)theEObject;
				T result = caseEventSessionType(eventSessionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.EVENTS_TYPE: {
				EventsType eventsType = (EventsType)theEObject;
				T result = caseEventsType(eventsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.EVENT_TYPE: {
				EventType eventType = (EventType)theEObject;
				T result = caseEventType(eventType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.EVENT_TYPE1: {
				EventType1 eventType1 = (EventType1)theEObject;
				T result = caseEventType1(eventType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.EVENT_TYPE_TYPE: {
				EventTypeType eventTypeType = (EventTypeType)theEObject;
				T result = caseEventTypeType(eventTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.EXECUTE_PARAMETER: {
				ExecuteParameter executeParameter = (ExecuteParameter)theEObject;
				T result = caseExecuteParameter(executeParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.EXECUTE_RESPONSE_TYPE: {
				ExecuteResponseType executeResponseType = (ExecuteResponseType)theEObject;
				T result = caseExecuteResponseType(executeResponseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.EXECUTE_TYPE: {
				ExecuteType executeType = (ExecuteType)theEObject;
				T result = caseExecuteType(executeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.FILES_TYPE: {
				FilesType filesType = (FilesType)theEObject;
				T result = caseFilesType(filesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.FOLDER: {
				Folder folder = (Folder)theEObject;
				T result = caseFolder(folder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.FOLDING_PARAMETERS: {
				FoldingParameters foldingParameters = (FoldingParameters)theEObject;
				T result = caseFoldingParameters(foldingParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.FOREIGN_KEY_COLUMNS_TYPE: {
				ForeignKeyColumnsType foreignKeyColumnsType = (ForeignKeyColumnsType)theEObject;
				T result = caseForeignKeyColumnsType(foreignKeyColumnsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.FOREIGN_KEY_COLUMNS_TYPE1: {
				ForeignKeyColumnsType1 foreignKeyColumnsType1 = (ForeignKeyColumnsType1)theEObject;
				T result = caseForeignKeyColumnsType1(foreignKeyColumnsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.FOREIGN_KEY_COLUMN_TYPE: {
				ForeignKeyColumnType foreignKeyColumnType = (ForeignKeyColumnType)theEObject;
				T result = caseForeignKeyColumnType(foreignKeyColumnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.GLOBAL_TYPE: {
				GlobalType globalType = (GlobalType)theEObject;
				T result = caseGlobalType(globalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.GROUP: {
				Group group = (Group)theEObject;
				T result = caseGroup(group);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.GROUPS_TYPE: {
				GroupsType groupsType = (GroupsType)theEObject;
				T result = caseGroupsType(groupsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.HIERARCHIES_TYPE: {
				HierarchiesType hierarchiesType = (HierarchiesType)theEObject;
				T result = caseHierarchiesType(hierarchiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.HIERARCHIES_TYPE1: {
				HierarchiesType1 hierarchiesType1 = (HierarchiesType1)theEObject;
				T result = caseHierarchiesType1(hierarchiesType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.HIERARCHIES_TYPE2: {
				HierarchiesType2 hierarchiesType2 = (HierarchiesType2)theEObject;
				T result = caseHierarchiesType2(hierarchiesType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.HIERARCHY: {
				Hierarchy hierarchy = (Hierarchy)theEObject;
				T result = caseHierarchy(hierarchy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.IMAGE_LOAD: {
				ImageLoad imageLoad = (ImageLoad)theEObject;
				T result = caseImageLoad(imageLoad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.IMAGE_SAVE: {
				ImageSave imageSave = (ImageSave)theEObject;
				T result = caseImageSave(imageSave);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.INCREMENTAL_PROCESSING_NOTIFICATION: {
				IncrementalProcessingNotification incrementalProcessingNotification = (IncrementalProcessingNotification)theEObject;
				T result = caseIncrementalProcessingNotification(incrementalProcessingNotification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.INCREMENTAL_PROCESSING_NOTIFICATIONS_TYPE: {
				IncrementalProcessingNotificationsType incrementalProcessingNotificationsType = (IncrementalProcessingNotificationsType)theEObject;
				T result = caseIncrementalProcessingNotificationsType(incrementalProcessingNotificationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.INHERITED_BINDING: {
				InheritedBinding inheritedBinding = (InheritedBinding)theEObject;
				T result = caseInheritedBinding(inheritedBinding);
				if (result == null) result = caseBinding(inheritedBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.INSERT: {
				Insert insert = (Insert)theEObject;
				T result = caseInsert(insert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.KEEP_RESULT_TYPE: {
				KeepResultType keepResultType = (KeepResultType)theEObject;
				T result = caseKeepResultType(keepResultType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.KEY_COLUMNS_TYPE: {
				KeyColumnsType keyColumnsType = (KeyColumnsType)theEObject;
				T result = caseKeyColumnsType(keyColumnsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.KEY_COLUMNS_TYPE1: {
				KeyColumnsType1 keyColumnsType1 = (KeyColumnsType1)theEObject;
				T result = caseKeyColumnsType1(keyColumnsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.KEY_COLUMNS_TYPE2: {
				KeyColumnsType2 keyColumnsType2 = (KeyColumnsType2)theEObject;
				T result = caseKeyColumnsType2(keyColumnsType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.KEY_COLUMNS_TYPE3: {
				KeyColumnsType3 keyColumnsType3 = (KeyColumnsType3)theEObject;
				T result = caseKeyColumnsType3(keyColumnsType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.KEY_COLUMNS_TYPE4: {
				KeyColumnsType4 keyColumnsType4 = (KeyColumnsType4)theEObject;
				T result = caseKeyColumnsType4(keyColumnsType4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.KEY_COLUMN_TYPE: {
				KeyColumnType keyColumnType = (KeyColumnType)theEObject;
				T result = caseKeyColumnType(keyColumnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.KEYS_TYPE: {
				KeysType keysType = (KeysType)theEObject;
				T result = caseKeysType(keysType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.KEYS_TYPE1: {
				KeysType1 keysType1 = (KeysType1)theEObject;
				T result = caseKeysType1(keysType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.KPI: {
				Kpi kpi = (Kpi)theEObject;
				T result = caseKpi(kpi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.KPIS_TYPE: {
				KpisType kpisType = (KpisType)theEObject;
				T result = caseKpisType(kpisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.KPIS_TYPE1: {
				KpisType1 kpisType1 = (KpisType1)theEObject;
				T result = caseKpisType1(kpisType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.LEVEL: {
				Level level = (Level)theEObject;
				T result = caseLevel(level);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.LEVELS_TYPE: {
				LevelsType levelsType = (LevelsType)theEObject;
				T result = caseLevelsType(levelsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.LOCATION: {
				Location location = (Location)theEObject;
				T result = caseLocation(location);
				if (result == null) result = caseLocationBackup(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.LOCATION_BACKUP: {
				LocationBackup locationBackup = (LocationBackup)theEObject;
				T result = caseLocationBackup(locationBackup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.LOCATIONS_TYPE: {
				LocationsType locationsType = (LocationsType)theEObject;
				T result = caseLocationsType(locationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.LOCATIONS_TYPE1: {
				LocationsType1 locationsType1 = (LocationsType1)theEObject;
				T result = caseLocationsType1(locationsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.LOCATIONS_TYPE2: {
				LocationsType2 locationsType2 = (LocationsType2)theEObject;
				T result = caseLocationsType2(locationsType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.LOCK: {
				Lock lock = (Lock)theEObject;
				T result = caseLock(lock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.MAJOR_OBJECT: {
				MajorObject majorObject = (MajorObject)theEObject;
				T result = caseMajorObject(majorObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.MANY_TO_MANY_MEASURE_GROUP_DIMENSION: {
				ManyToManyMeasureGroupDimension manyToManyMeasureGroupDimension = (ManyToManyMeasureGroupDimension)theEObject;
				T result = caseManyToManyMeasureGroupDimension(manyToManyMeasureGroupDimension);
				if (result == null) result = caseMeasureGroupDimension(manyToManyMeasureGroupDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.MDX_SCRIPT: {
				MdxScript mdxScript = (MdxScript)theEObject;
				T result = caseMdxScript(mdxScript);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.MDX_SCRIPTS_TYPE: {
				MdxScriptsType mdxScriptsType = (MdxScriptsType)theEObject;
				T result = caseMdxScriptsType(mdxScriptsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.MEASURE: {
				Measure measure = (Measure)theEObject;
				T result = caseMeasure(measure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.MEASURE_BINDING: {
				MeasureBinding measureBinding = (MeasureBinding)theEObject;
				T result = caseMeasureBinding(measureBinding);
				if (result == null) result = caseBinding(measureBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.MEASURE_GROUP: {
				MeasureGroup measureGroup = (MeasureGroup)theEObject;
				T result = caseMeasureGroup(measureGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.MEASURE_GROUP_ATTRIBUTE: {
				MeasureGroupAttribute measureGroupAttribute = (MeasureGroupAttribute)theEObject;
				T result = caseMeasureGroupAttribute(measureGroupAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.MEASURE_GROUP_BINDING: {
				MeasureGroupBinding measureGroupBinding = (MeasureGroupBinding)theEObject;
				T result = caseMeasureGroupBinding(measureGroupBinding);
				if (result == null) result = caseBinding(measureGroupBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.MEASURE_GROUP_DIMENSION: {
				MeasureGroupDimension measureGroupDimension = (MeasureGroupDimension)theEObject;
				T result = caseMeasureGroupDimension(measureGroupDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.MEASURE_GROUP_DIMENSION_BINDING: {
				MeasureGroupDimensionBinding measureGroupDimensionBinding = (MeasureGroupDimensionBinding)theEObject;
				T result = caseMeasureGroupDimensionBinding(measureGroupDimensionBinding);
				if (result == null) result = caseBinding(measureGroupDimensionBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.MEASURE_GROUPS_TYPE: {
				MeasureGroupsType measureGroupsType = (MeasureGroupsType)theEObject;
				T result = caseMeasureGroupsType(measureGroupsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.MEASURE_GROUPS_TYPE1: {
				MeasureGroupsType1 measureGroupsType1 = (MeasureGroupsType1)theEObject;
				T result = caseMeasureGroupsType1(measureGroupsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.MEASURES_TYPE: {
				MeasuresType measuresType = (MeasuresType)theEObject;
				T result = caseMeasuresType(measuresType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.MEASURES_TYPE1: {
				MeasuresType1 measuresType1 = (MeasuresType1)theEObject;
				T result = caseMeasuresType1(measuresType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.MEASURES_TYPE2: {
				MeasuresType2 measuresType2 = (MeasuresType2)theEObject;
				T result = caseMeasuresType2(measuresType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.MEMBER: {
				Member member = (Member)theEObject;
				T result = caseMember(member);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.MEMBERS_TYPE: {
				MembersType membersType = (MembersType)theEObject;
				T result = caseMembersType(membersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.MEMBERS_TYPE1: {
				MembersType1 membersType1 = (MembersType1)theEObject;
				T result = caseMembersType1(membersType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.MERGE_PARTITIONS: {
				MergePartitions mergePartitions = (MergePartitions)theEObject;
				T result = caseMergePartitions(mergePartitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.MINING_MODEL: {
				MiningModel miningModel = (MiningModel)theEObject;
				T result = caseMiningModel(miningModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.MINING_MODEL_COLUMN: {
				MiningModelColumn miningModelColumn = (MiningModelColumn)theEObject;
				T result = caseMiningModelColumn(miningModelColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.MINING_MODELING_FLAG: {
				MiningModelingFlag miningModelingFlag = (MiningModelingFlag)theEObject;
				T result = caseMiningModelingFlag(miningModelingFlag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.MINING_MODEL_PERMISSION: {
				MiningModelPermission miningModelPermission = (MiningModelPermission)theEObject;
				T result = caseMiningModelPermission(miningModelPermission);
				if (result == null) result = casePermission(miningModelPermission);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.MINING_MODEL_PERMISSIONS_TYPE: {
				MiningModelPermissionsType miningModelPermissionsType = (MiningModelPermissionsType)theEObject;
				T result = caseMiningModelPermissionsType(miningModelPermissionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.MINING_MODELS_TYPE: {
				MiningModelsType miningModelsType = (MiningModelsType)theEObject;
				T result = caseMiningModelsType(miningModelsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.MINING_STRUCTURE: {
				MiningStructure miningStructure = (MiningStructure)theEObject;
				T result = caseMiningStructure(miningStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.MINING_STRUCTURE_COLUMN: {
				MiningStructureColumn miningStructureColumn = (MiningStructureColumn)theEObject;
				T result = caseMiningStructureColumn(miningStructureColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.MINING_STRUCTURE_PERMISSION: {
				MiningStructurePermission miningStructurePermission = (MiningStructurePermission)theEObject;
				T result = caseMiningStructurePermission(miningStructurePermission);
				if (result == null) result = casePermission(miningStructurePermission);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.MINING_STRUCTURE_PERMISSIONS_TYPE: {
				MiningStructurePermissionsType miningStructurePermissionsType = (MiningStructurePermissionsType)theEObject;
				T result = caseMiningStructurePermissionsType(miningStructurePermissionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.MINING_STRUCTURES_TYPE: {
				MiningStructuresType miningStructuresType = (MiningStructuresType)theEObject;
				T result = caseMiningStructuresType(miningStructuresType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.MODELING_FLAGS_TYPE: {
				ModelingFlagsType modelingFlagsType = (ModelingFlagsType)theEObject;
				T result = caseModelingFlagsType(modelingFlagsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.MODELING_FLAGS_TYPE1: {
				ModelingFlagsType1 modelingFlagsType1 = (ModelingFlagsType1)theEObject;
				T result = caseModelingFlagsType1(modelingFlagsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.NAME_COLUMN_TYPE: {
				NameColumnType nameColumnType = (NameColumnType)theEObject;
				T result = caseNameColumnType(nameColumnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.NAMING_TEMPLATE_TRANSLATIONS_TYPE: {
				NamingTemplateTranslationsType namingTemplateTranslationsType = (NamingTemplateTranslationsType)theEObject;
				T result = caseNamingTemplateTranslationsType(namingTemplateTranslationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.NOTIFY_TABLE_CHANGE: {
				NotifyTableChange notifyTableChange = (NotifyTableChange)theEObject;
				T result = caseNotifyTableChange(notifyTableChange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.NOT_TYPE: {
				NotType notType = (NotType)theEObject;
				T result = caseNotType(notType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.OBJECT: {
				org.eclipse.daanse.xmla.model.ecore.xmla.Object object = (org.eclipse.daanse.xmla.model.ecore.xmla.Object)theEObject;
				T result = caseObject(object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.OBJECT_REFERENCE: {
				ObjectReference objectReference = (ObjectReference)theEObject;
				T result = caseObjectReference(objectReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.OBJECT_TYPE: {
				ObjectType objectType = (ObjectType)theEObject;
				T result = caseObjectType(objectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.OLAP_DATA_SOURCE: {
				OlapDataSource olapDataSource = (OlapDataSource)theEObject;
				T result = caseOlapDataSource(olapDataSource);
				if (result == null) result = caseDataSource(olapDataSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ORDINAL_TYPE: {
				OrdinalType ordinalType = (OrdinalType)theEObject;
				T result = caseOrdinalType(ordinalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.OUT_OF_LINE_BINDING: {
				OutOfLineBinding outOfLineBinding = (OutOfLineBinding)theEObject;
				T result = caseOutOfLineBinding(outOfLineBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.PARALLEL_TYPE: {
				ParallelType parallelType = (ParallelType)theEObject;
				T result = caseParallelType(parallelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.PARAMETERS: {
				Parameters parameters = (Parameters)theEObject;
				T result = caseParameters(parameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.PARAMETERS_TYPE: {
				ParametersType parametersType = (ParametersType)theEObject;
				T result = caseParametersType(parametersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.PARAMETER_TYPE2: {
				ParameterType2 parameterType2 = (ParameterType2)theEObject;
				T result = caseParameterType2(parameterType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.PARTITION: {
				Partition partition = (Partition)theEObject;
				T result = casePartition(partition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.PARTITIONS_TYPE: {
				PartitionsType partitionsType = (PartitionsType)theEObject;
				T result = casePartitionsType(partitionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.PERMISSION: {
				Permission permission = (Permission)theEObject;
				T result = casePermission(permission);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.PERSPECTIVE: {
				Perspective perspective = (Perspective)theEObject;
				T result = casePerspective(perspective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.PERSPECTIVE_ACTION: {
				PerspectiveAction perspectiveAction = (PerspectiveAction)theEObject;
				T result = casePerspectiveAction(perspectiveAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.PERSPECTIVE_ATTRIBUTE: {
				PerspectiveAttribute perspectiveAttribute = (PerspectiveAttribute)theEObject;
				T result = casePerspectiveAttribute(perspectiveAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.PERSPECTIVE_CALCULATION: {
				PerspectiveCalculation perspectiveCalculation = (PerspectiveCalculation)theEObject;
				T result = casePerspectiveCalculation(perspectiveCalculation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.PERSPECTIVE_DIMENSION: {
				PerspectiveDimension perspectiveDimension = (PerspectiveDimension)theEObject;
				T result = casePerspectiveDimension(perspectiveDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.PERSPECTIVE_HIERARCHY: {
				PerspectiveHierarchy perspectiveHierarchy = (PerspectiveHierarchy)theEObject;
				T result = casePerspectiveHierarchy(perspectiveHierarchy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.PERSPECTIVE_KPI: {
				PerspectiveKpi perspectiveKpi = (PerspectiveKpi)theEObject;
				T result = casePerspectiveKpi(perspectiveKpi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.PERSPECTIVE_MEASURE: {
				PerspectiveMeasure perspectiveMeasure = (PerspectiveMeasure)theEObject;
				T result = casePerspectiveMeasure(perspectiveMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.PERSPECTIVE_MEASURE_GROUP: {
				PerspectiveMeasureGroup perspectiveMeasureGroup = (PerspectiveMeasureGroup)theEObject;
				T result = casePerspectiveMeasureGroup(perspectiveMeasureGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.PERSPECTIVES_TYPE: {
				PerspectivesType perspectivesType = (PerspectivesType)theEObject;
				T result = casePerspectivesType(perspectivesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.PRED_LEAF: {
				PredLeaf predLeaf = (PredLeaf)theEObject;
				T result = casePredLeaf(predLeaf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.PROACTIVE_CACHING: {
				ProactiveCaching proactiveCaching = (ProactiveCaching)theEObject;
				T result = caseProactiveCaching(proactiveCaching);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.PROACTIVE_CACHING_BINDING: {
				ProactiveCachingBinding proactiveCachingBinding = (ProactiveCachingBinding)theEObject;
				T result = caseProactiveCachingBinding(proactiveCachingBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.PROACTIVE_CACHING_INCREMENTAL_PROCESSING_BINDING: {
				ProactiveCachingIncrementalProcessingBinding proactiveCachingIncrementalProcessingBinding = (ProactiveCachingIncrementalProcessingBinding)theEObject;
				T result = caseProactiveCachingIncrementalProcessingBinding(proactiveCachingIncrementalProcessingBinding);
				if (result == null) result = caseProactiveCachingBinding(proactiveCachingIncrementalProcessingBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.PROACTIVE_CACHING_INHERITED_BINDING: {
				ProactiveCachingInheritedBinding proactiveCachingInheritedBinding = (ProactiveCachingInheritedBinding)theEObject;
				T result = caseProactiveCachingInheritedBinding(proactiveCachingInheritedBinding);
				if (result == null) result = caseProactiveCachingObjectNotificationBinding(proactiveCachingInheritedBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.PROACTIVE_CACHING_OBJECT_NOTIFICATION_BINDING: {
				ProactiveCachingObjectNotificationBinding proactiveCachingObjectNotificationBinding = (ProactiveCachingObjectNotificationBinding)theEObject;
				T result = caseProactiveCachingObjectNotificationBinding(proactiveCachingObjectNotificationBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.PROACTIVE_CACHING_QUERY_BINDING: {
				ProactiveCachingQueryBinding proactiveCachingQueryBinding = (ProactiveCachingQueryBinding)theEObject;
				T result = caseProactiveCachingQueryBinding(proactiveCachingQueryBinding);
				if (result == null) result = caseProactiveCachingBinding(proactiveCachingQueryBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.PROACTIVE_CACHING_TABLES_BINDING: {
				ProactiveCachingTablesBinding proactiveCachingTablesBinding = (ProactiveCachingTablesBinding)theEObject;
				T result = caseProactiveCachingTablesBinding(proactiveCachingTablesBinding);
				if (result == null) result = caseProactiveCachingObjectNotificationBinding(proactiveCachingTablesBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.PROCESS: {
				org.eclipse.daanse.xmla.model.ecore.xmla.Process process = (org.eclipse.daanse.xmla.model.ecore.xmla.Process)theEObject;
				T result = caseProcess(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.PROPERTIES: {
				Properties properties = (Properties)theEObject;
				T result = caseProperties(properties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.PROPERTIES_TYPE: {
				PropertiesType propertiesType = (PropertiesType)theEObject;
				T result = casePropertiesType(propertiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.PROPERTY_LIST: {
				PropertyList propertyList = (PropertyList)theEObject;
				T result = casePropertyList(propertyList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.PUSHED_DATA_SOURCE: {
				PushedDataSource pushedDataSource = (PushedDataSource)theEObject;
				T result = casePushedDataSource(pushedDataSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.QUERIES_TYPE: {
				QueriesType queriesType = (QueriesType)theEObject;
				T result = caseQueriesType(queriesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.QUERY_BINDING: {
				QueryBinding queryBinding = (QueryBinding)theEObject;
				T result = caseQueryBinding(queryBinding);
				if (result == null) result = caseTabularBinding(queryBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.QUERY_NOTIFICATION: {
				QueryNotification queryNotification = (QueryNotification)theEObject;
				T result = caseQueryNotification(queryNotification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.QUERY_NOTIFICATIONS_TYPE: {
				QueryNotificationsType queryNotificationsType = (QueryNotificationsType)theEObject;
				T result = caseQueryNotificationsType(queryNotificationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION: {
				ReferenceMeasureGroupDimension referenceMeasureGroupDimension = (ReferenceMeasureGroupDimension)theEObject;
				T result = caseReferenceMeasureGroupDimension(referenceMeasureGroupDimension);
				if (result == null) result = caseMeasureGroupDimension(referenceMeasureGroupDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION: {
				RegularMeasureGroupDimension regularMeasureGroupDimension = (RegularMeasureGroupDimension)theEObject;
				T result = caseRegularMeasureGroupDimension(regularMeasureGroupDimension);
				if (result == null) result = caseMeasureGroupDimension(regularMeasureGroupDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.RELATIONAL_DATA_SOURCE: {
				RelationalDataSource relationalDataSource = (RelationalDataSource)theEObject;
				T result = caseRelationalDataSource(relationalDataSource);
				if (result == null) result = caseDataSource(relationalDataSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.REPORT_ACTION: {
				ReportAction reportAction = (ReportAction)theEObject;
				T result = caseReportAction(reportAction);
				if (result == null) result = caseAction(reportAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.REPORT_FORMAT_PARAMETER: {
				ReportFormatParameter reportFormatParameter = (ReportFormatParameter)theEObject;
				T result = caseReportFormatParameter(reportFormatParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.REPORT_FORMAT_PARAMETERS_TYPE: {
				ReportFormatParametersType reportFormatParametersType = (ReportFormatParametersType)theEObject;
				T result = caseReportFormatParametersType(reportFormatParametersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.REPORT_PARAMETER: {
				ReportParameter reportParameter = (ReportParameter)theEObject;
				T result = caseReportParameter(reportParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.REPORT_PARAMETERS_TYPE: {
				ReportParametersType reportParametersType = (ReportParametersType)theEObject;
				T result = caseReportParametersType(reportParametersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.RESTORE: {
				Restore restore = (Restore)theEObject;
				T result = caseRestore(restore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.RESTRICTION_LIST_TYPE: {
				RestrictionListType restrictionListType = (RestrictionListType)theEObject;
				T result = caseRestrictionListType(restrictionListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.RESTRICTIONS_TYPE: {
				RestrictionsType restrictionsType = (RestrictionsType)theEObject;
				T result = caseRestrictionsType(restrictionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.RESULT_TYPE: {
				ResultType resultType = (ResultType)theEObject;
				T result = caseResultType(resultType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.RETURN: {
				Return return_ = (Return)theEObject;
				T result = caseReturn(return_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.RETURN_TYPE: {
				ReturnType returnType = (ReturnType)theEObject;
				T result = caseReturnType(returnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ROLES_TYPE: {
				RolesType rolesType = (RolesType)theEObject;
				T result = caseRolesType(rolesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ROLES_TYPE1: {
				RolesType1 rolesType1 = (RolesType1)theEObject;
				T result = caseRolesType1(rolesType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ROLLBACK_TRANSACTION: {
				RollbackTransaction rollbackTransaction = (RollbackTransaction)theEObject;
				T result = caseRollbackTransaction(rollbackTransaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ROOT_TYPE: {
				RootType rootType = (RootType)theEObject;
				T result = caseRootType(rootType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.ROW_BINDING: {
				RowBinding rowBinding = (RowBinding)theEObject;
				T result = caseRowBinding(rowBinding);
				if (result == null) result = caseBinding(rowBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN: {
				ScalarMiningStructureColumn scalarMiningStructureColumn = (ScalarMiningStructureColumn)theEObject;
				T result = caseScalarMiningStructureColumn(scalarMiningStructureColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.SERVER: {
				Server server = (Server)theEObject;
				T result = caseServer(server);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.SERVER_PROPERTIES_TYPE: {
				ServerPropertiesType serverPropertiesType = (ServerPropertiesType)theEObject;
				T result = caseServerPropertiesType(serverPropertiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.SERVER_PROPERTY: {
				ServerProperty serverProperty = (ServerProperty)theEObject;
				T result = caseServerProperty(serverProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.SESSION_TYPE: {
				SessionType sessionType = (SessionType)theEObject;
				T result = caseSessionType(sessionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.SET_AUTH_CONTEXT: {
				SetAuthContext setAuthContext = (SetAuthContext)theEObject;
				T result = caseSetAuthContext(setAuthContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.SKIPPED_LEVELS_COLUMN_TYPE: {
				SkippedLevelsColumnType skippedLevelsColumnType = (SkippedLevelsColumnType)theEObject;
				T result = caseSkippedLevelsColumnType(skippedLevelsColumnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.SOURCE: {
				Source source = (Source)theEObject;
				T result = caseSource(source);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.SOURCES_TYPE: {
				SourcesType sourcesType = (SourcesType)theEObject;
				T result = caseSourcesType(sourcesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.STANDARD_ACTION: {
				StandardAction standardAction = (StandardAction)theEObject;
				T result = caseStandardAction(standardAction);
				if (result == null) result = caseAction(standardAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.STATEMENT: {
				Statement statement = (Statement)theEObject;
				T result = caseStatement(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.STORAGE_MODE_TYPE: {
				StorageModeType storageModeType = (StorageModeType)theEObject;
				T result = caseStorageModeType(storageModeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.STORAGE_MODE_TYPE2: {
				StorageModeType2 storageModeType2 = (StorageModeType2)theEObject;
				T result = caseStorageModeType2(storageModeType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.STORAGE_MODE_TYPE3: {
				StorageModeType3 storageModeType3 = (StorageModeType3)theEObject;
				T result = caseStorageModeType3(storageModeType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.SUBSCRIBE: {
				Subscribe subscribe = (Subscribe)theEObject;
				T result = caseSubscribe(subscribe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.SYNCHRONIZE: {
				Synchronize synchronize = (Synchronize)theEObject;
				T result = caseSynchronize(synchronize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.TABLE_BINDING: {
				TableBinding tableBinding = (TableBinding)theEObject;
				T result = caseTableBinding(tableBinding);
				if (result == null) result = caseTabularBinding(tableBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN: {
				TableMiningStructureColumn tableMiningStructureColumn = (TableMiningStructureColumn)theEObject;
				T result = caseTableMiningStructureColumn(tableMiningStructureColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.TABLE_NOTIFICATION: {
				TableNotification tableNotification = (TableNotification)theEObject;
				T result = caseTableNotification(tableNotification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.TABLE_NOTIFICATIONS_TYPE: {
				TableNotificationsType tableNotificationsType = (TableNotificationsType)theEObject;
				T result = caseTableNotificationsType(tableNotificationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.TABLE_NOTIFICATIONS_TYPE1: {
				TableNotificationsType1 tableNotificationsType1 = (TableNotificationsType1)theEObject;
				T result = caseTableNotificationsType1(tableNotificationsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.TABULAR_BINDING: {
				TabularBinding tabularBinding = (TabularBinding)theEObject;
				T result = caseTabularBinding(tabularBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.TARGET_TYPE: {
				TargetType targetType = (TargetType)theEObject;
				T result = caseTargetType(targetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.TARGET_TYPE1: {
				TargetType1 targetType1 = (TargetType1)theEObject;
				T result = caseTargetType1(targetType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.TIME_ATTRIBUTE_BINDING: {
				TimeAttributeBinding timeAttributeBinding = (TimeAttributeBinding)theEObject;
				T result = caseTimeAttributeBinding(timeAttributeBinding);
				if (result == null) result = caseBinding(timeAttributeBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.TIME_BINDING: {
				TimeBinding timeBinding = (TimeBinding)theEObject;
				T result = caseTimeBinding(timeBinding);
				if (result == null) result = caseBinding(timeBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.TRACE: {
				Trace trace = (Trace)theEObject;
				T result = caseTrace(trace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.TRACE_COLUMNS: {
				TraceColumns traceColumns = (TraceColumns)theEObject;
				T result = caseTraceColumns(traceColumns);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.TRACE_DEFINITION_PROVIDER_INFO: {
				TraceDefinitionProviderInfo traceDefinitionProviderInfo = (TraceDefinitionProviderInfo)theEObject;
				T result = caseTraceDefinitionProviderInfo(traceDefinitionProviderInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.TRACE_EVENT: {
				TraceEvent traceEvent = (TraceEvent)theEObject;
				T result = caseTraceEvent(traceEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.TRACE_EVENT_CATEGORIES: {
				TraceEventCategories traceEventCategories = (TraceEventCategories)theEObject;
				T result = caseTraceEventCategories(traceEventCategories);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.TRACE_FILTER: {
				TraceFilter traceFilter = (TraceFilter)theEObject;
				T result = caseTraceFilter(traceFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.TRACES_TYPE: {
				TracesType tracesType = (TracesType)theEObject;
				T result = caseTracesType(tracesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.TRANSLATION: {
				Translation translation = (Translation)theEObject;
				T result = caseTranslation(translation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.TRANSLATION_INSERT_UPDATE: {
				TranslationInsertUpdate translationInsertUpdate = (TranslationInsertUpdate)theEObject;
				T result = caseTranslationInsertUpdate(translationInsertUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.TRANSLATIONS_TYPE: {
				TranslationsType translationsType = (TranslationsType)theEObject;
				T result = caseTranslationsType(translationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.TRANSLATION_TYPE: {
				TranslationType translationType = (TranslationType)theEObject;
				T result = caseTranslationType(translationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.TYPE_TYPE6: {
				TypeType6 typeType6 = (TypeType6)theEObject;
				T result = caseTypeType6(typeType6);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.UNARY_EXPR: {
				UnaryExpr unaryExpr = (UnaryExpr)theEObject;
				T result = caseUnaryExpr(unaryExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.UNARY_OPERATOR_COLUMN_TYPE: {
				UnaryOperatorColumnType unaryOperatorColumnType = (UnaryOperatorColumnType)theEObject;
				T result = caseUnaryOperatorColumnType(unaryOperatorColumnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.UNKNOWN_MEMBER_TRANSLATIONS_TYPE: {
				UnknownMemberTranslationsType unknownMemberTranslationsType = (UnknownMemberTranslationsType)theEObject;
				T result = caseUnknownMemberTranslationsType(unknownMemberTranslationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.UNKNOWN_MEMBER_TYPE: {
				UnknownMemberType unknownMemberType = (UnknownMemberType)theEObject;
				T result = caseUnknownMemberType(unknownMemberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.UNLOCK: {
				Unlock unlock = (Unlock)theEObject;
				T result = caseUnlock(unlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.UNSUBSCRIBE: {
				Unsubscribe unsubscribe = (Unsubscribe)theEObject;
				T result = caseUnsubscribe(unsubscribe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.UPDATE: {
				Update update = (Update)theEObject;
				T result = caseUpdate(update);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.UPDATE_CELLS: {
				UpdateCells updateCells = (UpdateCells)theEObject;
				T result = caseUpdateCells(updateCells);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.USER_DEFINED_GROUP_BINDING: {
				UserDefinedGroupBinding userDefinedGroupBinding = (UserDefinedGroupBinding)theEObject;
				T result = caseUserDefinedGroupBinding(userDefinedGroupBinding);
				if (result == null) result = caseBinding(userDefinedGroupBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.VALUE_COLUMN_TYPE: {
				ValueColumnType valueColumnType = (ValueColumnType)theEObject;
				T result = caseValueColumnType(valueColumnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.VERSION_TYPE: {
				VersionType versionType = (VersionType)theEObject;
				T result = caseVersionType(versionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.WHERE: {
				Where where = (Where)theEObject;
				T result = caseWhere(where);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlaPackage.WHERE_ATTRIBUTE: {
				WhereAttribute whereAttribute = (WhereAttribute)theEObject;
				T result = caseWhereAttribute(whereAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccount(Account object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accounts Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accounts Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccountsType(AccountsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionsType(ActionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actions Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actions Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionsType1(ActionsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionType(ActionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregation(Aggregation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregationAttribute(AggregationAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation Design</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation Design</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregationDesign(AggregationDesign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation Design Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation Design Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregationDesignAttribute(AggregationDesignAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation Design Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation Design Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregationDesignDimension(AggregationDesignDimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation Designs Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation Designs Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregationDesignsType(AggregationDesignsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregationDimension(AggregationDimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregationInstance(AggregationInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation Instance Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation Instance Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregationInstanceAttribute(AggregationInstanceAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation Instance Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation Instance Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregationInstanceDimension(AggregationInstanceDimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation Instance Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation Instance Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregationInstanceMeasure(AggregationInstanceMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation Instances Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation Instances Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregationInstancesType(AggregationInstancesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregationsType(AggregationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Algorithm Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Algorithm Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlgorithmParameter(AlgorithmParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Algorithm Parameters Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Algorithm Parameters Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlgorithmParametersType(AlgorithmParametersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aliases Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aliases Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAliasesType(AliasesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Member Translations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Member Translations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllMemberTranslationsType(AllMemberTranslationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlter(Alter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Or Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Or Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndOrType(AndOrType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationsType(AnnotationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assemblies Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assemblies Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssembliesType(AssembliesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assemblies Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assemblies Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssembliesType1(AssembliesType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssembly(Assembly object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attach</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attach</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttach(Attach object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute All Member Translations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute All Member Translations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeAllMemberTranslationsType(AttributeAllMemberTranslationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeBinding(AttributeBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Insert Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Insert Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeInsertUpdate(AttributeInsertUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Permission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Permission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributePermission(AttributePermission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Permissions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Permissions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributePermissionsType(AttributePermissionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Permissions Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Permissions Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributePermissionsType1(AttributePermissionsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeRelationship(AttributeRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Relationships Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Relationships Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeRelationshipsType(AttributeRelationshipsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attributes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attributes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributesType(AttributesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attributes Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attributes Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributesType1(AttributesType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attributes Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attributes Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributesType2(AttributesType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attributes Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attributes Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributesType3(AttributesType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attributes Type4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attributes Type4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributesType4(AttributesType4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attributes Type5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attributes Type5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributesType5(AttributesType5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attributes Type6</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attributes Type6</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributesType6(AttributesType6 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attributes Type7</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attributes Type7</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributesType7(AttributesType7 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attributes Type8</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attributes Type8</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributesType8(AttributesType8 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Translation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Translation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeTranslation(AttributeTranslation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Backup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Backup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackup(Backup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Batch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Batch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBatch(Batch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Begin Session Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Begin Session Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeginSessionType(BeginSessionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Begin Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Begin Transaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeginTransaction(BeginTransaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinding(Binding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bindings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bindings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindings(Bindings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool Binop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool Binop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolBinop(BoolBinop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanExpr(BooleanExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculated Measure Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculated Measure Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculatedMeasureBinding(CalculatedMeasureBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculation Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculation Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculationPropertiesType(CalculationPropertiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculation Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculation Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculationProperty(CalculationProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculationsType(CalculationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cancel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cancel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCancel(Cancel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCell(Cell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell Permission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell Permission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCellPermission(CellPermission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell Permissions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell Permissions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCellPermissionsType(CellPermissionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classified Columns Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classified Columns Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifiedColumnsType(ClassifiedColumnsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clear Cache</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clear Cache</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClearCache(ClearCache object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clear Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clear Result Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClearResultType(ClearResultType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clone Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clone Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloneDatabase(CloneDatabase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clr Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clr Assembly</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClrAssembly(ClrAssembly object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clr Assembly File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clr Assembly File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClrAssemblyFile(ClrAssemblyFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnBinding(ColumnBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Columns Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Columns Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnsType(ColumnsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Columns Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Columns Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnsType1(ColumnsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Columns Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Columns Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnsType2(ColumnsType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Columns Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Columns Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnsType3(ColumnsType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Columns Type4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Columns Type4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnsType4(ColumnsType4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnType(ColumnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Assembly</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComAssembly(ComAssembly object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommand(Command object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commands Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commands Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandsType(CommandsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commit Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commit Transaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommitTransaction(CommitTransaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparatorType(ComparatorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreate(Create object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cube</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cube</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCube(Cube object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cube Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cube Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCubeAttribute(CubeAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cube Attribute Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cube Attribute Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCubeAttributeBinding(CubeAttributeBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cube Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cube Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCubeDimension(CubeDimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cube Dimension Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cube Dimension Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCubeDimensionBinding(CubeDimensionBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cube Dimension Permission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cube Dimension Permission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCubeDimensionPermission(CubeDimensionPermission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cube Hierarchy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cube Hierarchy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCubeHierarchy(CubeHierarchy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cube Permission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cube Permission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCubePermission(CubePermission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cube Permissions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cube Permissions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCubePermissionsType(CubePermissionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cubes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cubes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCubesType(CubesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Current Storage Mode Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Current Storage Mode Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrentStorageModeType(CurrentStorageModeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Current Storage Mode Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Current Storage Mode Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrentStorageModeType1(CurrentStorageModeType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Rollup Column Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Rollup Column Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomRollupColumnType(CustomRollupColumnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Rollup Properties Column Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Rollup Properties Column Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomRollupPropertiesColumnType(CustomRollupPropertiesColumnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabase(Database object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Permission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Permission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabasePermission(DatabasePermission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Permissions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Permissions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabasePermissionsType(DatabasePermissionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Databases Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Databases Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabasesType(DatabasesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataBlock(DataBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataItem(DataItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Mining Measure Group Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Mining Measure Group Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataMiningMeasureGroupDimension(DataMiningMeasureGroupDimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSource(DataSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Source Permission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Source Permission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSourcePermission(DataSourcePermission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Source Permissions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Source Permissions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSourcePermissionsType(DataSourcePermissionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Sources Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Sources Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSourcesType(DataSourcesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Source View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Source View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSourceView(DataSourceView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Source View Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Source View Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSourceViewBinding(DataSourceViewBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Source Views Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Source Views Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSourceViewsType(DataSourceViewsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType1(DataType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType2(DataType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType3(DataType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DBCC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DBCC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDBCC(DBCC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Degenerate Measure Group Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Degenerate Measure Group Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDegenerateMeasureGroupDimension(DegenerateMeasureGroupDimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelete(Delete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design Aggregations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design Aggregations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesignAggregations(DesignAggregations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Detach</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Detach</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetach(Detach object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimension(Dimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimensionAttribute(DimensionAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimensionBinding(DimensionBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension Permission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension Permission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimensionPermission(DimensionPermission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension Permissions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension Permissions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimensionPermissionsType(DimensionPermissionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension Permissions Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension Permissions Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimensionPermissionsType1(DimensionPermissionsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimensions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimensions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimensionsType(DimensionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discover Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discover Response Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscoverResponseType(DiscoverResponseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discover Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discover Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscoverType(DiscoverType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drill Through Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drill Through Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDrillThroughAction(DrillThroughAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDrop(Drop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DSV Table Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DSV Table Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSVTableBinding(DSVTableBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Of Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Of Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndOfDataType(EndOfDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Session Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Session Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndSessionType(EndSessionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorConfiguration(ErrorConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Category Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Category Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventCategoryType(EventCategoryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventColumn(EventColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Column ID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Column ID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventColumnID(EventColumnID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Column List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Column List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventColumnListType(EventColumnListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Column Subclass List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Column Subclass List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventColumnSubclassListType(EventColumnSubclassListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Column Subclass Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Column Subclass Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventColumnSubclassType(EventColumnSubclassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventListType(EventListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Session Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Session Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventSessionType(EventSessionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Events Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Events Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventsType(EventsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventType(EventType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventType1(EventType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventTypeType(EventTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execute Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execute Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecuteParameter(ExecuteParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execute Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execute Response Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecuteResponseType(ExecuteResponseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execute Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execute Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecuteType(ExecuteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Files Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Files Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilesType(FilesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Folder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Folder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFolder(Folder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Folding Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Folding Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFoldingParameters(FoldingParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Foreign Key Columns Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Foreign Key Columns Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForeignKeyColumnsType(ForeignKeyColumnsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Foreign Key Columns Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Foreign Key Columns Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForeignKeyColumnsType1(ForeignKeyColumnsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Foreign Key Column Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Foreign Key Column Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForeignKeyColumnType(ForeignKeyColumnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalType(GlobalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroup(Group object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Groups Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Groups Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupsType(GroupsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hierarchies Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hierarchies Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHierarchiesType(HierarchiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hierarchies Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hierarchies Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHierarchiesType1(HierarchiesType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hierarchies Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hierarchies Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHierarchiesType2(HierarchiesType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hierarchy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hierarchy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHierarchy(Hierarchy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Load</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Load</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageLoad(ImageLoad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Save</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Save</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageSave(ImageSave object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Incremental Processing Notification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Incremental Processing Notification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncrementalProcessingNotification(IncrementalProcessingNotification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Incremental Processing Notifications Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Incremental Processing Notifications Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncrementalProcessingNotificationsType(IncrementalProcessingNotificationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inherited Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inherited Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInheritedBinding(InheritedBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsert(Insert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keep Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keep Result Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeepResultType(KeepResultType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Columns Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Columns Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyColumnsType(KeyColumnsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Columns Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Columns Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyColumnsType1(KeyColumnsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Columns Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Columns Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyColumnsType2(KeyColumnsType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Columns Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Columns Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyColumnsType3(KeyColumnsType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Columns Type4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Columns Type4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyColumnsType4(KeyColumnsType4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Column Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Column Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyColumnType(KeyColumnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keys Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keys Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeysType(KeysType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keys Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keys Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeysType1(KeysType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kpi</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kpi</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKpi(Kpi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kpis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kpis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKpisType(KpisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kpis Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kpis Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKpisType1(KpisType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLevel(Level object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Levels Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Levels Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLevelsType(LevelsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Backup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Backup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationBackup(LocationBackup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Locations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Locations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationsType(LocationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Locations Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Locations Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationsType1(LocationsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Locations Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Locations Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationsType2(LocationsType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lock</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLock(Lock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Major Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Major Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMajorObject(MajorObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Many To Many Measure Group Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Many To Many Measure Group Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManyToManyMeasureGroupDimension(ManyToManyMeasureGroupDimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mdx Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mdx Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMdxScript(MdxScript object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mdx Scripts Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mdx Scripts Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMdxScriptsType(MdxScriptsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasure(Measure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureBinding(MeasureBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureGroup(MeasureGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Group Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Group Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureGroupAttribute(MeasureGroupAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Group Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Group Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureGroupBinding(MeasureGroupBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Group Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Group Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureGroupDimension(MeasureGroupDimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Group Dimension Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Group Dimension Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureGroupDimensionBinding(MeasureGroupDimensionBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Groups Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Groups Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureGroupsType(MeasureGroupsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Groups Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Groups Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureGroupsType1(MeasureGroupsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measures Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measures Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasuresType(MeasuresType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measures Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measures Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasuresType1(MeasuresType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measures Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measures Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasuresType2(MeasuresType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMember(Member object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Members Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Members Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMembersType(MembersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Members Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Members Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMembersType1(MembersType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge Partitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge Partitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergePartitions(MergePartitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mining Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mining Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMiningModel(MiningModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mining Model Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mining Model Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMiningModelColumn(MiningModelColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mining Modeling Flag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mining Modeling Flag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMiningModelingFlag(MiningModelingFlag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mining Model Permission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mining Model Permission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMiningModelPermission(MiningModelPermission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mining Model Permissions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mining Model Permissions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMiningModelPermissionsType(MiningModelPermissionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mining Models Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mining Models Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMiningModelsType(MiningModelsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mining Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mining Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMiningStructure(MiningStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mining Structure Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mining Structure Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMiningStructureColumn(MiningStructureColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mining Structure Permission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mining Structure Permission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMiningStructurePermission(MiningStructurePermission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mining Structure Permissions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mining Structure Permissions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMiningStructurePermissionsType(MiningStructurePermissionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mining Structures Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mining Structures Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMiningStructuresType(MiningStructuresType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modeling Flags Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modeling Flags Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelingFlagsType(ModelingFlagsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modeling Flags Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modeling Flags Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelingFlagsType1(ModelingFlagsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Column Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Column Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameColumnType(NameColumnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Naming Template Translations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Naming Template Translations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamingTemplateTranslationsType(NamingTemplateTranslationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notify Table Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notify Table Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotifyTableChange(NotifyTableChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotType(NotType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(org.eclipse.daanse.xmla.model.ecore.xmla.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectReference(ObjectReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectType(ObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Olap Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Olap Data Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOlapDataSource(OlapDataSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordinal Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordinal Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrdinalType(OrdinalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Out Of Line Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Out Of Line Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutOfLineBinding(OutOfLineBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallelType(ParallelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameters(Parameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameters Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameters Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParametersType(ParametersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterType2(ParameterType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartition(Partition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partitions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partitions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartitionsType(PartitionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Permission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Permission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePermission(Permission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perspective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perspective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerspective(Perspective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perspective Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perspective Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerspectiveAction(PerspectiveAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perspective Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perspective Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerspectiveAttribute(PerspectiveAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perspective Calculation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perspective Calculation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerspectiveCalculation(PerspectiveCalculation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perspective Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perspective Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerspectiveDimension(PerspectiveDimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perspective Hierarchy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perspective Hierarchy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerspectiveHierarchy(PerspectiveHierarchy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perspective Kpi</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perspective Kpi</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerspectiveKpi(PerspectiveKpi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perspective Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perspective Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerspectiveMeasure(PerspectiveMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perspective Measure Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perspective Measure Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerspectiveMeasureGroup(PerspectiveMeasureGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perspectives Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perspectives Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerspectivesType(PerspectivesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pred Leaf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pred Leaf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredLeaf(PredLeaf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proactive Caching</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proactive Caching</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProactiveCaching(ProactiveCaching object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proactive Caching Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proactive Caching Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProactiveCachingBinding(ProactiveCachingBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proactive Caching Incremental Processing Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proactive Caching Incremental Processing Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProactiveCachingIncrementalProcessingBinding(ProactiveCachingIncrementalProcessingBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proactive Caching Inherited Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proactive Caching Inherited Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProactiveCachingInheritedBinding(ProactiveCachingInheritedBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proactive Caching Object Notification Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proactive Caching Object Notification Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProactiveCachingObjectNotificationBinding(ProactiveCachingObjectNotificationBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proactive Caching Query Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proactive Caching Query Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProactiveCachingQueryBinding(ProactiveCachingQueryBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proactive Caching Tables Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proactive Caching Tables Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProactiveCachingTablesBinding(ProactiveCachingTablesBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess(org.eclipse.daanse.xmla.model.ecore.xmla.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperties(Properties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertiesType(PropertiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyList(PropertyList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pushed Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pushed Data Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePushedDataSource(PushedDataSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Queries Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Queries Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueriesType(QueriesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryBinding(QueryBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Notification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Notification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryNotification(QueryNotification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Notifications Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Notifications Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryNotificationsType(QueryNotificationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Measure Group Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Measure Group Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceMeasureGroupDimension(ReferenceMeasureGroupDimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regular Measure Group Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regular Measure Group Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegularMeasureGroupDimension(RegularMeasureGroupDimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relational Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relational Data Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationalDataSource(RelationalDataSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Report Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Report Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReportAction(ReportAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Report Format Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Report Format Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReportFormatParameter(ReportFormatParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Report Format Parameters Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Report Format Parameters Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReportFormatParametersType(ReportFormatParametersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Report Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Report Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReportParameter(ReportParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Report Parameters Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Report Parameters Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReportParametersType(ReportParametersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restore</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restore</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestore(Restore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restriction List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restriction List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestrictionListType(RestrictionListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restrictions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restrictions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestrictionsType(RestrictionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultType(ResultType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturn(Return object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnType(ReturnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Roles Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Roles Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRolesType(RolesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Roles Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Roles Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRolesType1(RolesType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rollback Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rollback Transaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRollbackTransaction(RollbackTransaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootType(RootType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Row Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Row Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRowBinding(RowBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scalar Mining Structure Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scalar Mining Structure Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalarMiningStructureColumn(ScalarMiningStructureColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServer(Server object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServerPropertiesType(ServerPropertiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServerProperty(ServerProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Session Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Session Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSessionType(SessionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Auth Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Auth Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetAuthContext(SetAuthContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skipped Levels Column Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skipped Levels Column Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkippedLevelsColumnType(SkippedLevelsColumnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSource(Source object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sources Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sources Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourcesType(SourcesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandardAction(StandardAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage Mode Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage Mode Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorageModeType(StorageModeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage Mode Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage Mode Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorageModeType2(StorageModeType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage Mode Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage Mode Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorageModeType3(StorageModeType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscribe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscribe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscribe(Subscribe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronize</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronize</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronize(Synchronize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableBinding(TableBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Mining Structure Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Mining Structure Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableMiningStructureColumn(TableMiningStructureColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Notification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Notification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableNotification(TableNotification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Notifications Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Notifications Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableNotificationsType(TableNotificationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Notifications Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Notifications Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableNotificationsType1(TableNotificationsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tabular Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tabular Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTabularBinding(TabularBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetType(TargetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetType1(TargetType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Attribute Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Attribute Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeAttributeBinding(TimeAttributeBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeBinding(TimeBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrace(Trace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trace Columns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace Columns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceColumns(TraceColumns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trace Definition Provider Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace Definition Provider Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceDefinitionProviderInfo(TraceDefinitionProviderInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trace Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceEvent(TraceEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trace Event Categories</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace Event Categories</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceEventCategories(TraceEventCategories object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trace Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceFilter(TraceFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traces Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traces Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracesType(TracesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Translation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Translation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTranslation(Translation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Translation Insert Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Translation Insert Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTranslationInsertUpdate(TranslationInsertUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Translations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Translations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTranslationsType(TranslationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Translation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Translation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTranslationType(TranslationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type6</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type6</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeType6(TypeType6 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryExpr(UnaryExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Operator Column Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Operator Column Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryOperatorColumnType(UnaryOperatorColumnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unknown Member Translations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unknown Member Translations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnknownMemberTranslationsType(UnknownMemberTranslationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unknown Member Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unknown Member Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnknownMemberType(UnknownMemberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unlock</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unlock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnlock(Unlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unsubscribe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unsubscribe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnsubscribe(Unsubscribe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdate(Update object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Cells</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Cells</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateCells(UpdateCells object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Defined Group Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Defined Group Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserDefinedGroupBinding(UserDefinedGroupBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Column Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Column Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueColumnType(ValueColumnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionType(VersionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Where</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Where</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhere(Where object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Where Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Where Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhereAttribute(WhereAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //XmlaSwitch
