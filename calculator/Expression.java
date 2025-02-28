package com.example.calculator;

public class Expression {
    private char operator;

    public Expression(char operator) throws IllegalArgumentException{
            if (!(operator == '+' || operator == '-' || operator == '/' || operator == '*')) {
                throw new IllegalArgumentException("다시 입력하세요");
            }
            this.operator = operator;
            }

    public char getOperator(){
        return this.operator;
    }

    }

