package sort;

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

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;
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
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 240));
		contentPanel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(173, 216, 230)));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2.0};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblX = new JLabel("Coordinate X:");
			lblX.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
			lblX.setForeground(new Color(25, 25, 112));
			GridBagConstraints gbc_lblX = new GridBagConstraints();
			gbc_lblX.insets = new Insets(0, 0, 5, 5);
			gbc_lblX.gridx = 3;
			gbc_lblX.gridy = 1;
			contentPanel.add(lblX, gbc_lblX);
		}
		{
			txtX = new JTextField();
			txtX.setBackground(new Color(245, 222, 179));
			txtX.setForeground(new Color(0, 0, 0));
			txtX.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
			txtX.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(51, 51, 102)));
			GridBagConstraints gbc_txtX = new GridBagConstraints();
			gbc_txtX.gridwidth = 4;
			gbc_txtX.insets = new Insets(0, 0, 5, 5);
			gbc_txtX.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtX.gridx = 5;
			gbc_txtX.gridy = 1;
			contentPanel.add(txtX, gbc_txtX);
			txtX.setColumns(10);
		}
		{
			JLabel lblY = new JLabel("Coordinate Y:");
			lblY.setForeground(new Color(25, 25, 112));
			lblY.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
			GridBagConstraints gbc_lblY = new GridBagConstraints();
			gbc_lblY.insets = new Insets(0, 0, 5, 5);
			gbc_lblY.gridx = 3;
			gbc_lblY.gridy = 2;
			contentPanel.add(lblY, gbc_lblY);
		}
		{
			txtY = new JTextField();
			txtY.setBackground(new Color(245, 222, 179));
			txtY.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
			txtY.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(51, 51, 102)));
			GridBagConstraints gbc_txtY = new GridBagConstraints();
			gbc_txtY.gridwidth = 4;
			gbc_txtY.insets = new Insets(0, 0, 5, 5);
			gbc_txtY.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtY.gridx = 5;
			gbc_txtY.gridy = 2;
			contentPanel.add(txtY, gbc_txtY);
			txtY.setColumns(10);
		}
		{
			JLabel lblCenter = new JLabel("Center:");
			lblCenter.setForeground(new Color(25, 25, 112));
			lblCenter.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
			GridBagConstraints gbc_lblCenter = new GridBagConstraints();
			gbc_lblCenter.insets = new Insets(0, 0, 5, 5);
			gbc_lblCenter.gridx = 3;
			gbc_lblCenter.gridy = 4;
			contentPanel.add(lblCenter, gbc_lblCenter);
		}
		{
			txtCenter = new JTextField();
			txtCenter.setBackground(new Color(245, 222, 179));
			txtCenter.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
			txtCenter.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(51, 51, 102)));
			GridBagConstraints gbc_txtCenter = new GridBagConstraints();
			gbc_txtCenter.gridwidth = 4;
			gbc_txtCenter.insets = new Insets(0, 0, 5, 5);
			gbc_txtCenter.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtCenter.gridx = 5;
			gbc_txtCenter.gridy = 4;
			contentPanel.add(txtCenter, gbc_txtCenter);
			txtCenter.setColumns(10);
		}
		{
			JLabel lblRadius = new JLabel("Radius:");
			lblRadius.setForeground(new Color(25, 25, 112));
			lblRadius.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
			GridBagConstraints gbc_lblRadius = new GridBagConstraints();
			gbc_lblRadius.insets = new Insets(0, 0, 5, 5);
			gbc_lblRadius.gridx = 3;
			gbc_lblRadius.gridy = 5;
			contentPanel.add(lblRadius, gbc_lblRadius);
		}
		{
			txtRadius = new JTextField();
			txtRadius.setBackground(new Color(245, 222, 179));
			txtRadius.setFont(new Font("Constantia", Font.PLAIN, 12));
			txtRadius.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(51, 51, 102)));
			GridBagConstraints gbc_txtRadius = new GridBagConstraints();
			gbc_txtRadius.gridwidth = 4;
			gbc_txtRadius.insets = new Insets(0, 0, 5, 5);
			gbc_txtRadius.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtRadius.gridx = 5;
			gbc_txtRadius.gridy = 5;
			contentPanel.add(txtRadius, gbc_txtRadius);
			txtRadius.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(173, 216, 230));
			buttonPane.setBorder(new LineBorder(new Color(0, 0, 0)));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setForeground(new Color(0, 0, 128));
				okButton.setBackground(new Color(240, 255, 255));
				okButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
				if (Integer.parseInt(txtRadius.getText())>0) {
					
				confirmation=true;
						setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(null, "Radius has to be >0!", "WARNING!!!", JOptionPane.ERROR_MESSAGE);
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
				cancelButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	
	//get/set metode
	
	
	public boolean isConfirmation() {
		// TODO Auto-generated method stub
		return confirmation;
	}

	public JTextField getTxtRadius() {
		// TODO Auto-generated method stub
		return txtRadius;
	}

	public JTextField getTxtCenter() {
		// TODO Auto-generated method stub
		return txtCenter;
	}

	public JTextField getTxtY() {
		return txtY;
	}

	public JTextField getTxtX() {
		return txtX;
	}

	public void setTxtX(JTextField txtX) {
		this.txtX = txtX;
	}

	public void setTxtY(JTextField txtY) {
		this.txtY = txtY;
	}

	public void setTxtCenter(JTextField txtCenter) {
		this.txtCenter = txtCenter;
	}

	public void setConfirmation(boolean confirmation) {
		this.confirmation = confirmation;
	}

}
