import java.util.Scanner;

class PhoneBookVer02 {
	static Scanner sc = new Scanner(System.in);
	static String name;
	static String phoneNumber;
	static String birthday;
	
	public static void showMenu() {
		System.out.println("선택하세요");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 프로그램 종료");
		System.out.print("선택 : ");
	}
	
	public static void getInfo() {
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("전화번호 : ");
		phoneNumber = sc.nextLine();
		System.out.print("생년월일 : ");
		birthday = sc.nextLine();
		
		PhoneInfo per = new PhoneInfo(name, phoneNumber, birthday);
		System.out.println("입력된 정보 출력");
		per.ShowPhoneInfo();
	}
	
	public static void main(String[] args) {
		int choice;
		
		while(true) {
			showMenu();
			choice = sc.nextInt();
			sc.nextLine();
			
			if(choice == 2) {
				System.out.println("종료");
				return;
			}
			else {
				getInfo();
			}
		}
	}
}
