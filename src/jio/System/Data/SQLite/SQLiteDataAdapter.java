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
import jio.System.*;
import jio.System.Data.SQLite.*;
import jio.System.ComponentModel.*;
import jio.System.Data.*;

public class SQLiteDataAdapter extends DbDataAdapter
    implements IComponent, IDisposable, IDataAdapter, IDbDataAdapter, ICloneable {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setSelectCommand(SQLiteCommand value) {
    try {
      javonetHandle.set("SelectCommand", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public SQLiteCommand getSelectCommand() {
    try {
      Object res = javonetHandle.<NObject>get("SelectCommand");
      if (res == null) return null;
      return new SQLiteCommand((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setInsertCommand(SQLiteCommand value) {
    try {
      javonetHandle.set("InsertCommand", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public SQLiteCommand getInsertCommand() {
    try {
      Object res = javonetHandle.<NObject>get("InsertCommand");
      if (res == null) return null;
      return new SQLiteCommand((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUpdateCommand(SQLiteCommand value) {
    try {
      javonetHandle.set("UpdateCommand", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public SQLiteCommand getUpdateCommand() {
    try {
      Object res = javonetHandle.<NObject>get("UpdateCommand");
      if (res == null) return null;
      return new SQLiteCommand((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDeleteCommand(SQLiteCommand value) {
    try {
      javonetHandle.set("DeleteCommand", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public SQLiteCommand getDeleteCommand() {
    try {
      Object res = javonetHandle.<NObject>get("DeleteCommand");
      if (res == null) return null;
      return new SQLiteCommand((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public SQLiteDataAdapter() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.SQLite.SQLiteDataAdapter");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "RowUpdating",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RowUpdatingEventArgs> handler : _RowUpdatingListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RowUpdatingEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RowUpdated",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RowUpdatedEventArgs> handler : _RowUpdatedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RowUpdatedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteDataAdapter(SQLiteCommand cmd) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.SQLite.SQLiteDataAdapter", cmd);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "RowUpdating",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RowUpdatingEventArgs> handler : _RowUpdatingListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RowUpdatingEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RowUpdated",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RowUpdatedEventArgs> handler : _RowUpdatedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RowUpdatedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteDataAdapter(java.lang.String commandText, SQLiteConnection connection) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.SQLite.SQLiteDataAdapter", commandText, connection);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "RowUpdating",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RowUpdatingEventArgs> handler : _RowUpdatingListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RowUpdatingEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RowUpdated",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RowUpdatedEventArgs> handler : _RowUpdatedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RowUpdatedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteDataAdapter(java.lang.String commandText, java.lang.String connectionString) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.Data.SQLite.SQLiteDataAdapter", commandText, connectionString);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "RowUpdating",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RowUpdatingEventArgs> handler : _RowUpdatingListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RowUpdatingEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RowUpdated",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RowUpdatedEventArgs> handler : _RowUpdatedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RowUpdatedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteDataAdapter(
      java.lang.String commandText,
      java.lang.String connectionString,
      java.lang.Boolean parseViaFramework) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Data.SQLite.SQLiteDataAdapter",
              commandText,
              connectionString,
              parseViaFramework);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "RowUpdating",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RowUpdatingEventArgs> handler : _RowUpdatingListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RowUpdatingEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RowUpdated",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<RowUpdatedEventArgs> handler : _RowUpdatedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], RowUpdatedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteDataAdapter(NObject handle) {
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
      javonetHandle.invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<RowUpdatingEventArgs>> _RowUpdatingListeners =
      new java.util.ArrayList<EventHandlerTEventArgs<RowUpdatingEventArgs>>();

  public void addRowUpdating(EventHandlerTEventArgs<RowUpdatingEventArgs> toAdd) {
    _RowUpdatingListeners.add(toAdd);
  }

  public void removeRowUpdating(EventHandlerTEventArgs<RowUpdatingEventArgs> toRemove) {
    _RowUpdatingListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<RowUpdatedEventArgs>> _RowUpdatedListeners =
      new java.util.ArrayList<EventHandlerTEventArgs<RowUpdatedEventArgs>>();

  public void addRowUpdated(EventHandlerTEventArgs<RowUpdatedEventArgs> toAdd) {
    _RowUpdatedListeners.add(toAdd);
  }

  public void removeRowUpdated(EventHandlerTEventArgs<RowUpdatedEventArgs> toRemove) {
    _RowUpdatedListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
