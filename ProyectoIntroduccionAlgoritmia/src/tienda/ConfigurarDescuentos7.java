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

public class ConfigurarDescuentos7 extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JButton btncancelar;
	private JTextField txtporcentaje1;
	private JTextField txtporcentaje2;
	private JTextField txtporcentaje3;
	private JTextField txtporcentaje4;
	private JLabel lblsimbolun;
	private JLabel lblsimboldo;
	private JLabel lblsimboltre;
	private JLabel lblsimbolcua;
	private JButton btnaceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConfigurarDescuentos7 dialog = new ConfigurarDescuentos7();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConfigurarDescuentos7() {
		setTitle("Configurar porcentajes de descuento");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblunocinco = new JLabel("1 a 5 metros");
			lblunocinco.setBounds(10, 15, 94, 14);
			contentPanel.add(lblunocinco);
		}
		{
			JLabel lblseisdiez = new JLabel("6 a 10 metros");
			lblseisdiez.setBounds(10, 50, 94, 14);
			contentPanel.add(lblseisdiez);
		}
		{
			JLabel lbloncequince = new JLabel("11 a 15 metros");
			lbloncequince.setBounds(10, 85, 94, 14);
			contentPanel.add(lbloncequince);
		}
		{
			JLabel lblmorequince = new JLabel("M\u00E1s de 15 metros");
			lblmorequince.setBounds(10, 120, 105, 14);
			contentPanel.add(lblmorequince);
		}
		{
			btnaceptar = new JButton("Aceptar");
			btnaceptar.addActionListener(this);
			btnaceptar.setBounds(335, 11, 89, 23);
			contentPanel.add(btnaceptar);
		}
		{
			btncancelar = new JButton("Cancelar");
			btncancelar.addActionListener(this);
			btncancelar.setBounds(335, 45, 89, 23);
			contentPanel.add(btncancelar);
		}
		{
			txtporcentaje1 = new JTextField();
			txtporcentaje1.setBounds(125, 15, 86, 20);
			contentPanel.add(txtporcentaje1);
			txtporcentaje1.setColumns(10);
		}
		{
			txtporcentaje2 = new JTextField();
			txtporcentaje2.setColumns(10);
			txtporcentaje2.setBounds(125, 50, 86, 20);
			contentPanel.add(txtporcentaje2);
		}
		{
			txtporcentaje3 = new JTextField();
			txtporcentaje3.setColumns(10);
			txtporcentaje3.setBounds(125, 85, 86, 20);
			contentPanel.add(txtporcentaje3);
		}
		{
			txtporcentaje4 = new JTextField();
			txtporcentaje4.setColumns(10);
			txtporcentaje4.setBounds(125, 120, 86, 20);
			contentPanel.add(txtporcentaje4);
		}
		{
			lblsimbolun = new JLabel("%");
			lblsimbolun.setBounds(214, 15, 46, 14);
			contentPanel.add(lblsimbolun);
		}
		{
			lblsimboldo = new JLabel("%");
			lblsimboldo.setBounds(214, 50, 46, 14);
			contentPanel.add(lblsimboldo);
		}
		{
			lblsimboltre = new JLabel("%");
			lblsimboltre.setBounds(214, 85, 46, 14);
			contentPanel.add(lblsimboltre);
		}
		{
			lblsimbolcua = new JLabel("%");
			lblsimbolcua.setBounds(214, 120, 46, 14);
			contentPanel.add(lblsimbolcua);
		}
		
		txtporcentaje1.setText(Main1.porcentaje1+"");
		txtporcentaje2.setText(Main1.porcentaje2+"");
		txtporcentaje3.setText(Main1.porcentaje3+"");
		txtporcentaje4.setText(Main1.porcentaje4+"");
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
		
		Main1.porcentaje1=Double.parseDouble(txtporcentaje1.getText());
		Main1.porcentaje2=Double.parseDouble(txtporcentaje2.getText());
		Main1.porcentaje3=Double.parseDouble(txtporcentaje3.getText());
		Main1.porcentaje4=Double.parseDouble(txtporcentaje4.getText());
		
		
	}
}
