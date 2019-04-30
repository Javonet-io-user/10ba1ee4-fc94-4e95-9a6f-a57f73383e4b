package jio.System.Data.SQLite;

public enum SQLiteProgressReturnCode {
  Continue(0L),
  Interrupt(1L),
  ;
  private long numVal;

  SQLiteProgressReturnCode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
