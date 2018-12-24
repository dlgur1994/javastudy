import java.util.Scanner;

public class GetSumUntilN {
	public static void main(String[] args) {
		int num, sum=0;
		Scanner scan = new Scanner(System.in);
		
		num = scan.nextInt();
		
		for(int i=1 ;i<num+1 ; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}
}
