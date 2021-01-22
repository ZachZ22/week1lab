
public class Betalabweek1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Video 1
		
		
		// Plane seats left on a flight
		int planeSeatsLeft = 150;
		// Cost of groceries at checkout
		double costOfGroceries = 57.15;
		// Middle initial
		char middleInitial = 'C';
		// hot or cold outside
		boolean coldOutSide = true;
		// hold customers first name
		String firstName = "Zachary";
		// hold street address
		int streetAdressNumber = 5596;
		String nameOfAdressStreet = " S Kettle St";
		//printing the customers address
		System.out.println("The customers adress is " + streetAdressNumber + nameOfAdressStreet);
		//Two plane seats are booked.
		System.out.println(planeSeatsLeft - 2 + " Seats left on the the plane.");
		//Impulse candy bar
		double candyBar = 2.15;
		System.out.println((costOfGroceries + candyBar) +  " is the new total for groceries.");
		
		
		
		// Now Printing all variables
		
		System.out.println(planeSeatsLeft - 2 + " Seats left on the the plane.");
		System.out.println("My name is: " + firstName + " " + middleInitial);
		System.out.println("I live on "  + streetAdressNumber + nameOfAdressStreet);
		System.out.println("It is cold out today. : " + coldOutSide);
		System.out.println("I spent " + costOfGroceries + " on groceries. Ultill i decided to buy a candy bar, my new total was: " + (candyBar + costOfGroceries));
	
		
		
	//video 2
		
		
		// Customer booked 2 plane seats
		System.out.println(planeSeatsLeft -= 2);
		// impulse buy.
		System.out.println(costOfGroceries += candyBar);
		//Change middeInitial to something else
		middleInitial = 'Z';
		System.out.println(middleInitial);
		// Change season
		coldOutSide = !coldOutSide;
		System.out.println(coldOutSide);
		// full name
		String fullName = firstName + " " + middleInitial +" Zerbst";
		System.out.println(fullName);
		System.out.println("My name is " + fullName + " " + "and i live at " + streetAdressNumber + nameOfAdressStreet );
				
		
		
		
		
		
		
		
		
		
	}

}
