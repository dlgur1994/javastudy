import java.util.Scanner;

public class WrtieStarWithBlank2 {
	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		
		num = scan.nextInt();
		
		for(int i=num ; i>0 ; i--) {
			for(int j=num-i ; j>0 ;j--)
				System.out.print(" ");
			for(int j=i ; j>0 ; j--) 
				System.out.print("*");
			System.out.println("");
		}
	}
}
