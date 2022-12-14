package project.uniquindio.cine.views;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import project.uniquindio.cine.models.ModelUser;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")


public class ViewRegister extends JFrame implements ActionListener {
		
		private JPanel contentPane;
		private JTextField textFieldIntroducirCedula;
		private JTextField textFieldIntroducirNombre;
		private JTextField textFieldIntroducirMontoRecargar;
		private JCheckBox checkBoxAsignarBasic ;
		private JButton buttomCrearUsuario;
		private ModelUser datosPersona = new ModelUser();
	
		
		public ViewRegister() {
			this.setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setResizable(false);	
			this.setLocationRelativeTo(null);
			setSize(500,500);
			setBounds(250, 100, 315, 400);
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
			
			
			
			getRegistro();
			this.setLocationRelativeTo(null);
			
		
		}
		
		
			
			
		
			 
		public void getRegistro () {
		JLabel lblNewLabel_3 = new JLabel("REGISTRO");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(45, 36, 196, 31);
		contentPane.add(lblNewLabel_3);
		
		JLabel txtCedula = new JLabel("C??dula");
		txtCedula.setForeground(Color.WHITE);
		txtCedula.setBounds(45, 98, 61, 16);
		contentPane.add(txtCedula);
		
		textFieldIntroducirCedula = new JTextField();
		textFieldIntroducirCedula.setBounds(141, 93, 130, 26);
		textFieldIntroducirCedula.addActionListener(this);
		contentPane.add(textFieldIntroducirCedula);
		textFieldIntroducirCedula.setColumns(10);
		
		JLabel txtNombre = new JLabel("Nombre");
		txtNombre.setForeground(Color.WHITE);
		 txtNombre.setBounds(45, 152, 61, 16);
		contentPane.add( txtNombre);
		
		textFieldIntroducirNombre = new JTextField();
		textFieldIntroducirNombre.setBounds(141, 147, 130, 26);
		textFieldIntroducirNombre.addActionListener(this);
		contentPane.add(textFieldIntroducirNombre);
		textFieldIntroducirNombre.setColumns(10);
		
		
		checkBoxAsignarBasic = new JCheckBox("Basic");
		checkBoxAsignarBasic.setBackground(Color.BLACK);
		checkBoxAsignarBasic.setForeground(Color.WHITE);
		checkBoxAsignarBasic.setBounds(141, 187, 128, 23);
		checkBoxAsignarBasic.addActionListener(this);
		contentPane.add(checkBoxAsignarBasic);
		
		JLabel txtRegarga = new JLabel("Recarga $");
		txtRegarga.setForeground(Color.WHITE);
		txtRegarga.setBounds(45, 227, 61, 16);
		contentPane.add(txtRegarga);
		
		textFieldIntroducirMontoRecargar = new JTextField("");
		textFieldIntroducirMontoRecargar.setBounds(141, 222, 130, 26);
		textFieldIntroducirMontoRecargar.addActionListener(this);
		contentPane.add(textFieldIntroducirMontoRecargar);
		textFieldIntroducirMontoRecargar.setColumns(10);
		
		 buttomCrearUsuario = new JButton("Crear Usuario");
		 buttomCrearUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		 buttomCrearUsuario.setBackground(Color.WHITE);
		 buttomCrearUsuario.setForeground(Color.BLACK);
		buttomCrearUsuario.addActionListener(this);
		buttomCrearUsuario.setBounds(92, 277, 117, 29);
		contentPane.add(buttomCrearUsuario);
		
		decorationView();
		
			
		}
		
		public void decorationView( ) {
			Panel panel = new Panel();
			panel.setBackground(Color.GRAY);
			panel.setBounds(199, 0, 100, 16);
			contentPane.add(panel);
			
			Panel panel_1 = new Panel();
			panel_1.setBackground(Color.LIGHT_GRAY);
			panel_1.setBounds(109, 0, 100, 10);
			contentPane.add(panel_1);
			
			Panel panel_2 = new Panel();
			panel_2.setBackground(Color.GRAY);
			panel_2.setBounds(0, 345, 100, 16);
			contentPane.add(panel_2);
			
			Panel panel_1_1 = new Panel();
			panel_1_1.setBackground(Color.LIGHT_GRAY);
			panel_1_1.setBounds(92, 351, 100, 10);
			contentPane.add(panel_1_1);
		}

	@Override
	public void actionPerformed(ActionEvent e) {
			
		if(e.getSource() == buttomCrearUsuario) {
			
			String cedula = textFieldIntroducirCedula.getText();
			String nombre = textFieldIntroducirNombre.getText();
            int basic = 0;
            String montoRecargar = textFieldIntroducirMontoRecargar.getText(); 
            int numeroMontoRecarga =Integer.parseInt(montoRecargar);
            
			if(checkBoxAsignarBasic.isSelected()) {
				basic = 1;
			}
			
			
			if (cedula.isEmpty() || nombre.isEmpty() || montoRecargar.isEmpty()) {
				
				JOptionPane.showMessageDialog(null, "Te faltan datos por ingresar!");

				
			}else {
				System.out.println(cedula);
				System.out.println(nombre);			
				System.out.println(basic);
				System.out.println(numeroMontoRecarga);
				datosPersona.addPersona(cedula,nombre,basic,numeroMontoRecarga);
				ModelUser.setPosicionClienteLogueado(datosPersona.getIndexPer(cedula));
				
				dispose();
				JOptionPane.showMessageDialog(null, "Registro Exitoso");
			}
		}
	}
}
