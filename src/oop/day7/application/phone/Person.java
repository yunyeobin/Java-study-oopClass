package oop.day7.application.phone;

public class Person {
    /*private Phone phone;

    Person(Phone phone){
        this.phone = phone;
    }

    public void createMessage(){
        String message = "안안녕 안반가워 오늘 몇시에 안만날까?";
        String to = "호상이";
       //Phone의 문자전송 기능 호출
        this.phone.sendMessage(to, message);
    }*/
    public void sendmessage(Phone phone){
        String to = "you";
        String message = "테니스치고싶다";
        phone.sendMessage(to, message);
    }
}
