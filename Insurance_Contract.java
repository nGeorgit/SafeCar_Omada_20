public class Insurance_Contract {

	private Customer customer;
	private Vehicle vehicle;
	private Insurance_Package insurance_package;
	private int Cost;
	
	public Insurance_Contract() {
	}
	
	public Insurance_Contract(Customer acustomer, Vehicle avehicle, Insurance_Package ainsurance_package, int acost) {
		customer = acustomer;
		vehicle = avehicle;
		insurance_package = ainsurance_package;
		Cost = acost;
		
	}

	public int getCost() {
		return this.Cost;
	}

	/**
	 * 
	 * @param cost
	 */
	public void setCost(int cost) {
		this.Cost = cost;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	/**
	 * 
	 * @param customer
	 */
	public void setCustomer(Customer acustomer) {
		this.customer = acustomer;
	}

	public Vehicle getVehicle() {
		return this.vehicle;
	}

	/**
	 * 
	 * @param vehicle
	 */
	public void setVehicle(Vehicle avehicle) {
		this.vehicle = avehicle;
	}

	public Insurance_Package getInsurance_package() {
		return this.insurance_package;
	}

	/**
	 * 
	 * @param insurance_package
	 */
	public void setInsurance_package(Insurance_Package ainsurance_package) {
		this.insurance_package = ainsurance_package;
	}

    public void printData() {
        System.out.println("Customer: " + customer + 
                           ", Vehicle: " + vehicle + 
                           ", Insurance Package: " + insurance_package + 
                           ", Cost: " + Cost);
    }

}