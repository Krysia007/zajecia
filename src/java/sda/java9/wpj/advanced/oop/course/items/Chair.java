package sda.java9.wpj.advanced.oop.course.items;

public class Chair {

	private String fabric; 
	private String color;
	private int numberOfLegs;			
	private boolean backrestOfTheChair;	//oparcie
	private String mark;				//marka
	private boolean swivel;				//obrotowe
	private boolean useOfChair;			//czy krzesło jest użyte
	
	public boolean getUseOfChair(){
		return useOfChair;
	}
	public void setUseOfChair(boolean useOfChair){
		this.useOfChair = useOfChair;
	}
	
	public String getFabric(){
		return fabric;
	}
	public void setFabric(String fabric){
		this.fabric = fabric;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}
	
	public int getNumberOfLegs(){
		return numberOfLegs;
	}
	
	public void setNumberOfLegs(int numberOfLegs){
		this.numberOfLegs = numberOfLegs;
	}
	
	public boolean getBackrestOfTheChair(){
		return backrestOfTheChair;
	}
	public void setBackrestOfTheChair(boolean backrestOfTheChair){
		this.backrestOfTheChair = backrestOfTheChair;
	}
	
	public String getMark(){
		return mark;
	}
	public void setMark(String mark){
		this.mark = mark;
	}
	
	public boolean getSwivel(){
		return swivel;
	}
	
	public void setSwivel(){
		this.swivel = swivel;
	}
	
	
	
	
}
    
