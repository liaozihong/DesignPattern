package com.dashuai.learning.visitor.supports;

public interface Element {
    void accept(Visitor visitor);
}
