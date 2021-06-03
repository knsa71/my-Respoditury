
import java.util.Scanner;

public class Factorizer {

	public static void main(String[] args) {
		
		int count=0;
		int x ;
		
		// Ask user to enter the number
		Scanner mynum =  new Scanner(System.in);//  Scanner object
		System.out.println("Enter thr Number");
		
		x = mynum.nextInt();
		System.out.println(" This factor 0f "+x+" are :");
		for(int i=1; i<x ; i++) {
			if(x % i ==0 ) { // test if the number is prime or not.
				count += 1;
				
				System.out.print(i+" ");
			}
		}
		System.out.println();
		if (count == 1) { // if the number prime.
			System.out.println(" This number is prime number");
		}
		else {
		System.out.println("This number has :"+ count+"  Factors");
		System.out.println(x+" is great number");
		System.out.println(x+" is not prime number");
		}

	}

}
