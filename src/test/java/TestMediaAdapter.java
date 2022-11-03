import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TestMediaAdapter {
    @Test
    public void test_playMusic() {
        MediaAdapter mediaAdapter = new MediaAdapter();
        String audioType = "mp3";
        String fileName = "bunkus.mp3";

        String output = mediaAdapter.playMusic(audioType, fileName);
        Assert.assertEquals("Playing mp3 file: " + fileName, output);
    }
}
