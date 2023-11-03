package geometry;

public class Test {
}

/*
	public static void main(String[] args) {

		int i = 0;
		System.out.println(i);
		//Point point1 = new Point();
		// System.out.println(point1.x+" "+point1.y+" "+point1.selected);

		System.out.println(point1.getX());
		point1.setX(15);
	//	System.out.println(point1.getX());

	//	point1.setY(25);
	//	System.out.println(point1.getY());
	//	point1.setSelected(true);
	//	System.out.println(point1.isSelected());
	//	System.out.println(point1.distance(30, 35));

		// deo sa 3. vezbi

		//Point startPoint = new Point();
	//	System.out.println(startPoint.getX());
	//	System.out.println(startPoint.getY());

	//	System.out.println(startPoint.isSelected());

	//	startPoint.setX(10);
	//	startPoint.setY(20);
	//	System.out.println(startPoint.getX());
	//	System.out.println(startPoint.getY());

		//Point endPoint = new Point();
		//endPoint.setX(15);
		//endPoint.setY(25);
//
	//	Line line1 = new Line();

		//System.out.println(line1.isSelected());
		//System.out.println(line1.getStartPoint());
		// System.out.println(line1.getStartPoint().getX());
	//	line1.setStartPoint(startPoint);
		//line1.setEndPoint(endPoint);
		//System.out.println(line1.getStartPoint().getX());
		//System.out.println(line1.length());

		// line1.length();

		/*
		 * //ZADACI ZA VEZBU
		 * 
		 * 
		 * // p je startPoint a p1 je endPoint
		 * 
		 * // 1. Inicijalizovati x koordinatu tacke p // na vrednost y koordinate tacke
		 * p1
		 * 
		 * startPoint.setX(endPoint.getY());
		 * 
		 * // 2. Postaviti y koordinatu krajnje tacke l1 na 23
		 * 
		 * line1.getEndPoint().setY(23);
		 * 
		 * // 3. Inicijalizovati x koordinatu pocetne tacke linije l1 // na vrednost y
		 * koordinate krajnje tacke linije l1
		 * 
		 * line1.getStartPoint().setX(line1.getEndPoint().getY());
		 * 
		 * // 4. Postaviti x koordinatu krajnje tacke l1 na vrednost // duzine linije l1
		 * umanjene za vrednost zbira x i y // koordinate pocetne tacke linije l1
		 * 
		 * line1.getEndPoint().setX((int) line1.length() - (line1.getStartPoint().getX()
		 * + line1.getStartPoint().getY()));
		 * 
		 * // 5. Postaviti x koordinatu tacke gore levo pravougaonika // r1 na vrednost
		 * 10 i y koordinatu na vrednost 15
		 * 
		 * Rectangle r1 = new Rectangle(); r1.setUpperLeftPoint(startPoint);
		 * r1.getUpperLeftPoint().setX(10); r1.getUpperLeftPoint().setY(15);
		 * 
		 * // 6. Postaviti centar kruga c1 na koordinate tacke // gore levo od r1
		 * 
		 * Circle c1 = new Circle(); c1.setCenter(r1.getUpperLeftPoint());
		 * 
		 * // 7. Postaviti x koordinatu centra kruga c1 na vrednost razlike // povrsine
		 * pravougaonika r1 i y koordinate pocetne tacke linije l1
		 * 
		 * c1.getCenter().setX(r1.area() - line1.getStartPoint().getY());
		 * 
		 * 
		 * ZADACI ZA VEZBU
		 */

		// Vezbe 4
		/*
		 * 1.Postaviti koordinatu x centra ranije kreiranog kruga k na vrednost zbira
		 * vrednosti poluprecnika kruga k i vrednosti koja predstavlja udaljenost
		 * pocetne i krajnje tacke prethodno kreirane linije lin (NE duzine). Sve
		 * objekte kreirati samostalno.
		 */

		//Circle c = new Circle(point1, 0);
		//Line lin = new Line();
		//Point p1 = new Point();
		//Point p2 = new Point();

		//c.setCenter(p1);
		//lin.setStartPoint(p1);
		//lin.setEndPoint(p2);

		//c.getCenter().setX(
		//		c.getRadius() + (int) lin.getStartPoint().distance(lin.getEndPoint().getX(), lin.getEndPoint().getY()));

		// inicijalne vrednosti
		/*Point p3 = new Point(10, 15);
		// prilikom promene
		p3.setX(5);

		System.out.println(p3);
		System.out.println(p3.toString());
		//System.out.println(lin.toString());

		Point p4 = new Point(20, 25);
		Point p5 = new Point(20, 25);

		// jednakost po referenci - vraca false
		System.out.println(p4 == p5);
		// poredi po vrednosti tek kad se redefinise
		System.out.println(p4.equals(p5));

		// dodela vrednosti i reference
		p4 = p5;

		// jednakost po referenci - vraca true
		System.out.println(p4 == p5);
		// poredi po vrednosti tek kad se redefinise
		System.out.println(p4.equals(p5));

	}
	zadatak na github-u
	vezbe 5
	  Point clickPoint = new Point(20,25);
	  System.out.prinln(p5.contains(clickPoint.getX(), clickPoint.getY()));
	  System.out.println(k.contains(clickPoint));
	  
	  DONUT
	  Donut donut1 = new Donut (clickPoint, 10, 20, true);
	 Donut donut2 = new Donut
	  System.out.println(donut1.equals(donut2));
	  
	*/

