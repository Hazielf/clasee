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

public class Vender5 extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtdescri;
	private JTextField txtcantmetros;
	private JButton btncerrar;
	private JTextField txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Vender5 dialog = new Vender5();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Vender5() {
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
			JButton btnvender = new JButton("Vender");
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
				scpScroll.setViewportView(txtS);
				txtS.setColumns(10);
			}
		}
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
