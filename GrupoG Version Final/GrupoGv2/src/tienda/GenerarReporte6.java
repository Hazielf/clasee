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
import java.util.Arrays;
import java.awt.event.ActionEvent;

public class GenerarReporte6 extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JScrollPane scpScroll;
	private JTextArea txtS;
	private JButton btncerrar;
	private JLabel lblTipoDeReporte;
	private JComboBox cboTipoDeReporte;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GenerarReporte6 dialog = new GenerarReporte6();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GenerarReporte6() {
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
		txtS.setEditable(false);
		scpScroll.setViewportView(txtS);
		
		btncerrar = new JButton("Cerrar");
		btncerrar.addActionListener(this);
		btncerrar.setBounds(335, 15, 89, 23);
		contentPanel.add(btncerrar);
		
		lblTipoDeReporte = new JLabel("Tipo de reporte");
		lblTipoDeReporte.setBounds(10, 19, 89, 14);
		contentPanel.add(lblTipoDeReporte);
		
		cboTipoDeReporte = new JComboBox();
		cboTipoDeReporte.addActionListener(this);
		cboTipoDeReporte.setModel(new DefaultComboBoxModel(new String[] {"Ventas por tela", "Telas con venta óptima", "Telas con precios mayores al 75% del precio máximo", "Telas con precios menores al 75% del precio máximo", "Precios menor, mayor y promedio"}));
		cboTipoDeReporte.setBounds(109, 15, 216, 22);
		contentPanel.add(cboTipoDeReporte);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btncerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == cboTipoDeReporte) {
			actionPerformedBtnTipoDeReporte(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
	protected void actionPerformedBtnTipoDeReporte(ActionEvent e) {
        int indice = cboTipoDeReporte.getSelectedIndex();
        importeTotalTodasLasTelas();
        
        switch (indice) {
        case 0:
        	caso0();
        	break;
        case 1:
        	caso1();
        	break;
        case 2:
        	caso2();
        	break;
        case 3:
        	caso3();
        	break;
        case 4:
        	caso4();
        	break;
        }
    }
	
	void importeTotalTodasLasTelas() {
		MenuPrincipal1.importeTotalTelas = MenuPrincipal1.importeTotal[0] +
				MenuPrincipal1.importeTotal[1] + MenuPrincipal1.importeTotal[2] +
				MenuPrincipal1.importeTotal[3] + MenuPrincipal1.importeTotal[4];
	}
	
	
	//Ventas por tela
	void caso0(){
		txtS.setText("VENTAS POR TELA \n\n");
    	
    	txtS.append(String.format("Código \t\t\t: %s\n", MenuPrincipal1.codigo0));
    	txtS.append(String.format("Descripcion \t\t\t: %s\n", MenuPrincipal1.descripcion0));
    	txtS.append(String.format("Cantidad total de ventas \t\t: %d\n", MenuPrincipal1.ventasTela[0]));
    	txtS.append(String.format("Cantidad Total de metros vendidos \t: %.3f\n", MenuPrincipal1.metrosVendidos[0]));
    	txtS.append(String.format("Importe total acumulado \t\t: S/. %.3f\n\n", MenuPrincipal1.importeTotal[0]));
    	
    	txtS.append(String.format("Código \t\t\t: %s\n", MenuPrincipal1.codigo1));
    	txtS.append(String.format("Descripcion \t\t\t: %s\n", MenuPrincipal1.descripcion1));
    	txtS.append(String.format("Cantidad total de ventas \t\t: %d\n", MenuPrincipal1.ventasTela[1]));
    	txtS.append(String.format("Cantidad Total de metros vendidos \t: %.3f\n", MenuPrincipal1.metrosVendidos[1]));
    	txtS.append(String.format("Importe total acumulado \t\t: S/. %.3f\n\n", MenuPrincipal1.importeTotal[1]));
    	
    	txtS.append(String.format("Código \t\t\t: %s\n", MenuPrincipal1.codigo2));
    	txtS.append(String.format("Descripcion \t\t\t: %s\n", MenuPrincipal1.descripcion2));
    	txtS.append(String.format("Cantidad total de ventas \t\t: %d\n", MenuPrincipal1.ventasTela[2]));
    	txtS.append(String.format("Cantidad Total de metros vendidos \t: %.3f\n", MenuPrincipal1.metrosVendidos[2]));
    	txtS.append(String.format("Importe total acumulado \t\t: S/. %.3f\n\n", MenuPrincipal1.importeTotal[2]));
    	
    	txtS.append(String.format("Código \t\t\t: %s\n", MenuPrincipal1.codigo3));
    	txtS.append(String.format("Descripcion \t\t\t: %s\n", MenuPrincipal1.descripcion3));
    	txtS.append(String.format("Cantidad total de ventas \t\t: %d\n", MenuPrincipal1.ventasTela[3]));
    	txtS.append(String.format("Cantidad Total de metros vendidos \t: %.3f\n", MenuPrincipal1.metrosVendidos[3]));
    	txtS.append(String.format("Importe total acumulado \t\t: S/. %.3f\n\n", MenuPrincipal1.importeTotal[3]));
    	
    	txtS.append(String.format("Código \t\t\t: %s\n", MenuPrincipal1.codigo4));
    	txtS.append(String.format("Descripcion \t\t\t: %s\n", MenuPrincipal1.descripcion4));
    	txtS.append(String.format("Cantidad total de ventas \t\t: %d\n", MenuPrincipal1.ventasTela[4]));
    	txtS.append(String.format("Cantidad Total de metros vendidos \t: %.3f\n", MenuPrincipal1.metrosVendidos[4]));
    	txtS.append(String.format("Importe total acumulado \t\t: S/. %.3f\n\n", MenuPrincipal1.importeTotal[4]));
    	
    	
    	txtS.append(String.format("Importe total acumulado general \t: S/. %.3f", MenuPrincipal1.importeTotalTelas));
	}
	//Telas con venta optima
	void caso1() {
		int cantidadOptima = MenuPrincipal1.cantidadTotalOptima;
		
		txtS.setText("TELAS CON VENTA OPTIMA\n\n");
		
		if (MenuPrincipal1.metrosVendidos[0] >= cantidadOptima) {
			txtS.append(String.format("Código\t\t\t: %s\n", MenuPrincipal1.codigo0));
			txtS.append(String.format("Descripcion\t\t\t: %s\n", MenuPrincipal1.descripcion0));
			txtS.append(String.format("Cantidad Total de metros vendidos\t: %s\n\n", 
					MenuPrincipal1.metrosVendidos[0]));
		}
		if (MenuPrincipal1.metrosVendidos[1] >= cantidadOptima) {
			txtS.append(String.format("Código\t\t\t: %s\n", MenuPrincipal1.codigo1));
			txtS.append(String.format("Descripcion\t\t\t: %s\n", MenuPrincipal1.descripcion1));
			txtS.append(String.format("Cantidad Total de metros vendidos\t: %s\n\n", 
					MenuPrincipal1.metrosVendidos[1]));
		}
		if (MenuPrincipal1.metrosVendidos[2] >= cantidadOptima) {
			txtS.append(String.format("Código\t\t\t: %s\n", MenuPrincipal1.codigo2));
			txtS.append(String.format("Descripcion\t\t\t: %s\n", MenuPrincipal1.descripcion2));
			txtS.append(String.format("Cantidad Total de metros vendidos\t: %s\n\n", 
					MenuPrincipal1.metrosVendidos[2]));
		}
		if (MenuPrincipal1.metrosVendidos[3] >= cantidadOptima) {
			txtS.append(String.format("Código\t\t\t: %s\n", MenuPrincipal1.codigo3));
			txtS.append(String.format("Descripcion\t\t\t: %s\n", MenuPrincipal1.descripcion3));
			txtS.append(String.format("Cantidad Total de metros vendidos\t: %s\n\n", 
					MenuPrincipal1.metrosVendidos[3]));
		}
		if (MenuPrincipal1.metrosVendidos[4] >= cantidadOptima) {
			txtS.append(String.format("Código\t\t\t: %s\n", MenuPrincipal1.codigo4));
			txtS.append(String.format("Descripcion\t\t\t: %s\n", MenuPrincipal1.descripcion4));
			txtS.append(String.format("Cantidad Total de metros vendidos\t: %s\n\n", 
					MenuPrincipal1.metrosVendidos[4]));
		}
	}
	//Telas con precios mayores al 75% del precio máximo
	void caso2() {
		int numeroDeMarcas = 0;
		double precioMaximo, minimoObjetivo;
		
		precioMaximo = calcularPrecioMaximo();
		minimoObjetivo = precioMaximo * 0.75;
		
		txtS.setText("TELAS CON PRECIOS MAYORES AL 75% DEL PRECIO MAXIMO\n\n");
		
		if(MenuPrincipal1.precio0 > minimoObjetivo) {
			txtS.append(String.format("Descripcion\t: %s\n", MenuPrincipal1.descripcion0));
			txtS.append(String.format("Precio\t: %.2f\n\n", MenuPrincipal1.precio0));
			numeroDeMarcas++;
		}
		if(MenuPrincipal1.precio1 > minimoObjetivo) {
			txtS.append(String.format("Descripci	on\t: %s\n", MenuPrincipal1.descripcion1));
			txtS.append(String.format("Precio\t: %.2f\n\n", MenuPrincipal1.precio1));
			numeroDeMarcas++;
		}
		if(MenuPrincipal1.precio2 > minimoObjetivo) {
			txtS.append(String.format("Descripcion\t: %s\n", MenuPrincipal1.descripcion2));
			txtS.append(String.format("Precio\t: %.2f\n\n", MenuPrincipal1.precio2));
			numeroDeMarcas++;
		}
		if(MenuPrincipal1.precio3 > minimoObjetivo) {
			txtS.append(String.format("Descripcion\t: %s\n", MenuPrincipal1.descripcion3));
			txtS.append(String.format("Precio\t: %.2f\n\n", MenuPrincipal1.precio3));
			numeroDeMarcas++;
		}
		if(MenuPrincipal1.precio4 > minimoObjetivo) {
			txtS.append(String.format("Descripcion\t: %s\n", MenuPrincipal1.descripcion4));
			txtS.append(String.format("Precio\t: %.2f\n\n", MenuPrincipal1.precio4));
			numeroDeMarcas++;
		}
		
		txtS.append(String.format("75%% del precio máximo\t: %.2f\n", minimoObjetivo));
		txtS.append(String.format("Número de marcas\t: %d", numeroDeMarcas));
		
	}
	//Telas con precios menores al 75% del precio máximo
	void caso3() {
		int numeroDeMarcas = 0;
		double precioMaximo, minimoObjetivo;
		
		precioMaximo = calcularPrecioMaximo();
		minimoObjetivo = precioMaximo * 0.75;
		
		txtS.setText("TELAS CON PRECIOS MENORES AL 75% DEL PRECIO MAXIMO\n\n");
		
		if(MenuPrincipal1.precio0 < minimoObjetivo) {
			txtS.append(String.format("Descripcion\t: %s\n", MenuPrincipal1.descripcion0));
			txtS.append(String.format("Precio\t: %.2f\n\n", MenuPrincipal1.precio0));
			numeroDeMarcas++;
		}
		if(MenuPrincipal1.precio1 < minimoObjetivo) {
			txtS.append(String.format("Descripcion\t: %s\n", MenuPrincipal1.descripcion1));
			txtS.append(String.format("Precio\t: %.2f\n\n", MenuPrincipal1.precio1));
			numeroDeMarcas++;
		}
		if(MenuPrincipal1.precio2 < minimoObjetivo) {
			txtS.append(String.format("Descripcion\t: %s\n", MenuPrincipal1.descripcion2));
			txtS.append(String.format("Precio\t: %.2f\n\n", MenuPrincipal1.precio2));
			numeroDeMarcas++;
		}
		if(MenuPrincipal1.precio3 < minimoObjetivo) {
			txtS.append(String.format("Descripcion\t: %s\n", MenuPrincipal1.descripcion3));
			txtS.append(String.format("Precio\t: %.2f\n\n", MenuPrincipal1.precio3));
			numeroDeMarcas++;
		}
		if(MenuPrincipal1.precio4 < minimoObjetivo) {
			txtS.append(String.format("Descripcion\t: %s\n", MenuPrincipal1.descripcion4));
			txtS.append(String.format("Precio\t: %.2f\n\n", MenuPrincipal1.precio4));
			numeroDeMarcas++;
		}
		
		txtS.append(String.format("75%% del precio mínimo\t: %.2f\n", minimoObjetivo));
		txtS.append(String.format("Número de marcas\t: %d", numeroDeMarcas));
	}
	//Promedios máximos y mínimos
	void caso4() {
		double[] ancho = listaOrdenada("ancho");
		double[] peso = listaOrdenada("peso");
		double[] precio = listaOrdenada("precio");
		
		double promedioAncho = calcularPromedio(ancho);
		double promedioPeso = calcularPromedio(peso);
		double promedioPrecio = calcularPromedio(precio);
		
		txtS.setText("PROMEDIOS, MÁXIMOS Y MÍNIMOS\n\n");
		
		txtS.append(String.format("Ancho promedio\t: %.1f cm\n", promedioAncho));
		txtS.append(String.format("Ancho mínimo\t\t: %.1f cm\n", ancho[0]));
		txtS.append(String.format("Ancho máximo\t: %.1f cm\n\n", ancho[ancho.length-1]));
		
		txtS.append(String.format("Peso promedio\t: %.1f g/m²\n", promedioPeso));
		txtS.append(String.format("Peso mínimo\t\t: %.1f g/m²\n", peso[0]));
		txtS.append(String.format("Peso máximo\t\t: %.1f g/m²\n\n", peso[peso.length-1]));
		
		txtS.append(String.format("Precio promedio\t: S/ %.1f\n", promedioPeso));
		txtS.append(String.format("Precio mínimo\t\t: S/ %.1f\n", peso[0]));
		txtS.append(String.format("Precio máximo\t: S/ %.1f\n", peso[peso.length-1]));
		
		
	}
	
	//Extras:
	double calcularPrecioMaximo() {
	    double[] precio = new double[5];
	    precio[0] = MenuPrincipal1.precio0;
	    precio[1] = MenuPrincipal1.precio1;
	    precio[2] = MenuPrincipal1.precio2;
	    precio[3] = MenuPrincipal1.precio3;
	    precio[4] = MenuPrincipal1.precio4;

	    double maxPrecio = precio[0]; // Suponemos que el primer precio es el mayor inicialmente

	    // Recorremos el arreglo para encontrar el precio más alto
	    for (int i = 1; i < precio.length; i++) { // Comenzamos desde 1 porque ya asumimos que el 0 es el máximo
	        if (precio[i] > maxPrecio) {
	            maxPrecio = precio[i]; // Actualizamos el precio máximo
	        }
	    }
	    return maxPrecio; // Retornamos el precio más alto
	}
	
	//Ordena de menor a mayor
	double[] listaOrdenada(String tipoDeLista) {
		switch (tipoDeLista) {
		case "ancho":
			double[] ancho = new double[5];
		    ancho[0] = MenuPrincipal1.ancho0;
		    ancho[1] = MenuPrincipal1.ancho1;
		    ancho[2] = MenuPrincipal1.ancho2;
		    ancho[3] = MenuPrincipal1.ancho3;
		    ancho[4] = MenuPrincipal1.ancho4;
		    Arrays.sort(ancho);
		    return ancho;
		case "peso":
			double[] peso = new double[5];
		    peso[0] = MenuPrincipal1.peso0;
		    peso[1] = MenuPrincipal1.peso1;
		    peso[2] = MenuPrincipal1.peso2;
		    peso[3] = MenuPrincipal1.peso3;
		    peso[4] = MenuPrincipal1.peso4;
		    Arrays.sort(peso);
		    return peso;
		default:
			double[] precio = new double[5];
		    precio[0] = MenuPrincipal1.precio0;
		    precio[1] = MenuPrincipal1.precio1;
		    precio[2] = MenuPrincipal1.precio2;
		    precio[3] = MenuPrincipal1.precio3;
		    precio[4] = MenuPrincipal1.precio4;
		    Arrays.sort(precio);
		    return precio;
		}
		
	}

	//Encuentra promedio
	double calcularPromedio(double[] lista) {
        double suma = 0.0;
        for (int i = 0; i < lista.length; i++) {
            suma += lista[i];
        }
        return suma / lista.length;
    }
}
