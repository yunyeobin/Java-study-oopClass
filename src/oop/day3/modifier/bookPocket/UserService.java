package oop.day3.modifier.bookPocket;

class User extends Person{



    public User(String name, String phone) {
        super(name, phone);
    }

    @Override
    public String toString() {
        return "이름 : " + getName() + "\n" + "연락처 : " + getPhone();
    }
}

public class UserService {
    private User user;

    public UserService(String nameUser, String phoneNumber) {
        this.user = new User(nameUser, phoneNumber);
    }

    void displayUser() {
        System.out.println(user.toString());//Runner클래스에서 nameUser와 phoneNumber를 입력받았다
    }
}
