package homework;

public class Car implements Vehicle {

	private double speed;
	
	
	public double getSpeed() {
		return speed;
	}


	public void setSpeed(double speed) {
		this.speed = speed;
	}


	public Car(double speed) {
		super();
		this.speed = speed;
	}


	@Override
	public void move() {
		System.out.println("자동차 속도 : " + speed);
	}

}
