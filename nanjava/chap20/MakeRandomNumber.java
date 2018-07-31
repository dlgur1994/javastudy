import java.util.Random;
import java.util.Scanner;

public class MakeRandomNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max,min;
		Random rand = new Random();
		
		System.out.print("최대 정수: ");
		max = sc.nextInt();
		System.out.print("최소 정소: ");
		min = sc.nextInt();
		
		for(int i=0 ; i<10 ;i++) {
			int num = rand.nextInt(max);
			if(num<min)
				i--;
			else
				System.out.println(num);
		}
	}
}
