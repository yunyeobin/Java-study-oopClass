package oop.day2.basic.classEx.sec03.exam02;

public class Car {
	//필드 선언
	private final String company = "현대차";
	private final String model = "그렌저";
	private final String color = "white";
	private int maxSpeed = 350;
	private int speed;

	//2. 생성자 오버로딩 한다.
	//모든 클래스의 생성자는 해당 클래스의 접근제한자를 따른다.
	//생성자는 메소드와 비슷하지만,return타입이 없고 클래스 이름과 동일하다.
	//생성자의 매개변수는 new연산자로 생성자를 호출할 때, 매개값을 생성자 블록 내부로 전달하는 역할을 한다.


	public Car() {
	} //default 생성자가 있어야만 가능하니까 일단 default 생성자 만듦.

//	public Car(int maxSpeed, int speed) {
////		this.company = company;
////		this.model = model;
////		this.color = color;
//		this.maxSpeed = maxSpeed;
//		this.speed = speed;
//	} //이거때메 이해가 안갔다...

	public Car(int maxSpeed, int speed) {
		this.maxSpeed = maxSpeed;
		this.speed = speed;
	}

	public String getCompany() {
		return this.company; // return 패턴...
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return this.color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	//3. 모든 필드는 private으로 변경한다.->Car클래스의 모든 멤버(객체+메소드)들을 캡슐화(타클래스접근제한)


	//4. company, model, maxSpeed는 객체가 생성되면 변경할 수 없고, 읽기만 가능하도록 재구성하세요.
	//(public getter 메소드로)


	//5. speed 멤버는 읽기 쓰기가 가능하도록 public getter setter 메소드를 작성하세요.
}