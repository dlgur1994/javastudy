import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		while(true) {
			GetInfo get = new GetInfo();
			get.showMenu();
			
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			sc.nextLine();
			
			if(num==1) {
				get.getMenu();
			}
			
			else if(num==2)
				break;
			else {
				System.out.println("Wrong Number");
			}
		}
	}
}	
