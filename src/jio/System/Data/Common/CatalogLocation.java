package jio.System.Data.Common;

public enum CatalogLocation {
  Start(1L),
  End(2L),
  ;
  private long numVal;

  CatalogLocation(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
