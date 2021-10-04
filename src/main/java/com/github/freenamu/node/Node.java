package com.github.freenamu.node;

import java.util.ArrayList;
import java.util.List;

public abstract class Node {
    private final List<Node> children;

    public Node() {
        this.children = new ArrayList<>();
    }

    public Node(Node child) {
        this();
        this.children.add(child);
    }

    public Node(List<Node> children) {
        this.children = children;
    }

    public List<Node> getChildren() {
        return children;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (children.size() != ((Node) o).children.size()) return false;
        for (int i = 0; i < children.size(); i++) {
            if (!children.get(i).equals(((Node) o).children.get(i))) return false;
        }
        return true;
    }
}
