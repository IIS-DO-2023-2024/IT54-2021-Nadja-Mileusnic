package drawing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.MouseAdapter;
import javax.swing.DefaultListModel;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import geometry.Point;
import geometry.Line;
import geometry.Rectangle;
import geometry.Circle;
import geometry.Donut;
import geometry.Shape;


public class PnlDrawing extends JPanel {
private ArrayList<Shape> shapes = new ArrayList<Shape> ();
Shape temp;
Point startPoint;
Point upperLeftPoint;
private Color innerColorCircle;
private Color innerColorRectangle;
private Color borderColorRectangle;
private Color borderColorCircle;
private Color innerColorDonut;
private Color borderColorDonut;
private Color pointColor;
private Color lineColor;
private DrawingApp DrawingApp;

	
	
public PnlDrawing(DrawingApp DrawingApp) 
{
	this.DrawingApp = DrawingApp;
	GridBagLayout gridBagLayout = new GridBagLayout();
	gridBagLayout.columnWidths = new int[]{0};
	gridBagLayout.rowHeights = new int[]{0};
	gridBagLayout.columnWeights = new double[]{Double.MIN_VALUE};
	gridBagLayout.rowWeights = new double[]{Double.MIN_VALUE};
	setLayout(gridBagLayout);

	addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent me) {
			onMouseClicked(me);
		}
	});
}

			private void onMouseClicked(MouseEvent me) {
				if (DrawingApp.getState() ==1) {
					pointDraw(me);
				}
				else if (DrawingApp.getState()==2) {
					lineDraw(me);
				}
				else if (DrawingApp.getState()==3) {
					rectangleDraw(me);
				}
				else if (DrawingApp.getState()==4) {
					circleDraw(me);
				}
				else if(DrawingApp.getState()==5) {
					donutDraw(me);
				}
				else if(DrawingApp.getState()==6) {
					selectShape(me);
				}
				else {
					JOptionPane.showMessageDialog(null, "You didn't select an object!");
				}
				repaint();
			}
	
			
			

			public void donutDraw(MouseEvent me) {
				Point center = new Point(me.getX(), me.getY());
				DlgDonut dlgDonut = new DlgDonut();
				dlgDonut.getTxtX().setText(Integer.toString(center.getX()));
				dlgDonut.getTxtY().setText(Integer.toString(center.getY()));
				dlgDonut.setVisible(true);
				
				if (dlgDonut.isConfirmation()) 
				{
					
					if (dlgDonut.isInnerColorConfirmation()) 
					{
						innerColorDonut = dlgDonut.getInnerFill();
					}
					else 
					{
						innerColorDonut = Color.WHITE;
					}
					if (dlgDonut.isBorderColorConfirmation()) 
					{
						borderColorDonut = dlgDonut.getBorderFill();
					}
					else 
					{
						borderColorDonut = Color.BLACK;
					}
					try {
						int x = Integer.parseInt(dlgDonut.getTxtX().getText());
						int y = Integer.parseInt(dlgDonut.getTxtY().getText());
						int innerRadius = Integer.parseInt(dlgDonut.getTxtInnerRadius().getText());
						int radius = Integer.parseInt(dlgDonut.getTxtRadius().getText());
						if (innerRadius < radius) 
						{
							temp = new Donut(new Point(x,y), radius, innerRadius, false, borderColorDonut, innerColorDonut);
							shapes.add(temp);
							DrawingApp.getDlm().addElement((Shape) temp);
						} 
						else 
						{
							JOptionPane.showMessageDialog(null, "Radius has to be bigger than inner radius!");
						}
					} catch(Exception e) {
						JOptionPane.showMessageDialog(null, "Invalid data type.");

					}
				}
			}

			public void circleDraw(MouseEvent me) {

				Point center = new Point(me.getX(), me.getY());
				DlgCircle dlgCircle = new DlgCircle();
				dlgCircle.getTxtX().setText(Integer.toString(center.getX()));
				dlgCircle.getTxtY().setText(Integer.toString(center.getY()));
				dlgCircle.setVisible(true);

				if (dlgCircle.isConfirmation()) 
				{
					

					if (dlgCircle.isInnerColorConfirmation()) 
					{
						innerColorCircle = dlgCircle.getInnerFill();
					}
					else 
					{
						innerColorCircle = Color.WHITE;
					}
					if (dlgCircle.isBorderColorConfirmation()) {
						
						borderColorCircle = dlgCircle.getBorderFill();
					} 
					else 
					{
						borderColorCircle = Color.BLACK;
					}
					try {
						int x = Integer.parseInt(dlgCircle.getTxtX().getText());
						int y = Integer.parseInt(dlgCircle.getTxtY().getText());
						int r = Integer.parseInt(dlgCircle.getTxtRadius().getText());
						if (x > 0 && y > 0 && r > 0) 
						{		
							temp = new Circle(new Point(x,y), r, false, borderColorCircle, innerColorCircle);
							shapes.add(temp);
							
							DrawingApp.getDlm().addElement((Shape) temp);
						} 
						else 
						{
							JOptionPane.showMessageDialog(null, "Numbers must be greater than zero!");
						}
					}
					catch(Exception e) {
						JOptionPane.showMessageDialog(null, "Invalid data type.");
					}			
				}				
			}

			public void rectangleDraw(MouseEvent me) {
				upperLeftPoint = new Point(me.getX(), me.getY());
				DlgRectangle dlgRectangle = new DlgRectangle();
				dlgRectangle.getTxtX().setText(Integer.toString(upperLeftPoint.getX()));
				dlgRectangle.getTxtY().setText(Integer.toString(upperLeftPoint.getY()));
				dlgRectangle.setVisible(true);
				
				if (dlgRectangle.isConfirmation()) 
				{
															
					if (dlgRectangle.isInnerColorConfirmation()) 
					{
						innerColorRectangle = dlgRectangle.getInnerFill();
					}
					else 
					{
						innerColorRectangle = Color.WHITE;
					}
					if (dlgRectangle.isBorderColorConfirmation()) {
						
						borderColorRectangle = dlgRectangle.getBorderFill();
					} 
					else 
					{
						borderColorRectangle = Color.BLACK;
					}
					try {
						int x = Integer.parseInt(dlgRectangle.getTxtX().getText());
						int y = Integer.parseInt(dlgRectangle.getTxtY().getText());
						int width = Integer.parseInt(dlgRectangle.getTxtWidth().getText().toString());
						int height = Integer.parseInt(dlgRectangle.getTxtHeight().getText().toString());
						if (x > 0 && y > 0 && width > 0 && height > 0) 
						{
							temp = new Rectangle(new Point(x,y), width, height, false, borderColorRectangle, innerColorRectangle);
							shapes.add(temp);
							DrawingApp.getDlm().addElement((Shape) temp);
						} 
						else 
						{
							JOptionPane.showMessageDialog(null, "Values can't be equal to zero or less. Try again!");
						}
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Invalid data. Try again!");
					}
					
				}
			}

			public void lineDraw(MouseEvent me) {
				if (startPoint == null) 
				{
					startPoint = new Point(me.getX(), me.getY());
				} 
				else
				{
					temp = new Line(startPoint, new Point(me.getX(), me.getY()),false, Color.BLACK);
					shapes.add(temp);
					startPoint = null;
					DrawingApp.getDlm().addElement((Shape) temp);
				}
				
			}

			public void pointDraw(MouseEvent me) {
				temp = new Point(me.getX(), me.getY(), false, Color.BLACK);
				shapes.add(temp);
				DrawingApp.getDlm().addElement((Shape) temp);
				
			}
		
		
	
//selekcija
	public void selectShape(MouseEvent me) {
		Shape selected = null;
		Iterator<Shape> it = shapes.iterator();
		while (it.hasNext()) {
			Shape shape = it.next();
			shape.setSelected(false);
			if (shape.contains(me.getX(), me.getY())) {
				selected = shape;
			}
		}
	if (selected != null) {
		selected.setSelected(true);
	}
	repaint();
	}
	
	//modifikovanje
	public void modifyShape() {
		for (int i=0; i < shapes.size(); i++) {
			if (shapes.get(i).isSelected()) {
				if(shapes.get(i) instanceof Point) {
					DlgPoint dlgPoint = new DlgPoint();
					Point point = (Point) shapes.get(i);
					dlgPoint.getTxtX().setText(Integer.toString(point.getX()));
					dlgPoint.getTxtY().setText(Integer.toString(point.getY()));
					dlgPoint.fill = pointColor;
					dlgPoint.setVisible(true);
					
					if (dlgPoint.isConfirmation()) {
						int x = Integer.parseInt(dlgPoint.getTxtX().getText());
						int y = Integer.parseInt(dlgPoint.getTxtY().getText());
						if (dlgPoint.isColorConfirmation()){
							pointColor = dlgPoint.getFill();
						}
						else
						{
							pointColor = dlgPoint.fill;
						}
						temp = new Point(x, y, false, pointColor);
						shapes.add(temp);
						shapes.remove(shapes.get(i));
						DrawingApp.getDlm().remove(i);
						DrawingApp.getDlm().addElement((Shape) temp);
						repaint();
					}
				}
					else if (shapes.get(i) instanceof Line) {
						if (shapes.get(i).isSelected()) {
							DlgLine dlgLine = new DlgLine();
							Line line = (Line) shapes.get(i);
							dlgLine.getTxtStartPointX().setText(Integer.toString(line.getStartPoint().getX()));
							dlgLine.getTxtStartPointY().setText(Integer.toString(line.getStartPoint().getY()));
							dlgLine.getTxtEndPointX().setText(Integer.toString(line.getEndPoint().getX()));
							dlgLine.getTxtEndPointY().setText(Integer.toString(line.getEndPoint().getY()));
							dlgLine.fill = lineColor;
							dlgLine.setVisible(true);
							
							if (dlgLine.isConfirmation()) {
								int startX = Integer.parseInt(dlgLine.getTxtStartPointX().getText());
								int startY = Integer.parseInt(dlgLine.getTxtStartPointY().getText());
								int endX = Integer.parseInt(dlgLine.getTxtEndPointX().getText());
								int endY = Integer.parseInt(dlgLine.getTxtEndPointY().getText());
								
								if (dlgLine.isColorConfirmation()) {
									lineColor = dlgLine.getFill();
								}
								else {
									lineColor = dlgLine.fill;
								}
								temp = new Line(new Point(startX, startY), new Point(endX,endY), false, lineColor);
								shapes.add(temp);
								shapes.remove(shapes.get(i));
								DrawingApp.getDlm().remove(i);
								DrawingApp.getDlm().addElement((Shape) temp);
								repaint();
							}
						}
					}
				
					else if (shapes.get(i)instanceof Rectangle) {
						if (shapes.get(i).isSelected()) {
							Rectangle r = (Rectangle) shapes.get(i);
							DlgRectangle dlgRectangle = new DlgRectangle();
							dlgRectangle.getTxtX().setText(Integer.toString(r.getUpperLeftPoint().getX()));
							dlgRectangle.getTxtY().setText(Integer.toString(r.getUpperLeftPoint().getY()));
							dlgRectangle.getTxtHeight().setText(Integer.toString(r.getHeight()));
							dlgRectangle.getTxtWidth().setText(Integer.toString(r.getWidth()));
							dlgRectangle.innerFill = innerColorRectangle;
							dlgRectangle.borderFill = borderColorRectangle;
							dlgRectangle.setVisible(true);
							
							if (dlgRectangle.isConfirmation()) {
								int x = Integer.parseInt(dlgRectangle.getTxtX().getText());
								int y = Integer.parseInt(dlgRectangle.getTxtY().getText());
								int width = Integer.parseInt(dlgRectangle.getTxtWidth().getText());
								int height = Integer.parseInt(dlgRectangle.getTxtHeight().getText());
								if (dlgRectangle.isInnerColorConfirmation()) {
									innerColorRectangle = dlgRectangle.getInnerFill();
								} 
								else {
									innerColorRectangle = dlgRectangle.innerFill;
								}
								if (dlgRectangle.isBorderColorConfirmation()) {
									borderColorRectangle = dlgRectangle.getBorderFill();
								}
								else {
									borderColorRectangle = dlgRectangle.borderFill;
								}
								if (width > 0 && height > 0) 
								{
									temp = new Rectangle(new Point(x,y), width, height, false, borderColorRectangle, innerColorRectangle);
									shapes.add(temp);
									shapes.remove(shapes.get(i));
									DrawingApp.getDlm().removeElementAt(i);
									DrawingApp.getDlm().addElement((Shape) temp);
								} 
								else {
									JOptionPane.showMessageDialog(null, "The width and height must be greather than zero!");
								}
								repaint();
							}
						}
					}
					else if (shapes.get(i)instanceof Donut) {
						if (shapes.get(i).isSelected()) {
							Donut donut = (Donut) shapes.get(i);
							DlgDonut dlgDonut = new DlgDonut();
							dlgDonut.getTxtX().setText(Integer.toString(donut.getCenter().getX()));
							dlgDonut.getTxtY().setText(Integer.toString(donut.getCenter().getY()));
							dlgDonut.getTxtInnerRadius().setText(Integer.toString(donut.getInnerRadius()));
							dlgDonut.getTxtRadius().setText(Integer.toString(donut.getRadius()));
							dlgDonut.innerFill = innerColorDonut;
							dlgDonut.borderFill = borderColorDonut;
							dlgDonut.setVisible(true);

							if (dlgDonut.isConfirmation()) {
								int x = Integer.parseInt(dlgDonut.getTxtX().getText());
								int y = Integer.parseInt(dlgDonut.getTxtY().getText());
								int r = Integer.parseInt(dlgDonut.getTxtRadius().getText());
								int innerRadius = Integer.parseInt(dlgDonut.getTxtInnerRadius().getText());
								
								if (dlgDonut.isInnerColorConfirmation()) {
									
									innerColorDonut = dlgDonut.getInnerFill();
								} 
								else 
								{
									innerColorDonut = dlgDonut.innerFill;
								}
								if (dlgDonut.isBorderColorConfirmation()) 
								{
									borderColorDonut = dlgDonut.getBorderFill();
								} 
								else 
								{
									borderColorDonut = dlgDonut.borderFill;
								}
								if (innerRadius < r) 
								{
									temp = new Donut(new Point(x,y), r, innerRadius, false, borderColorDonut, innerColorDonut);
									shapes.add(temp);
									shapes.remove(shapes.get(i));
									DrawingApp.getDlm().remove(i);
									DrawingApp.getDlm().addElement((Shape) temp);
								} 
								else 
								{
									JOptionPane.showMessageDialog(null, "Radius has to be bigger than inner radius. Try again!");
								}
							}
					else if(shapes.get(i) instanceof Circle) {
						if (shapes.get(i).isSelected()) {
							Circle c = (Circle) shapes.get(i);
							DlgCircle dlgCircle = new DlgCircle();
							dlgCircle.getTxtX().setText(Integer.toString(c.getCenter().getX()));
							dlgCircle.getTxtY().setText(Integer.toString(c.getCenter().getY()));
							dlgCircle.getTxtRadius().setText(Integer.toString(c.getRadius()));
							dlgCircle.innerFill = innerColorCircle;
							dlgCircle.borderFill = borderColorCircle;
							dlgCircle.setVisible(true);
							
							if (dlgCircle.isConfirmation()) {				
								int x = Integer.parseInt(dlgCircle.getTxtX().getText());
								int y = Integer.parseInt(dlgCircle.getTxtY().getText());
								int r = Integer.parseInt(dlgCircle.getTxtRadius().getText());
								if (dlgCircle.isInnerColorConfirmation()) {
									innerColorCircle = dlgCircle.getInnerFill();
								} 
								else {
									innerColorCircle = dlgCircle.innerFill;
								}
								if (dlgCircle.isBorderColorConfirmation()) {
									borderColorCircle = dlgCircle.getBorderFill();
								} 
								else { 
									borderColorCircle = dlgCircle.borderFill;
								}
								if (r > 0) {
									temp = new Circle(new Point(x,y), r, false, borderColorCircle, innerColorCircle);
									shapes.add(temp);
									shapes.remove(shapes.get(i));
									DrawingApp.getDlm().remove(i);
									DrawingApp.getDlm().addElement((Shape) temp);
								} 
								else 
								{
									JOptionPane.showMessageDialog(null, "Your radius cannot be zero or less. Try again!");
								}
								repaint();
							}
						}
					}
					
					repaint();
				
				}
			}
			
					}
				}
			}
		
			 //end of modification
	
	//deleting
	

	public void delete() {
		// TODO Auto-generated method stub
		for (int i = 0; i < shapes.size(); i++) {
			if (shapes.get(i).isSelected()) {
			DlgDelete dlgDelete = new DlgDelete();
			dlgDelete.setVisible(true);
			if (dlgDelete.isConfirmation()) {
				shapes.remove(shapes.get(i));
				DrawingApp.getDlm().removeElementAt(i);
				repaint();
			                                }
			}
		}
	}
public void paint (Graphics g) {
	super.paint(g);
	Iterator<Shape> it = shapes.iterator();
	while (it.hasNext()) {
		temp = it.next();
		temp.draw(g);
	}
}
}
