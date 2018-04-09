package sda.java9.wpj.advanced.oop.course;

import sda.java9.wpj.advanced.oop.course.people.*;
import sda.java9.wpj.advanced.oop.course.items.*;
import sda.java9.wpj.advanced.oop.course.rooms.*;
import sda.java9.wpj.advanced.oop.course.content.*;

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
        
        // Menedżer kursu otwiera Salę szkoleniową i wchodzi do niej.
        manager.openRoom(ourRoom);
        manager.enterRoom(ourRoom);
        System.out.println(manager.getRoom());
        
        // Uczestnik wchodzi do sali
        success = firstTrainee.enter(ourRoom);
        System.out.println("Czy udalo sie wejsc do sali: " + success);
        System.out.println(firstTrainee);
        System.out.println(java.util.Arrays.toString(ourRoom.getTrainees()));
        System.out.println(manager);
        System.out.println(ourRoom.getCourseManager());
        
        // Pojawiają się pozostali Uczestnicy
        Trainee[] trainees = new Trainee[11];
        trainees[0] = firstTrainee;
        trainees[1] = new Trainee();
        trainees[1].setName("Krysia");
        trainees[2] = new Trainee("Artur");
        trainees[3] = new Trainee("Norbert");
        trainees[4] = new Trainee("Michał");
        trainees[5] = new Trainee("Krzysztof");
        trainees[6] = new Trainee("Wojtek");
        trainees[7] = new Trainee("Michał");
        trainees[8] = new Trainee("Sebastian");
        trainees[9] = new Trainee("Jacek");
        trainees[10] = new Trainee("Grzesiek");
        
        // Uczestnicy wchodzą do Sali szkoleniowej.
        for (int i = 1; i < trainees.length; i++) {
            if (trainees[i] == null) {
                continue;
            }
            trainees[i].enter(ourRoom);
        }
        System.out.println(java.util.Arrays.toString(ourRoom.getTrainees()));    
        
        // Uczestnicy przedstawiają się [do tej pory wszyscy stoją].
        for (Trainee trainee : trainees) {
            System.out.println(trainee.sayGreetings());
        }
        
        // Pojawia się Trener, wchodzi do Sali i przedstawia się
        Trainer theTrainer = new Trainer();
        theTrainer.setName("On");
        
        theTrainer.enterRoom(ourRoom);
        System.out.println(ourRoom.getTrainer());
        
        // Menedżer kursu opowiada o Kursie, przedstawia informacje ogólne
        Course sdaJava = new Course();
        sdaJava.setTitle("Java");
        System.out.println(manager.sayCourseInfo(sdaJava));
    }
}