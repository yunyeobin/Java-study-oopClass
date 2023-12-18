package oop.day3.modifier.bookPocket;

class User {
    private String name;
    private String phone;

    public User(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "이름 : " + name + "\n" + "연락처 : " + phone;
    }
}

public class UserService {
    private User user;

    public UserService(String nameUser, String phoneNumber) {
        this.user = new User(nameUser, phoneNumber);
    }

    void displayUser() {
        System.out.println(user.toString());
    }
}
