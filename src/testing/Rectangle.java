package testing;

public abstract class Rectangle {
	void draw() {
		System.out.println("Draw rectangle.");
	}
	
	int getArea(int l, int w) {
		return l * w;
	}
	
	abstract void delete();
}
