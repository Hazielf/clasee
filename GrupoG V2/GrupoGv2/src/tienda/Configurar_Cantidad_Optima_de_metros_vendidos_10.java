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

public class Configurar_Cantidad_Optima_de_metros_vendidos_10 extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtcantidadTotalOptima;
	private JButton btncancelar;
	private JButton btnaceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Configurar_Cantidad_Optima_de_metros_vendidos_10 dialog = new Configurar_Cantidad_Optima_de_metros_vendidos_10();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Configurar_Cantidad_Optima_de_metros_vendidos_10() {
		setTitle("Configurar cantidad \u00F3ptima de metros vendidos");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblcantidadTotalOptima = new JLabel("Cantidad \u00F3ptima de metros vendidos");
			lblcantidadTotalOptima.setBounds(10, 11, 226, 14);
			contentPanel.add(lblcantidadTotalOptima);
		}
		{
			txtcantidadTotalOptima = new JTextField();
			txtcantidadTotalOptima.setBounds(239, 8, 86, 20);
			contentPanel.add(txtcantidadTotalOptima);
			txtcantidadTotalOptima.setColumns(10);
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
		
		txtcantidadTotalOptima.setText(Menu_Principal_1.cantidadTotalOptima+"");
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
		
		Menu_Principal_1.cantidadTotalOptima=Integer.parseInt(txtcantidadTotalOptima.getText());
	}
}
