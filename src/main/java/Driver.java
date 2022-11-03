public class Driver {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.playMusic("mp3", "song1.mp3");

        mediaPlayer.playMusic("mp4","song2.mp4");

        mediaPlayer.playMusic("vlc","song3.vlc");

        mediaPlayer.playMusic("wma", "song4.wma");
    }
}
