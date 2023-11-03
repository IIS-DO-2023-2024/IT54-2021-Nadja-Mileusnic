package stack;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.GridBagConstraints;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;


public class DlgAdd extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtX;
	private JTextField txtY;
	private JTextField txtRadius;
	private JTextField txtCenter;
	private boolean confirmation;
	
	

	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgAdd dialog = new DlgAdd();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgAdd() {
		setBackground(new Color(240, 255, 240));
		setTitle("Add or Delete");
		setModal(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 683, 450);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 250, 240));
		contentPanel.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 0, 128)));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		contentPanel.setLayout(gbl_contentPanel);
		
		{
		    JLabel lblX = new JLabel("Coordinate X: ");
			lblX.setForeground(new Color(25, 25, 112));
			lblX.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
			
			GridBagConstraints gbc_lblX = new GridBagConstraints();
			gbc_lblX.insets = new Insets(0, 0, 5, 5);
			gbc_lblX.gridx = 3;
			gbc_lblX.gridy = 1;
			contentPanel.add(lblX, gbc_lblX);
		}
		{
			txtX = new JTextField();
			txtX.setBackground(new Color(255, 255, 240));
			txtX.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
			GridBagConstraints gbc_txtX = new GridBagConstraints();
			gbc_txtX.gridwidth = 3;
			gbc_txtX.insets = new Insets(0, 0, 5, 5);
			gbc_txtX.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtX.gridx = 4;
			gbc_txtX.gridy = 1;
			contentPanel.add(txtX, gbc_txtX);
			txtX.setColumns(10);
		}
		{
			 JLabel lblY = new JLabel("Coordinate Y:");
			lblY.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
			lblY.setForeground(new Color(0, 0, 128));
			GridBagConstraints gbc_lblY = new GridBagConstraints();
			
			gbc_lblY.insets = new Insets(0, 0, 5, 5);
			gbc_lblY.gridx = 3;
			gbc_lblY.gridy = 3;
			contentPanel.add(lblY, gbc_lblY);
		}
		{
			txtY = new JTextField();
			txtY.setBackground(new Color(255, 255, 240));
			txtY.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
			GridBagConstraints gbc_txtY = new GridBagConstraints();
			gbc_txtY.gridwidth = 3;
			gbc_txtY.insets = new Insets(0, 0, 5, 5);
			gbc_txtY.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtY.gridx = 4;
			gbc_txtY.gridy = 3;
			contentPanel.add(txtY, gbc_txtY);
			txtY.setColumns(10);
		}
		{
			JLabel lblCenter = new JLabel("Center:");
			lblCenter.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
			lblCenter.setForeground(new Color(0, 0, 128));
			lblCenter.setBackground(new Color(176, 224, 230));
			GridBagConstraints gbc_lblCenter = new GridBagConstraints();
			gbc_lblCenter.anchor = GridBagConstraints.EAST;
			gbc_lblCenter.insets = new Insets(0, 0, 5, 5);
			gbc_lblCenter.gridx = 3;
			gbc_lblCenter.gridy = 5;
			contentPanel.add(lblCenter, gbc_lblCenter);
		}
		{
			txtCenter = new JTextField();
			txtCenter.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
			txtCenter.setColumns(10);
			txtCenter.setBackground(new Color(255, 255, 240));
			GridBagConstraints gbc_txtCenter = new GridBagConstraints();
			gbc_txtCenter.gridwidth = 3;
			gbc_txtCenter.insets = new Insets(0, 0, 5, 5);
			gbc_txtCenter.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtCenter.gridx = 4;
			gbc_txtCenter.gridy = 5;
			contentPanel.add(txtCenter, gbc_txtCenter);
		}
		{
			JLabel lblRadius = new JLabel("Radius: ");
			lblRadius.setForeground(new Color(0, 0, 128));
			lblRadius.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
			lblRadius.setBackground(new Color(176, 224, 230));
			GridBagConstraints gbc_lblRadius = new GridBagConstraints();
			gbc_lblRadius.anchor = GridBagConstraints.EAST;
			gbc_lblRadius.insets = new Insets(0, 0, 5, 5);
			gbc_lblRadius.gridx = 3;
			gbc_lblRadius.gridy = 7;
			contentPanel.add(lblRadius, gbc_lblRadius);
		}
		{
			txtRadius = new JTextField();
			txtRadius.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
			txtRadius.setColumns(10);
			txtRadius.setBackground(new Color(255, 255, 240));
			GridBagConstraints gbc_textField_1 = new GridBagConstraints();
			gbc_textField_1.gridwidth = 3;
			gbc_textField_1.insets = new Insets(0, 0, 5, 5);
			gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_1.gridx = 4;
			gbc_textField_1.gridy = 7;
			contentPanel.add(txtRadius, gbc_textField_1);
		}
{
			
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			buttonPane.setBorder(new LineBorder(new Color(0, 0, 0)));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setForeground(new Color(0, 0, 128));
				okButton.setBackground(new Color(240, 255, 255));
				okButton.setFont(new Font("Constantia", Font.BOLD, 12));
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
				
						try {
							confirmation=true;
							setVisible(false);
						}
						
						catch (NumberFormatException nfe) {
							JOptionPane.showMessageDialog(null, "You cannot leave an empty field or put in a character!",
									"WARNING!!!", JOptionPane.ERROR_MESSAGE);
							
						}

					}
					
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setForeground(new Color(0, 0, 128));
				cancelButton.setBackground(new Color(240, 255, 255));
				cancelButton.setFont(new Font("Constantia", Font.BOLD, 12));
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
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



	public JTextField getTxtY() {
		// TODO Auto-generated method stub
		return txtY;
	}

	public JTextField getTxtX() {
		// TODO Auto-generated method stub
		return txtX;
	}

	public boolean isConfirmation() {
		// TODO Auto-generated method stub
		return this.confirmation;
	}

	public JTextField getTxtCenter() {
		// TODO Auto-generated method stub
		return txtCenter;
	}

	public void setTxtX(JTextField txtX) {
		this.txtX = txtX;
	}


	public void setConfirmation(boolean confirmation) {
		this.confirmation = confirmation;
	}

	public void setTxtCenter(JTextField txtCenter) {
		this.txtCenter = txtCenter;
	}

	public void setTxtY(JTextField txtY) {
		this.txtX = txtY;
	}

	public JTextField getTxtRadius() {
		// TODO Auto-generated method stub
		return txtRadius;
	}

}
