import java.util.Scanner;

class KilometersToMiles{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the distance in kilometers : ");
		double kilometers = sc.nextDouble();
		
		
		System.out.println("Distance in Miles : " + kilometers*0.621371);
	}	
}