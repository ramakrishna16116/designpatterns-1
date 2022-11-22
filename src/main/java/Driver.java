public class Driver {
    public static void main(String[] args) {
        /* Instead of creating four new objects inside the driver,
         * we only have to create one and use one method thanks to the adapter
         * The console output is the exact same as before
         */
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.playMusic("mp3", "song1.mp3");
        audioPlayer.playMusic("song2.mp4");
        audioPlayer.playMusic("song3.vlc");
        audioPlayer.playMusic("wma", "song4.wma");
    }
}
