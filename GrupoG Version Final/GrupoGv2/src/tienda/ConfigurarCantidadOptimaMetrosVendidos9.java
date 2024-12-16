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

public class ConfigurarCantidadOptimaMetrosVendidos9 extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCantidadOptima;
	private JButton btnCancelar;
	private JButton btnAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConfigurarCantidadOptimaMetrosVendidos9 dialog = new ConfigurarCantidadOptimaMetrosVendidos9();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConfigurarCantidadOptimaMetrosVendidos9() {
		setTitle("Configurar cantidad \u00F3ptima de metros vendidos");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblCantidadOptima = new JLabel("Cantidad \u00F3ptima de metros vendidos");
			lblCantidadOptima.setBounds(10, 11, 226, 14);
			contentPanel.add(lblCantidadOptima);
		}
		{
			txtCantidadOptima = new JTextField();
			txtCantidadOptima.setBounds(238, 9, 86, 20);
			contentPanel.add(txtCantidadOptima);
			txtCantidadOptima.setColumns(10);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(335, 8, 103, 23);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(335, 42, 103, 23);
			contentPanel.add(btnCancelar);
		}
		
		txtCantidadOptima.setText(MenuPrincipal1.cantidadTotalOptima+"");
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
		
		MenuPrincipal1.cantidadTotalOptima=Integer.parseInt(txtCantidadOptima.getText());
	}
}
