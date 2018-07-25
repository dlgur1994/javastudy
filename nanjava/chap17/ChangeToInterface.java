interface TV {
	public void onTV();
}
class TVImpl implements TV {
	public void onTV() {
		System.out.println("영상 출력 중");
	}
}

interface Computer {
	public void dataReceive();
}
class ComputerImpl implements Computer {
	public void dataReceive() {
		System.out.println("영상 데이터 수신 중" );
	}
}

class IPTV implements TV, Computer {
	TVImpl tv = new TVImpl();
	ComputerImpl com = new ComputerImpl();
	
	public void onTV() {
		tv.onTV();
	}
	public void dataReceive() {
		com.dataReceive();
	}
	public void powerOn() {
		onTV();
		dataReceive();
	}
}

public class ChangeToInterface {
	public static void main(String[] args) {
		IPTV iptv = new IPTV();
		iptv.powerOn();
		
		TV tv = iptv;
		Computer com = iptv;
	}
}
