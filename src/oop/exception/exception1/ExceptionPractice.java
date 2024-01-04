package oop.exception.exception1;

import java.util.Scanner;

public class ExceptionPractice {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]");
        int[] array = new int[5];
        ArrayIndexCheck(array);
        System.out.println("[프로그램 종료]");
    }

    static void ArrayIndexCheck(int[] array){
        try{
        for (int i = 0; i < array.length+1; i++) {
            array[i] = input.nextInt();
        }
        for (int i : array) System.out.println(i);}catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
