package oop.day2.basic.classEx.sec03.exam01;

//데이터 처리의 기본 기능 : CRUD (Create Read Update Delete)

public class CarExample {
	public static void main(String[] args) {
		//Car 객체 생성  ()
		Car myCar = new Car("그랜저",true,100);
		Car i = new Car("아이오닉",true,100);
		Car twizy = new Car("트위지", false,0);
		Car morning = new Car("모닝", false, 0);
		Car spark = new Car("스파크",false,100);

		//Car 타입을 저장할 수 있는 배열 : myCarArray
		Car[] myCarArray = new Car[5];
		int[] array = new int[6];

		//Car 객체의 필드값 읽기
		System.out.println(myCar.model);
		System.out.println(myCar.speed);
		System.out.println(myCar.start);     //정해놓은 타입에 맞춰서 자동 초기화.
		myCar.print();

		//myCar model : 그랜저  speed : 100  start : true

		myCar.model = "그랜저";
		myCar.speed = 100;
		myCar.start = true;


		System.out.println(myCar.model);
		System.out.println(myCar.speed);
		System.out.println(myCar.start);

		//myCarArray 차고의 1번째 공간에 그랜저를 주차하세요(넣으세요)
		myCarArray[0] = myCar;   // 지금 myCar는 시동걸려있는 속도100짜리 그랜저
		System.out.println(myCarArray[0].model);
		System.out.println(myCarArray[0].speed);
		System.out.println(myCarArray[0].start);

		//myCarArray 주차공간에 그랜저, 아이오닉, 트위지, 모닝, 스파크
		myCarArray[1] = i;
		myCarArray[2] = twizy;
		myCarArray[3] = morning;
		myCarArray[4] = spark;

	    for (Car car : myCarArray){
			System.out.println(car.model+" "+car.start+" "+car.speed);

		}
	}
}