public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;
    // Create object accordingly
    public MediaAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        }
        else if(audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
        else;
    }

    // playMusic() will call the right method from the right class
    @Override
    public void playMusic(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlcPlayer(fileName);
        }
        else if(audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4Player(fileName);
        }
        else;
    }
}
