package jio.System.Data.SQLite.Generic;

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
import jio.System.Data.SQLite.Generic.*;
import jio.System.*;
import jio.System.Collections.Generic.*;

public class SQLiteModuleEnumerable<T> extends jio.System.Data.SQLite.SQLiteModuleEnumerable
    implements ISQLiteManagedModule, IDisposable {
  protected NObject javonetHandle;
  /** GenericConstructor */
  @MethodTypeAnnotation(type = "GetField")
  public SQLiteModuleEnumerable(java.lang.String name, IEnumerable<T> enumerable, Class<?> T) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.getType(
                  "System.Data.SQLite.Generic.SQLiteModuleEnumerable`1", getReturnObjectName(T))
              .create();
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteModuleEnumerable(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode Open(SQLiteVirtualTable table, SQLiteVirtualTableCursor cursor) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Data.SQLite.ISQLiteManagedModule")
              .invoke("Open", table, cursor);
      if (res == null) return null;
      return SQLiteErrorCode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode Column(
      SQLiteVirtualTableCursor cursor, SQLiteContext context, java.lang.Integer index) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Data.SQLite.ISQLiteManagedModule")
              .invoke("Column", cursor, context, index);
      if (res == null) return null;
      return SQLiteErrorCode.valueOf(((NEnum) res).getValueName());
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
