import java.util.ArrayList;

/**
 * A class to maintain an arbitrarily long list of notes. Notes are numbered for external reference
 * by a human user. In this version, note numbers start at 0.
 *
 * @author David J. Barnes and Michael Kolling.
 * @version 2006.03.30
 */
public class Notebook {
  // Storage for an arbitrary number of notes.
  private ArrayList<String> notes;
  /** Perform any initialization that is required for the notebook. */
  public Notebook() {
    notes = new ArrayList<String>();
  }
  /**
   * Store a new note into the notebook.
   *
   * @param note The note to be stored.
   */
  public void storeNote(String note) {
    notes.add(note);
  }

  public void storeUrgentNote(String note) {
    notes.add(0, "Urgent: " + note);
  }
  /** @return The number of notes currently in the notebook. */
  public int numberOfNotes() {
    return notes.size();
  }
  /**
   * Remove a note from the notebook if it exists.
   *
   * @param noteNumber The number of the note to be removed.
   */
  public void removeNote(int noteNumber) {
    if (noteNumber < 0) {
      // This is not a valid note number, so do nothing.
    } else if (noteNumber < numberOfNotes()) {
      // This is a valid note number.
      notes.remove(noteNumber);
    } else {
      // This is not a valid note number, so do nothing.
    }
  }

  public void demoteNote(int noteNumber) {
    if (noteNumber < 0) return;
    if (noteNumber > numberOfNotes()) return;

    if (notes.get(noteNumber).startsWith("Urgent: ")) notes.add(notes.get(noteNumber).substring(8));
    else notes.add(notes.get(noteNumber));

    this.removeNote(noteNumber);
  }

  public void swapNotes(int noteNumber) {
    if (noteNumber < 0) return;
    if (noteNumber > numberOfNotes()) return;

	if(notes.get(noteNumber).startsWith("Urgent: ")) demoteNote(noteNumber);
    notes.add(noteNumber + 2, notes.get(noteNumber));
    this.removeNote(noteNumber);
  }
  /** List all notes in the notebook. */
  public void listNotes() {
    for (String note : notes) {
      System.out.println(notes.indexOf(note) + ") " + note);
    }
  }

  public void listUrgentNotes() {
    for (String note : notes) {
      if (note.startsWith("Urgent: ")) System.out.println(notes.indexOf(note) + ") " + note);
    }
  }
}
