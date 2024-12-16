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
	private JLabel lblCodigo;
	private JLabel lblDescripcion;
	private JLabel lblMaterial;
	private JLabel lblAncho;
	private JLabel lblPeso;
	private JLabel lblPrecio;
	private JComboBox cboCodigo;
	private JTextField txtDescripcion;
	private JTextField txtMaterial;
	private JTextField txtAncho;
	private JTextField txtPeso;
	private JTextField txtPrecio;
	private JButton btnCerrar;
	private JButton btnGrabar;

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
		
		lblCodigo = new JLabel("C\u00F3digo");
		lblCodigo.setBounds(10, 25, 85, 14);
		contentPanel.add(lblCodigo);
		
		lblDescripcion = new JLabel("Descripci\u00F3n");
		lblDescripcion.setBounds(10, 64, 85, 14);
		contentPanel.add(lblDescripcion);
		
		lblMaterial = new JLabel("Material");
		lblMaterial.setBounds(10, 103, 85, 14);
		contentPanel.add(lblMaterial);
		
		lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setBounds(10, 142, 85, 14);
		contentPanel.add(lblAncho);
		
		lblPeso = new JLabel("Peso (g/m\u00B2)");
		lblPeso.setBounds(10, 181, 85, 14);
		contentPanel.add(lblPeso);
		
		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(10, 220, 85, 14);
		contentPanel.add(lblPrecio);
		
		cboCodigo = new JComboBox();
		cboCodigo.addActionListener(this);
		cboCodigo.setModel(new DefaultComboBoxModel(new String[] {"TF0", "TF1", "TF2", "TF3", "TF4"}));
		cboCodigo.setMaximumRowCount(5);
		cboCodigo.setBounds(105, 19, 168, 22);
		contentPanel.add(cboCodigo);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setBounds(105, 60, 168, 20);
		contentPanel.add(txtDescripcion);
		txtDescripcion.setColumns(10);
		
		txtMaterial = new JTextField();
		txtMaterial.setColumns(10);
		txtMaterial.setBounds(105, 101, 168, 20);
		contentPanel.add(txtMaterial);
		
		txtAncho = new JTextField();
		txtAncho.setColumns(10);
		txtAncho.setBounds(105, 138, 168, 20);
		contentPanel.add(txtAncho);
		
		txtPeso = new JTextField();
		txtPeso.setColumns(10);
		txtPeso.setBounds(105, 179, 168, 20);
		contentPanel.add(txtPeso);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(105, 218, 168, 20);
		contentPanel.add(txtPrecio);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(307, 17, 117, 22);
		contentPanel.add(btnCerrar);
		
		btnGrabar = new JButton("Grabar");
		btnGrabar.addActionListener(this);
		btnGrabar.setBounds(307, 60, 117, 22);
		contentPanel.add(btnGrabar);
		
		
		
		txtDescripcion.setText(MenuPrincipal1.descripcion0);
		txtMaterial.setText(MenuPrincipal1.material0);
		txtPrecio.setText(MenuPrincipal1.precio0+"");
		txtPeso.setText(MenuPrincipal1.peso0+"");
		txtAncho.setText(MenuPrincipal1.ancho0+"");
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnGrabar) {
			actionPerformedBtngrabar(e);
		}
		if (e.getSource() == cboCodigo) {
			actionPerformedCbocode(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtncerrar(e);
		}
	}
	protected void actionPerformedBtncerrar(ActionEvent e) {
		dispose();
	}
	protected void actionPerformedCbocode(ActionEvent e) {
		
		int code=cboCodigo.getSelectedIndex();
		switch (code) {
		case 0:		txtDescripcion.setText(MenuPrincipal1.descripcion0);
					txtMaterial.setText(MenuPrincipal1.material0);
					txtPrecio.setText(MenuPrincipal1.precio0+"");
					txtPeso.setText(MenuPrincipal1.peso0+"");
					txtAncho.setText(MenuPrincipal1.ancho0+"");
			break;
		
		case 1:		txtDescripcion.setText(MenuPrincipal1.descripcion1);
					txtMaterial.setText(MenuPrincipal1.material1);
					txtPrecio.setText(MenuPrincipal1.precio1+"");
					txtPeso.setText(MenuPrincipal1.peso1+"");
					txtAncho.setText(MenuPrincipal1.ancho1+"");
			
			break;
		
		case 2:		txtDescripcion.setText(MenuPrincipal1.descripcion2);
					txtMaterial.setText(MenuPrincipal1.material2);
					txtPrecio.setText(MenuPrincipal1.precio2+"");
					txtPeso.setText(MenuPrincipal1.peso2+"");
					txtAncho.setText(MenuPrincipal1.ancho2+"");

			break;
			
		case 3:		txtDescripcion.setText(MenuPrincipal1.descripcion3);
					txtMaterial.setText(MenuPrincipal1.material3);
					txtPrecio.setText(MenuPrincipal1.precio3+"");
					txtPeso.setText(MenuPrincipal1.peso3+"");
					txtAncho.setText(MenuPrincipal1.ancho3+"");
			break;
			
		default:	txtDescripcion.setText(MenuPrincipal1.descripcion4);
					txtMaterial.setText(MenuPrincipal1.material4);
					txtPrecio.setText(MenuPrincipal1.precio4+"");
					txtPeso.setText(MenuPrincipal1.peso4+"");
					txtAncho.setText(MenuPrincipal1.ancho4+"");
			break;
		}
	}
	protected void actionPerformedBtngrabar(ActionEvent e) {
		
		int code=cboCodigo.getSelectedIndex();
		
		switch (code) {
		
		case 0:
			MenuPrincipal1.descripcion0=txtDescripcion.getText();
			MenuPrincipal1.material0=txtMaterial.getText();
			MenuPrincipal1.precio0=Double.parseDouble(txtPrecio.getText());
			MenuPrincipal1.peso0=Double.parseDouble(txtPeso.getText());
			MenuPrincipal1.ancho0=Double.parseDouble(txtAncho.getText());
			
			break;

			
		case 1:
			MenuPrincipal1.descripcion1=txtDescripcion.getText();
			MenuPrincipal1.material1=txtMaterial.getText();
			MenuPrincipal1.precio1=Double.parseDouble(txtPrecio.getText());
			MenuPrincipal1.peso1=Double.parseDouble(txtPeso.getText());
			MenuPrincipal1.ancho1=Double.parseDouble(txtAncho.getText());
			
			break;

			
		case 2:
			MenuPrincipal1.descripcion2=txtDescripcion.getText();
			MenuPrincipal1.material2=txtMaterial.getText();
			MenuPrincipal1.precio2=Double.parseDouble(txtPrecio.getText());
			MenuPrincipal1.peso2=Double.parseDouble(txtPeso.getText());
			MenuPrincipal1.ancho2=Double.parseDouble(txtAncho.getText());
			
			break;
			
		case 3:
			
			MenuPrincipal1.descripcion3=txtDescripcion.getText();
			MenuPrincipal1.material3=txtMaterial.getText();
			MenuPrincipal1.precio3=Double.parseDouble(txtPrecio.getText());
			MenuPrincipal1.peso3=Double.parseDouble(txtPeso.getText());
			MenuPrincipal1.ancho3=Double.parseDouble(txtAncho.getText());
			
			break;
			
		default:
			MenuPrincipal1.descripcion4=txtDescripcion.getText();
			MenuPrincipal1.material4=txtMaterial.getText();
			MenuPrincipal1.precio4=Double.parseDouble(txtPrecio.getText());
			MenuPrincipal1.peso4=Double.parseDouble(txtPeso.getText());
			MenuPrincipal1.ancho4=Double.parseDouble(txtAncho.getText());
			
			break;
		}
	}
}
