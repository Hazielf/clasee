package tienda;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ConfigurarDescuento7 extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JButton btnCancelar;
	private JTextField txtPorcentaje1;
	private JTextField txtPorcentaje2;
	private JTextField txtPorcentaje3;
	private JTextField txtPorcentaje4;
	private JLabel lblSimboloUno;
	private JLabel lblSimboloDos;
	private JLabel lblSimboloTres;
	private JLabel lblSimboloCuatro;
	private JButton btnAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConfigurarDescuento7 dialog = new ConfigurarDescuento7();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConfigurarDescuento7() {
		setTitle("Configurar porcentajes de descuento");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblUnoCinco = new JLabel("1 a 5 metros");
			lblUnoCinco.setBounds(10, 15, 94, 14);
			contentPanel.add(lblUnoCinco);
		}
		{
			JLabel lblSeisDiez = new JLabel("6 a 10 metros");
			lblSeisDiez.setBounds(10, 50, 94, 14);
			contentPanel.add(lblSeisDiez);
		}
		{
			JLabel lblOnceQuince = new JLabel("11 a 15 metros");
			lblOnceQuince.setBounds(10, 85, 94, 14);
			contentPanel.add(lblOnceQuince);
		}
		{
			JLabel lblMasDeQuince = new JLabel("M\u00E1s de 15 metros");
			lblMasDeQuince.setBounds(10, 120, 105, 14);
			contentPanel.add(lblMasDeQuince);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(335, 11, 89, 23);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(335, 45, 89, 23);
			contentPanel.add(btnCancelar);
		}
		{
			txtPorcentaje1 = new JTextField();
			txtPorcentaje1.setBounds(125, 15, 86, 20);
			contentPanel.add(txtPorcentaje1);
			txtPorcentaje1.setColumns(10);
		}
		{
			txtPorcentaje2 = new JTextField();
			txtPorcentaje2.setColumns(10);
			txtPorcentaje2.setBounds(125, 50, 86, 20);
			contentPanel.add(txtPorcentaje2);
		}
		{
			txtPorcentaje3 = new JTextField();
			txtPorcentaje3.setColumns(10);
			txtPorcentaje3.setBounds(125, 85, 86, 20);
			contentPanel.add(txtPorcentaje3);
		}
		{
			txtPorcentaje4 = new JTextField();
			txtPorcentaje4.setColumns(10);
			txtPorcentaje4.setBounds(125, 120, 86, 20);
			contentPanel.add(txtPorcentaje4);
		}
		{
			lblSimboloUno = new JLabel("%");
			lblSimboloUno.setBounds(214, 15, 46, 14);
			contentPanel.add(lblSimboloUno);
		}
		{
			lblSimboloDos = new JLabel("%");
			lblSimboloDos.setBounds(214, 50, 46, 14);
			contentPanel.add(lblSimboloDos);
		}
		{
			lblSimboloTres = new JLabel("%");
			lblSimboloTres.setBounds(214, 85, 46, 14);
			contentPanel.add(lblSimboloTres);
		}
		{
			lblSimboloCuatro = new JLabel("%");
			lblSimboloCuatro.setBounds(214, 120, 46, 14);
			contentPanel.add(lblSimboloCuatro);
		}
		
		txtPorcentaje1.setText(MenuPrincipal1.porcentaje1+"");
		txtPorcentaje2.setText(MenuPrincipal1.porcentaje2+"");
		txtPorcentaje3.setText(MenuPrincipal1.porcentaje3+"");
		txtPorcentaje4.setText(MenuPrincipal1.porcentaje4+"");
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
		
		MenuPrincipal1.porcentaje1=Double.parseDouble(txtPorcentaje1.getText());
		MenuPrincipal1.porcentaje2=Double.parseDouble(txtPorcentaje2.getText());
		MenuPrincipal1.porcentaje3=Double.parseDouble(txtPorcentaje3.getText());
		MenuPrincipal1.porcentaje4=Double.parseDouble(txtPorcentaje4.getText());
		
		
	}
}
