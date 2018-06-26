class Triangle {
	double height, down;
	
	public Triangle(double h, double d) {
		height = h;
		down = d;
	}
	
	public void change(double h, double d) {
		height = h;
		down = d;
	}
	
	public double area() {
		return height*down/2;
	}
}

class One1 {
	public static void main(String[] args) {
		Triangle tr = new Triangle(10, 5);
		System.out.println(tr.area());
	}
}
