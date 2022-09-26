
public class Q4 {

	public static void main(String[] args) {
		// Q4 A city of 80,000 peoples is increasing at the rate of 5% annually. When will
		// their population first exceed 150000? Write a java program for it. Use While Loop. 
		
		int population = 80000;
        int incR= 5;
        int yr= 0;
        while(population<=150000){
            population += (int)(incR*population)/100;
            yr++;
        }
        System.out.println(yr);
		


	}

}
