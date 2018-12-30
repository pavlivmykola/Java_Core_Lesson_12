package ua.lviv.lgs.task1;



public class Auto implements Comparable<Auto>{

	private int hoursePower;
	private int yearOfProduction;
	private Helm helm;
	private Motor motor;
	public Auto(int hoursePower, int yearOfProduction, Helm helm, Motor motor) {
		super();
		this.hoursePower = hoursePower;
		this.yearOfProduction = yearOfProduction;
		this.helm = helm;
		this.motor = motor;
	}
	public int getHoursePower() {
		return hoursePower;
	}
	public void setHoursePower(int hoursePower) {
		this.hoursePower = hoursePower;
	}
	public int getYearOfProduction() {
		return yearOfProduction;
	}
	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}
	public Helm getHelm() {
		return helm;
	}
	public void setHelm(Helm helm) {
		this.helm = helm;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	@Override
	public String toString() {
		return "Auto [hoursePower=" + hoursePower + ", yearOfProduction=" + yearOfProduction + ", helm=" + helm
				+ ", motor=" + motor + "]";
	}
	@Override
	public int compareTo(Auto other) {
		if (this.getHoursePower()>other.getHoursePower())
			return 1;
		else if (this.getHoursePower()<other.getHoursePower())
			return -1;
		return 0;
	}
	
	
}
