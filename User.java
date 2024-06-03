public class User {

	protected String Name;
	protected String Password;
	protected String Email;
	protected int Security_clearance_level;

	public User() {

	}
	
	public User(String name, String password, String email, int security_clearance_level) {
		Name = name;
		Password = password;
		Email = email;
		Security_clearance_level = security_clearance_level;
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

	public String getPassword() {
		return Password;
	}

	/**
	 * 
	 * @param Password
	 */
	public void setPassword(String password) {
		Password = password;
	}

	public String getEmail() {
		return Email;
	}

	/**
	 * 
	 * @param Email
	 */
	public void setEmail(String email) {
		Email = email;
	}

	public int getSecurity_clearance_level() {
		return Security_clearance_level;
	}

	/**
	 * 
	 * @param Security_clearance_level
	 */
	public void setSecurity_clearance_level(int security_clearance_level) {
		Security_clearance_level = security_clearance_level;
	}



}