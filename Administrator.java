public class Administrator extends User {

	public Administrator() {

	}
	
	public Administrator(String name, String password, String email, int security_clearance_level) {
		super(name, password, email, security_clearance_level);
	}

}