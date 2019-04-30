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

public class SQLiteFactory extends DbProviderFactory implements IDisposable, IServiceProvider {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public static SQLiteFactory getInstance() {
    try {
      Object res = Javonet.getType("System.Data.SQLite.SQLiteFactory").<NObject>get("Instance");
      if (res == null) return null;
      return new SQLiteFactory((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setInstance(SQLiteFactory param) {
    try {
      Javonet.getType("System.Data.SQLite.SQLiteFactory").set("Instance", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteFactory() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.SQLite.SQLiteFactory");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "Log",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SQLiteLogEventHandler handler : _LogListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], LogEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteFactory(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Dispose() {
    try {
      javonetHandle.explicitInterface("jio.System.IDisposable").invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DbCommand CreateCommand() {
    try {
      Object res = javonetHandle.invoke("CreateCommand");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DbCommandBuilder CreateCommandBuilder() {
    try {
      Object res = javonetHandle.invoke("CreateCommandBuilder");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DbConnection CreateConnection() {
    try {
      Object res = javonetHandle.invoke("CreateConnection");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DbConnectionStringBuilder CreateConnectionStringBuilder() {
    try {
      Object res = javonetHandle.invoke("CreateConnectionStringBuilder");
      if (res == null) return null;
      return new DbConnectionStringBuilder((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DbDataAdapter CreateDataAdapter() {
    try {
      Object res = javonetHandle.invoke("CreateDataAdapter");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DbParameter CreateParameter() {
    try {
      Object res = javonetHandle.invoke("CreateParameter");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Object GetService(jio.System.Type serviceType) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.IServiceProvider")
              .invoke("GetService", serviceType);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
