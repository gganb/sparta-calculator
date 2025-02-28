package com.example.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CalculationHistory calculationHistory = new CalculationHistory();
        Calculator calculator = new Calculator(0, 0, ' '); //밖으로

        while (true) {
            try {
                System.out.println("------계산하기------");
                System.out.print("숫자 1 입력 : ");
                int num1 = Integer.parseInt(scan.nextLine());
                calculator.setNum1(num1);

                System.out.print("연산자 입력  : ");
                String str = scan.nextLine();
                char operate = str.charAt(0);
                calculator.setOperator(operate);

                System.out.print("숫자 2 입력 : ");
                int num2 = Integer.parseInt(scan.nextLine());
                calculator.setNum2(num2);

                StringBuilder sb = new StringBuilder();
                Number result = 0;
                switch (calculator.getOperator()) {
                    case '+':
                        result = calculator.add(num1, num2);
                        sb.append(num1 + " + " + num2 + " = ");
                        break;
                    case '-':
                        result = calculator.substract(num1, num2);
                        sb.append(num1 + " - " + num2 + " = ");
                        break;
                    case 'x':
                        result = calculator.multifly(num1, num2);
                        sb.append(num1 + " x " + num2 + " = ");
                        break;
                    case '/':
                        result = calculator.divide(num1, num2);
                        sb.append(num1 + " / " + num2 + " = ");
                        break;
                    default:
                        System.out.println("계산할 수 없습니다.");
                }
                sb.append(result);
                System.out.println("정답 : " + sb);
                calculationHistory.saveHistory(sb.toString());  // 계산 결과 저장

                System.out.println("------------------");
                System.out.println("더 진행하시겠습니까? (exit or yes) : ");
                String msg = scan.nextLine();

                if (msg.equals("exit")) {   // 종료여부 묻기
                    break;
                } else if (msg.equals("yes")) {
                    continue;
                } else System.out.println("일치하지 않습니다");

            } catch (ArithmeticException zero) {
                System.out.println(zero.getMessage());

            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        } //while
        System.out.println("[ 저장 기록 메뉴 ]");
        boolean setting = false;
        while(!setting) {
            System.out.print(" (1) 불러오기 (2) 삭제하기 (3) 나가기 : ");
            int askMsg = Integer.parseInt(scan.nextLine());
            if (askMsg == 1) {
                System.out.println("-------결과-------");
                calculationHistory.printHistory();
            } else if(askMsg == 2){
                calculationHistory.clearHistory();
            } else {
                setting = true;
            }
            //    System.out.println("저장 결과를 불러오시겠습니까? (Yes or No) : ");
            //  String askMsg = scan.nextLine();
        }
    }//main
} //class

