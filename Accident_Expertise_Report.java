public class Accident_Expertise_Report {

	private String Date;
	private String Location;
	private Customer Driver1;
	private String Driver2;
	private String Culpability;
	private String Damage;
	private String[] Pictures;
	private Agent Responsible_Agent;
	
	public Accident_Expertise_Report(String date, String location, Customer driver1, String driver2, String culpability, String damage) {
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

	public String getLocation() {
		return Location;
	}

	/**
	 * 
	 * @param Location
	 */
	public void setLocation(String location) {
		Location = location; 
	}

	public Customer getDriver1() {
		return Driver1;
	}

	/**
	 * 
	 * @param Driver1
	 */
	public void setDriver1(Customer driver1) {
		Driver1 = driver1;
	}

	public String getDriver2() {
		return Driver2;
	}

	/**
	 * 
	 * @param Driver2
	 */
	public void setDriver2(String driver2) {
		Driver2 = driver2;
	}

	public String getCulpability() {
		return Culpability;
	}

	/**
	 * 
	 * @param Culpability
	 */
	public void setCulpability(String culpability) {
		Culpability = culpability;
	}

	public String getDamage() {
		return Damage;
	}

	/**
	 * 
	 * @param Damage
	 */
	public void setDamage(String damage) {
		Damage = damage;
	}

	public String[] getPictures() {
		return Pictures;
	}

	/**
	 * 
	 * @param Pictures
	 */
	public void setPictures(String[] pictures) {
		Pictures = pictures;
	}

	public Agent getResponsible_Agent() {
		return Responsible_Agent;
	}

	/**
	 * 
	 * @param Responsible_Agent
	 */
	public void setResponsible_Agent(Agent responsible_Agent) {
		Responsible_Agent = responsible_Agent;
	}



}