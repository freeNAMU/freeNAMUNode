package com.github.freenamu.node;

import java.util.Objects;

public class Redirect extends Node {
    private final String documentName;

    public Redirect(String documentName) {
        super();
        this.documentName = documentName;
    }

    public String getDocumentName() {
        return documentName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Redirect redirect = (Redirect) o;
        return Objects.equals(documentName, redirect.documentName);
    }
}
