package project.uniquindio.cine.views;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


@SuppressWarnings("serial")
public class ViewConfiteria extends JFrame {

	private JPanel contentPane;
	private JTextField txtTitulo;
	

	
	public ViewConfiteria() {
		viewConfiteriaPanel();
		this.setLocationRelativeTo(null);
	}
	
	public void viewConfiteriaPanel () {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		titulo();
		product1();
		producto2();
		producto3();
		producto4();
		producto5();
		producto6();
		producto7();
		producto8();
	}
	
	public void titulo () {
		txtTitulo = new JTextField();
		txtTitulo.setText("TIENDA");
		txtTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		txtTitulo.setForeground(Color.WHITE);
		txtTitulo.setFont(new Font("Sylfaen", Font.BOLD, 17));
		txtTitulo.setColumns(10);
		txtTitulo.setBorder(null);
		txtTitulo.setBackground(Color.BLACK);
		txtTitulo.setBounds(354, 11, 149, 20);
		contentPane.add(txtTitulo);
		
		
	}
	
	public void product1 () {
		JLabel imgProduct1 = new JLabel();
		imgProduct1.setLocation(34, 48);
		imgProduct1.setSize(100, 150);
		ImageIcon imagen = new ImageIcon("imagenes/palomitas.jpg");
		Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(imgProduct1.getWidth(), imgProduct1.getHeight(), Image.SCALE_DEFAULT));
		imgProduct1.setIcon(icon);
		contentPane.add(imgProduct1);
		
		JLabel nombreProducto = new JLabel("Palomitas");
		nombreProducto.setHorizontalAlignment(SwingConstants.CENTER);
		nombreProducto.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		nombreProducto.setForeground(Color.WHITE);
		nombreProducto.setBounds(55, 213, 60, 20);
		contentPane.add(nombreProducto);
		
		
		
		JSpinner counter = new JSpinner();
		
		
		counter.setBounds(72, 242, 30, 20);
		
		//evita que se agreguen valores negativos
		SpinnerNumberModel nm = new SpinnerNumberModel();
		nm.setMinimum(0);
		nm.setMaximum(50);
		counter.setModel(nm);
		contentPane.add(counter);	
		
	}
	
	public void producto2() {
		JLabel imgProduct2 = new JLabel();
		imgProduct2.setBounds(273, 48, 100, 150);
		imgProduct2.setSize(100, 150);
		ImageIcon imagen = new ImageIcon("imagenes/hotdog.jpg");
		Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(imgProduct2.getWidth(), imgProduct2.getHeight(), Image.SCALE_DEFAULT));
		imgProduct2.setIcon(icon);
		contentPane.add(imgProduct2);
		
		JLabel lblHotDog = new JLabel("Hot dog");
		lblHotDog.setHorizontalAlignment(SwingConstants.CENTER);
		lblHotDog.setForeground(Color.WHITE);
		lblHotDog.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		lblHotDog.setBounds(294, 213, 60, 20);
		contentPane.add(lblHotDog);
		
		JSpinner counter = new JSpinner();
		counter.setBounds(306, 242, 30, 20);
		
		//evita que se agreguen valores negativos
		SpinnerNumberModel nm = new SpinnerNumberModel();
		nm.setMinimum(0);
		nm.setMaximum(50);
		counter.setModel(nm);
		contentPane.add(counter);
	}
	
	public void producto3() {
		JLabel imgProduct3 = new JLabel();
		imgProduct3.setBounds(504, 48, 100, 150);
		imgProduct3.setSize(100, 150);
		ImageIcon imagen = new ImageIcon("imagenes/hamburguesa.jpg");
		Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(imgProduct3.getWidth(), imgProduct3.getHeight(), Image.SCALE_DEFAULT));
		imgProduct3.setIcon(icon);
		contentPane.add(imgProduct3);
		
		JLabel lblHamburguesa = new JLabel("Hamburguesa");
		lblHamburguesa.setHorizontalAlignment(SwingConstants.CENTER);
		lblHamburguesa.setForeground(Color.WHITE);
		lblHamburguesa.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		lblHamburguesa.setBounds(514, 213, 80, 20);
		contentPane.add(lblHamburguesa);
		
		JSpinner counter = new JSpinner();
		counter.setBounds(537, 242, 30, 20);
		contentPane.add(counter);
		
	
		
		SpinnerNumberModel nm = new SpinnerNumberModel();
		nm.setMinimum(0);
		nm.setMaximum(50);
		counter.setModel(nm);
		contentPane.add(counter);
		
	}
	public void producto4() {
		JLabel imgProduct4 = new JLabel();
		imgProduct4.setBounds(743, 48, 100, 150);
		imgProduct4.setSize(100, 150);
		ImageIcon imagen = new ImageIcon("imagenes/nachos.jpg");
		Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(imgProduct4.getWidth(), imgProduct4.getHeight(), Image.SCALE_DEFAULT));
		imgProduct4.setIcon(icon);
		contentPane.add(imgProduct4);
		
		JLabel lblNachos = new JLabel("Nachos");
		lblNachos.setHorizontalAlignment(SwingConstants.CENTER);
		lblNachos.setForeground(Color.WHITE);
		lblNachos.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		lblNachos.setBounds(753, 213, 80, 20);
		contentPane.add(lblNachos);
		
		JSpinner counter = new JSpinner();
		counter.setBounds(781, 242, 30, 20);
		contentPane.add(counter);
		
		SpinnerNumberModel nm = new SpinnerNumberModel();
		nm.setMinimum(0);
		nm.setMaximum(50);
		counter.setModel(nm);
		contentPane.add(counter);
		
		
			
	}
	
	public void producto5() {
		JLabel imgProduct5 = new JLabel();
		imgProduct5.setBounds(34, 295, 100, 150);
		imgProduct5.setSize(100, 150);
		ImageIcon imagen = new ImageIcon("imagenes/water.jpg");
		Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(imgProduct5.getWidth(), imgProduct5.getHeight(), Image.SCALE_DEFAULT));
		imgProduct5.setIcon(icon);
		contentPane.add(imgProduct5);
		
		JLabel lblAgua = new JLabel("Agua");
		lblAgua.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgua.setForeground(Color.WHITE);
		lblAgua.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		lblAgua.setBounds(55, 467, 60, 20);
		contentPane.add(lblAgua);
		
		JSpinner counter_1 = new JSpinner();
		counter_1.setBounds(72, 498, 30, 20);
		contentPane.add(counter_1);
		
		
	}
	public void producto6() {
		JLabel imgProduct6 = new JLabel();
		imgProduct6.setBounds(273, 295, 100, 150);
		imgProduct6.setSize(100, 150);
		ImageIcon imagen = new ImageIcon("imagenes/cocacola.jpg");
		Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(imgProduct6.getWidth(), imgProduct6.getHeight(), Image.SCALE_DEFAULT));
		imgProduct6.setIcon(icon);
		contentPane.add(imgProduct6);
		
		JLabel lblCocacola = new JLabel("Coca cola");
		lblCocacola.setHorizontalAlignment(SwingConstants.CENTER);
		lblCocacola.setForeground(Color.WHITE);
		lblCocacola.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		lblCocacola.setBounds(294, 467, 60, 20);
		contentPane.add(lblCocacola);
		
		JSpinner counter = new JSpinner();
		counter.setBounds(306, 498, 30, 20);
		contentPane.add(counter);
		
		
	}
	
	public void producto7() {
		JLabel imgProduct7 = new JLabel();
		imgProduct7.setBounds(504, 295, 100, 150);
		imgProduct7.setSize(100, 150);
		ImageIcon imagen = new ImageIcon("imagenes/cocacola.jpg");
		Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(imgProduct7.getWidth(), imgProduct7.getHeight(), Image.SCALE_DEFAULT));
		imgProduct7.setIcon(icon);
		contentPane.add(imgProduct7);
		
		JLabel lblPepsi = new JLabel("Pepsi");
		lblPepsi.setHorizontalAlignment(SwingConstants.CENTER);
		lblPepsi.setForeground(Color.WHITE);
		lblPepsi.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		lblPepsi.setBounds(514, 467, 80, 20);
		contentPane.add(lblPepsi);
		
		JSpinner counter_1 = new JSpinner();
		counter_1.setBounds(537, 498, 30, 20);
		contentPane.add(counter_1);
		
		
		
	}
	public void producto8() {
		JLabel imgProduct8 = new JLabel();
		imgProduct8.setBounds(743, 295, 100, 150);
		imgProduct8.setSize(100, 150);
		ImageIcon imagen = new ImageIcon("imagenes/cocacola.jpg");
		Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(imgProduct8.getWidth(), imgProduct8.getHeight(), Image.SCALE_DEFAULT));
		imgProduct8.setIcon(icon);
		contentPane.add(imgProduct8);
		
		JLabel lblMonster = new JLabel("Monster");
		lblMonster.setHorizontalAlignment(SwingConstants.CENTER);
		lblMonster.setForeground(Color.WHITE);
		lblMonster.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		lblMonster.setBounds(753, 467, 80, 20);
		contentPane.add(lblMonster);
		
		JSpinner counter = new JSpinner();
		counter.setBounds(781, 498, 30, 20);
		contentPane.add(counter);
		
		JButton btnSiguienteResum = new JButton("Siguiente");
		btnSiguienteResum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSiguienteResum.setVerticalAlignment(SwingConstants.BOTTOM);
		btnSiguienteResum.setForeground(Color.BLACK);
		btnSiguienteResum.setFont(new Font("Sylfaen", Font.BOLD, 21));
		btnSiguienteResum.setBackground(Color.LIGHT_GRAY);
		btnSiguienteResum.setAutoscrolls(true);
		btnSiguienteResum.setBounds(657, 578, 186, 49);
		contentPane.add(btnSiguienteResum);
		
	}
}