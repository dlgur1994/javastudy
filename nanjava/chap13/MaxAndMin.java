import java.util.Scanner;

public class MaxAndMin {
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
		int temp;
		
		for(int i=1 ; i<arr.length ; i++) {
			if(arr[0]>arr[i]) {
				temp = arr[i];
				arr[i] = arr[0];
				arr[0] = temp;
			}
		}
		
		return arr[0];
	}
	
	public static int maxValue(int[] arr) {
		int temp;
		
		for(int i=1 ; i<arr.length ; i++) {
			if(arr[0]<arr[i]) {
				temp = arr[i];
				arr[i] = arr[0];
				arr[0] = temp;
			}
		}
		
		return arr[0];
	}
}
