
public class ColorRectangle extends Rectangle {
	String color;
	
	public ColorRectangle(int width, int height, String color) {
		super.width = width;
		super.height = height;
		this.color = color;
	}
	
	int getWidth() {	return width;	}
	void setWidth(int width) {	this.width = width;	}
	int getHeight() {	return height;	}
	void setHeight(int height) {	this.height = height;	}
	String getColor() {	return color;	}
	void setColor(String color) {	this.color = color;	}
}