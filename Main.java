import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Customer_Catalog customer_catalog = new Customer_Catalog();
		System.out.println("New customer_catalog has been created");
		Vehicle_Catalog vehicle_catalog = new Vehicle_Catalog();
		System.out.println("New vehicle_catalog has been created");
		Snapshot_Insurance_Proposal_Catalog Snapshot_Catalog = new Snapshot_Insurance_Proposal_Catalog();
		System.out.println("New Snapshot_Catalog has been created");
		Insurance_Package_Catalog insurance_Package_Catalog = new Insurance_Package_Catalog();
		System.out.println("New insurance_Package_Catalog has been created");
		Agent_catalog agent_catalog = new Agent_catalog();
		System.out.println("New agent_catalog has been created");
		Insurance_Contract_Catalog insurance_Contract_Catalog = new Insurance_Contract_Catalog();
		System.out.println("New insurance_Contract_Catalog has been created");
		
		Agent Agent1 = new Agent("Νικόλαος-Αλέξανδρος Γεωργιτσόγιαννης", "κωδικος", "email1@gmail.com", 1, customer_catalog);
		System.out.println("New Agent has been created");
		Agent Agent2 = new Agent("Ζηντίλη Μαρία", "κωδικος", "email2@gmail.com", 1, customer_catalog);
		System.out.println("New Agent has been created");
		
		agent_catalog.addAgent(Agent1);
		agent_catalog.addAgent(Agent2);
		System.out.println("Agents added to the catalog");
		
		Insurance_Company Insurance_Company1 = new Insurance_Company(Snapshot_Catalog);
		System.out.println("New Insurance Company has been created");
		Insurance_Company Insurance_Company2 = new Insurance_Company(Snapshot_Catalog);
		System.out.println("New Insurance Company has been created");
		
		Insurance_Company[] Insurance_Companies = { Insurance_Company1, Insurance_Company2};
		
		Customer Customer1 = new Customer("Maria Papadopoulou","01-06-1999","Karolou Ntil 19, Thessaloniki", "ΧΧΧΧΧΧΧΧΧ", Agent1,"AO79432", vehicle_catalog);
		System.out.println("New Customer has been created");
		Customer Customer2 = new Customer("Evanthia Papagianni","01-03-1980","Leof. Geor. Papandreou 45, Ioannina", "ΧΧΧΧΧΧΧΧΧ", Agent2,"AO79433", vehicle_catalog);
		System.out.println("New Customer has been created");
		Customer Customer3 = new Customer("Vasilis Karagiannis","01-03-1985","Leof. Geor. Papandreou 46, Ioannina", "ΧΧΧΧΧΧΧΧΧ", Agent1,"AO79434", vehicle_catalog);
		System.out.println("New Customer has been created");
		
		customer_catalog.add(Customer1);
		customer_catalog.add(Customer2);
		customer_catalog.add(Customer3);
		System.out.println("Customers added to the catalog");
		
		Vehicle Vehicle1 = new Vehicle("XKP8923", "Mercedes", "GLC", 2996, "white", Customer1);
		System.out.println("New Vehicle has been created");
		Vehicle Vehicle2 = new Vehicle("NII4269", "Subaru", "Forester", 2550, "black", Customer2);
		System.out.println("New Vehicle has been created");
		Vehicle Vehicle3 = new Vehicle("KOH4681", "Ford", "Ranger", 3200, "white", Customer2);
		System.out.println("New Vehicle has been created");
		
		vehicle_catalog.Add(Vehicle1);
		vehicle_catalog.Add(Vehicle2);
		vehicle_catalog.Add(Vehicle3);
		System.out.println("Vehicles added to the catalog");
		
		Insurance_Package InsurancePackage1 = new Insurance_Package("Mikti asfalisi", "ΜI93", Insurance_Company1);
		System.out.println("New Insurance Package has been created");
		Insurance_Package InsurancePackage2 = new Insurance_Package("Basiki asfalisi", "B56", Insurance_Company1);
		System.out.println("New Insurance Package has been created");
		Insurance_Package InsurancePackage3 = new Insurance_Package("Me odiki", "O58", Insurance_Company2);
		System.out.println("New Insurance Package has been created");
		
		insurance_Package_Catalog.Add(InsurancePackage1);
		insurance_Package_Catalog.Add(InsurancePackage2);
		insurance_Package_Catalog.Add(InsurancePackage3);
		System.out.println("Insurance Packages added to the catalog");
		
		Insurance_Contract Insurance_Contract1 = new Insurance_Contract(Customer1, Vehicle1, InsurancePackage2, 60);
		System.out.println("New Insurance Contract has been created");
		Insurance_Contract Insurance_Contract2 = new Insurance_Contract(Customer2, Vehicle2, InsurancePackage1, 120);
		System.out.println("New Insurance Contract has been created");
		Insurance_Contract Insurance_Contract3 = new Insurance_Contract(Customer2, Vehicle3, InsurancePackage3, 80);
		System.out.println("New Insurance Contract has been created");
		
		insurance_Contract_Catalog.addContract(Insurance_Contract1);
		insurance_Contract_Catalog.addContract(Insurance_Contract2);
		insurance_Contract_Catalog.addContract(Insurance_Contract3);
		
		for (Insurance_Contract i : insurance_Contract_Catalog.getAll()) {
			System.out.println(String.format("%s, %s, %s, %d", i.getCustomer().getName(), i.getVehicle().getLicence_num(), i.getInsurance_package().getDescription(), i.getCost()));
		}
		
		for (Customer i: customer_catalog.get_All()) {
			System.out.println(String.format("%s:", i.getName()));
			Vehicle[] tempVehicles = vehicle_catalog.get_vehicle_filter_by_owner(i);
			String[] tempLicenceNum = new String[tempVehicles.length];
			for (int j = 0; j < tempVehicles.length; j++) {
				tempLicenceNum[j] = tempVehicles[j].getLicence_num();			}
			int cost = 0;
			for (Insurance_Contract j: insurance_Contract_Catalog.getAll()) {
				if (j.getCustomer()==i) {
					cost += j.getCost();
				}
			}
			System.out.println(String.format("%s, %d", Arrays.toString(tempLicenceNum), cost));
		}
		
		System.out.println("Vehicles:");
		
		for (Vehicle i : vehicle_catalog.getAll()) {
			i.printData();
		}
		
		System.out.println("Customers:");
		for (Customer i : customer_catalog.get_All()) {
			i.printData();
		}
		
		System.out.println("Agents:");
		for (Agent i : agent_catalog.get_Agents()) {
			i.printData();
		}
		
		System.out.println("Insurance_Packages:");
		for (Insurance_Package i : insurance_Package_Catalog.getAll()) {
			i.printData();
		}
		
		System.out.println("Insurance_Contracts:");
		for (Insurance_Contract i : insurance_Contract_Catalog.getAll()) {
			i.printData();
		}
		
//----------------------------------------------------------------------------------------------------------------------------------
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Τελος Σεναριου, η συνεχεια είναι παραδειγμα Στατιστικης Αναφορας");
		
		Insurance_Contract1.getInsurance_package().getProvider().send_insurance_propousal(Insurance_Contract1.getCustomer(), Insurance_Contract1.getVehicle(), Insurance_Contract1, "02/06/2024");
		Insurance_Contract2.getInsurance_package().getProvider().send_insurance_propousal(Insurance_Contract2.getCustomer(), Insurance_Contract2.getVehicle(), Insurance_Contract2, "02/06/2024");
		Insurance_Contract3.getInsurance_package().getProvider().send_insurance_propousal(Insurance_Contract3.getCustomer(), Insurance_Contract3.getVehicle(), Insurance_Contract3, "04/06/2024");
		
		System.out.println("Ο Administrator διμιουργεί Statistical_report απο 09-5-2024 μεχρι 20-06-2024");
		Statistical_report Statistical_report1 = new Statistical_report("09-5-2024", "20-06-2024", Snapshot_Catalog);
		Statistical_report1.printData();
		

		
		System.out.println("Τελος Σεναριου, η συνεχεια είναι παραδειγμα Αρχειοθέτηση εντύπου οχήματος ως Πρακρορας1");
		Customer[] Customers = Agent1.getCustomers_catalog().get_client_filter_by_agent(Agent1);
		System.out.println("Πελάτες:");
		for (int i = 0 ; i < Customers.length; i++) {
			System.out.println(String.format("[%d] %s", i, Customers[i].getName()));
		}
		System.out.println("Επιλογή; ");
		int choice = Integer.valueOf(scan.nextLine());
		System.out.println(String.format("Επιλεχθηκε ο/η %s", Customers[choice].getName()));
		
		Customer Customer4 = Customers[choice];
		
		System.out.println("Προσθήκη οχήματος:");
		System.out.println("Προεπιλεγμένα δεδομένα(Ford, Model T, 2896, black, NKP8836); [Υ/Ν]: ");
		String choiceS = scan.nextLine();
		Vehicle Vehicle4 = new Vehicle();
		if (choiceS.equals("Y")) {
			Vehicle4 = new Vehicle("NKP8836", "Ford", "Model T", 2896, "black", Customer4);
		} else {
			Vehicle4 = new Vehicle();
			String[] fields = {"Licence_num","Brand","Model","Cubic_Capacity","Color"};
			String[] inputs = new String[5];

			for (int i = 0; i < fields.length; i++) {
				System.out.println(String.format("%s: ", fields[i]));
				inputs[i] = scan.nextLine();
			}
			
			for (int i = 0; i < inputs.length; i++) {
				if (inputs[i]=="") {
					System.out.println(String.format("%s δεν δοθηκε τιμη ", fields[i]));
					while (inputs[i]=="") {
						System.out.println(String.format("%s: ", fields[i]));
						inputs[i] = scan.nextLine();
					}
				}
			}
			Vehicle4.setLicence_num(inputs[0]);
			Vehicle4.setBrand(inputs[1]);
			Vehicle4.setModel(inputs[2]);
			Vehicle4.setCubic_Capacity(Integer.valueOf(inputs[3]));
			Vehicle4.setColor(inputs[4]);
			Vehicle4.setOwner(Customer4);
			
			
		}
		if (!Customer4.getVehicle_catalog().Add(Vehicle4)) {
			System.out.println(String.format("Οχημα με αριθμο πινακιδας %s υπαρχει. Δεν ειαι δυνατη η αρχειοθέτηση του οχηματος.", Vehicle4.getLicence_num()));
		} else {
			System.out.println("Επιτυχής Προσθήκη Οχήματος");
		}
		
		
		
		System.out.println("Τελος Σεναριου, η συνεχεια είναι παραδειγμα Αρχειοθέτηση εντύπου πελάτη ως Πρακρορας1");
		Customer Customer5 = new Customer();
		System.out.println("Προεπιλεγμένα δεδομένα(Καραγιάννης Αρσένιος, 14-04-2004, Ανθέων 75, Περαία 570 19, XXXXXXXX, AO79438); [Υ/Ν]: ");
		choiceS = scan.nextLine();
		if (choiceS.equals("Y")) {
			Customer5 = new Customer("Καραγιάννης Αρσένιος", "14-04-2004", "Ανθέων 75, Περαία 570 19", "XXXXXXXX", Agent1, "AO79438", vehicle_catalog);
		} else {
			Customer5 = new Customer();
			String[] fields = {"Name","Birth_date","Address","Driver_licence_num","Identity_num"};
			String[] inputs = new String[5];

			for (int i = 0; i < fields.length; i++) {
				System.out.println(String.format("%s: ", fields[i]));
				inputs[i] = scan.nextLine();
			}
			
			for (int i = 0; i < inputs.length; i++) {
				if (inputs[i]=="") {
					System.out.println(String.format("%s δεν δοθηκε τιμη ", fields[i]));
					while (inputs[i]=="") {
						System.out.println(String.format("%s: ", fields[i]));
						inputs[i] = scan.nextLine();
					}
				}
			}
			Customer5.setName(inputs[0]);
			Customer5.setBirth_date(inputs[1]);
			Customer5.setAddress(inputs[2]);
			Customer5.setDriver_licence_num(inputs[3]);
			Customer5.setIdentity_num(inputs[4]);
			Customer5.setRespons_agent(Agent1);
			Customer5.setVehicle_catalog(vehicle_catalog);
			
			
		}
		if (!Agent1.getCustomers_catalog().add(Customer5)) {
			System.out.println(String.format("Οχημα με αριθμο ταυτοτητας %s υπαρχει. Δεν ειαι δυνατη η αρχειοθέτηση του πελάτη.", Customer5.getIdentity_num()));
		} else {
			System.out.println("Επιτυχής Προσθήκη πελάτη");
		}
		
		
		System.out.println("Τελος Σεναριου, η συνεχεια είναι παραδειγμα Ακύρωση ασφάλειας οχήματος ως Πρακρορας1");
		Customer[] Customers2 = Agent1.getCustomers_catalog().get_client_filter_by_agent(Agent1);
		System.out.println("Πελάτες:");
		for (int i = 0 ; i < Customers2.length; i++) {
			System.out.println(String.format("[%d] %s", i, Customers2[i].getName()));
		}
		System.out.println("Επιλογή; ");
		int choice2 = Integer.valueOf(scan.nextLine());
		System.out.println(String.format("Επιλεχθηκε ο/η %s", Customers2[choice2].getName()));
		
		Customer Customer6 = Customers2[choice2];
		
		ArrayList<Vehicle> VehiclesWithContracts = new ArrayList<Vehicle>();
		for (Insurance_Contract i :insurance_Contract_Catalog.getAll()) {
			if (i.getCustomer()==Customer6) {
				VehiclesWithContracts.add(i.getVehicle());
			}
		}
		
		System.out.println("Οχηματα:");
		for (int i = 0 ; i < VehiclesWithContracts.size(); i++) {
			System.out.println(String.format("[%d] %s", i, VehiclesWithContracts.get(i).getLicence_num()));
		}
		System.out.println("Επιλογή; ");
		choice2 = Integer.valueOf(scan.nextLine());
		
		for (int j = 0; j < insurance_Contract_Catalog.getAll().length; j++) {
			Insurance_Contract i = insurance_Contract_Catalog.getAll()[j];
			if (i.getVehicle()==VehiclesWithContracts.get(choice2)) {
				i.getInsurance_package().getProvider().cansel_insurance(VehiclesWithContracts.get(choice2));
			}
			
			insurance_Contract_Catalog.deleteContract(j);
			
		}
		System.out.println("Η ασφάλεια ακυρωθηκε");
		
		System.out.println("Τελος Σεναριου, η συνεχεια είναι παραδειγμα Αναζήτηση στοιχείων πελάτη ως Πρακρορας1");
		System.out.println("Oνομα πελάτη: ");
		String nameToSearch = scan.nextLine();
		Customer result = Agent1.getCustomers_catalog().search_by_name(Agent1, nameToSearch);
		if (result==null) {
			System.out.println("Δεν βρεθηκε πελατης σου με αυτο το ονομα: ");
		} else { 
			System.out.println(String.format("%s, %s, %s, %s, %s", result.getName(), result.getBirth_date(), result.getAddress(), result.getDriver_licence_num(), result.getIdentity_num()));
		}
		
		System.out.println("Τελος Σεναριου, η συνεχεια είναι παραδειγμα δημιουργια Πακέτου Ασφάλισης ως Πρακρορας1");
		System.out.println("Ασφαληστικες:");
		for (int i = 0 ; i < Insurance_Companies.length; i++) {
			System.out.println(String.format("[%d]", i));
		}
		System.out.println("Επιλογή; ");
		int choice3 = Integer.valueOf(scan.nextLine());
		System.out.println("Κωδικος:");
		String Code = scan.nextLine();
		System.out.println("Περιγραφη:");
		String Description = scan.nextLine();
		Insurance_Package InsPack = new Insurance_Package(Description, Code, Insurance_Companies[choice3]);
		insurance_Package_Catalog.Add(InsPack);
		
		
	}
		

}
