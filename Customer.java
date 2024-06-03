public class Customer {

	private String Name;
	private String Birth_date;
	private String Address;
	private String Driver_licence_num;
	private Agent Respons_agent;
	private String Identity_num;
	private Vehicle_Catalog vehicle_catalog;
	


	public Customer() {
	}

	public Customer(String name, String birth_date, String address, String driver_licence_num, Agent respons_agent, String identity_num, Vehicle_Catalog avehicle_catalog) {
		Name = name;
		Birth_date = birth_date;
		Address = address;
		Driver_licence_num = driver_licence_num;
		Respons_agent = respons_agent;
		Identity_num = identity_num;
		vehicle_catalog = avehicle_catalog;
	}
	
	public String getName() {
		return Name;
	}

	/**
	 * 
	 * @param Name
	 */
	public void setName(String name) {
		Name = name;
	}

	public String getBirth_date() {
		return Birth_date;
	}

	/**
	 * 
	 * @param Birth_date
	 */
	public void setBirth_date(String birth_date) {
		Birth_date = birth_date;
	}

	public String getAddress() {
		return Address;
	}

	/**
	 * 
	 * @param Address
	 */
	public void setAddress(String address) {
		Address = address;
	}

	public String getDriver_licence_num() {
		return Driver_licence_num;
	}

	/**
	 * 
	 * @param Driver_licence_num
	 */
	public void setDriver_licence_num(String driver_licence_num) {
		Driver_licence_num = driver_licence_num;
	}

	public Agent getRespons_agent() {
		return Respons_agent;
	}

	/**
	 * 
	 * @param Respons_agent
	 */
	public void setRespons_agent(Agent respons_agent) {
		Respons_agent = respons_agent;
	}

	public String getIdentity_num() {
		return Identity_num;
	}

	/**
	 * 
	 * @param Identity_num
	 */
	public void setIdentity_num(String identity_num) {
		Identity_num = identity_num;
	}

	public Vehicle_Catalog getVehicle_catalog() {
		return vehicle_catalog;
	}

	public void setVehicle_catalog(Vehicle_Catalog vehicle_catalog) {
		this.vehicle_catalog = vehicle_catalog;
	}
	
    public void printData() {
        System.out.println("Name: " + Name + 
                           ", Birth Date: " + Birth_date + 
                           ", Address: " + Address + 
                           ", Driver Licence Number: " + Driver_licence_num + 
                           ", Responsible Agent: " + Respons_agent + 
                           ", Identity Number: " + Identity_num);
    }

}