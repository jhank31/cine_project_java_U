package project.uniquindio.cine.views;



import javax.swing.JButton;
import javax.swing.JFrame;

import project.uniquindio.cine.models.ModelMovie;
import project.uniquindio.cine.models.ModelSillas;
import project.uniquindio.cine.models.ModelUser;

import javax.swing.JLabel;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;




@SuppressWarnings("serial")
public class ViewSeleccionSillas extends JFrame implements ActionListener{

	JButton ButtonAtras;
	JButton ButtonSiguiente;
	JToggleButton ButtonA1;
	JToggleButton ButtonA2;
	JToggleButton ButtonA3;
	JToggleButton ButtonA4;
	JToggleButton ButtonA5;
	JToggleButton ButtonA6;
	JToggleButton ButtonA7;
	JToggleButton ButtonA8;
	JToggleButton ButtonA9;
	JToggleButton ButtonA10;
	JToggleButton ButtonA11;
	JToggleButton ButtonA12;
	JToggleButton ButtonA13;
	JToggleButton ButtonA14;
	JToggleButton ButtonA15;
	JToggleButton ButtonA16;

	JToggleButton ButtonB1;
	JToggleButton ButtonB2;
	JToggleButton ButtonB3;
	JToggleButton ButtonB4;
	JToggleButton ButtonB5;
	JToggleButton ButtonB6;
	JToggleButton ButtonB7;
	JToggleButton ButtonB8;
	JToggleButton ButtonB9;
	JToggleButton ButtonB10;
	JToggleButton ButtonB11;
	JToggleButton ButtonB12;
	JToggleButton ButtonB13;
	JToggleButton ButtonB14;
	JToggleButton ButtonB15;
	JToggleButton ButtonB16;

	JToggleButton ButtonC1;
	JToggleButton ButtonC2;
	JToggleButton ButtonC3;
	JToggleButton ButtonC4;
	JToggleButton ButtonC5;
	JToggleButton ButtonC6;
	JToggleButton ButtonC7;
	JToggleButton ButtonC8;
	JToggleButton ButtonC9;
	JToggleButton ButtonC10;
	JToggleButton ButtonC11;
	JToggleButton ButtonC12;
	JToggleButton ButtonC13;
	JToggleButton ButtonC14;
	JToggleButton ButtonC15;
	JToggleButton ButtonC16;

	JToggleButton ButtonD1;
	JToggleButton ButtonD2;
	JToggleButton ButtonD3;
	JToggleButton ButtonD4;
	JToggleButton ButtonD5;
	JToggleButton ButtonD6;
	JToggleButton ButtonD7;
	JToggleButton ButtonD8;
	JToggleButton ButtonD9;
	JToggleButton ButtonD10;
	JToggleButton ButtonD11;
	JToggleButton ButtonD12;
	JToggleButton ButtonD13;
	JToggleButton ButtonD14;
	JToggleButton ButtonD15;
	JToggleButton ButtonD16;

	JToggleButton ButtonE1;
	JToggleButton ButtonE2;
	JToggleButton ButtonE3;
	JToggleButton ButtonE4;
	JToggleButton ButtonE5;
	JToggleButton ButtonE6;
	JToggleButton ButtonE7;
	JToggleButton ButtonE8;
	JToggleButton ButtonE9;
	JToggleButton ButtonE10;
	JToggleButton ButtonE11;
	JToggleButton ButtonE12;
	JToggleButton ButtonE13;
	JToggleButton ButtonE14;
	JToggleButton ButtonE15;
	JToggleButton ButtonE16;

	JToggleButton ButtonF1;
	JToggleButton ButtonF2;
	JToggleButton ButtonF3;
	JToggleButton ButtonF4;
	JToggleButton ButtonF5;
	JToggleButton ButtonF6;
	JToggleButton ButtonF7;
	JToggleButton ButtonF8;
	JToggleButton ButtonF9;
	JToggleButton ButtonF10;
	JToggleButton ButtonF11;
	JToggleButton ButtonF12;
	JToggleButton ButtonF13;
	JToggleButton ButtonF14;
	JToggleButton ButtonF15;
	JToggleButton ButtonF16;

	JToggleButton ButtonG1;
	JToggleButton ButtonG2;
	JToggleButton ButtonG3;
	JToggleButton ButtonG4;
	JToggleButton ButtonG5;
	JToggleButton ButtonG6;
	JToggleButton ButtonG7;
	JToggleButton ButtonG8;
	JToggleButton ButtonG9;
	JToggleButton ButtonG10;
	JToggleButton ButtonG11;
	JToggleButton ButtonG12;
	JToggleButton ButtonG13;
	JToggleButton ButtonG14;
	JToggleButton ButtonG15;
	JToggleButton ButtonG16;

	JToggleButton ButtonH1;
	JToggleButton ButtonH2;
	JToggleButton ButtonH3;
	JToggleButton ButtonH4;
	JToggleButton ButtonH5;
	JToggleButton ButtonH6;
	JToggleButton ButtonH7;
	JToggleButton ButtonH8;
	JToggleButton ButtonH9;
	JToggleButton ButtonH10;
	JToggleButton ButtonH11;
	JToggleButton ButtonH12;
	JToggleButton ButtonH13;
	JToggleButton ButtonH14;
	JToggleButton ButtonH15;
	JToggleButton ButtonH16;

	JToggleButton ButtonI1;
	JToggleButton ButtonI2;
	JToggleButton ButtonI3;
	JToggleButton ButtonI4;
	JToggleButton ButtonI5;
	JToggleButton ButtonI6;
	JToggleButton ButtonI7;
	JToggleButton ButtonI8;
	JToggleButton ButtonI9;
	JToggleButton ButtonI10;
	JToggleButton ButtonI11;
	JToggleButton ButtonI12;
	JToggleButton ButtonI13;
	JToggleButton ButtonI14;
	JToggleButton ButtonI15;
	JToggleButton ButtonI16;

	JToggleButton ButtonJ1;
	JToggleButton ButtonJ2;
	JToggleButton ButtonJ3;
	JToggleButton ButtonJ4;
	JToggleButton ButtonJ5;
	JToggleButton ButtonJ6;
	JToggleButton ButtonJ7;
	JToggleButton ButtonJ8;
	JToggleButton ButtonJ9;
	JToggleButton ButtonJ10;
	JToggleButton ButtonJ11;
	JToggleButton ButtonJ12;
	JToggleButton ButtonJ13;
	JToggleButton ButtonJ14;
	JToggleButton ButtonJ15;
	JToggleButton ButtonJ16;

	JToggleButton ButtonK1;
	 JToggleButton ButtonK2;
	 JToggleButton ButtonK3;
	JToggleButton ButtonK4;
	JToggleButton ButtonK5;
	JToggleButton ButtonK6;
	JToggleButton ButtonK7;
	JToggleButton ButtonK8;
	JToggleButton ButtonK9;
	JToggleButton ButtonK10;
	JToggleButton ButtonK11;
	JToggleButton ButtonK12;
	JToggleButton ButtonK13;
	JToggleButton ButtonK14;
	JToggleButton ButtonK15;
	JToggleButton ButtonK16;

	JToggleButton ButtonL1;
	JToggleButton ButtonL2;
	JToggleButton ButtonL3;
	JToggleButton ButtonL4;
	JToggleButton ButtonL5;
	JToggleButton ButtonL6;
	JToggleButton ButtonL7;
	JToggleButton ButtonL8;
	JToggleButton ButtonL9;
	JToggleButton ButtonL10;
	JToggleButton ButtonL11;
	JToggleButton ButtonL12;
	JToggleButton ButtonL13;
	JToggleButton ButtonL14;
	JToggleButton ButtonL15;
	JToggleButton ButtonL16;

	JToggleButton ButtonM1;
	JToggleButton ButtonM2;
	JToggleButton ButtonM3;
	JToggleButton ButtonM4;
	JToggleButton ButtonM5;
	JToggleButton ButtonM6;
	JToggleButton ButtonM7;
	JToggleButton ButtonM8;
	JToggleButton ButtonM9;
	JToggleButton ButtonM10;
	JToggleButton ButtonM11;
	JToggleButton Buttonm12;
	JToggleButton ButtonM13;
	JToggleButton ButtonM14;
	JToggleButton ButtonM15;
	JToggleButton ButtonM16;
	
	private JToggleButton ButtonM12;

	
	
	private static ModelSillas datosSillasModel;
	static String datoPosicionSala;
	
	static String datoCedulaPerson;
	
	static int montoPorSillasSelec = 0;
	
	
	public ViewSeleccionSillas(String posicion, String datoCedula) {
		getContentPane().setBackground(Color.BLACK);
		datoCedulaPerson = datoCedula;
		datoPosicionSala = posicion;
		datosSillasModel = new  ModelSillas();
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 50, 1000, 730);
		getContentPane().setLayout(null);
		
		getSillas();
		this.setLocationRelativeTo(null);
		
		
	}
	
	
	
	
	
	static void cambioColorButtom (JToggleButton name) {
		
		 if (name.isSelected()) {
       	 
			 name.setContentAreaFilled(true);
			 name.setOpaque(true);
			 name.setBackground(Color.RED);
       	 	
        }else {
       	 name.setContentAreaFilled(true);
       	 name.setOpaque(true);
       	 name.setBackground(Color.GREEN);

       	 
        }
		
	}
	
	
	static void mandarAsientoSeleccionado(JToggleButton name, Integer posicion) {
		
		if (name.isSelected()) {
			ModelUser.setNumeroSillas(ModelUser.getNumeroSillas() + 1);
			datosSillasModel.enviarPuestosOcupados(posicion,datoPosicionSala );
			ModelSillas.add("Sala " +ModelMovie.movieSelect + " Silla " + posicion.toString() + ", ");
			name.setEnabled(false);
			montoPorSillasSelec = montoPorSillasSelec+12000;
		}
	}
	
	
	
	
	static void mandarAsientoSeleccionadoPreferencial(JToggleButton name, Integer posicion) {
		
		if (name.isSelected()) {
			ModelUser.setNumeroSillas(ModelUser.getNumeroSillas() + 1);
			ModelSillas.add("Sala " +ModelMovie.movieSelect + " Silla " + posicion.toString() + ", ");
			datosSillasModel.enviarPuestosOcupados(posicion,datoPosicionSala );
			name.setEnabled(false);
			montoPorSillasSelec = montoPorSillasSelec+16000;
		}
	}
	
	 
	
	static void mirarSiestaOcupadaPrimero(JToggleButton name, int posicion ) {
		
		if(datosSillasModel.getPosicionPuestos(posicion, datoPosicionSala) == 0) {
			 name.setContentAreaFilled(true);
			 name.setOpaque(true);
			 name.setBackground(Color.GREEN);


		 }else {
			
			 name.setContentAreaFilled(true);
			 name.setOpaque(true);
            name.setBackground(Color.RED);
           name.setEnabled(false);
           

		 }
	}

		
	
		public void getSillas () {	
		JLabel txtPantalla = new JLabel("PANTALLA");
		txtPantalla.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtPantalla.setOpaque(true);
		txtPantalla.setHorizontalAlignment(SwingConstants.CENTER);
		txtPantalla.setBounds(306, 23, 327, 22);
			getContentPane().add(txtPantalla);
		
			
		 ButtonA1 = new JToggleButton("A1");
		 mirarSiestaOcupadaPrimero(ButtonA1,0);
		ButtonA1.addActionListener(this);
		ButtonA1.setBounds(25, 71, 55, 29);
		getContentPane().add(ButtonA1);
		
		
		 ButtonA2 = new JToggleButton("A2");
		 mirarSiestaOcupadaPrimero(ButtonA2,1);
		ButtonA2.addActionListener(this);
		ButtonA2.setBounds(90, 71, 55, 29);
		getContentPane().add(ButtonA2);
		
		 ButtonA3 = new JToggleButton("A3");
		 mirarSiestaOcupadaPrimero(ButtonA3,2);
		ButtonA3.addActionListener(this);
		ButtonA3.setBounds(148, 71, 55, 29);
		getContentPane().add(ButtonA3);
		
		 ButtonA4 = new JToggleButton("A4");
			ButtonA4.addActionListener(this);
			 mirarSiestaOcupadaPrimero(ButtonA4,3);
		ButtonA4.setBounds(206, 71, 55, 29);
		getContentPane().add(ButtonA4);
		
		
		 ButtonA5 = new JToggleButton("A5");
		 mirarSiestaOcupadaPrimero(ButtonA5,4);
		ButtonA5.addActionListener(this);

		ButtonA5.setBounds(264, 71, 55, 29);
		getContentPane().add(ButtonA5);
		
		 ButtonA6 = new JToggleButton("A6");
		 mirarSiestaOcupadaPrimero(ButtonA6,5);

			ButtonA6.addActionListener(this);

		ButtonA6.setBounds(322, 71, 55, 29);
		getContentPane().add(ButtonA6);
		
		  ButtonA7 = new JToggleButton("A7");
			 mirarSiestaOcupadaPrimero(ButtonA7,6);

			ButtonA7.addActionListener(this);

		ButtonA7.setBounds(380, 71, 55, 29);
		getContentPane().add(ButtonA7);
		
		 ButtonA8 = new JToggleButton("A8");
		 mirarSiestaOcupadaPrimero(ButtonA8,7);

			ButtonA8.addActionListener(this);

		ButtonA8.setBounds(438, 71, 55, 29);
		getContentPane().add(ButtonA8);
		
		
		 ButtonA9 = new JToggleButton("A9");
		 mirarSiestaOcupadaPrimero(ButtonA9,8);

			ButtonA9.addActionListener(this);

		ButtonA9.setBounds(496, 71, 55, 29);
		getContentPane().add(ButtonA9);
		
		 ButtonA10 = new JToggleButton("A10");
		 mirarSiestaOcupadaPrimero(ButtonA10,9);

			ButtonA10.addActionListener(this);

		ButtonA10.setBounds(557, 71, 55, 29);
		getContentPane().add(ButtonA10);
		
		 ButtonA11 = new JToggleButton("A11");
		 mirarSiestaOcupadaPrimero(ButtonA11,10);

			ButtonA11.addActionListener(this);

		ButtonA11.setBounds(617, 71, 55, 29);
		getContentPane().add(ButtonA11);
		
		 ButtonA12 = new JToggleButton("A12");
		 mirarSiestaOcupadaPrimero(ButtonA12,11);

			ButtonA12.addActionListener(this);

		ButtonA12.setBounds(676, 71, 55, 29);
		getContentPane().add(ButtonA12);
		
		 ButtonA13 = new JToggleButton("A13");
		 mirarSiestaOcupadaPrimero(ButtonA13,12);

			ButtonA13.addActionListener(this);

		ButtonA13.setBounds(734, 71, 55, 29);
		getContentPane().add(ButtonA13);
		
		 ButtonA14 = new JToggleButton("A14");
		 mirarSiestaOcupadaPrimero(ButtonA14,13);

			ButtonA14.addActionListener(this);

		ButtonA14.setBounds(792, 71, 55, 29);
		getContentPane().add(ButtonA14);
		
		 ButtonA15 = new JToggleButton("A15");
		 mirarSiestaOcupadaPrimero(ButtonA15,14);

			ButtonA15.addActionListener(this);

		ButtonA15.setBounds(850, 71, 55, 29);
		getContentPane().add(ButtonA15);
		
		 ButtonA16 = new JToggleButton("A16");
		 mirarSiestaOcupadaPrimero(ButtonA16,15);
	    ButtonA16.addActionListener(this);
		ButtonA16.setBounds(916, 71, 55, 29);
		getContentPane().add(ButtonA16);
		
		ButtonB1 = new JToggleButton("B1");
		mirarSiestaOcupadaPrimero(ButtonB1,16);
        ButtonB1.addActionListener(this);
		ButtonB1.setBounds(25, 112, 55, 29);
		getContentPane().add(ButtonB1);
		
		ButtonB2 = new JToggleButton("B2");
		mirarSiestaOcupadaPrimero(ButtonB2,17);
        ButtonB2.addActionListener(this);
		ButtonB2.setBounds(90, 112, 55, 29);
		getContentPane().add(ButtonB2);
		
		 ButtonB3 = new JToggleButton("B3");
		mirarSiestaOcupadaPrimero(ButtonB3,18);
        ButtonB3.addActionListener(this);
		ButtonB3.setBounds(148, 112, 55, 29);
		getContentPane().add(ButtonB3);
		
		 ButtonB4 = new JToggleButton("B4");
		mirarSiestaOcupadaPrimero(ButtonB4,19);
        ButtonB4.addActionListener(this);
		ButtonB4.setBounds(206, 112, 55, 29);
		getContentPane().add(ButtonB4);
		
		ButtonB5 = new JToggleButton("B5");
	    mirarSiestaOcupadaPrimero(ButtonB5,20);
        ButtonB5.addActionListener(this);
		ButtonB5.setBounds(264, 112, 55, 29);
		getContentPane().add(ButtonB5);
		
		ButtonB6 = new JToggleButton("B6");
		mirarSiestaOcupadaPrimero(ButtonB6,21);
        ButtonB6.addActionListener(this);
		ButtonB6.setBounds(322, 112, 55, 29);
		getContentPane().add(ButtonB6);
		
		 ButtonB7 = new JToggleButton("B7");
		 mirarSiestaOcupadaPrimero(ButtonB7,22);
        ButtonB7.addActionListener(this);
		ButtonB7.setBounds(380, 112, 55, 29);
		getContentPane().add(ButtonB7);
		
		 ButtonB8 = new JToggleButton("B8");
		 mirarSiestaOcupadaPrimero(ButtonB8,23);
        ButtonB8.addActionListener(this);
		ButtonB8.setBounds(438, 112, 55, 29);
		getContentPane().add(ButtonB8);
		
		ButtonB9 = new JToggleButton("B9");
		mirarSiestaOcupadaPrimero(ButtonB9,24);
        ButtonB9.addActionListener(this);
		ButtonB9.setBounds(496, 112, 55, 29);
		getContentPane().add(ButtonB9);
		
		 ButtonB10 = new JToggleButton("B10");
		mirarSiestaOcupadaPrimero(ButtonB10,25);
        ButtonB10.addActionListener(this);
		ButtonB10.setBounds(557, 112, 55, 29);
		getContentPane().add(ButtonB10);
		
		 ButtonB11 = new JToggleButton("B11");
		 mirarSiestaOcupadaPrimero(ButtonB11,26);
		 ButtonB11.addActionListener(this);
		ButtonB11.setBounds(617, 112, 55, 29);
		getContentPane().add(ButtonB11);
		
		 ButtonB12 = new JToggleButton("B12");
		mirarSiestaOcupadaPrimero(ButtonB12,27);
        ButtonB12.addActionListener(this);
		ButtonB12.setBounds(676, 112, 55, 29);
		getContentPane().add(ButtonB12);
		
		ButtonB13 = new JToggleButton("B13");
		mirarSiestaOcupadaPrimero(ButtonB13,28);
        ButtonB13.addActionListener(this);
		ButtonB13.setBounds(734, 112, 55, 29);
		getContentPane().add(ButtonB13);
		
		ButtonB14 = new JToggleButton("B14");
		mirarSiestaOcupadaPrimero(ButtonB14,29);
        ButtonB14.addActionListener(this);
		ButtonB14.setBounds(792, 112, 55, 29);
		getContentPane().add(ButtonB14);
		
		 ButtonB15 = new JToggleButton("B15");
		 mirarSiestaOcupadaPrimero(ButtonB15,30);
        ButtonB15.addActionListener(this);
		ButtonB15.setBounds(850, 112, 55, 29);
		getContentPane().add(ButtonB15);
		
		 ButtonB16 = new JToggleButton("B16");
		mirarSiestaOcupadaPrimero(ButtonB16,31);
        ButtonB16.addActionListener(this);
		ButtonB16.setBounds(916, 112, 55, 29);
		getContentPane().add(ButtonB16);
		

		ButtonC1 = new JToggleButton("C1");
		mirarSiestaOcupadaPrimero(ButtonC1,32);
        ButtonC1.addActionListener(this);
		ButtonC1.setBounds(25, 153, 55, 29);
		getContentPane().add(ButtonC1);
		
		 ButtonC2 = new JToggleButton("C2");
		mirarSiestaOcupadaPrimero(ButtonC2,33);
        ButtonC2.addActionListener(this);
		ButtonC2.setBounds(90, 153, 55, 29);
		getContentPane().add(ButtonC2);
		
		 ButtonC3 = new JToggleButton("C3");
		mirarSiestaOcupadaPrimero(ButtonC3,34);
        ButtonC3.addActionListener(this);
		ButtonC3.setBounds(148, 153, 55, 29);
		getContentPane().add(ButtonC3);
		
		ButtonC4 = new JToggleButton("C4");
		mirarSiestaOcupadaPrimero(ButtonC4,35);
        ButtonC4.addActionListener(this);
		ButtonC4.setBounds(206, 153, 55, 29);
		getContentPane().add(ButtonC4);
		
		ButtonC5 = new JToggleButton("C5");
		mirarSiestaOcupadaPrimero(ButtonC5,36);
        ButtonC5.addActionListener(this);
		ButtonC5.setBounds(264, 153, 55, 29);
		getContentPane().add(ButtonC5);
		
		ButtonC6 = new JToggleButton("C6");
		mirarSiestaOcupadaPrimero(ButtonC6,37);
        ButtonC6.addActionListener(this);
		ButtonC6.setBounds(322, 153, 55, 29);
		getContentPane().add(ButtonC6);
		
		 ButtonC7 = new JToggleButton("C7");
		 mirarSiestaOcupadaPrimero(ButtonC7,38);
        ButtonC7.addActionListener(this);
		ButtonC7.setBounds(380, 153, 55, 29);
		getContentPane().add(ButtonC7);
		
		 ButtonC8 = new JToggleButton("C8");
		mirarSiestaOcupadaPrimero(ButtonC8,39);
        ButtonC8.addActionListener(this);
		ButtonC8.setBounds(438, 153, 55, 29);
		getContentPane().add(ButtonC8);
		
		 ButtonC9 = new JToggleButton("C9");
		mirarSiestaOcupadaPrimero(ButtonC9,40);
        ButtonC9.addActionListener(this);
		ButtonC9.setBounds(496, 153, 55, 29);
		getContentPane().add(ButtonC9);
		
		ButtonC10 = new JToggleButton("C10");
		mirarSiestaOcupadaPrimero(ButtonC10,41);
        ButtonC10.addActionListener(this);
		ButtonC10.setBounds(557, 153, 55, 29);
		getContentPane().add(ButtonC10);
		
		ButtonC11 = new JToggleButton("C11");
	    mirarSiestaOcupadaPrimero(ButtonC11,42);
        ButtonC11.addActionListener(this);
		ButtonC11.setBounds(617, 153, 55, 29);
		getContentPane().add(ButtonC11);
		
		ButtonC12 = new JToggleButton("C12");
		mirarSiestaOcupadaPrimero(ButtonC12,43);
        ButtonC12.addActionListener(this);
		ButtonC12.setBounds(676, 153, 55, 29);
		getContentPane().add(ButtonC12);
		
		ButtonC13 = new JToggleButton("C13");
		mirarSiestaOcupadaPrimero(ButtonC13,44);
        ButtonC13.addActionListener(this);
		ButtonC13.setBounds(734, 153, 55, 29);
		getContentPane().add(ButtonC13);
		
		 ButtonC14 = new JToggleButton("C14");
		 mirarSiestaOcupadaPrimero(ButtonC14,45);
        ButtonC14.addActionListener(this);
		ButtonC14.setBounds(792, 153, 55, 29);
		getContentPane().add(ButtonC14);
		
		 ButtonC15 = new JToggleButton("C15");
		mirarSiestaOcupadaPrimero(ButtonC15,46);
        ButtonC15.addActionListener(this);
		ButtonC15.setBounds(850, 153, 55, 29);
		getContentPane().add(ButtonC15);
		
		 ButtonC16 = new JToggleButton("C16");
		 mirarSiestaOcupadaPrimero(ButtonC16,47);
        ButtonC16.addActionListener(this);
		ButtonC16.setBounds(916, 153, 55, 29);
		getContentPane().add(ButtonC16);

		
		 ButtonD1 = new JToggleButton("D1");
		mirarSiestaOcupadaPrimero(ButtonD1,48);
        ButtonD1.addActionListener(this);
		ButtonD1.setBounds(25, 194, 55, 29);
		getContentPane().add(ButtonD1);
		
		 ButtonD2 = new JToggleButton("D2");
	    mirarSiestaOcupadaPrimero(ButtonD2,49);
        ButtonD2.addActionListener(this);
		ButtonD2.setBounds(90, 194, 55, 29);
		getContentPane().add(ButtonD2);
		
		 ButtonD3 = new JToggleButton("D3");
		mirarSiestaOcupadaPrimero(ButtonD3,50);
        ButtonD3.addActionListener(this);
		ButtonD3.setBounds(148, 194, 55, 29);
		getContentPane().add(ButtonD3);
		
		 ButtonD4 = new JToggleButton("D4");
		 mirarSiestaOcupadaPrimero(ButtonD4,51);
        ButtonD4.addActionListener(this);
		ButtonD4.setBounds(206, 194, 55, 29);
		getContentPane().add(ButtonD4);
		
		 ButtonD5 = new JToggleButton("D5");
		 mirarSiestaOcupadaPrimero(ButtonD5,52);
        ButtonD5.addActionListener(this);
		ButtonD5.setBounds(264, 194, 55, 29);
		getContentPane().add(ButtonD5);
		
		 ButtonD6 = new JToggleButton("D6");
		 mirarSiestaOcupadaPrimero(ButtonD6,53);
        ButtonD6.addActionListener(this);
		ButtonD6.setBounds(322, 194, 55, 29);
		getContentPane().add(ButtonD6);
		
		 ButtonD7 = new JToggleButton("D7");
		 mirarSiestaOcupadaPrimero(ButtonD7,54);
        ButtonD7.addActionListener(this);
		ButtonD7.setBounds(380, 194, 55, 29);
		getContentPane().add(ButtonD7);
		
		 ButtonD8 = new JToggleButton("D8");
		 mirarSiestaOcupadaPrimero(ButtonD8,55);
        ButtonD8.addActionListener(this);
		ButtonD8.setBounds(438, 194, 55, 29);
		getContentPane().add(ButtonD8);
		
		 ButtonD9 = new JToggleButton("D9");
		 mirarSiestaOcupadaPrimero(ButtonD9,56);
        ButtonD9.addActionListener(this);
		ButtonD9.setBounds(496, 194, 55, 29);
		getContentPane().add(ButtonD9);
		
		 ButtonD10 = new JToggleButton("D10");
		mirarSiestaOcupadaPrimero(ButtonD10,57);
        ButtonD10.addActionListener(this);
		ButtonD10.setBounds(557, 194, 55, 29);
		getContentPane().add(ButtonD10);
		
		 ButtonD11 = new JToggleButton("D11");
		 mirarSiestaOcupadaPrimero(ButtonD11,58);
        ButtonD11.addActionListener(this);
		ButtonD11.setBounds(617, 194, 55, 29);
		getContentPane().add(ButtonD11);
		
		 ButtonD12 = new JToggleButton("D12");
		 mirarSiestaOcupadaPrimero(ButtonD12,59);
        ButtonD12.addActionListener(this);
		ButtonD12.setBounds(676, 194, 55, 29);
		getContentPane().add(ButtonD12);
		
	     ButtonD13 = new JToggleButton("D13");
		 mirarSiestaOcupadaPrimero(ButtonD13,60);
        ButtonD13.addActionListener(this);
		ButtonD13.setBounds(734, 194, 55, 29);
		getContentPane().add(ButtonD13);
		
		ButtonD14 = new JToggleButton("D14");
		mirarSiestaOcupadaPrimero(ButtonD14,61);
        ButtonD14.addActionListener(this);
		ButtonD14.setBounds(792, 194, 55, 29);
		getContentPane().add(ButtonD14);
		
		 ButtonD15 = new JToggleButton("D15");
		 mirarSiestaOcupadaPrimero(ButtonD15,62);
        ButtonD15.addActionListener(this);
		ButtonD15.setBounds(850, 194, 55, 29);
		getContentPane().add(ButtonD15);
		
		 ButtonD16 = new JToggleButton("D16");
		 mirarSiestaOcupadaPrimero(ButtonD16,63);
        ButtonD16.addActionListener(this);
		ButtonD16.setBounds(916, 194, 55, 29);
		getContentPane().add(ButtonD16);

		
		 ButtonE1 = new JToggleButton("E1");
		 mirarSiestaOcupadaPrimero(ButtonE1,64);
        ButtonE1.addActionListener(this);
		ButtonE1.setBounds(25, 235, 55, 29);
		getContentPane().add(ButtonE1);
		
		 ButtonE2 = new JToggleButton("E2");
		 mirarSiestaOcupadaPrimero(ButtonE2,65);
        ButtonE2.addActionListener(this);
		ButtonE2.setBounds(90, 235, 55, 29);
		getContentPane().add(ButtonE2);
		
		 ButtonE3 = new JToggleButton("E3");
		 mirarSiestaOcupadaPrimero(ButtonE3,66);
        ButtonE3.addActionListener(this);
		ButtonE3.setBounds(148, 235, 55, 29);
		getContentPane().add(ButtonE3);
		
         ButtonE4 = new JToggleButton("E4");
		 mirarSiestaOcupadaPrimero(ButtonE4,67);
        ButtonE4.addActionListener(this);
		ButtonE4.setBounds(206, 235, 55, 29);
		getContentPane().add(ButtonE4);
		
		 ButtonE5 = new JToggleButton("E5");
		 mirarSiestaOcupadaPrimero(ButtonE5,68);
        ButtonE5.addActionListener(this);
		ButtonE5.setBounds(264, 235, 55, 29);
		getContentPane().add(ButtonE5);
		
		 ButtonE6 = new JToggleButton("E6");
		 mirarSiestaOcupadaPrimero(ButtonE6,69);
        ButtonE6.addActionListener(this);
		ButtonE6.setBounds(322, 235, 55, 29);
		getContentPane().add(ButtonE6);
		
		 ButtonE7 = new JToggleButton("E7");
		 mirarSiestaOcupadaPrimero(ButtonE7,70);
        ButtonE7.addActionListener(this);
		ButtonE7.setBounds(380, 235, 55, 29);
		getContentPane().add(ButtonE7);
		
		 ButtonE8 = new JToggleButton("E8");
		 mirarSiestaOcupadaPrimero(ButtonE8,71);
        ButtonE8.addActionListener(this);
		ButtonE8.setBounds(438, 235, 55, 29);
		getContentPane().add(ButtonE8);
		
		 ButtonE9 = new JToggleButton("E9");
		 mirarSiestaOcupadaPrimero(ButtonE9,72);
        ButtonE9.addActionListener(this);
		ButtonE9.setBounds(496, 235, 55, 29);
		getContentPane().add(ButtonE9);
		
		 ButtonE10 = new JToggleButton("E10");
		 mirarSiestaOcupadaPrimero(ButtonE10,73);
        ButtonE10.addActionListener(this);
		ButtonE10.setBounds(557, 235, 55, 29);
		getContentPane().add(ButtonE10);
		
		 ButtonE11 = new JToggleButton("E11");
		 mirarSiestaOcupadaPrimero(ButtonE11,74);
        ButtonE11.addActionListener(this);
		ButtonE11.setBounds(617, 235, 55, 29);
		getContentPane().add(ButtonE11);
		
	     ButtonE12 = new JToggleButton("E12");
		 mirarSiestaOcupadaPrimero(ButtonE12,75);
        ButtonE12.addActionListener(this);
		ButtonE12.setBounds(676, 235, 55, 29);
		getContentPane().add(ButtonE12);
		
		 ButtonE13 = new JToggleButton("E13");
		 mirarSiestaOcupadaPrimero(ButtonE13,76);
        ButtonE13.addActionListener(this);
		ButtonE13.setBounds(734, 235, 55, 29);
		getContentPane().add(ButtonE13);
		
		 ButtonE14 = new JToggleButton("E14");
		 mirarSiestaOcupadaPrimero(ButtonE14,77);
        ButtonE14.addActionListener(this);
		ButtonE14.setBounds(792, 235, 55, 29);
		getContentPane().add(ButtonE14);
		
		 ButtonE15 = new JToggleButton("E15");
		 mirarSiestaOcupadaPrimero(ButtonE15,78);
        ButtonE15.addActionListener(this);
		ButtonE15.setBounds(850, 235, 55, 29);
		getContentPane().add(ButtonE15);
		
		 ButtonE16 = new JToggleButton("E16");
		 mirarSiestaOcupadaPrimero(ButtonE16,79);
        ButtonE16.addActionListener(this);
		ButtonE16.setBounds(916, 235, 55, 29);
		getContentPane().add(ButtonE16);

		
		 ButtonF1 = new JToggleButton("F1");
		 mirarSiestaOcupadaPrimero(ButtonF1,80);
        ButtonF1.addActionListener(this);
		ButtonF1.setBounds(25, 276, 55, 29);
		getContentPane().add(ButtonF1);
		
		 ButtonF2 = new JToggleButton("F2");
		mirarSiestaOcupadaPrimero(ButtonF2,81);
        ButtonF2.addActionListener(this);
		ButtonF2.setBounds(90, 276, 55, 29);
		getContentPane().add(ButtonF2);
		
		 ButtonF3 = new JToggleButton("F3");
		 mirarSiestaOcupadaPrimero(ButtonF3,82);
        ButtonF3.addActionListener(this);
		ButtonF3.setBounds(148, 276, 55, 29);
		getContentPane().add(ButtonF3);
		
		 ButtonF4 = new JToggleButton("F4");
		 mirarSiestaOcupadaPrimero(ButtonF4,83);
        ButtonF4.addActionListener(this);
		ButtonF4.setBounds(206, 276, 55, 29);
		getContentPane().add(ButtonF4);
		
		 ButtonF5 = new JToggleButton("F5");
		 mirarSiestaOcupadaPrimero(ButtonF5,84);
        ButtonF5.addActionListener(this);
		ButtonF5.setBounds(264, 276, 55, 29);
		getContentPane().add(ButtonF5);
		
		 ButtonF6 = new JToggleButton("F6");
		 mirarSiestaOcupadaPrimero(ButtonF6,85);
        ButtonF6.addActionListener(this);
		ButtonF6.setBounds(322, 276, 55, 29);
		getContentPane().add(ButtonF6);
		
		 ButtonF7 = new JToggleButton("F7");
		 mirarSiestaOcupadaPrimero(ButtonF7,86);
        ButtonF7.addActionListener(this);
		ButtonF7.setBounds(380, 276, 55, 29);
		getContentPane().add(ButtonF7);
		
		 ButtonF8 = new JToggleButton("F8");
		 mirarSiestaOcupadaPrimero(ButtonF8,87);
        ButtonF8.addActionListener(this);
		ButtonF8.setBounds(438, 276, 55, 29);
		getContentPane().add(ButtonF8);
		
		 ButtonF9 = new JToggleButton("F9");
		 mirarSiestaOcupadaPrimero(ButtonF9,88);
        ButtonF9.addActionListener(this);
		ButtonF9.setBounds(496, 276, 55, 29);
		getContentPane().add(ButtonF9);
		
		 ButtonF10 = new JToggleButton("F10");
		 mirarSiestaOcupadaPrimero(ButtonF10,89);
        ButtonF10.addActionListener(this);
		ButtonF10.setBounds(557, 276, 55, 29);
		getContentPane().add(ButtonF10);
		
		 ButtonF11 = new JToggleButton("F11");
		 mirarSiestaOcupadaPrimero(ButtonF11,90);
        ButtonF11.addActionListener(this);
		ButtonF11.setBounds(617, 276, 55, 29);
		getContentPane().add(ButtonF11);
		
		 ButtonF12 = new JToggleButton("F12");
		 mirarSiestaOcupadaPrimero(ButtonF12,91);
        ButtonF12.addActionListener(this);
		ButtonF12.setBounds(676, 276, 55, 29);
		getContentPane().add(ButtonF12);
		
		 ButtonF13 = new JToggleButton("F13");
		 mirarSiestaOcupadaPrimero(ButtonF13,92);
        ButtonF13.addActionListener(this);
		ButtonF13.setBounds(734, 276, 55, 29);
		getContentPane().add(ButtonF13);
		
		 ButtonF14 = new JToggleButton("F14");
		 mirarSiestaOcupadaPrimero(ButtonF14,93);
        ButtonF14.addActionListener(this);
		ButtonF14.setBounds(792, 276, 55, 29);
		getContentPane().add(ButtonF14);
		
		 ButtonF15 = new JToggleButton("F15");
		 mirarSiestaOcupadaPrimero(ButtonF15,94);
        ButtonF15.addActionListener(this);
		ButtonF15.setBounds(850, 276, 55, 29);
		getContentPane().add(ButtonF15);
		
		 ButtonF16 = new JToggleButton("F16");
		 mirarSiestaOcupadaPrimero(ButtonF16,95);
        ButtonF16.addActionListener(this);
		ButtonF16.setBounds(916, 276, 55, 29);
		getContentPane().add(ButtonF16);
		
		
		
		 ButtonG1 = new JToggleButton("G1");
		 mirarSiestaOcupadaPrimero(ButtonG1,96);
        ButtonG1.addActionListener(this);
		ButtonG1.setBounds(25, 317, 55, 29);
		getContentPane().add(ButtonG1);
		
         ButtonG2 = new JToggleButton("G2");
		 mirarSiestaOcupadaPrimero(ButtonG2,97);
        ButtonG2.addActionListener(this);
		ButtonG2.setBounds(90, 317, 55, 29);
		getContentPane().add(ButtonG2);
			
		 ButtonG3 = new JToggleButton("G3");
		 mirarSiestaOcupadaPrimero(ButtonG3,98);
        ButtonG3.addActionListener(this);
		ButtonG3.setBounds(148, 317, 55, 29);
		getContentPane().add(ButtonG3);
		
         ButtonG4 = new JToggleButton("G4");
		 mirarSiestaOcupadaPrimero(ButtonG4,99);
        ButtonG4.addActionListener(this);
		ButtonG4.setBounds(206, 317, 55, 29);
		getContentPane().add(ButtonG4); 


		 ButtonG5 = new JToggleButton("G5");
		 mirarSiestaOcupadaPrimero(ButtonG5,100);
        ButtonG5.addActionListener(this);
		ButtonG5.setBounds(264, 317, 55, 29);
		getContentPane().add(ButtonG5);
		
		
		 ButtonG6 = new JToggleButton("G6");
		 mirarSiestaOcupadaPrimero(ButtonG6,101);
        ButtonG6.addActionListener(this);
		ButtonG6.setBounds(322, 317, 55, 29);
		getContentPane().add(ButtonG6);


		 ButtonG7 = new JToggleButton("G7");
		 mirarSiestaOcupadaPrimero(ButtonG7,102);
        ButtonG7.addActionListener(this);
		ButtonG7.setBounds(380, 317, 55, 29);
		getContentPane().add(ButtonG7);
		
		
		 ButtonG8 = new JToggleButton("G8");
		 mirarSiestaOcupadaPrimero(ButtonG8,103);
        ButtonG8.addActionListener(this);
		ButtonG8.setBounds(438, 317, 55, 29);
		getContentPane().add(ButtonG8);
		
		ButtonG9 = new JToggleButton("G9");
		mirarSiestaOcupadaPrimero(ButtonG9,104);
        ButtonG9.addActionListener(this);
		ButtonG9.setBounds(496, 317, 55, 29);
		getContentPane().add(ButtonG9);
		
		 ButtonG10 = new JToggleButton("G10");
		 mirarSiestaOcupadaPrimero(ButtonG10,105);
        ButtonG10.addActionListener(this);
		ButtonG10.setBounds(557, 317, 55, 29);
		getContentPane().add(ButtonG10);
		
		 ButtonG11 = new JToggleButton("G11");
		 mirarSiestaOcupadaPrimero(ButtonG11,106);
        ButtonG11.addActionListener(this);
		ButtonG11.setBounds(617, 317, 55, 29);
		getContentPane().add(ButtonG11);

		 ButtonG12 = new JToggleButton("G12");
		 mirarSiestaOcupadaPrimero(ButtonG12,107);
        ButtonG12.addActionListener(this);
		ButtonG12.setBounds(676, 317, 55, 29);
		getContentPane().add(ButtonG12);
		
		 ButtonG13 = new JToggleButton("G13");
		 mirarSiestaOcupadaPrimero(ButtonG13,108);
        ButtonG13.addActionListener(this);
		ButtonG13.setBounds(734, 317, 55, 29);
		getContentPane().add(ButtonG13);
		 	
		 ButtonG14 = new JToggleButton("G14");
		 mirarSiestaOcupadaPrimero(ButtonG14,109);
        ButtonG14.addActionListener(this);
		ButtonG14.setBounds(792, 317, 55, 29);
		getContentPane().add(ButtonG14);
		
		 ButtonG15 = new JToggleButton("G15");
		 mirarSiestaOcupadaPrimero(ButtonG15,110);
        ButtonG15.addActionListener(this);
		ButtonG15.setBounds(850, 317, 55, 29);
		getContentPane().add(ButtonG15); 

		 ButtonG16 = new JToggleButton("G16");
		 mirarSiestaOcupadaPrimero(ButtonG16,111);
        ButtonG16.addActionListener(this);
		ButtonG16.setBounds(916, 317, 55, 29);
		getContentPane().add(ButtonG16);
		
		
		 ButtonH1 = new JToggleButton("H1");
		 mirarSiestaOcupadaPrimero(ButtonH1,112);
        ButtonH1.addActionListener(this);
		ButtonH1.setBounds(25, 358, 55, 29);
		getContentPane().add(ButtonH1);
	
		 ButtonH2 = new JToggleButton("H2");
		 mirarSiestaOcupadaPrimero(ButtonH2,113);
        ButtonH2.addActionListener(this);
		ButtonH2.setBounds(90, 358, 55, 29);
		getContentPane().add(ButtonH2);
		
		 ButtonH3 = new JToggleButton("H3");
		 mirarSiestaOcupadaPrimero(ButtonH3,114);
        ButtonH3.addActionListener(this);
		ButtonH3.setBounds(148, 358, 55, 29);
		getContentPane().add(ButtonH3);
		
		 ButtonH4 = new JToggleButton("H4");
		 mirarSiestaOcupadaPrimero(ButtonH4,115);
        ButtonH4.addActionListener(this);
		ButtonH4.setBounds(206, 358, 55, 29);
		getContentPane().add(ButtonH4);
		
		 ButtonH5 = new JToggleButton("H5");
		 mirarSiestaOcupadaPrimero(ButtonH5,116);
        ButtonH5.addActionListener(this);
		ButtonH5.setBounds(264, 358, 55, 29);
		getContentPane().add(ButtonH5);
		
		 ButtonH6 = new JToggleButton("H6");
		 mirarSiestaOcupadaPrimero(ButtonH6,117);
        ButtonH6.addActionListener(this);
		ButtonH6.setBounds(322, 358, 55, 29);
		getContentPane().add(ButtonH6);
		
		 ButtonH7 = new JToggleButton("H7");
		 mirarSiestaOcupadaPrimero(ButtonH7,118);
        ButtonH7.addActionListener(this);
		ButtonH7.setBounds(380, 358, 55, 29);
		getContentPane().add(ButtonH7);
		
		 ButtonH8 = new JToggleButton("H8");
		 mirarSiestaOcupadaPrimero(ButtonH8,119);
        ButtonH8.addActionListener(this);
		ButtonH8.setBounds(438, 358, 55, 29);
		getContentPane().add(ButtonH8);
		
		 ButtonH9 = new JToggleButton("H9");
		 mirarSiestaOcupadaPrimero(ButtonH9,120);
        ButtonH9.addActionListener(this);
		ButtonH9.setBounds(496, 358, 55, 29);
		getContentPane().add(ButtonH9);
		
		 ButtonH10 = new JToggleButton("H10");
		 mirarSiestaOcupadaPrimero(ButtonH10,121);
        ButtonH10.addActionListener(this);
		ButtonH10.setBounds(557, 358, 55, 29);
		getContentPane().add(ButtonH10);
		
		 ButtonH11 = new JToggleButton("H11");
		 mirarSiestaOcupadaPrimero(ButtonH11,122);
        ButtonH11.addActionListener(this);
		ButtonH11.setBounds(617, 358, 55, 29);
		getContentPane().add(ButtonH11);
		
		 ButtonH12 = new JToggleButton("H12");
		 mirarSiestaOcupadaPrimero(ButtonH12,123);
        ButtonH12.addActionListener(this);
		ButtonH12.setBounds(676, 358, 55, 29);
		getContentPane().add(ButtonH12);
		
		 ButtonH13 = new JToggleButton("H13");
		 mirarSiestaOcupadaPrimero(ButtonH13,124);
        ButtonH13.addActionListener(this);
		ButtonH13.setBounds(734, 358, 55, 29);
		getContentPane().add(ButtonH13);
		
		 ButtonH14 = new JToggleButton("H14");
		 mirarSiestaOcupadaPrimero(ButtonH14,125);
        ButtonH14.addActionListener(this);
		ButtonH14.setBounds(792, 358, 55, 29);
		getContentPane().add(ButtonH14);
		
		 ButtonH15 = new JToggleButton("H15");
		 mirarSiestaOcupadaPrimero(ButtonH15,126);
        ButtonH15.addActionListener(this);
		ButtonH15.setBounds(850, 358, 55, 29);
		getContentPane().add(ButtonH15);
		
		 ButtonH16 = new JToggleButton("H16");
		 mirarSiestaOcupadaPrimero(ButtonH16,127);
        ButtonH16.addActionListener(this);
		ButtonH16.setBounds(916, 358, 55, 29);
		getContentPane().add(ButtonH16);
		

		 ButtonI1 = new JToggleButton("I1");
		 mirarSiestaOcupadaPrimero(ButtonI1,128);
        ButtonI1.addActionListener(this);
		ButtonI1.setBounds(25, 399, 55, 29);
		getContentPane().add(ButtonI1);
		
		
		 ButtonI2 = new JToggleButton("I2");
		 mirarSiestaOcupadaPrimero(ButtonI2,129);
        ButtonI2.addActionListener(this);
		ButtonI2.setBounds(90, 399, 55, 29);
		getContentPane().add(ButtonI2);
		
		 ButtonI3 = new JToggleButton("I3");
		 mirarSiestaOcupadaPrimero(ButtonI3,130);
        ButtonI3.addActionListener(this);
		ButtonI3.setBounds(148, 399, 55, 29);
		getContentPane().add(ButtonI3);
		
		 ButtonI4 = new JToggleButton("I4");
		 mirarSiestaOcupadaPrimero(ButtonI4,131);
        ButtonI4.addActionListener(this);
		ButtonI4.setBounds(206, 399, 55, 29);
		getContentPane().add(ButtonI4);
		
		 ButtonI5 = new JToggleButton("I5");
		 mirarSiestaOcupadaPrimero(ButtonI5,132);
        ButtonI5.addActionListener(this);
		ButtonI5.setBounds(264, 399, 55, 29);
		getContentPane().add(ButtonI5);
		
		 ButtonI6 = new JToggleButton("I6");
		 mirarSiestaOcupadaPrimero(ButtonI6,133);
        ButtonI6.addActionListener(this);
		ButtonI6.setBounds(322, 399, 55, 29);
		getContentPane().add(ButtonI6);
		
		 ButtonI7 = new JToggleButton("I7");
		 mirarSiestaOcupadaPrimero(ButtonI7,134);
        ButtonI7.addActionListener(this);
		ButtonI7.setBounds(380, 399, 55, 29);
		getContentPane().add(ButtonI7);
		
		 ButtonI8 = new JToggleButton("I8");
		 mirarSiestaOcupadaPrimero(ButtonI8,135);
        ButtonI8.addActionListener(this);
		ButtonI8.setBounds(438, 399, 55, 29);
		getContentPane().add(ButtonI8);
		
		 ButtonI9 = new JToggleButton("I9");
		 mirarSiestaOcupadaPrimero(ButtonI9,136);
        ButtonI9.addActionListener(this);
		ButtonI9.setBounds(496, 399, 55, 29);
		getContentPane().add(ButtonI9);
		
		 ButtonI10 = new JToggleButton("I10");
		 mirarSiestaOcupadaPrimero(ButtonI10,137);
        ButtonI10.addActionListener(this);
		ButtonI10.setBounds(557, 399, 55, 29);
		getContentPane().add(ButtonI10);
		
		 ButtonI11 = new JToggleButton("I11");
		 mirarSiestaOcupadaPrimero(ButtonI11,138);
        ButtonI11.addActionListener(this);
		ButtonI11.setBounds(617, 399, 55, 29);
		getContentPane().add(ButtonI11);
		
		 ButtonI12 = new JToggleButton("I12");
		 mirarSiestaOcupadaPrimero(ButtonI12,139);
        ButtonI12.addActionListener(this);
		ButtonI12.setBounds(676, 399, 55, 29);
		getContentPane().add(ButtonI12);
		
		 ButtonI13 = new JToggleButton("I13");
		 mirarSiestaOcupadaPrimero(ButtonI13,140);
        ButtonI13.addActionListener(this);
		ButtonI13.setBounds(734, 399, 55, 29);
		getContentPane().add(ButtonI13);
		
		ButtonI14 = new JToggleButton("I14");
		mirarSiestaOcupadaPrimero(ButtonI14,141);
        ButtonI14.addActionListener(this);
		ButtonI14.setBounds(792, 399, 55, 29);
		getContentPane().add(ButtonI14);
		
		 ButtonI15 = new JToggleButton("I15");
		 mirarSiestaOcupadaPrimero(ButtonI15,142);
        ButtonI15.addActionListener(this);
		ButtonI15.setBounds(850, 399, 55, 29);
		getContentPane().add(ButtonI15);
		
		 ButtonI16 = new JToggleButton("I16");
		 mirarSiestaOcupadaPrimero(ButtonI16,143);
        ButtonI16.addActionListener(this);
		ButtonI16.setBounds(916, 399, 55, 29);
		getContentPane().add(ButtonI16);

		
		 ButtonJ1 = new JToggleButton("J1");
		 mirarSiestaOcupadaPrimero(ButtonJ1,144);
        ButtonJ1.addActionListener(this);
		ButtonJ1.setBounds(25, 440, 55, 29);
		getContentPane().add(ButtonJ1);
		
		 ButtonJ2 = new JToggleButton("J2");
		 mirarSiestaOcupadaPrimero(ButtonJ2,145);
        ButtonJ2.addActionListener(this);
		ButtonJ2.setBounds(90, 440, 55, 29);
		getContentPane().add(ButtonJ2);
		
		 ButtonJ3 = new JToggleButton("J3");
		 mirarSiestaOcupadaPrimero(ButtonJ3,146);
        ButtonJ3.addActionListener(this);
		ButtonJ3.setBounds(148, 440, 55, 29);
		getContentPane().add(ButtonJ3);
		
		 ButtonJ4 = new JToggleButton("J4");
		 mirarSiestaOcupadaPrimero(ButtonJ4,147);
        ButtonJ4.addActionListener(this);
		ButtonJ4.setBounds(206, 440, 55, 29);
		getContentPane().add(ButtonJ4);
		
		ButtonJ5 = new JToggleButton("J5");
		mirarSiestaOcupadaPrimero(ButtonJ5,148);
        ButtonJ5.addActionListener(this);
		ButtonJ5.setBounds(264, 440, 55, 29);
		getContentPane().add(ButtonJ5);
		
		 ButtonJ6 = new JToggleButton("J6");
		 mirarSiestaOcupadaPrimero(ButtonJ6,149);
        ButtonJ6.addActionListener(this);
		ButtonJ6.setBounds(322, 440, 55, 29);
		getContentPane().add(ButtonJ6);
		
		 ButtonJ7 = new JToggleButton("J7");
		 mirarSiestaOcupadaPrimero(ButtonJ7,150);
        ButtonJ7.addActionListener(this);
		ButtonJ7.setBounds(380, 440, 55, 29);
		getContentPane().add(ButtonJ7);
		
		 ButtonJ8 = new JToggleButton("J8");
		 mirarSiestaOcupadaPrimero(ButtonJ8,151);
        ButtonJ8.addActionListener(this);
		ButtonJ8.setBounds(438, 440, 55, 29);
		getContentPane().add(ButtonJ8);
		
		 ButtonJ9 = new JToggleButton("J9");
		 mirarSiestaOcupadaPrimero(ButtonJ9,152);
        ButtonJ9.addActionListener(this);
		ButtonJ9.setBounds(496, 440, 55, 29);
		getContentPane().add(ButtonJ9);
		
		 ButtonJ10 = new JToggleButton("J10");
		 mirarSiestaOcupadaPrimero(ButtonJ10,153);
        ButtonJ10.addActionListener(this);
		ButtonJ10.setBounds(557, 440, 55, 29);
		getContentPane().add(ButtonJ10);
		
		 ButtonJ11 = new JToggleButton("J11");
		 mirarSiestaOcupadaPrimero(ButtonJ11,154);
        ButtonJ11.addActionListener(this);
		ButtonJ11.setBounds(617, 440, 55, 29);
		getContentPane().add(ButtonJ11);
		
		 ButtonJ12 = new JToggleButton("J12");
		 mirarSiestaOcupadaPrimero(ButtonJ12,155);
        ButtonJ12.addActionListener(this);
		ButtonJ12.setBounds(676, 440, 55, 29);
		getContentPane().add(ButtonJ12);
		
		 ButtonJ13 = new JToggleButton("J13");
		 mirarSiestaOcupadaPrimero(ButtonJ13,156);
        ButtonJ13.addActionListener(this);
		ButtonJ13.setBounds(734, 440, 55, 29);
		getContentPane().add(ButtonJ13);
		
		 ButtonJ14 = new JToggleButton("J14");
		 mirarSiestaOcupadaPrimero(ButtonJ14,157);
        ButtonJ14.addActionListener(this);
		ButtonJ14.setBounds(792, 440, 55, 29);
		getContentPane().add(ButtonJ14);
		
		 ButtonJ15 = new JToggleButton("J15");
		 mirarSiestaOcupadaPrimero(ButtonJ15,158);
        ButtonJ15.addActionListener(this);
		ButtonJ15.setBounds(850, 440, 55, 29);
		getContentPane().add(ButtonJ15);
		
		 ButtonJ16 = new JToggleButton("J16");
		 mirarSiestaOcupadaPrimero(ButtonJ16,159);
        ButtonJ16.addActionListener(this);
		ButtonJ16.setBounds(916, 440, 55, 29);
		getContentPane().add(ButtonJ16);

		
		 ButtonK1 = new JToggleButton("K1");
		 mirarSiestaOcupadaPrimero(ButtonK1,160);
        ButtonK1.addActionListener(this);
		ButtonK1.setBounds(25, 481, 55, 29);
		getContentPane().add(ButtonK1);
		
		 ButtonK2 = new JToggleButton("K2");
		 mirarSiestaOcupadaPrimero(ButtonK2,161);
        ButtonK2.addActionListener(this);
		ButtonK2.setBounds(90, 481, 55, 29);
		getContentPane().add(ButtonK2);
		
		 ButtonK3 = new JToggleButton("K3");
		 mirarSiestaOcupadaPrimero(ButtonK3,162);
        ButtonK3.addActionListener(this);
		ButtonK3.setBounds(148, 481, 55, 29);
		getContentPane().add(ButtonK3);
		
		ButtonK4 = new JToggleButton("K4");
		mirarSiestaOcupadaPrimero(ButtonK4,163);
        ButtonK4.addActionListener(this);
		ButtonK4.setBounds(206, 481, 55, 29);
		getContentPane().add(ButtonK4);
		
		 ButtonK5 = new JToggleButton("K5");
		 mirarSiestaOcupadaPrimero(ButtonK5,164);
		 ButtonK5.addActionListener(this);
		ButtonK5.setBounds(264, 481, 55, 29);
		getContentPane().add(ButtonK5);
		
		 ButtonK6 = new JToggleButton("K6");
		 mirarSiestaOcupadaPrimero(ButtonK6,165);
        ButtonK6.addActionListener(this);
		ButtonK6.setBounds(322, 481, 55, 29);
		getContentPane().add(ButtonK6);
		
		 ButtonK7 = new JToggleButton("K7");
		 mirarSiestaOcupadaPrimero(ButtonK7,166);
        ButtonK7.addActionListener(this);
		ButtonK7.setBounds(380, 481, 55, 29);
		getContentPane().add(ButtonK7);
		
		 ButtonK8 = new JToggleButton("K8");
		 mirarSiestaOcupadaPrimero(ButtonK8,167);
        ButtonK8.addActionListener(this);
		ButtonK8.setBounds(438, 481, 55, 29);
		getContentPane().add(ButtonK8);
		
		 ButtonK9 = new JToggleButton("K9");
		 mirarSiestaOcupadaPrimero(ButtonK9,168);
        ButtonK9.addActionListener(this);
		ButtonK9.setBounds(496, 481, 55, 29);
		getContentPane().add(ButtonK9);
		
		 ButtonK10 = new JToggleButton("K10");
		 mirarSiestaOcupadaPrimero(ButtonK10,169);
        ButtonK10.addActionListener(this);
		ButtonK10.setBounds(557, 481, 55, 29);
		getContentPane().add(ButtonK10);
		
		 ButtonK11 = new JToggleButton("K11");
		 mirarSiestaOcupadaPrimero(ButtonK11,170);
        ButtonK11.addActionListener(this);
		ButtonK11.setBounds(617, 481, 55, 29);
		getContentPane().add(ButtonK11);
		
		 ButtonK12 = new JToggleButton("K12");
		 mirarSiestaOcupadaPrimero(ButtonK12,171);
        ButtonK12.addActionListener(this);
		ButtonK12.setBounds(676, 481, 55, 29);
		getContentPane().add(ButtonK12);
		
		 ButtonK13 = new JToggleButton("K13");
		 mirarSiestaOcupadaPrimero(ButtonK13,172);
        ButtonK13.addActionListener(this);
		ButtonK13.setBounds(734, 481, 55, 29);
		getContentPane().add(ButtonK13);
		
		ButtonK14 = new JToggleButton("K14");
		mirarSiestaOcupadaPrimero(ButtonK14,173);
        ButtonK14.addActionListener(this);
		ButtonK14.setBounds(792, 481, 55, 29);
		getContentPane().add(ButtonK14);
		
		 ButtonK15 = new JToggleButton("K15");
		 mirarSiestaOcupadaPrimero(ButtonK15,174);
        ButtonK15.addActionListener(this);
		ButtonK15.setBounds(850, 481, 55, 29);
		getContentPane().add(ButtonK15);
		
		 ButtonK16 = new JToggleButton("K16");
		 mirarSiestaOcupadaPrimero(ButtonK16,175);
        ButtonK16.addActionListener(this);
		ButtonK16.setBounds(916, 481, 55, 29);
		getContentPane().add(ButtonK16);
		

		 ButtonL1 = new JToggleButton("L1");
		 mirarSiestaOcupadaPrimero(ButtonL1,176);
        ButtonL1.addActionListener(this);
		ButtonL1.setBounds(25, 522, 55, 29);
		getContentPane().add(ButtonL1);
		
		 ButtonL2 = new JToggleButton("L2");
		 mirarSiestaOcupadaPrimero(ButtonL2,177);
		 ButtonL2.addActionListener(this);
		ButtonL2.setBounds(90, 522, 55, 29);
		getContentPane().add(ButtonL2);
		
		 ButtonL3 = new JToggleButton("L3");
		 mirarSiestaOcupadaPrimero(ButtonL3,178);
		 ButtonL3.addActionListener(this);
		ButtonL3.setBounds(148, 522, 55, 29);
		getContentPane().add(ButtonL3);
		
		ButtonL4 = new JToggleButton("L4");
		mirarSiestaOcupadaPrimero(ButtonL4,179);
        ButtonL4.addActionListener(this);
		ButtonL4.setBounds(206, 522, 55, 29);
		getContentPane().add(ButtonL4);
		
		 ButtonL5 = new JToggleButton("L5");
		mirarSiestaOcupadaPrimero(ButtonL5,180);
		ButtonL5.addActionListener(this);
		ButtonL5.setBounds(264, 522, 55, 29);
		getContentPane().add(ButtonL5);
		
		 ButtonL6 = new JToggleButton("L6");
		mirarSiestaOcupadaPrimero(ButtonL6,181);
		ButtonL6.addActionListener(this);
		ButtonL6.setBounds(322, 522, 55, 29);
		getContentPane().add(ButtonL6);
		
		 ButtonL7 = new JToggleButton("L7");
		mirarSiestaOcupadaPrimero(ButtonL7,182);
		ButtonL7.addActionListener(this);
		ButtonL7.setBounds(380, 522, 55, 29);
		getContentPane().add(ButtonL7);
		
		 ButtonL8 = new JToggleButton("L8");
		mirarSiestaOcupadaPrimero(ButtonL8,183);
		ButtonL8.addActionListener(this);
		ButtonL8.setBounds(438, 522, 55, 29);
		getContentPane().add(ButtonL8);
		
		 ButtonL9 = new JToggleButton("L9");
		mirarSiestaOcupadaPrimero(ButtonL9,184);
		ButtonL9.addActionListener(this);
		ButtonL9.setBounds(496, 522, 55, 29);
		getContentPane().add(ButtonL9);
		
		 ButtonL10 = new JToggleButton("L10");
		 mirarSiestaOcupadaPrimero(ButtonL10,185);
		 ButtonL10.addActionListener(this);
		ButtonL10.setBounds(557, 522, 55, 29);
		getContentPane().add(ButtonL10);
		
		 ButtonL11 = new JToggleButton("L11");
		 mirarSiestaOcupadaPrimero(ButtonL11,186);
		 ButtonL11.addActionListener(this);
		ButtonL11.setBounds(617, 522, 55, 29);
		getContentPane().add(ButtonL11);
		
		 ButtonL12 = new JToggleButton("L12");
		 mirarSiestaOcupadaPrimero(ButtonL12,187);
		 ButtonL12.addActionListener(this);
		ButtonL12.setBounds(676, 522, 55, 29);
		getContentPane().add(ButtonL12);
		
		 ButtonL13 = new JToggleButton("L13");
		mirarSiestaOcupadaPrimero(ButtonL13,188);
		ButtonL13.addActionListener(this);
		ButtonL13.setBounds(734, 522, 55, 29);
		getContentPane().add(ButtonL13);
		
		ButtonL14 = new JToggleButton("L14");
		mirarSiestaOcupadaPrimero(ButtonL14,189);
        ButtonL14.addActionListener(this);
		ButtonL14.setBounds(792, 522, 55, 29);
		getContentPane().add(ButtonL14);
		
		 ButtonL15 = new JToggleButton("L15");
	    mirarSiestaOcupadaPrimero(ButtonL15,190);
		ButtonL15.addActionListener(this);
		ButtonL15.setBounds(850, 522, 55, 29);
		getContentPane().add(ButtonL15);
		
		ButtonL16 = new JToggleButton("L16");
		mirarSiestaOcupadaPrimero(ButtonL16,191);
        ButtonL16.addActionListener(this);
		ButtonL16.setBounds(916, 522, 55, 29);
		getContentPane().add(ButtonL16);
		
		
		 ButtonM1 = new JToggleButton("M1");
		 mirarSiestaOcupadaPrimero(ButtonM1,192);
		 ButtonM1.addActionListener(this);
		ButtonM1.setBounds(25, 563, 55, 29);
		getContentPane().add(ButtonM1);
		
		 ButtonM2 = new JToggleButton("M2");
		mirarSiestaOcupadaPrimero(ButtonM2,193);
		ButtonM2.addActionListener(this);
		ButtonM2.setBounds(90, 563, 55, 29);
		getContentPane().add(ButtonM2);
		
		 ButtonM3 = new JToggleButton("M3");
		 mirarSiestaOcupadaPrimero(ButtonM3,194);
		 ButtonM3.addActionListener(this);
		ButtonM3.setBounds(148, 563, 55, 29);
		getContentPane().add(ButtonM3);
		
		 ButtonM4 = new JToggleButton("M4");
		 mirarSiestaOcupadaPrimero(ButtonM4,195);
		 ButtonM4.addActionListener(this);
		ButtonM4.setBounds(206, 563, 55, 29);
		getContentPane().add(ButtonM4);
		
		 ButtonM5 = new JToggleButton("M5");
		 mirarSiestaOcupadaPrimero(ButtonM5,196);
		 ButtonM5.addActionListener(this);
		ButtonM5.setBounds(264, 563, 55, 29);
		getContentPane().add(ButtonM5);
		
		 ButtonM6 = new JToggleButton("M6");
		 mirarSiestaOcupadaPrimero(ButtonM6,197);
		 ButtonM6.addActionListener(this);
		ButtonM6.setBounds(322, 563, 55, 29);
		getContentPane().add(ButtonM6);
		
		 ButtonM7 = new JToggleButton("M7");
		 mirarSiestaOcupadaPrimero(ButtonM7,198);
		 ButtonM7.addActionListener(this);
		ButtonM7.setBounds(380, 563, 55, 29);
		getContentPane().add(ButtonM7);
		
		 ButtonM8 = new JToggleButton("M8");
		 mirarSiestaOcupadaPrimero(ButtonM8,199);
		 ButtonM8.addActionListener(this);
		ButtonM8.setBounds(438, 563, 55, 29);
		getContentPane().add(ButtonM8);
		
		 ButtonM9 = new JToggleButton("M9");
		 mirarSiestaOcupadaPrimero(ButtonM9,200);
		 ButtonM9.addActionListener(this);
		ButtonM9.setBounds(496, 563, 55, 29);
		getContentPane().add(ButtonM9);
		
		 ButtonM10 = new JToggleButton("M10");
		 mirarSiestaOcupadaPrimero(ButtonM10,201);
		 ButtonM10.addActionListener(this);
		ButtonM10.setBounds(557, 563, 55, 29);
		getContentPane().add(ButtonM10);
		
		 ButtonM11 = new JToggleButton("M11");
		 mirarSiestaOcupadaPrimero(ButtonM11,202);
		 ButtonM11.addActionListener(this);
		ButtonM11.setBounds(617, 563, 55, 29);
		getContentPane().add(ButtonM11);
		
		 ButtonM12 = new JToggleButton("M12");
		 mirarSiestaOcupadaPrimero(ButtonM12,203);
		 ButtonM12.addActionListener(this);
		ButtonM12.setBounds(676, 563, 55, 29);
		getContentPane().add(ButtonM12);
		
		 ButtonM13 = new JToggleButton("M13");
		 mirarSiestaOcupadaPrimero(ButtonM13,204);
		 ButtonM13.addActionListener(this);
		ButtonM13.setBounds(734, 563, 55, 29);
		getContentPane().add(ButtonM13);
		
		 ButtonM14 = new JToggleButton("M14");
		 mirarSiestaOcupadaPrimero(ButtonM14,205);
		 ButtonM14.addActionListener(this);
		ButtonM14.setBounds(792, 563, 55, 29);
		getContentPane().add(ButtonM14);
		
		 ButtonM15 = new JToggleButton("M15");
		 mirarSiestaOcupadaPrimero(ButtonM15,206);
		 ButtonM15.addActionListener(this);
		ButtonM15.setBounds(850, 563, 55, 29);
		getContentPane().add(ButtonM15);
		
		 ButtonM16 = new JToggleButton("M16");
		 mirarSiestaOcupadaPrimero(ButtonM16,207);
		 ButtonM16.addActionListener(this);
		ButtonM16.setBounds(916, 563, 55, 29);
		getContentPane().add(ButtonM16);
		
		ButtonSiguiente = new JButton("SIGUIENTE");
		ButtonSiguiente.addActionListener(this);
			
		ButtonSiguiente.setBounds(775, 622, 139, 47);
		getContentPane().add(ButtonSiguiente);
		
		ButtonAtras = new JButton("Atras");
		ButtonAtras.addActionListener(this);
		ButtonAtras.setBounds(71, 622, 139, 47);
		getContentPane().add(ButtonAtras);
		
		
		
		}
		
		
		

	    @Override
		public void actionPerformed(ActionEvent e) {
	    	
         if (e.getSource() == ButtonAtras) {
			
			dispose();
	
}
         if (e.getSource() == ButtonSiguiente) {
         		
        	 
				
				
				mandarAsientoSeleccionado(ButtonA1, 0);
				mandarAsientoSeleccionado(ButtonA2, 1);
				mandarAsientoSeleccionado(ButtonA3, 2);
				mandarAsientoSeleccionado(ButtonA4, 3);
				mandarAsientoSeleccionado(ButtonA5, 4);
				mandarAsientoSeleccionado(ButtonA6, 5);
				mandarAsientoSeleccionado(ButtonA7, 6);
				mandarAsientoSeleccionado(ButtonA8, 7);
				mandarAsientoSeleccionado(ButtonA9, 8);
				mandarAsientoSeleccionado(ButtonA10, 9);
				mandarAsientoSeleccionado(ButtonA11, 10);
				mandarAsientoSeleccionado(ButtonA12, 11);
				mandarAsientoSeleccionado(ButtonA13, 12);
				mandarAsientoSeleccionado(ButtonA14, 13);
				mandarAsientoSeleccionado(ButtonA15, 14);
				mandarAsientoSeleccionado(ButtonA16, 15);
		

				mandarAsientoSeleccionado(ButtonB1, 16);
				mandarAsientoSeleccionado(ButtonB2, 17);
				mandarAsientoSeleccionado(ButtonB3, 18);
				mandarAsientoSeleccionado(ButtonB4, 19);
				mandarAsientoSeleccionado(ButtonB5, 20);
				mandarAsientoSeleccionado(ButtonB6, 21);
				mandarAsientoSeleccionado(ButtonB7, 22);
				mandarAsientoSeleccionado(ButtonB8, 23);
				mandarAsientoSeleccionado(ButtonB9, 24);
				mandarAsientoSeleccionado(ButtonB10,25);
				mandarAsientoSeleccionado(ButtonB11,26);
				mandarAsientoSeleccionado(ButtonB12,27);
				mandarAsientoSeleccionado(ButtonB13,28);
				mandarAsientoSeleccionado(ButtonB14,29);
				mandarAsientoSeleccionado(ButtonB15,30);
				mandarAsientoSeleccionado(ButtonB16,31);

				mandarAsientoSeleccionado(ButtonC1, 32);
				mandarAsientoSeleccionado(ButtonC2, 33);
				mandarAsientoSeleccionado(ButtonC3, 34);
				mandarAsientoSeleccionado(ButtonC4, 35);
				mandarAsientoSeleccionado(ButtonC5, 36);
				mandarAsientoSeleccionado(ButtonC6, 37);
				mandarAsientoSeleccionado(ButtonC7, 38);
				mandarAsientoSeleccionado(ButtonC8, 39);
				mandarAsientoSeleccionado(ButtonC9, 40);
				mandarAsientoSeleccionado(ButtonC10, 41);
				mandarAsientoSeleccionado(ButtonC11, 42);
				mandarAsientoSeleccionado(ButtonC12, 43);
				mandarAsientoSeleccionado(ButtonC13, 44);
				mandarAsientoSeleccionado(ButtonC14, 45);
				mandarAsientoSeleccionado(ButtonC15, 46);
				mandarAsientoSeleccionado(ButtonC16, 47);

				mandarAsientoSeleccionado(ButtonD1, 48);
				mandarAsientoSeleccionado(ButtonD2, 49);
				mandarAsientoSeleccionado(ButtonD3, 50);
				mandarAsientoSeleccionado(ButtonD4, 51);
				mandarAsientoSeleccionado(ButtonD5, 52);
				mandarAsientoSeleccionado(ButtonD6, 53);
				mandarAsientoSeleccionado(ButtonD7, 54);
				mandarAsientoSeleccionado(ButtonD8, 55);
				mandarAsientoSeleccionado(ButtonD9, 56);
				mandarAsientoSeleccionado(ButtonD10, 57);
				mandarAsientoSeleccionado(ButtonD11, 58);
				mandarAsientoSeleccionado(ButtonD12, 59);
				mandarAsientoSeleccionado(ButtonD13, 60);
				mandarAsientoSeleccionado(ButtonD14, 61);
				mandarAsientoSeleccionado(ButtonD15, 62);
				mandarAsientoSeleccionado(ButtonD16, 63);

				mandarAsientoSeleccionado(ButtonE1, 64);
				mandarAsientoSeleccionado(ButtonE2, 65);
				mandarAsientoSeleccionado(ButtonE3, 66);
				mandarAsientoSeleccionado(ButtonE4, 67);
				mandarAsientoSeleccionado(ButtonE5, 68);
				mandarAsientoSeleccionado(ButtonE6, 69);
				mandarAsientoSeleccionado(ButtonE7, 70);
				mandarAsientoSeleccionado(ButtonE8, 71);
				mandarAsientoSeleccionado(ButtonE9, 72);
				mandarAsientoSeleccionado(ButtonE10, 73);
				mandarAsientoSeleccionado(ButtonE11, 74);
				mandarAsientoSeleccionado(ButtonE12, 75);
				mandarAsientoSeleccionado(ButtonE13, 76);
				mandarAsientoSeleccionado(ButtonE14, 77);
				mandarAsientoSeleccionado(ButtonE15, 78);
				mandarAsientoSeleccionado(ButtonE16, 79);

				mandarAsientoSeleccionado(ButtonF1, 80);
				mandarAsientoSeleccionado(ButtonF2, 81);
				mandarAsientoSeleccionado(ButtonF3, 82);
				mandarAsientoSeleccionado(ButtonF4, 83);
				mandarAsientoSeleccionado(ButtonF5, 84);
				mandarAsientoSeleccionado(ButtonF6, 85);
				mandarAsientoSeleccionado(ButtonF7, 86);
				mandarAsientoSeleccionado(ButtonF8, 87);
				mandarAsientoSeleccionado(ButtonF9, 88);
				mandarAsientoSeleccionado(ButtonF10, 89);
				mandarAsientoSeleccionado(ButtonF11, 90);
				mandarAsientoSeleccionado(ButtonF12, 91);
				mandarAsientoSeleccionado(ButtonF13, 92);
				mandarAsientoSeleccionado(ButtonF14, 93);
				mandarAsientoSeleccionado(ButtonF15, 94);
				mandarAsientoSeleccionado(ButtonF16, 95);

				mandarAsientoSeleccionado(ButtonG1, 96);
				mandarAsientoSeleccionado(ButtonG2, 97);
				mandarAsientoSeleccionado(ButtonG3, 98);
				mandarAsientoSeleccionado(ButtonG4, 99);
				mandarAsientoSeleccionado(ButtonG5, 100);
				mandarAsientoSeleccionado(ButtonG6, 101);
				mandarAsientoSeleccionado(ButtonG7, 102);
				mandarAsientoSeleccionado(ButtonG8, 103);
				mandarAsientoSeleccionado(ButtonG9, 104);
				mandarAsientoSeleccionado(ButtonG10, 105);
				mandarAsientoSeleccionado(ButtonG11, 106);
				mandarAsientoSeleccionado(ButtonG12, 107);
				mandarAsientoSeleccionado(ButtonG13, 108);
				mandarAsientoSeleccionado(ButtonG14, 109);
				mandarAsientoSeleccionado(ButtonG15, 110);
				mandarAsientoSeleccionado(ButtonG16, 111);

				mandarAsientoSeleccionado(ButtonH1, 112);
				mandarAsientoSeleccionado(ButtonH2, 113);
				mandarAsientoSeleccionado(ButtonH3, 114);
				mandarAsientoSeleccionado(ButtonH4, 115);
				mandarAsientoSeleccionado(ButtonH5, 116);
				mandarAsientoSeleccionado(ButtonH6, 117);
				mandarAsientoSeleccionado(ButtonH7, 118);
				mandarAsientoSeleccionado(ButtonH8, 119);
				mandarAsientoSeleccionado(ButtonH9, 120);
				mandarAsientoSeleccionado(ButtonH10, 121);
				mandarAsientoSeleccionado(ButtonH11, 122);
				mandarAsientoSeleccionado(ButtonH12, 123);
				mandarAsientoSeleccionado(ButtonH13, 124);
				mandarAsientoSeleccionado(ButtonH14, 125);
				mandarAsientoSeleccionado(ButtonH15, 126);
				mandarAsientoSeleccionado(ButtonH16, 127);

				mandarAsientoSeleccionado(ButtonI1, 128);
				mandarAsientoSeleccionado(ButtonI2, 129);
				mandarAsientoSeleccionado(ButtonI3, 130);
				mandarAsientoSeleccionado(ButtonI4, 131);
				mandarAsientoSeleccionado(ButtonI5, 132);
				mandarAsientoSeleccionado(ButtonI6, 133);
				mandarAsientoSeleccionado(ButtonI7, 134);
				mandarAsientoSeleccionado(ButtonI8, 135);
				mandarAsientoSeleccionado(ButtonI9, 136);
				mandarAsientoSeleccionado(ButtonI10, 137);
				mandarAsientoSeleccionado(ButtonI11, 138);
				mandarAsientoSeleccionado(ButtonI12, 139);
				mandarAsientoSeleccionado(ButtonI13, 140);
				mandarAsientoSeleccionado(ButtonI14, 141);
				mandarAsientoSeleccionado(ButtonI15, 142);
				mandarAsientoSeleccionado(ButtonI16, 143);

				mandarAsientoSeleccionadoPreferencial(ButtonJ1, 144);
				mandarAsientoSeleccionadoPreferencial(ButtonJ2, 145);
				mandarAsientoSeleccionadoPreferencial(ButtonJ3, 146);
				mandarAsientoSeleccionadoPreferencial(ButtonJ4, 147);
				mandarAsientoSeleccionadoPreferencial(ButtonJ5, 148);
				mandarAsientoSeleccionadoPreferencial(ButtonJ6, 149);
				mandarAsientoSeleccionadoPreferencial(ButtonJ7, 150);
				mandarAsientoSeleccionadoPreferencial(ButtonJ8, 151);
				mandarAsientoSeleccionadoPreferencial(ButtonJ9, 152);
				mandarAsientoSeleccionadoPreferencial(ButtonJ10, 153);
				mandarAsientoSeleccionadoPreferencial(ButtonJ11, 154);
				mandarAsientoSeleccionadoPreferencial(ButtonJ12, 155);
				mandarAsientoSeleccionadoPreferencial(ButtonJ13, 156);
				mandarAsientoSeleccionadoPreferencial(ButtonJ14, 157);
				mandarAsientoSeleccionadoPreferencial(ButtonJ15, 158);
				mandarAsientoSeleccionadoPreferencial(ButtonJ16, 159);

				mandarAsientoSeleccionadoPreferencial(ButtonK1, 160);
				mandarAsientoSeleccionadoPreferencial(ButtonK2, 161);
				mandarAsientoSeleccionadoPreferencial(ButtonK3, 162);
				mandarAsientoSeleccionadoPreferencial(ButtonK4, 163);
				mandarAsientoSeleccionadoPreferencial(ButtonK5, 164);
				mandarAsientoSeleccionadoPreferencial(ButtonK6, 165);
				mandarAsientoSeleccionadoPreferencial(ButtonK7, 166);
				mandarAsientoSeleccionadoPreferencial(ButtonK8, 167);
				mandarAsientoSeleccionadoPreferencial(ButtonK9, 168);
				mandarAsientoSeleccionadoPreferencial(ButtonK10, 169);
				mandarAsientoSeleccionadoPreferencial(ButtonK11, 170);
				mandarAsientoSeleccionadoPreferencial(ButtonK12, 171);
				mandarAsientoSeleccionadoPreferencial(ButtonK13, 172);
				mandarAsientoSeleccionadoPreferencial(ButtonK14, 173);
				mandarAsientoSeleccionadoPreferencial(ButtonK15, 174);
				mandarAsientoSeleccionadoPreferencial(ButtonK16, 175);

				mandarAsientoSeleccionadoPreferencial(ButtonL1, 176);
				mandarAsientoSeleccionadoPreferencial(ButtonL2, 177);
				mandarAsientoSeleccionadoPreferencial(ButtonL3, 178);
				mandarAsientoSeleccionadoPreferencial(ButtonL4, 179);
				mandarAsientoSeleccionadoPreferencial(ButtonL5, 180);
				mandarAsientoSeleccionadoPreferencial(ButtonL6, 181);
				mandarAsientoSeleccionadoPreferencial(ButtonL7, 182);
				mandarAsientoSeleccionadoPreferencial(ButtonL8, 183);
				mandarAsientoSeleccionadoPreferencial(ButtonL9, 184);
				mandarAsientoSeleccionadoPreferencial(ButtonL10, 185);
				mandarAsientoSeleccionadoPreferencial(ButtonL11, 186);
				mandarAsientoSeleccionadoPreferencial(ButtonL12, 187);
				mandarAsientoSeleccionadoPreferencial(ButtonL13, 188);
				mandarAsientoSeleccionadoPreferencial(ButtonL14, 189);
				mandarAsientoSeleccionadoPreferencial(ButtonL15, 190);
				mandarAsientoSeleccionadoPreferencial(ButtonL16, 191);

				mandarAsientoSeleccionadoPreferencial(ButtonM1, 192);
				mandarAsientoSeleccionadoPreferencial(ButtonM2, 193);
				mandarAsientoSeleccionadoPreferencial(ButtonM3, 194);
				mandarAsientoSeleccionadoPreferencial(ButtonM4, 195);
				mandarAsientoSeleccionadoPreferencial(ButtonM5, 196);
				mandarAsientoSeleccionadoPreferencial(ButtonM6, 197);
				mandarAsientoSeleccionadoPreferencial(ButtonM7, 198);
				mandarAsientoSeleccionadoPreferencial(ButtonM8, 199);
				mandarAsientoSeleccionadoPreferencial(ButtonM9, 200);
				mandarAsientoSeleccionadoPreferencial(ButtonM10, 201);
				mandarAsientoSeleccionadoPreferencial(ButtonM11, 202);
				mandarAsientoSeleccionadoPreferencial(ButtonM12, 203);
				mandarAsientoSeleccionadoPreferencial(ButtonM13, 204);
				mandarAsientoSeleccionadoPreferencial(ButtonM14, 205);
				mandarAsientoSeleccionadoPreferencial(ButtonM15, 206);
				mandarAsientoSeleccionadoPreferencial(ButtonM16, 207);
				
				
				
			
				ViewConfiteria ventanaCombo = new ViewConfiteria(datoCedulaPerson, montoPorSillasSelec);
				ventanaCombo.setVisible(true);
				dispose();
				
				montoPorSillasSelec = 0;
		         
         }
         
         
         
         
}
}
