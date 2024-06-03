public class Agent extends User {
	
	private Customer_Catalog customers_catalog;

	public Agent() {
	}

	public Agent(String name, String password, String email, int security_clearance_level, Customer_Catalog acustomers_catalog) {
		super(name, password, email, security_clearance_level);
		customers_catalog = acustomers_catalog;
	}
	

	public Customer_Catalog getCustomers_catalog() {
		return customers_catalog;
	}

	public void setCustomers_catalog(Customer_Catalog customers_catalog) {
		this.customers_catalog = customers_catalog;
	}
	
    public void printData() {
        System.out.println("Name: " + Name + ", Password: " + Password + ", Email: " + Email + ", Security clearance level: " + Security_clearance_level);
    }
}