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
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModificarTela3 extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblcode;
	private JLabel lbldescri;
	private JLabel lblmaterial;
	private JLabel lblwidth;
	private JLabel lblweight;
	private JLabel lblprize;
	private JComboBox cbocode;
	private JTextField txtdescri;
	private JTextField txtmaterial;
	private JTextField txtwidth;
	private JTextField txtweight;
	private JTextField txtprize;
	private JButton btncerrar;
	private JButton btngrabar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ModificarTela3 dialog = new ModificarTela3();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ModificarTela3() {
		setTitle("Modificar tela");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblcode = new JLabel("C\u00F3digo");
		lblcode.setBounds(10, 25, 85, 14);
		contentPanel.add(lblcode);
		
		lbldescri = new JLabel("Descripci\u00F3n");
		lbldescri.setBounds(10, 64, 85, 14);
		contentPanel.add(lbldescri);
		
		lblmaterial = new JLabel("Material");
		lblmaterial.setBounds(10, 103, 85, 14);
		contentPanel.add(lblmaterial);
		
		lblwidth = new JLabel("Ancho (cm)");
		lblwidth.setBounds(10, 142, 85, 14);
		contentPanel.add(lblwidth);
		
		lblweight = new JLabel("Peso (g/m\u00B2)");
		lblweight.setBounds(10, 181, 85, 14);
		contentPanel.add(lblweight);
		
		lblprize = new JLabel("Precio (S/)");
		lblprize.setBounds(10, 220, 85, 14);
		contentPanel.add(lblprize);
		
		cbocode = new JComboBox();
		cbocode.addActionListener(this);
		cbocode.setModel(new DefaultComboBoxModel(new String[] {"TF0", "TF1", "TF2", "TF3", "TF4"}));
		cbocode.setMaximumRowCount(5);
		cbocode.setBounds(105, 19, 168, 22);
		contentPanel.add(cbocode);
		
		txtdescri = new JTextField();
		txtdescri.setBounds(105, 60, 168, 20);
		contentPanel.add(txtdescri);
		txtdescri.setColumns(10);
		
		txtmaterial = new JTextField();
		txtmaterial.setColumns(10);
		txtmaterial.setBounds(105, 177, 168, 20);
		contentPanel.add(txtmaterial);
		
		txtwidth = new JTextField();
		txtwidth.setColumns(10);
		txtwidth.setBounds(105, 138, 168, 20);
		contentPanel.add(txtwidth);
		
		txtweight = new JTextField();
		txtweight.setColumns(10);
		txtweight.setBounds(105, 99, 168, 20);
		contentPanel.add(txtweight);
		
		txtprize = new JTextField();
		txtprize.setColumns(10);
		txtprize.setBounds(105, 216, 168, 20);
		contentPanel.add(txtprize);
		
		btncerrar = new JButton("Cerrar");
		btncerrar.addActionListener(this);
		btncerrar.setBounds(307, 17, 117, 22);
		contentPanel.add(btncerrar);
		
		btngrabar = new JButton("Grabar");
		btngrabar.addActionListener(this);
		btngrabar.setBounds(307, 60, 117, 22);
		contentPanel.add(btngrabar);
		
		
		
		txtdescri.setText(Main1.descripcion0);
		txtmaterial.setText(Main1.material0);
		txtprize.setText(Main1.precio0+"");
		txtweight.setText(Main1.peso0+"");
		txtwidth.setText(Main1.ancho0+"");
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btngrabar) {
			actionPerformedBtngrabar(e);
		}
		if (e.getSource() == cbocode) {
			actionPerformedCbocode(e);
		}
		if (e.getSource() == btncerrar) {
			actionPerformedBtncerrar(e);
		}
	}
	protected void actionPerformedBtncerrar(ActionEvent e) {
		dispose();
	}
	protected void actionPerformedCbocode(ActionEvent e) {
		
		int code=cbocode.getSelectedIndex();
		switch (code) {
		case 0:		txtdescri.setText(Main1.descripcion0);
					txtmaterial.setText(Main1.material0);
					txtprize.setText(Main1.precio0+"");
					txtweight.setText(Main1.peso0+"");
					txtwidth.setText(Main1.ancho0+"");
			break;
		
		case 1:		txtdescri.setText(Main1.descripcion1);
					txtmaterial.setText(Main1.material1);
					txtprize.setText(Main1.precio1+"");
					txtweight.setText(Main1.peso1+"");
					txtwidth.setText(Main1.ancho1+"");
			
			break;
		
		case 2:		txtdescri.setText(Main1.descripcion2);
					txtmaterial.setText(Main1.material2);
					txtprize.setText(Main1.precio2+"");
					txtweight.setText(Main1.peso2+"");
					txtwidth.setText(Main1.ancho2+"");

			break;
			
		default:	txtdescri.setText(Main1.descripcion3);
					txtmaterial.setText(Main1.material3);
					txtprize.setText(Main1.precio3+"");
					txtweight.setText(Main1.peso3+"");
					txtwidth.setText(Main1.ancho3+"");
			break;
		}
	}
	protected void actionPerformedBtngrabar(ActionEvent e) {
		
		int code=cbocode.getSelectedIndex();
		
		switch (code) {
		
		case 0:
			Main1.descripcion0=txtdescri.getText();
			Main1.material0=txtmaterial.getText();
			Main1.precio0=Double.parseDouble(txtprize.getText());
			Main1.peso0=Double.parseDouble(txtweight.getText());
			Main1.ancho0=Double.parseDouble(txtwidth.getText());
			
			break;

			
		case 1:
			Main1.descripcion1=txtdescri.getText();
			Main1.material1=txtmaterial.getText();
			Main1.precio1=Double.parseDouble(txtprize.getText());
			Main1.peso1=Double.parseDouble(txtweight.getText());
			Main1.ancho1=Double.parseDouble(txtwidth.getText());
			
			break;

			
		case 2:
			Main1.descripcion2=txtdescri.getText();
			Main1.material2=txtmaterial.getText();
			Main1.precio2=Double.parseDouble(txtprize.getText());
			Main1.peso2=Double.parseDouble(txtweight.getText());
			Main1.ancho2=Double.parseDouble(txtwidth.getText());
			
			break;
			
		default:
			Main1.descripcion3=txtdescri.getText();
			Main1.material3=txtmaterial.getText();
			Main1.precio3=Double.parseDouble(txtprize.getText());
			Main1.peso3=Double.parseDouble(txtweight.getText());
			Main1.ancho3=Double.parseDouble(txtwidth.getText());
			
			break;
		}
	}
}
