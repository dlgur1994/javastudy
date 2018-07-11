class Point {
	private int xPos, yPos;
	
	public Point(int x, int y) {
		xPos=x;
		yPos=y;
	}
	public void showPointInfo() {
		System.out.println("["+xPos+","+yPos+"]");
	}
}

class Circle {
	int rad;
	private Point po;
	
	public Circle(int x, int y, int r) {
		po = new Point(x,y);
		rad = r;
	}	
	public void showCircleInfo() {
		System.out.println("radius : "+rad);
		po.showPointInfo();
	}
}

class Ring {
	private Circle c1;
	private Circle c2;
	
	public Ring(int ax, int ay, int ar, int bx, int by, int br) {
		c1 = new Circle(ax, ay, ar);
		c2 = new Circle(bx, by, br);
	}
	public void showRingInfo() {
		System.out.println("Inner Circle Info");
		c1.showCircleInfo();
		System.out.println("Outter Circle Info");
		c2.showCircleInfo();
	}
}

public class One2 {
	public static void main(String[] args) {
		Ring ring = new Ring(1, 1, 4, 2, 2, 9);
		ring.showRingInfo();
	}
}
