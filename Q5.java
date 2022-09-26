import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
	// Q5 You are to write a program that generates the second, third, and fourth powers
	//	of a list of whole numbers from 1 to n where n can be any number(Let say n=5).
	//	Write a Java program to do this. Show output column headers (see below, n, n^2,
	//	n^3, n^4). Then, use a for loop to iterate from 1 to n, computing each of that loop
	//	variable to the second power, third power and fourth power. Assuming your loop
	//	variable is called i, you can do this either as i*i or Math.pow(i,2). 

		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the value of n");

        int n = myObj.nextInt();
        int[][] array = new int[n][4];
        
        for(int i=1;i<=n;i++){
            array[i-1][0] = i;
            array[i-1][1] = (int)Math.pow(i, 2);
            array[i-1][2] = (int)Math.pow(i, 3);
            array[i-1][3] = (int)Math.pow(i, 4);
        }

        for(int i=1;i<=n;i++){
            for(int j=0;j<4;j++){
                System.out.print(array[i-1][j]+ " ");
            }
            System.out.println();
        }
		
		
		

	}

}
