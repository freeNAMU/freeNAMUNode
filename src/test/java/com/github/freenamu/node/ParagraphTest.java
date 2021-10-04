package com.github.freenamu.node;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParagraphTest {
    @Test
    public void test_equals() {
        assertEquals(new Paragraph("test", 1, true), new Paragraph("test", 1, true));
    }
}
