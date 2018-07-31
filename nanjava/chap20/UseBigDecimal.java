import java.math.*;
import java.util.Scanner;

public class UseBigDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal bd1,bd2;
		
		System.out.print("두 실수 : ");
		bd1 = sc.nextBigDecimal(); 
		bd2 = sc.nextBigDecimal();
		
		if(bd1.compareTo(bd2)==1)
			System.out.println("두 실수의 차에 대한 절대값 : " + bd1.subtract(bd2));
		else
			System.out.println("두 실수의 차에 대한 절대값 : " + bd2.subtract(bd1));
	}
}
