package tienda;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Color;

public class ListarTela4 extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JButton btnCerrar;
	private JButton btnListar;
	private JScrollPane scpScroll;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ListarTela4 dialog = new ListarTela4();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ListarTela4() {
		setTitle("Listar telas");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(114, 227, 89, 23);
		contentPanel.add(btnCerrar);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(219, 227, 89, 23);
		contentPanel.add(btnListar);
		
		scpScroll = new JScrollPane();
		scpScroll.setBounds(10, 11, 414, 199);
		contentPanel.add(scpScroll);
		
		txtS = new JTextArea();
		txtS.setEditable(false);
		txtS.setForeground(new Color(0, 0, 0));
		txtS.setBackground(new Color(255, 255, 255));
		scpScroll.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtncerrar(e);
		}
		if (e.getSource() == btnListar) {
			actionPerformedBtnlistar(e);
		}
	}
	protected void actionPerformedBtnlistar(ActionEvent e) {
		
		txtS.setText("LISTADO DE TELAS\n\n");
		
		txtS.append(String.format("Codigo \t: %s\n", MenuPrincipal1.codigo0));
		txtS.append(String.format("Descripcion \t: %s\n", MenuPrincipal1.descripcion0));
		txtS.append(String.format("Material \t: %s\n", MenuPrincipal1.material0));
		txtS.append(String.format("Ancho \t: %s cm\n", MenuPrincipal1.ancho0));
		txtS.append(String.format("Peso \t: %s g/m²\n", MenuPrincipal1.peso0));
		txtS.append(String.format("Precio \t: S/ %s.\n\n", MenuPrincipal1.precio0));
		
		txtS.append(String.format("Codigo \t: %s\n", MenuPrincipal1.codigo1));
		txtS.append(String.format("Descripcion \t: %s\n", MenuPrincipal1.descripcion1));
		txtS.append(String.format("Material \t: %s\n", MenuPrincipal1.material1));
		txtS.append(String.format("Ancho \t: %s cm\n", MenuPrincipal1.ancho1));
		txtS.append(String.format("Peso \t: %s g/m²\n", MenuPrincipal1.peso1));
		txtS.append(String.format("Precio \t: S/ %s.\n\n", MenuPrincipal1.precio1));

		txtS.append(String.format("Codigo \t: %s\n", MenuPrincipal1.codigo2));
		txtS.append(String.format("Descripcion \t: %s\n", MenuPrincipal1.descripcion2));
		txtS.append(String.format("Material \t: %s\n", MenuPrincipal1.material2));
		txtS.append(String.format("Ancho \t: %s cm\n", MenuPrincipal1.ancho2));
		txtS.append(String.format("Peso \t: %s g/m²\n", MenuPrincipal1.peso2));
		txtS.append(String.format("Precio \t: S/ %s.\n\n", MenuPrincipal1.precio2));
		
		txtS.append(String.format("Codigo \t: %s\n", MenuPrincipal1.codigo3));
		txtS.append(String.format("Descripcion \t: %s\n", MenuPrincipal1.descripcion3));
		txtS.append(String.format("Material \t: %s\n", MenuPrincipal1.material3));
		txtS.append(String.format("Ancho \t: %s cm\n", MenuPrincipal1.ancho3));
		txtS.append(String.format("Peso \t: %s g/m²\n", MenuPrincipal1.peso3));
		txtS.append(String.format("Precio \t: S/ %s.\n\n", MenuPrincipal1.precio3));
		
		txtS.append(String.format("Codigo \t: %s\n", MenuPrincipal1.codigo4));
		txtS.append(String.format("Descripcion \t: %s\n", MenuPrincipal1.descripcion4));
		txtS.append(String.format("Material \t: %s\n", MenuPrincipal1.material4));
		txtS.append(String.format("Ancho \t: %s cm\n", MenuPrincipal1.ancho4));
		txtS.append(String.format("Peso \t: %s g/m²\n", MenuPrincipal1.peso4));
		txtS.append(String.format("Precio \t: S/ %s.", MenuPrincipal1.precio4));
	}
	protected void actionPerformedBtncerrar(ActionEvent e) {
		dispose();
	}
}
