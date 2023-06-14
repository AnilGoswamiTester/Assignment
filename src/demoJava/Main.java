package demoJava;
public class Main {
    public static void main(String[] args) {
        RecentlyPlayedStore store = new RecentlyPlayedStore(1);

        store.addSong("user1", "s1");
        store.addSong("user1", "s2");
        store.addSong("user1", "s3");
        System.out.println("User1's playlist: " + store.getRecentlyPlayedSongs("user1"));

        store.addSong("user1", "s4");
        System.out.println("User1's playlist after playing s4: " + store.getRecentlyPlayedSongs("user1"));

        store.addSong("user1", "s2");
        System.out.println("User1's playlist after playing s2: " + store.getRecentlyPlayedSongs("user1"));

        store.addSong("user1", "s1");
        System.out.println("User1's playlist after playing s1: " + store.getRecentlyPlayedSongs("user1"));
    }
}
