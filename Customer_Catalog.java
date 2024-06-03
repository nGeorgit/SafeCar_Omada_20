import java.util.ArrayList;

public class Customer_Catalog {
	
	private ArrayList<Customer> catalog;

	public Customer_Catalog() {
		catalog = new ArrayList<Customer>();
	}
	
	public Customer_Catalog(ArrayList<Customer> acatalog) {
		catalog = acatalog;
	}
	

	public Customer[] get_client_filter_by_agent(Agent agent) {
		ArrayList<Customer> tempArray = new ArrayList<Customer>();
		
		
		for (int i = 0; i < catalog.size(); i++) {
			  Customer customer = catalog.get(i);
			  Agent aAgent = customer.getRespons_agent();
			  if (aAgent == agent) {
				  tempArray.add(customer);
			  }
			}
		
		Customer[] customersOfAgent = new Customer[tempArray.size()];
		customersOfAgent = tempArray.toArray(customersOfAgent);
		return customersOfAgent;
	}

	/**
	 * 
	 * @param client
	 */
	public boolean add(Customer customer) {
		for (Customer i : catalog) {
			if (i.getIdentity_num().equals(customer.getIdentity_num())) {
				return false;
			}
		}
		catalog.add(customer);
		return true;
	}

	public String[] get_names() {
		ArrayList<String> tempArray = new ArrayList<String>();
		
		
		for (int i = 0; i < catalog.size(); i++) {
			  Customer customer = catalog.get(i);
			  tempArray.add(customer.getName());
			}
		
		String[] Names = new String[tempArray.size()];
		Names = tempArray.toArray(Names);
		return Names;
	}
	
	public Customer[] get_All() {
		Customer[] customers = new Customer[catalog.size()];
		customers = catalog.toArray(customers);
		return customers;
	}

	public Customer search_by_name(Agent agent, String aName) {
		Customer[] customersOfAgent = this.get_client_filter_by_agent(agent);
		for (Customer i: customersOfAgent) {
			if (i.getName().equals(aName)) {
				return i;
			}
		}
		return null;
	}

}