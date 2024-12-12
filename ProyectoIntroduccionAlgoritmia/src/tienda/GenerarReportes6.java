package tienda;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GenerarReportes6 extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JScrollPane scpScroll;
	private JTextArea txtS;
	private JButton btncerrar;
	private JLabel lblreporttype;
	private JComboBox cboreporttype;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GenerarReportes6 dialog = new GenerarReportes6();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GenerarReportes6() {
		setTitle("Generar reportes");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		scpScroll = new JScrollPane();
		scpScroll.setBounds(10, 49, 414, 201);
		contentPanel.add(scpScroll);
		
		txtS = new JTextArea();
		scpScroll.setViewportView(txtS);
		
		btncerrar = new JButton("Cerrar");
		btncerrar.addActionListener(this);
		btncerrar.setBounds(335, 15, 89, 23);
		contentPanel.add(btncerrar);
		
		lblreporttype = new JLabel("Tipo de reporte");
		lblreporttype.setBounds(10, 19, 89, 14);
		contentPanel.add(lblreporttype);
		
		cboreporttype = new JComboBox();
		cboreporttype.setModel(new DefaultComboBoxModel(new String[] {"Ventas por tela", "Telas con venta \u00F3ptima", "Telas con precios menores al 75% del precio m\u00E1ximo", "Telas con precios mayores al 75% del precio m\u00E1ximo", "Precios menor, mayor y promedio"}));
		cboreporttype.setBounds(109, 15, 216, 22);
		contentPanel.add(cboreporttype);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btncerrar) {
			actionPerformedBtncerrar(e);
		}
	}
	protected void actionPerformedBtncerrar(ActionEvent e) {
		dispose();
	}
}
