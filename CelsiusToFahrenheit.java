import java.util.Scanner;

class CelsiusToFahrenheit{
	
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter temperature in Celsius: ");
		int celsius = sc.nextInt();
		
		System.out.println("Temperature in Fahrenheit : " + ((celsius*9/5)+32));
	}
}
