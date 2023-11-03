package drawing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JColorChooser;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

public class DlgLine extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	private JTextField txtStartPointX;
	private JTextField txtStartPointY;
	private JTextField txtEndPointX;
	private JTextField txtEndPointY;
	private boolean confirmation;
	private boolean colorConfirmation;
	Color fill;

	
	
	public static void main(String[] args) {
		try {
			DlgLine dialog = new DlgLine();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgLine() {
		setModal(true);
		setTitle("Modify");
		setBounds(100, 100, 600, 400);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 240));
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblStartPointX = new JLabel("Start point X:");
			lblStartPointX.setBackground(new Color(255, 250, 240));
			lblStartPointX.setForeground(new Color(0, 0, 128));
			lblStartPointX.setFont(new Font("Constantia", Font.BOLD, 15));
			GridBagConstraints gbc_lblStartPointX = new GridBagConstraints();
			gbc_lblStartPointX.insets = new Insets(0, 0, 5, 5);
			gbc_lblStartPointX.gridx = 1;
			gbc_lblStartPointX.gridy = 1;
			contentPanel.add(lblStartPointX, gbc_lblStartPointX);
		}
		{
			txtStartPointX = new JTextField();
			txtStartPointX.setFont(new Font("Constantia", Font.BOLD, 12));
			txtStartPointX.setBackground(new Color(245, 222, 179));
			txtStartPointX.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, new Color(0, 0, 0)));
			GridBagConstraints gbc_txtStartPointX = new GridBagConstraints();
			gbc_txtStartPointX.gridwidth = 2;
			gbc_txtStartPointX.insets = new Insets(0, 0, 5, 5);
			gbc_txtStartPointX.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtStartPointX.gridx = 3;
			gbc_txtStartPointX.gridy = 1;
			contentPanel.add(txtStartPointX, gbc_txtStartPointX);
			txtStartPointX.setColumns(10);
		}
		{
			JLabel lblStartPointY = new JLabel("Start point Y:");
			lblStartPointY.setBackground(new Color(255, 250, 240));
			lblStartPointY.setForeground(new Color(0, 0, 128));
			lblStartPointY.setFont(new Font("Constantia", Font.BOLD, 15));
			GridBagConstraints gbc_lblStartPointY = new GridBagConstraints();
			gbc_lblStartPointY.insets = new Insets(0, 0, 5, 5);
			gbc_lblStartPointY.gridx = 1;
			gbc_lblStartPointY.gridy = 2;
			contentPanel.add(lblStartPointY, gbc_lblStartPointY);
		}
		{
			txtStartPointY = new JTextField();
			txtStartPointY.setFont(new Font("Times New Roman", Font.PLAIN, 12));
			txtStartPointY.setBackground(new Color(245, 222, 179));
			txtStartPointY.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, new Color(0, 0, 0)));
			GridBagConstraints gbc_txtStartPointY = new GridBagConstraints();
			gbc_txtStartPointY.gridwidth = 2;
			gbc_txtStartPointY.insets = new Insets(0, 0, 5, 5);
			gbc_txtStartPointY.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtStartPointY.gridx = 3;
			gbc_txtStartPointY.gridy = 2;
			contentPanel.add(txtStartPointY, gbc_txtStartPointY);
			txtStartPointY.setColumns(10);
		}
		{
			JLabel lblEndPointX = new JLabel("End point X:");
			lblEndPointX.setBackground(new Color(255, 250, 240));
			lblEndPointX.setForeground(new Color(0, 0, 128));
			lblEndPointX.setFont(new Font("Constantia", Font.BOLD, 15));
			GridBagConstraints gbc_lblEndPointX = new GridBagConstraints();
			gbc_lblEndPointX.insets = new Insets(0, 0, 5, 5);
			gbc_lblEndPointX.gridx = 1;
			gbc_lblEndPointX.gridy = 3;
			contentPanel.add(lblEndPointX, gbc_lblEndPointX);
		}
		{
			txtEndPointX = new JTextField();
			txtEndPointX.setFont(new Font("Constantia", Font.BOLD, 12));
			txtEndPointX.setBackground(new Color(245, 222, 179));
			txtEndPointX.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, new Color(0, 0, 0)));
			GridBagConstraints gbc_txtEndPointX = new GridBagConstraints();
			gbc_txtEndPointX.gridwidth = 2;
			gbc_txtEndPointX.insets = new Insets(0, 0, 5, 5);
			gbc_txtEndPointX.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtEndPointX.gridx = 3;
			gbc_txtEndPointX.gridy = 3;
			contentPanel.add(txtEndPointX, gbc_txtEndPointX);
			txtEndPointX.setColumns(10);
		}
		{
			JLabel lblEndPointY = new JLabel("End point Y:");
			lblEndPointY.setBackground(new Color(255, 250, 240));
			lblEndPointY.setForeground(new Color(0, 0, 128));
			lblEndPointY.setFont(new Font("Constantia", Font.BOLD, 15));
			GridBagConstraints gbc_lblEndPointY = new GridBagConstraints();
			gbc_lblEndPointY.insets = new Insets(0, 0, 5, 5);
			gbc_lblEndPointY.gridx = 1;
			gbc_lblEndPointY.gridy = 4;
			contentPanel.add(lblEndPointY, gbc_lblEndPointY);
		}
		{
			txtEndPointY = new JTextField();
			txtEndPointY.setFont(new Font("Constantia", Font.PLAIN, 12));
			txtEndPointY.setBackground(new Color(245, 222, 179));
			txtEndPointY.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, new Color(0, 0, 0)));
			GridBagConstraints gbc_txtEndPointY = new GridBagConstraints();
			gbc_txtEndPointY.gridwidth = 2;
			gbc_txtEndPointY.insets = new Insets(0, 0, 5, 5);
			gbc_txtEndPointY.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtEndPointY.gridx = 3;
			gbc_txtEndPointY.gridy = 4;
			contentPanel.add(txtEndPointY, gbc_txtEndPointY);
			txtEndPointY.setColumns(10);
		}
		
		{
			JButton btnColor = new JButton("Color");
			btnColor.setPreferredSize(new Dimension(180,35));
			btnColor.setForeground(new Color(0, 0, 128));
			btnColor.setBackground(new Color(222, 184, 135));
			btnColor.setFont(new Font("Constantia", Font.BOLD, 15));
			btnColor.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) 
				{
					fill = JColorChooser.showDialog(null, "Choose a color: ", fill);
					btnColor.setBackground(fill);
					colorConfirmation = true;
				}
			});
			GridBagConstraints gbc_btnColor = new GridBagConstraints();
			gbc_btnColor.insets = new Insets(0, 0, 0, 5);
			gbc_btnColor.gridx = 1;
			gbc_btnColor.gridy = 6;
			contentPanel.add(btnColor, gbc_btnColor);
		}
	
	
	
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(245, 222, 179));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setForeground(new Color(0, 0, 128));
				okButton.setBackground(new Color(255, 228, 196));
				okButton.setFont(new Font("Constantia", Font.BOLD, 15));
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) 
					{
						confirmation = true; 
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setForeground(new Color(0, 0, 128));
				cancelButton.setBackground(new Color(255, 228, 196));
				cancelButton.setFont(new Font("Constantia", Font.BOLD, 15));
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						int action=JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel?", "Your cancelation", JOptionPane.YES_NO_OPTION);
						if (action==0) {
							
						
						dispose();
					}
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		}
	


public JTextField getTxtStartPointX() {
	return txtStartPointX;
}

public void setTxtStartPointX(JTextField txtStartPointX) {
	this.txtStartPointX = txtStartPointX;
}

public JTextField getTxtStartPointY() {
	return txtStartPointY;
}

public void setTxtStartPointY(JTextField txtStartPointY) {
	this.txtStartPointY = txtStartPointY;
}

public JTextField getTxtEndPointY() {
	return txtEndPointY;
}

public void setTxtEndPointY(JTextField txtEndPointY) {
	this.txtEndPointY = txtEndPointY;
}

public JTextField getTxtEndPointX() {
	return txtEndPointX;
}

public void setTxtEndPointX(JTextField txtEndPointX) {
	this.txtEndPointX = txtEndPointX;
}

public boolean isConfirmation() {
	return confirmation;
}

public void setConfirmation(boolean confirmation) {
	this.confirmation = confirmation;
}

public boolean isColorConfirmation() {
	return colorConfirmation;
}

public void setColorConfirmation(boolean colorConfirmation) {
	this.colorConfirmation = colorConfirmation;
}

public Color getFill() {
	return fill;
}

public void setFill(Color fill) {
	this.fill = fill;
}
}

