package Model;

import lombok.Data;

@Data
public class Customers {
	
	private int id;
	private String name;
	private String address;
	private String city;
	private int postCode;
	private String country;
	
	public Customers(int id, String name, String address, String city, int postCode, String country) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.city = city;
		this.postCode = postCode;
		this.country = country;
	}

	public Customers(String name, String address, String city, int postCode, String country) {
		super();
		this.name = name;
		this.address = address;
		this.city = city;
		this.postCode = postCode;
		this.country = country;
	}
	
	
	
	

}
