package tienda;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import tienda.AcercaDeTienda12;
import tienda.ConfigurarCantidadOptima10;
import tienda.ConfigurarObsequios8;
import tienda.ConfigurarPremioSorpresa11;
import tienda.ConfigurarDescuentos7;
import tienda.ConsultarTela2;
import tienda.ListarTela4;
import tienda.Main1;
import tienda.ModificarTela3;
import tienda.GenerarReportes6;
import tienda.Vender5;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Main1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
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
	
	// Datos m�nimos de la primera tela
	public static String codigo0 = "TF0";
	public static String descripcion0 = "Pinstripe Suit 1";
	public static String material0 = "98%Algodón, 2%Elastán";
	public static double ancho0 = 160.0;
	public static double peso0 = 220.0;
	public static double precio0 = 9.4;
	// Datos m�nimos de la segunda tela
	public static String codigo1 = "TF1";
	public static String descripcion1 = "Gabardina Oslo 5";
	public static String material1 = "60%Algodón, 37%Poliéster";
	public static double ancho1 = 145.0;
	public static double peso1 = 300.0;
	public static double precio1 = 11.3;
	// Datos m�nimos de la tercera tela
	public static String codigo2 = "TF2";
	public static String descripcion2 = "Sarga 2";
	public static String material2 = "50%Poliéster, 50%Poliacril";
	public static double ancho2 = 145.0;
	public static double peso2 = 425.0;
	public static double precio2 = 31.8;
	// Datos m�nimos de la cuarta tela
	public static String codigo3 = "TF3";
	public static String descripcion3 = "Leni 1";
	public static String material3 = "50%Poliéster, 50%Poliacril";
	public static double ancho3 = 145.0;
	public static double peso3 = 410.0;
	public static double precio3 = 37.2;
	// Datos m�nimos de la quinta tela
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
	
	// Cantidad �ptima de metros vendidos
	public static int cantidadTotalOptima = 50;
	
	// Cantidad m�nima de metros adquiridos para obtener el obsequio
	public static int cantidadObsequiable = 20;
	
	// Obsequio
	public static String obsequio = "USB";
	
	// N�mero de cliente que recibe el premio sorpresa
	public static int numeroClienteSorpresa = 5;
	
	// Premio sorpresa
	public static String premioSorpresa = "Una agenda";
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main1 frame = new Main1();
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
	public Main1() {
		setTitle("Tienda 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
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
		
		mnConfig = new JMenu("Configuración");
		menuBar.add(mnConfig);
		
		mntmconfdesc = new JMenuItem("Configurar descuentos");
		mntmconfdesc.addActionListener(this);
		mnConfig.add(mntmconfdesc);
		
		mntmconfobseq = new JMenuItem("Configurar obsequio");
		mntmconfobseq.addActionListener(this);
		mnConfig.add(mntmconfobseq);
		
		mntmconfCOM = new JMenuItem("Configurar cantidad óptima de metros vendidos");
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
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/home/haziel/eclipse-workspace/ProyectoIntroduccionAlgoritmia/Images/1323352100-04.jpg"));
		label.setBounds(0, 0, 800, 600);
		contentPane.add(label);
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
	protected void actionPerformedMntmacerca(ActionEvent e) {
		AcercaDeTienda12 about= new AcercaDeTienda12();
		about.setLocationRelativeTo(this);
		about.setVisible(true);
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
		GenerarReportes6 repor=new GenerarReportes6();
		repor.setLocationRelativeTo(this);
		repor.setVisible(true);
	}
	protected void actionPerformedMntmconfdesc(ActionEvent e) {
		ConfigurarDescuentos7 descuentos=new ConfigurarDescuentos7();
		descuentos.setLocationRelativeTo(this);
		descuentos.setVisible(true);
	}
	protected void actionPerformedMntmconfobseq(ActionEvent e) {
		ConfigurarObsequios8 obseq=new ConfigurarObsequios8();
		obseq.setLocationRelativeTo(this);
		obseq.setVisible(true);
	}
	protected void actionPerformedMntmconfCOM(ActionEvent e) {
		ConfigurarCantidadOptima10 comt=new ConfigurarCantidadOptima10();
		comt.setLocationRelativeTo(this);
		comt.setVisible(true);
	}
	protected void actionPerformedMntmconfpremio(ActionEvent e) {
		ConfigurarPremioSorpresa11 premio=new ConfigurarPremioSorpresa11();
		premio.setLocationRelativeTo(this);
		premio.setVisible(true);
	}
}