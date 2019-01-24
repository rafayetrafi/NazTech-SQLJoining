package Model;

import lombok.Data;

@Data
public class Employees {
	
	private int id;
	private String firstName;
	private String lastName;
	private String birthDate;
	
	public Employees(int id, String firstName, String lastName, String birthDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}

	public Employees(String firstName, String lastName, String birthDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}

}
