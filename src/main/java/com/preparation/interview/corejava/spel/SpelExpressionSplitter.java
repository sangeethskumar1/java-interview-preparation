package com.preparation.interview.corejava.spel;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpelExpressionSplitter {
    public static void main(String[] args) {
        final String expressionToParse = "80-120";
        final String delimiter = "-";
        Expression expression = new SpelExpressionParser().parseExpression(String.format("'%s'.split('%s')", expressionToParse, delimiter));
        String[] result = (String[]) expression.getValue();
        for (String str : result) {
            System.out.println(str);
        }
    }
}
