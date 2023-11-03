package sort;

import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.awt.event.ActionListener;

import javax.swing.border.MatteBorder;
import geometry.Circle;
import geometry.Point;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;

public class FrmSort extends JFrame {
     private ArrayList<Circle> list = new ArrayList<Circle>();
     private DefaultListModel<Circle> dlm = new DefaultListModel<Circle>();
	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmSort frame = new FrmSort();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmSort() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(105, 105, 105));
		panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(245, 222, 179)));
		panel.setBackground(new Color(178, 34, 34));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblSort = new JLabel("Sort");
		lblSort.setFont(new Font("Constantia", Font.BOLD, 18));
		lblSort.setBackground(new Color(240, 248, 255));
		lblSort.setForeground(new Color(255, 250, 240));
		panel.add(lblSort);
		
		JPanel pnlCenter = new JPanel();
		pnlCenter.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlCenter.setForeground(new Color(0, 0, 51));
		pnlCenter.setBackground(new Color(255, 250, 240));
		contentPane.add(pnlCenter, BorderLayout.CENTER);
		
		JScrollPane scrlCircle = new JScrollPane();
		scrlCircle.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrlCircle.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		pnlCenter.add(scrlCircle);
		
		JList listCircle = new JList();
		listCircle.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 102)));
	    scrlCircle.setColumnHeaderView(listCircle);
		listCircle.setForeground(new Color(0, 0, 51));
		listCircle.setBackground(new Color(255, 250, 250));
		scrlCircle.setViewportView(listCircle);
		listCircle.setFont(new Font("Constantia", Font.BOLD, 15));
	
		listCircle.setModel((ListModel<Circle>) dlm);
		
		JPanel pnlSouth = new JPanel();
		pnlSouth.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(178, 34, 34)));
		pnlSouth.setForeground(new Color(255, 250, 240));
		pnlSouth.setBackground(new Color(240, 128, 128));
		contentPane.add(pnlSouth, BorderLayout.SOUTH);
		
			//dugmad - dodavanje i sortiranje
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setForeground(new Color(0, 51, 0));
		btnAdd.setBackground(new Color(255, 250, 240));
		btnAdd.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 14));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				DlgAdd dlgAdd = new DlgAdd();
				dlgAdd.setVisible(true);
				if (dlgAdd.isConfirmation())
				{
					try
					{
						int x = Integer.parseInt(dlgAdd.getTxtX().getText());
						int y = Integer.parseInt(dlgAdd.getTxtY().getText());
						int center = Integer.parseInt(dlgAdd.getTxtCenter().getText());
						int radius = Integer.parseInt(dlgAdd.getTxtRadius().getText());
						
						Circle c = new Circle(new Point(x,y), center);
						dlm.add(0,c);
					}
					catch (NumberFormatException nfe)
					{
						JOptionPane.showMessageDialog(null, "You cannot leave an empty field or put in a character!",
								"WARNING!!!", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		pnlSouth.add(btnAdd);
		
		//drugo dugme
		
		JButton btnSort = new JButton("Sort");
		btnSort.setBackground(new Color(255, 250, 240));
		btnSort.setForeground(new Color(0, 51, 0));
		btnSort.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 12));
		btnSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Circle c;
				
				if (dlm.isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Your list is empty!");
				}
				else
				{
					for (int i = 0; i < dlm.getSize(); i++)
					{
						list.add(dlm.getElementAt(i));
					}
					
					list.sort(null);
					dlm.removeAllElements();
					
					for (int i = 0; i < list.size(); i++)
					{
						dlm.addElement(list.get(i));
					}
				}
				list.clear();
			}

		
		});
		pnlSouth.add(btnSort);
	}
		
		
		
	public DefaultListModel<Circle> getDlm() {
		return dlm;
	}

	public void setDlm(DefaultListModel<Circle> dlm) {
		this.dlm = dlm;
	}

	public ArrayList<Circle> getList() {
		return list;
	}

	public void setList(ArrayList<Circle> list) {
		this.list = list;
	}


		
		
	
		
	
		
		
		
	}


