package solid.dip.exercise;

public class Robot {
	
	private Legs legs;
	private Hands hands;
	private PowerSource powerSource;
	
	public Robot(Legs legs, Hands hands, PowerSource powerSource) {
		super();
		this.legs = legs;
		this.hands = hands;
		this.powerSource = powerSource;
	}
	
	public void goToChargingStation() {
		legs.walk(20);
		legs.turnLeft();
		legs.walk(10);
		hands.grab(powerSource);
		powerSource.charge();
	}
	
}
