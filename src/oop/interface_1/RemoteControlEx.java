package oop.interface_1;

public class RemoteControlEx {
    public static void main(String[] args) {
        //상수는 구현 객체와 상관없는 인터페이스 멤버이므로
        //바로 접근해서 상수값을 읽을 수 있다.
        System.out.println(RemoteControl.MAX_VOLUME);
        System.out.println(RemoteControl.MIN_VOLUME);
        //System.out.println(Math.PI); //PI처럼 말이지.

       RemoteControl remoteControl;
        remoteControl = new TV();
        remoteControl.turnOn();
        remoteControl.setVolume(20);
        remoteControl.turnOff();
        remoteControl.setMute(true); //default 메소드 사용
        remoteControl.setMute(false);

        TV samsung = new TV();
        RemoteControl samsungTV = new TV();
        samsungTV.turnOn();
        System.out.println(RemoteControl.MAX_VOLUME + RemoteControl.MIN_VOLUME);
        samsungTV.setVolume(20);
        samsungTV.turnOff();

        RemoteControl lgRadio = new Radio();
        lgRadio.turnOn();
        lgRadio.setVolume(15);
        lgRadio.turnOff();

        remoteControl.setMute(true);  //default method 사용
        remoteControl.setMute(false);
        RemoteControl.changeBattery(); //변수를 받아오는게 아니라 인터페이스로다가 직접 호출
    }
}
