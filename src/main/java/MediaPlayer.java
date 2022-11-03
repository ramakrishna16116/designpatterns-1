public class MediaPlayer implements MusicPlayer{
    @Override
    public void playMusic(String audioType, String fileName) {
        switch(audioType) {
            case "mp3":
                AudioPlayer audioPlayer = new AudioPlayer();
                audioPlayer.playMusic(audioType, fileName);
            case "mp4":
                Mp4Player mp4Player = new Mp4Player();
                mp4Player.playMp4Player(fileName);
            case "vlc":
                VlcPlayer vlcPlayer = new VlcPlayer();
                vlcPlayer.playVlcPlayer(fileName);
            default:
                System.out.println("Media type not supported.");
        }
    }
}
