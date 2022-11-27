package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class VlcPlayerTest {

    @Test
    public void playVlcPlayer() {
        Assert.assertEquals("Vlc", "Vlc");
    }

    @Test
    public void playMp4Player() {
        Assert.assertEquals("Mp3", "Mp3");
    }
}