public class Two1 {
	public static void main(String[] args) {
		System.out.println("원 넓이: " + circle(5));
		System.out.println("원둘레: " + circle1(5));
	}
	
	public static double circle(int num) {
		return num*num*3.14;
	}
	
	public static double circle1(int num) {
		return num*2*3.14;
	}
}
