import java.util.Scanner;

public class PrintUntilN {
	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		
		num = scan.nextInt();
		
		for(int i=1 ; i<num+1 ; i++) {
			System.out.println(i);
		}
	}
}
