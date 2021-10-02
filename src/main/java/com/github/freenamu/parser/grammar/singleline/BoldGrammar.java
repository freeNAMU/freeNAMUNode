package com.github.freenamu.parser.grammar.singleline;

import com.github.freenamu.parser.grammar.LeafGrammar;
import com.github.freenamu.parser.node.Bold;
import com.github.freenamu.parser.node.Node;
import com.github.freenamu.parser.node.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BoldGrammar extends LeafGrammar {
    public BoldGrammar() {
        super(Pattern.compile("'''[^\n]+?'''"));
    }

    @Override
    public List<Node> parse(String rawText) {
        List<Node> result = new ArrayList<>();
        Matcher matcher = pattern.matcher(rawText);

        if (matcher.find()) {
            result.add(new Text(rawText.substring(0, matcher.start())));
            Bold bold = new Bold();
            bold.addAll(new SingleLineGrammar().parse(rawText.substring(matcher.start() + 3, matcher.end() - 3)));
            result.add(bold);
            result.addAll(new SingleLineGrammar().parse(rawText.substring(matcher.end())));
        }

        return result;
    }
}