package com.geekbrains.patterns.structure.composite.expression;

public abstract class BinaryExpression implements Expression {

    private final Expression left, right;
    private final BinaryOperation operation;

    protected BinaryExpression(Expression left, Expression right, BinaryOperation operation) {
        this.left = left;
        this.right = right;
        this.operation = operation;
    }


    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    @Override
    public int eval() {
        return operation.apply(left, right);
    }


}
