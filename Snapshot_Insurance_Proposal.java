public class Snapshot_Insurance_Proposal {

	private Customer customer;
	private Vehicle vehicle;
	private Insurance_Company Insurance;
	private String Date;
	private Agent agent;
	private Insurance_Contract insurance_contract;
	
	public Snapshot_Insurance_Proposal() {
	}
	
	public Snapshot_Insurance_Proposal(Customer acustomer, Vehicle avehicle, Insurance_Company insurance, String date, Agent aagent) {
		customer = acustomer;
		vehicle = avehicle;
		Insurance = insurance;
		Date = date;
		agent = aagent;
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

	public Insurance_Company getInsurance() {
		return Insurance;
	}

	/**
	 * 
	 * @param Insurance
	 */
	public void setInsurance(Insurance_Company insurance) {
		Insurance = insurance;
	}

	public String getDate() {
		return Date;
	}

	/**
	 * 
	 * @param Date
	 */
	public void setDate(String date) {
		Date = date;
	}

	public Agent getAgent() {
		return this.agent;
	}

	/**
	 * 
	 * @param agent
	 */
	public void setAgent(Agent aagent) {
		this.agent = aagent;
	}

	public Insurance_Contract getInsurance_contract() {
		return this.insurance_contract;
	}

	/**
	 * 
	 * @param insurance_contract
	 */
	public void setInsurance_contract(Insurance_Contract insurance_contract) {
		this.insurance_contract = insurance_contract;
	}



}