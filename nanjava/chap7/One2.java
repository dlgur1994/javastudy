public class One2 {
	public static void main(String[] args) {
		Child ch1 = new Child(15);
		Child ch2 = new Child(9);
		
		ch1.getBead(ch2, 2);
		ch2.getBead(ch1, 7);
		
		ch1.showBead();
		ch2.showBead();
	}
}

class Child {
	int bead;
	
	public Child(int b) {
		bead = b;
	}
	
	public void getBead(Child c, int win) {
		int get = c.lostBead(win);
		bead += get;
	}
	
	public int lostBead(int lose) {
		bead -= lose;
		return lose;
	}
	
	public void showBead() {
		System.out.println(bead);
	}
}
