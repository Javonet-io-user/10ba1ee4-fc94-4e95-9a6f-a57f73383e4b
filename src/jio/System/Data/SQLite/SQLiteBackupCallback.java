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

public interface SQLiteBackupCallback {
  /** Method */
  @MethodTypeAnnotation(type = "DelegateMethod")
  public java.lang.Boolean Invoke(
      SQLiteConnection source,
      java.lang.String sourceName,
      SQLiteConnection destination,
      java.lang.String destinationName,
      java.lang.Integer pages,
      java.lang.Integer remainingPages,
      java.lang.Integer totalPages,
      java.lang.Boolean retry);
}
