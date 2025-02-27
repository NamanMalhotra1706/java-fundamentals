import java.lang.Math;
import java.util.Scanner;

class AreaOfCircle{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the radius: ");
	int radius = sc.nextInt();
	
	System.out.print("Area of Circle: " + (Math.PI * (Math.pow(radius,2))));
}
}