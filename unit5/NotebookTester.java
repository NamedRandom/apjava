class NotebookTester {
  public static void main(String[] args) {

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

    Notebook book2;
    book2 = new Notebook();
    book2.storeNote("one");
    book2.storeNote("two");
    book2.storeNote("three");
    book2.listNotes();
    book2.swapNotes(1);
    book2.listNotes();
  }
}
