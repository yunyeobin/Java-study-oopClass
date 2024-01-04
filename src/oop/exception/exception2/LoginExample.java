package oop.exception.exception2;

import javax.security.auth.login.LoginException;
import java.util.Scanner;

public class LoginExample {
    static Scanner input = new Scanner(System.in);
    String ID = "yunyeobin";
    String PW = "1234";

    String inputID;
    String inputPW;

    public String getInputID() {
        return inputID;
    }

    public void setInputID(String inputID) throws IDFormatException {
        if (!inputID.equals(ID)) {
            throw new IDFormatException("아이디 불일치");
        }
        System.out.println("아이디 일치");
        this.inputID = inputID;
    }

    public String getInputPW() {
        return inputPW;
    }

    public void setInputPW(String inputPW) throws IDFormatException {
        if (!inputPW.equals(PW)) {
            throw new IDFormatException("비밀번호 불일치");
        }
        System.out.println("비밀번호 일치");
        this.inputPW = inputPW;
    }

    public static void main(String[] args) throws IDFormatException {
        LoginExample login = new LoginExample();
        String id;
        String pw;
        System.out.println("아이디를 입력하세요");
        id = input.next();
        System.out.println("비밀번호를 입력하세요");
        pw = input.next();
        try {
            login.setInputID(id);
            login.setInputPW(pw);
            System.out.println("로그인 완료");
        } catch (IDFormatException e1) {
            e1.printStackTrace();
            System.out.println("아이디나 비밀번호가 틀렸습니다.");
        }
    }
}
