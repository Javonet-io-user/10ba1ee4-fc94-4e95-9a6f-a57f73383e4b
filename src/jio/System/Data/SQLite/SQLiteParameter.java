package jio.System.Data.SQLite;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import jio.System.Data.Common.*;
import jio.System.Data.SQLite.*;
import jio.System.*;
import jio.System.Data.*;

public class SQLiteParameter extends DbParameter
    implements IDbDataParameter, IDataParameter, ICloneable {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setCommand(IDbCommand value) {
    try {
      javonetHandle.set("Command", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IDbCommand getCommand() {
    try {
      Object res = javonetHandle.<NObject>get("Command");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setIsNullable(java.lang.Boolean value) {
    try {
      javonetHandle.set("IsNullable", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsNullable() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Data.IDataParameter")
              .invoke("get_IsNullable");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDbType(DbType value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Data.IDataParameter")
          .invoke("set_DbType", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DbType getDbType() {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.Data.IDataParameter").invoke("get_DbType");
      if (res == null) return null;
      return DbType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDirection(ParameterDirection value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Data.IDataParameter")
          .invoke("set_Direction", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ParameterDirection getDirection() {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.Data.IDataParameter").invoke("get_Direction");
      if (res == null) return null;
      return ParameterDirection.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setParameterName(java.lang.String value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Data.IDataParameter")
          .invoke("set_ParameterName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getParameterName() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("jio.System.Data.IDataParameter")
              .invoke("get_ParameterName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSize(java.lang.Integer value) {
    try {
      javonetHandle.explicitInterface("jio.System.Data.IDbDataParameter").invoke("set_Size", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getSize() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("jio.System.Data.IDbDataParameter").invoke("get_Size");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSourceColumn(java.lang.String value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Data.IDataParameter")
          .invoke("set_SourceColumn", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getSourceColumn() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("jio.System.Data.IDataParameter")
              .invoke("get_SourceColumn");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSourceColumnNullMapping(java.lang.Boolean value) {
    try {
      javonetHandle.set("SourceColumnNullMapping", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getSourceColumnNullMapping() {
    try {
      java.lang.Boolean res = javonetHandle.get("SourceColumnNullMapping");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSourceVersion(DataRowVersion value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Data.IDataParameter")
          .invoke("set_SourceVersion", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DataRowVersion getSourceVersion() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Data.IDataParameter")
              .invoke("get_SourceVersion");
      if (res == null) return null;
      return DataRowVersion.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setValue(Object value) {
    try {
      javonetHandle.explicitInterface("jio.System.Data.IDataParameter").invoke("set_Value", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Object getValue() {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.Data.IDataParameter").invoke("get_Value");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTypeName(java.lang.String value) {
    try {
      javonetHandle.set("TypeName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getTypeName() {
    try {
      java.lang.String res = javonetHandle.get("TypeName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public SQLiteParameter() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.SQLite.SQLiteParameter");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteParameter(java.lang.String parameterName) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.SQLite.SQLiteParameter", parameterName);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteParameter(java.lang.String parameterName, Object value) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.SQLite.SQLiteParameter", parameterName, value);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteParameter(java.lang.String parameterName, DbType dbType) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Data.SQLite.SQLiteParameter", parameterName, NEnum.fromJavaEnum(dbType));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteParameter(
      java.lang.String parameterName, DbType dbType, java.lang.String sourceColumn) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Data.SQLite.SQLiteParameter",
              parameterName,
              NEnum.fromJavaEnum(dbType),
              sourceColumn);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteParameter(
      java.lang.String parameterName,
      DbType dbType,
      java.lang.String sourceColumn,
      DataRowVersion rowVersion) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Data.SQLite.SQLiteParameter",
              parameterName,
              NEnum.fromJavaEnum(dbType),
              sourceColumn,
              NEnum.fromJavaEnum(rowVersion));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteParameter(DbType dbType) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.SQLite.SQLiteParameter", NEnum.fromJavaEnum(dbType));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteParameter(DbType dbType, Object value) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.Data.SQLite.SQLiteParameter", NEnum.fromJavaEnum(dbType), value);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteParameter(DbType dbType, java.lang.String sourceColumn) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Data.SQLite.SQLiteParameter", NEnum.fromJavaEnum(dbType), sourceColumn);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteParameter(DbType dbType, java.lang.String sourceColumn, DataRowVersion rowVersion) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Data.SQLite.SQLiteParameter",
              NEnum.fromJavaEnum(dbType),
              sourceColumn,
              NEnum.fromJavaEnum(rowVersion));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteParameter(
      java.lang.String parameterName, DbType parameterType, java.lang.Integer parameterSize) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Data.SQLite.SQLiteParameter",
              parameterName,
              NEnum.fromJavaEnum(parameterType),
              parameterSize);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteParameter(
      java.lang.String parameterName,
      DbType parameterType,
      java.lang.Integer parameterSize,
      java.lang.String sourceColumn) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Data.SQLite.SQLiteParameter",
              parameterName,
              NEnum.fromJavaEnum(parameterType),
              parameterSize,
              sourceColumn);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteParameter(
      java.lang.String parameterName,
      DbType parameterType,
      java.lang.Integer parameterSize,
      java.lang.String sourceColumn,
      DataRowVersion rowVersion) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Data.SQLite.SQLiteParameter",
              parameterName,
              NEnum.fromJavaEnum(parameterType),
              parameterSize,
              sourceColumn,
              NEnum.fromJavaEnum(rowVersion));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteParameter(
      java.lang.String parameterName,
      DbType parameterType,
      java.lang.Integer parameterSize,
      ParameterDirection direction,
      java.lang.Boolean isNullable,
      java.lang.Byte precision,
      java.lang.Byte scale,
      java.lang.String sourceColumn,
      DataRowVersion rowVersion,
      Object value) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Data.SQLite.SQLiteParameter",
              parameterName,
              NEnum.fromJavaEnum(parameterType),
              parameterSize,
              NEnum.fromJavaEnum(direction),
              isNullable,
              precision,
              scale,
              sourceColumn,
              NEnum.fromJavaEnum(rowVersion),
              value);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteParameter(
      java.lang.String parameterName,
      DbType parameterType,
      java.lang.Integer parameterSize,
      ParameterDirection direction,
      java.lang.Byte precision,
      java.lang.Byte scale,
      java.lang.String sourceColumn,
      DataRowVersion rowVersion,
      java.lang.Boolean sourceColumnNullMapping,
      Object value) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Data.SQLite.SQLiteParameter",
              parameterName,
              NEnum.fromJavaEnum(parameterType),
              parameterSize,
              NEnum.fromJavaEnum(direction),
              precision,
              scale,
              sourceColumn,
              NEnum.fromJavaEnum(rowVersion),
              sourceColumnNullMapping,
              value);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteParameter(DbType parameterType, java.lang.Integer parameterSize) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Data.SQLite.SQLiteParameter",
              NEnum.fromJavaEnum(parameterType),
              parameterSize);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteParameter(
      DbType parameterType, java.lang.Integer parameterSize, java.lang.String sourceColumn) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Data.SQLite.SQLiteParameter",
              NEnum.fromJavaEnum(parameterType),
              parameterSize,
              sourceColumn);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteParameter(
      DbType parameterType,
      java.lang.Integer parameterSize,
      java.lang.String sourceColumn,
      DataRowVersion rowVersion) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Data.SQLite.SQLiteParameter",
              NEnum.fromJavaEnum(parameterType),
              parameterSize,
              sourceColumn,
              NEnum.fromJavaEnum(rowVersion));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteParameter(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Object Clone() {
    try {
      Object res = javonetHandle.explicitInterface("jio.System.ICloneable").invoke("Clone");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ResetDbType() {
    try {
      javonetHandle.invoke("ResetDbType");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
