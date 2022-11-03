import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TestMediaPlayer {
    @Test
    public void testPlayMusic(){
        MediaPlayer mediaPlayer = new MediaPlayer();
        Assert.assertEquals(mediaPlayer.playMusic("mp3", "song1.mp3"), "Playing mp3 file: song1.mp3");
        Assert.assertEquals(mediaPlayer.playMusic("mp4", "song2.mp4"), "Playing mp4 file: song2.mp4");
        Assert.assertEquals(mediaPlayer.playMusic("vlc", "song3.vlc"), "Playing vlc file: song3.vlc");
        Assert.assertEquals(mediaPlayer.playMusic("wma", "song4.wma"), "Media type not supported.");
    }
}
