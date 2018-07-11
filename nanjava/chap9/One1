public class One1 {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		rec.setRec(22, 22, 10, 10);
		rec.showArea();
		rec.setRec(10, 10, 22, 22);
		rec.showArea();
	}
}

class Rectangle {
	private int ulx, uly;
	private int lrx, lry;
	
	public void setRec(int lx, int ly, int rx, int ry) {
		if(lx>-1 && ly>-1 && rx>-1 && ry>-1 && lx<101 && ly<101 && rx<101 && ry<101 && rx>lx && ry>ly) {
			ulx=lx;
			uly=ly;
			lrx=rx;
			lry=ry;
		}
		else
			System.out.println("Error");
	}
	
	public void showArea() {
		int xLen=lrx-ulx;
		int yLen=lry-uly;
		System.out.println("넓이 : " + (xLen*yLen));
	}
}
