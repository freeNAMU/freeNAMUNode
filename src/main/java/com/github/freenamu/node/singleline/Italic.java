package com.github.freenamu.node.singleline;

import com.github.freenamu.node.Node;

import java.util.List;

public class Italic extends Node {
    public Italic(Node child) {
        super(Type.Italic, child);
    }

    public Italic(List<Node> children) {
        super(Type.Italic, children);
    }
}
