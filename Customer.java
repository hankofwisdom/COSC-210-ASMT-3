
public class Customer {
	private String name;
	private int phoneNo;
	private Plan plan;
		
	public Customer(String name, int phoneNo, Plan plan) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.plan = plan;
	}

	public Plan getPlan() {
		return plan;
	}
	
	public void setPlan(Plan plan) {
		this.plan = plan;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPhoneNo() {
		return phoneNo;
	}
}
