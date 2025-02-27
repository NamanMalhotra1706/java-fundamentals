import java.util.Scanner;

class AddTwoNumbers{
  public static int addTwoNumbers(int number1, int number2){
	return number1+number2;
  }
  
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the first Number: ");
	int number1 = sc.nextInt();
		
	System.out.print("Enter the second Number: ");
	int number2 = sc.nextInt();
	
	System.out.println("Sum of Two Number:" + addTwoNumbers(number1,number2));
  }
}
