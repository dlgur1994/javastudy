public class SixTwo {
	public static void main(String[] args) {
		int num=1;
		int result=0;
		
		while(true) {
			if((num%2==1)||((num&3)==0))
				result += num;
			if(result>1000)
				break;
			num++;
		}
		System.out.println(num);
		System.out.println(result);
	}
}
