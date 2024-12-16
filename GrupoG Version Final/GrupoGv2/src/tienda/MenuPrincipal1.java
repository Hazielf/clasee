package tienda;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class MenuPrincipal1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenu mnMantenimiento;
	private JMenu mnVender;
	private JMenu mnConfig;
	private JMenu mnAyuda;
	private JMenuItem mntmSalir;
	private JMenuItem mntmConsultarTela;
	private JMenuItem mntmModificarTela;
	private JMenuItem mntmListarTela;
	private JMenuItem mntmVender;
	private JMenuItem mntmGenerarReportes;
	private JMenuItem mntmConfigurarDescuentos;
	private JMenuItem mntmConfigurarObsequio;
	private JMenuItem mntmconfConfigurarCantidadOptimaMV;
	private JMenuItem mntmConfigurarPremio;
	private JMenuItem mntmAcercaDeTienda;
	
	// Datos mÃ­nimos de la primera tela
	public static String codigo0 = "TF0";
	public static String descripcion0 = "Pinstripe Suit 1";
	public static String material0 = "98%Algodón, 2%Elastán";
	public static double ancho0 = 160.0;
	public static double peso0 = 220.0;
	public static double precio0 = 9.4;
	// Datos mÃ­nimos de la segunda tela
	public static String codigo1 = "TF1";
	public static String descripcion1 = "Gabardina Oslo 5";
	public static String material1 = "60%Algodón, 37%Poliéster";
	public static double ancho1 = 145.0;
	public static double peso1 = 300.0;
	public static double precio1 = 11.3;
	// Datos mÃ­nimos de la tercera tela
	public static String codigo2 = "TF2";
	public static String descripcion2 = "Sarga 2";
	public static String material2 = "50%Poliéster, 50%Poliacril";
	public static double ancho2 = 145.0;
	public static double peso2 = 425.0;
	public static double precio2 = 31.8;
	// Datos mÃ­nimos de la cuarta tela
	public static String codigo3 = "TF3";
	public static String descripcion3 = "Leni 1";
	public static String material3 = "50%Poliéster, 50%Poliacril";
	public static double ancho3 = 145.0;
	public static double peso3 = 410.0;
	public static double precio3 = 37.2;
	// Datos mÃ­nimos de la quinta tela
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
	
	// Cantidad Ã“ptima de metros vendidos
	public static int cantidadTotalOptima = 50;
	
	// Cantidad mÃ­nima de metros adquiridos para obtener el obsequio
	public static int cantidadObsequiable = 20;
	
	// Obsequio
	public static String obsequio = "USB";
	
	// Nï¿½mero de cliente que recibe el premio sorpresa
	public static int numeroClienteSorpresa = 5;
	
	// Premio sorpresa
	public static String premioSorpresa = "Una agenda";
	private JLabel lblimage;
	
	//Cantidad de ventas
	public static int cantidadDeVentas = 0;
	
	
	//Ventas por tela:
	public static int[] ventasTela = new int[5];
	public static double[] metrosVendidos = new double[5];
	public static double[] importeTotal = new double[5];
	
	public static double importeTotalTelas = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal1 frame = new MenuPrincipal1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuPrincipal1() {
		setBackground(new Color(255, 255, 255));
		setTitle("Tienda 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		mnArchivo.setBackground(new Color(255, 255, 255));
		menuBar.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmConsultarTela = new JMenuItem("Consultar tela");
		mntmConsultarTela.addActionListener(this);
		mnMantenimiento.add(mntmConsultarTela);
		
		mntmModificarTela = new JMenuItem("Modificar tela");
		mntmModificarTela.addActionListener(this);
		mnMantenimiento.add(mntmModificarTela);
		
		mntmListarTela = new JMenuItem("Listar telas");
		mntmListarTela.addActionListener(this);
		mnMantenimiento.add(mntmListarTela);
		
		mnVender = new JMenu("Ventas");
		menuBar.add(mnVender);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mnVender.add(mntmVender);
		
		mntmGenerarReportes = new JMenuItem("Generar reportes");
		mntmGenerarReportes.addActionListener(this);
		mnVender.add(mntmGenerarReportes);
		
		mnConfig = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnConfig);
		
		mntmConfigurarDescuentos = new JMenuItem("Configurar descuentos");
		mntmConfigurarDescuentos.addActionListener(this);
		mnConfig.add(mntmConfigurarDescuentos);
		
		mntmConfigurarObsequio = new JMenuItem("Configurar obsequio");
		mntmConfigurarObsequio.addActionListener(this);
		mnConfig.add(mntmConfigurarObsequio);
		
		mntmconfConfigurarCantidadOptimaMV = new JMenuItem("Configurar cantidad \u00F3ptima de metros vendidos");
		mntmconfConfigurarCantidadOptimaMV.addActionListener(this);
		mnConfig.add(mntmconfConfigurarCantidadOptimaMV);
		
		mntmConfigurarPremio = new JMenuItem("Configurar premio sorpresa");
		mntmConfigurarPremio.addActionListener(this);
		mnConfig.add(mntmConfigurarPremio);
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		mntmAcercaDeTienda = new JMenuItem("Acerca de Tienda");
		mntmAcercaDeTienda.addActionListener(this);
		mnAyuda.add(mntmAcercaDeTienda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblimage = new JLabel("");
		lblimage.setBounds(0, 0, 800, 600);
		contentPane.add(lblimage);  

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmConfigurarPremio) {
			actionPerformedMntmconfpremio(e);
		}
		if (e.getSource() == mntmconfConfigurarCantidadOptimaMV) {
			actionPerformedMntmconfCOM(e);
		}
		if (e.getSource() == mntmConfigurarObsequio) {
			actionPerformedMntmconfobseq(e);
		}
		if (e.getSource() == mntmConfigurarDescuentos) {
			actionPerformedMntmconfdesc(e);
		}
		if (e.getSource() == mntmGenerarReportes) {
			actionPerformedMntmreport(e);
		}
		if (e.getSource() == mntmVender) {
			actionPerformedMntmvender(e);
		}
		if (e.getSource() == mntmListarTela) {
			actionPerformedMntmlistar(e);
		}
		if (e.getSource() == mntmModificarTela) {
			actionPerformedMntmmodificar(e);
		}
		if (e.getSource() == mntmConsultarTela) {
			actionPerformedMntmconsultar(e);
		}
		if (e.getSource() == mntmAcercaDeTienda) {
			actionPerformedMntmacerca(e);
		}
		if (e.getSource() == mntmSalir) {
			actionPerformedMntmsalir(e);
		}
	}
	protected void actionPerformedMntmsalir(ActionEvent e) {
		System.exit(0); 
	}
	protected void actionPerformedMntmconsultar(ActionEvent e) {
		ConsultarTela2 cons=new ConsultarTela2();
		cons.setLocationRelativeTo(this);
		cons.setVisible(true);
	}
	protected void actionPerformedMntmmodificar(ActionEvent e) {
		ModificarTela3 mod=new ModificarTela3();
		mod.setLocationRelativeTo(this);
		mod.setVisible(true);
	}
	protected void actionPerformedMntmlistar(ActionEvent e) {
		ListarTela4 lista=new ListarTela4();
		lista.setLocationRelativeTo(this);
		lista.setVisible(true);
	}
	protected void actionPerformedMntmvender(ActionEvent e) {
		Vender5 vende=new Vender5();
		vende.setLocationRelativeTo(this);
		vende.setVisible(true);
	}
	protected void actionPerformedMntmreport(ActionEvent e) {
		GenerarReporte6 repor=new GenerarReporte6();
		repor.setLocationRelativeTo(this);
		repor.setVisible(true);
	}
	protected void actionPerformedMntmconfdesc(ActionEvent e) {
		ConfigurarDescuento7 descuentos=new ConfigurarDescuento7();
		descuentos.setLocationRelativeTo(this);
		descuentos.setVisible(true);
	}
	protected void actionPerformedMntmconfobseq(ActionEvent e) {
		ConfigurarObsequio8 obseq=new ConfigurarObsequio8();
		obseq.setLocationRelativeTo(this);
		obseq.setVisible(true);
	}
	protected void actionPerformedMntmconfCOM(ActionEvent e) {
		ConfigurarCantidadOptimaMetrosVendidos9 comt=new ConfigurarCantidadOptimaMetrosVendidos9();
		comt.setLocationRelativeTo(this);
		comt.setVisible(true);
	}
	protected void actionPerformedMntmconfpremio(ActionEvent e) {
		ConfigurarPremioSorpresa10 premio=new ConfigurarPremioSorpresa10();
		premio.setLocationRelativeTo(this);
		premio.setVisible(true);
	}
	protected void actionPerformedMntmacerca(ActionEvent e) {
		AcercaDeTienda11 about= new AcercaDeTienda11();
		about.setLocationRelativeTo(this);
		about.setVisible(true);
	}
}
