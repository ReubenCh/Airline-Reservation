

public class Passenger {
	
	private String firstName, lastName, seatNumber, aisle, name; 
	public int SORT_BY_NAME;
	public int SORT_BY_SEAT;
	public int sortValue; 
	public int rowNumber; 
	 
	public Passenger(){
		
	}
	
	public Passenger(String first, String last){
		
	}
	
	public Passenger(String first, String last, int row, String aisle){
		
	}
	
//	+ compareTo(p: Passenger): int
//	+ toString(): String
	
	public String getAisle(){
		return aisle; 
	}
	
	public String getFirstName(){
		return firstName; 
	}

	public String getLastName(){
		return lastName; 
	}
	
	public String getName(){
		return name; 
	}
	
	public int getRowNumber(){
		return rowNumber; 
	}
	
	public String getSeatNumber(){
		return seatNumber; 
	}
	
	public void setAisle(String letter){
		aisle = letter; 
	}
	
	public void setFirstName(String first){
		firstName = first; 
	}
	
	public void setLastName(String last){
		lastName = last; 
	}
	
	public void setName(String first, String last){
		name = first + ", " + last; 
	}
	
	public void setRowNumber(int num){
		rowNumber = num; 
	}
	
	public void setSeatNumber(String seatNumber){
		//Check
		this.seatNumber = seatNumber; 
	}
	
	
}
