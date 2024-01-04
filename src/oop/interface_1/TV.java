package oop.interface_1;

//해당 TV는 RemoteControl을 통해서 전원을 켜고, 끄고, 볼륨을 조절할 수 있다.
//RemoteControl 인터페이스를 기준으로 해당 TV클래스를 구현하세요.
//SAMSUNG TV객체를 생성하여 다음과 같은 동작을 차례로 수행시키세요
// 1. 전원을 켠다.
// 2. 해당 TV의 기본 MAX, MIN 볼륨값을 확인한다.
// 3. TV의 볼륨을 20으로 세팅하고 값을 확인한다.
// 4. 전원을 끈다.
public class TV implements RemoteControl { //내가 만든 RemoteControl의 기능을 TV객체에 구현하겠다.
    private int volume;
    private int volumePreviously;

    @Override
    public void turnOn() {//추상메소드 재정의(오버라이딩)
        System.out.println("테레비의 전원이 켜졌다!");

    }

    @Override
    public void turnOff() {//추상메소드 재정의(오버라이딩)
        System.out.println("테레비의 전원이 꺼졌다!");

    }

    @Override
    public void setVolume(int volume) { //volume객체를 가지구 있어야 한다! 그래서 위에 11줄에 volume선언 추상메소드 재정의(오버라이딩))
        //인터페이스 상수 MAX_VOLUME 과 MIN_VOLUME 사용하여 안넘어가게끔.
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME - 15;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        }else {
                this.volume = volume;
        }
            System.out.println("현재볼륨 : "+this.volume);
    }

    //3. default method : setMute() 사용
    //RemoteControl의 setMute() : 무음처리 기능을 TV클래스에서 기존의 볼륨을 기억하여 복원시키는 기능으로 재정의
    public void setMute(boolean mute){
        if (mute){
            this.volumePreviously = this.volume; //이전 볼륨에 현재 볼륨 저장
            System.out.println("Mute Processing"); //뮤트 실행이라고 출력
            setVolume(MIN_VOLUME); // 볼륨 뮤트됨
        }else{
            System.out.println("Mute Cancel"); //뮤트 캔슬이라고 출력
            this.volume = this.volumePreviously; //현재 볼륨에 이전 볼륨 넣기.
            setVolume(volume);
        }
    }

}
