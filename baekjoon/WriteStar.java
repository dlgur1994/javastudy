import java.util.Scanner;

public class WriteStar {
	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		
		num = scan.nextInt();
		
		for(int i=1 ; i<num+1 ; i++) {
			for(int j=0 ; j<i ; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
