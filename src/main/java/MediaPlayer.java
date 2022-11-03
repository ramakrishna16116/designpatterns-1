public class MediaPlayer implements MusicPlayer{
    @Override
    public String playMusic(String audioType, String fileName) {
        switch(audioType) {
            case "mp3":
                AudioPlayer audioPlayer = new AudioPlayer();
                return audioPlayer.playMusic(audioType, fileName);
            case "mp4":
                Mp4Player mp4Player = new Mp4Player();
                return mp4Player.playMp4Player(fileName);
            case "vlc":
                VlcPlayer vlcPlayer = new VlcPlayer();
                return vlcPlayer.playVlcPlayer(fileName);
            default:
                return "Media type not supported.";
        }
    }
}
