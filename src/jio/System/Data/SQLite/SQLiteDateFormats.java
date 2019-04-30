package jio.System.Data.SQLite;

public enum SQLiteDateFormats {
  Ticks(0L),
  ISO8601(1L),
  JulianDay(2L),
  UnixEpoch(3L),
  InvariantCulture(4L),
  CurrentCulture(5L),
  ;
  private long numVal;

  SQLiteDateFormats(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
