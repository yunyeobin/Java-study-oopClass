package oop.interface_1;

public class Radio implements RemoteControl{
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("라디오가 켜졌다!");
    }

    @Override
    public void turnOff() {
        System.out.println("라디오가 꺼졌다!");

    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("현재 볼륨 : "+this.volume);

    }
}
