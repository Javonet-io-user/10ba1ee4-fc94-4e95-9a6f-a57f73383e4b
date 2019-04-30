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
import jio.System.*;
import jio.System.Data.Common.*;
import jio.System.Data.*;

public class DataTableMapping extends MarshalByRefObject implements ITableMapping, ICloneable {
  protected NObject javonetHandle;

  public DataTableMapping() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.Common.DataTableMapping");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DataTableMapping(java.lang.String sourceTable, java.lang.String dataSetTable) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.Common.DataTableMapping", sourceTable, dataSetTable);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DataTableMapping(
      java.lang.String sourceTable,
      java.lang.String dataSetTable,
      DataColumnMapping[] columnMappings) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Data.Common.DataTableMapping",
              sourceTable,
              dataSetTable,
              new Object[] {columnMappings});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DataTableMapping(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IColumnMappingCollection getColumnMappings() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Data.ITableMapping")
              .invoke("get_ColumnMappings");
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

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
