package jio.System.Data.SQLite;

public enum SQLiteConnectionEventType {
  Unknown(0L),
  Opening(1L),
  ConnectionString(2L),
  Opened(3L),
  ChangeDatabase(4L),
  NewTransaction(5L),
  EnlistTransaction(6L),
  NewCommand(7L),
  NewDataReader(8L),
  NewCriticalHandle(9L),
  Closing(10L),
  Closed(11L),
  DisposingCommand(12L),
  DisposingDataReader(13L),
  ClosingDataReader(14L),
  OpenedFromPool(15L),
  ClosedToPool(16L),
  Invalid(-1L),
  ;
  private long numVal;

  SQLiteConnectionEventType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
