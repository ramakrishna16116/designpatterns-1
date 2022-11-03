public class Driver {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        System.out.println(mediaPlayer.playMusic("mp3", "song1.mp3"));
        System.out.println(mediaPlayer.playMusic("mp4", "song2.mp4"));
        System.out.println(mediaPlayer.playMusic("vlc", "song3.vlc"));
        System.out.println(mediaPlayer.playMusic("wma", "song4.wma"));
    }
}
