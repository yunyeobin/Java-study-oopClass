package oop.interface_1;

public class MultiInterfaceMain {
    public static void main(String[] args) {
        RemoteControl remoteContral;
        Searchable searchable;
        remoteContral = new SmartTv();
        remoteContral.turnOn();
        remoteContral.turnOff();
        remoteContral.setVolume(20);
        remoteContral.setMute(true);
        searchable = new SmartTv();
        searchable.serach("https://naver.com");
    }
}
