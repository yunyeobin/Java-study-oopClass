package oop.interface_1;

public interface RemoteControl {
    //1. 상수필드
    int MAX_VOLUME = 30; //상수. 상수 : public// static final 인데, 인터페이스는 pubic static final 처리 안해줘도 자동 상수처리됨
    int MIN_VOLUME = 0; // 상수는 대문자로 하는게 원칙임. 서로다른 단어가 연결될땐 언더바가 국룰임.

    //2. 추상메소드 abstract, {}바디가 없는 메소드(메소드 선언부만 작성).
    void turnOn(); //전원 켜기

    void turnOff(); //전원 끄기

    void setVolume(int volume); //볼륨 세팅


    //3. 디폴트 인스턴스 메소드(default method)
    //인터페이스에서 완전한 실행코드를 가진 유일한 메소드
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("Mute Processing");
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("Mute cancel");

        }
    }

    //4. 정적메소드(static)
    public static void changeBattery() {
        System.out.println("리모컨 건전지를 교환합니다.");
    }
}



