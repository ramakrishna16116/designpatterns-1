import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class TestMp4Player {
    /* setUpStreams() and restoreStreams() are set up to test Console Output. Link is below
     * https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
     */
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void testMp4Player() {
        String output = "Playing mp4 file: song2.mp4\n";
        String input = "song2.mp4";
        Mp4Player mp4Player = new Mp4Player();
        mp4Player.playMp4Player(input);
        assertEquals(output, outContent.toString());
    }
}
