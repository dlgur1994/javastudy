class Point {
	int xPos, yPos;
	
	public Point(int x, int y) {
		xPos=x;
		yPos=y;
	}
	public void showPosition() {
		System.out.printf("[%d, %d]", xPos, yPos);
	}
}

class Rectangle {
	Point upperLeft, lowerRight;
	
	public Rectangle(int x1, int y1, int x2, int y2) {
		upperLeft = new Point(x1, y1);
		lowerRight = new Point(x2, y2);
	}
	public void showPosition() {
		System.out.println("직사각형 위치정보...");
		System.out.print("좌 상단 : ");
		upperLeft.showPosition();
		System.out.println("");
		System.out.print("우 하단 : ");
		lowerRight.showPosition();
		System.out.println("\n");
	}
	public boolean equals(Rectangle rec) {
		if((this.upperLeft.xPos == rec.upperLeft.xPos) && (this.upperLeft.yPos == rec.upperLeft.yPos) && (this.lowerRight.xPos == rec.lowerRight.xPos) && (this.lowerRight.yPos == rec.lowerRight.yPos))
			return true;
		else
			return false;
	}
}

public class UseEquals {
	public static void main(String[] args) {
	Rectangle rec1 = new Rectangle(3,4,7,8);
	Rectangle rec2 = new Rectangle(3,4,7,8);
	Rectangle rec3 = new Rectangle(4,5,8,9);
	
	if(rec1.equals(rec2))
		System.out.println("두 사각형은 같습니다");
	else
		System.out.println("두 사각형은 다릅니다");
	
	if(rec1.equals(rec3))
		System.out.println("두 사각형은 같습니다");
	else
		System.out.println("두 사각형은 다릅니다");
	}		
}
