package jio.System.Data.SQLite;

public enum SQLiteConfigDbOpsEnum {
  SQLITE_DBCONFIG_NONE(0L),
  SQLITE_DBCONFIG_LOOKASIDE(1001L),
  SQLITE_DBCONFIG_ENABLE_FKEY(1002L),
  SQLITE_DBCONFIG_ENABLE_TRIGGER(1003L),
  SQLITE_DBCONFIG_ENABLE_FTS3_TOKENIZER(1004L),
  SQLITE_DBCONFIG_ENABLE_LOAD_EXTENSION(1005L),
  ;
  private long numVal;

  SQLiteConfigDbOpsEnum(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
