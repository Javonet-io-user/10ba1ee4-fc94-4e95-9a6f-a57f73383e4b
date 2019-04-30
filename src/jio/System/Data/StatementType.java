package jio.System.Data;

public enum StatementType {
  Select(0L),
  Insert(1L),
  Update(2L),
  Delete(3L),
  Batch(4L),
  ;
  private long numVal;

  StatementType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
