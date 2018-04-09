package sda.java9.wpj.advanced.oop.course.people;

public class CourseManager {
	
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
    
    public String sayGreetings() {
        return "Witajcie na kursie Java";
    }
     
	 
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    public void setPhoneNumber(String email) {
		this.phoneNumber = phoneNumber;
	}
}