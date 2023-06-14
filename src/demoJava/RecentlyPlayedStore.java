package demoJava;

import java.util.*;

class RecentlyPlayedStore {
    private int capacity;
    private Map<String, LinkedList<String>> store;

    public RecentlyPlayedStore(int capacity) {
        this.capacity = capacity;
        this.store = new HashMap<>();
    }

    public void addSong(String user, String song) {
        LinkedList<String> playlist = store.getOrDefault(user, new LinkedList<>());
        playlist.remove(song);
        playlist.addFirst(song); 
        if (playlist.size() > capacity) {
            playlist.removeLast(); 
            }

        store.put(user, playlist);
    }

    public List<String> getRecentlyPlayedSongs(String user) {
        return store.getOrDefault(user, new LinkedList<>());
    }
}

