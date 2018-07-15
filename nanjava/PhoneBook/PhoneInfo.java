public class PhoneInfo {
	private String name, phoneNumber, birthday;
	
	public PhoneInfo(String na, String pn, String bi) {
		name = na;
		phoneNumber = pn;
		birthday = bi;
	}
	
	public PhoneInfo(String na, String pn) {
		name = na;
		phoneNumber = pn;
	}
	
	public void showPhoneInfo() {
		System.out.println(name);
		System.out.println(phoneNumber);
		if(birthday != null)
			System.out.println(birthday);
			
	}
}
