package geometry;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Point extends Shape{

	private int x;
	private int y;
	
	public Point(int x, int y, boolean b, Color color) {
		this(x, y, b);
		this.setColor(color);
	}

	
	public Point(int x, int y) {
		this.x = x; //pokazuje na konstruktor unutar te klase
		setY(y);

	}

	public Point(int x, int y, boolean selected) {
		/*
		 * this.x = x; setY(y);
		 */
		// this mora biti prva naredba --->
		// potpis metode - tipovi parametara
		// overloading - preklapanje naziva, razlikuju se po tome sta im prosledjujemo
		// kompozicija je kad point korisitmo u klasi line
		// nasledjivanje: object--->point, point dodaje objectu, point nasledjuje
		// osobine i metode (object->circle->point)
		// redefine - equals i toString izvadili
		// override - overloading(metoda postoji negde pa je redefinisemo
		//KONSTRUKTORI - spec metoda koja sluzi za kreiranje objekta, prvo veliko slovo i ima ime isto kao klasa, nema povratni tip
		//equals - metoda
		this(x, y); 
		this.selected = selected;
		

	}
	
	//DRAW METODA 
	
	public void draw(Graphics g) {
		g.drawLine(x - 2, y, x + 2, y);
		g.drawLine(x, y - 2, x, y + 2);
	
		if(isSelected()) {
			g.setColor(Color.BLUE);
			g.drawRect(x-2, y-2, 4, 4);
			g.setColor(Color.black);
		}
	}

	
//instanceof nam treba jer proveravamo da li je to ta klasa
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point pomocna = (Point) obj;
			//to su koordinate nad kojim se poziva ta metoda
			if (this.x == pomocna.x && this.y == pomocna.y) {
				return true;
			}
		}
		return false;
	}
		//5. VEZBE - 12.04.2022.
		
		public boolean contains(int x, int y) {
			return this.distance(x, y) <=2;
		}
	
		public boolean contains(Point clickPoint) {
			return this.distance(clickPoint.x, clickPoint.getY()) <=2;
		}

	public double distance(int xPoint2, int yPoint2) {
		double dx = this.x - xPoint2;
		double dy = this.y - yPoint2;
		double d = Math.sqrt(dx * dx + dy * dy);
		return d;
	}
	
	@Override
	public void moveTo(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void moveBy(int byX, int byY) {
		x += byX;
		this.y += byY;
	}

	
	public Color getColor() {
	// TODO Auto-generated method stub
	return null;
}

	@Override
	public int compareTo(Object obj) {
		if (obj instanceof Point) {
			Point shapeToCompare = (Point) obj;
			return (int) (this.distance(0, 0) - shapeToCompare.distance(0, 0));
		}
		return 0;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}



	public String toString() {
		// ispravno ali ne zelimo tako -->
		// return String.valueOf(x);
		return "(" + x + y + ")";
	}



	

}
