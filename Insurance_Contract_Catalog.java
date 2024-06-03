import java.util.ArrayList;

public class Insurance_Contract_Catalog {

    private ArrayList<Insurance_Contract> catalog;

    public Insurance_Contract_Catalog() {
        catalog = new ArrayList<Insurance_Contract>();
    }

    public Insurance_Contract_Catalog(ArrayList<Insurance_Contract> acatalog) {
        catalog = acatalog;
    }


    /**
     * 
     * Δεν εμφανίστηκε στα διαγράμματα γιατι δεν την χρησημοποιησε κανένα διαγραμμα ακολουθίας αλλα δεν βγαζει νοημα να μην την εχει
     */
    public void addContract(Insurance_Contract insurance_Contract) {
        catalog.add(insurance_Contract);

    }


    /**
     * 
     * Δεν εμφανίστηκε στα διαγράμματα γιατι δεν την χρησημοποιησε κανένα διαγραμμα ακολουθίας αλλα δεν βγαζει νοημα να μην την εχει
     */
    public Insurance_Contract[] getAll() {
        Insurance_Contract[] arrayCatalog = new Insurance_Contract[catalog.size()];
        arrayCatalog =  catalog.toArray(arrayCatalog);
        return arrayCatalog;
    }


    /**
     * 
     * Δεν εμφανίστηκε στα διαγράμματα γιατι δεν την χρησημοποιησε κανένα διαγραμμα ακολουθίας αλλα δεν βγαζει νοημα να μην την εχει
     */    
    public void deleteContract(int i) {
        catalog.remove(i);
    }
}
