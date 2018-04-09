package sda.java9.wpj.advanced.oop.course.people;


public class Trainee 
{
    private String name;
    private boolean attendanceOfTrainee;
    private String lateTrainies;
    private String trainiesLaptop;
    private boolean fullTrainiesCup;
    private String trainiesDinner;
    private String trainiesTrener;
    
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

<<<<<<< HEAD
public void setTrainiesDinner (String name)
{
	this.trainiesDinner = trainiesDinner;
}
    

=======
        
>>>>>>> a532f23f2253cb0a5d6e666a51e1c21798624fb4
}