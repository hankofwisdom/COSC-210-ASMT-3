
public class Plan {
	private double price;
	private int peakIncluded;
	private int offpeakIncluded;
	private double minuteRate;
	
	public Plan(double price, int peakIncluded, int offpeakIncluded, double minuteRate) {
		super();
		this.price = price;
		this.peakIncluded = peakIncluded;
		this.offpeakIncluded = offpeakIncluded;
		this.minuteRate = minuteRate;
	}

	public double getPrice() {
		return price;
	}

	public int getPeakIncluded() {
		return peakIncluded;
	}

	public int getOffpeakIncluded() {
		return offpeakIncluded;
	}

	public double getMinuteRate() {
		return minuteRate;
	}
	
	
}
