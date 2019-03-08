import java.util.Scanner;

public class PhoneBookVer03 {
	static Scanner sc = new Scanner(System.in);
	static String name;
	static String phoneNumber;
	static String birthday;
	static int index=0;
	static PhoneInfo[] per = new PhoneInfo[100];
	
	public static void showMenu() {
		System.out.println("선택하세요");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 프로그램 종료");
		System.out.print("선택 : ");
	}
	
	public static void getInfo() {
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("전화번호 : ");
		phoneNumber = sc.nextLine();
		System.out.print("생년월일 : ");
		birthday = sc.nextLine();
		
		per[index] = new PhoneInfo(name, phoneNumber, birthday);
		index++;
		System.out.println("데이터 입력이 완료되었습니다");
	}
	
	public static void searchInfo() {
		String fname;
		
		System.out.print("이름 : ");
		fname = sc.nextLine();
		
		for(int i=0 ; i<index ; i++) {
			if(per[i].name.equals(fname))
				per[i].ShowPhoneInfo();
		}
		System.out.println("데이터 검색이 완료되었습니다");
	}
	
	public static void deleteInfo() {
		String fname;
		int del=0;
		
		System.out.print("이름 : ");
		fname = sc.nextLine();
		
		for(int i=0 ; i<index ; i++) {
			if(per[i].name.equals(fname))
				del = i;
		}
		for(int i=del ; i<index-1 ; i++) {
			per[i] = per[i+1];
		}
		
		System.out.println("데이터 삭제가 완료되었습니다");
	}
	
	public static void main(String[] args) {
		int choice;
		
		while(true) {
			showMenu();
			choice = sc.nextInt();
			sc.nextLine();
			
			if(choice == 1) {
				System.out.println("데이터 입력을 시작합니다");
				getInfo();
				System.out.println();
			}
			else if(choice == 2) {
				System.out.println("데이터 검색을 시작합니다");
				searchInfo();
				System.out.println();
			}			
			else if(choice == 3) {
				System.out.println("데이터 삭제을 시작합니다");
				deleteInfo();
				System.out.println();
			}			
			else {
				System.out.println("종료");
				return;
			}
		}
	}
}
