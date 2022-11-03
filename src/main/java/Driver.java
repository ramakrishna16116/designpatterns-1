
public class Driver {
    public static void main(String[] args) {
        MediaAdapter maVlc = new MediaAdapter("vlc");
        MediaAdapter maMp4 = new MediaAdapter("mp4");

        maMp4.playMusic("mp3", "song1.mp3");
        maMp4.playMp4Player("song2.mp4");
        maVlc.playVlcPlayer("song3.vlc");
        maVlc.playMusic("wma", "song4.wma");
    }
}
