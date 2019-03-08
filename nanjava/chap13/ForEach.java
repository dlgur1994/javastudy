import java.util.Scanner;

public class ForEach {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		
		for(int i=0 ; i<10 ; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Max value is " + maxValue(arr));
		System.out.println("Min value is " + minValue(arr));
	}
	
	public static int minValue(int[] arr) {
		int min = arr[0];
		
		for(int e : arr) {
			if(min>e)
				min = e;
		}
		
		return min;
	}
	
	public static int maxValue(int[] arr) {
		int max = arr[0];
		
		for(int e : arr) {
			if(max<e)
				max = e;
		}
		
		return max;
	}
}
