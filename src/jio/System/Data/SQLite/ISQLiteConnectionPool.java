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
import jio.System.Collections.Generic.*;
import jio.System.*;

public interface ISQLiteConnectionPool {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void GetCounts(
      java.lang.String fileName,
      Dictionary<java.lang.String, java.lang.Integer> counts,
      AtomicReference<java.lang.Integer> openCount,
      AtomicReference<java.lang.Integer> closeCount,
      AtomicReference<java.lang.Integer> totalCount);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void ClearPool(java.lang.String fileName);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void ClearAllPools();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Add(java.lang.String fileName, Object handle, java.lang.Integer version);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public Object Remove(
      java.lang.String fileName,
      java.lang.Integer maxPoolSize,
      AtomicReference<java.lang.Integer> version);
}
