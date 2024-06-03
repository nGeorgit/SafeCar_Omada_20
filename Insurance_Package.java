public class Insurance_Package {

	private String Description;
	private String Code;
	private Insurance_Company Provider;
	
	public Insurance_Package() {
	}
	
	public Insurance_Package(String description, String code, Insurance_Company provider) {
		Description = description;
		Code = code;
		Provider = provider;
	}
	
	public Insurance_Company getProvider() {
		return Provider;
	}

	public void setProvider(Insurance_Company provider) {
		Provider = provider;
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

	public String getCode() {
		return Code;
	}

	/**
	 * 
	 * @param Code
	 */
	public void setCode(String code) {
		Code = code;
	}

    public void printData() {
        System.out.println("Description: " + Description + ", Code: " + Code);
    }

}