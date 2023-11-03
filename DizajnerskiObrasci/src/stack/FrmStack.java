package stack;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.DefaultListModel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;

import geometry.Circle;
import geometry.Point;

import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.AbstractListModel;

@SuppressWarnings({ "unused", "serial" })
public class FrmStack extends JFrame {

	 private ArrayList<Circle> list = new ArrayList<Circle>();
	private DefaultListModel<Circle> dlmCircle = new DefaultListModel<Circle>();
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmStack frame = new FrmStack();
					frame.setVisible(true);
				    } 
				catch (Exception e) {
					e.printStackTrace();
			                       	}
			}
		});
		
	}
	

	/**
	 * Create the frame.
	 */
	public FrmStack() {
		setFont(new Font("Constantia", Font.BOLD, 15));
		setTitle("IT 54-2021 Mileusnic Nadja");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 657, 474);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(95, 158, 160));
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		JPanel pnlNorth = new JPanel();
		pnlNorth.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		pnlNorth.setForeground(new Color(0, 0, 0));
		pnlNorth.setBackground(new Color(178, 34, 34));
		contentPane.add(pnlNorth, BorderLayout.NORTH);
		
		JLabel lblStack = new JLabel("Stack");
		lblStack.setFont(new Font("Constantia", Font.BOLD, 18));
		pnlNorth.add(lblStack);
	
	
		
		//3 pasusa za centar
		
		JPanel pnlCenter = new JPanel();
		pnlCenter.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlCenter.setForeground(new Color(240, 255, 240));
		pnlCenter.setBackground(new Color(240, 128, 128));
		contentPane.add(pnlCenter, BorderLayout.CENTER);
		
		JScrollPane scrlCircle = new JScrollPane();
		scrlCircle.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrlCircle.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		pnlCenter.add(scrlCircle);
		
		JList<Circle> lstCircle = new JList<Circle>();
		lstCircle.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 102)));
	    scrlCircle.setColumnHeaderView(lstCircle);
		lstCircle.setForeground(new Color(0, 0, 51));
		lstCircle.setBackground(new Color(255, 250, 240));
		scrlCircle.setViewportView(lstCircle);
		lstCircle.setFont(new Font("Constantia", Font.BOLD, 15));
	
		lstCircle.setModel(dlmCircle);
		
		JPanel pnlSouth = new JPanel();
		pnlSouth.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		pnlSouth.setForeground(new Color(255, 235, 205));
		pnlSouth.setBackground(new Color(255, 250, 240));
		contentPane.add(pnlSouth, BorderLayout.SOUTH);
		
		
				
				//dugme dodaj
				
				JButton btnAdd = new JButton("Add");
				btnAdd.setForeground(new Color(0, 51, 0));
				btnAdd.setBackground(new Color(255, 250, 240));
				btnAdd.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 13));
				btnAdd.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						DlgAdd dlgAdd = new DlgAdd();
						dlgAdd.setVisible(true);
						
						if(dlgAdd.isConfirmation()) {
							try {
								int x = Integer.parseInt(dlgAdd.getTxtX().getText());
								int y = Integer.parseInt(dlgAdd.getTxtY().getText());
								int center = Integer.parseInt(dlgAdd.getTxtCenter().getText());
								int radius = Integer.parseInt(dlgAdd.getTxtRadius().getText());
								Circle c=new Circle(new Point(x,y),radius);
								
								dlmCircle.add(0,c);
							}
							catch (NumberFormatException nfe) {
								JOptionPane.showMessageDialog(null, "You cannot leave an empty field or put in a character!","WARNING!!!", JOptionPane.ERROR_MESSAGE );
							}
							
							
						
					}
					}
				});
				
				
				pnlSouth.add(btnAdd);
				
				//dugme za brisanje
				JButton btnDelete = new JButton("Delete");
				btnDelete.setBackground(new Color(255, 99, 71));
				btnDelete.setForeground(new Color(0, 51, 0));
				btnDelete.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 13));
				btnAdd.setForeground(new Color(0, 51, 0));
				btnAdd.setBackground(new Color(255, 250, 240));
				btnAdd.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 12));
				btnDelete.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0)
					{
						
						if (dlmCircle.isEmpty())
						{
							JOptionPane.showMessageDialog(null, "Your list is empty!");
						}
						else
						{
							DlgAdd dlgAdd = new DlgAdd();
							int x = dlmCircle.getElementAt(0).getX();
							int y = dlmCircle.getElementAt(0).getY();
							int radius = dlmCircle.getElementAt(0).getRadius();
							int center = dlmCircle.getElementAt(0).getCircle();
						
							
							
							dlgAdd.setVisible(true);
							
							if (dlgAdd.isConfirmation())
							{
								dlmCircle.removeElementAt(0);
							}
						}
					}
				});
				pnlSouth.add(btnDelete);
				
	}
}
		

		

	
	



	
				
			
			
		
		
		
		
		
		
		
		
	

	



