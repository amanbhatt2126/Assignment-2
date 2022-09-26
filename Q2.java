
public class Q2{

	public static void main(String[] args) {
	// Q2	Write the main() method of the MinOfThree class that determines which of the
	//	three numbers is the smallest number, and displays that number using if-else
	//	statement.(Note: You don’t have to take input from user. )
		
		int a  =  4; 
		int b  = 5; 
		int c  = 6; 
		
		if(a<b && a<c)
		{
		   System.out.println("Smallest number is " + a);
		}
		else if(b<a && b<c)
		{
			System.out.println("Smallest number is " + b);
		}
		else
		{
			System.out.println("Smallest number is " + c);
		}
		
		


	}

}
