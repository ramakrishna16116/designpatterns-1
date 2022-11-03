public class MediaAdapter implements MusicPlayer {
    @Override
    public String playMusic(String fileType, String fileName) {
        if(fileType.equalsIgnoreCase("mp3")) {
            return "Playing mp3 file: " + fileName;
        } else if(fileType.equalsIgnoreCase("mp4")){
            return "Playing mp4 file: " + fileName;
        } else if(fileType.equalsIgnoreCase("vlc")){
            return "Playing vlc file: " + fileName;
        } else{
            return "Audio type not supported for the file: " + fileName;
        }
    }
}