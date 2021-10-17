package com.github.freenamu.node;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RedirectTest {
    @Test
    public void test_equals() {
        assertEquals(new Redirect("test"), new Redirect("test"));
    }
}
