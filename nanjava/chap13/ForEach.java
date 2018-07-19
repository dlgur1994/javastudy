import java.util.Scanner;

public class ForEach {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int min,max;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("정수 입력: ");
		
		for(int i=0 ; i<5; i++) {
			arr[i] = sc.nextInt();
		}
		
		min = minValue(arr);
		max = maxValue(arr);
		
		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);
	}
	
	public static int minValue(int[] arr) {
		int min = arr[0];
		for(int e : arr) {
			if(e < min)
				min = e;
		}		
		return min;
	}
	
	public static int maxValue(int[] arr) {
		int max = arr[0];
		for(int e : arr) {
			if(e > max)
				max = e;
		}		
		return max;
	}
}
