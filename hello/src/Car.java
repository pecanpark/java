class Car {

	String color;
	int speed;
	int gear;
	
	@Override
	public String toString() {
		return "Car [»ö±ò color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
		
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	void changeGear(int g) {
		gear = g;
	}

	void speedUp() {
		speed = speed + 10;
	}	
	void speedDown() {
		speed = speed - 10;
	}
		
}
