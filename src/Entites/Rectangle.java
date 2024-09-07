package Entites;

public class Rectangle {
	public double width;
	public double height;
	
	
	public double area() {
		return width*height;
	}
	
	public double perimeter() {
		return  2*(width+height) ;
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
	}
	
	public String toString() {
		return "A área do retangulo é: " + String.format("%.2f", area()) + ", o perimetro do retangulo é: " + String.format("%.2f", perimeter()) + ", e sua diagonal é: " + String.format("%.2f", diagonal());
	}
}
