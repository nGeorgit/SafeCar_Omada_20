import java.util.ArrayList;

public class Vehicle_Catalog {
	
	private ArrayList<Vehicle> catalog;

	public Vehicle_Catalog() {
		catalog = new ArrayList<Vehicle>();
	}
	
	public Vehicle_Catalog(ArrayList<Vehicle> acatalog) {
		catalog = acatalog;
	}
	
	public Vehicle[] get_vehicle_filter_by_owner(Customer customer) {
		ArrayList<Vehicle> tempArray = new ArrayList<Vehicle>();
		
		
		for (int i = 0; i < catalog.size(); i++) {
			Vehicle vehicle = catalog.get(i);
			Customer aOwner = vehicle.getOwner();
			  if (customer == aOwner) {
				  tempArray.add(vehicle);
			  }
			}
		
		Vehicle[] vehiclesOfOwner = new Vehicle[tempArray.size()];
		vehiclesOfOwner = tempArray.toArray(vehiclesOfOwner);
		return vehiclesOfOwner;
	}
	
	/**
	 * 
	 * Δεν εμφανίστηκε στα διαγράμματα γιατι δεν την χρησημοποιησε κανένα διαγραμμα ακολουθίας αλλα δεν βγαζει νοημα να μην την εχει
	 */
	public boolean Add(Vehicle vehicle) {
		for (Vehicle i : catalog) {
			if (i.getLicence_num().equals(vehicle.getLicence_num())) {
				return false;
			}
		}
		catalog.add(vehicle);
		return true;
	}

	
	/**
	 * 
	 * Δεν εμφανίστηκε στα διαγράμματα γιατι δεν την χρησημοποιησε κανένα διαγραμμα ακολουθίας αλλα δεν βγαζει νοημα να μην την εχει
	 */
	public Vehicle[] getAll() {
		Vehicle[] arrayCatalog = new Vehicle[catalog.size()];
		arrayCatalog =  catalog.toArray(arrayCatalog);
		return arrayCatalog;
	}
	
	/**
	 * 
	 * Δεν εμφανίστηκε στα διαγράμματα γιατι δεν την χρησημοποιησε κανένα διαγραμμα ακολουθίας αλλα δεν βγαζει νοημα να μην την εχει
	 */	
	public Vehicle getVehicle(int i) {
		return catalog.get(i);
	}
	
	/**
	 * 
	 * Δεν εμφανίστηκε στα διαγράμματα γιατι δεν την χρησημοποιησε κανένα διαγραμμα ακολουθίας αλλα δεν βγαζει νοημα να μην την εχει
	 */	
	public void deleteVehicle(int i) {
		catalog.remove(i);
	}

}