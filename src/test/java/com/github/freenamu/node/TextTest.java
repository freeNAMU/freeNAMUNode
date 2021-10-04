package com.github.freenamu.node;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TextTest {
    @Test
    public void test_equals() {
        assertEquals(new Text("test"), new Text("test"));
    }
}
