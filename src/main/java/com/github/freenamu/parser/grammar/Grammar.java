package com.github.freenamu.parser.grammar;

import com.github.freenamu.parser.node.Node;

import java.util.List;

public interface Grammar {
    Integer getFirstMatchIndex(String rawText);

    List<Node> parse(String rawText);
}
