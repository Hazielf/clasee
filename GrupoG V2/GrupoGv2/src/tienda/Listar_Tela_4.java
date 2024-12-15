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

public class Listar_Tela_4 extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JButton btncerrar;
	private JButton btnlistar;
	private JScrollPane scpScroll;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Listar_Tela_4 dialog = new Listar_Tela_4();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Listar_Tela_4() {
		setTitle("Listar telas");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		btncerrar = new JButton("Cerrar");
		btncerrar.addActionListener(this);
		btncerrar.setBounds(114, 227, 89, 23);
		contentPanel.add(btncerrar);
		
		btnlistar = new JButton("Listar");
		btnlistar.addActionListener(this);
		btnlistar.setBounds(219, 227, 89, 23);
		contentPanel.add(btnlistar);
		
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
		if (e.getSource() == btncerrar) {
			actionPerformedBtncerrar(e);
		}
		if (e.getSource() == btnlistar) {
			actionPerformedBtnlistar(e);
		}
	}
	protected void actionPerformedBtnlistar(ActionEvent e) {
		
		txtS.setText("LISTADO DE TELAS\n\n");
		
		txtS.append(String.format("Codigo \t: %s\n", Menu_Principal_1.codigo0));
		txtS.append(String.format("Descripcion \t: %s\n", Menu_Principal_1.descripcion0));
		txtS.append(String.format("Material \t: %s\n", Menu_Principal_1.material0));
		txtS.append(String.format("Ancho \t: %s cm\n", Menu_Principal_1.ancho0));
		txtS.append(String.format("Peso \t: %s g/m²\n", Menu_Principal_1.peso0));
		txtS.append(String.format("Precio \t: S/ %s.\n\n", Menu_Principal_1.precio0));
		
		txtS.append(String.format("Codigo \t: %s\n", Menu_Principal_1.codigo1));
		txtS.append(String.format("Descripcion \t: %s\n", Menu_Principal_1.descripcion1));
		txtS.append(String.format("Material \t: %s\n", Menu_Principal_1.material1));
		txtS.append(String.format("Ancho \t: %s cm\n", Menu_Principal_1.ancho1));
		txtS.append(String.format("Peso \t: %s g/m²\n", Menu_Principal_1.peso1));
		txtS.append(String.format("Precio \t: S/ %s.\n\n", Menu_Principal_1.precio1));

		txtS.append(String.format("Codigo \t: %s\n", Menu_Principal_1.codigo2));
		txtS.append(String.format("Descripcion \t: %s\n", Menu_Principal_1.descripcion2));
		txtS.append(String.format("Material \t: %s\n", Menu_Principal_1.material2));
		txtS.append(String.format("Ancho \t: %s cm\n", Menu_Principal_1.ancho2));
		txtS.append(String.format("Peso \t: %s g/m²\n", Menu_Principal_1.peso2));
		txtS.append(String.format("Precio \t: S/ %s.\n\n", Menu_Principal_1.precio2));
		
		txtS.append(String.format("Codigo \t: %s\n", Menu_Principal_1.codigo3));
		txtS.append(String.format("Descripcion \t: %s\n", Menu_Principal_1.descripcion3));
		txtS.append(String.format("Material \t: %s\n", Menu_Principal_1.material3));
		txtS.append(String.format("Ancho \t: %s cm\n", Menu_Principal_1.ancho3));
		txtS.append(String.format("Peso \t: %s g/m²\n", Menu_Principal_1.peso3));
		txtS.append(String.format("Precio \t: S/ %s.\n\n", Menu_Principal_1.precio3));
		
		txtS.append(String.format("Codigo \t: %s\n", Menu_Principal_1.codigo4));
		txtS.append(String.format("Descripcion \t: %s\n", Menu_Principal_1.descripcion4));
		txtS.append(String.format("Material \t: %s\n", Menu_Principal_1.material4));
		txtS.append(String.format("Ancho \t: %s cm\n", Menu_Principal_1.ancho4));
		txtS.append(String.format("Peso \t: %s g/m²\n", Menu_Principal_1.peso4));
		txtS.append(String.format("Precio \t: S/ %s.", Menu_Principal_1.precio4));
	}
	protected void actionPerformedBtncerrar(ActionEvent e) {
		dispose();
	}
}
