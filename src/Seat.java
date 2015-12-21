import javax.swing.*;

public class Seat extends JButton {

	private int row; 
	private String aisle, seat, firstName, lastName; 
	private boolean occupied; 

	public Seat() {
	
		super();
	}
	
	public Seat(int rowNumber, String aisle){
		
		super(); 
	}
	
	public void addPassenger(String first, String last){
		
	}
	
	public String getAisle(){
		return aisle; 
	}
	
	public String getName(){
		return firstName + ", " + lastName;
	}
	
	public int getRowNumber(){
		return row;
	}
	
	public String getSeat(){
		return seat; 
	}
	
	public boolean hasPassenger(){
		return occupied; 
	}
	
	public void removePassenger(){
		occupied = false; 
	}
}
