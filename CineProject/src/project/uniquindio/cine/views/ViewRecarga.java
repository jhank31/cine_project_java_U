package project.uniquindio.cine.views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import project.uniquindio.cine.models.ModelUser;

import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

@SuppressWarnings("serial")
public class ViewRecarga extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textFieldIngresarMonto;
	private JButton buttomComprar;
	private ModelUser datosPersona;
	String datoCedula;
	String datoNombre;

	

	/**
	 * Launch the application.
	 */
	
	public ViewRecarga(String cedula, String nombre, int saldoActual) {
	
		datoCedula = cedula;
		datoNombre = nombre;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		datosPersona = new ModelUser();
		setBounds(100, 100,  315, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		getRecargar(cedula, nombre, saldoActual);
		this.setLocationRelativeTo(null);
		
		
	}
	
		public void getRecargar(String cedula, String nombre, int saldoActual) {
			
			JLabel txtCedula = new JLabel("Cédula");
			txtCedula.setFont(new Font("Tahoma", Font.PLAIN, 13));
			txtCedula.setForeground(Color.WHITE);
			txtCedula.setBounds(43, 36, 61, 16);
			contentPane.add(txtCedula);
			
			JLabel txtInfoCedula = new JLabel(cedula);
			txtInfoCedula.setFont(new Font("Tahoma", Font.PLAIN, 13));
			txtInfoCedula.setForeground(Color.WHITE);
			txtInfoCedula.setBounds(145, 36, 144, 16);
			contentPane.add(txtInfoCedula);
			
			JLabel txtNombre = new JLabel("Nombre");
			txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 13));
			txtNombre.setForeground(Color.WHITE);
			txtNombre.setBounds(43, 83, 61, 16);
			contentPane.add(txtNombre);
			
			JLabel txtInfoNombre = new JLabel(nombre);
			txtInfoNombre.setFont(new Font("Tahoma", Font.PLAIN, 13));
			txtInfoNombre.setForeground(Color.WHITE);
			txtInfoNombre.setBounds(145, 83, 130, 16);
			contentPane.add(txtInfoNombre);
			
			
			
			JCheckBox checkBoxGold = new JCheckBox("Gold");
			checkBoxGold.setBackground(Color.WHITE);
			checkBoxGold.setForeground(Color.BLACK);
			checkBoxGold.setBounds(43, 140, 74, 23);
			contentPane.add(checkBoxGold);
			
			JCheckBox checkBoxBasic = new JCheckBox("Basic");
			checkBoxBasic.setBackground(Color.WHITE);
			checkBoxBasic.setForeground(Color.BLACK);
			checkBoxBasic.setBounds(147, 140, 74, 23);
			contentPane.add(checkBoxBasic);
			
			JLabel txtInfoSaldoActual = new JLabel("Saldo Actual");
			txtInfoSaldoActual.setFont(new Font("Tahoma", Font.PLAIN, 13));
			txtInfoSaldoActual.setForeground(Color.WHITE);
			txtInfoSaldoActual.setBounds(43, 185, 113, 16);
			contentPane.add(txtInfoSaldoActual);
			JLabel txtInfoSaldoActualPerson = new JLabel("" + saldoActual);
			txtInfoSaldoActualPerson.setFont(new Font("Tahoma", Font.PLAIN, 13));
			txtInfoSaldoActualPerson.setForeground(Color.WHITE);
			txtInfoSaldoActualPerson.setBounds(156, 185, 121, 16);
			contentPane.add(txtInfoSaldoActualPerson);
			
			JLabel txtRecarga = new JLabel("Recarga");
			txtRecarga.setFont(new Font("Tahoma", Font.PLAIN, 13));
			txtRecarga.setForeground(Color.WHITE);
			txtRecarga.setBounds(43, 237, 61, 16);
			contentPane.add(txtRecarga);
			
			
			textFieldIngresarMonto = new JTextField();
			textFieldIngresarMonto.setBackground(Color.WHITE);
			textFieldIngresarMonto.setBounds(145, 232, 130, 26);
			contentPane.add(textFieldIngresarMonto);
			textFieldIngresarMonto.setColumns(10);
			
			buttomComprar = new JButton("Comprar");
			buttomComprar.addActionListener(this);
			buttomComprar.setBounds(85, 290, 137, 37);
			contentPane.add(buttomComprar);
			
			
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == buttomComprar) {
				
				String datoMontoRecargar = textFieldIngresarMonto.getText();
				int montoRecargar = Integer.parseInt(datoMontoRecargar);
				datosPersona.addRecarga(datoCedula, montoRecargar);
				
				dispose();
			}
			
		}
		
		
		
	}



