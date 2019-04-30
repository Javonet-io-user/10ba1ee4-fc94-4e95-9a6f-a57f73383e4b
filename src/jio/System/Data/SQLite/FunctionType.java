package jio.System.Data.SQLite;

public enum FunctionType {
  Scalar(0L),
  Aggregate(1L),
  Collation(2L),
  ;
  private long numVal;

  FunctionType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
