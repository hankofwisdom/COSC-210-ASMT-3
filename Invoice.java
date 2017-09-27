import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Invoice {
	private Customer customer;
	private LocalDate invoiceDate;
	private int noPeakMinutes;
	private int noOffpeakMinutes;
	private double amountDue;
	
	private CallLog[] callLogs = new CallLog[50];
	private int noCallLogs = 0;
	
	public Invoice(Customer customer, LocalDate invoiceDate) {
		super();
		this.customer = customer;
		this.invoiceDate = invoiceDate;
	}

	public void addCallLog(CallLog callLog) {
		callLogs[noCallLogs++] = callLog;
	}
	
	public CallLog getCallLog(int index) {
		return callLogs[index];
	}
	
	public int getNoCallLogs() {
		return noCallLogs;
	}

	public void calculate() {
		noPeakMinutes = 0;
		noOffpeakMinutes = 0;
		
		for (int i = 0; i < noCallLogs; i++) {
			CallLog callLog = getCallLog(i);
			if (callLog.isOffpeak()) {
				noOffpeakMinutes += callLog.getMinsUsed();
			} else {
				noPeakMinutes += callLog.getMinsUsed();
			}
		}
		
		amountDue = customer.getPlan().getPrice();
		
		if (noPeakMinutes > customer.getPlan().getPeakIncluded()) {
			amountDue += (noPeakMinutes - customer.getPlan().getPeakIncluded()) * customer.getPlan().getMinuteRate();
		}	
		
		if (noOffpeakMinutes > customer.getPlan().getOffpeakIncluded()) {
			amountDue += (noOffpeakMinutes - customer.getPlan().getOffpeakIncluded()) * customer.getPlan().getMinuteRate();
		}	
	}

	public void printInvoice() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ccc MMM dd HH:mm YYYY");
		
		System.out.printf("CellsRUS	Invoice	        Date: %s%n", invoiceDate);
		System.out.println();
		System.out.printf("Customer:   %-15s  Telephone : %d%n", customer.getName(), customer.getPhoneNo());
		System.out.printf("Plan Price: $ %5.2f          Rate For Extra Minutes:   %4.2f%n", customer.getPlan().getPrice(), customer.getPlan().getMinuteRate());
		System.out.printf("Peak Minutes Included: %3d   Off-Peak Minutes Included: %3d%n", customer.getPlan().getPeakIncluded(), customer.getPlan().getOffpeakIncluded());
		System.out.printf("Peak Minutes Used:     %3d   Off-Peak Minutes Used:     %3d%n", noPeakMinutes, noOffpeakMinutes);
		System.out.println();
		System.out.printf("                             Amount Due:  $ %7.2f%n", amountDue);
		System.out.println();
		System.out.println("Call To/From   Date                   Minutes   Off-Peak"); 
		for (int i = 0; i < noCallLogs; i++) {
			CallLog callLog = getCallLog(i);
			System.out.printf("%-10s     %20s    %3d    %s%n", callLog.getPhoneNo(), callLog.getTimeOfCall().format(formatter), callLog.getMinsUsed(), callLog.isOffpeak());
		}
		System.out.println();	
	}
}
