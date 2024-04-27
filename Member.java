package Assignment5;

import java.time.LocalDate;

public class Member 
{
	 private String firstName;
	    private String lastName;
	    private LocalDate dateOfBirth;
	    private String city;
	    private String zipCode;

	    public Member(String firstName, String lastName, LocalDate dateOfBirth, String city, String zipCode) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.dateOfBirth = dateOfBirth;
	        this.city = city;
	        this.zipCode = zipCode;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public LocalDate getDateOfBirth() {
	        return dateOfBirth;
	    }

	    public String getCity() {
	        return city;
	    }

	    public String getZipCode() {
	        return zipCode;
	    }
	}

