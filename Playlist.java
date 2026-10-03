import java.util.Arrays;

public class Playlist {
    private final String[] songs;
    private int count;

    public Playlist(int maxSize) {
        songs = new String[maxSize];
        count = 0;
    }

    public void addSong(String title) {
        if (count < songs.length) {
            songs[count] = title;
            count++;
        }
    }

    // Returns a COPY of the internal array, not the original reference
    public String[] getSongs() {
        return Arrays.copyOf(songs, count);
    }

    public int getSongCount() {
        return count;
    }

    public static void main(String[] args) {
        Playlist p = new Playlist(10);
        p.addSong("Song A");
        p.addSong("Song B");

        String[] copy = p.getSongs();
        System.out.println(Arrays.toString(copy)); // [Song A, Song B]

        copy[0] = "Hacked"; // only changes the copy
        System.out.println(p.getSongs()[0]);        // still "Song A"
        System.out.println(p.getSongCount());        // 2
    }
}