package drawing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class DlgDelete extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public boolean confirmation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgDelete dialog = new DlgDelete();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgDelete() {
		setBounds(100, 100, 450, 300);
		setModal(true);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(255, 245, 238));
			contentPanel.add(panel, BorderLayout.NORTH);
			{
				JLabel lblDelete = new JLabel ("Delete?");
				lblDelete.setFont(new Font("Constantia", Font.BOLD, 21));
				GridBagConstraints gbc_lblDelete = new GridBagConstraints();
				gbc_lblDelete.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblDelete.anchor = GridBagConstraints.EAST;
				gbc_lblDelete.gridwidth = 4;
				gbc_lblDelete.insets = new Insets(0, 0, 5, 5);
				gbc_lblDelete.gridx = 0;
				gbc_lblDelete.gridy = 0;
				panel.add(lblDelete, gbc_lblDelete);
			}
			
			{
			JPanel pnl = new JPanel();
			pnl.setBackground(new Color(255, 245, 238));
			contentPanel.add(pnl, BorderLayout.CENTER);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				JLabel lblDlt = new JLabel ("Do you really want to delete this object?");
				lblDlt.setForeground(new Color(0, 0, 128));
				lblDlt.setFont(new Font("Times New Roman", Font.BOLD, 18));
				GridBagConstraints gbc_lblDlt = new GridBagConstraints();
				gbc_lblDlt.gridheight = 4;
				gbc_lblDlt.gridwidth = 3;
				gbc_lblDlt.insets = new Insets(0, 0, 0, 5);
				gbc_lblDlt.gridx = 2;
				gbc_lblDlt.gridy = 2;
				panel.add(lblDlt, gbc_lblDlt);
			}
			
			//south panel/buttons
			
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(173, 216, 230));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setBackground(new Color(255, 250, 240));
				okButton.setForeground(new Color(0, 0, 128));
				okButton.setFont(new Font("Constantia", Font.BOLD, 15));
				okButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
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
				cancelButton.setBackground(new Color(255, 250, 240));
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
			
	
	}
	}

	public boolean isConfirmation() {
		// TODO Auto-generated method stub
		return confirmation;
	}
}
