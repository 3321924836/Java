package clock;

public class Clock {
	private AnalogClock h = new AnalogClock(24);
	private AnalogClock m = new AnalogClock(60);

	public void start() {
		while (true) {
			m.addition();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}