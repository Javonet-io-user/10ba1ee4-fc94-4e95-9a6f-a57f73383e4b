package jio.System.Data.SQLite;

public enum SQLiteJournalModeEnum {
  Delete(0L),
  Persist(1L),
  Off(2L),
  Truncate(3L),
  Memory(4L),
  Wal(5L),
  Default(-1L),
  ;
  private long numVal;

  SQLiteJournalModeEnum(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
