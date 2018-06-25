public class TwoThree {
	public static void main(String[] args) {
		int num = 5;
		int n;
		
		n = (num<<29);
		System.out.println(n);
		
		n = ~num + 1;
		n = (n<<29);
		System.out.println(n);
	}
}
