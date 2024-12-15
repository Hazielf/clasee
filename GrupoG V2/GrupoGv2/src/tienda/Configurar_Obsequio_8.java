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

public class Configurar_Obsequio_8 extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtcantidadObsequiable;
	private JTextField txtobsequio;
	private JButton btncancelar;
	private JButton btnaceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Configurar_Obsequio_8 dialog = new Configurar_Obsequio_8();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Configurar_Obsequio_8() {
		setTitle("Configurar obsequio");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblcantidadObsequiable = new JLabel("Cantidad m\u00EDnima de metros adquiridos");
			lblcantidadObsequiable.setBounds(10, 11, 226, 14);
			contentPanel.add(lblcantidadObsequiable);
		}
		{
			JLabel lblobsequio = new JLabel("Obsequio");
			lblobsequio.setBounds(10, 46, 57, 14);
			contentPanel.add(lblobsequio);
		}
		{
			txtcantidadObsequiable = new JTextField();
			txtcantidadObsequiable.setBounds(239, 8, 86, 20);
			contentPanel.add(txtcantidadObsequiable);
			txtcantidadObsequiable.setColumns(10);
		}
		{
			txtobsequio = new JTextField();
			txtobsequio.setColumns(10);
			txtobsequio.setBounds(239, 43, 86, 20);
			contentPanel.add(txtobsequio);
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
		
		txtcantidadObsequiable.setText(Menu_Principal_1.cantidadObsequiable+"");
		txtobsequio.setText(Menu_Principal_1.obsequio);
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

		
		
		Menu_Principal_1.cantidadObsequiable=Integer.parseInt(txtcantidadObsequiable.getText());
		Menu_Principal_1.obsequio=txtobsequio.getText();
	}
}
