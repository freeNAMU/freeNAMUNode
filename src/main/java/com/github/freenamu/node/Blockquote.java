package com.github.freenamu.node;

import java.util.List;

public class Blockquote extends Node {
    public Blockquote() {
        super();
    }

    public Blockquote(Node child) {
        super(child);
    }

    public Blockquote(List<Node> children) {
        super(children);
    }
}
