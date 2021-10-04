package com.github.freenamu.node;

import java.util.List;
import java.util.Objects;

public class Anchor extends Node {
    private final String reference;

    public Anchor(String reference) {
        super();
        this.reference = reference;
        getChildren().add(new Text(reference));
    }

    public Anchor(String reference, Node child) {
        super(child);
        this.reference = reference;
    }

    public Anchor(String reference, List<Node> children) {
        super(children);
        this.reference = reference;
    }

    public String getReference() {
        return reference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Anchor anchor = (Anchor) o;
        return Objects.equals(reference, anchor.reference);
    }
}
