package tienda;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfigurarPremioSorpresa10 extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNumeroSorpresa;
	private JTextField txtPremioSorpresa;
	private JButton btnCancelar;
	private JButton btnAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConfigurarPremioSorpresa10 dialog = new ConfigurarPremioSorpresa10();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConfigurarPremioSorpresa10() {
		setTitle("Configurar premio sorpresa");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNumeroSorpresa = new JLabel("Número de clientes");
			lblNumeroSorpresa.setBounds(10, 11, 152, 14);
			contentPanel.add(lblNumeroSorpresa);
		}
		{
			JLabel lblPremioSorpresa = new JLabel("Premio Sorpresa");
			lblPremioSorpresa.setBounds(10, 46, 152, 14);
			contentPanel.add(lblPremioSorpresa);
		}
		{
			txtNumeroSorpresa = new JTextField();
			txtNumeroSorpresa.setBounds(180, 9, 86, 20);
			contentPanel.add(txtNumeroSorpresa);
			txtNumeroSorpresa.setColumns(10);
		}
		{
			txtPremioSorpresa = new JTextField();
			txtPremioSorpresa.setColumns(10);
			txtPremioSorpresa.setBounds(180, 44, 86, 20);
			contentPanel.add(txtPremioSorpresa);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(314, 8, 110, 23);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(314, 42, 110, 23);
			contentPanel.add(btnCancelar);
		}
		
		txtNumeroSorpresa.setText(MenuPrincipal1.numeroClienteSorpresa+"");
		txtPremioSorpresa.setText(MenuPrincipal1.premioSorpresa);
		
}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnaceptar(e);
		}
		if (e.getSource() == btnCancelar) {
			actionPerformedBtncancelar(e);
		}
	}
	protected void actionPerformedBtncancelar(ActionEvent e) {
		dispose();
	}
	protected void actionPerformedBtnaceptar(ActionEvent e) {
		
		MenuPrincipal1.numeroClienteSorpresa=Integer.parseInt(txtNumeroSorpresa.getText());
		MenuPrincipal1.premioSorpresa=txtPremioSorpresa.getText();
	}
}
