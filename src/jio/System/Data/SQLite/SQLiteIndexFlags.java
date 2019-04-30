package jio.System.Data.SQLite;

public enum SQLiteIndexFlags {
  None(0L),
  ScanUnique(1L),
  ;
  private long numVal;

  SQLiteIndexFlags(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
