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
import jio.System.*;

public interface ISQLiteNativeModule {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode xCreate(
      IntPtr pDb, IntPtr pAux, java.lang.Integer argc, IntPtr argv, IntPtr pVtab, IntPtr pError);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode xConnect(
      IntPtr pDb, IntPtr pAux, java.lang.Integer argc, IntPtr argv, IntPtr pVtab, IntPtr pError);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode xBestIndex(IntPtr pVtab, IntPtr pIndex);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode xDisconnect(IntPtr pVtab);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode xDestroy(IntPtr pVtab);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode xOpen(IntPtr pVtab, IntPtr pCursor);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode xClose(IntPtr pCursor);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode xFilter(
      IntPtr pCursor, java.lang.Integer idxNum, IntPtr idxStr, java.lang.Integer argc, IntPtr argv);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode xNext(IntPtr pCursor);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer xEof(IntPtr pCursor);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode xColumn(IntPtr pCursor, IntPtr pContext, java.lang.Integer index);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode xRowId(IntPtr pCursor, AtomicReference<java.lang.Long> rowId);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode xUpdate(
      IntPtr pVtab, java.lang.Integer argc, IntPtr argv, AtomicReference<java.lang.Long> rowId);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode xBegin(IntPtr pVtab);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode xSync(IntPtr pVtab);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode xCommit(IntPtr pVtab);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode xRollback(IntPtr pVtab);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer xFindFunction(
      IntPtr pVtab,
      java.lang.Integer nArg,
      IntPtr zName,
      SQLiteCallback callback,
      IntPtr pClientData);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode xRename(IntPtr pVtab, IntPtr zNew);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode xSavepoint(IntPtr pVtab, java.lang.Integer iSavepoint);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode xRelease(IntPtr pVtab, java.lang.Integer iSavepoint);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode xRollbackTo(IntPtr pVtab, java.lang.Integer iSavepoint);
}
