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

public class ConfigurarPremioSorpresa11 extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtnumeroClienteSorpresa;
	private JTextField txtpremioSorpresa;
	private JButton btncancelar;
	private JButton btnaceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConfigurarPremioSorpresa11 dialog = new ConfigurarPremioSorpresa11();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConfigurarPremioSorpresa11() {
		setTitle("Configurar premio sorpresa");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblnumeroClienteSorpresa = new JLabel("N\u00FAmero de cliente");
			lblnumeroClienteSorpresa.setBounds(10, 11, 128, 14);
			contentPanel.add(lblnumeroClienteSorpresa);
		}
		{
			JLabel lblpremioSorpresa = new JLabel("Premio Sorpresa");
			lblpremioSorpresa.setBounds(10, 46, 107, 14);
			contentPanel.add(lblpremioSorpresa);
		}
		{
			txtnumeroClienteSorpresa = new JTextField();
			txtnumeroClienteSorpresa.setBounds(127, 8, 86, 20);
			contentPanel.add(txtnumeroClienteSorpresa);
			txtnumeroClienteSorpresa.setColumns(10);
		}
		{
			txtpremioSorpresa = new JTextField();
			txtpremioSorpresa.setColumns(10);
			txtpremioSorpresa.setBounds(127, 43, 86, 20);
			contentPanel.add(txtpremioSorpresa);
		}
		{
			btnaceptar = new JButton("Aceptar");
			btnaceptar.addActionListener(this);
			btnaceptar.setBounds(335, 8, 89, 23);
			contentPanel.add(btnaceptar);
		}
		{
			btncancelar = new JButton("Cancelar");
			btncancelar.addActionListener(this);
			btncancelar.setBounds(335, 42, 89, 23);
			contentPanel.add(btncancelar);
		}
		
		txtnumeroClienteSorpresa.setText(Main1.numeroClienteSorpresa+"");
		txtpremioSorpresa.setText(Main1.premioSorpresa);
		
}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnaceptar) {
			actionPerformedBtnaceptar(e);
		}
		if (e.getSource() == btncancelar) {
			actionPerformedBtncancelar(e);
		}
	}
	protected void actionPerformedBtncancelar(ActionEvent e) {
		dispose();
	}
	protected void actionPerformedBtnaceptar(ActionEvent e) {
		
		Main1.numeroClienteSorpresa=Integer.parseInt(txtnumeroClienteSorpresa.getText());
		Main1.premioSorpresa=txtpremioSorpresa.getText();
	}
}
