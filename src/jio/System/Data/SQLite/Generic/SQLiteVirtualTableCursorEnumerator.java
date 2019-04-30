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
import jio.System.Collections.*;

public class SQLiteVirtualTableCursorEnumerator<T>
    extends jio.System.Data.SQLite.SQLiteVirtualTableCursorEnumerator
    implements ISQLiteNativeHandle,
        IDisposable,
        jio.System.Collections.IEnumerator,
        jio.System.Collections.Generic.IEnumerator<T> {
  protected NObject javonetHandle;
  /** GenericConstructor */
  @MethodTypeAnnotation(type = "GetField")
  public SQLiteVirtualTableCursorEnumerator(
      SQLiteVirtualTable table,
      jio.System.Collections.Generic.IEnumerator<T> enumerator,
      Class<?> T) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.getType(
                  "System.Data.SQLite.Generic.SQLiteVirtualTableCursorEnumerator`1",
                  getReturnObjectName(T))
              .create();
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteVirtualTableCursorEnumerator(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Close() {
    try {
      javonetHandle.invoke("Close");
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
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "Method")
  public T getCurrent(Class<?> returnType) {
    try {
      Object res = javonetHandle.invoke("get_Current");
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
