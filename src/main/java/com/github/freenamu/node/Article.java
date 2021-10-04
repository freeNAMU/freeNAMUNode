package com.github.freenamu.node;

import java.util.List;

public class Article extends Node {
    public Article(List<Node> children) {
        super(Type.Article, children);
    }
}
