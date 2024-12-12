package tienda;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AcercaDeTienda12 extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblTienda_1;
	private JLabel lblHechoPorGrupo;
	private JLabel lblyear;
	private JLabel lbllugar;
	private JButton btndale;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AcercaDeTienda12 dialog = new AcercaDeTienda12();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AcercaDeTienda12() {
		setTitle("Acerca de");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 434, 228);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		lblHechoPorGrupo = new JLabel("Hecho por grupo G");
		lblHechoPorGrupo.setBounds(161, 78, 112, 15);
		lblHechoPorGrupo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPanel.add(lblHechoPorGrupo);
		
		lblTienda_1 = new JLabel("Tienda 1.0");
		lblTienda_1.setBounds(181, 37, 72, 17);
		lblTienda_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPanel.add(lblTienda_1);
		
		lblyear = new JLabel("2024");
		lblyear.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblyear.setBounds(203, 123, 28, 15);
		contentPanel.add(lblyear);
		
		lbllugar = new JLabel("algun lugar de Per\u00FA");
		lbllugar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbllugar.setBounds(161, 160, 112, 15);
		contentPanel.add(lbllugar);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 228, 434, 33);
			getContentPane().add(buttonPane);
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			{
				btndale = new JButton("OK");
				btndale.addActionListener(this);
				btndale.setActionCommand("OK");
				buttonPane.add(btndale);
				getRootPane().setDefaultButton(btndale);
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btndale) {
			actionPerformedBtndale(e);
		}
	}
	protected void actionPerformedBtndale(ActionEvent e) {
		dispose();
	}
}
