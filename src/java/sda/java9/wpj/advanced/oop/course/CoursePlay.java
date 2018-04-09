package sda.java9.wpj.advanced.oop.course;

import sda.java9.wpj.advanced.oop.course.people.*;
import sda.java9.wpj.advanced.oop.course.items.*;
import sda.java9.wpj.advanced.oop.course.rooms.*;

public class CoursePlay {
    
    public static void main(String[] args) {
        
        // Pojawia się pierwszy Uczestnik kursu. 
        Trainee firstTrainee = new Trainee();
        
        // Uczestnik Kursu próbuje wejść do Sali szkoleniowej, ale jest zamknięta.
        ClassRoom ourRoom = new ClassRoom(20);
        boolean success = firstTrainee.enter(ourRoom);
        System.out.println("Czy udalo sie wejsc do sali: " + success);
        
        // Pojawia się Menedżer kursu i przedstawia się. Uczestnik kursu przedstawia się.
        CourseManager manager = new CourseManager();
        manager.setFirstName("Krzysiu");
        manager.setLastName("Matuszewski");
        manager.setPhoneNumber("888");
        manager.setEmail("krzysztof.matuszewski@sda.pl");
        String managerGreetings = manager.sayGreetings();
        System.out.println(managerGreetings);
        
        firstTrainee.setName("Michal");
        String traineeGreetings = firstTrainee.sayGreetings();
        System.out.println(traineeGreetings);
        
        
            
        
        
        
    }
}