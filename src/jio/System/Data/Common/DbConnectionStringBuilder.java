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
import jio.System.Collections.*;
import jio.System.ComponentModel.*;
import jio.System.*;

public class DbConnectionStringBuilder
    implements IDictionary, ICollection, IEnumerable, ICustomTypeDescriptor, Iterable<Object> {
  protected NObject javonetHandle;

  @Override
  public Iterator<Object> iterator() {
    return (Iterator<Object>) this.IDictionary_GetEnumerator();
  }

  public DbConnectionStringBuilder() {
    try {
      javonetHandle = Javonet.New("System.Data.Common.DbConnectionStringBuilder");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DbConnectionStringBuilder(java.lang.Boolean useOdbcRules) {
    try {
      javonetHandle = Javonet.New("System.Data.Common.DbConnectionStringBuilder", useOdbcRules);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DbConnectionStringBuilder(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean IDictionary_Contains(Object keyword) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IDictionary")
              .invoke("Contains", keyword);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Add(Object keyword, Object value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Collections.IDictionary")
          .invoke("Add", keyword, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IDictionaryEnumerator IDictionary_GetEnumerator() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IDictionary")
              .invoke("GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void IDictionary_Remove(Object keyword) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Collections.IDictionary")
          .invoke("Remove", keyword);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CopyTo(java.lang.reflect.Array array, java.lang.Integer index) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Collections.ICollection")
          .invoke("CopyTo", array, index);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Object getSyncRoot() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.ICollection")
              .invoke("get_SyncRoot");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsSynchronized() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Collections.ICollection")
              .invoke("get_IsSynchronized");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IEnumerator IEnumerable_GetEnumerator() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IEnumerable")
              .invoke("GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public AttributeCollection GetAttributes() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.ICustomTypeDescriptor")
              .invoke("GetAttributes");
      if (res == null) return null;
      return new AttributeCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetClassName() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.ICustomTypeDescriptor")
              .invoke("GetClassName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetComponentName() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.ICustomTypeDescriptor")
              .invoke("GetComponentName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TypeConverter GetConverter() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.ICustomTypeDescriptor")
              .invoke("GetConverter");
      if (res == null) return null;
      return new TypeConverter((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public EventDescriptor GetDefaultEvent() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.ICustomTypeDescriptor")
              .invoke("GetDefaultEvent");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public PropertyDescriptor GetDefaultProperty() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.ICustomTypeDescriptor")
              .invoke("GetDefaultProperty");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Object GetEditor(jio.System.Type editorBaseType) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.ICustomTypeDescriptor")
              .invoke("GetEditor", editorBaseType);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public EventDescriptorCollection GetEvents() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.ICustomTypeDescriptor")
              .invoke("GetEvents");
      if (res == null) return null;
      return new EventDescriptorCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public EventDescriptorCollection GetEvents(Attribute[] attributes) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.ICustomTypeDescriptor")
              .invoke("GetEvents", new Object[] {attributes});
      if (res == null) return null;
      return new EventDescriptorCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public PropertyDescriptorCollection GetProperties() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.ICustomTypeDescriptor")
              .invoke("GetProperties");
      if (res == null) return null;
      return new PropertyDescriptorCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public PropertyDescriptorCollection GetProperties(Attribute[] attributes) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.ICustomTypeDescriptor")
              .invoke("GetProperties", new Object[] {attributes});
      if (res == null) return null;
      return new PropertyDescriptorCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Object GetPropertyOwner(PropertyDescriptor pd) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.ICustomTypeDescriptor")
              .invoke("GetPropertyOwner", pd);
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
