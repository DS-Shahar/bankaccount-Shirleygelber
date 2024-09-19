package Rectangle;

public class Rectangle {
	private int length;
	private int width;

	public Rectangle (int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public int getLength(int length){
		return length;
	}
	
	public int getWidth(int width){
		return width;
	}
	
	public int calcArea(int length, int width) {
		return (this.length * this.width);
		
	}
	
	public int calcPerimeter(int length, int width) {
		return (this.length * 2 + this.width * 2);
	}
	
	public String scale(int factor) {
		return ("the new Length is " + (this.length * factor) + " the new Width is " + (this.width * factor));
	}
	
	public String toString(){ 
	    return "length: "+this.length+" width: "+this.width;
	}
	
	public void draw() {
		for (int i = 0; i < this.length; i++){
			for (int j = 0; j < this.width; j++) {
				System.out.print ("*");
			}
			System.out.println();
		}
	}
