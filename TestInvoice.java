import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestInvoice {

	public static void main(String[] args) {
		Plan plan = new Plan(45.0, 100, 100, .35);
		
		Customer customer = new Customer("Tom Jones", 6667777, plan);
		
		Invoice invoice = new Invoice(customer, LocalDate.of(2017, 9, 20));
		
		invoice.addCallLog(new CallLog(7774563, LocalDateTime.of(2017,  9, 10, 9, 30), 15));
		invoice.addCallLog(new CallLog(7777773, LocalDateTime.of(2017,  9, 10, 13, 40), 60));
		invoice.addCallLog(new CallLog(7774563, LocalDateTime.of(2017,  9, 16, 11, 30), 75));
		invoice.addCallLog(new CallLog(7774563, LocalDateTime.of(2017,  9, 17, 18, 30), 105));

		invoice.calculate();
		
		invoice.printInvoice();
	}

}
