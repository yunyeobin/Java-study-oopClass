package oop.exception.exception2;

import java.util.Scanner;

public class PasswordFormatException {
    static Scanner input = new Scanner(System.in);
    private String userPassword;

    public PasswordFormatException() {
        this.userPassword = getUserPassword();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) throws PasswordCheckException{
        String str = "^[0-9a-zA-Z]*$";
        if (userPassword == null) {
            throw new PasswordCheckException("비밀번호는 null 일 수 없습니다.");
        }else if (userPassword.length() <= 5){
            throw new PasswordCheckException("비밀번호는 5자 초과여야 됩니다.");
        }
        else if (userPassword.matches(str)){
            throw new PasswordCheckException("비밀번호는 문자열만 됩니다");
        }
        this.userPassword = userPassword;
    }

    public static void main(String[] args)  {
        PasswordFormatException password = new PasswordFormatException();
        String userPassword = null;

        try {
            userPassword = input.next();
            password.setUserPassword(userPassword);
        System.out.println(password.getUserPassword() + "이걸로 비밀번호 설정");
        } catch (PasswordCheckException e) {
            e.printStackTrace();
            System.out.println("비번은 null안되고 5자보다 길게 해야됩니다");
        }catch(Exception e2){
            e2.printStackTrace();
            System.out.println("문자");
        }
        System.out.println("비밀번호 설정 완료");


    }
}
