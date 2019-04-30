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

public class SQLiteMetaDataCollectionNames {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCatalogs() {
    try {
      java.lang.String res =
          Javonet.getType("System.Data.SQLite.SQLiteMetaDataCollectionNames").get("Catalogs");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCatalogs(java.lang.String param) {
    try {
      Javonet.getType("System.Data.SQLite.SQLiteMetaDataCollectionNames").set("Catalogs", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getColumns() {
    try {
      java.lang.String res =
          Javonet.getType("System.Data.SQLite.SQLiteMetaDataCollectionNames").get("Columns");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setColumns(java.lang.String param) {
    try {
      Javonet.getType("System.Data.SQLite.SQLiteMetaDataCollectionNames").set("Columns", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getIndexes() {
    try {
      java.lang.String res =
          Javonet.getType("System.Data.SQLite.SQLiteMetaDataCollectionNames").get("Indexes");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIndexes(java.lang.String param) {
    try {
      Javonet.getType("System.Data.SQLite.SQLiteMetaDataCollectionNames").set("Indexes", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getIndexColumns() {
    try {
      java.lang.String res =
          Javonet.getType("System.Data.SQLite.SQLiteMetaDataCollectionNames").get("IndexColumns");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIndexColumns(java.lang.String param) {
    try {
      Javonet.getType("System.Data.SQLite.SQLiteMetaDataCollectionNames")
          .set("IndexColumns", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getTables() {
    try {
      java.lang.String res =
          Javonet.getType("System.Data.SQLite.SQLiteMetaDataCollectionNames").get("Tables");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setTables(java.lang.String param) {
    try {
      Javonet.getType("System.Data.SQLite.SQLiteMetaDataCollectionNames").set("Tables", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getViews() {
    try {
      java.lang.String res =
          Javonet.getType("System.Data.SQLite.SQLiteMetaDataCollectionNames").get("Views");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setViews(java.lang.String param) {
    try {
      Javonet.getType("System.Data.SQLite.SQLiteMetaDataCollectionNames").set("Views", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getViewColumns() {
    try {
      java.lang.String res =
          Javonet.getType("System.Data.SQLite.SQLiteMetaDataCollectionNames").get("ViewColumns");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setViewColumns(java.lang.String param) {
    try {
      Javonet.getType("System.Data.SQLite.SQLiteMetaDataCollectionNames").set("ViewColumns", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getForeignKeys() {
    try {
      java.lang.String res =
          Javonet.getType("System.Data.SQLite.SQLiteMetaDataCollectionNames").get("ForeignKeys");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setForeignKeys(java.lang.String param) {
    try {
      Javonet.getType("System.Data.SQLite.SQLiteMetaDataCollectionNames").set("ForeignKeys", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getTriggers() {
    try {
      java.lang.String res =
          Javonet.getType("System.Data.SQLite.SQLiteMetaDataCollectionNames").get("Triggers");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setTriggers(java.lang.String param) {
    try {
      Javonet.getType("System.Data.SQLite.SQLiteMetaDataCollectionNames").set("Triggers", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
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
