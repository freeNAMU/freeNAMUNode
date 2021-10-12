package com.github.freenamu.node;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ParagraphTest {
    @Test
    public void test_equals() {
        List<Node> title1 = new ArrayList<>();
        title1.add(new Text("test"));
        List<Node> title2 = new ArrayList<>();
        title2.add(new Text("test"));
        assertEquals(new Paragraph(title1, 1, true), new Paragraph(title2, 1, true));
    }
}
