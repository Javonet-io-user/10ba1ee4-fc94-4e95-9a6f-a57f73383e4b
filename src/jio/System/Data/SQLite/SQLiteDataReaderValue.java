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
import jio.System.Data.SQLite.*;
import jio.System.*;

public class SQLiteDataReaderValue {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public SQLiteBlob getBlobValue() {
    try {
      Object res = javonetHandle.<NObject>get("BlobValue");
      if (res == null) return null;
      return new SQLiteBlob((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setBlobValue(SQLiteBlob param) {
    try {
      javonetHandle.set("BlobValue", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Boolean> getBooleanValue() {
    try {
      Object res = javonetHandle.<NObject>get("BooleanValue");
      if (res == null) return null;
      return new Nullable<java.lang.Boolean>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setBooleanValue(Nullable<java.lang.Boolean> param) {
    try {
      javonetHandle.set("BooleanValue", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Byte> getByteValue() {
    try {
      Object res = javonetHandle.<NObject>get("ByteValue");
      if (res == null) return null;
      return new Nullable<java.lang.Byte>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setByteValue(Nullable<java.lang.Byte> param) {
    try {
      javonetHandle.set("ByteValue", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Byte[] getBytesValue(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("BytesValue");
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setBytesValue(java.lang.Byte[] param) {
    try {
      javonetHandle.set("BytesValue", new Object[] {param});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Character> getCharValue() {
    try {
      Object res = javonetHandle.<NObject>get("CharValue");
      if (res == null) return null;
      return new Nullable<java.lang.Character>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setCharValue(Nullable<java.lang.Character> param) {
    try {
      javonetHandle.set("CharValue", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Character[] getCharsValue(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("CharsValue");
      if (res == null) return null;
      return (java.lang.Character[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setCharsValue(java.lang.Character[] param) {
    try {
      javonetHandle.set("CharsValue", new Object[] {param});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<DateTime> getDateTimeValue() {
    try {
      Object res = javonetHandle.<NObject>get("DateTimeValue");
      if (res == null) return null;
      return new Nullable<DateTime>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setDateTimeValue(Nullable<DateTime> param) {
    try {
      javonetHandle.set("DateTimeValue", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.math.BigDecimal> getDecimalValue() {
    try {
      Object res = javonetHandle.<NObject>get("DecimalValue");
      if (res == null) return null;
      return new Nullable<java.math.BigDecimal>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setDecimalValue(Nullable<java.math.BigDecimal> param) {
    try {
      javonetHandle.set("DecimalValue", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Double> getDoubleValue() {
    try {
      Object res = javonetHandle.<NObject>get("DoubleValue");
      if (res == null) return null;
      return new Nullable<java.lang.Double>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setDoubleValue(Nullable<java.lang.Double> param) {
    try {
      javonetHandle.set("DoubleValue", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Float> getFloatValue() {
    try {
      Object res = javonetHandle.<NObject>get("FloatValue");
      if (res == null) return null;
      return new Nullable<java.lang.Float>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setFloatValue(Nullable<java.lang.Float> param) {
    try {
      javonetHandle.set("FloatValue", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<Guid> getGuidValue() {
    try {
      Object res = javonetHandle.<NObject>get("GuidValue");
      if (res == null) return null;
      return new Nullable<Guid>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setGuidValue(Nullable<Guid> param) {
    try {
      javonetHandle.set("GuidValue", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Short> getInt16Value() {
    try {
      Object res = javonetHandle.<NObject>get("Int16Value");
      if (res == null) return null;
      return new Nullable<java.lang.Short>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setInt16Value(Nullable<java.lang.Short> param) {
    try {
      javonetHandle.set("Int16Value", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Integer> getInt32Value() {
    try {
      Object res = javonetHandle.<NObject>get("Int32Value");
      if (res == null) return null;
      return new Nullable<java.lang.Integer>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setInt32Value(Nullable<java.lang.Integer> param) {
    try {
      javonetHandle.set("Int32Value", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Long> getInt64Value() {
    try {
      Object res = javonetHandle.<NObject>get("Int64Value");
      if (res == null) return null;
      return new Nullable<java.lang.Long>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setInt64Value(Nullable<java.lang.Long> param) {
    try {
      javonetHandle.set("Int64Value", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getStringValue() {
    try {
      java.lang.String res = javonetHandle.get("StringValue");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setStringValue(java.lang.String param) {
    try {
      javonetHandle.set("StringValue", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Object getValue() {
    try {
      Object res = javonetHandle.<NObject>get("Value");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setValue(Object param) {
    try {
      javonetHandle.set("Value", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteDataReaderValue() {
    try {
      javonetHandle = Javonet.New("System.Data.SQLite.SQLiteDataReaderValue");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteDataReaderValue(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
