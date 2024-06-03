import java.util.ArrayList;

public class Insurance_Package_Catalog {

	private ArrayList<Insurance_Package> catalog;
	
	public Insurance_Package_Catalog() {
		catalog = new ArrayList<Insurance_Package>();
	}
	
	public Insurance_Package_Catalog(ArrayList<Insurance_Package> acatalog) {
		catalog = acatalog;
	}

	
	/**
	 * 
	 * @param code
	 */
	public Insurance_Package get_package(String code) {
	
		for (int i = 0; i < catalog.size(); i++) {
			Insurance_Package insur_pack = catalog.get(i);
			if (insur_pack.getCode()==code) {	
				return insur_pack;
			}
		}
		return null;
	}
	
	/**
	 * 
	 * Δεν εμφανίστηκε στα διαγράμματα γιατι δεν την χρησημοποιησε κανένα διαγραμμα ακολουθίας αλλα δεν βγαζει νοημα να μην την εχει
	 */
	public boolean Add(Insurance_Package insurance_Package) {
		for (Insurance_Package i : catalog) {
			if (i.getCode().equals(insurance_Package.getCode())) {
				return false;
			}
		}
		catalog.add(insurance_Package);
		return true;
	}

	
	/**
	 * 
	 * Δεν εμφανίστηκε στα διαγράμματα γιατι δεν την χρησημοποιησε κανένα διαγραμμα ακολουθίας αλλα δεν βγαζει νοημα να μην την εχει
	 */
	public Insurance_Package[] getAll() {
		Insurance_Package[] arrayCatalog = new Insurance_Package[catalog.size()];
		arrayCatalog =  catalog.toArray(arrayCatalog);
		return arrayCatalog;
	}
	
	/**
	 * 
	 * Δεν εμφανίστηκε στα διαγράμματα γιατι δεν την χρησημοποιησε κανένα διαγραμμα ακολουθίας αλλα δεν βγαζει νοημα να μην την εχει
	 */	
	public Insurance_Package getAccident_Expertise_Report(int i) {
		return catalog.get(i);
	}
	
	/**
	 * 
	 * Δεν εμφανίστηκε στα διαγράμματα γιατι δεν την χρησημοποιησε κανένα διαγραμμα ακολουθίας αλλα δεν βγαζει νοημα να μην την εχει
	 */	
	public void deleteInsurance_Package(int i) {
		catalog.remove(i);
	}



}