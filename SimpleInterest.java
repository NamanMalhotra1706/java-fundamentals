import java.util.Scanner;

class SimpleInterest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the principal: ");
		int principal = sc.nextInt();
		
		System.out.print("Enter the Rate: ");
		int rate = sc.nextInt();
		
		System.out.print("Enter the time: ");
		int time = sc.nextInt();
		
		 System.out.println("Simple Interest: " + (principal*rate*time)/100 );
		
	}
}