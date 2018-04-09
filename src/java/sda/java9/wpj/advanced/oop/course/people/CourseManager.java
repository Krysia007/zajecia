package sda.java9.wpj.advanced.oop.course.people;

import sda.java9.wpj.advanced.oop.course.rooms.*;

public class CourseManager {
	
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
    private ClassRoom classRoom;
    
    public String sayGreetings() {
        return "";
    }
    
    public void openRoom(ClassRoom room) {
        room.setIsOpen(true);
    }
    
    public void enterRoom(ClassRoom room) {
        if (!room.getIsOpen()) {
            if (room.getCourseManager() != null) {
                throw new IllegalStateException("Menedzer juz jest w pokoju!");
            }
            this.openRoom(room);
        }
        this.classRoom = room;
        room.setCourseManager(this);
    }
    
    public ClassRoom getRoom() {
        return classRoom;
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