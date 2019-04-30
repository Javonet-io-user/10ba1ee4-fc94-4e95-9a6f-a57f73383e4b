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

public class SQLiteLog {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public static void setEnabled(java.lang.Boolean value) {
    try {
      Javonet.getType("System.Data.SQLite.SQLiteLog").set("Enabled", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Boolean getEnabled() {
    try {
      java.lang.Boolean res = Javonet.getType("System.Data.SQLite.SQLiteLog").get("Enabled");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void Initialize() {
    try {
      Javonet.getType("System.Data.SQLite.SQLiteLog").invoke("Initialize");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void LogMessage(java.lang.String message) {
    try {
      Javonet.getType("System.Data.SQLite.SQLiteLog").invoke("LogMessage", message);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void LogMessage(SQLiteErrorCode errorCode, java.lang.String message) {
    try {
      Javonet.getType("System.Data.SQLite.SQLiteLog")
          .invoke("LogMessage", NEnum.fromJavaEnum(errorCode), message);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void LogMessage(java.lang.Integer errorCode, java.lang.String message) {
    try {
      Javonet.getType("System.Data.SQLite.SQLiteLog").invoke("LogMessage", errorCode, message);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void AddDefaultHandler() {
    try {
      Javonet.getType("System.Data.SQLite.SQLiteLog").invoke("AddDefaultHandler");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void RemoveDefaultHandler() {
    try {
      Javonet.getType("System.Data.SQLite.SQLiteLog").invoke("RemoveDefaultHandler");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Event */

  private java.util.ArrayList<SQLiteLogEventHandler> _LogListeners =
      new java.util.ArrayList<SQLiteLogEventHandler>();

  public void addLog(SQLiteLogEventHandler toAdd) {
    _LogListeners.add(toAdd);
  }

  public void removeLog(SQLiteLogEventHandler toRemove) {
    _LogListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
