import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		
		// Q3 Consider the index of the month (let say 1 for January). Write a java program to
	//	print the name of the month and number of days in the month. Use Switch Case.
		
		int Month; 
		 Scanner myObj = new Scanner(System.in); 
		 System.out.println("Enter Month");
		 Month = myObj.nextInt() ;
		
		switch(Month)
		{
		case 1:
		    System.out.println("January");
		    break;
		  case 2:
		    System.out.println("February");
		    break;
		  case 3:
		    System.out.println("March");
		    break;
		  case 4:
		    System.out.println("April");
		    break;
		  case 5:
		    System.out.println("May");
		    break;
		  case 6:
		    System.out.println("June");
		    break;
		  case 7:
		    System.out.println("July");
		    break;
		  case 8:
			  System.out.println("August");
			  break ; 
		  case 9:
			  System.out.println("September");
			  break ;
		  case 10:
			  System.out.println("Octuber");
			  break ; 
		  case 11:
			  System.out.println("November");
			  break ;
		  case 12:
			  System.out.println("December");
			  break;
		
		    
		
		}
		
		
		
	
		
		
		
		
		
	}
	


}
