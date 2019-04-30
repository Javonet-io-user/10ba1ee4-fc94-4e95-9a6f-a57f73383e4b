package jio.System.Data.SQLite;

public enum CollationTypeEnum {
  Custom(0L),
  Binary(1L),
  NoCase(2L),
  Reverse(3L),
  ;
  private long numVal;

  CollationTypeEnum(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
