public class Insurance_Company {

	private Snapshot_Insurance_Proposal_Catalog Snapshot_Catalog;
	
	public Insurance_Company() {
	}
	
	public Insurance_Company(Snapshot_Insurance_Proposal_Catalog snapshot_Catalog) {
		Snapshot_Catalog = snapshot_Catalog;
	}

	public Snapshot_Insurance_Proposal_Catalog getSnapshot_Catalog() {
		return Snapshot_Catalog;
	}

	public void setSnapshot_Catalog(Snapshot_Insurance_Proposal_Catalog snapshot_Catalog) {
		Snapshot_Catalog = snapshot_Catalog;
	}

	
	/**
	 * 
	 * @param customer
	 * @param vehicle
	 * @param insurance_package
	 * Την ημερομηνια την δινουμε σαν παραμετρος ωστε να βαλουμε διαφορετηκες, αλλιως θα επερνε την ημερομηνια απο το συστημα.
	 */
	public String send_insurance_propousal(Customer customer, Vehicle vehicle, Insurance_Contract insurance_Contract, String Date) {
		/**
		 * 
		 * σε ένα πραγματικό σενάριο εδω θα ήταν ο κωδικας που θα επικοινωνουσε με το πσ της Ασφαλιστικης εταιρείας
		 */
		Snapshot_Insurance_Proposal newProp = new Snapshot_Insurance_Proposal(customer, vehicle, this, Date, customer.getRespons_agent());
		Snapshot_Catalog.addSnapshot_Insurance_Proposal(newProp);
		return "200";
		
	}
	
	public String cansel_insurance(Vehicle vehicle) {
		/**
		 * 
		 * σε ένα πραγματικό σενάριο εδω θα ήταν ο κωδικας που θα επικοινωνουσε με το πσ της Ασφαλιστικης εταιρείας
		 */
		return "200";
		
	}


}