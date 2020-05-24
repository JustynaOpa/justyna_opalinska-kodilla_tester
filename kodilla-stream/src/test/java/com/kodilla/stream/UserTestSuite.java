package com.kodilla.stream;

import com.kodilla.stream.User;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    User user = new User("Dylan Poe", 25, 548, "Backing");
    @Test
    public void shouldReturnUserName(){
        String name = user.getUsername();
        Assert.assertEquals("Dylan Poe", name);
    }
    @Test
    public void shouldReturnAge(){
        int age = user.getAge();
        Assert.assertEquals(25,age);
    }
    @Test
    public void shouldReturnNumberOfPosts(){
        int nop = user.getNumberOfPosts();
        Assert.assertEquals(548, nop);
    }
    @Test
    public void shouldReturnGroup(){
        String group = user.getGroup();
        Assert.assertEquals("Backing", group);
    }
}
