package sda.java9.wpj.advanced.oop.course.rooms;

import sda.java9.wpj.advanced.oop.course.people.*;
import sda.java9.wpj.advanced.oop.course.items.*;
import sda.java9.wpj.advanced.oop.course.rooms.*;

public class ClassRoom {
    
	private Board board;
	private Chair[] chairs;
	private Table[] tables;
	private CourseManager courseManager;
	private Trainee[] trainees;
	private Trainer trainer;
	boolean isOpen; 
	
	// GETERY
	
	public boolean getIsOpen(){
		return isOpen;
	}
	
	public Board getBoard(){
		return board;
	}
	
	public Chair[] getChair(){
		return chairs;
	}
	
	public Table[] getTable(){
		return tables;
	}
	
	public CourseManager getCourseManager(){
		return courseManager;
	}
	
	public Trainee[] getTrainees(){
		return trainees;
	}
	
	public Trainer getTrainer(){
		return trainer;
	}
	
	// SETERY
	
	public void setIsOpen(boolean isOpen){
		this.isOpen = isOpen;
	}
	
	public void setBoard(Board board){
		this.board = board;
	}
	
	public void setChair(Chair[] chairs){
		this.chairs = chairs;
	}
	
	public void setTable(Table[] tables){
		this.tables = tables;
	}
	
	public void setCourseManager(CourseManager courseManager){
		this.courseManager = courseManager;
	}
	
	public void setTrainees(Trainee[] trainees){
		this.trainees = trainees;
	}
	
	public void setTrainer(Trainer trainer){
		this.trainer = trainer;
	}
	
	// METODY
	
	public void addTrainee(Trainee trainee){
		for (int i = 0; i < this.trainees.length; i++){
			if (this.trainees[i] == null) {
				trainees[i] = trainee;
				System.out.println("Dodano uczestnika: " + trainee.getName());
			}
		}
		
	}
	
}