import java.util.Scanner;

public class GuGudan {
	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
	
		num = scan.nextInt();
		
		for(int i=1 ; i<10 ; i++) {
			System.out.println(num + " * " + i + " = " + num*i );
		}
	}
}
