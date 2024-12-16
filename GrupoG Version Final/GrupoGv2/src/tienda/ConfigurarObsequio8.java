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

public class ConfigurarObsequio8 extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtMinimaCantidadObsequio;
	private JTextField txtObsequio;
	private JButton btnCancelar;
	private JButton btnAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConfigurarObsequio8 dialog = new ConfigurarObsequio8();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConfigurarObsequio8() {
		setTitle("Configurar obsequio");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblMinimaCantidadObsequio = new JLabel("Cantidad m\u00EDnima de metros adquiridos");
			lblMinimaCantidadObsequio.setBounds(10, 11, 226, 14);
			contentPanel.add(lblMinimaCantidadObsequio);
		}
		{
			JLabel lblObsequio = new JLabel("Obsequio");
			lblObsequio.setBounds(10, 46, 86, 14);
			contentPanel.add(lblObsequio);
		}
		{
			txtMinimaCantidadObsequio = new JTextField();
			txtMinimaCantidadObsequio.setBounds(239, 8, 86, 20);
			contentPanel.add(txtMinimaCantidadObsequio);
			txtMinimaCantidadObsequio.setColumns(10);
		}
		{
			txtObsequio = new JTextField();
			txtObsequio.setColumns(10);
			txtObsequio.setBounds(239, 43, 86, 20);
			contentPanel.add(txtObsequio);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(335, 8, 89, 23);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(335, 42, 89, 23);
			contentPanel.add(btnCancelar);
		}
		
		txtMinimaCantidadObsequio.setText(MenuPrincipal1.cantidadObsequiable+"");
		txtObsequio.setText(MenuPrincipal1.obsequio);
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

		
		
		MenuPrincipal1.cantidadObsequiable=Integer.parseInt(txtMinimaCantidadObsequio.getText());
		MenuPrincipal1.obsequio=txtObsequio.getText();
	}
}
