
/**
 * SongNode.java
 *
 * Represents a song of a playlist.
 *
 * Your Name:Defne Lal Atak
 * Your Student ID: 240444048
 * Your Date:19/10/2026
 */
public class SongNode {
    String title;
    SongNode prev;
    SongNode next;
    public SongNode(String title) {
        this.title = title;
        prev = null;
        next = null;
    }
}