package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class WCTest {

    @Test
    public void getWordCountTest(){
        WC counter = new WC(WC.class.getResource("/someTextFile.txt").getFile());
        counter.wordMap();

        int actual = counter.getWordCount("the");
        int expected = 6;

        Assert.assertEquals(expected, actual);
    }
}