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
import jio.System.Data.*;
import jio.System.*;
import jio.System.Collections.*;
import jio.System.Collections.Specialized.*;

public class SQLiteDataReader extends DbDataReader
    implements IDataReader, IDisposable, IDataRecord, IEnumerable, Iterable<Object> {
  protected NObject javonetHandle;

  @Override
  public Iterator<Object> iterator() {
    return (Iterator<Object>) this.IEnumerable_GetEnumerator();
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getDepth() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("jio.System.Data.IDataReader").invoke("get_Depth");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getFieldCount() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("jio.System.Data.IDataRecord").invoke("get_FieldCount");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getStepCount() {
    try {
      java.lang.Integer res = javonetHandle.get("StepCount");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getVisibleFieldCount() {
    try {
      java.lang.Integer res = javonetHandle.get("VisibleFieldCount");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getHasRows() {
    try {
      java.lang.Boolean res = javonetHandle.get("HasRows");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsClosed() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("jio.System.Data.IDataReader").invoke("get_IsClosed");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getRecordsAffected() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("jio.System.Data.IDataReader")
              .invoke("get_RecordsAffected");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "Method")
  public Object getItem(java.lang.String name) {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.Data.IDataRecord").invoke("get_Item", name);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "Method")
  public Object getItem(java.lang.Integer i) {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.Data.IDataRecord").invoke("get_Item", i);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public SQLiteDataReader(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Close() {
    try {
      javonetHandle.explicitInterface("jio.System.Data.IDataReader").invoke("Close");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DataTable GetSchemaTable() {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.Data.IDataReader").invoke("GetSchemaTable");
      if (res == null) return null;
      return new DataTable((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean NextResult() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("jio.System.Data.IDataReader").invoke("NextResult");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Read() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("jio.System.Data.IDataReader").invoke("Read");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetName(java.lang.Integer i) {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("jio.System.Data.IDataRecord").invoke("GetName", i);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetDataTypeName(java.lang.Integer i) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("jio.System.Data.IDataRecord")
              .invoke("GetDataTypeName", i);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public jio.System.Type GetFieldType(java.lang.Integer i) {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.Data.IDataRecord").invoke("GetFieldType", i);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Object GetValue(java.lang.Integer i) {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.Data.IDataRecord").invoke("GetValue", i);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetValues(Object[] values) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("jio.System.Data.IDataRecord")
              .invoke("GetValues", new Object[] {values});
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetOrdinal(java.lang.String name) {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("jio.System.Data.IDataRecord").invoke("GetOrdinal", name);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetBoolean(java.lang.Integer i) {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("jio.System.Data.IDataRecord").invoke("GetBoolean", i);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Byte GetByte(java.lang.Integer i) {
    try {
      java.lang.Byte res =
          javonetHandle.explicitInterface("jio.System.Data.IDataRecord").invoke("GetByte", i);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Long GetBytes(
      java.lang.Integer i,
      java.lang.Long fieldOffset,
      java.lang.Byte[] buffer,
      java.lang.Integer bufferoffset,
      java.lang.Integer length) {
    try {
      java.lang.Long res =
          javonetHandle
              .explicitInterface("jio.System.Data.IDataRecord")
              .invoke("GetBytes", i, fieldOffset, new Object[] {buffer}, bufferoffset, length);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Character GetChar(java.lang.Integer i) {
    try {
      java.lang.Character res =
          javonetHandle.explicitInterface("jio.System.Data.IDataRecord").invoke("GetChar", i);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Long GetChars(
      java.lang.Integer i,
      java.lang.Long fieldoffset,
      java.lang.Character[] buffer,
      java.lang.Integer bufferoffset,
      java.lang.Integer length) {
    try {
      java.lang.Long res =
          javonetHandle
              .explicitInterface("jio.System.Data.IDataRecord")
              .invoke("GetChars", i, fieldoffset, new Object[] {buffer}, bufferoffset, length);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Guid GetGuid(java.lang.Integer i) {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.Data.IDataRecord").invoke("GetGuid", i);
      if (res == null) return null;
      return new Guid((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Short GetInt16(java.lang.Integer i) {
    try {
      java.lang.Short res =
          javonetHandle.explicitInterface("jio.System.Data.IDataRecord").invoke("GetInt16", i);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetInt32(java.lang.Integer i) {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("jio.System.Data.IDataRecord").invoke("GetInt32", i);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Long GetInt64(java.lang.Integer i) {
    try {
      java.lang.Long res =
          javonetHandle.explicitInterface("jio.System.Data.IDataRecord").invoke("GetInt64", i);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Float GetFloat(java.lang.Integer i) {
    try {
      java.lang.Float res =
          javonetHandle.explicitInterface("jio.System.Data.IDataRecord").invoke("GetFloat", i);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Double GetDouble(java.lang.Integer i) {
    try {
      java.lang.Double res =
          javonetHandle.explicitInterface("jio.System.Data.IDataRecord").invoke("GetDouble", i);
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetString(java.lang.Integer i) {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("jio.System.Data.IDataRecord").invoke("GetString", i);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.math.BigDecimal GetDecimal(java.lang.Integer i) {
    try {
      java.math.BigDecimal res =
          javonetHandle.explicitInterface("jio.System.Data.IDataRecord").invoke("GetDecimal", i);
      if (res == null) return null;
      return (java.math.BigDecimal) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DateTime GetDateTime(java.lang.Integer i) {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.Data.IDataRecord").invoke("GetDateTime", i);
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean IsDBNull(java.lang.Integer i) {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("jio.System.Data.IDataRecord").invoke("IsDBNull", i);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IEnumerator IEnumerable_GetEnumerator() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IEnumerable")
              .invoke("GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void RefreshFlags() {
    try {
      javonetHandle.invoke("RefreshFlags");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SQLiteBlob GetBlob(java.lang.Integer i, java.lang.Boolean readOnly) {
    try {
      Object res = javonetHandle.invoke("GetBlob", i, readOnly);
      if (res == null) return null;
      return new SQLiteBlob((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetDatabaseName(java.lang.Integer i) {
    try {
      java.lang.String res = javonetHandle.invoke("GetDatabaseName", i);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetTableName(java.lang.Integer i) {
    try {
      java.lang.String res = javonetHandle.invoke("GetTableName", i);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetOriginalName(java.lang.Integer i) {
    try {
      java.lang.String res = javonetHandle.invoke("GetOriginalName", i);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public NameValueCollection GetValues() {
    try {
      Object res = javonetHandle.invoke("GetValues");
      if (res == null) return null;
      return new NameValueCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Dispose() {
    try {
      javonetHandle.invoke("Dispose");
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
