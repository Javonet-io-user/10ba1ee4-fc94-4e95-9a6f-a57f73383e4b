package jio.System.Data.SQLite;

public enum CollationEncodingEnum {
  UTF8(1L),
  UTF16LE(2L),
  UTF16BE(3L),
  ;
  private long numVal;

  CollationEncodingEnum(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
