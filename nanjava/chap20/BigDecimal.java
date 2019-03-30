import java.util.Scanner;
import java.math.*;

public class BigDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		java.math.BigDecimal num1;
		java.math.BigDecimal num2;
		
		num1 = sc.nextBigDecimal();
		num2 = sc.nextBigDecimal();
		
		if(num1.compareTo(num2) > 0)
			System.out.println(num1.subtract(num2));
		else
			System.out.println(num2.subtract(num1));
	}
}
