package drawing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class DlgRectangle extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtX;
	private JTextField txtY;
	private JTextField txtWidth;
	private JTextField txtHeight;
	private boolean confirmation;
	private boolean innerColorConfirmation;
	private boolean borderColorConfirmation;
	Color innerFill;
	Color borderFill;
	public static void main(String[] args) {
		try {
			DlgRectangle dialog = new DlgRectangle();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgRectangle() {
		setBounds(100, 100, 600, 400);
		setTitle("Add/Modify");
		setModal(true);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 250, 240));
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		
		{
			JLabel lblX = new JLabel("Coordinate X:");
			lblX.setBackground(new Color(255, 250, 240));
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
			txtX.setFont(new Font("Times New Roman", Font.PLAIN, 12));
			txtX.setBackground(new Color(245, 222, 179));
			txtX.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, new Color(0, 0, 0)));
			GridBagConstraints gbc_txtX = new GridBagConstraints();
			gbc_txtX.anchor = GridBagConstraints.WEST;
			gbc_txtX.insets = new Insets(0, 0, 5, 0);
			gbc_txtX.gridx = 3;
			gbc_txtX.gridy = 1;
			contentPanel.add(txtX, gbc_txtX);
			txtX.setColumns(10);
		}
		{
			JLabel lblY = new JLabel("Coordinate Y:");
			lblY.setBackground(new Color(255, 250, 240));
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
			txtY.setFont(new Font("Times New Roman", Font.PLAIN, 12));
			txtY.setBackground(new Color(245, 222, 179));
			txtY.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, new Color(0, 0, 0)));
			GridBagConstraints gbc_txtY = new GridBagConstraints();
			gbc_txtY.anchor = GridBagConstraints.WEST;
			gbc_txtY.insets = new Insets(0, 0, 5, 0);
			gbc_txtY.gridx = 3;
			gbc_txtY.gridy = 2;
			contentPanel.add(txtY, gbc_txtY);
			txtY.setColumns(10);
		}
		{
			JLabel lblWidth = new JLabel("Width:");
			lblWidth.setBackground(new Color(255, 250, 240));
			lblWidth.setFont(new Font("Constantia", Font.BOLD, 15));
			lblWidth.setForeground(new Color(0, 0, 128));
			GridBagConstraints gbc_lblWidth = new GridBagConstraints();
			gbc_lblWidth.insets = new Insets(0, 0, 5, 5);
			gbc_lblWidth.gridx = 1;
			gbc_lblWidth.gridy = 4;
			contentPanel.add(lblWidth, gbc_lblWidth);
		}
		{
			txtWidth = new JTextField();
			txtWidth.setFont(new Font("Times New Roman", Font.PLAIN, 12));
			txtWidth.setBackground(new Color(245, 222, 179));
			txtWidth.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, new Color(0, 0, 0)));
			GridBagConstraints gbc_txtWidth = new GridBagConstraints();
			gbc_txtWidth.anchor = GridBagConstraints.WEST;
			gbc_txtWidth.insets = new Insets(0, 0, 5, 0);
			gbc_txtWidth.gridx = 3;
			gbc_txtWidth.gridy = 4;
			contentPanel.add(txtWidth, gbc_txtWidth);
			txtWidth.setColumns(10);
		}
		{
			JLabel lblHeight = new JLabel("Height:");
			lblHeight.setBackground(new Color(255, 250, 240));
			lblHeight.setFont(new Font("Constantia", Font.BOLD, 15));
			lblHeight.setForeground(new Color(0, 0, 128));
			GridBagConstraints gbc_lblHeight = new GridBagConstraints();
			gbc_lblHeight.insets = new Insets(0, 0, 5, 5);
			gbc_lblHeight.gridx = 1;
			gbc_lblHeight.gridy = 5;
			contentPanel.add(lblHeight, gbc_lblHeight);
		}
		{
			txtHeight = new JTextField();
			txtHeight.setFont(new Font("Times New Roman", Font.PLAIN, 12));
			txtHeight.setBackground(new Color(245, 222, 179));
			txtHeight.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, new Color(0, 0, 0)));
			GridBagConstraints gbc_txtHeight = new GridBagConstraints();
			gbc_txtHeight.anchor = GridBagConstraints.WEST;
			gbc_txtHeight.insets = new Insets(0, 0, 5, 0);
			gbc_txtHeight.gridx = 3;
			gbc_txtHeight.gridy = 5;
			contentPanel.add(txtHeight, gbc_txtHeight);
			txtHeight.setColumns(10);
		}
		
		
		{
			JButton btnInnerColor = new JButton("Inner color: ");
			btnInnerColor.setBackground(new Color(240, 255, 255));
			btnInnerColor.setForeground(new Color(0, 0, 128));
			btnInnerColor.setFont(new Font("Constantia", Font.BOLD, 12));
			btnInnerColor.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) 
				{
					innerFill = JColorChooser.showDialog(null, "Choose an inner color", innerFill);
					btnInnerColor.setBackground(innerFill);
					innerColorConfirmation = true;
				}
			});
			GridBagConstraints gbc_btnInnerColor = new GridBagConstraints();
			gbc_btnInnerColor.insets = new Insets(0, 0, 0, 5);
			gbc_btnInnerColor.gridx = 1;
			gbc_btnInnerColor.gridy = 8;
			contentPanel.add(btnInnerColor, gbc_btnInnerColor);
		}
		{
			JButton btnBorderColor = new JButton("Border color: ");
			btnBorderColor.setBackground(new Color(240, 255, 255));
			btnBorderColor.setForeground(new Color(0, 0, 128));
			btnBorderColor.setFont(new Font("Constantia", Font.BOLD, 12));
			btnBorderColor.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) 
				{
					borderFill = JColorChooser.showDialog(null, "Choose a border color", borderFill);
					btnBorderColor.setBackground(borderFill);
					borderColorConfirmation = true;
				}
			});
			btnBorderColor.setHorizontalAlignment(SwingConstants.LEFT);
			GridBagConstraints gbc_btnBorderColor = new GridBagConstraints();
			gbc_btnBorderColor.gridx = 3;
			gbc_btnBorderColor.gridy = 8;
			contentPanel.add(btnBorderColor, gbc_btnBorderColor);
		}
		

		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(173, 216, 230));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setBackground(new Color(240, 255, 255));
				okButton.setFont(new Font("Constantia", Font.BOLD, 12));
				okButton.addActionListener(new ActionListener () {
					public void actionPerformed(ActionEvent arg0) {
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
				cancelButton.setBackground(new Color(240, 255, 255));
				cancelButton.setFont(new Font("Constantia", Font.BOLD, 12));
				cancelButton.addActionListener(new ActionListener () {
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

	public JTextField getTxtWidth() {
		return txtWidth;
	}

	public void setTxtWidth(JTextField txtWidth) {
		this.txtWidth = txtWidth;
	}

	public JTextField getTxtHeight() {
		return txtHeight;
	}

	public void setTxtHeight(JTextField txtHeight) {
		this.txtHeight = txtHeight;
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
