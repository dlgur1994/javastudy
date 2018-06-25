public class SixOne {
	public static void main(String[] args) {
		int num=0, count=0;
		
		num++;
		for(;num<100;num++) {
			if((num%5!=0) || (num%7!=0))
				continue;
			count++;
			System.out.println(num);
		}
		System.out.println("count : " + count);
	}
}
