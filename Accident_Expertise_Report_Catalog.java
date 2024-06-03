import java.util.ArrayList;

public class Accident_Expertise_Report_Catalog {

	private ArrayList<Accident_Expertise_Report> catalog;
	
	public Accident_Expertise_Report_Catalog() {
		catalog = new ArrayList<Accident_Expertise_Report>();
	}
	
	public Accident_Expertise_Report_Catalog(ArrayList<Accident_Expertise_Report> acatalog) {
		catalog = acatalog;
	}
	
	
	/**
	 * 
	 * @param accident_expertise_report
	 */
	public void Add(Accident_Expertise_Report accident_expertise_report) {
		catalog.add(accident_expertise_report);
	}

	
	/**
	 * 
	 * Δεν εμφανίστηκε στα διαγράμματα γιατι δεν την χρησημοποιησε κανένα διαγραμμα ακολουθίας αλλα δεν βγαζει νοημα να μην την εχει
	 */
	public Accident_Expertise_Report[] getAll() {
		Accident_Expertise_Report[] arrayCatalog = new Accident_Expertise_Report[catalog.size()];
		arrayCatalog =  catalog.toArray(arrayCatalog);
		return arrayCatalog;
	}
	
	/**
	 * 
	 * Δεν εμφανίστηκε στα διαγράμματα γιατι δεν την χρησημοποιησε κανένα διαγραμμα ακολουθίας αλλα δεν βγαζει νοημα να μην την εχει
	 */	
	public Accident_Expertise_Report getAccident_Expertise_Report(int i) {
		return catalog.get(i);
	}
	
	/**
	 * 
	 * Δεν εμφανίστηκε στα διαγράμματα γιατι δεν την χρησημοποιησε κανένα διαγραμμα ακολουθίας αλλα δεν βγαζει νοημα να μην την εχει
	 */	
	public void deleteAccident_Expertise_Report(int i) {
		catalog.remove(i);
	}
	

}