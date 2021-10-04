package com.github.freenamu.node.singleline;

import com.github.freenamu.node.Node;

import java.util.List;

public class Bold extends Node {
    public Bold(Node child) {
        super(Type.Bold, child);
    }

    public Bold(List<Node> children) {
        super(Type.Bold, children);
    }
}
