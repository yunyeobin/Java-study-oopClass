package oop.day2.basic.classEx.sec06;

public class Computer {
    boolean power = false;
    int sum(int ... values){//가변길이처리 ... int 로 들어오는걸 개수에 상관없이 해준다.
        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            sum += values[i];


        }
        return sum;
    }
    boolean isPower(){
        if (power == true){
            System.out.println("컴퓨터 전원이 켜져 있습니다. ");
            return true;
        }
        System.out.println("컴퓨터 전원이 꺼져 있습니다. ");
        return false;
    }
}


//return 문 : 메소드의 실행을 강제 종료, 호출한 곳으로 제어가 이동된다.