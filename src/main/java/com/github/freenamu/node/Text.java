package com.github.freenamu.node;

import java.util.Objects;

public class Text extends Node {
    private final String text;

    public Text(String text) {
        super();
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Text text1 = (Text) o;
        return Objects.equals(text, text1.text);
    }
}
