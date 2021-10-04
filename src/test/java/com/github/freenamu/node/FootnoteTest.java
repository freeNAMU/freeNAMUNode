package com.github.freenamu.node;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FootnoteTest {
    @Test
    public void test_equals() {
        assertEquals(new Footnote("test"), new Footnote("test"));
    }
}
