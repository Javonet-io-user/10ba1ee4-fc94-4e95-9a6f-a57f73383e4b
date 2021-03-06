package jio.System.Data.Common;

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
import jio.System.ComponentModel.*;
import jio.System.*;
import jio.System.Data.*;

public abstract class DbDataAdapter extends DataAdapter
    implements IComponent, IDisposable, IDataAdapter, IDbDataAdapter, ICloneable {
  protected NObject javonetHandle;

  public DbDataAdapter(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IDbCommand getSelectCommand() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Data.IDbDataAdapter")
              .invoke("get_SelectCommand");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSelectCommand(IDbCommand value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Data.IDbDataAdapter")
          .invoke("set_SelectCommand", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IDbCommand getInsertCommand() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Data.IDbDataAdapter")
              .invoke("get_InsertCommand");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setInsertCommand(IDbCommand value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Data.IDbDataAdapter")
          .invoke("set_InsertCommand", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IDbCommand getUpdateCommand() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Data.IDbDataAdapter")
              .invoke("get_UpdateCommand");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUpdateCommand(IDbCommand value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Data.IDbDataAdapter")
          .invoke("set_UpdateCommand", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IDbCommand getDeleteCommand() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Data.IDbDataAdapter")
              .invoke("get_DeleteCommand");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDeleteCommand(IDbCommand value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Data.IDbDataAdapter")
          .invoke("set_DeleteCommand", value);
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

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
