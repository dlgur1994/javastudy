interface TV {
	public void onTV();
}

interface Computer {
	public void dataReceive();
}

class TVImpl {
	public void onTV() {
		System.out.println("영상 출력 중");
	}
}

class ComputerImpl {
	public void dataReceive() {
		System.out.println("영상 데이터 수신 중");
	}
}

class IPTV implements TV, Computer {
	TVImpl tvp = new TVImpl();
	ComputerImpl comp = new ComputerImpl();
	
	public void onTV() {
		System.out.println("영상 출력 중");
	}
	
	public void dataReceive() {
		comp.dataReceive();
	}
	
	public void powerOn() {
		dataReceive();
		onTV();
	}
}

public class ChangeToInterface {
	public static void main(String[] args) {
		IPTV iptv = new IPTV();
		iptv.powerOn();
		
		TV tv = iptv;
		Computer compy = iptv;
	}
}
