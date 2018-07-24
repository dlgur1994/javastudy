public class ChangeArray {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
		changeArr(arr);
		
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	public static void changeArr(int[][] arr) {
		int[] dump = arr[arr.length-1];
		for(int i=arr.length-1 ; i>0 ; i--)
			arr[i] = arr[i-1];
		arr[0] = dump;
	}
}
