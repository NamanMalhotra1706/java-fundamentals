import java.util.Scanner;
import java.lang.Math;

class VolumeOfCylinder{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the radius: ");
	int radius = sc.nextInt();
	
	System.out.print("Enter the Height: ");
	int height = sc.nextInt();
	
	System.out.print("Volume of Cylinder: " + (Math.PI * (Math.pow(radius,2)) * height));
	}
}