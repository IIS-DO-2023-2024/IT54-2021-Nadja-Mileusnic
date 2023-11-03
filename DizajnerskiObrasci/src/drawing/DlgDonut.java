package drawing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JColorChooser;
import javax.swing.border.EtchedBorder;

import javax.swing.JTextField;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.SwingConstants;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.MatteBorder;

public class DlgDonut extends JDialog {

	
	
	private final JPanel contentPanel = new JPanel();
	
	private JTextField txtX;
	private JTextField txtY;
	private JTextField txtInnerRadius;
	private JTextField txtRadius;
	private boolean confirmation;
	private boolean innerColorConfirmation;
	private boolean borderColorConfirmation;
	Color innerFill;
	Color borderFill;

	
	
	
	
	public static void main(String[] args) {
		try {
			DlgDonut dialog = new DlgDonut();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgDonut() {
		getContentPane().setBackground(new Color(0, 0, 0));
		setBounds(100, 100, 600, 400);
		setModal(true);
		setTitle("Add or Modify");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 240));
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(173, 216, 230)));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblX = new JLabel("Coordinate X:");
			lblX.setBackground(new Color(245, 222, 179));
			lblX.setFont(new Font("Constantia", Font.BOLD, 15));
			lblX.setForeground(new Color(0, 0, 128));
			GridBagConstraints gbc_lblX = new GridBagConstraints();
			gbc_lblX.insets = new Insets(0, 0, 5, 5);
			gbc_lblX.gridx = 1;
			gbc_lblX.gridy = 1;
			contentPanel.add(lblX, gbc_lblX);
		}
		{
			txtX = new JTextField();
			txtX.setFont(new Font("Constantia", Font.BOLD, 12));
			txtX.setBackground(new Color(245, 222, 179));
			txtX.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, new Color(0, 0, 0)));
			GridBagConstraints gbc_txtX = new GridBagConstraints();
			gbc_txtX.gridwidth = 2;
			gbc_txtX.insets = new Insets(0, 0, 5, 5);
			gbc_txtX.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtX.gridx = 3;
			gbc_txtX.gridy = 1;
			contentPanel.add(txtX, gbc_txtX);
			txtX.setColumns(10);
		}
		
		{
			JLabel lblY = new JLabel("Coordinate Y:");
			lblY.setBackground(new Color(245, 222, 179));
			lblY.setFont(new Font("Constantia", Font.BOLD, 15));
			lblY.setForeground(new Color(0, 0, 128));
			GridBagConstraints gbc_lblY = new GridBagConstraints();
			gbc_lblY.insets = new Insets(0, 0, 5, 5);
			gbc_lblY.gridx = 1;
			gbc_lblY.gridy = 2;
			contentPanel.add(lblY, gbc_lblY);
		}
		{
			txtY = new JTextField();
			txtY.setBackground(new Color(245, 222, 179));
			txtY.setFont(new Font("Constantia", Font.BOLD, 12));
			txtX.setBackground(new Color(245, 222, 179));
			txtY.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, new Color(0, 0, 0)));
			GridBagConstraints gbc_txtY = new GridBagConstraints();
			gbc_txtY.gridwidth = 2;
			gbc_txtY.insets = new Insets(0, 0, 5, 5);
			gbc_txtY.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtY.gridx = 3;
			gbc_txtY.gridy = 2;
			contentPanel.add(txtY, gbc_txtY);
			txtY.setColumns(10);
		}
		
		{
			JLabel lblInnerRadius = new JLabel("Inner radius:");
			lblInnerRadius.setBackground(new Color(245, 222, 179));
			lblInnerRadius.setFont(new Font("Constantia", Font.BOLD, 15));
			lblInnerRadius.setForeground(new Color(0, 0, 128));
			GridBagConstraints gbc_lblInnerRadius = new GridBagConstraints();
			gbc_lblInnerRadius.insets = new Insets(0, 0, 5, 5);
			gbc_lblInnerRadius.gridx = 1;
			gbc_lblInnerRadius.gridy = 3;
			contentPanel.add(lblInnerRadius, gbc_lblInnerRadius);
		}
		{	
			txtInnerRadius = new JTextField();
			txtInnerRadius.setBackground(new Color(245, 222, 179));
			txtInnerRadius.setFont(new Font("Constantia", Font.BOLD, 15));
			txtInnerRadius.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, new Color(0, 0, 0)));
			GridBagConstraints gbc_txtInnerRadius = new GridBagConstraints();
			gbc_txtInnerRadius.gridwidth = 2;
			gbc_txtInnerRadius.insets = new Insets(0, 0, 5, 5);
			gbc_txtInnerRadius.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtInnerRadius.gridx = 3;
			gbc_txtInnerRadius.gridy = 3;
			contentPanel.add(txtInnerRadius, gbc_txtInnerRadius);
			txtInnerRadius.setColumns(10);
		}
		{
			JLabel lblRadius = new JLabel("Radius:");
			lblRadius.setBackground(new Color(245, 222, 179));
			lblRadius.setFont(new Font("Constantia", Font.BOLD, 15));
			lblRadius.setForeground(new Color(0, 0, 128));
			GridBagConstraints gbc_lblRadius = new GridBagConstraints();
			gbc_lblRadius.insets = new Insets(0, 0, 5, 5);
			gbc_lblRadius.gridx = 1;
			gbc_lblRadius.gridy = 4;
			contentPanel.add(lblRadius, gbc_lblRadius);
		}
		{	
			txtRadius = new JTextField();
			txtRadius.setFont(new Font("Constantia", Font.BOLD, 15));
			txtRadius.setBackground(new Color(245, 222, 179));
			txtRadius.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, new Color(0, 0, 0)));
			GridBagConstraints gbc_txtRadius = new GridBagConstraints();
			gbc_txtRadius.gridwidth = 2;
			gbc_txtRadius.insets = new Insets(0, 0, 5, 5);
			gbc_txtRadius.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtRadius.gridx = 3;
			gbc_txtRadius.gridy = 4;
			contentPanel.add(txtRadius, gbc_txtRadius);
			txtRadius.setColumns(10);
		}
		
		{	//color choosing
		JButton btnBorderColor = new JButton("Border color:");
		btnBorderColor.setForeground(new Color(0, 0, 128));
		btnBorderColor.setFont(new Font("Constantia", Font.BOLD, 15));
		btnBorderColor.setBackground(new Color(255, 245, 238));
		btnBorderColor.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent arg0) {
				borderFill = JColorChooser.showDialog(null, "Select a color for the border:", borderFill);
				btnBorderColor.setBackground(borderFill);
				setBorderColorConfirmation(true);
				
			}

		});
		btnBorderColor.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_btnBorderColor = new GridBagConstraints();
		gbc_btnBorderColor.gridwidth = 2;
		gbc_btnBorderColor.insets = new Insets(0, 0, 0, 5);
		gbc_btnBorderColor.gridx = 1;
		gbc_btnBorderColor.gridy = 6;
		contentPanel.add(btnBorderColor, gbc_btnBorderColor);
		}
		
		{
			JButton btnInnerColor = new JButton ("Inner color:");
			btnInnerColor.setForeground(new Color(0, 0, 128));
			btnInnerColor.setFont(new Font("Constantia", Font.BOLD, 15));
			btnInnerColor.setBackground(new Color(255, 245, 238));
			btnInnerColor.addActionListener(new ActionListener() {
				public void actionPerformed (ActionEvent arg0) {
					innerFill = JColorChooser.showDialog(null, "Choose an inner color", innerFill);
					btnInnerColor.setBackground(innerFill);
					innerColorConfirmation = true;
				}
			});
			
			GridBagConstraints gbc_btnInnerColor = new GridBagConstraints();
			gbc_btnInnerColor.gridwidth = 2;
			gbc_btnInnerColor.insets = new Insets(0, 0, 0, 5);
			gbc_btnInnerColor.gridx = 4;
			gbc_btnInnerColor.gridy = 6;
			contentPanel.add(btnInnerColor, gbc_btnInnerColor);
		}
		
		//OK/CANCEL
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(173, 216, 230));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setForeground(new Color(0, 0, 128));
				okButton.setFont(new Font("Constantia", Font.BOLD, 15));
				okButton.setBackground(new Color(255, 245, 238));
				
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed (ActionEvent arg0) {
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
				cancelButton.setFont(new Font("Constantia", Font.BOLD, 15));
				cancelButton.setBackground(new Color(255, 245, 238));
				
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						int action=JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel?", "Your cancelation", JOptionPane.YES_NO_OPTION);
						if (action==0) {
							
						
						dispose();
					}}
						
						
					
				});
				
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	public JTextField getTxtX() {
		return txtX;
	}

	public void setTxtX(JTextField txtX) {
		this.txtX = txtX;
	}

	public JTextField getTxtY() {
		return txtY;
	}

	public void setTxtY(JTextField txtY) {
		this.txtY = txtY;
	}

	public JTextField getTxtRadius() {
		return txtRadius;
	}

	public void setTxtRadius(JTextField txtRadius) {
		this.txtRadius = txtRadius;
	}
	public JTextField getTxtInnerRadius() {
		return txtInnerRadius;
	}

	public void setTxtInnerRadius(JTextField txtInnerRadius) {
		this.txtInnerRadius = txtInnerRadius;
	}
	
	public boolean isConfirmation() {
		return confirmation;
	}

	public void setConfirmation(boolean confirmation) {
		this.confirmation = confirmation;
	}

	public boolean isInnerColorConfirmation() {
		return innerColorConfirmation;
	}

	public void setInnerColorConfirmation(boolean innerColorConfirmation) {
		this.innerColorConfirmation = innerColorConfirmation;
	}

	public boolean isBorderColorConfirmation() {
		return borderColorConfirmation;
	}

	public void setBorderColorConfirmation(boolean borderColorConfirmation) {
		this.borderColorConfirmation = borderColorConfirmation;
	}

	public Color getInnerFill() {
		return innerFill;
	}

	public void setInnerFill(Color innerFill) {
		this.innerFill = innerFill;
	}

	public Color getBorderFill() {
		return borderFill;
	}

	public void setBorderFill(Color borderFill) {
		this.borderFill = borderFill;
	}
}
