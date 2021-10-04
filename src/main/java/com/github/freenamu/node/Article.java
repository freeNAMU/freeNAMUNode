package com.github.freenamu.node;

import java.util.List;

public class Article extends Node {
    public Article() {
        super();
    }

    public Article(Node child) {
        super(child);
    }

    public Article(List<Node> children) {
        super(children);
    }
}
