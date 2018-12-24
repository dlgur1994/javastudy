import java.util.Scanner;

public class GetDay {
	public static void main(String[] args) {
		int month, date, day=0;
		Scanner scan = new Scanner(System.in);
		
		month = scan.nextInt();
		date = scan.nextInt();
		
		for(int i=1 ; i<month ; i++) {
			if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12)
				day += 31;
			else if(i==4 || i==6 || i==9 || i==11)
				day += 30;
			else
				day += 28;
		}
		day += date;
		
		day %= 7;
		if(day==1)
			System.out.println("MON");
		else if(day==2)
			System.out.println("TUE");
		else if(day==3)
			System.out.println("WED");
		else if(day==4)
			System.out.println("THU");
		else if(day==5)
			System.out.println("FRI");
		else if(day==6)
			System.out.println("SAT");
		else 
			System.out.println("SUN");
	}
}
