import java.util.Scanner;

public class PrintFromN {
	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		
		num = scan.nextInt();
		
		for(int i=num ; i>0 ; i--) {
			System.out.println(i);
		}
	}
}
