import java.util.ArrayList; 

public class Agent_catalog {
	
	private ArrayList<Agent> catalog;

	public Agent_catalog() {
		catalog = new ArrayList<Agent>();
	}
	
	public Agent_catalog(ArrayList<Agent> acatalog) {
		catalog = acatalog;
	}
	
	public Agent[] get_Agents() {
		Agent[] arrayCatalog = new Agent[catalog.size()];
		arrayCatalog =  catalog.toArray(arrayCatalog);
		return arrayCatalog;
	}


	/**
	 * 
	 * Δεν εμφανίστηκε στα διαγράμματα γιατι δεν την χρησημοποιησε κανένα διαγραμμα ακολουθίας αλλα δεν βγαζει νοημα να μην την εχει
	 */	
	public Agent getAgent(int i) {
		return catalog.get(i);
	}
	
	/**
	 * 
	 * Δεν εμφανίστηκε στα διαγράμματα γιατι δεν την χρησημοποιησε κανένα διαγραμμα ακολουθίας αλλα δεν βγαζει νοημα να μην την εχει
	 */	
	public void deleteAgent(int i) {
		catalog.remove(i);
	}

	/**
	 * 
	 * Δεν εμφανίστηκε στα διαγράμματα γιατι δεν την χρησημοποιησε κανένα διαγραμμα ακολουθίας αλλα δεν βγαζει νοημα να μην την εχει
	 */	
	public void addAgent(Agent agent) {
		catalog.add(agent);
	}
}