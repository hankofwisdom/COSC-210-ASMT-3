import java.time.LocalDateTime;

public class CallLog {
	private int phoneNo;
	private LocalDateTime timeOfCall;
	private int minsUsed;
	
	public CallLog(int phoneNo, LocalDateTime timeOfCall, int minsUsed) {
		super();
		this.phoneNo = phoneNo;
		this.timeOfCall = timeOfCall;
		this.minsUsed = minsUsed;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public LocalDateTime getTimeOfCall() {
		return timeOfCall;
	}

	public int getMinsUsed() {
		return minsUsed;
	}

	public boolean isOffpeak() {
		return timeOfCall.getHour() >= 18;
	}
}
