public class CheckExtend {
	public static void main(String[] args) {
		HybridWaterCar car = new HybridWaterCar(10,20,30);
		car.showCurrentGauge();
	}
}

class Car {
	int gasolineGauge;
	
	public Car(int gas) {
		gasolineGauge = gas;
	}
}

class HybridCar extends Car {
	int electricGauge;
	
	public HybridCar(int gas, int elec) {
		super(gas);
		electricGauge = elec;
	}
}

class HybridWaterCar extends HybridCar {
	int waterGauge;
	
	public HybridWaterCar(int gas, int elec, int wat) {
		super(gas, elec);
		waterGauge = wat;
	}
	
	public void showCurrentGauge() {
		System.out.println("잔여 가솔린 : " + gasolineGauge);
		System.out.println("잔여 전기량 : " + electricGauge);
		System.out.println("잔여 워터량 : " + waterGauge);
	}
}
