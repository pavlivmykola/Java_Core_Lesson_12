package ua.lviv.lgs.task1;

public class Motor {

	private int cylinders;

	public Motor(int cylinders) {
		super();
		this.cylinders = cylinders;
	}

	public int getCylinders() {
		return cylinders;
	}

	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}

	@Override
	public String toString() {
		return "Motor [cylinders=" + cylinders + "]";
	}
	
}
