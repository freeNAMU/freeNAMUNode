package com.github.freenamu.node.multiline;

import com.github.freenamu.node.Node;

import java.util.List;

public class Quotation extends Node {
    public Quotation(Node child) {
        super(Type.Quotation, child);
    }

    public Quotation(List<Node> children) {
        super(Type.Quotation, children);
    }
}
