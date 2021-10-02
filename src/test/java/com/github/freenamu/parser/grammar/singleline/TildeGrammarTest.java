package com.github.freenamu.parser.grammar.singleline;

import com.github.freenamu.parser.node.Node;
import com.github.freenamu.parser.node.single.Strikeout;
import com.github.freenamu.parser.node.single.Text;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TildeGrammarTest {
    private TildeGrammar tildeGrammar;

    @BeforeEach
    public void setUp() {
        tildeGrammar = new TildeGrammar();
    }

    @Test
    public void matchTildeGrammar() {
        // Given
        String rawText = "test1~~test2~~test3";
        int expected = 5;

        // When
        Integer actual = tildeGrammar.getFirstMatchStartIndex(rawText);

        // Then
        assertNotNull(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void notMatchTildeGrammarWithLineFeed() {
        // Given
        String rawText = "test1~~te\nst2~~test3";

        // When
        Integer actual = tildeGrammar.getFirstMatchStartIndex(rawText);

        // Then
        assertNull(actual);
    }

    @Test
    public void parseTildeGrammar() {
        // Given
        String rawText = "test1~~test2~~test3";

        List<Node> expected = new ArrayList<>();
        expected.add(new Text("test1"));
        expected.add(new Strikeout(new Text("test2")));
        expected.add(new Text("test3"));

        // When
        List<Node> actual = tildeGrammar.parse(rawText);

        // Then
        assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }

    @Test
    public void parseTildeGrammarOnly() {
        // Given
        String rawText = "~~test2~~";

        List<Node> expected = new ArrayList<>();
        expected.add(new Text(""));
        expected.add(new Strikeout(new Text("test2")));
        expected.add(new Text(""));

        // When
        List<Node> actual = tildeGrammar.parse(rawText);

        // Then
        assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }
}