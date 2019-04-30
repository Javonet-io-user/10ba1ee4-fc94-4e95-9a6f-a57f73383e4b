package jio.System.Data.SQLite;

public enum SQLiteConnectionFlags {
  None(0L),
  LogPrepare(1L),
  LogPreBind(2L),
  LogBind(4L),
  LogCallbackException(8L),
  LogBackup(16L),
  NoExtensionFunctions(32L),
  BindUInt32AsInt64(64L),
  BindAllAsText(128L),
  GetAllAsText(256L),
  BindAndGetAllAsText(384L),
  NoLoadExtension(512L),
  NoCreateModule(1024L),
  NoBindFunctions(2048L),
  NoLogModule(4096L),
  LogModuleError(8192L),
  LogModuleException(16384L),
  Default(16392L),
  DefaultAndLogAll(24607L),
  TraceWarning(32768L),
  ConvertInvariantText(65536L),
  BindInvariantText(131072L),
  BindAndGetAllAsInvariantText(131456L),
  ConvertAndBindInvariantText(196608L),
  ConvertAndBindAndGetAllAsInvariantText(196992L),
  NoConnectionPool(262144L),
  UseConnectionPool(524288L),
  UseConnectionTypes(1048576L),
  NoGlobalTypes(2097152L),
  StickyHasRows(4194304L),
  StrictEnlistment(8388608L),
  MapIsolationLevels(16777216L),
  DetectTextAffinity(33554432L),
  DetectStringType(67108864L),
  NoConvertSettings(134217728L),
  BindDateTimeWithKind(268435456L),
  RollbackOnException(536870912L),
  DenyOnException(1073741824L),
  InterruptOnException(2147483648L),
  UnbindFunctionsOnClose(4294967296L),
  NoVerifyTextAffinity(8589934592L),
  UseConnectionBindValueCallbacks(17179869184L),
  UseConnectionReadValueCallbacks(34359738368L),
  UseConnectionAllValueCallbacks(51539607552L),
  UseParameterNameForTypeName(68719476736L),
  UseParameterDbTypeForTypeName(137438953472L),
  UseParameterAnythingForTypeName(206158430208L),
  NoVerifyTypeAffinity(274877906944L),
  ;
  private long numVal;

  SQLiteConnectionFlags(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
