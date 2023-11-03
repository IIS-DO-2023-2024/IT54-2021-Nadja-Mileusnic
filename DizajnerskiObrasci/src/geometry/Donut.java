package geometry;



import java.awt.Color;
import java.awt.Graphics;

public class Donut extends Circle {

	private int innerRadius;


	

	public Donut(Point center, int radius, int innerRadius, boolean selected, Color borderColorDonut, Color innerColorDonut) {
		/*this.innerRadius = innerRadius;
		this.center = center; //protected je i moze ovako
		setRadius(radius); //ovo smo ostavili prajvet
		setSelected(selected);*/
		
		//drugi nacin, bitna je PRVA NAREDNA
		super(center, radius, selected);
		this.setColor(borderColorDonut);
		this.setInnerColor(innerColorDonut);
		this.innerRadius = innerRadius;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Donut) {
			Donut pomocni = (Donut) obj;
			if (super.equals(obj) && innerRadius == pomocni.innerRadius) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public boolean contains(Point clickPoint) {
		return super.contains(clickPoint) && 
				getCenter().distance(clickPoint.getX(), 
						clickPoint.getY()) >= innerRadius;
	}
	
	public boolean contains(int x, int y) {
		return super.contains(x, y) && 
				getCenter().distance(x, y) >= innerRadius;
	}
	
	public double area() {
		return super.area() - innerRadius * innerRadius * Math.PI;
	}
	
	public void fill(Graphics g) {
		g.setColor(getInnerColor());
		super.fill(g);
		g.setColor(Color.white);
		g.fillOval(this.getCenter().getX() - this.innerRadius + 1, this.getCenter().getY() - this.innerRadius + 1, this.innerRadius * 2 - 2,  this.innerRadius * 2 - 2);
	}


	public void draw(Graphics g) {
		
		super.draw(g);
		this.fill(g);
		g.setColor(getColor());
		g.drawOval(this.center.getX()-innerRadius + 1, this.center.getY()-innerRadius + 1, innerRadius * 2 - 2, innerRadius * 2 -2);
		
	
		if (isSelected()) {
			g.setColor(Color.BLUE);
			g.drawRect(getCenter().getX() - 2, getCenter().getY() - 2, 4, 4);
			g.drawRect(getCenter().getX() - innerRadius - 2, getCenter().getY() - 2, 4, 4);
			g.drawRect(getCenter().getX() + innerRadius - 2, getCenter().getY() - 2, 4, 4);
			g.drawRect(getCenter().getX() - 2, getCenter().getY() - innerRadius - 2, 4, 4);
			g.drawRect(getCenter().getX() - 2, getCenter().getY() + innerRadius - 2, 4, 4);
			g.setColor(Color.black);
		}
	}
		
	
	@Override
	public int compareTo(Object obj) {
		if (obj instanceof Donut) {
			Donut shapeToCompare = (Donut) obj;
			return (int)(this.area() - shapeToCompare.area());
		}
		return 0;
	}

	public int getInnerRadius() {
		return innerRadius;
	}

	public void setInnerRadius(int innerRadius) {
		this.innerRadius = innerRadius;
	}
	
	public String toString() {
		// Center=(x,y), radius= radius, innerRadius=innerRadius
		return  super.toString()+", innerRadius=" + innerRadius;
	}
	
}
	
	