package drawing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;



import java.awt.Font;
import net.miginfocom.swing.MigLayout;
import geometry.Shape;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.border.MatteBorder;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;

public class DrawingApp extends JFrame {

	private JPanel contentPane;
	int state = 0;
	public DefaultListModel<Shape> dlm = new DefaultListModel<Shape>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DrawingApp frame = new DrawingApp();
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
	public DrawingApp() {
		setTitle("Mileusnic Nadja IT54/2021");
		PnlDrawing pnlDrawing = new PnlDrawing(this);
		pnlDrawing.setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 128));
		contentPane.setBackground(new Color(255, 250, 240));
		contentPane.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(240, 128, 128)));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		ButtonGroup group = new ButtonGroup();
		

		JPanel pnlNorth = new JPanel();
		pnlNorth.setForeground(new Color(0, 0, 0));
		pnlNorth.setBackground(new Color(255, 228, 196));
		contentPane.add(pnlNorth, BorderLayout.NORTH);
		
		JToggleButton tglModify = new JToggleButton("Modify");
		group.add(tglModify);
		tglModify.setForeground(new Color(178, 34, 34));
		tglModify.setPreferredSize(new Dimension(95,50));
		tglModify.setFont(new Font("Constantia", Font.BOLD, 18));
		tglModify.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 139)));
		tglModify.setBackground(new Color(255, 250, 240));
		tglModify.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pnlDrawing.modifyShape();
			}
		});
		pnlNorth.add(tglModify);
		
		JToggleButton tglSelect = new JToggleButton("Select");
		group.add(tglSelect);
		tglSelect.setForeground(new Color(178, 34, 34));
		tglSelect.setPreferredSize(new Dimension(95,50));
		tglSelect.setFont(new Font("Constantia", Font.BOLD, 18));
		tglSelect.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		tglSelect.setBackground(new Color(255, 250, 240));
		tglSelect.addItemListener(new ItemListener () {
			public void itemStateChanged (ItemEvent e) {
				state = 6;
			}
		});
		pnlNorth.add(tglSelect);
		
		JToggleButton tglDelete = new JToggleButton("Delete");
		group.add(tglDelete);
		tglDelete.setPreferredSize(new Dimension(95,50));
		tglDelete.setForeground(new Color(178, 34, 34));
		tglDelete.setFont(new Font("Constantia", Font.BOLD, 18));
		tglDelete.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		tglDelete.setBackground(new Color(255, 250, 240));
		tglDelete.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				state = 0;
				pnlDrawing.delete();
			}
		});
		pnlNorth.add(tglDelete);
		

		
		JPanel pnlWest = new JPanel();
		pnlWest.setBackground(new Color(255, 228, 196));
		contentPane.add(pnlWest, BorderLayout.WEST);
		pnlWest.setLayout(new MigLayout("", "[126px,grow]", "[22px][23px][23px][23px][23px][23px,grow][23px][23px][][][][][][][]"));
		
		JButton btnPoint = new JButton("Point");
		group.add(btnPoint);
		btnPoint.setForeground(new Color(245, 245, 220));
		btnPoint.setBackground(new Color(178, 34, 34));
		btnPoint.setFont(new Font("Constantia", Font.BOLD, 15));
		btnPoint.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent arg0) {
				state = 1;
			}
		});
		pnlWest.add(btnPoint, "cell 0 0,alignx left,aligny center");
		
		JButton btnLine = new JButton("Line");
		btnLine.setHorizontalAlignment(SwingConstants.LEADING);
		btnLine.setFont(new Font("Constantia", Font.PLAIN, 15));
		btnLine.setForeground(new Color(255, 250, 240));
		btnLine.setBackground(new Color(178, 34, 34));
		btnLine.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent arg0) {
				state = 2;
			}
		});
		pnlWest.add(btnLine, "cell 0 1,alignx left,aligny center");
		
		JButton btnRectangle = new JButton("Rectangle");
		btnRectangle.setForeground(new Color(255, 250, 240));
		btnRectangle.setBackground(new Color(178, 34, 34));
		btnRectangle.setFont(new Font("Constantia", Font.BOLD, 15));
		btnRectangle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				state = 3;
			}
		});
		pnlWest.add(btnRectangle, "cell 0 2,alignx left,aligny center");
		
		JButton btnDonut = new JButton("Donut");
		btnDonut.setBackground(new Color(178, 34, 34));
		btnDonut.setForeground(new Color(255, 250, 240));
		btnDonut.setFont(new Font("Constantia", Font.BOLD, 15));
		btnDonut.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent arg0) {
				state = 5;
			}
		});
		pnlWest.add(btnDonut, "cell 0 3,alignx left,aligny center");
		
		JButton btnCircle = new JButton("Circle");
		btnCircle.setForeground(new Color(255, 250, 240));
		btnCircle.setFont(new Font("Constantia", Font.BOLD, 15));
		btnCircle.setBackground(new Color(178, 34, 34));
		btnCircle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				state = 4;
			}
		});
		pnlWest.add(btnCircle, "cell 0 4,alignx left,aligny center");
		

		JPanel pnlCenter = new JPanel();
		contentPane.add(pnlCenter, BorderLayout.CENTER);
		
		pnlDrawing.setSize(new Dimension(20,40));
		pnlDrawing.setPreferredSize(new Dimension(200, 350));
		contentPane.add(pnlDrawing);
	}


	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public DefaultListModel<Shape> getDlm() {
		return dlm;
	}

	public void setDlm(DefaultListModel<Shape> dlm) {
		this.dlm = dlm;
	}

	
}

