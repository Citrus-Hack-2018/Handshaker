package com.github.citrus_hack_2018.handshaker;

import java.util.ArrayList;
import java.util.Stack;

public class Pattern {

    private Stack<Pip> pattern;

    public Pattern() {
        pattern = new Stack<Pip>();
    }

    public Pattern(Stack<Pip> p) {
        pattern = p;
    }


    public Stack<Pip> getPattern() {
        return pattern;
    }

    public Pattern setPattern(Stack<Pip> pattern) {
        this.pattern = pattern;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj instanceof Pattern) {
            return pattern.equals(((Pattern)obj).getPattern());
        }

        return false;
    }

    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder();

        for (int i = 0; i < pattern.size(); i++) {
            ret.append("[" + i + "]: " + pattern.get(i) + "\n");
        }

        return ret.toString();
    }
}
