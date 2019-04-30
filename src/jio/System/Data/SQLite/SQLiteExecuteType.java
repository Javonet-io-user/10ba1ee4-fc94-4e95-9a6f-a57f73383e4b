package jio.System.Data.SQLite;

public enum SQLiteExecuteType {
  None(0L),
  Default(1L),
  Scalar(2L),
  Reader(3L),
  ;
  private long numVal;

  SQLiteExecuteType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
