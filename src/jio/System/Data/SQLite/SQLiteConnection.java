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
import jio.System.Collections.Generic.*;
import jio.System.Transactions.*;
import jio.System.ComponentModel.*;

public class SQLiteConnection extends DbConnection
    implements IComponent, IDisposable, IDbConnection, ICloneable {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public static void setConnectionPool(ISQLiteConnectionPool value) {
    try {
      Javonet.getType("System.Data.SQLite.SQLiteConnection").set("ConnectionPool", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static ISQLiteConnectionPool getConnectionPool() {
    try {
      Object res =
          Javonet.getType("System.Data.SQLite.SQLiteConnection").<NObject>get("ConnectionPool");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getPoolCount() {
    try {
      java.lang.Integer res = javonetHandle.get("PoolCount");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setConnectionString(java.lang.String value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Data.IDbConnection")
          .invoke("set_ConnectionString", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getConnectionString() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("jio.System.Data.IDbConnection")
              .invoke("get_ConnectionString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDataSource() {
    try {
      java.lang.String res = javonetHandle.get("DataSource");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getFileName() {
    try {
      java.lang.String res = javonetHandle.get("FileName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDatabase() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("jio.System.Data.IDbConnection").invoke("get_Database");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultTimeout(java.lang.Integer value) {
    try {
      javonetHandle.set("DefaultTimeout", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getDefaultTimeout() {
    try {
      java.lang.Integer res = javonetHandle.get("DefaultTimeout");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setBusyTimeout(java.lang.Integer value) {
    try {
      javonetHandle.set("BusyTimeout", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getBusyTimeout() {
    try {
      java.lang.Integer res = javonetHandle.get("BusyTimeout");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPrepareRetries(java.lang.Integer value) {
    try {
      javonetHandle.set("PrepareRetries", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getPrepareRetries() {
    try {
      java.lang.Integer res = javonetHandle.get("PrepareRetries");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setProgressOps(java.lang.Integer value) {
    try {
      javonetHandle.set("ProgressOps", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getProgressOps() {
    try {
      java.lang.Integer res = javonetHandle.get("ProgressOps");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setParseViaFramework(java.lang.Boolean value) {
    try {
      javonetHandle.set("ParseViaFramework", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getParseViaFramework() {
    try {
      java.lang.Boolean res = javonetHandle.get("ParseViaFramework");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setFlags(SQLiteConnectionFlags value) {
    try {
      javonetHandle.set("Flags", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public SQLiteConnectionFlags getFlags() {
    try {
      Object res = javonetHandle.<NEnum>get("Flags");
      if (res == null) return null;
      return SQLiteConnectionFlags.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultDbType(Nullable<DbType> value) {
    try {
      javonetHandle.set("DefaultDbType", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<DbType> getDefaultDbType() {
    try {
      Object res = javonetHandle.<NObject>get("DefaultDbType");
      if (res == null) return null;
      return new Nullable<DbType>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultTypeName(java.lang.String value) {
    try {
      javonetHandle.set("DefaultTypeName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDefaultTypeName() {
    try {
      java.lang.String res = javonetHandle.get("DefaultTypeName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setVfsName(java.lang.String value) {
    try {
      javonetHandle.set("VfsName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getVfsName() {
    try {
      java.lang.String res = javonetHandle.get("VfsName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getOwnHandle() {
    try {
      java.lang.Boolean res = javonetHandle.get("OwnHandle");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getServerVersion() {
    try {
      java.lang.String res = javonetHandle.get("ServerVersion");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getLastInsertRowId() {
    try {
      java.lang.Long res = javonetHandle.get("LastInsertRowId");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getChanges() {
    try {
      java.lang.Integer res = javonetHandle.get("Changes");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getAutoCommit() {
    try {
      java.lang.Boolean res = javonetHandle.get("AutoCommit");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getMemoryUsed() {
    try {
      java.lang.Long res = javonetHandle.get("MemoryUsed");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getMemoryHighwater() {
    try {
      java.lang.Long res = javonetHandle.get("MemoryHighwater");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getDefineConstants() {
    try {
      java.lang.String res =
          Javonet.getType("System.Data.SQLite.SQLiteConnection").get("DefineConstants");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getSQLiteVersion() {
    try {
      java.lang.String res =
          Javonet.getType("System.Data.SQLite.SQLiteConnection").get("SQLiteVersion");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getSQLiteSourceId() {
    try {
      java.lang.String res =
          Javonet.getType("System.Data.SQLite.SQLiteConnection").get("SQLiteSourceId");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getSQLiteCompileOptions() {
    try {
      java.lang.String res =
          Javonet.getType("System.Data.SQLite.SQLiteConnection").get("SQLiteCompileOptions");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getInteropVersion() {
    try {
      java.lang.String res =
          Javonet.getType("System.Data.SQLite.SQLiteConnection").get("InteropVersion");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getInteropSourceId() {
    try {
      java.lang.String res =
          Javonet.getType("System.Data.SQLite.SQLiteConnection").get("InteropSourceId");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getInteropCompileOptions() {
    try {
      java.lang.String res =
          Javonet.getType("System.Data.SQLite.SQLiteConnection").get("InteropCompileOptions");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getProviderVersion() {
    try {
      java.lang.String res =
          Javonet.getType("System.Data.SQLite.SQLiteConnection").get("ProviderVersion");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getProviderSourceId() {
    try {
      java.lang.String res =
          Javonet.getType("System.Data.SQLite.SQLiteConnection").get("ProviderSourceId");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static SQLiteConnectionFlags getDefaultFlags() {
    try {
      Object res =
          Javonet.getType("System.Data.SQLite.SQLiteConnection").<NEnum>get("DefaultFlags");
      if (res == null) return null;
      return SQLiteConnectionFlags.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSharedFlags(SQLiteConnectionFlags value) {
    try {
      Javonet.getType("System.Data.SQLite.SQLiteConnection")
          .set("SharedFlags", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static SQLiteConnectionFlags getSharedFlags() {
    try {
      Object res = Javonet.getType("System.Data.SQLite.SQLiteConnection").<NEnum>get("SharedFlags");
      if (res == null) return null;
      return SQLiteConnectionFlags.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ConnectionState getState() {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.Data.IDbConnection").invoke("get_State");
      if (res == null) return null;
      return ConnectionState.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public SQLiteConnection() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.SQLite.SQLiteConnection");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "StateChange",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (StateChangeEventHandler handler : _StateChangeListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], StateChangeEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Changed",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SQLiteConnectionEventHandler handler : _ChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConnectionEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Progress",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SQLiteProgressEventHandler handler : _ProgressListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ProgressEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Authorize",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SQLiteAuthorizerEventHandler handler : _AuthorizeListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AuthorizerEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Update",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SQLiteUpdateEventHandler handler : _UpdateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], UpdateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Commit",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SQLiteCommitHandler handler : _CommitListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], CommitEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Trace",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SQLiteTraceEventHandler handler : _TraceListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], TraceEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RollBack",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _RollBackListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteConnection(java.lang.String connectionString) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.SQLite.SQLiteConnection", connectionString);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "StateChange",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (StateChangeEventHandler handler : _StateChangeListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], StateChangeEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Changed",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SQLiteConnectionEventHandler handler : _ChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConnectionEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Progress",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SQLiteProgressEventHandler handler : _ProgressListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ProgressEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Authorize",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SQLiteAuthorizerEventHandler handler : _AuthorizeListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AuthorizerEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Update",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SQLiteUpdateEventHandler handler : _UpdateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], UpdateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Commit",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SQLiteCommitHandler handler : _CommitListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], CommitEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Trace",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SQLiteTraceEventHandler handler : _TraceListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], TraceEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RollBack",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _RollBackListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteConnection(java.lang.String connectionString, java.lang.Boolean parseViaFramework) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.Data.SQLite.SQLiteConnection", connectionString, parseViaFramework);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "StateChange",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (StateChangeEventHandler handler : _StateChangeListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], StateChangeEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Changed",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SQLiteConnectionEventHandler handler : _ChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConnectionEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Progress",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SQLiteProgressEventHandler handler : _ProgressListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ProgressEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Authorize",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SQLiteAuthorizerEventHandler handler : _AuthorizeListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AuthorizerEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Update",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SQLiteUpdateEventHandler handler : _UpdateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], UpdateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Commit",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SQLiteCommitHandler handler : _CommitListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], CommitEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Trace",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SQLiteTraceEventHandler handler : _TraceListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], TraceEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RollBack",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _RollBackListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteConnection(SQLiteConnection connection) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.SQLite.SQLiteConnection", connection);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "StateChange",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (StateChangeEventHandler handler : _StateChangeListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], StateChangeEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Changed",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SQLiteConnectionEventHandler handler : _ChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConnectionEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Progress",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SQLiteProgressEventHandler handler : _ProgressListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ProgressEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Authorize",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SQLiteAuthorizerEventHandler handler : _AuthorizeListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AuthorizerEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Update",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SQLiteUpdateEventHandler handler : _UpdateListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], UpdateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Commit",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SQLiteCommitHandler handler : _CommitListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], CommitEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Trace",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SQLiteTraceEventHandler handler : _TraceListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], TraceEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RollBack",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _RollBackListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteConnection(NObject handle) {
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
  public void Close() {
    try {
      javonetHandle.explicitInterface("jio.System.Data.IDbConnection").invoke("Close");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ChangeDatabase(java.lang.String databaseName) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Data.IDbConnection")
          .invoke("ChangeDatabase", databaseName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Open() {
    try {
      javonetHandle.explicitInterface("jio.System.Data.IDbConnection").invoke("Open");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
  public SQLiteErrorCode Shutdown() {
    try {
      Object res = javonetHandle.invoke("Shutdown");
      if (res == null) return null;
      return SQLiteErrorCode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void Shutdown(java.lang.Boolean directories, java.lang.Boolean noThrow) {
    try {
      Javonet.getType("System.Data.SQLite.SQLiteConnection")
          .invoke("Shutdown", directories, noThrow);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetExtendedResultCodes(java.lang.Boolean bOnOff) {
    try {
      javonetHandle.invoke("SetExtendedResultCodes", bOnOff);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode ResultCode() {
    try {
      Object res = javonetHandle.invoke("ResultCode");
      if (res == null) return null;
      return SQLiteErrorCode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode ExtendedResultCode() {
    try {
      Object res = javonetHandle.invoke("ExtendedResultCode");
      if (res == null) return null;
      return SQLiteErrorCode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void LogMessage(SQLiteErrorCode iErrCode, java.lang.String zMessage) {
    try {
      javonetHandle.invoke("LogMessage", NEnum.fromJavaEnum(iErrCode), zMessage);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void LogMessage(java.lang.Integer iErrCode, java.lang.String zMessage) {
    try {
      javonetHandle.invoke("LogMessage", iErrCode, zMessage);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ChangePassword(java.lang.String newPassword) {
    try {
      javonetHandle.invoke("ChangePassword", newPassword);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ChangePassword(java.lang.Byte[] newPassword) {
    try {
      javonetHandle.invoke("ChangePassword", new Object[] {newPassword});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetPassword(java.lang.String databasePassword) {
    try {
      javonetHandle.invoke("SetPassword", databasePassword);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetPassword(java.lang.Byte[] databasePassword) {
    try {
      javonetHandle.invoke("SetPassword", new Object[] {databasePassword});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode SetAvRetry(
      AtomicReference<java.lang.Integer> count, AtomicReference<java.lang.Integer> interval) {
    try {
      Object res = javonetHandle.invoke("SetAvRetry", new NRef(count), new NRef(interval));
      if (res == null) return null;
      return SQLiteErrorCode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode SetChunkSize(java.lang.Integer size) {
    try {
      Object res = javonetHandle.invoke("SetChunkSize", size);
      if (res == null) return null;
      return SQLiteErrorCode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DataTable GetSchema() {
    try {
      Object res = javonetHandle.invoke("GetSchema");
      if (res == null) return null;
      return new DataTable((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DataTable GetSchema(java.lang.String collectionName) {
    try {
      Object res = javonetHandle.invoke("GetSchema", collectionName);
      if (res == null) return null;
      return new DataTable((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DataTable GetSchema(
      java.lang.String collectionName, java.lang.String[] restrictionValues) {
    try {
      Object res =
          javonetHandle.invoke("GetSchema", collectionName, new Object[] {restrictionValues});
      if (res == null) return null;
      return new DataTable((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Object CreateHandle(IntPtr nativeHandle) {
    try {
      Object res =
          Javonet.getType("System.Data.SQLite.SQLiteConnection")
              .invoke("CreateHandle", nativeHandle);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BackupDatabase(
      SQLiteConnection destination,
      java.lang.String destinationName,
      java.lang.String sourceName,
      java.lang.Integer pages,
      SQLiteBackupCallback callback,
      java.lang.Integer retryMilliseconds) {
    try {
      javonetHandle.invoke(
          "BackupDatabase",
          destination,
          destinationName,
          sourceName,
          pages,
          callback,
          retryMilliseconds);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer ClearCachedSettings() {
    try {
      java.lang.Integer res = javonetHandle.invoke("ClearCachedSettings");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer ClearTypeMappings() {
    try {
      java.lang.Integer res = javonetHandle.invoke("ClearTypeMappings");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Dictionary<java.lang.String, Object> GetTypeMappings() {
    try {
      Object res = javonetHandle.invoke("GetTypeMappings");
      if (res == null) return null;
      return new Dictionary<java.lang.String, Object>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer AddTypeMapping(
      java.lang.String typeName, DbType dataType, java.lang.Boolean primary) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke("AddTypeMapping", typeName, NEnum.fromJavaEnum(dataType), primary);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer ClearTypeCallbacks() {
    try {
      java.lang.Integer res = javonetHandle.invoke("ClearTypeCallbacks");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean TryGetTypeCallbacks(
      java.lang.String typeName, SQLiteTypeCallbacks callbacks) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("TryGetTypeCallbacks", typeName, callbacks);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SetTypeCallbacks(
      java.lang.String typeName, SQLiteTypeCallbacks callbacks) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("SetTypeCallbacks", typeName, callbacks);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BindFunction(SQLiteFunctionAttribute functionAttribute, SQLiteFunction function) {
    try {
      javonetHandle.invoke("BindFunction", functionAttribute, function);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BindFunction(
      SQLiteFunctionAttribute functionAttribute, Delegate callback1, Delegate callback2) {
    try {
      javonetHandle.invoke("BindFunction", functionAttribute, callback1, callback2);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean UnbindFunction(SQLiteFunctionAttribute functionAttribute) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("UnbindFunction", functionAttribute);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean UnbindAllFunctions(java.lang.Boolean registered) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("UnbindAllFunctions", registered);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void CreateFile(java.lang.String databaseFileName) {
    try {
      Javonet.getType("System.Data.SQLite.SQLiteConnection").invoke("CreateFile", databaseFileName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SQLiteTransaction BeginTransaction(
      IsolationLevel isolationLevel, java.lang.Boolean deferredLock) {
    try {
      Object res =
          javonetHandle.invoke(
              "BeginTransaction", NEnum.fromJavaEnum(isolationLevel), deferredLock);
      if (res == null) return null;
      return new SQLiteTransaction((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SQLiteTransaction BeginTransaction(java.lang.Boolean deferredLock) {
    try {
      Object res = javonetHandle.invoke("BeginTransaction", deferredLock);
      if (res == null) return null;
      return new SQLiteTransaction((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SQLiteTransaction BeginTransaction(IsolationLevel isolationLevel) {
    try {
      Object res = javonetHandle.invoke("BeginTransaction", NEnum.fromJavaEnum(isolationLevel));
      if (res == null) return null;
      return new SQLiteTransaction((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SQLiteTransaction BeginTransaction() {
    try {
      Object res = javonetHandle.invoke("BeginTransaction");
      if (res == null) return null;
      return new SQLiteTransaction((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void ClearPool(SQLiteConnection connection) {
    try {
      Javonet.getType("System.Data.SQLite.SQLiteConnection").invoke("ClearPool", connection);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void ClearAllPools() {
    try {
      Javonet.getType("System.Data.SQLite.SQLiteConnection").invoke("ClearAllPools");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SQLiteCommand CreateCommand() {
    try {
      Object res = javonetHandle.invoke("CreateCommand");
      if (res == null) return null;
      return new SQLiteCommand((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void EnlistTransaction(Transaction transaction) {
    try {
      javonetHandle.invoke("EnlistTransaction", transaction);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetConfigurationOption(SQLiteConfigDbOpsEnum option, java.lang.Boolean enable) {
    try {
      javonetHandle.invoke("SetConfigurationOption", NEnum.fromJavaEnum(option), enable);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void EnableExtensions(java.lang.Boolean enable) {
    try {
      javonetHandle.invoke("EnableExtensions", enable);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void LoadExtension(java.lang.String fileName) {
    try {
      javonetHandle.invoke("LoadExtension", fileName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void LoadExtension(java.lang.String fileName, java.lang.String procName) {
    try {
      javonetHandle.invoke("LoadExtension", fileName, procName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CreateModule(SQLiteModule module) {
    try {
      javonetHandle.invoke("CreateModule", module);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SQLiteConnection OpenAndReturn() {
    try {
      Object res = javonetHandle.invoke("OpenAndReturn");
      if (res == null) return null;
      return new SQLiteConnection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Cancel() {
    try {
      javonetHandle.invoke("Cancel");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean IsReadOnly(java.lang.String name) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("IsReadOnly", name);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void GetMemoryStatistics(IDictionary<java.lang.String, java.lang.Long> statistics) {
    try {
      Javonet.getType("System.Data.SQLite.SQLiteConnection")
          .invoke("GetMemoryStatistics", statistics);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ReleaseMemory() {
    try {
      javonetHandle.invoke("ReleaseMemory");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static SQLiteErrorCode ReleaseMemory(
      java.lang.Integer nBytes,
      java.lang.Boolean reset,
      java.lang.Boolean compact,
      AtomicReference<java.lang.Integer> nFree,
      AtomicReference<java.lang.Boolean> resetOk,
      AtomicReference<java.lang.Long> nLargest) {
    try {
      Object res =
          Javonet.getType("System.Data.SQLite.SQLiteConnection")
              .invoke(
                  "ReleaseMemory",
                  nBytes,
                  reset,
                  compact,
                  new NRef(nFree),
                  new NRef(resetOk),
                  new NRef(nLargest));
      if (res == null) return null;
      return SQLiteErrorCode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static SQLiteErrorCode SetMemoryStatus(java.lang.Boolean value) {
    try {
      Object res =
          Javonet.getType("System.Data.SQLite.SQLiteConnection").invoke("SetMemoryStatus", value);
      if (res == null) return null;
      return SQLiteErrorCode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Event */

  private java.util.ArrayList<StateChangeEventHandler> _StateChangeListeners =
      new java.util.ArrayList<StateChangeEventHandler>();

  public void addStateChange(StateChangeEventHandler toAdd) {
    _StateChangeListeners.add(toAdd);
  }

  public void removeStateChange(StateChangeEventHandler toRemove) {
    _StateChangeListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<SQLiteConnectionEventHandler> _ChangedListeners =
      new java.util.ArrayList<SQLiteConnectionEventHandler>();

  public void addChanged(SQLiteConnectionEventHandler toAdd) {
    _ChangedListeners.add(toAdd);
  }

  public void removeChanged(SQLiteConnectionEventHandler toRemove) {
    _ChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<SQLiteProgressEventHandler> _ProgressListeners =
      new java.util.ArrayList<SQLiteProgressEventHandler>();

  public void addProgress(SQLiteProgressEventHandler toAdd) {
    _ProgressListeners.add(toAdd);
  }

  public void removeProgress(SQLiteProgressEventHandler toRemove) {
    _ProgressListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<SQLiteAuthorizerEventHandler> _AuthorizeListeners =
      new java.util.ArrayList<SQLiteAuthorizerEventHandler>();

  public void addAuthorize(SQLiteAuthorizerEventHandler toAdd) {
    _AuthorizeListeners.add(toAdd);
  }

  public void removeAuthorize(SQLiteAuthorizerEventHandler toRemove) {
    _AuthorizeListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<SQLiteUpdateEventHandler> _UpdateListeners =
      new java.util.ArrayList<SQLiteUpdateEventHandler>();

  public void addUpdate(SQLiteUpdateEventHandler toAdd) {
    _UpdateListeners.add(toAdd);
  }

  public void removeUpdate(SQLiteUpdateEventHandler toRemove) {
    _UpdateListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<SQLiteCommitHandler> _CommitListeners =
      new java.util.ArrayList<SQLiteCommitHandler>();

  public void addCommit(SQLiteCommitHandler toAdd) {
    _CommitListeners.add(toAdd);
  }

  public void removeCommit(SQLiteCommitHandler toRemove) {
    _CommitListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<SQLiteTraceEventHandler> _TraceListeners =
      new java.util.ArrayList<SQLiteTraceEventHandler>();

  public void addTrace(SQLiteTraceEventHandler toAdd) {
    _TraceListeners.add(toAdd);
  }

  public void removeTrace(SQLiteTraceEventHandler toRemove) {
    _TraceListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _RollBackListeners =
      new java.util.ArrayList<EventHandler>();

  public void addRollBack(EventHandler toAdd) {
    _RollBackListeners.add(toAdd);
  }

  public void removeRollBack(EventHandler toRemove) {
    _RollBackListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
