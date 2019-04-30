package jio.System.Data.SQLite;

public enum SQLiteAuthorizerReturnCode {
  Ok(0L),
  Deny(1L),
  Ignore(2L),
  ;
  private long numVal;

  SQLiteAuthorizerReturnCode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
