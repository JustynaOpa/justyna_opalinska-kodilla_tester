package com.kodilla.collections.interfaces.sets.homework;

import com.kodilla.collections.sets.homework.Stamp;
import org.junit.Assert;
import org.junit.Test;

public class StampTestSuite {
    Stamp stamp = new Stamp("Krakow",10, 8, true);
    @Test
    public void shouldReturnNameOfStamp(){
        String result = stamp.getStampName();
        Assert.assertEquals("Krakow", result);
    }
    @Test
    public void shouldReturnLengthAndWidthOfStamp(){
        double length = stamp.getLength();
        double width = stamp.getWidth();

        Assert.assertEquals(10, length, 0.01);
        Assert.assertEquals(8, width, 0.01);
    }
    @Test
    public void shouldReturnPostmark(){
        boolean postmark = stamp.isPostmark();
        Assert.assertTrue(postmark);

        int other = stamp.hashCode();
        Assert.assertEquals("Krakow",10,8, other);
    }

}
