package oop.exception.exception1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandlingEx3 {
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]");
        FileInput();
        System.out.println("[프로그램 종료]"); //예외가 발생해도 종료 되지 않도록 try-catch로 예외처리함
    }

    public static void FileInput() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("data.txt");
            System.out.println("파일 읽기 완료");
        } catch (FileNotFoundException e) {
            System.out.println("해당 파일이 존재하지 않습니다. 확인해 주세요.");
            return;
        } finally {//반드시 수행하는 블록
            try {
                if (fis != null) fis.close();
            }
            catch (IOException e1) { //inputstream, outputstream 이런애들... 엔간한 예외들 싹 얘가 엔간하믄..
                e1.printStackTrace();
            }
        System.out.println("finally문은 항상 수행됨");
        }
        System.out.println("예외 처리 후 수행됨");
    }
}
//예외 처리는 프로그램이 비정상 종료되는것을 방지하는 중요한 역할을 한다.

