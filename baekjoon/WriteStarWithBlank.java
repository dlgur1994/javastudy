import java.util.Scanner;

public class WriteStarWithBlank {
	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		
		num = scan.nextInt();
		
		for(int i=1 ; i<num+1 ; i++) {
			for(int j=num-i ; j>0 ; j--) {
				System.out.print(" ");
			}
			for(int j=0 ; j<i ; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
