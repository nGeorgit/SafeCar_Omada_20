public class Insurance_procedures {

	private String Name;
	private String Description;
	
	public Insurance_procedures() {
	}
	
	public Insurance_procedures(String name, String description) {
		Name = name;
		Description = description;
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

	public String getDescription() {
		return Description;
	}

	/**
	 * 
	 * @param Description
	 */
	public void setDescription(String description) {
		Description = description;
	}



}