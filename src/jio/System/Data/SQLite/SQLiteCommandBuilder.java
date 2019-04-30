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
import jio.System.ComponentModel.*;

public class SQLiteCommandBuilder extends DbCommandBuilder implements IComponent, IDisposable {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setDataAdapter(SQLiteDataAdapter value) {
    try {
      javonetHandle.set("DataAdapter", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public SQLiteDataAdapter getDataAdapter() {
    try {
      Object res = javonetHandle.<NObject>get("DataAdapter");
      if (res == null) return null;
      return new SQLiteDataAdapter((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCatalogLocation(CatalogLocation value) {
    try {
      javonetHandle.set("CatalogLocation", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public CatalogLocation getCatalogLocation() {
    try {
      Object res = javonetHandle.<NEnum>get("CatalogLocation");
      if (res == null) return null;
      return CatalogLocation.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCatalogSeparator(java.lang.String value) {
    try {
      javonetHandle.set("CatalogSeparator", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getCatalogSeparator() {
    try {
      java.lang.String res = javonetHandle.get("CatalogSeparator");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setQuotePrefix(java.lang.String value) {
    try {
      javonetHandle.set("QuotePrefix", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getQuotePrefix() {
    try {
      java.lang.String res = javonetHandle.get("QuotePrefix");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setQuoteSuffix(java.lang.String value) {
    try {
      javonetHandle.set("QuoteSuffix", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getQuoteSuffix() {
    try {
      java.lang.String res = javonetHandle.get("QuoteSuffix");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSchemaSeparator(java.lang.String value) {
    try {
      javonetHandle.set("SchemaSeparator", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getSchemaSeparator() {
    try {
      java.lang.String res = javonetHandle.get("SchemaSeparator");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public SQLiteCommandBuilder() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.SQLite.SQLiteCommandBuilder");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteCommandBuilder(SQLiteDataAdapter adp) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.SQLite.SQLiteCommandBuilder", adp);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteCommandBuilder(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SQLiteCommand GetDeleteCommand() {
    try {
      Object res = javonetHandle.invoke("GetDeleteCommand");
      if (res == null) return null;
      return new SQLiteCommand((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SQLiteCommand GetDeleteCommand(java.lang.Boolean useColumnsForParameterNames) {
    try {
      Object res = javonetHandle.invoke("GetDeleteCommand", useColumnsForParameterNames);
      if (res == null) return null;
      return new SQLiteCommand((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SQLiteCommand GetUpdateCommand() {
    try {
      Object res = javonetHandle.invoke("GetUpdateCommand");
      if (res == null) return null;
      return new SQLiteCommand((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SQLiteCommand GetUpdateCommand(java.lang.Boolean useColumnsForParameterNames) {
    try {
      Object res = javonetHandle.invoke("GetUpdateCommand", useColumnsForParameterNames);
      if (res == null) return null;
      return new SQLiteCommand((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SQLiteCommand GetInsertCommand() {
    try {
      Object res = javonetHandle.invoke("GetInsertCommand");
      if (res == null) return null;
      return new SQLiteCommand((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SQLiteCommand GetInsertCommand(java.lang.Boolean useColumnsForParameterNames) {
    try {
      Object res = javonetHandle.invoke("GetInsertCommand", useColumnsForParameterNames);
      if (res == null) return null;
      return new SQLiteCommand((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String QuoteIdentifier(java.lang.String unquotedIdentifier) {
    try {
      java.lang.String res = javonetHandle.invoke("QuoteIdentifier", unquotedIdentifier);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String UnquoteIdentifier(java.lang.String quotedIdentifier) {
    try {
      java.lang.String res = javonetHandle.invoke("UnquoteIdentifier", quotedIdentifier);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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
