package project.uniquindio.cine.views;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import project.uniquindio.cine.models.ModelUser;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class ViewFactura extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField_efectivo;
	private JTextField textField_PSE;
	private JTextField textField_SaldoTargeta;
	JButton ButtomPagar ;
	static String datoCedulaPerson;
	static String nombre;
	static int puntos;
	 static LocalDate fechahoy = LocalDate.now();
     private ModelUser datosPersona;
     static ViewMovies ventanaPelicula;
     static int montoTotalSillasYConfi;
     static String datosCompraConfi;

	 
	 


	
	public ViewFactura(String datoCedula, int totalDineroSillasConfi, String datosCompra) {
		datosCompraConfi = datosCompra;
		montoTotalSillasYConfi = totalDineroSillasConfi;
		datosPersona = new ModelUser();
		nombre = datosPersona.getName(datoCedula );
		datoCedulaPerson = datoCedula;
	    puntos = datosPersona.getPuntos(datoCedula);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(500,700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		getResumenCompra();
		this.setLocationRelativeTo(null);
		
	}	
	
	
	public void getResumenCompra () {
		

		JLabel txt_Resumendecompra = new JLabel("Resumen de compra");
		txt_Resumendecompra.setForeground(Color.WHITE);
		txt_Resumendecompra.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt_Resumendecompra.setHorizontalAlignment(SwingConstants.CENTER);
		txt_Resumendecompra.setBounds(133, 10, 210, 18);
		contentPane.add(txt_Resumendecompra);
		
		JLabel label_nombre_usuario = new JLabel("Nombre Usuario");
		label_nombre_usuario.setForeground(Color.WHITE);
		label_nombre_usuario.setBounds(66, 80, 124, 24);
		contentPane.add(label_nombre_usuario);
		
		JLabel label_espacio_nombre_usuario = new JLabel(nombre);
		label_espacio_nombre_usuario.setBounds(264, 80, 182, 24);
		contentPane.add(label_espacio_nombre_usuario);
		
		JLabel label_Tipo_Tarjeta = new JLabel("TI");
		label_Tipo_Tarjeta.setForeground(Color.WHITE);
		label_Tipo_Tarjeta.setBounds(66, 104, 124, 24);
		contentPane.add(label_Tipo_Tarjeta);
		
		JLabel label_espacio_tipo_targeta = new JLabel(datoCedulaPerson);
		label_espacio_tipo_targeta.setForeground(Color.WHITE);
		label_espacio_tipo_targeta.setBounds(292, 104, 182, 24);
		contentPane.add(label_espacio_tipo_targeta);
		
		JLabel Label_puntos = new JLabel("puntos");
		Label_puntos.setForeground(Color.WHITE);
		Label_puntos.setBounds(66, 129, 124, 24);
		contentPane.add(Label_puntos);
		
		JLabel label_espacio_puntos = new JLabel(puntos + "");
		label_espacio_puntos.setForeground(Color.WHITE);
		label_espacio_puntos.setBounds(292, 129, 254, 24);
		contentPane.add(label_espacio_puntos);
		
		JLabel label_fecha = new JLabel("Fecha");
		label_fecha.setForeground(Color.WHITE);
		label_fecha.setBounds(66, 154, 124, 24);
		contentPane.add(label_fecha);
		
		JLabel label_espacio_fecha = new JLabel(fechahoy.toString());
		label_espacio_fecha.setForeground(Color.WHITE);
		label_espacio_fecha.setBounds(292, 154, 254, 24);
		contentPane.add(label_espacio_fecha);
		
		JLabel label_funcion = new JLabel("Función");
		label_funcion.setForeground(Color.WHITE);
		label_funcion.setBounds(66, 179, 124, 24);
		contentPane.add(label_funcion);
		
		JLabel label_espacio_funcion = new JLabel( ViewMovies.horaPelicula);
		label_espacio_funcion.setForeground(Color.WHITE);
		label_espacio_funcion.setBounds(292, 179, 254, 24);
		contentPane.add(label_espacio_funcion);
		
		JLabel label_pelicula = new JLabel("Pelicula");
		label_pelicula.setForeground(Color.WHITE);
		label_pelicula.setBounds(66, 203, 124, 24);
		contentPane.add(label_pelicula);
		
		JLabel label_espacio_pelicula = new JLabel(ViewMovies.nombrePelicula);
		label_espacio_pelicula.setBounds(292, 203, 254, 24);
		contentPane.add(label_espacio_pelicula);
		
		JLabel label_sillas = new JLabel("sillas");
		label_sillas.setForeground(Color.WHITE);
		label_sillas.setBounds(66, 228, 124, 24);
		contentPane.add(label_sillas);
		
		JLabel label_espacio_sillas = new JLabel("");
		label_espacio_sillas.setForeground(Color.WHITE);
		label_espacio_sillas.setBounds(292, 228, 254, 24);
		contentPane.add(label_espacio_sillas);
		
		JLabel label_confiteria = new JLabel("Confiteria");
		label_confiteria.setForeground(Color.WHITE);
		label_confiteria.setBounds(66, 253, 124, 24);
		contentPane.add(label_confiteria);
		
		
		JLabel lblComboAmigosX = new JLabel(datosCompraConfi);
		lblComboAmigosX.setForeground(Color.WHITE);
		lblComboAmigosX.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblComboAmigosX.setBounds(292, 253, 254, 24);
		contentPane.add(lblComboAmigosX);
		
		
		JLabel label_total = new JLabel("Total");
		label_total.setForeground(Color.WHITE);
		label_total.setBounds(66, 305, 124, 24);
		contentPane.add(label_total);
		

		JLabel label_espacio_total = new JLabel(montoTotalSillasYConfi + "");
		label_espacio_total.setForeground(Color.WHITE);
		label_espacio_total.setBounds(292, 305, 254, 24);
		contentPane.add(label_espacio_total);
		
		JLabel label_descuento = new JLabel("Descuento");
		label_descuento.setForeground(Color.WHITE);
		label_descuento.setBounds(66, 330, 124, 24);
		contentPane.add(label_descuento);
		
		JLabel label_espacio_descuento = new JLabel("");
		label_espacio_descuento.setBounds(264, 330, 254, 24);
		contentPane.add(label_espacio_descuento);
		
		
		
		
		JLabel label_efectivo = new JLabel("Efectivo");
		label_efectivo.setForeground(Color.WHITE);
		label_efectivo.setBounds(66, 415, 63, 24);
		contentPane.add(label_efectivo);
		
		textField_efectivo = new JTextField();
		textField_efectivo.setBounds(236, 415, 107, 24);
		contentPane.add(textField_efectivo);
		textField_efectivo.setColumns(10);
		
		JCheckBox checkbox_efectivo = new JCheckBox("usar");
		checkbox_efectivo.setBackground(Color.BLACK);
		checkbox_efectivo.setForeground(Color.WHITE);
		checkbox_efectivo.setBounds(370, 417, 93, 21);
		contentPane.add(checkbox_efectivo);
		
		
		
		
		JLabel label_PSE = new JLabel("PSE");
		label_PSE.setForeground(Color.WHITE);
		label_PSE.setBounds(66, 451, 124, 24);
		contentPane.add(label_PSE);

		textField_PSE = new JTextField();
		textField_PSE.setBounds(236, 451, 107, 24);
		contentPane.add(textField_PSE);
		textField_PSE.setColumns(10);
		
		JCheckBox checkbox_PSE = new JCheckBox("usar");
		checkbox_PSE.setForeground(Color.WHITE);
		checkbox_PSE.setBackground(Color.BLACK);
		checkbox_PSE.setBounds(370, 453, 93, 21);
		contentPane.add(checkbox_PSE);
		
		
		
		
		
		JLabel label_puntos = new JLabel("Puntos");
		label_puntos.setForeground(Color.WHITE);
		label_puntos.setBounds(66, 487, 69, 24);
		contentPane.add(label_puntos);
		

		JSpinner spinnerPuntos = new JSpinner();
		spinnerPuntos.setBounds(236, 486, 107, 26);
		contentPane.add(spinnerPuntos);
		
		JCheckBox checkbox_puntos = new JCheckBox("usar");
		checkbox_puntos.setForeground(Color.WHITE);
		checkbox_puntos.setBackground(Color.BLACK);
		checkbox_puntos.setBounds(370, 489, 93, 21);
		contentPane.add(checkbox_puntos);
		
		
		
		
		JLabel label_SaldoEnTargeta= new JLabel("Saldo en targeta");
		label_SaldoEnTargeta.setForeground(Color.WHITE);
		label_SaldoEnTargeta .setBounds(66, 520, 124, 24);
		contentPane.add(label_SaldoEnTargeta);
		
		textField_SaldoTargeta = new JTextField();
		textField_SaldoTargeta.setBounds(235, 519, 108, 26);
		contentPane.add(textField_SaldoTargeta);
		textField_SaldoTargeta.setColumns(10);
		
		JCheckBox checkbox_saldo = new JCheckBox("usar");
		checkbox_saldo.setForeground(Color.WHITE);
		checkbox_saldo.setBackground(Color.BLACK);
		checkbox_saldo.setBounds(370, 522, 93, 21);
		contentPane.add(checkbox_saldo);
		
		 ButtomPagar = new JButton("Pagar");
		 ButtomPagar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 ButtomPagar.addActionListener(this);

		ButtomPagar.setBounds(322, 600, 107, 35);
		contentPane.add(ButtomPagar);
		
		
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {	
		
		if(e.getSource() == ButtomPagar ) {
			dispose();
		}
		
		
	}
}
