package jio.System.Data.SQLite;

public enum SQLiteIndexConstraintOp {
  EqualTo(2L),
  GreaterThan(4L),
  LessThanOrEqualTo(8L),
  LessThan(16L),
  GreaterThanOrEqualTo(32L),
  Match(64L),
  Like(65L),
  Glob(66L),
  Regexp(67L),
  ;
  private long numVal;

  SQLiteIndexConstraintOp(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
