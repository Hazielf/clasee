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

public class Menu_Principal_1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenu mnMantenimiento;
	private JMenu mnVender;
	private JMenu mnConfig;
	private JMenu mnAyuda;
	private JMenuItem mntmsalir;
	private JMenuItem mntmconsultar;
	private JMenuItem mntmmodificar;
	private JMenuItem mntmlistar;
	private JMenuItem mntmvender;
	private JMenuItem mntmreport;
	private JMenuItem mntmconfdesc;
	private JMenuItem mntmconfobseq;
	private JMenuItem mntmconfCOM;
	private JMenuItem mntmconfpremio;
	private JMenuItem mntmacerca;
	
	// Datos mínimos de la primera tela
	public static String codigo0 = "TF0";
	public static String descripcion0 = "Pinstripe Suit 1";
	public static String material0 = "98%Algodón, 2%Elastán";
	public static double ancho0 = 160.0;
	public static double peso0 = 220.0;
	public static double precio0 = 9.4;
	// Datos mínimos de la segunda tela
	public static String codigo1 = "TF1";
	public static String descripcion1 = "Gabardina Oslo 5";
	public static String material1 = "60%Algodón, 37%Poliéster";
	public static double ancho1 = 145.0;
	public static double peso1 = 300.0;
	public static double precio1 = 11.3;
	// Datos mínimos de la tercera tela
	public static String codigo2 = "TF2";
	public static String descripcion2 = "Sarga 2";
	public static String material2 = "50%Poliéster, 50%Poliacril";
	public static double ancho2 = 145.0;
	public static double peso2 = 425.0;
	public static double precio2 = 31.8;
	// Datos mínimos de la cuarta tela
	public static String codigo3 = "TF3";
	public static String descripcion3 = "Leni 1";
	public static String material3 = "50%Poliéster, 50%Poliacril";
	public static double ancho3 = 145.0;
	public static double peso3 = 410.0;
	public static double precio3 = 37.2;
	// Datos mínimos de la quinta tela
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
	
	// Cantidad óptima de metros vendidos
	public static int cantidadTotalOptima = 50;
	
	// Cantidad mínima de metros adquiridos para obtener el obsequio
	public static int cantidadObsequiable = 20;
	
	// Obsequio
	public static String obsequio = "USB";
	
	// Número de cliente que recibe el premio sorpresa
	public static int numeroClienteSorpresa = 5;
	
	// Premio sorpresa
	public static String premioSorpresa = "Una agenda";
	private JLabel lblimage;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu_Principal_1 frame = new Menu_Principal_1();
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
	public Menu_Principal_1() {
		setBackground(new Color(255, 255, 255));
		setTitle("Tienda 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		mnArchivo.setBackground(new Color(255, 255, 255));
		menuBar.add(mnArchivo);
		
		mntmsalir = new JMenuItem("Salir");
		mntmsalir.addActionListener(this);
		mnArchivo.add(mntmsalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmconsultar = new JMenuItem("Consultar tela");
		mntmconsultar.addActionListener(this);
		mnMantenimiento.add(mntmconsultar);
		
		mntmmodificar = new JMenuItem("Modificar tela");
		mntmmodificar.addActionListener(this);
		mnMantenimiento.add(mntmmodificar);
		
		mntmlistar = new JMenuItem("Listar telas");
		mntmlistar.addActionListener(this);
		mnMantenimiento.add(mntmlistar);
		
		mnVender = new JMenu("Ventas");
		menuBar.add(mnVender);
		
		mntmvender = new JMenuItem("Vender");
		mntmvender.addActionListener(this);
		mnVender.add(mntmvender);
		
		mntmreport = new JMenuItem("Generar reportes");
		mntmreport.addActionListener(this);
		mnVender.add(mntmreport);
		
		mnConfig = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnConfig);
		
		mntmconfdesc = new JMenuItem("Configurar descuentos");
		mntmconfdesc.addActionListener(this);
		mnConfig.add(mntmconfdesc);
		
		mntmconfobseq = new JMenuItem("Configurar obsequio");
		mntmconfobseq.addActionListener(this);
		mnConfig.add(mntmconfobseq);
		
		mntmconfCOM = new JMenuItem("Configurar cantidad \u00F3ptima de metros vendidos");
		mntmconfCOM.addActionListener(this);
		mnConfig.add(mntmconfCOM);
		
		mntmconfpremio = new JMenuItem("Configurar premio sorpresa");
		mntmconfpremio.addActionListener(this);
		mnConfig.add(mntmconfpremio);
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		mntmacerca = new JMenuItem("Acerca de Tienda");
		mntmacerca.addActionListener(this);
		mnAyuda.add(mntmacerca);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblimage = new JLabel("");
		lblimage.setIcon(new ImageIcon("E:\\C\\eclipse\\eclipse-workspace\\GrupoG V2\\Images\\1323352100-04.jpg"));
		lblimage.setBounds(0, 0, 800, 600);
		contentPane.add(lblimage);  

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmconfpremio) {
			actionPerformedMntmconfpremio(e);
		}
		if (e.getSource() == mntmconfCOM) {
			actionPerformedMntmconfCOM(e);
		}
		if (e.getSource() == mntmconfobseq) {
			actionPerformedMntmconfobseq(e);
		}
		if (e.getSource() == mntmconfdesc) {
			actionPerformedMntmconfdesc(e);
		}
		if (e.getSource() == mntmreport) {
			actionPerformedMntmreport(e);
		}
		if (e.getSource() == mntmvender) {
			actionPerformedMntmvender(e);
		}
		if (e.getSource() == mntmlistar) {
			actionPerformedMntmlistar(e);
		}
		if (e.getSource() == mntmmodificar) {
			actionPerformedMntmmodificar(e);
		}
		if (e.getSource() == mntmconsultar) {
			actionPerformedMntmconsultar(e);
		}
		if (e.getSource() == mntmacerca) {
			actionPerformedMntmacerca(e);
		}
		if (e.getSource() == mntmsalir) {
			actionPerformedMntmsalir(e);
		}
	}
	protected void actionPerformedMntmsalir(ActionEvent e) {
		System.exit(0); 
	}
	protected void actionPerformedMntmconsultar(ActionEvent e) {
		Consultar_Tela_2 cons=new Consultar_Tela_2();
		cons.setLocationRelativeTo(this);
		cons.setVisible(true);
	}
	protected void actionPerformedMntmmodificar(ActionEvent e) {
		Modificar_Tela_3 mod=new Modificar_Tela_3();
		mod.setLocationRelativeTo(this);
		mod.setVisible(true);
	}
	protected void actionPerformedMntmlistar(ActionEvent e) {
		Listar_Tela_4 lista=new Listar_Tela_4();
		lista.setLocationRelativeTo(this);
		lista.setVisible(true);
	}
	protected void actionPerformedMntmvender(ActionEvent e) {
		Vender_5 vende=new Vender_5();
		vende.setLocationRelativeTo(this);
		vende.setVisible(true);
	}
	protected void actionPerformedMntmreport(ActionEvent e) {
		Generar_Reporte_6 repor=new Generar_Reporte_6();
		repor.setLocationRelativeTo(this);
		repor.setVisible(true);
	}
	protected void actionPerformedMntmconfdesc(ActionEvent e) {
		Configurar_Descuento descuentos=new Configurar_Descuento();
		descuentos.setLocationRelativeTo(this);
		descuentos.setVisible(true);
	}
	protected void actionPerformedMntmconfobseq(ActionEvent e) {
		Configurar_Obsequio_8 obseq=new Configurar_Obsequio_8();
		obseq.setLocationRelativeTo(this);
		obseq.setVisible(true);
	}
	protected void actionPerformedMntmconfCOM(ActionEvent e) {
		Configurar_Cantidad_Optima_de_metros_vendidos_10 comt=new Configurar_Cantidad_Optima_de_metros_vendidos_10();
		comt.setLocationRelativeTo(this);
		comt.setVisible(true);
	}
	protected void actionPerformedMntmconfpremio(ActionEvent e) {
		Configurar_Premio_Sorpresa_8 premio=new Configurar_Premio_Sorpresa_8();
		premio.setLocationRelativeTo(this);
		premio.setVisible(true);
	}
	protected void actionPerformedMntmacerca(ActionEvent e) {
		Acerca_de_Tienda_12 about= new Acerca_de_Tienda_12();
		about.setLocationRelativeTo(this);
		about.setVisible(true);
	}
}
