package oop.day3.modifier.bookPocket;

public class Person {

    private String id;
    private String password;
    private String name;
    private String phone;

    Person(){}
    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {

        return password;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public Person(String name, String phone, String id, String password) {
        this.name = name;
        this.phone = phone;
        this.id = id;
        this.password = password;
    }
}