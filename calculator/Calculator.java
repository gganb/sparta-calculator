package com.example.calculator;

import java.util.*;

public class Calculator {    //값 계산하는 클래스
    private char operator;
    private int num1, num2;


    // 리스트를 for문으로 값을 하나하나 꺼내서 저장 . . ///생성자 . .. .
    Calculator(int num1, int num2, char operator) {// 결과를 식,정답으로
        this.operator = operator;
        this.num1 = num1;
        this.num2 = num2;
    }

    // 숫자,연산자 getter & setter
    public int getNum1() {
        return this.num1;
    }

    public void setNum1(int num1) {
        if (num1 < 0) {
            throw new RuntimeException("양의 정수를 입력해주세요");
        } else {
            this.num1 = num1;
        }
    }

    public int getNum2() {
        return this.num2;
    }

    public void setNum2(int num2) {
        if (num2 < 0) {
            throw new RuntimeException("양의 정수를 입력해주세요");
        } else {
            this.num2 = num2;
        }
    }

    public char getOperator() {
        return this.operator;
    }

    public void setOperator(char operator) {
        if (!(operator == '+' || operator == '-' || operator == '/' || operator == 'x')) {
            System.out.println("알맞은 연산자를 입력해주세요.");
            return;
        }
        this.operator = operator;
    }

    //연산하기
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int substract(int num1, int num2) {
        return num1 - num2;
    }

    public int multifly(int num1, int num2) {
        return num1 * num2;
    }

    public double divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        return num1 / (double) num2;
    }

}
