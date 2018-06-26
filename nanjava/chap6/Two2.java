public class Two2 {
	public static void main(String[] args) {
		System.out.println("3은 " + check(3));
		System.out.println("93은 " + check(93));
	}
	
	public static boolean check (int num) {
		for(int i=2 ; i<num ; i++) {
			if((num%i)==0)
				return false;
		}
		return true;
	}
}
