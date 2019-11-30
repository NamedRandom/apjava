class NotebookTester {
  public static void main(String[] args) {
    /*
    Notebook book = new Notebook();
    book.storeNote("This is my first note.");
    book.storeNote("Second note.");
    book.listNotes();
    System.out.println();
    book.storeUrgentNote("This is apparently urgent.");
    book.listNotes();
    System.out.println();
    book.removeNote(0);
    book.listNotes();
    System.out.println();
    book.storeUrgentNote("This is apparently urgent.");
    book.storeUrgentNote("This is also urgent.");
    book.listUrgentNotes();
    System.out.println();
    book.demoteNote(0);
    book.demoteNote(1);
    book.listNotes();
    System.out.println();
    */
    Notebook book;
    book = new Notebook();
    book.storeNote("one");
    book.storeNote("two");
    book.storeNote("three");
    book.listNotes();
    book.swapNotes(1);
    book.listNotes();
  }
}
