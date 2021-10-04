package com.github.freenamu.node.singleline;

import com.github.freenamu.node.Node;

import java.util.List;

public class Superscript extends Node {
    public Superscript(Node child) {
        super(Type.Superscript, child);
    }

    public Superscript(List<Node> children) {
        super(Type.Superscript, children);
    }
}
