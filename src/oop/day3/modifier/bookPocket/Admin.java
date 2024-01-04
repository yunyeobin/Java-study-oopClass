package oop.day3.modifier.bookPocket;

import java.util.Scanner;

public class Admin extends Person {
    private String id = "Admin";
    private String password = "Admin1234";

    public Admin(String name, String phone) {
        super(name, phone);
    }


    public String getId() {
        return id;
    }


    public String getPassword() {
        return password;
    }




static class AdminService {
    private Admin admin;

    public AdminService(String name, String phone) {
        admin = new Admin(name, phone);
    }

    void displayAdmin() {
        Scanner input = new Scanner(System.in);
        System.out.println("관리자 정보를 입력하세요.");
        System.out.print("아이디 : ");
        String adminId = input.next();
        System.out.print("비밀번호 : ");
        String adminPw = input.next();

        if (adminId.equals(admin.getId()) && adminPw.equals(admin.getPassword())) {
            System.out.println("이름 " + admin.getName() + "   연락처 " + admin.getPhone());
            System.out.println("아이디 " + admin.getId() + "   비밀번호 " + admin.getPassword());
        } else {
            System.out.println("관리자 정보가 일치하지 않습니다.");
        }
    }
}}


