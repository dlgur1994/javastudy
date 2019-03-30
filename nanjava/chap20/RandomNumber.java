import java.util.Scanner;

public class RandomNumber {
	public static int randomRange(int n1, int n2) {
		return (int) (Math.random() * (n2-n1+1) + 1);
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int A;
		int B;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		System.out.println(randomRange(A, B));
	}
}
