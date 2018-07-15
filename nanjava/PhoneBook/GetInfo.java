import java.util.Scanner;

class GetInfo {
	public void showMenu() {
		System.out.println("선택하세요");
		System.out.println("1.데이터 입력");
		System.out.println("2.프로그램 종료");
		System.out.print("선택: ");
	}
	
	public void getMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("전화번호 : ");
		String number = sc.nextLine();
		System.out.print("생년월일 : ");
		String birth = sc.nextLine();
		
		PhoneInfo pi = new PhoneInfo(name,number,birth);
		pi.showPhoneInfo();
		System.out.println("");
	}
}
