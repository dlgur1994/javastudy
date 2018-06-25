public class TwoTwo {
	public static void main(String[] args) {
		int num = 15678;
		int n;
		
		n = (num>>2) & 1;
		if(n==1)
			System.out.println("third bit is 1");
		else
			System.out.println("third bit is 0");
		
		n = (num>>2) & 1;
		if(n==1)
			System.out.println("fifth bit is 1");
		else
			System.out.println("fifth bit is 0");
	}
}
