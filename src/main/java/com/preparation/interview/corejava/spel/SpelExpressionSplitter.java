package com.preparation.interview.corejava.spel;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpelExpressionSplitter {
    public static void main(String[] args) {
        final String expression = "80-120";
        final String delimiter = "-";
        ExpressionParser parser = new SpelExpressionParser();
        final String expressionToParse = String.format("'%s'.split('%s')", expression, delimiter);
        Expression exp = parser.parseExpression(expressionToParse);
        String[] result = (String[]) exp.getValue();
        for (String str : result) {
            System.out.println(str);
        }
    }
}
