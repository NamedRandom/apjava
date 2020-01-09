public class TunesTester {
  public static void main(String[] args) {
    Song s1 = new Song("Yellow", "Cold Play", 2.4);
    Song s2 = new Song("Clocks", "Cold Play", 3.56);
    System.out.println(s2);
    Playlist p = new Playlist("ColdPlayHits");
    if (p.addSong(s1)) System.out.println(s1 + " added");
    if (p.addSong(s2)) System.out.println(s2 + " added");
    System.out.println(p.totalSongs());
    System.out.println(p.playlistTime());
    if (p.removeSong(s2)) System.out.println(s2 + " deleted");
    System.out.println(p.totalSongs());
    p.addSong(s2);
    if (p.isSongInPlaylist("clocks")) System.out.println("clocks is in the playlist");
    else System.out.println("clocks is not in the playlist");
    p.songsByArtist("Cold Play"); // all info
    p.songsByArtist("Grease Monkey");
    Song s3 = new Song("Around the Sun", "REM", 4.30);
    Playlist favorites = new Playlist("favorites");
    if (favorites.addSong(s3)) System.out.println(s3 + " Added");
    if (favorites.addSong(s1)) System.out.println(s1 + " Added");
    if (favorites.addSongsFrom(p)) System.out.println(p + " Added");
    favorites.getList(); // getList() returns List<Song> type and toString() in ArrayList class
    Playlist test = new Playlist("test");
    test.addSong(s1);
    test.addSong(s2);
    System.out.println(test.addSongsFrom(new Playlist("empty")));
  }
}
