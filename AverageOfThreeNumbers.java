import java.util.Scanner;

class AverageOfThreeNumbers{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number1 : ");
		int number1 = sc.nextInt();
		
		System.out.print("Enter the number2 : ");
		int number2 = sc.nextInt();
		
		System.out.print("Enter the number3 : ");
		int number3 = sc.nextInt();
		
		System.out.println("Average of above Number : " + (number1+number2+number3)/3);
	}	
}