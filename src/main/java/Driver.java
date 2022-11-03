public class Driver {
    public static void main(String[] args) {
        MediaAdapter adapter = new MediaAdapter();
        adapter.playMusic("mp3", "song1.mp3");
        adapter.playMusic("mp4", "song2.mp4");
        adapter.playMusic("vlc", "song3.vlc");
        adapter.playMusic("wma", "song4.wma");
    }
}
