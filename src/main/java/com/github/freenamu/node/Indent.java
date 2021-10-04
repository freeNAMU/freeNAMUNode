package com.github.freenamu.node;

import java.util.List;

public class Indent extends Node {
    public Indent() {
        super();
    }

    public Indent(Node child) {
        super(child);
    }

    public Indent(List<Node> children) {
        super(children);
    }
}
