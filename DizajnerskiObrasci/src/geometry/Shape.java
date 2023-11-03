package geometry;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public abstract class Shape implements Moveable, Comparable<Object>{
	protected boolean selected;
	private Color color;

	public Shape() {

	}
 public Shape(Color color) {
	 this.color = color;
 }

 public Shape(Color color, boolean selected) {
	 this(color);
	 this.selected = selected;
 }
	
	public abstract boolean contains(int x, int y);
	public abstract void draw(Graphics g);
	
	
	 public boolean isSelected() {
	  return selected;
  }
	 
	 public void setSelected(boolean selected) {
			this.selected = selected;
		}
		
	 public Color getColor() {
			return color;
		}
		
		public void setColor(Color color) {
			this.color = color;
		}
	
}
