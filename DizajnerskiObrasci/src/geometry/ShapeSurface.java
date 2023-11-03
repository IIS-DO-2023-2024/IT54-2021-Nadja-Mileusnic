package geometry;

import java.awt.Color;
import java.awt.Graphics;

public abstract class ShapeSurface extends Shape {
	public Color fillColor;
	
	private Color innerColor;
    public abstract void fill(Graphics g);
	
	
	public Color getInnerColor() {
		return innerColor;
	}

	public void setInnerColor(Color innerColor) {
		this.innerColor = innerColor;
	}

	public Color getFillColor() {
		return fillColor;
	}

	public void setFillColor(Color fillColor) {
		this.fillColor = fillColor;
	}

	
	

	
}
