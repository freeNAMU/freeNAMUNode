package com.github.freenamu.node;

import java.util.List;
import java.util.Objects;

public class Paragraph extends Node {
    private final List<Node> title;
    private final int level;
    private final boolean fold;

    public Paragraph(List<Node> title, int level, boolean fold) {
        super();
        this.title = title;
        this.level = level;
        this.fold = fold;
    }

    public Paragraph(List<Node> title, int level, boolean fold, Node child) {
        super(child);
        this.title = title;
        this.level = level;
        this.fold = fold;
    }

    public Paragraph(List<Node> title, int level, boolean fold, List<Node> children) {
        super(children);
        this.title = title;
        this.level = level;
        this.fold = fold;
    }

    public List<Node> getTitle() {
        return title;
    }

    public int getLevel() {
        return level;
    }

    public boolean isFold() {
        return fold;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Paragraph paragraph = (Paragraph) o;
        return level == paragraph.level && fold == paragraph.fold && Objects.equals(title, paragraph.title);
    }
}
