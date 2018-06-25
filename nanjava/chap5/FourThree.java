public class FourThree {
	public static void main(String[] args) {
		int num=1;
		int result=0;
		
		while(num<1001) {
			if((num%2==0) && (num%7==0)) {
				System.out.println(num);
				result += num;
			}	
			num++;
		}
		System.out.println(result);
	}
}
