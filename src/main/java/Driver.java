public class Driver {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        System.out.println(audioPlayer.playMusic("mp3", "song1.mp3"));
        System.out.println(audioPlayer.playMusic("mp4", "song2.mp4"));
        System.out.println(audioPlayer.playMusic("vlc", "song3.vlc"));
        System.out.println(audioPlayer.playMusic("wma", "song4.wma"));
        
        
        
        
    }
}
