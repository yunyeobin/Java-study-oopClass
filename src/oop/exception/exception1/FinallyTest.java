package oop.exception.exception1;

import java.util.Scanner;
//2개의 정ㅅ우를 입력받아 첫번째 입력된 정수를 두번째 입력된 정수로 나눈 결과값을 출력(예외처리)

public class FinallyTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = 1;
        int number2 = 1;
        System.out.println("[프로그램 시작]");
        try {
            number1 = sc.nextInt();
            number2 = sc.nextInt();
            returnintFinally(number1, number2);
        } catch (NumberFormatException e1) {
            e1.getMessage();
            System.out.println("main의 catch구문");
        } finally {
            System.out.println("[프로그램 종료]");
        }
    }

    static void returnintFinally(int number1, int number2) {
        int number3 = 0;
        try {
            System.out.printf("%d / %d = %d\n", number1, number2, (number1 / number2));
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally구문 : " + number3 + "은 안됨");
        }


    }


}

