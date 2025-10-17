package solid.dip.exercise;

public class BasicHands implements Hands {
	public void grab(Object o) {
		System.out.println("Grabbing "+o.toString());
	}
}
