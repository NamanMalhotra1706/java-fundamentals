import java.util.Scanner;
import java.lang.Math;

class PowerCalculation{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the base : ");
		int base = sc.nextInt();
		
		System.out.print("Enter the exponent: ");
		int exponent = sc.nextInt();
		
		System.out.println("Result : " + Math.pow(base,exponent));
	}	
}