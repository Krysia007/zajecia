package sda.java9.wpj.advanced.oop.course.people;

import sda.java9.wpj.advanced.oop.course.rooms.ClassRoom;

public class Trainee 
{
    private String name;
    private boolean attendanceOfTrainee;
    private String lateTrainies;
    private String trainiesLaptop;
    private boolean fullTrainiesCup;
    private String trainiesDinner;
    private String trainiesTrener;
    public boolean ourRoomIsOpen;
	
	
    public Trainee() {}

    public Trainee (String name, String TrainiesLaptop, boolean attendanceOfTrainee, String lateTrainies, boolean fullTrainiesCup, String TraineesDinner, String traineesTrener)
    {
        this.name = name;
        this.trainiesLaptop = trainiesLaptop; 
        this.attendanceOfTrainee = attendanceOfTrainee;
        this.lateTrainies = lateTrainies;
        this.fullTrainiesCup = fullTrainiesCup;
        this.trainiesDinner = trainiesDinner;
        this.trainiesTrener = trainiesTrener;
            
    }
    


    public String sayGreetings() {
		
		String greet = "No witam witam, dzien dobry";
        return greet; 
	}

    public boolean enter(ClassRoom ourRoom) 
	{
		if (ourRoomIsOpen)
		{
			return true;
		}	
		else 
		{
			return false;
		}

    }

    public String getName ()
    {
        return name;
    }

    public String getTrainiesLaptop ()
    {
        return trainiesLaptop;
    }

    public boolean getAttendanceOfTrainee ()
    {
        return attendanceOfTrainee;
    }

    public boolean getFullTrainiesCup ()
    {
        return fullTrainiesCup;
    }

    public String getTrainiesTrener ()
    {
        return trainiesTrener;
    }

    public String getTrainiesDinner ()
    {
        return trainiesDinner;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public void setTrainiesLaptop (String name)
    {
        this.trainiesLaptop = trainiesLaptop;
    }

public void setTrainiesDinner (String name)
{
	this.trainiesDinner = trainiesDinner;
}
    
}