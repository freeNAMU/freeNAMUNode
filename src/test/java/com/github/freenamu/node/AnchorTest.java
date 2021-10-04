package com.github.freenamu.node;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AnchorTest {
    @Test
    public void test_equals() {
        assertEquals(new Anchor("test"), new Anchor("test"));
    }

    @Test
    public void children_should_have_one_text_that_is_same_with_reference_when_constructed_with_one_parameter() {
        // Given
        Anchor anchor = new Anchor("test");
        List<Node> expected = new ArrayList<>();
        expected.add(new Text("test"));

        // When
        List<Node> actual = anchor.getChildren();

        // Then
        assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }
}
