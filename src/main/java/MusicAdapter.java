public class MusicAdapter {
    Mp4Player mp4Player = new Mp4Player();
    VlcPlayer vlcPlayer = new VlcPlayer();

    public String playMusic(String audioType, String fileName){
        if(audioType.equalsIgnoreCase("mp4")){
            return mp4Player.playMp4Player(fileName);
        } else if(audioType.equalsIgnoreCase("vlc")){
            return vlcPlayer.playVlcPlayer(fileName);
        } else {
            return "Unsupported file type for the file: " + fileName;
        }
    }

}
