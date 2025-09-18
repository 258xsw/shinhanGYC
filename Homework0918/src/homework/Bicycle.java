package homework;

public class Bicycle implements Vehicle {
	public Bicycle(double speed) {
		super();
		this.speed = speed;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	private double speed;

	@Override
	public void move() {
		System.out.println("자전거 속도 : " + speed);
	}
}
