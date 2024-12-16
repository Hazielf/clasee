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

public class AcercaDeTienda11 extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblTienda_1;
	private JLabel lblHechoPorGrupo;
	private JButton btndale;
	private JLabel lblBerklen;
	private JLabel lblHazielFelixQuijaite;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AcercaDeTienda11 dialog = new AcercaDeTienda11();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AcercaDeTienda11() {
		setTitle("Acerca de");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 434, 228);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		lblHechoPorGrupo = new JLabel("Autores");
		lblHechoPorGrupo.setBounds(194, 64, 49, 15);
		lblHechoPorGrupo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPanel.add(lblHechoPorGrupo);
		
		lblTienda_1 = new JLabel("Tienda 1.0");
		lblTienda_1.setBounds(178, 35, 94, 17);
		lblTienda_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPanel.add(lblTienda_1);
		
		JLabel lblNewLabel = new JLabel("Axcel Adrian Sanchez Ortiz");
		lblNewLabel.setBounds(132, 159, 189, 15);
		contentPanel.add(lblNewLabel);
		
		lblBerklen = new JLabel("Berklen Weder Choque Gomez");
		lblBerklen.setBounds(119, 91, 215, 15);
		contentPanel.add(lblBerklen);
		
		lblHazielFelixQuijaite = new JLabel("Haziel Felix Quijaite Flores");
		lblHazielFelixQuijaite.setBounds(132, 124, 189, 15);
		contentPanel.add(lblHazielFelixQuijaite);
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
