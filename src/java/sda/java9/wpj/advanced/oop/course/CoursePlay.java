package sda.java9.wpj.advanced.oop.course;

import sda.java9.wpj.advanced.oop.course.people.*;
import sda.java9.wpj.advanced.oop.course.items.*;
import sda.java9.wpj.advanced.oop.course.rooms.*;

public class CoursePlay {
    
    public static void main(String[] args) {
        
        // Pojawia się pierwszy Uczestnik kursu. 
        Trainee firstTrainee = new Trainee();
        
        // Uczestnik Kursu próbuje wejść do Sali szkoleniowej, ale jest zamknięta.
        ClassRoom ourRoom = new ClassRoom();
        boolean success = firstTrainee.enter(ourRoom);
        System.out.println("Czy udalo sie wejsc do sali: " + success);
            
        
        
        
    }
}