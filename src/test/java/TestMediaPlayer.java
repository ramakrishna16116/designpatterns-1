import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TestMediaPlayer {
    @Test
    public void test_playMusic() {
        MediaPlayer mp = new MediaPlayer();
        String fileType = "mp3";
        String fileName = "file1.mp3";

        String output = mp.playMusic(fileType, fileName);
        Assert.assertEquals("Playing mp3 file: " + fileName, output);
    }
}
