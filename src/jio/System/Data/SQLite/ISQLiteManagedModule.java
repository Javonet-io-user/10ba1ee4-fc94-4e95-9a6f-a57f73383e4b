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

public interface ISQLiteManagedModule {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode Create(
      SQLiteConnection connection,
      IntPtr pClientData,
      java.lang.String[] arguments,
      SQLiteVirtualTable table,
      AtomicReference<java.lang.String> error);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode Connect(
      SQLiteConnection connection,
      IntPtr pClientData,
      java.lang.String[] arguments,
      SQLiteVirtualTable table,
      AtomicReference<java.lang.String> error);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode BestIndex(SQLiteVirtualTable table, SQLiteIndex index);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode Disconnect(SQLiteVirtualTable table);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode Destroy(SQLiteVirtualTable table);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode Open(SQLiteVirtualTable table, SQLiteVirtualTableCursor cursor);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode Close(SQLiteVirtualTableCursor cursor);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode Filter(
      SQLiteVirtualTableCursor cursor,
      java.lang.Integer indexNumber,
      java.lang.String indexString,
      SQLiteValue[] values);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode Next(SQLiteVirtualTableCursor cursor);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Eof(SQLiteVirtualTableCursor cursor);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode Column(
      SQLiteVirtualTableCursor cursor, SQLiteContext context, java.lang.Integer index);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode RowId(
      SQLiteVirtualTableCursor cursor, AtomicReference<java.lang.Long> rowId);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode Update(
      SQLiteVirtualTable table, SQLiteValue[] values, AtomicReference<java.lang.Long> rowId);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode Begin(SQLiteVirtualTable table);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode Sync(SQLiteVirtualTable table);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode Commit(SQLiteVirtualTable table);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode Rollback(SQLiteVirtualTable table);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean FindFunction(
      SQLiteVirtualTable table,
      java.lang.Integer argumentCount,
      java.lang.String name,
      SQLiteFunction function,
      IntPtr pClientData);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode Rename(SQLiteVirtualTable table, java.lang.String newName);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode Savepoint(SQLiteVirtualTable table, java.lang.Integer savepoint);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode Release(SQLiteVirtualTable table, java.lang.Integer savepoint);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode RollbackTo(SQLiteVirtualTable table, java.lang.Integer savepoint);
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getDeclared();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getName();
}
