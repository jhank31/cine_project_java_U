package project.uniquindio.cine.views;


import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Panel;

@SuppressWarnings("serial")
public class ViewRecharge extends JFrame {

	
	private JPanel contentPane;
	private JTextField cantRecharge;

	/**
	 * Create the frame.
	 */
	
	

	public ViewRecharge() {
		
		viewRechargePanel();
		this.setLocationRelativeTo(null);
	}
	
	public void viewRechargePanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 443);
		contentPane = new JPanel();
		getContentPane().setBackground(Color.BLACK);
		getContentPane().setLayout(null);
		
		
		rechargeTitle();
		dataClient ();
		tipoPlan ();
		rechargeButtonPrinc ();	
		decorationView();
		
	}
	
	public void rechargeTitle() {
		JLabel titulo = new JLabel("RECARGA TU CUENTA");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("Sylfaen", Font.BOLD, 17));
		titulo.setForeground(Color.WHITE);
		titulo.setBounds(94, 11, 210, 28);
		getContentPane().add(titulo);
	}
	
	public void dataClient () {
		JLabel txtNombre = new JLabel("Nombre :");
		txtNombre.setHorizontalAlignment(SwingConstants.LEFT);
		txtNombre.setForeground(Color.WHITE);
		txtNombre.setFont(new Font("Sylfaen", Font.BOLD, 13));
		txtNombre.setBounds(33, 67, 61, 25);
		getContentPane().add(txtNombre);
		
		JLabel txtCedula = new JLabel("Cédula :");
		txtCedula.setHorizontalAlignment(SwingConstants.LEFT);
		txtCedula.setForeground(Color.WHITE);
		txtCedula.setFont(new Font("Sylfaen", Font.BOLD, 14));
		txtCedula.setBounds(33, 105, 61, 24);
		getContentPane().add(txtCedula);
		
		JLabel txtCedulaQuem = new JLabel("############");
		txtCedulaQuem.setHorizontalAlignment(SwingConstants.LEFT);
		txtCedulaQuem.setForeground(Color.WHITE);
		txtCedulaQuem.setFont(new Font("Sylfaen", Font.BOLD, 13));
		txtCedulaQuem.setBounds(143, 105, 116, 25);
		getContentPane().add(txtCedulaQuem);
		
		JLabel txtNombreQuem = new JLabel("Jhancarlos Lenis");
		txtNombreQuem.setHorizontalAlignment(SwingConstants.LEFT);
		txtNombreQuem.setForeground(Color.WHITE);
		txtNombreQuem.setFont(new Font("Sylfaen", Font.BOLD, 13));
		txtNombreQuem.setBounds(143, 67, 116, 25);
		getContentPane().add(txtNombreQuem);
		
		JLabel txtRecarga = new JLabel("Recarga :");
		txtRecarga.setHorizontalAlignment(SwingConstants.RIGHT);
		txtRecarga.setForeground(Color.WHITE);
		txtRecarga.setFont(new Font("Sylfaen", Font.BOLD, 13));
		txtRecarga.setBounds(33, 275, 61, 25);
		getContentPane().add(txtRecarga);
		
		cantRecharge = new JTextField();
		cantRecharge.setColumns(10);
		cantRecharge.setBounds(139, 274, 226, 20);
		getContentPane().add(cantRecharge);
		
		JLabel lblSaldoActual = new JLabel("Saldo actual :");
		lblSaldoActual.setHorizontalAlignment(SwingConstants.LEFT);
		lblSaldoActual.setForeground(Color.WHITE);
		lblSaldoActual.setFont(new Font("Sylfaen", Font.BOLD, 13));
		lblSaldoActual.setBounds(33, 149, 88, 25);
		getContentPane().add(lblSaldoActual);
		
		JLabel txtSaldoQuem = new JLabel("############");
		txtSaldoQuem.setHorizontalAlignment(SwingConstants.LEFT);
		txtSaldoQuem.setForeground(Color.WHITE);
		txtSaldoQuem.setFont(new Font("Sylfaen", Font.BOLD, 13));
		txtSaldoQuem.setBounds(143, 149, 116, 25);
		getContentPane().add(txtSaldoQuem);
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	}
	
	
	
	public void tipoPlan () { 
		JCheckBox checkBoxPlanBasic = new JCheckBox("Basico");
		checkBoxPlanBasic.setHorizontalAlignment(SwingConstants.CENTER);
		checkBoxPlanBasic.setForeground(Color.WHITE);
		checkBoxPlanBasic.setFont(new Font("Tahoma", Font.PLAIN, 13));
		checkBoxPlanBasic.setBackground(Color.BLACK);
		checkBoxPlanBasic.setBounds(94, 227, 97, 23);
		getContentPane().add(checkBoxPlanBasic);
		
		JCheckBox checkBoxPlanGold = new JCheckBox("Gold");
		checkBoxPlanGold.setHorizontalAlignment(SwingConstants.CENTER);
		checkBoxPlanGold.setForeground(Color.WHITE);
		checkBoxPlanGold.setFont(new Font("Tahoma", Font.PLAIN, 13));
		checkBoxPlanGold.setBackground(Color.BLACK);
		checkBoxPlanGold.setBounds(207, 227, 97, 23);
		getContentPane().add(checkBoxPlanGold);
		
		JLabel txtTipoPlan = new JLabel("Tipo de plan ");
		txtTipoPlan.setHorizontalAlignment(SwingConstants.CENTER);
		txtTipoPlan.setForeground(Color.WHITE);
		txtTipoPlan.setFont(new Font("Sylfaen", Font.BOLD, 16));
		txtTipoPlan.setBounds(143, 185, 117, 35);
		getContentPane().add(txtTipoPlan);
		
	}
	
	public void rechargeButtonPrinc () {
		JButton rechargeButton = new JButton("Comprar");
		rechargeButton.setVerticalAlignment(SwingConstants.BOTTOM);
		rechargeButton.setForeground(Color.BLACK);
		rechargeButton.setFont(new Font("Sylfaen", Font.BOLD, 17));
		rechargeButton.setBorder(null);
		rechargeButton.setBackground(Color.WHITE);
		rechargeButton.setAutoscrolls(true);
		rechargeButton.setBounds(139, 328, 141, 31);
		getContentPane().add(rechargeButton);
		
		
	}
	
	public void decorationView () {
		Panel panel = new Panel();
		panel.setEnabled(false);
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(354, -28, 75, 96);
		getContentPane().add(panel);
		
		Panel panel_1 = new Panel();
		panel_1.setEnabled(false);
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(386, 11, 75, 96);
		getContentPane().add(panel_1);
		
		Panel panel_2 = new Panel();
		panel_2.setEnabled(false);
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(406, 92, 23, 47);
		getContentPane().add(panel_2);
		
		
	}
}
