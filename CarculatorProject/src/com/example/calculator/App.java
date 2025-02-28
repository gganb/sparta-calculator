package com.example.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            try{
                System.out.print("숫자 1 입력 : ");
                int num1 = Integer.parseInt(scan.nextLine());

                System.out.print("숫자 2 입력 : ");
                int num2 = Integer.parseInt(scan.nextLine());

                if (num1 < 0 || num2 < 0) {
                    break;
                }
                System.out.print("연산자를 입력하세요 ( +, -, /, x ) : ");
                String str = scan.nextLine();
                char operator = str.charAt(0);

                int result = 0;
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        System.out.printf("%d + %d = %d\n", num1, num2, result);
                        break;
                    case '-':
                        result = num1 - num2;
                        System.out.printf("%d - %d = %d\n", num1, num2, result);
                        break;
                    case '/':
                        if (num2 == 0) {
                            System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        } else {
                            float resultf = num1 / (float) num2;
                            System.out.printf("%d / %d = %.2f\n", num1, num2, resultf);
                            break;
                        }
                    case 'x':
                        result = num1 * num2;
                        System.out.printf("%d x %d = %d\n", num1, num2, result);
                        break;
                    default:
                        System.out.println("다시 입력하세요.");
                        break;
                }// end of switch

                System.out.println("\n더 계산하시겠습니까? (exit 입력 시 종료) : ");
                String msg = scan.nextLine();
                if(msg.equals("exit")){
                    break;
                }

            }catch(NumberFormatException e){
                System.out.println("숫자만 입력하세요.");
            } // end of catch


        } // end of while
    }
}
