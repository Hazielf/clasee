package tienda;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;

public class Vender_5 extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtdescri;
	private JTextField txtcantmetros;
	private JButton btncerrar;
	private JTextField txtS;
	
	
	 	// Datos mínimos de la primera tela
		public static String codigo0 = "TF0";
		public static String descripcion0 = "Pinstripe Suit 1";
		public static String material0 = "98%Algodón, 2%Elastán";
		public static double ancho0 = 160.0;
		public static double peso0 = 220.0;
		public static double precio0 = 9.4;
		// Datos mínimos de la segunda tela
		public static String codigo1 = "TF1";
		public static String descripcion1 = "Gabardina Oslo 5";
		public static String material1 = "60%Algodón, 37%Poliéster";
		public static double ancho1 = 145.0;
		public static double peso1 = 300.0;
		public static double precio1 = 11.3;
		// Datos mínimos de la tercera tela
		public static String codigo2 = "TF2";
		public static String descripcion2 = "Sarga 2";
		public static String material2 = "50%Poliéster, 50%Poliacril";
		public static double ancho2 = 145.0;
		public static double peso2 = 425.0;
		public static double precio2 = 31.8;
		// Datos mínimos de la cuarta tela
		public static String codigo3 = "TF3";
		public static String descripcion3 = "Leni 1";
		public static String material3 = "50%Poliéster, 50%Poliacril";
		public static double ancho3 = 145.0;
		public static double peso3 = 410.0;
		public static double precio3 = 37.2;
		// Datos mínimos de la quinta tela
		public static String codigo4 = "TF4";
		public static String descripcion4 = "Laurent 3";
		public static String material4 = "100%Poliamida";
		public static double ancho4 = 150.0;
		public static double peso4 = 140.0;
		public static double precio4 = 18.8;
		
		
		// Porcentajes de descuento
		public static double porcentaje1 = 4.0;
		public static double porcentaje2 = 5.5;
		public static double porcentaje3 = 7.0;
		public static double porcentaje4 = 8.5;
		
		// Obsequio
		public static String obsequio = "USB";
		
		// Premio sorpresa
		public static String premioSorpresa = "Una agenda";
		private JLabel lblimage;
		private JButton btnvender;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Vender_5 dialog = new Vender_5();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Vender_5() {
		setTitle("Vender");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblcode = new JLabel("C\u00F3digo");
			lblcode.setBounds(10, 26, 110, 14);
			contentPanel.add(lblcode);
		}
		{
			JLabel lbldescri = new JLabel("Descripci\u00F3n");
			lbldescri.setBounds(10, 58, 110, 14);
			contentPanel.add(lbldescri);
		}
		{
			JLabel lblcantmetros = new JLabel("Cantidad de metros");
			lblcantmetros.setBounds(10, 89, 122, 14);
			contentPanel.add(lblcantmetros);
		}
		{
			JComboBox cbocode = new JComboBox();
			cbocode.setModel(new DefaultComboBoxModel(new String[] {"TF0", "TF1", "TF2", "TF3", "TF4"}));
			cbocode.setMaximumRowCount(5);
			cbocode.setBounds(148, 22, 136, 22);
			contentPanel.add(cbocode);
		}
		{
			txtdescri = new JTextField();
			txtdescri.setText("Pinstripe Suit 1");
			txtdescri.setEditable(false);
			txtdescri.setColumns(10);
			txtdescri.setBounds(148, 55, 136, 20);
			contentPanel.add(txtdescri);
		}
		{
			txtcantmetros = new JTextField();
			txtcantmetros.setColumns(10);
			txtcantmetros.setBounds(148, 86, 136, 20);
			contentPanel.add(txtcantmetros);
		}
		{
			btnvender = new JButton("Vender");
			btnvender.addActionListener(this);
			btnvender.setBounds(335, 22, 89, 23);
			contentPanel.add(btnvender);
		}
		{
			btncerrar = new JButton("Cerrar");
			btncerrar.addActionListener(this);
			btncerrar.setBounds(335, 58, 89, 23);
			contentPanel.add(btncerrar);
		}
		{
			JScrollPane scpScroll = new JScrollPane();
			scpScroll.setBounds(10, 127, 414, 123);
			contentPanel.add(scpScroll);
			{
				txtS = new JTextField();
				txtS.setEditable(false);
				scpScroll.setViewportView(txtS);
				txtS.setColumns(10);
			}
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnvender) {
			actionPerformedBtnvender(e);
		}
		if (e.getSource() == btncerrar) {
			actionPerformedBtncerrar(e);
		}
	}
	protected void actionPerformedBtncerrar(ActionEvent e) {
		dispose();
	}
	protected void actionPerformedBtnvender(ActionEvent e) {
	}
}
