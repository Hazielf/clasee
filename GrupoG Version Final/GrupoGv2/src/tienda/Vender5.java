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
import javax.swing.JTextArea;

public class Vender5 extends JDialog implements ActionListener {

    private final JPanel contentPanel = new JPanel();
    private JTextField txtDescripcion;
    private JTextField txtCantidadMetros;
    private JButton btnCerrar;
    private JComboBox cboCodigo;


    private JButton btnVender;
    private JTextArea txtS;
    private String codigoSeleccionado = "TF0";  // Inicializar con valor predeterminado
    private int codigo;

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
        setBounds(100, 100, 450, 350);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);
        {
            JLabel lblCodigo = new JLabel("C\u00F3digo");
            lblCodigo.setBounds(10, 26, 110, 14);
            contentPanel.add(lblCodigo);
        }
        {
            JLabel lblDescripcion = new JLabel("Descripci\u00F3n");
            lblDescripcion.setBounds(10, 58, 110, 14);
            contentPanel.add(lblDescripcion);
        }
        {
            JLabel lblCantidadMetros = new JLabel("Cantidad de metros");
            lblCantidadMetros.setBounds(10, 89, 122, 14);
            contentPanel.add(lblCantidadMetros);
        }
        {
            cboCodigo = new JComboBox();
            cboCodigo.addActionListener(this);
            cboCodigo.setModel(new DefaultComboBoxModel(new String[] {"TF0", "TF1", "TF2", "TF3", "TF4"}));
            cboCodigo.setMaximumRowCount(5);
            cboCodigo.setBounds(148, 22, 136, 22);
            contentPanel.add(cboCodigo);
        }
        {
            txtDescripcion = new JTextField();
            txtDescripcion.setText("Pinstripe Suit 1");
            txtDescripcion.setEditable(false);
            txtDescripcion.setColumns(10);
            txtDescripcion.setBounds(148, 55, 136, 20);
            contentPanel.add(txtDescripcion);
        }
        {
            txtCantidadMetros = new JTextField();
            txtCantidadMetros.setColumns(10);
            txtCantidadMetros.setBounds(148, 86, 136, 20);
            contentPanel.add(txtCantidadMetros);
        }
        {
            btnVender = new JButton("Vender");
            btnVender.addActionListener(this);
            btnVender.setBounds(335, 22, 89, 23);
            contentPanel.add(btnVender);
        }
        {
            btnCerrar = new JButton("Cerrar");
            btnCerrar.addActionListener(this);
            btnCerrar.setBounds(335, 58, 89, 23);
            contentPanel.add(btnCerrar);
        }
        {
            JScrollPane scpScroll = new JScrollPane();
            scpScroll.setBounds(10, 127, 414, 173);
            contentPanel.add(scpScroll);
            {
                txtS = new JTextArea();
                txtS.setEditable(false);
                scpScroll.setViewportView(txtS);
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cboCodigo) {
            actionPerformedCboCodigo(e);
        }
        if (e.getSource() == btnVender) {
            actionPerformedBtnVender(e);
        }
        if (e.getSource() == btnCerrar) {
            actionPerformedBtncerrar(e);
        }
    }
    protected void actionPerformedBtncerrar(ActionEvent e) {
        dispose();
    }
    
    
    protected void actionPerformedCboCodigo(ActionEvent e) {
        codigo = cboCodigo.getSelectedIndex();
        
        switch (codigo) {
        case 0:
        	txtDescripcion.setText(MenuPrincipal1.descripcion0);
        	break;
        case 1:
        	txtDescripcion.setText(MenuPrincipal1.descripcion1);
        	break;
        case 2:
        	txtDescripcion.setText(MenuPrincipal1.descripcion2);
        	break;
        case 3:
        	txtDescripcion.setText(MenuPrincipal1.descripcion3);
        	break;
        default:
        	txtDescripcion.setText(MenuPrincipal1.descripcion4);
        	break;
        }
        
    }
    protected void actionPerformedBtnVender(ActionEvent e) {
    	//Variables
    	codigoSeleccionado = codigoSeleccionado(codigo);
    	int metrosComprados;
    	
    	try {
    	    metrosComprados = Integer.parseInt(txtCantidadMetros.getText());
    	} catch (NumberFormatException ex) {
    	    txtS.setText("ERROR: Introduzca un número válido por favor.");
    	    return;
    	}
    	
    	double precio = precio(codigo);
    	String descripcionTela = descripcionTela(codigo);
    	double importeCompra = importeCompra(precio, metrosComprados);
    	double importeDescuento = importeDescuento(metrosComprados, importeCompra);
    	double importeAPagar = importeAPagar(importeCompra, importeDescuento);
    	boolean mereceObsequio = mereceObsequio(metrosComprados);
    	
    	
    	if (metrosComprados < 0){
    		txtS.setText("ERROR: introduzca un número valido por favor");
    	}
    	else{
    		//Imprimir texto
    		txtS.setText("BOLETA DE VENTA: \n\n");
            txtS.append(String.format("El codigo de la tela es\t:  %s \n", codigoSeleccionado));
            txtS.append(String.format("La descripción de su tela es\t:  %s \n", descripcionTela));
        	txtS.append(String.format("Precio de la tela\t:  %.3f \n", precio));
        	txtS.append(String.format("Usted compró\t\t:  %d metros. \n", metrosComprados));
        	txtS.append(String.format("El importe de su compra será¡\t:  S/%.3f \n", importeCompra));
        	txtS.append(String.format("Le descontamos\t:  S/%.3f \n", importeDescuento));
        	txtS.append(String.format("Tiene que pagar\t:  S/%.3f \n", importeAPagar));
        	
        	if (mereceObsequio) {
        		txtS.append("Felicidades, se gano\t: " + MenuPrincipal1.obsequio + "\n");
        	}
        	
        	if ((MenuPrincipal1.cantidadDeVentas+1) % MenuPrincipal1.numeroClienteSorpresa == 0) {
        		txtS.append(String.format("\nFelicidades, cliente número"
        				+ " %d, se gana: %s!!!!", MenuPrincipal1.numeroClienteSorpresa,
        				MenuPrincipal1.premioSorpresa));
        	}
        	
        	//Llamada a acumuladores
        	contadorVentas(codigo);
        	contadorMetrosVendidos(codigo, metrosComprados);
        	contadorImporteTotal(codigo, importeAPagar);
            
            MenuPrincipal1.cantidadDeVentas++;
    	}
        
    }
    
    String codigoSeleccionado (int codigo) {
    	switch(codigo) {
    	case 0:
    		return "TF0";
    	case 1:
    		return "TF1";
    	case 2:
    		return "TF2";
    	case 3:
    		return "TF3";
    	default:
    		return "TF4";

    	}
    }
    
    double precio(int codigo) {
    	switch (codigo) {
    	case 0:
    		return MenuPrincipal1.precio0;
    	case 1:
    		return MenuPrincipal1.precio1;
    	case 2:
    		return MenuPrincipal1.precio2;
    	case 3:
    		return MenuPrincipal1.precio3;
    	default:
    		return MenuPrincipal1.precio4;
    	}
    }
    
    String descripcionTela(int codigo) {
    	switch (codigo) {
    	case 0:
    		return MenuPrincipal1.descripcion0;
    	case 1:
    		return MenuPrincipal1.descripcion1;
    	case 2:
    		return MenuPrincipal1.descripcion2;
    	case 3:
    		return MenuPrincipal1.descripcion3;
    	default:
    		return MenuPrincipal1.descripcion4;
    	}
    }
    
    double importeCompra(double precio, int metrosComprados) {
    	return precio*metrosComprados;
    }
    
    double importeDescuento(int metrosComprados, double importeCompra) {
    	if (metrosComprados < 6) {
    		return MenuPrincipal1.porcentaje1/100 * importeCompra;
    	}else if (metrosComprados < 11) {
    		return MenuPrincipal1.porcentaje2/100 * importeCompra;
    	}else if (metrosComprados < 16) {
    		return MenuPrincipal1.porcentaje3/100 * importeCompra;
    	}else {
    		return MenuPrincipal1.porcentaje4/100 * importeCompra;
    	}
    }
    double importeAPagar(double importeCompra, double importeDescuento) {
    	return importeCompra - importeDescuento;
    }
    
    
    boolean mereceObsequio(int cantidadMetrosAdquiridos) {
    	int cantidadMetrosParaObsequio = MenuPrincipal1.cantidadObsequiable;
    	
    	if (cantidadMetrosAdquiridos > cantidadMetrosParaObsequio) return true;
    	else return false;
    }
    
    void contadorVentas(int codigo) {
    	MenuPrincipal1.ventasTela[codigo] += 1;
    }
   	void contadorMetrosVendidos(int codigo, double metrosVendidos) {
   		MenuPrincipal1.metrosVendidos[codigo] += metrosVendidos;
    }
   	void contadorImporteTotal(int codigo, double importeAPagar) {
   		MenuPrincipal1.importeTotal[codigo] += importeAPagar;
    }
    
    
}