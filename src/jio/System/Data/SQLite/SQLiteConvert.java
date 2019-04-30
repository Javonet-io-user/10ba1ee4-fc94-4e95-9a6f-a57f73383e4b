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

public abstract class SQLiteConvert {
  protected NObject javonetHandle;

  public SQLiteConvert(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] ToUTF8(java.lang.String sourceText, Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("System.Data.SQLite.SQLiteConvert").invoke("ToUTF8", sourceText);
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Byte[] ToUTF8(DateTime dateTimeValue, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("ToUTF8", dateTimeValue);
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String ToString(IntPtr nativestring, java.lang.Integer nativestringlen) {
    try {
      java.lang.String res = javonetHandle.invoke("ToString", nativestring, nativestringlen);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String UTF8ToString(
      IntPtr nativestring, java.lang.Integer nativestringlen) {
    try {
      java.lang.String res =
          Javonet.getType("System.Data.SQLite.SQLiteConvert")
              .invoke("UTF8ToString", nativestring, nativestringlen);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DateTime ToDateTime(java.lang.String dateText) {
    try {
      Object res = javonetHandle.invoke("ToDateTime", dateText);
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static DateTime ToDateTime(
      java.lang.String dateText,
      SQLiteDateFormats format,
      DateTimeKind kind,
      java.lang.String formatString) {
    try {
      Object res =
          Javonet.getType("System.Data.SQLite.SQLiteConvert")
              .invoke(
                  "ToDateTime",
                  dateText,
                  NEnum.fromJavaEnum(format),
                  NEnum.fromJavaEnum(kind),
                  formatString);
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DateTime ToDateTime(java.lang.Double julianDay) {
    try {
      Object res = javonetHandle.invoke("ToDateTime", julianDay);
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static DateTime ToDateTime(java.lang.Double julianDay, DateTimeKind kind) {
    try {
      Object res =
          Javonet.getType("System.Data.SQLite.SQLiteConvert")
              .invoke("ToDateTime", julianDay, NEnum.fromJavaEnum(kind));
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Double ToJulianDay(DateTime value) {
    try {
      java.lang.Double res =
          Javonet.getType("System.Data.SQLite.SQLiteConvert").invoke("ToJulianDay", value);
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long ToUnixEpoch(DateTime value) {
    try {
      java.lang.Long res =
          Javonet.getType("System.Data.SQLite.SQLiteConvert").invoke("ToUnixEpoch", value);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String ToString(DateTime dateValue) {
    try {
      java.lang.String res = javonetHandle.invoke("ToString", dateValue);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToString(
      DateTime dateValue,
      SQLiteDateFormats format,
      DateTimeKind kind,
      java.lang.String formatString) {
    try {
      java.lang.String res =
          Javonet.getType("System.Data.SQLite.SQLiteConvert")
              .invoke(
                  "ToString",
                  dateValue,
                  NEnum.fromJavaEnum(format),
                  NEnum.fromJavaEnum(kind),
                  formatString);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String[] Split(
      java.lang.String source, java.lang.Character separator, Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("System.Data.SQLite.SQLiteConvert").invoke("Split", source, separator);
      if (res == null) return null;
      return (java.lang.String[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToStringWithProvider(Object obj, IFormatProvider provider) {
    try {
      java.lang.String res =
          Javonet.getType("System.Data.SQLite.SQLiteConvert")
              .invoke("ToStringWithProvider", obj, provider);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean ToBoolean(Object source) {
    try {
      java.lang.Boolean res =
          Javonet.getType("System.Data.SQLite.SQLiteConvert").invoke("ToBoolean", source);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean ToBoolean(java.lang.String source) {
    try {
      java.lang.Boolean res =
          Javonet.getType("System.Data.SQLite.SQLiteConvert").invoke("ToBoolean", source);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String GetStringOrNull(Object value) {
    try {
      java.lang.String res =
          Javonet.getType("System.Data.SQLite.SQLiteConvert").invoke("GetStringOrNull", value);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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
