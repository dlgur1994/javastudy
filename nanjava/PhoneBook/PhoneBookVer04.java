import java.util.Scanner;

class PhoneUnivInfo extends PhoneInfo{
	String major;
	int year;
	
	public PhoneUnivInfo (String na, String pNumber, String maj, int yea){
		super(na,pNumber);
		major = maj;
		year = yea;
	}
	
	@Override
	public void ShowPhoneInfo() {
		super.ShowPhoneInfo();
		System.out.println("major: " + major);
		System.out.println("year: " + year);
	}
}

class PhoneCompanyInfo extends PhoneInfo{
	String company;
	
	public PhoneCompanyInfo (String na, String pNumber, String com){
		super(na,pNumber);
		company = com;
	}
	
	@Override
	public void ShowPhoneInfo() {
		super.ShowPhoneInfo();
		System.out.println("company: " + company);
	}
}

class PhoneBookManager {
	Scanner sc = new Scanner(System.in);
	String name;
	String phoneNumber;
	String birthday;
	int index=0;
	static PhoneInfo[] per = new PhoneInfo[100];
	
	public void showMenu() {
		System.out.println("선택하세요");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 프로그램 종료");
		System.out.print("선택 : ");
	}
	
	public void showMenu2() {
		System.out.println("1. 일반, 2. 대학, 3. 회사");
		System.out.print("선택>> ");
	}
	
	public void getFriendInfo() {
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("전화번호 : ");
		phoneNumber = sc.nextLine();
		
		per[index++] = new PhoneInfo(name, phoneNumber);
		System.out.println("데이터 입력이 완료되었습니다");
	}
	
	public void getUnivFriendInfo() {
		String major;
		int year;
		
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("전화번호 : ");
		phoneNumber = sc.nextLine();
		System.out.print("전공 : ");
		major = sc.nextLine();
		System.out.print("학년 : ");
		year = sc.nextInt();
		sc.nextLine();
		
		per[index++] = new PhoneUnivInfo(name, phoneNumber, major, year);
		System.out.println("데이터 입력이 완료되었습니다");
	}
	
	public void getCompanyFriendInfo() {
		String company;
		
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("전화번호 : ");
		phoneNumber = sc.nextLine();
		System.out.print("직장 : ");
		company = sc.nextLine();
		
		per[index++] = new PhoneCompanyInfo(name, phoneNumber, company);
		System.out.println("데이터 입력이 완료되었습니다");
	}
	
	public void searchInfo() {
		String fname;
		
		System.out.print("이름 : ");
		fname = sc.nextLine();
		
		for(int i=0 ; i<index ; i++) {
			if(per[i].name.equals(fname))
				per[i].ShowPhoneInfo();
		}
		System.out.println("데이터 검색이 완료되었습니다");
	}
	
	public void deleteInfo() {
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
}

class PhoneBookVer04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		int choice2;
		PhoneBookManager manager = new PhoneBookManager();
		
		while(true) {
			manager.showMenu();
			choice = sc.nextInt();
			sc.nextLine();
			
			if(choice == 1) {
				System.out.println("데이터 입력을 시작합니다");
				manager.showMenu2();
				choice2 = sc.nextInt();
				if(choice2 == 1) {
					manager.getFriendInfo();
					System.out.println();
				}
				else if(choice2 == 2) {
					manager.getUnivFriendInfo();
					System.out.println();
				}
				else {
					manager.getCompanyFriendInfo();
					System.out.println();
				}
			}
			else if(choice == 2) {
				System.out.println("데이터 검색을 시작합니다");
				manager.searchInfo();
				System.out.println();
			}			
			else if(choice == 3) {
				System.out.println("데이터 삭제을 시작합니다");
				manager.deleteInfo();
				System.out.println();
			}			
			else {
				System.out.println("종료");
				return;
			}
		}
	}
}
