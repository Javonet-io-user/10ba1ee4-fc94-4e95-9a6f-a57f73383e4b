package jio.System.Data.SQLite;

public enum SQLiteAuthorizerActionCode {
  Copy(0L),
  CreateIndex(1L),
  CreateTable(2L),
  CreateTempIndex(3L),
  CreateTempTable(4L),
  CreateTempTrigger(5L),
  CreateTempView(6L),
  CreateTrigger(7L),
  CreateView(8L),
  Delete(9L),
  DropIndex(10L),
  DropTable(11L),
  DropTempIndex(12L),
  DropTempTable(13L),
  DropTempTrigger(14L),
  DropTempView(15L),
  DropTrigger(16L),
  DropView(17L),
  Insert(18L),
  Pragma(19L),
  Read(20L),
  Select(21L),
  Transaction(22L),
  Update(23L),
  Attach(24L),
  Detach(25L),
  AlterTable(26L),
  Reindex(27L),
  Analyze(28L),
  CreateVtable(29L),
  DropVtable(30L),
  Function(31L),
  Savepoint(32L),
  Recursive(33L),
  None(-1L),
  ;
  private long numVal;

  SQLiteAuthorizerActionCode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
