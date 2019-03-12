package clock;

public class AnalogClock {
	private int value = 0, limit;

	public AnalogClock(int limit) {
		this.limit = limit;
	}

	public void addition() {
		value += 1;
		if (value == 60)
			value = 0;
	}

	public int getValue() {
		return limit;
	}
}