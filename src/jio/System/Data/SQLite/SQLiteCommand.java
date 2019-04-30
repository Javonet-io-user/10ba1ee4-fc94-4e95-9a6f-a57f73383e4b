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
import jio.System.ComponentModel.*;

public class SQLiteCommand extends DbCommand
    implements IComponent, IDisposable, IDbCommand, ICloneable {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setCommandText(java.lang.String value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Data.IDbCommand")
          .invoke("set_CommandText", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getCommandText() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("jio.System.Data.IDbCommand").invoke("get_CommandText");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCommandTimeout(java.lang.Integer value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Data.IDbCommand")
          .invoke("set_CommandTimeout", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getCommandTimeout() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("jio.System.Data.IDbCommand")
              .invoke("get_CommandTimeout");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCommandType(CommandType value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Data.IDbCommand")
          .invoke("set_CommandType", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public CommandType getCommandType() {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.Data.IDbCommand").invoke("get_CommandType");
      if (res == null) return null;
      return CommandType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setConnection(SQLiteConnection value) {
    try {
      javonetHandle.set("Connection", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public SQLiteConnection getConnection() {
    try {
      Object res = javonetHandle.<NObject>get("Connection");
      if (res == null) return null;
      return new SQLiteConnection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public SQLiteParameterCollection getParameters() {
    try {
      Object res = javonetHandle.<NObject>get("Parameters");
      if (res == null) return null;
      return new SQLiteParameterCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTransaction(SQLiteTransaction value) {
    try {
      javonetHandle.set("Transaction", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public SQLiteTransaction getTransaction() {
    try {
      Object res = javonetHandle.<NObject>get("Transaction");
      if (res == null) return null;
      return new SQLiteTransaction((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUpdatedRowSource(UpdateRowSource value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Data.IDbCommand")
          .invoke("set_UpdatedRowSource", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public UpdateRowSource getUpdatedRowSource() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Data.IDbCommand")
              .invoke("get_UpdatedRowSource");
      if (res == null) return null;
      return UpdateRowSource.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDesignTimeVisible(java.lang.Boolean value) {
    try {
      javonetHandle.set("DesignTimeVisible", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getDesignTimeVisible() {
    try {
      java.lang.Boolean res = javonetHandle.get("DesignTimeVisible");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public SQLiteCommand() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.SQLite.SQLiteCommand");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteCommand(java.lang.String commandText) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.SQLite.SQLiteCommand", commandText);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteCommand(java.lang.String commandText, SQLiteConnection connection) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.SQLite.SQLiteCommand", commandText, connection);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteCommand(SQLiteConnection connection) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.SQLite.SQLiteCommand", connection);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteCommand(
      java.lang.String commandText, SQLiteConnection connection, SQLiteTransaction transaction) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.Data.SQLite.SQLiteCommand", commandText, connection, transaction);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteCommand(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Prepare() {
    try {
      javonetHandle.explicitInterface("jio.System.Data.IDbCommand").invoke("Prepare");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Cancel() {
    try {
      javonetHandle.explicitInterface("jio.System.Data.IDbCommand").invoke("Cancel");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer ExecuteNonQuery() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("jio.System.Data.IDbCommand").invoke("ExecuteNonQuery");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Object ExecuteScalar() {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.Data.IDbCommand").invoke("ExecuteScalar");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
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
  public SQLiteParameter CreateParameter() {
    try {
      Object res = javonetHandle.invoke("CreateParameter");
      if (res == null) return null;
      return new SQLiteParameter((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void VerifyOnly() {
    try {
      javonetHandle.invoke("VerifyOnly");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Object Execute(
      java.lang.String commandText,
      SQLiteExecuteType executeType,
      java.lang.String connectionString,
      Object[] args) {
    try {
      Object res =
          Javonet.getType("System.Data.SQLite.SQLiteCommand")
              .invoke(
                  "Execute",
                  commandText,
                  NEnum.fromJavaEnum(executeType),
                  connectionString,
                  new Object[] {args});
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Object Execute(
      java.lang.String commandText,
      SQLiteExecuteType executeType,
      CommandBehavior commandBehavior,
      java.lang.String connectionString,
      Object[] args) {
    try {
      Object res =
          Javonet.getType("System.Data.SQLite.SQLiteCommand")
              .invoke(
                  "Execute",
                  commandText,
                  NEnum.fromJavaEnum(executeType),
                  NEnum.fromJavaEnum(commandBehavior),
                  connectionString,
                  new Object[] {args});
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SQLiteDataReader ExecuteReader(CommandBehavior behavior) {
    try {
      Object res = javonetHandle.invoke("ExecuteReader", NEnum.fromJavaEnum(behavior));
      if (res == null) return null;
      return new SQLiteDataReader((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SQLiteDataReader ExecuteReader() {
    try {
      Object res = javonetHandle.invoke("ExecuteReader");
      if (res == null) return null;
      return new SQLiteDataReader((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer ExecuteNonQuery(CommandBehavior behavior) {
    try {
      java.lang.Integer res = javonetHandle.invoke("ExecuteNonQuery", NEnum.fromJavaEnum(behavior));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Object ExecuteScalar(CommandBehavior behavior) {
    try {
      Object res = javonetHandle.invoke("ExecuteScalar", NEnum.fromJavaEnum(behavior));
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Reset() {
    try {
      javonetHandle.invoke("Reset");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Reset(java.lang.Boolean clearBindings, java.lang.Boolean ignoreErrors) {
    try {
      javonetHandle.invoke("Reset", clearBindings, ignoreErrors);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
