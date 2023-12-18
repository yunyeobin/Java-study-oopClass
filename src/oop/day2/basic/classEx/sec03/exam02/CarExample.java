package oop.day2.basic.classEx.sec03.exam02;

public class CarExample {
	public static void main(String[] args) {
		//Car 객체 생성
		Car myCar1 = new Car();
		//Car타입의 myCar1(new연산자를 이용해 생성된 객체의 주소값),
		// 생성자를 호출해서 객체를 초기화한다;
		//객체 초기화란 생성된 객체의 필드 초기화하거나,
		// 메소드를 호출해서 객체를 사용할 준비 역할.

		Car myCar2 = new Car(300,0);
//		myCar1.speed = 40;    //getter: 필드값이 객체 외부에서 사용하기에 부적절한 경우, 적절한 값으로 변환해서 리턴할 수 있는 메소드
		myCar2.setSpeed(40);   //setter: 데이터를 검증해서 유효한 값만 필드에 저장하는 메소드
		System.out.println(myCar1.getSpeed());


		//Car 객체의 필드값 읽기
//		System.out.println("제작회사: " + myCar1.getCompany());
//		System.out.println("모델명: " + myCar1.getModel());
//		System.out.println("색깔: " + myCar1.getColor());
//		System.out.println("최고속도: " + myCar1.getMaxSpeed());
		System.out.println("현재속도: " + myCar2.getSpeed());

		//Car 객체의 필드값 변경
//		myCar1.speed = 60;
//		System.out.println("수정된 속도: " + myCar1.speed);
//		System.out.println(myCar2.getCompany()+" "+myCar2.getModel());


	}
}