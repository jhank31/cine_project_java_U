package project.uniquindio.cine.views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import project.uniquindio.cine.models.ModelSillas;
import project.uniquindio.cine.models.ModelUser;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class ViewFactura extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField_efectivo = new JTextField();;
	private JTextField textField_PSE = new JTextField();
	private JTextField textField_SaldoTargeta = new JTextField();
	JButton ButtomPagar;
	static String datoCedulaPerson;
	static String nombre;
	static int puntos;
	static LocalDate fechahoy = LocalDate.now();
	private ModelUser datosPersona;
	static ViewMovies ventanaPelicula;
	static int montoTotalSillasYConfi;
	static String datosCompraConfi;
	JSpinner spinnerPuntos = new JSpinner(new SpinnerNumberModel(0, 0, ModelUser.datosPersona.get(ModelUser.getPosicionClienteLogueado()).get(4), 1));
	static ModelSillas sillas = new ModelSillas();
	static JCheckBox checkbox_saldo = new JCheckBox("usar");
	static int isSelected = 0;
	JCheckBox checkbox_puntos = new JCheckBox("usar");

	public ViewFactura(String datoCedula, int totalDineroSillasConfi, String datosCompra) {
		
		
		textField_efectivo.setEnabled(false);
		textField_PSE.setEnabled(false);
		spinnerPuntos.setEnabled(false);
		textField_SaldoTargeta.setEnabled(false);
		Integer numPuntos  = Integer.parseInt(ModelUser.datosPersona.get(ModelUser.getPosicionClienteLogueado()).get(4).toString());
		
		if ( (ModelUser.getNumeroSillas() * 150) >  numPuntos ) {
			checkbox_puntos.setEnabled(false);
			spinnerPuntos.setEnabled(false);
		}
		Integer saldoTarjeta = Integer
				.parseInt(ModelUser.datosPersona.get(ModelUser.getPosicionClienteLogueado()).get(3).toString());
		if (saldoTarjeta < ModelUser.getTotalPagar()) {
			checkbox_saldo.setEnabled(false);
			textField_SaldoTargeta.setEnabled(false);
		}

		datosCompraConfi = datosCompra;
		montoTotalSillasYConfi = totalDineroSillasConfi;
		datosPersona = new ModelUser();
		nombre = datosPersona.getName(datoCedula);
		datoCedulaPerson = datoCedula;
		puntos = datosPersona.getPuntos(datoCedula);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(500, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		getResumenCompra();
		this.setLocationRelativeTo(null);

	}

	public void getResumenCompra() {

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
		label_espacio_nombre_usuario.setForeground(Color.WHITE);
		label_espacio_nombre_usuario.setBounds(292, 80, 182, 24);
		contentPane.add(label_espacio_nombre_usuario);

		JLabel lblCc = new JLabel("CC");
		lblCc.setForeground(Color.WHITE);
		lblCc.setBounds(66, 104, 124, 24);
		contentPane.add(lblCc);

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

		JLabel label_espacio_funcion = new JLabel(ViewMovies.horaPelicula);
		label_espacio_funcion.setForeground(Color.WHITE);
		label_espacio_funcion.setBounds(292, 179, 254, 24);
		contentPane.add(label_espacio_funcion);

		JLabel label_pelicula = new JLabel("Pelicula");
		label_pelicula.setForeground(Color.WHITE);
		label_pelicula.setBounds(66, 203, 124, 24);
		contentPane.add(label_pelicula);

		JLabel label_espacio_pelicula = new JLabel(ViewMovies.nombrePelicula);
		label_espacio_pelicula.setForeground(Color.WHITE);
		label_espacio_pelicula.setBounds(292, 203, 254, 24);
		contentPane.add(label_espacio_pelicula);

		JLabel label_sillas = new JLabel("sillas");
		label_sillas.setForeground(Color.WHITE);
		label_sillas.setBounds(66, 228, 124, 24);
		contentPane.add(label_sillas);

		JLabel label_espacio_sillas = new JLabel("<html><p>" + ModelSillas.puestosOcupados.toString() + "</p></html>");
		label_espacio_sillas.setVerticalAlignment(SwingConstants.TOP);
		label_espacio_sillas.setForeground(Color.WHITE);
		label_espacio_sillas.setBounds(292, 228, 182, 66);
		contentPane.add(label_espacio_sillas);

		JLabel label_confiteria = new JLabel("Confiteria");
		label_confiteria.setForeground(Color.WHITE);
		label_confiteria.setBounds(66, 300, 124, 24);
		contentPane.add(label_confiteria);

		JLabel lblComboAmigosX = new JLabel("<html><p>" + datosCompraConfi + "</p></html>");
		lblComboAmigosX.setVerticalAlignment(SwingConstants.TOP);
		lblComboAmigosX.setForeground(Color.WHITE);
		lblComboAmigosX.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblComboAmigosX.setBounds(292, 305, 182, 39);
		contentPane.add(lblComboAmigosX);

		JLabel label_total = new JLabel("Total");
		label_total.setForeground(Color.WHITE);
		label_total.setBounds(66, 409, 124, 24);
		contentPane.add(label_total);

		JLabel label_espacio_total = new JLabel(ModelUser.getTotalPagar() + "");
		label_espacio_total.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_espacio_total.setForeground(Color.WHITE);
		label_espacio_total.setBounds(292, 409, 254, 24);
		contentPane.add(label_espacio_total);

		JLabel label_descuento = new JLabel("Descuento");
		label_descuento.setForeground(Color.WHITE);
		label_descuento.setBounds(66, 380, 124, 24);
		contentPane.add(label_descuento);

		JLabel label_espacio_descuento = new JLabel(ModelUser.getDescuento() + "");
		label_espacio_descuento.setForeground(Color.WHITE);
		label_espacio_descuento.setBounds(292, 380, 254, 24);
		contentPane.add(label_espacio_descuento);

		JLabel label_total_1 = new JLabel("Subtotal");
		label_total_1.setForeground(Color.WHITE);
		label_total_1.setBounds(66, 345, 124, 24);
		contentPane.add(label_total_1);

		JLabel label_espacio_descuento_1 = new JLabel(montoTotalSillasYConfi + "");
		label_espacio_descuento_1.setForeground(Color.WHITE);
		label_espacio_descuento_1.setBounds(292, 345, 254, 24);
		contentPane.add(label_espacio_descuento_1);

		JLabel label_efectivo = new JLabel("Efectivo");
		label_efectivo.setForeground(Color.WHITE);
		label_efectivo.setBounds(66, 459, 63, 24);
		contentPane.add(label_efectivo);

		textField_efectivo.setBounds(236, 459, 107, 24);
		contentPane.add(textField_efectivo);
		textField_efectivo.setColumns(10);

		JCheckBox checkbox_efectivo = new JCheckBox("usar");
		checkbox_efectivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkbox_efectivo.isSelected()) {
					textField_efectivo.setEnabled(true);
					isSelected += 1;
				} else {
					textField_efectivo.setEnabled(false);
					isSelected -= 1;
				}
			}
		});
		checkbox_efectivo.setBackground(Color.BLACK);
		checkbox_efectivo.setForeground(Color.WHITE);
		checkbox_efectivo.setBounds(370, 461, 93, 21);
		contentPane.add(checkbox_efectivo);

		JLabel label_PSE = new JLabel("PSE");
		label_PSE.setForeground(Color.WHITE);
		label_PSE.setBounds(66, 494, 124, 24);
		contentPane.add(label_PSE);

		textField_PSE.setBounds(236, 494, 107, 24);
		contentPane.add(textField_PSE);
		textField_PSE.setColumns(10);

		JCheckBox checkbox_PSE = new JCheckBox("usar");
		checkbox_PSE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkbox_PSE.isSelected()) {
					textField_PSE.setEnabled(true);
					isSelected += 1;
				} else {
					textField_PSE.setEnabled(false);
					isSelected -= 1;
				}
			}
		});
		checkbox_PSE.setForeground(Color.WHITE);
		checkbox_PSE.setBackground(Color.BLACK);
		checkbox_PSE.setBounds(370, 496, 93, 21);
		contentPane.add(checkbox_PSE);

		JLabel label_puntos = new JLabel("Puntos");
		label_puntos.setForeground(Color.WHITE);
		label_puntos.setBounds(66, 529, 69, 24);
		contentPane.add(label_puntos);

		spinnerPuntos.setBounds(236, 528, 107, 26);
		contentPane.add(spinnerPuntos);

		
		checkbox_puntos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkbox_puntos.isSelected()) {
					spinnerPuntos.setEnabled(true);
					textField_efectivo.setEnabled(false);
					textField_PSE.setEnabled(false);
					textField_SaldoTargeta.setEnabled(false);
					checkbox_saldo.setEnabled(false);
					checkbox_PSE.setEnabled(false);
					checkbox_efectivo.setEnabled(false);
					isSelected += 1;
				} else {
					spinnerPuntos.setEnabled(false);
					textField_efectivo.setEnabled(true);
					textField_PSE.setEnabled(true);
					checkbox_PSE.setEnabled(true);
					checkbox_efectivo.setEnabled(true);
					isSelected -= 1;
				}
			}
		});
		checkbox_puntos.setForeground(Color.WHITE);
		checkbox_puntos.setBackground(Color.BLACK);
		checkbox_puntos.setBounds(370, 531, 93, 21);
		contentPane.add(checkbox_puntos);

		JLabel label_SaldoEnTargeta = new JLabel("Saldo en targeta");
		label_SaldoEnTargeta.setForeground(Color.WHITE);
		label_SaldoEnTargeta.setBounds(66, 564, 124, 24);
		contentPane.add(label_SaldoEnTargeta);

		textField_SaldoTargeta.setBounds(236, 563, 108, 26);
		contentPane.add(textField_SaldoTargeta);
		textField_SaldoTargeta.setColumns(10);
		checkbox_saldo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkbox_saldo.isSelected()) {
					textField_SaldoTargeta.setEnabled(true);
					isSelected += 1;
				} else {
					textField_SaldoTargeta.setEnabled(false);
					isSelected -= 1;
				}
			}
		});

		checkbox_saldo.setForeground(Color.WHITE);
		checkbox_saldo.setBackground(Color.BLACK);
		checkbox_saldo.setBounds(370, 566, 93, 21);
		contentPane.add(checkbox_saldo);

		ButtomPagar = new JButton("Pagar");
		ButtomPagar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ButtomPagar.addActionListener(this);

		ButtomPagar.setBounds(322, 600, 107, 35);
		contentPane.add(ButtomPagar);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ModelSillas.remove(ModelSillas.puestosOcupados);
		
		int efectivo =0 ,pse =0 ,tarjeta =0 ,puntos  =0 ;
		
		
		if (e.getSource() == ButtomPagar) {
			
			if ( !(textField_efectivo.getText()).isEmpty()) {
				efectivo = Integer.parseInt(textField_efectivo.getText());
			} 
			if ( !(textField_PSE.getText()).isEmpty()) {
				pse = Integer.parseInt(textField_PSE.getText());
			} 
			if ( !(textField_SaldoTargeta.getText()).isEmpty()) {
				tarjeta = Integer.parseInt(textField_SaldoTargeta.getText());
			}
			if ( !(spinnerPuntos.getValue().toString()).equals("0")) {
				puntos = Integer.parseInt(spinnerPuntos.getValue().toString());
			} 
			if ( isSelected > 2 ) {
				JOptionPane.showMessageDialog(null, "Solo puedes usar 2 metodos de pago");
			}
			
			
			
			if ( efectivo  >= ModelUser.getTotalPagar()  ) {
				JOptionPane.showMessageDialog(null, "Pagaste con efectivo");
				dispose();
			}
			if ( pse  >= ModelUser.getTotalPagar()  ) {
				JOptionPane.showMessageDialog(null, "Pagaste con PSE");
				dispose();
			}
			if ( tarjeta  >=ModelUser.getTotalPagar()  ) {
				JOptionPane.showMessageDialog(null, "Pagaste con tarjeta");
				dispose();
			}
			if ( puntos  >=  ModelUser.getNumeroSillas() * 150)   {
				JOptionPane.showMessageDialog(null, "Pagaste con puntos");
				dispose();
			}
			if ( efectivo + tarjeta >= ModelUser.getTotalPagar() ) {
				JOptionPane.showMessageDialog(null, "Pagaste en efectivo y con tarjeta");
				dispose();
			} else {
				JOptionPane.showMessageDialog(null, "No le alcanza el dinero, elige otras opciones");
				 
			}
			if ( efectivo + pse >= ModelUser.getTotalPagar() ) {
				JOptionPane.showMessageDialog(null, "Pagaste en efectivo y con pse");
				dispose();
			}else {
				JOptionPane.showMessageDialog(null, "No le alcanza el dinero,  elige otras opciones");
				 
			} 
			if ( pse + tarjeta >= ModelUser.getTotalPagar() ) {
				JOptionPane.showMessageDialog(null, "Pagaste con tarjeta y con pse");
				dispose();
			} else {
				JOptionPane.showMessageDialog(null, "No le alcanza el dinero,  elige otras opciones");
			}
			
			
			dispose();
		}

	}
}
