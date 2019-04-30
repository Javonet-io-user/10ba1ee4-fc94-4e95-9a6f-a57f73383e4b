package jio.System.Data.SQLite;

public enum TypeAffinity {
  Uninitialized(0L),
  Int64(1L),
  Double(2L),
  Text(3L),
  Blob(4L),
  Null(5L),
  DateTime(10L),
  None(11L),
  ;
  private long numVal;

  TypeAffinity(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
