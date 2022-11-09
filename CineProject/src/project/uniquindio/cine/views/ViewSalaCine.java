package project.uniquindio.cine.views;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import project.uniquindio.cine.models.ModelUser;

import java.awt.Panel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class ViewSalaCine extends JFrame {

	private JPanel contentPane;
	private ModelUser sillas = new ModelUser();
	
	public ViewSalaCine() {
		viewSalaCinePanel();
		setLocationRelativeTo(null);
	}
	
	public void viewSalaCinePanel () {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 899, 501);
		setSize(900, 550);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 10, 864, 15);
		contentPane.add(panel);
		
		JLabel titulo = new JLabel("Pantalla");
		titulo.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setForeground(Color.WHITE);
		titulo.setBounds(379, 31, 60, 20);
		contentPane.add(titulo);
		
		
		
		fila1();
		fila2();
		fila3();
		fila4();
		fila5();
		fila6();
		fila7();
		fila8();
		botonesBottom();
	}
	
	public void fila1() {

		JToggleButton btnA1 = new JToggleButton("A1");
		btnA1.setBackground(new Color(0, 255, 0));
		btnA1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnA1.isSelected()) {
					sillas.sillasSeleccionadas.add("A1");
					System.out.println(sillas.sillasSeleccionadas.get(0));
				}else {
					sillas.sillasSeleccionadas.remove("A1");
					System.out.println("elimin");
				}
			}
		});
		btnA1.setBounds(10, 67, 60, 23);
		contentPane.add(btnA1);
		
		JToggleButton btnA2 = new JToggleButton("A2");
		btnA2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnA2.isSelected()) {
					
					sillas.sillasSeleccionadas.add("A2");
				}else {
					sillas.sillasSeleccionadas.remove("A2");
					
				}
			}
		});
		btnA2.setBackground(new Color(0, 255, 0));
		btnA2.setBounds(129, 67, 60, 23);
		contentPane.add(btnA2);
		
		JToggleButton btnA3 = new JToggleButton("A3");
		btnA3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnA3.isSelected()) {
					
					sillas.sillasSeleccionadas.add("A3");
				}else {
					sillas.sillasSeleccionadas.remove("A3");
					
				}
			}
		});
		btnA3.setBackground(new Color(0, 255, 0));
		btnA3.setBounds(257, 67, 60, 23);
		contentPane.add(btnA3);
		
		JToggleButton btnA4 = new JToggleButton("A4");
		btnA4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnA4.isSelected()) {
					
					sillas.sillasSeleccionadas.add("A4");
				}else {
					sillas.sillasSeleccionadas.remove("A4");
					
				}
			}
		});
		btnA4.setBackground(new Color(0, 255, 0));
		btnA4.setBounds(366, 67, 60, 23);
		contentPane.add(btnA4);
		
		JToggleButton btnA5 = new JToggleButton("A5");
		btnA5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnA5.isSelected()) {
					
					sillas.sillasSeleccionadas.add("A5");
				}else {
					sillas.sillasSeleccionadas.remove("A5");
					
				}
			}
		});
		btnA5.setBackground(new Color(0, 255, 0));
		btnA5.setBounds(477, 67, 60, 23);
		contentPane.add(btnA5);
		
		JToggleButton btnA6 = new JToggleButton("A6");
		btnA6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnA6.isSelected()) {
					
					sillas.sillasSeleccionadas.add("A6");
				}else {
					sillas.sillasSeleccionadas.remove("A6");
					
				}
			}
		});
		btnA6.setBackground(new Color(0, 255, 0));
		btnA6.setBounds(601, 67, 60, 23);
		contentPane.add(btnA6);
		
		JToggleButton btnA7 = new JToggleButton("A7");
		btnA7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnA7.isSelected()) {
					
					sillas.sillasSeleccionadas.add("A7");
				}else {
					sillas.sillasSeleccionadas.remove("A7");
					
				}
			}
		});
		btnA7.setBackground(new Color(0, 255, 0));
		btnA7.setBounds(708, 67, 60, 23);
		contentPane.add(btnA7);
		
		JToggleButton btnA8 = new JToggleButton("A8");
		btnA8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnA8.isSelected()) {
					
					sillas.sillasSeleccionadas.add("A8");
				}else {
					sillas.sillasSeleccionadas.remove("A8");
					
				}
			}
		});
		btnA8.setBackground(new Color(0, 255, 0));
		btnA8.setBounds(814, 67, 60, 23);
		contentPane.add(btnA8);
		
		
	}
	
	public void fila2() {
		JToggleButton btnB1 = new JToggleButton("B1");
		btnB1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnB1.isSelected()) {
					
					sillas.sillasSeleccionadas.add("B1");
				}else {
					sillas.sillasSeleccionadas.remove("B1");
					
				}
			}
		});
		btnB1.setBackground(new Color(0, 255, 0));
		btnB1.setBounds(10, 114, 60, 23);
		contentPane.add(btnB1);
		
		JToggleButton btnB2 = new JToggleButton("B2");
		btnB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnB2.isSelected()) {
					
					sillas.sillasSeleccionadas.add("B2");
				}else {
					sillas.sillasSeleccionadas.remove("B2");
					
				}
			}
		});
		btnB2.setBackground(new Color(0, 255, 0));
		btnB2.setBounds(129, 114, 60, 23);
		contentPane.add(btnB2);
		
		JToggleButton btnB3 = new JToggleButton("B3");
		btnB3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnB3.isSelected()) {
					
					sillas.sillasSeleccionadas.add("B3");
				}else {
					sillas.sillasSeleccionadas.remove("B3");
					
				}
			}
		});
		btnB3.setBackground(new Color(0, 255, 0));
		btnB3.setBounds(257, 114, 60, 23);
		contentPane.add(btnB3);
		
		JToggleButton btnB4 = new JToggleButton("B4");
		btnB4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnB4.isSelected()) {
					
					sillas.sillasSeleccionadas.add("B4");
				}else {
					sillas.sillasSeleccionadas.remove("B4");
					
				}
			}
		});
		btnB4.setBackground(new Color(0, 255, 0));
		btnB4.setBounds(366, 114, 60, 23);
		contentPane.add(btnB4);
		
		JToggleButton btnB5 = new JToggleButton("B5");
		btnB5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnB5.isSelected()) {
					
					sillas.sillasSeleccionadas.add("B5");
				}else {
					sillas.sillasSeleccionadas.remove("B5");
					
				}
			}
		});
		btnB5.setBackground(new Color(0, 255, 0));
		btnB5.setBounds(477, 114, 60, 23);
		contentPane.add(btnB5);
		
		JToggleButton btnB6 = new JToggleButton("B6");
		btnB6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnB6.isSelected()) {
					
					sillas.sillasSeleccionadas.add("B6");
				}else {
					sillas.sillasSeleccionadas.remove("B6");
					
				}
			}
		});
		btnB6.setBackground(new Color(0, 255, 0));
		btnB6.setBounds(601, 114, 60, 23);
		contentPane.add(btnB6);
		
		JToggleButton btnB7 = new JToggleButton("B7");
		btnB7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnB7.isSelected()) {
					
					sillas.sillasSeleccionadas.add("B7");
				}else {
					sillas.sillasSeleccionadas.remove("B7");
				}
			}
		});
		btnB7.setBackground(new Color(0, 255, 0));
		btnB7.setBounds(708, 114, 60, 23);
		contentPane.add(btnB7);
		
		JToggleButton btnB8 = new JToggleButton("B8");
		btnB8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnB8.isSelected()) {
					sillas.sillasSeleccionadas.add("B8");
				}else {
					sillas.sillasSeleccionadas.remove("B8");
				}
			}
		});
		btnB8.setBackground(new Color(0, 255, 0));
		btnB8.setBounds(814, 114, 60, 23);
		contentPane.add(btnB8);
		
	}
	
	public void fila3() {
		
		JToggleButton btnC1 = new JToggleButton("C1");
		btnC1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnC1.isSelected()) {
					sillas.sillasSeleccionadas.add("C1");
				}else {
					sillas.sillasSeleccionadas.remove("C1");
				}
			}
		});
		btnC1.setBackground(new Color(0, 255, 0));
		btnC1.setBounds(10, 159, 60, 23);
		
		contentPane.add(btnC1);
		JToggleButton btnC2 = new JToggleButton("C2");
		btnC2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnC2.isSelected()) {
					sillas.sillasSeleccionadas.add("C2");
				}else {
					sillas.sillasSeleccionadas.remove("C2");
				}
			}
		});
		btnC2.setBackground(new Color(0, 255, 0));
		btnC2.setBounds(129, 159, 60, 23);
		contentPane.add(btnC2);
		
		JToggleButton btnC3 = new JToggleButton("C3");
		btnC3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnC3.isSelected()) {
					sillas.sillasSeleccionadas.add("C3");
				}else {
					sillas.sillasSeleccionadas.remove("C3");
				}
			}
		});
		btnC3.setBackground(new Color(0, 255, 0));
		btnC3.setBounds(257, 159, 60, 23);
		contentPane.add(btnC3);
		
		JToggleButton btnC4 = new JToggleButton("C4");
		btnC4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnC4.isSelected()) {
					sillas.sillasSeleccionadas.add("C4");
				}else {
					sillas.sillasSeleccionadas.remove("C4");
				}
			}
		});
		btnC4.setBackground(new Color(0, 255, 0));
		btnC4.setBounds(366, 159, 60, 23);
		contentPane.add(btnC4);
		
		JToggleButton btnC5 = new JToggleButton("C5");
		btnC5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnC5.isSelected()) {
					sillas.sillasSeleccionadas.add("C5");
				}else {
					sillas.sillasSeleccionadas.remove("C5");
				}
			}
		});
		btnC5.setBackground(new Color(0, 255, 0));
		btnC5.setBounds(477, 159, 60, 23);
		contentPane.add(btnC5);
		
		JToggleButton btnC6 = new JToggleButton("C6");
		btnC6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnC6.isSelected()) {
					sillas.sillasSeleccionadas.add("C6");
				}else {
					sillas.sillasSeleccionadas.remove("C6");
				}
			}
		});
		btnC6.setBackground(new Color(0, 255, 0));
		btnC6.setBounds(601, 159, 60, 23);
		contentPane.add(btnC6);
		
		JToggleButton btnC7 = new JToggleButton("C7");
		btnC7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnC7.isSelected()) {
					sillas.sillasSeleccionadas.add("C7");
				}else {
					sillas.sillasSeleccionadas.remove("C7");
				}
			}
		});
		btnC7.setBackground(new Color(0, 255, 0));
		btnC7.setBounds(708, 159, 60, 23);
		contentPane.add(btnC7);
		
		JToggleButton btnC8 = new JToggleButton("C8");
		btnC8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnC8.isSelected()) {
					sillas.sillasSeleccionadas.add("C8");
				}else {
					sillas.sillasSeleccionadas.remove("C8");
				}
			}
		});
		btnC8.setBackground(new Color(0, 255, 0));
		btnC8.setBounds(814, 159, 60, 23);
		contentPane.add(btnC8);
		
	}
	
	public void fila4() {
		JToggleButton btnD1 = new JToggleButton("D1");
		btnD1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnD1.isSelected()) {
					sillas.sillasSeleccionadas.add("D1");
				}else {
					sillas.sillasSeleccionadas.remove("D1");
				}
			}
		});
		btnD1.setBackground(new Color(0, 255, 0));
		btnD1.setBounds(10, 202, 60, 23);
		contentPane.add(btnD1);
		
		JToggleButton btnD2 = new JToggleButton("D2");
		btnD2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnD2.isSelected()) {
					sillas.sillasSeleccionadas.add("D2");
				}else {
					sillas.sillasSeleccionadas.remove("D2");
				}
			}
		});
		btnD2.setBackground(new Color(0, 255, 0));
		btnD2.setBounds(129, 202, 60, 23);
		contentPane.add(btnD2);
		
		JToggleButton btnD3 = new JToggleButton("D3");
		btnD3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnD3.isSelected()) {
					sillas.sillasSeleccionadas.add("D3");
				}else {
					sillas.sillasSeleccionadas.remove("D3");
				}
			}
		});
		btnD3.setBackground(new Color(0, 255, 0));
		btnD3.setBounds(257, 202, 60, 23);
		contentPane.add(btnD3);
		
		JToggleButton btnD4 = new JToggleButton("D4");
		btnD4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnD4.isSelected()) {
					sillas.sillasSeleccionadas.add("D4");
				}else {
					sillas.sillasSeleccionadas.remove("D4");
				}
			}
		});
		btnD4.setBackground(new Color(0, 255, 0));
		btnD4.setBounds(366, 202, 60, 23);
		contentPane.add(btnD4);
		
		JToggleButton btnD5 = new JToggleButton("D5");
		btnD5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnD5.isSelected()) {
					sillas.sillasSeleccionadas.add("D5");
				}else {
					sillas.sillasSeleccionadas.remove("D5");
				}
			}
		});
		btnD5.setBackground(new Color(0, 255, 0));
		btnD5.setBounds(477, 202, 60, 23);
		contentPane.add(btnD5);
		
		JToggleButton btnD6 = new JToggleButton("D6");
		btnD6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnD6.isSelected()) {
					sillas.sillasSeleccionadas.add("D6");
				}else {
					sillas.sillasSeleccionadas.remove("D6");
				}
			}
		});
		btnD6.setBackground(new Color(0, 255, 0));
		btnD6.setBounds(601, 202, 60, 23);
		contentPane.add(btnD6);
		
		JToggleButton btnD7 = new JToggleButton("D7");
		btnD7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnD7.isSelected()) {
					sillas.sillasSeleccionadas.add("D7");
				}else {
					sillas.sillasSeleccionadas.remove("D7");
				}
			}
		});
		btnD7.setBackground(new Color(0, 255, 0));
		btnD7.setBounds(708, 202, 60, 23);
		contentPane.add(btnD7);
		
		JToggleButton btnD8 = new JToggleButton("D8");
		btnD8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnD8.isSelected()) {
					sillas.sillasSeleccionadas.add("D8");
				}else {
					sillas.sillasSeleccionadas.remove("D8");
				}
			}
		});
		btnD8.setBackground(new Color(0, 255, 0));
		btnD8.setBounds(814, 202, 60, 23);
		contentPane.add(btnD8);
	
	}
	
	public void fila5() {
		JToggleButton btnE1 = new JToggleButton("E1");
		btnE1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnE1.isSelected()) {
					sillas.sillasSeleccionadas.add("E1");
				}else {
					sillas.sillasSeleccionadas.remove("E1");
				}
			}
		});
		btnE1.setBackground(new Color(0, 255, 0));
		btnE1.setBounds(10, 251, 60, 23);
		contentPane.add(btnE1);
		
		JToggleButton btnE2 = new JToggleButton("E2");
		btnE2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnE2.isSelected()) {
					sillas.sillasSeleccionadas.add("E2");
				}else {
					sillas.sillasSeleccionadas.remove("E2");
				}
			}
		});
		btnE2.setBackground(new Color(0, 255, 0));
		btnE2.setBounds(129, 251, 60, 23);
		contentPane.add(btnE2);
		
		JToggleButton btnE3 = new JToggleButton("E3");
		btnE3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnE3.isSelected()) {
					sillas.sillasSeleccionadas.add("E3");
				}else {
					sillas.sillasSeleccionadas.remove("E3");
				}
			}
		});
		btnE3.setBackground(new Color(0, 255, 0));
		btnE3.setBounds(257, 251, 60, 23);
		contentPane.add(btnE3);
		
		JToggleButton btnE4 = new JToggleButton("E4");
		btnE4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnE4.isSelected()) {
					sillas.sillasSeleccionadas.add("E4");
				}else {
					sillas.sillasSeleccionadas.remove("E4");
				}
			}
		});
		btnE4.setBackground(new Color(0, 255, 0));
		btnE4.setBounds(366, 251, 60, 23);
		contentPane.add(btnE4);
		
		JToggleButton btnE5 = new JToggleButton("E5");
		btnE5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnE5.isSelected()) {
					sillas.sillasSeleccionadas.add("E5");
				}else {
					sillas.sillasSeleccionadas.remove("E5");
				}
			}
		});
		btnE5.setBackground(new Color(0, 255, 0));
		btnE5.setBounds(477, 251, 60, 23);
		contentPane.add(btnE5);
		
		JToggleButton btnE6 = new JToggleButton("E6");
		btnE6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnE6.isSelected()) {
					sillas.sillasSeleccionadas.add("E6");
				}else {
					sillas.sillasSeleccionadas.remove("E6");
				}
			}
		});
		btnE6.setBackground(new Color(0, 255, 0));
		btnE6.setBounds(601, 251, 60, 23);
		contentPane.add(btnE6);
		
		JToggleButton btnE7 = new JToggleButton("E7");
		btnE7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnE7.isSelected()) {
					sillas.sillasSeleccionadas.add("E7");
				}else {
					sillas.sillasSeleccionadas.remove("E7");
				}
			}
		});
		btnE7.setBackground(new Color(0, 255, 0));
		btnE7.setBounds(708, 251, 60, 23);
		contentPane.add(btnE7);
		
		JToggleButton btnE8 = new JToggleButton("E8");
		btnE8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnE8.isSelected()) {
					sillas.sillasSeleccionadas.add("E8");
				}else {
					sillas.sillasSeleccionadas.remove("E8");
				}
			}
		});
		btnE8.setBackground(new Color(0, 255, 0));
		btnE8.setBounds(814, 251, 60, 23);
		contentPane.add(btnE8);
		
	}
	
	public void fila6() {
		
		JToggleButton btnF1 = new JToggleButton("F1");
		btnF1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnF1.isSelected()) {
					sillas.sillasSeleccionadas.add("F1");
				}else {
					sillas.sillasSeleccionadas.remove("F1");
				}
			}
		});
		btnF1.setBackground(new Color(0, 255, 0));
		btnF1.setBounds(10, 296, 60, 23);
		contentPane.add(btnF1);
		
		JToggleButton btnF2 = new JToggleButton("F2");
		btnF2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnF2.isSelected()) {
					sillas.sillasSeleccionadas.add("F2");
				}else {
					sillas.sillasSeleccionadas.remove("F2");
				}
			}
		});
		btnF2.setBackground(new Color(0, 255, 0));
		btnF2.setBounds(129, 296, 60, 23);
		contentPane.add(btnF2);
		
		JToggleButton btnF3 = new JToggleButton("F3");
		btnF3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnF3.isSelected()) {
					sillas.sillasSeleccionadas.add("F3");
				}else {
					sillas.sillasSeleccionadas.remove("F3");
				}
			}
		});
		btnF3.setBackground(new Color(0, 255, 0));
		btnF3.setBounds(257, 296, 60, 23);
		contentPane.add(btnF3);
		
		JToggleButton btnF4 = new JToggleButton("F4");
		btnF4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnF4.isSelected()) {
					sillas.sillasSeleccionadas.add("F4");
				}else {
					sillas.sillasSeleccionadas.remove("F4");
				}
			}
		});
		btnF4.setBackground(new Color(0, 255, 0));
		btnF4.setBounds(366, 296, 60, 23);
		contentPane.add(btnF4);
		
		JToggleButton btnF5 = new JToggleButton("F5");
		btnF5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnF5.isSelected()) {
					sillas.sillasSeleccionadas.add("F5");
				}else {
					sillas.sillasSeleccionadas.remove("F5");
				}
			}
		});
		btnF5.setBackground(new Color(0, 255, 0));
		btnF5.setBounds(477, 296, 60, 23);
		contentPane.add(btnF5);
		
		JToggleButton btnF6 = new JToggleButton("F6");
		btnF6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnF6.isSelected()) {
					sillas.sillasSeleccionadas.add("F6");
				}else {
					sillas.sillasSeleccionadas.remove("F6");
				}
			}
		});
		btnF6.setBackground(new Color(0, 255, 0));
		btnF6.setBounds(601, 296, 60, 23);
		contentPane.add(btnF6);
		
		JToggleButton btnF7 = new JToggleButton("F7");
		btnF7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnF7.isSelected()) {
					sillas.sillasSeleccionadas.add("F7");
				}else {
					sillas.sillasSeleccionadas.remove("F7");
				}
			}
		});
		btnF7.setBackground(new Color(0, 255, 0));
		btnF7.setBounds(708, 296, 60, 23);
		contentPane.add(btnF7);
		
		JToggleButton btnF8 = new JToggleButton("F8");
		btnF8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnF8.isSelected()) {
					sillas.sillasSeleccionadas.add("F8");
				}else {
					sillas.sillasSeleccionadas.remove("F8");
				}
			}
		});
		btnF8.setBackground(new Color(0, 255, 0));
		btnF8.setBounds(814, 296, 60, 23);
		contentPane.add(btnF8);
	}
	
	public void fila7() {
		JToggleButton btnG1 = new JToggleButton("G1");
		btnG1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnG1.isSelected()) {
					sillas.sillasSeleccionadas.add("G1");
				}else {
					sillas.sillasSeleccionadas.remove("G1");
				}
			}
		});
		btnG1.setBackground(new Color(0, 255, 0));
		btnG1.setBounds(10, 340, 60, 23);
		contentPane.add(btnG1);
		
		JToggleButton btnG2 = new JToggleButton("G2");
		btnG2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnG2.isSelected()) {
					sillas.sillasSeleccionadas.add("G2");
				}else {
					sillas.sillasSeleccionadas.remove("G2");
				}
			}
		});
		btnG2.setBackground(new Color(0, 255, 0));
		btnG2.setBounds(129, 340, 60, 23);
		contentPane.add(btnG2);
		
		JToggleButton btnG3 = new JToggleButton("G3");
		btnG3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnG3.isSelected()) {
					sillas.sillasSeleccionadas.add("G3");
				}else {
					sillas.sillasSeleccionadas.remove("G3");
				}
			}
		});
		btnG3.setBackground(new Color(0, 255, 0));
		btnG3.setBounds(257, 340, 60, 23);
		contentPane.add(btnG3);
		
		JToggleButton btnG4 = new JToggleButton("G4");
		btnG4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnG4.isSelected()) {
					sillas.sillasSeleccionadas.add("G4");
				}else {
					sillas.sillasSeleccionadas.remove("G4");
				}
			}
		});
		btnG4.setBackground(new Color(0, 255, 0));
		btnG4.setBounds(366, 340, 60, 23);
		contentPane.add(btnG4);
		
		JToggleButton btnG5 = new JToggleButton("G5");
		btnG5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnG5.isSelected()) {
					sillas.sillasSeleccionadas.add("G5");
				}else {
					sillas.sillasSeleccionadas.remove("G5");
				}
			}
		});
		btnG5.setBackground(new Color(0, 255, 0));
		btnG5.setBounds(477, 340, 60, 23);
		contentPane.add(btnG5);
		
		JToggleButton btnG6 = new JToggleButton("G6");
		btnG6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnG6.isSelected()) {
					sillas.sillasSeleccionadas.add("G6");
				}else {
					sillas.sillasSeleccionadas.remove("G6");
				}
			}
		});
		btnG6.setBackground(new Color(0, 255, 0));
		btnG6.setBounds(601, 340, 60, 23);
		contentPane.add(btnG6);
		
		JToggleButton btnG7 = new JToggleButton("G7");
		btnG7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnG7.isSelected()) {
					sillas.sillasSeleccionadas.add("G7");
				}else {
					sillas.sillasSeleccionadas.remove("G7");
				}
			}
		});
		btnG7.setBackground(new Color(0, 255, 0));
		btnG7.setBounds(708, 340, 60, 23);
		contentPane.add(btnG7);
		
		JToggleButton btnG8 = new JToggleButton("G8");
		btnG8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnG8.isSelected()) {
					sillas.sillasSeleccionadas.add("G8");
				}else {
					sillas.sillasSeleccionadas.remove("G8");
				}
			}
		});
		btnG8.setBackground(new Color(0, 255, 0));
		btnG8.setBounds(814, 340, 60, 23);
		contentPane.add(btnG8);
		
	}
	
	public void fila8() {
		JToggleButton btnH1 = new JToggleButton("H1");
		btnH1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnH1.isSelected()) {
					sillas.sillasSeleccionadas.add("H1");
				}else {
					sillas.sillasSeleccionadas.remove("H1");
				}
			}
		});
		btnH1.setBackground(new Color(0, 255, 0));
		btnH1.setBounds(10, 385, 60, 23);
		contentPane.add(btnH1);
		
		JToggleButton btnH2 = new JToggleButton("H2");
		btnH2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnH2.isSelected()) {
					sillas.sillasSeleccionadas.add("H2");
				}else {
					sillas.sillasSeleccionadas.remove("H2");
				}
			}
		});
		btnH2.setBackground(new Color(0, 255, 0));
		btnH2.setBounds(129, 385, 60, 23);
		contentPane.add(btnH2);
		
		JToggleButton btnH3 = new JToggleButton("H3");
		btnH3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnH3.isSelected()) {
					sillas.sillasSeleccionadas.add("H3");
				}else {
					sillas.sillasSeleccionadas.remove("H3");
				}
			}
		});
		btnH3.setBackground(new Color(0, 255, 0));
		btnH3.setBounds(257, 385, 60, 23);
		contentPane.add(btnH3);
		
		JToggleButton btnH4 = new JToggleButton("H4");
		btnH4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnH4.isSelected()) {
					sillas.sillasSeleccionadas.add("H4");
				}else {
					sillas.sillasSeleccionadas.remove("H4");
				}
			}
		});
		btnH4.setBackground(new Color(0, 255, 0));
		btnH4.setBounds(366, 385, 60, 23);
		contentPane.add(btnH4);
		
		JToggleButton btnH5 = new JToggleButton("H5");
		btnH5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnH5.isSelected()) {
					sillas.sillasSeleccionadas.add("H5");
				}else {
					sillas.sillasSeleccionadas.remove("H5");
				}
			}
		});
		btnH5.setBackground(new Color(0, 255, 0));
		btnH5.setBounds(477, 385, 60, 23);
		contentPane.add(btnH5);
		
		JToggleButton btnH6 = new JToggleButton("H6");
		btnH6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnH6.isSelected()) {
					sillas.sillasSeleccionadas.add("H6");
				}else {
					sillas.sillasSeleccionadas.remove("H6");
				}
			}
		});
		btnH6.setBackground(new Color(0, 255, 0));
		btnH6.setBounds(601, 385, 60, 23);
		contentPane.add(btnH6);
		
		JToggleButton btnH7 = new JToggleButton("H7");
		btnH7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnH7.isSelected()) {
					sillas.sillasSeleccionadas.add("H7");
				}else {
					sillas.sillasSeleccionadas.remove("H7");
				}
			}
		});
		btnH7.setBackground(new Color(0, 255, 0));
		btnH7.setBounds(708, 385, 60, 23);
		contentPane.add(btnH7);
		
		JToggleButton btnH8 = new JToggleButton("H8");
		btnH8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnH8.isSelected()) {
					sillas.sillasSeleccionadas.add("H8");
				}else {
					sillas.sillasSeleccionadas.remove("H8");
				}
			}
		});
		btnH8.setBackground(new Color(0, 255, 0));
		btnH8.setBounds(814, 385, 60, 23);
		contentPane.add(btnH8);
		
		
	}
	
	public void botonesBottom() {

		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewMovies viewMovies = new ViewMovies();
				viewMovies.setVisible(true);
				if(!sillas.sillasSeleccionadas.isEmpty()) { 
					sillas.sillasSeleccionadas.clear();
				}
					
			}
		});
		btnRegresar.setVerticalAlignment(SwingConstants.BOTTOM);
		btnRegresar.setForeground(Color.BLACK);
		btnRegresar.setFont(new Font("Sylfaen", Font.BOLD, 21));
		btnRegresar.setBackground(Color.LIGHT_GRAY);
		btnRegresar.setAutoscrolls(true);
		btnRegresar.setBounds(10, 451, 186, 49);
		contentPane.add(btnRegresar);
		
		JButton btnSiguienteResum = new JButton("Siguiente");
		btnSiguienteResum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ViewConfiteria viewConfiteria = new ViewConfiteria();
				viewConfiteria.setVisible(true);
			}
		});
		btnSiguienteResum.setVerticalAlignment(SwingConstants.BOTTOM);
		btnSiguienteResum.setForeground(Color.BLACK);
		btnSiguienteResum.setFont(new Font("Sylfaen", Font.BOLD, 21));
		btnSiguienteResum.setBackground(Color.LIGHT_GRAY);
		btnSiguienteResum.setAutoscrolls(true);
		btnSiguienteResum.setBounds(688, 451, 186, 49);
		contentPane.add(btnSiguienteResum);
	}

}


