package project.uniquindio.cine.views;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import project.uniquindio.cine.models.ModelMovie;
import project.uniquindio.cine.models.ModelUser;

import java.awt.GridBagLayout;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Color;
import java.awt.Panel;
import javax.swing.UIManager;



public class ViewMovies extends JFrame implements ActionListener  {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ModelMovie asignarPelicula;
	private ModelUser datosPersona;
	
	
	LocalDate fechahoy = LocalDate.now();
	private JTextField textFieldIngresoCedula;
	private JButton capturar;
	private JLabel txtNombrePersona;
	private JButton buttomRecargar;
	private JButton buttomRegistrarse;
	String datoTextField;
	String nombre = "";
	int saldoActual;
	JButton ButtomBuscar;
	@SuppressWarnings("rawtypes")
	JComboBox comboBoxDiaSeleccionado;
	static String datoCedulaPerson;
	String datoNombrePerson;
    JLabel txtPelicula1;
    String diaSeleccionado;
    static String horaPelicula;
    
    static String nombrePelicula;



	
	public ViewMovies(String datoCedula, String datoNombre) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		datoCedulaPerson = datoCedula;
		datoNombrePerson = datoNombre;
		asignarPelicula = new ModelMovie();
		datosPersona = new ModelUser();
		setResizable(false);
		setSize(500,500);
		setBounds(250, 50, 1000, 780);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		

		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
       
			
		
			getPeli(((ArrayList<?>) asignarPelicula.getFuncions().get(0)).get(4), ((ArrayList<?>) asignarPelicula.getFuncions().get(0)).get(3).toString(),  ((ArrayList<?>) asignarPelicula.getFuncions().get(0)).get(1).toString());
			getPeli(((ArrayList<?>) asignarPelicula.getFuncions().get(1)).get(4), ((ArrayList<?>) asignarPelicula.getFuncions().get(1)).get(3).toString(),  ((ArrayList<?>) asignarPelicula.getFuncions().get(1)).get(1).toString());
			getPeli(((ArrayList<?>) asignarPelicula.getFuncions().get(2)).get(4), ((ArrayList<?>) asignarPelicula.getFuncions().get(2)).get(3).toString(),  ((ArrayList<?>) asignarPelicula.getFuncions().get(2)).get(1).toString());
		
		
			

		getAccionesCliente(fechahoy, datoCedula, datoNombre);
		this.setLocationRelativeTo(null);
	    
}
	
	

	public void getPeli(Object image, String texto, String posicion) {
		
		
		
		JButton ButtonPelicula = new JButton();
		ButtonPelicula.setIcon(new ImageIcon("imagenes/"+image+""));
		ButtonPelicula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(nombre == "") {
					JOptionPane.showMessageDialog(null, "Inicia Sesion Primero");
				
				}else {
					
					if (posicion.equals("0") ) {
						
						horaPelicula = asignarPelicula.getFuncions().get(0).get(2);
						nombrePelicula = asignarPelicula.getFuncions().get(0).get(5);
						
					} else if(posicion.equals("1")) {
						horaPelicula = asignarPelicula.getFuncions().get(1).get(2);
						nombrePelicula = asignarPelicula.getFuncions().get(1).get(5);
					} else {
						horaPelicula = asignarPelicula.getFuncions().get(2).get(2);
						nombrePelicula =  asignarPelicula.getFuncions().get(2).get(5);
					}
					
					ViewSeleccionSillas ventanaSillas = new ViewSeleccionSillas( posicion, datoTextField);
					ventanaSillas.setVisible(true);								
					
				}
			}
		});
		ButtonPelicula.setBounds(59, 129, 250, 310);
		contentPane.add(ButtonPelicula);
		 txtPelicula1 = new JLabel( "<html><p>" + texto + "</p></html>");
		txtPelicula1.setVerticalAlignment(SwingConstants.TOP);
		txtPelicula1.setForeground(Color.white);
		
		
		if (posicion.equals("0") ) {
			ButtonPelicula.setBounds(59, 129, 250, 310);
			txtPelicula1.setBounds(59, 451, 266, 160);
		} else if(posicion.equals("1")) {
			txtPelicula1.setBounds(382, 451, 242, 176);
			ButtonPelicula.setBounds(382, 129, 242, 310);
		} else {
			ButtonPelicula.setBounds(691, 129, 250, 310);
			txtPelicula1.setBounds(691, 451, 250, 190);
		}
		contentPane.add(txtPelicula1);
		
	}
	
	
       
	
		
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void getAccionesCliente(LocalDate fechahoy,String datoCedula, String datoNombre) {

			JLabel TxtCliente = new JLabel("Cédula");
			TxtCliente.setFont(new Font("Sylfaen", Font.PLAIN, 16));
			TxtCliente.setForeground(Color.WHITE);
			TxtCliente.setBounds(37, 640, 61, 32);
			contentPane.add(TxtCliente);
			
			
		
			textFieldIngresoCedula = new JTextField(datoCedula);
			
			textFieldIngresoCedula.setBounds(119, 640, 142, 25);
			contentPane.add(textFieldIngresoCedula);
			
			
			capturar = new JButton("OK");
			capturar.setBackground(Color.WHITE);
			capturar.addActionListener(this);
			capturar.setBounds(290, 642, 72, 23);
			contentPane.add(capturar);
			
			 txtNombrePersona = new JLabel(datoNombre);
			 txtNombrePersona.setFont(new Font("Sylfaen", Font.PLAIN, 16));
			 txtNombrePersona.setForeground(Color.WHITE);
			txtNombrePersona.setBounds(394, 643, 194, 27);
			contentPane.add(txtNombrePersona);
			
			
			
			buttomRecargar = new JButton("Recargar");
			buttomRecargar.setBackground(Color.WHITE);
			buttomRecargar.setFont(new Font("Tahoma", Font.PLAIN, 16));
			buttomRecargar.addActionListener(this);
			buttomRecargar.setBounds(761, 634, 153, 36);
			contentPane.add(buttomRecargar);
			
			
			JLabel txtNoTienesCuenta = new JLabel("¿No tienes Cuenta Aún?");
			txtNoTienesCuenta.setHorizontalAlignment(SwingConstants.LEFT);
			txtNoTienesCuenta.setFont(new Font("Sylfaen", Font.PLAIN, 16));
			txtNoTienesCuenta.setForeground(Color.WHITE);
			txtNoTienesCuenta.setBounds(37, 703, 179, 28);
			contentPane.add(txtNoTienesCuenta);
		
			
			buttomRegistrarse = new JButton("Registrarse");
			buttomRegistrarse.setFont(new Font("Tahoma", Font.PLAIN, 14));
			buttomRegistrarse.setBackground(Color.WHITE);
			buttomRegistrarse.addActionListener(this);
				
			buttomRegistrarse.setBounds(292, 698, 117, 29);
			contentPane.add(buttomRegistrarse);
			
			
			
			
			JLabel txtFecha = new JLabel(fechahoy.toString());
			txtFecha.setForeground(Color.WHITE);
			txtFecha.setFont(new Font("Sylfaen", Font.PLAIN, 16));
			txtFecha.setBounds(37, 29, 90, 24);
			contentPane.add(txtFecha);
			
			comboBoxDiaSeleccionado = new JComboBox();
			comboBoxDiaSeleccionado.setBackground(Color.WHITE);

			comboBoxDiaSeleccionado.setBounds(137, 25, 53, 27);
			contentPane.add(comboBoxDiaSeleccionado);
			
			
			 ButtomBuscar = new JButton("Buscar");
			 ButtomBuscar.setBorder(UIManager.getBorder("Button.border"));
			 ButtomBuscar.setBackground(Color.WHITE);
			ButtomBuscar.setBounds(37, 67, 80, 29);
			 ButtomBuscar.addActionListener(this);
			contentPane.add(ButtomBuscar);
			
			 
			
			
			
			comboBoxDiaSeleccionado.addItem("21");
			comboBoxDiaSeleccionado.addItem("22");
			comboBoxDiaSeleccionado.addItem("23");
			
			decorationView();
			
		}
	public void decorationView () {
		JLabel lblCineQuindio = new JLabel("Cine Quindío");
		lblCineQuindio.setHorizontalAlignment(SwingConstants.CENTER);
		lblCineQuindio.setForeground(Color.WHITE);
		lblCineQuindio.setFont(new Font("Sylfaen", Font.BOLD, 30));
		lblCineQuindio.setBounds(383, 45, 235, 51);
		contentPane.add(lblCineQuindio);
		
		Panel panel = new Panel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setForeground(Color.BLACK);
		panel.setBounds(809, 0, 175, 45);
		contentPane.add(panel);
		
		Panel panel_1 = new Panel();
		panel_1.setForeground(Color.BLACK);
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(641, 0, 175, 29);
		contentPane.add(panel_1);
		
		Panel panel_1_1 = new Panel();
		panel_1_1.setForeground(Color.BLACK);
		panel_1_1.setBackground(Color.LIGHT_GRAY);
		panel_1_1.setBounds(474, 0, 175, 16);
		contentPane.add(panel_1_1);
	}
		
		
		
		
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if (e.getSource() == ButtomBuscar) {	
		   diaSeleccionado = (String) comboBoxDiaSeleccionado.getSelectedItem();
		   
		}
		
		if (e.getSource()== capturar) {
			
			datoTextField = textFieldIngresoCedula.getText();
			if(datosPersona.estaEnBaseDatos(datoTextField.trim())) {
				
				
             nombre	= datosPersona.getName(datoTextField.trim() );
             txtNombrePersona.setText(nombre);
             
             
             saldoActual = datosPersona.getSaldo(datoTextField.trim());
             
                 
             
             
			    JOptionPane.showMessageDialog(null, "Inicio Sesion Correcto");


			} else {
				
				datoTextField = "";
				textFieldIngresoCedula.setText(datoTextField);
				txtNombrePersona.setText(nombre);
				nombre = "";
				saldoActual = 0;
				JOptionPane.showMessageDialog(null, "No Tienes Cuenta, Create Una");
				
				
			}
		}
		
		if (e.getSource()== buttomRecargar) {
			
			if(nombre == "") {
				JOptionPane.showMessageDialog(null, "Inicia Sesion Primero");
			
			} else {
				
				ViewRecarga ventanaRecargar  = new 	ViewRecarga(datoTextField, nombre,saldoActual);
				ventanaRecargar.setVisible(true);
				
			}
		}
		
		if (e.getSource()== buttomRegistrarse) {
			
			ViewRegister ventanaRegistrarse = new ViewRegister();
			ventanaRegistrarse.setVisible(true);
		
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}

