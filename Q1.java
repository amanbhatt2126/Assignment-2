import java.util.Scanner;

public class Q1{

	public static void main(String[] args) {
// Question 1- Suppose that score is a variable of type double.
//Write the java statement that increases the score by 5 marks if score is between 80 and 90.
		
		double score; 
	 Scanner myObj = new Scanner(System.in); 
	 System.out.println("Enter Score");
	 double sc = myObj.nextDouble() ;
	 if(sc>=80 && sc<=90)
	 {
		 sc = sc+5 ; 
	 }
	 System.out.println((double)sc);

	}

}
