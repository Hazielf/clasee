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

public class ConsultarTela2 extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblCodigo;
	private JLabel lblDescripcion;
	private JLabel lblMaterial;
	private JLabel lblAncho;
	private JLabel lblPeso;
	private JLabel lblprecio;
	private JComboBox cboCodigo;
	private JTextField txtDescripcion;
	private JTextField txtMaterial;
	private JTextField txtAncho;
	private JTextField txtPeso;
	private JTextField txtPrecio;
	private JButton btncerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConsultarTela2 dialog = new ConsultarTela2();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConsultarTela2() {
		setTitle("Consultar tela");
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
		
		lblprecio = new JLabel("Precio (S/)");
		lblprecio.setBounds(10, 220, 85, 14);
		contentPanel.add(lblprecio);
		
		cboCodigo = new JComboBox();
		cboCodigo.addActionListener(this);
		cboCodigo.setModel(new DefaultComboBoxModel(new String[] {"TF0", "TF1", "TF2", "TF3", "TF4"}));
		cboCodigo.setMaximumRowCount(5);
		cboCodigo.setBounds(105, 19, 168, 22);
		contentPanel.add(cboCodigo);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setEditable(false);
		txtDescripcion.setBounds(105, 60, 168, 20);
		contentPanel.add(txtDescripcion);
		txtDescripcion.setColumns(10);
		
		txtMaterial = new JTextField();
		txtMaterial.setEditable(false);
		txtMaterial.setColumns(10);
		txtMaterial.setBounds(105, 101, 168, 20);
		contentPanel.add(txtMaterial);
		
		txtAncho = new JTextField();
		txtAncho.setEditable(false);
		txtAncho.setColumns(10);
		txtAncho.setBounds(105, 138, 168, 20);
		contentPanel.add(txtAncho);
		
		txtPeso = new JTextField();
		txtPeso.setEditable(false);
		txtPeso.setColumns(10);
		txtPeso.setBounds(105, 179, 168, 20);
		contentPanel.add(txtPeso);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(105, 216, 168, 20);
		contentPanel.add(txtPrecio);
		
		btncerrar = new JButton("Cerrar");
		btncerrar.addActionListener(this);
		btncerrar.setBounds(307, 17, 117, 22);
		contentPanel.add(btncerrar);
		
		
		txtDescripcion.setText(MenuPrincipal1.descripcion0);
		txtMaterial.setText(MenuPrincipal1.material0);
		txtPrecio.setText(MenuPrincipal1.precio0+"");
		txtPeso.setText(MenuPrincipal1.peso0+"");
		txtAncho.setText(MenuPrincipal1.ancho0+"");
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboCodigo) {
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
			
		case 3:	txtDescripcion.setText(MenuPrincipal1.descripcion3);
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
}
