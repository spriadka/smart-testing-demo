package com.spriadka.demos.smart.testing.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.UnaryOperator;

public class StringCombiner {

    private final List<UnaryOperator<String>> operations;
    private final String targetString;

    public StringCombiner(Collection<UnaryOperator<String>> operations, String targetString) {
        this.operations = new ArrayList<>(operations);
        this.targetString = targetString;
    }

    public String apply() {

        return this.operations.stream().reduce(targetString, (s, stringUnaryOperator) -> stringUnaryOperator.apply(s), (s, s2) -> s2);
    }
}
