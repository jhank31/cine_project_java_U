package project.uniquindio.cine.views;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.Panel;

@SuppressWarnings("serial")
public class ViewRegister extends JFrame {
	
	
	private JPanel contentPane;
	private JTextField titulo;
	private JTextField textFieldNombre;
	private JTextField textFieldCedula;
	private JLabel txtRecarga;
	private JTextField textFieldRecarga;
	private JLabel txtTipoPlan;
	private JCheckBox checkBoxPlanGold;
	private Panel panel_1;
	private Panel panel_2;

	/**
	 * Create the frame.
	 */
	public ViewRegister() {
		viewRegisterPanel();
		this.setLocationRelativeTo(null);
	}
	
	public void viewRegisterPanel() {
		
		this.setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 443);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		tituloView();
		camposRegistro();
		botonRegister();
		checkBox();
		decorationView();
		
		
		
	}
	
	public void camposRegistro() {
		JLabel txtNombre = new JLabel("Nombre :");
		txtNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNombre.setFont(new Font("Sylfaen", Font.BOLD, 13));
		txtNombre.setForeground(Color.WHITE);
		txtNombre.setBounds(37, 71, 61, 25);
		contentPane.add(txtNombre);
		
		JLabel txtCedula = new JLabel("Cédula :");
		txtCedula.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCedula.setFont(new Font("Sylfaen", Font.BOLD, 14));
		txtCedula.setForeground(Color.WHITE);
		txtCedula.setBounds(37, 119, 61, 24);
		contentPane.add(txtCedula);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(128, 70, 226, 20);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldCedula = new JTextField();
		textFieldCedula.setBounds(128, 118, 226, 20);
		contentPane.add(textFieldCedula);
		textFieldCedula.setColumns(10);
		
		txtRecarga = new JLabel("Recarga :");
		txtRecarga.setHorizontalAlignment(SwingConstants.RIGHT);
		txtRecarga.setForeground(Color.WHITE);
		txtRecarga.setFont(new Font("Sylfaen", Font.BOLD, 13));
		txtRecarga.setBounds(37, 166, 61, 25);
		contentPane.add(txtRecarga);
		
		textFieldRecarga = new JTextField();
		textFieldRecarga.setColumns(10);
		textFieldRecarga.setBounds(128, 165, 226, 20);
		contentPane.add(textFieldRecarga);
	}
	
	public void tituloView() {titulo = new JTextField();
		titulo.setBorder(null);
		titulo.setFont(new Font("Sylfaen", Font.BOLD, 17));
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setText("REGISTRATE");
		titulo.setForeground(Color.WHITE);
		titulo.setBackground(Color.BLACK);
		titulo.setBounds(128, 11, 149, 25);
		contentPane.add(titulo);
		titulo.setColumns(10);
	}
	
	public void checkBox () {
		JCheckBox checkBoxPlanBasic = new JCheckBox("Basico");
		checkBoxPlanBasic.setForeground(Color.WHITE);
		checkBoxPlanBasic.setBackground(Color.BLACK);
		checkBoxPlanBasic.setFont(new Font("Tahoma", Font.PLAIN, 13));
		checkBoxPlanBasic.setHorizontalAlignment(SwingConstants.CENTER);
		checkBoxPlanBasic.setBounds(108, 263, 97, 23);
		contentPane.add(checkBoxPlanBasic);
		
		checkBoxPlanGold = new JCheckBox("Gold");
		checkBoxPlanGold.setHorizontalAlignment(SwingConstants.CENTER);
		checkBoxPlanGold.setForeground(Color.WHITE);
		checkBoxPlanGold.setFont(new Font("Tahoma", Font.PLAIN, 13));
		checkBoxPlanGold.setBackground(Color.BLACK);
		checkBoxPlanGold.setBounds(207, 263, 97, 23);
		contentPane.add(checkBoxPlanGold);
		
		txtTipoPlan = new JLabel("Tipo de plan ");
		txtTipoPlan.setHorizontalAlignment(SwingConstants.CENTER);
		txtTipoPlan.setForeground(Color.WHITE);
		txtTipoPlan.setFont(new Font("Sylfaen", Font.BOLD, 16));
		txtTipoPlan.setBounds(147, 221, 117, 35);
		contentPane.add(txtTipoPlan);
	
	}
	
	public void decorationView() {
		Panel panel = new Panel();
		panel.setEnabled(false);
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(-12, 333, 75, 96);
		contentPane.add(panel);
		
		panel_1 = new Panel();
		panel_1.setEnabled(false);
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(-34, 282, 75, 96);
		contentPane.add(panel_1);
		
		panel_2 = new Panel();
		panel_2.setEnabled(false);
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(0, 239, 23, 47);
		contentPane.add(panel_2);
	}
		
	
	public void botonRegister() {
		JButton registerButton = new JButton("Crear Usuario");
		registerButton.setVerticalAlignment(SwingConstants.BOTTOM);
		registerButton.setBorder(null);
		registerButton.setFont(new Font("Sylfaen", Font.BOLD, 17));
		registerButton.setAutoscrolls(true);
		registerButton.setBackground(Color.LIGHT_GRAY);
		registerButton.setForeground(Color.BLACK);
		registerButton.setBounds(136, 333, 141, 31);
		contentPane.setLayout(null);
		contentPane.add(registerButton);
		registerButton.addActionListener(new ActionListener() {

			
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				dispose();
				ViewMovies viewMovies = new ViewMovies();
				viewMovies.setVisible(true);
				
				
				
			}
			
		} );
		
	}
}