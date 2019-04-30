package jio.System.Data.SQLite;

public enum UpdateEventType {
  Delete(9L),
  Insert(18L),
  Update(23L),
  ;
  private long numVal;

  UpdateEventType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
