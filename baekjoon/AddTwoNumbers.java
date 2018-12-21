import java.util.Scanner;

public class AddTwoNumbers {
	public static void main(String[] args) {
		int num1, num2, result;
		Scanner scan = new Scanner(System.in);
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		result = num1+num2;
		
		System.out.println(result);
	}
}
