package oop.exception.exception2;

import java.util.Scanner;

public class SighupProgram {
    static Scanner input = new Scanner(System.in);
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) throws IDFormatException {
        if (userID == null) {
            throw new IDFormatException("아이디는 null 일 수 없습니다.");
        } else if (userID.length() < 8 || userID.length() > 20) {
            throw new IDFormatException("아이디는 8자 이상 20자 이하만 가능합니다.");
        }
        this.userID = userID;
    }

    private String userID;

    private String userPassword;

    public void PasswordFormatException() {
        this.userPassword = userPassword;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) throws PasswordCheckException {
        String str = "^[0-9a-zA-Z]*$";
        if (userPassword == null) {
            throw new PasswordCheckException("비밀번호는 null 일 수 없습니다.");
        } else if (userPassword.length() <= 5) {
            throw new PasswordCheckException("비밀번호는 5자 초과여야 됩니다.");
        } else if (userPassword.matches(str)) {
            throw new PasswordCheckException("비밀번호는 문자열만 됩니다");
        }
        this.userPassword = userPassword;
    }
        public static void main (String[]args) throws PasswordCheckException, IDFormatException {
            IDFormatTest id = new IDFormatTest();
            PasswordFormatException password = new PasswordFormatException();
            String userID = null;
            String userPassword = null;
            try {
                userID = input.next();
                id.setUserID(userID);
                userPassword = input.next();
                password.setUserPassword(userPassword);

            } catch (IDFormatException ie) {
                System.out.println(ie.getMessage());
            }catch (PasswordCheckException e) {
                e.printStackTrace();
                System.out.println("비번은 null안되고 5자보다 길게 해야됩니다");
            } catch (Exception e) {
                System.out.println("예외 발생 프로그램 다시 시작");
            }
            System.out.println(id.getUserID()+" 회원가입 완료");
     }
    }
