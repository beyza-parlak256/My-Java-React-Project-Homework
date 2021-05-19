package interfaceAbstractDemo.Entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import interfaceAbstractDemo.Abstract.IEntity;

public class Customer implements IEntity{
	public int id;
	public String firstName;
	public String lastName;
	public LocalDateTime dateOfBirth;
	public String nationalityId;
	
	public Customer(int i, String string, String string2, LocalDate of, String string3) {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public LocalDateTime getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(LocalDateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getNationalityId() {
		return nationalityId;
	}
	
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
}
