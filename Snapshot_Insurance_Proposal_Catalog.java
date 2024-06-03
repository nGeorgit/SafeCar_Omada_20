import java.util.ArrayList;

public class Snapshot_Insurance_Proposal_Catalog {
	
	private ArrayList<Snapshot_Insurance_Proposal> catalog;

	public Snapshot_Insurance_Proposal_Catalog() {
		catalog = new ArrayList<Snapshot_Insurance_Proposal>();
	}
	
	public Snapshot_Insurance_Proposal_Catalog(ArrayList<Snapshot_Insurance_Proposal> acatalog) {
		catalog = acatalog;
	}
	
	public Snapshot_Insurance_Proposal[] get_Snapshot_Insurance_Proposals() {
		Snapshot_Insurance_Proposal[] arrayCatalog = new Snapshot_Insurance_Proposal[catalog.size()];
		arrayCatalog =  catalog.toArray(arrayCatalog);
		return arrayCatalog;
	}

	/**
	 * 
	 * Δεν εμφανίστηκε στα διαγράμματα γιατι δεν την χρησημοποιησε κανένα διαγραμμα ακολουθίας αλλα δεν βγαζει νοημα να μην την εχει
	 */	
	public Snapshot_Insurance_Proposal getSnapshot_Insurance_Proposal(int i) {
		return catalog.get(i);
	}
	
	/**
	 * 
	 * Δεν εμφανίστηκε στα διαγράμματα γιατι δεν την χρησημοποιησε κανένα διαγραμμα ακολουθίας αλλα δεν βγαζει νοημα να μην την εχει
	 */	
	public void deleteSnapshot_Insurance_Proposal(int i) {
		catalog.remove(i);
	}

	/**
	 * 
	 * Δεν εμφανίστηκε στα διαγράμματα γιατι δεν την χρησημοποιησε κανένα διαγραμμα ακολουθίας αλλα δεν βγαζει νοημα να μην την εχει
	 */	
	public void addSnapshot_Insurance_Proposal(Snapshot_Insurance_Proposal snapshot_Insurance_Proposal) {
		catalog.add(snapshot_Insurance_Proposal);
	}
	
	public Snapshot_Insurance_Proposal[] get_Snapshot_Insurance_Proposals_by_period(String startDateStr, String endDateStr) {
		ArrayList<Snapshot_Insurance_Proposal> validSnapsList = new ArrayList<Snapshot_Insurance_Proposal>();
		int[] startDate = strToDate(startDateStr);
		int[] endDate = strToDate(endDateStr);
		
		for (int i = 0; i < catalog.size(); i++) {
			Snapshot_Insurance_Proposal tempSnap = catalog.get(i);
			int[] tempDate = strToDate(tempSnap.getDate());
			if (check_if_date_in_date_period(startDate, endDate, tempDate)) {
				validSnapsList.add(tempSnap);
			}
		}
		
		Snapshot_Insurance_Proposal[] validSnaps = new Snapshot_Insurance_Proposal[validSnapsList.size()];
		validSnaps = validSnapsList.toArray(validSnaps);
		return validSnaps;
		
	}
	
	/**
	 * 
	 * day format "dd-mm-yyyy"
	 *             01 34 6789
	 */	
	private int[] strToDate(String str) {
		int[] Date = {Integer.valueOf(str.substring(0,1)), Integer.valueOf(str.substring(3,4)), Integer.valueOf(str.substring(6,9))};
		return Date;
	}
	
	private boolean check_if_date_in_date_period(int[] startDate, int[] endDate, int[] dateToCheck) {
		boolean a = check_if_date_same_or_later(startDate, dateToCheck);
		boolean b = check_if_date_same_or_earlier(endDate, dateToCheck);
		return a && b;
		
	}
	 private boolean check_if_date_same_or_later(int[] date1, int[] date2) {
			int d1 = date1[0];
			int d2 = date2[0];
			int m1 = date1[1];
			int m2 = date2[1];
			int y1 = date1[2];
			int y2 = date2[2];
			if (y2==y1) {
				if (m2==m1) {
					if (d2>=d1) {
						return true;
					}
				} else if (m1>m2) {
					return true;
				}
			} else if (y2>y1) {
				return true;
			}
			return false;
	 }
	 
	 private boolean check_if_date_same_or_earlier(int[] date1, int[] date2) {
			int d1 = date1[0];
			int d2 = date2[0];
			int m1 = date1[1];
			int m2 = date2[1];
			int y1 = date1[2];
			int y2 = date2[2];
			if (y2==y1) {
				if (m2==m1) {
					if (d2<=d1) {
						return true;
					}
				} else if (m1<m2) {
					return true;
				}
			} else if (y2<y1) {
				return true;
			}
			return false;
	 }
}