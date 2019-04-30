package jio.System.Data.SQLite;

public enum SynchronizationModes {
  Normal(0L),
  Full(1L),
  Off(2L),
  ;
  private long numVal;

  SynchronizationModes(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
