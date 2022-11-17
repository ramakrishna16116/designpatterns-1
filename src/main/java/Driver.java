public class Driver {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.playMusic("mp3", "song1.mp3");

        Mp4Player mp4MusicPlayer = new Mp4Player();
        mp4MusicPlayer.playMp4Player("song2.mp4");

        VlcPlayer vlcMusicPlayer = new VlcPlayer();
        vlcMusicPlayer.playVlcPlayer("song3.vlc");

        MusicPlayer player = new AudioPlayer();
        player.playMusic("mp3","song1.mp3");
        player = new MusicAdapter(new Mp4Player());
        player.playMusic("mp4","song2.mp4");
        player = new MusicAdapter(new VlcPlayer());
        player.playMusic("file.avi","song3.vlc");

    }
}