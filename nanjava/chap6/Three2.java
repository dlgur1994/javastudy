public class Three2 {
	public static void main(String[] args) {
		System.out.println("16의 2진수");
		tentotwo(16);
	}
	
	public static void tentotwo(int num) {
		if(num<2)
			System.out.println(num);
		else {
			tentotwo(num/2);
			System.out.println(num%2);
		}	
	}
}
