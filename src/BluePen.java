
public class BluePen implements Pen{
	private String color;
	
	@Override
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public void write() {
		System.out.println("Cool, i'm going to write a book!");
		
	}
	
	@Override
	public void earse() {
		System.out.println("Oh f***, i committed a error, i need to earse.");
		
	}

	@Override
	public void printColor() {
		System.out.println("Pen color: " + color);
		
	}
	
	

}
