public class Vehicle {

	private String Licence_num;
	private String Brand;
	private String Model;
	private int Cubic_Capacity;
	private String Color;
	private Customer Owner;
	
	public Vehicle() {
	}
	
	public Vehicle(String licence_num, String brand, String model, int cubic_Capacity, String color, Customer owner) {
		Licence_num = licence_num;
		Brand = brand;
		Model = model;
		Cubic_Capacity = cubic_Capacity;
		Color = color;
		Owner = owner;
	}
	

	public String getLicence_num() {
		return Licence_num;
	}

	/**
	 * 
	 * @param Licence_num
	 */
	public void setLicence_num(String licence_num) {
		Licence_num = licence_num;
	}

	public String getBrand() {
		return Brand;
	}

	/**
	 * 
	 * @param Brand
	 */
	public void setBrand(String brand) {
		Brand = brand;
	}

	public String getModel() {
		return Model;
	}

	/**
	 * 
	 * @param Model
	 */
	public void setModel(String model) {
		Model = model;
	}

	public int getCubic_Capacity() {
		return Cubic_Capacity;
	}

	/**
	 * 
	 * @param Cubic_Capacity
	 */
	public void setCubic_Capacity(int cubic_Capacity) {
		Cubic_Capacity = cubic_Capacity;
	}

	public String getColor() {
		return Color;
	}

	/**
	 * 
	 * @param Color
	 */
	public void setColor(String color) {
		Color = color;
	}

	public Customer getOwner() {
		return Owner;
	}

	/**
	 * 
	 * @param Owner
	 */
	public void setOwner(Customer owner) {
		Owner = owner;
	}

	public void printData() {
	    System.out.println("Licence_num: " + Licence_num + ", " +
	                       "Brand: " + Brand + ", " +
	                       "Model: " + Model + ", " +
	                       "Cubic_Capacity: " + Cubic_Capacity + ", " +
	                       "Color: " + Color);
	}


}