package com.github.freenamu.node.singleline;

import com.github.freenamu.node.Node;

import java.util.List;

public class Strikeout extends Node {
    public Strikeout(Node child) {
        super(Type.Strikeout, child);
    }

    public Strikeout(List<Node> children) {
        super(Type.Strikeout, children);
    }
}
