package project.uniquindio.cine.views;


import javax.swing.JFrame;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import project.uniquindio.cine.models.ModelUser;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import java.awt.Color;
import javax.swing.SwingConstants;



@SuppressWarnings("serial")
public class ViewConfiteria extends JFrame implements ActionListener {
	private JButton ButtomSiguiente;
	static String datoCedulaPerson;
	 JSpinner spinner_combo1;
	 JSpinner spinner_combo2;
	 JSpinner spinner_combo3;
	 int cantidadCombo1;
	 int cantidadCombo2;
	 int cantidadCombo3;
	 private ModelUser datosPersona;
	 int datoTotalCompra = 0;
	 static int totalCompraSillas = 0;
	 static int totalAPagar = 0;
	 static String datosDeCompra = "";
	

	 
	
	
	public ViewConfiteria(String cedula,int totalDineroSillas ) {
		getContentPane().setBackground(Color.BLACK);
		totalCompraSillas = totalDineroSillas;
		datosPersona = new ModelUser();
		datoCedulaPerson = cedula;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setSize(500,500);
		setBounds(250, 50, 1000, 780);
		getContentPane().setLayout(null);
		getConfiteria();
		this.setLocationRelativeTo(null);
		
	
}
	
		
	
		public void getConfiteria (){
		
		JLabel txtCafeteria = new JLabel("Confiteria");
		txtCafeteria.setHorizontalAlignment(SwingConstants.CENTER);
		txtCafeteria.setForeground(Color.WHITE);
		txtCafeteria.setBackground(Color.BLACK);
		txtCafeteria.setFont(new Font("Sylfaen", Font.BOLD, 34));
		txtCafeteria.setBounds(357, 26, 243, 48);
		getContentPane().add(txtCafeteria);
		
		JLabel label_imagen1 = new JLabel("");
		label_imagen1.setIcon(new ImageIcon("imagenes/COMBO-1.png"));
		label_imagen1.setBounds(92, 111, 388, 232);
		getContentPane().add(label_imagen1);
		
		spinner_combo1 = new JSpinner(new SpinnerNumberModel(0,0,10,1));
		SpinnerNumberModel nm = new SpinnerNumberModel();
		nm.setMaximum(50);
		nm.setMaximum(0);
		spinner_combo1.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				 cantidadCombo1 = (int) spinner_combo1.getValue();
			}
		
		});
		spinner_combo1.setBounds(253, 355, 36, 20);
		getContentPane().add(spinner_combo1);
		
		
		
		
		
		JLabel label_imagen2 = new JLabel("");
		label_imagen2.setIcon(new ImageIcon("imagenes/COMBO-2.png"));
		label_imagen2.setBounds(92, 436, 390, 231);
		getContentPane().add(label_imagen2);
		
		spinner_combo2 = new JSpinner();
		spinner_combo2.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				cantidadCombo2 = (int) spinner_combo2.getValue();
			}
		
		});
		spinner_combo2.setBounds(718, 354, 36, 22);
		getContentPane().add(spinner_combo2);
		
		
		
		
		
		JLabel label_imagen3 = new JLabel("");
		label_imagen3.setIcon(new ImageIcon("imagenes/COMBO-3.png"));
		label_imagen3.setBounds(542, 114, 390, 229);
		getContentPane().add(label_imagen3);
		
		 spinner_combo3 = new JSpinner();
		 spinner_combo3.addChangeListener(new ChangeListener() {
				@Override
				public void stateChanged(ChangeEvent e) {
					 cantidadCombo3 = (int) spinner_combo3.getValue();
				}
			
			});
		spinner_combo3.setBounds(253, 680, 42, 20);
		getContentPane().add(spinner_combo3);
		
	
		 ButtomSiguiente = new JButton("Siguiente");
			ButtomSiguiente.addActionListener(this);

		 ButtomSiguiente.setBounds(779, 615, 160, 51);
		getContentPane().add(ButtomSiguiente);
		
		

}



		


		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			if(cantidadCombo1 > 0) {
				
				datosDeCompra += "Combo Amigos x" + cantidadCombo1+ ", ";
				
			}
			
            if(cantidadCombo2 > 0) {
				
				datosDeCompra += "Combo Mio x" + cantidadCombo2 +", ";
				
			}
            
              if(cantidadCombo3 > 0) {
				
				datosDeCompra += "Combo Kids x" + cantidadCombo3 + " ";
			}
			
			
              
              
              System.out.println(datosDeCompra);
			
            if(datosPersona.getTipoTarjeta(datoCedulaPerson) == 0 || datosPersona.getTipoTarjeta(datoCedulaPerson) == 1 ) {
				
				datoTotalCompra = ( cantidadCombo1*72600 ) +  (cantidadCombo2* 31400) +  (cantidadCombo3* 20100);
				
				
			}else {
				datoTotalCompra = ( cantidadCombo1* 58100 ) +  ( cantidadCombo2* 25100 ) +  ( cantidadCombo3* 16100 );

			}
            
			 totalAPagar = datoTotalCompra + totalCompraSillas;
			
			
			 System.out.println(totalAPagar);
			
			if(e.getSource() == ButtomSiguiente) {
					
				ViewFactura ventanaFactura = new ViewFactura(datoCedulaPerson, totalAPagar,datosDeCompra);
				ventanaFactura.setVisible(true);
				dispose();
				 
				datosDeCompra = "";
				totalAPagar = 0;
				
				
				
			}
			
			
	}
}
