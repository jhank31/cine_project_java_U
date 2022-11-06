package project.uniquindio.cine.views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import project.uniquindio.cine.models.ModelMovie;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Panel;
import java.awt.SystemColor;

public class ViewMovies extends JFrame {
	public ViewMovies() {
		viewSelectMovie();
		this.setLocationRelativeTo(null);
		
	}

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ModelMovie selectMovie  = new ModelMovie();
	LocalDate fechahoy = LocalDate.now();
	private JTextField textFieldCedula;

	
	
	/**
	 * Create the frame.
	 * @return 
	 */
	public void viewSelectMovie() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		setSize(1000,750);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel fecha = new JLabel(fechahoy.toString());
		fecha.setForeground(Color.WHITE);
		fecha.setHorizontalAlignment(SwingConstants.LEFT);
		fecha.setFont(new Font("Times New Roman", Font.BOLD, 15));
		fecha.setBounds(59, 11, 106, 23);
		contentPane.add(fecha);
		
		
		JLabel tituloCine = new JLabel("Cine Quindio");
		tituloCine.setForeground(Color.WHITE);
		tituloCine.setFont(new Font("Sylfaen", Font.BOLD, 27));
		tituloCine.setHorizontalAlignment(SwingConstants.CENTER);
		tituloCine.setBounds(349, 37, 287, 76);
		contentPane.add(tituloCine);
		
		
		


		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        
		
		getMovies(((ArrayList<?>) selectMovie.getFuncions().get(0)).get(4), ((ArrayList<?>) selectMovie.getFuncions().get(0)).get(3).toString(),  ((ArrayList<?>) selectMovie.getFuncions().get(0)).get(1).toString());
		getMovies(((ArrayList<?>) selectMovie.getFuncions().get(1)).get(4), ((ArrayList<?>) selectMovie.getFuncions().get(1)).get(3).toString(),  ((ArrayList<?>) selectMovie.getFuncions().get(1)).get(1).toString());
		getMovies(((ArrayList<?>) selectMovie.getFuncions().get(2)).get(4), ((ArrayList<?>) selectMovie.getFuncions().get(2)).get(3).toString(),  ((ArrayList<?>) selectMovie.getFuncions().get(2)).get(1).toString());

		panelDataUser ();
		buttonsPanel();
		decorationView();
	
}
	
	

	public void getMovies(Object image, String texto, String posicion) {
		JButton ButtonPelicula = new JButton("");
		ButtonPelicula.setIcon(new ImageIcon("/Users/jhank/eclipse-workspace/CineProject/images/"+image+""));
		ButtonPelicula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(posicion);
				
	}
		});
		ButtonPelicula.setBounds(59, 111, 250, 310);
		ButtonPelicula.setSize(200, 300);
		contentPane.add(ButtonPelicula);
		JLabel txtPelicula = new JLabel( "<html><p>" + texto + "</p></html>");
		txtPelicula.setForeground(Color.WHITE);
		txtPelicula.setVerticalAlignment(SwingConstants.TOP);
		if (posicion.equals("0") || posicion.equals("3") || posicion.equals("6")) {
			ButtonPelicula.setBounds(59, 129, 250, 310);
			txtPelicula.setBounds(59, 451, 266, 160);
		} else if(posicion.equals("1")) {
			txtPelicula.setBounds(382, 451, 242, 176);
			ButtonPelicula.setBounds(382, 129, 242, 310);
		} else {
			ButtonPelicula.setBounds(691, 129, 250, 310);
			txtPelicula.setBounds(691, 451, 250, 190);
		}
		contentPane.add(txtPelicula);
		
    }
	public void panelDataUser ( ) {
		JLabel lblCdulaClei = new JLabel("Cédula cliente :");
		lblCdulaClei.setHorizontalAlignment(SwingConstants.LEFT);
		lblCdulaClei.setForeground(Color.WHITE);
		lblCdulaClei.setFont(new Font("Sylfaen", Font.BOLD, 14));
		lblCdulaClei.setBounds(59, 599, 106, 24);
		contentPane.add(lblCdulaClei);
		
		textFieldCedula = new JTextField();
		textFieldCedula.setColumns(10);
		textFieldCedula.setBounds(176, 598, 226, 20);
		contentPane.add(textFieldCedula);
		
		JLabel lblBienvenido = new JLabel("Bienvenido ");
		lblBienvenido.setHorizontalAlignment(SwingConstants.LEFT);
		lblBienvenido.setForeground(Color.WHITE);
		lblBienvenido.setFont(new Font("Sylfaen", Font.BOLD, 14));
		lblBienvenido.setBounds(59, 643, 106, 24);
		contentPane.add(lblBienvenido);
		
	
		
	}
	
	public void buttonsPanel() {
		JButton rechargeButton = new JButton("Recargar");
		rechargeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ViewRecharge viewRecharge = new ViewRecharge();
				viewRecharge.setVisible(true);
			}
		});
		rechargeButton.setVerticalAlignment(SwingConstants.BOTTOM);
		rechargeButton.setForeground(Color.BLACK);
		rechargeButton.setFont(new Font("Sylfaen", Font.BOLD, 17));
		rechargeButton.setBorder(null);
		rechargeButton.setBackground(Color.LIGHT_GRAY);
		rechargeButton.setAutoscrolls(true);
		rechargeButton.setBounds(454, 646, 141, 31);
		contentPane.add(rechargeButton);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setVerticalAlignment(SwingConstants.BOTTOM);
		btnSiguiente.setForeground(Color.BLACK);
		btnSiguiente.setFont(new Font("Sylfaen", Font.BOLD, 21));
		btnSiguiente.setBackground(Color.LIGHT_GRAY);
		btnSiguiente.setAutoscrolls(true);
		btnSiguiente.setBounds(716, 606, 186, 49);
		contentPane.add(btnSiguiente);
		
		JLabel lblNombreCliente = new JLabel("\\");
		lblNombreCliente.setHorizontalAlignment(SwingConstants.LEFT);
		lblNombreCliente.setForeground(Color.WHITE);
		lblNombreCliente.setFont(new Font("Sylfaen", Font.BOLD, 13));
		lblNombreCliente.setBounds(176, 642, 116, 25);
		contentPane.add(lblNombreCliente);
		
		JButton btnValidar = new JButton("Validar");
		btnValidar.setVerticalAlignment(SwingConstants.BOTTOM);
		btnValidar.setForeground(Color.BLACK);
		btnValidar.setFont(new Font("Sylfaen", Font.BOLD, 17));
		btnValidar.setBorder(null);
		btnValidar.setBackground(Color.LIGHT_GRAY);
		btnValidar.setAutoscrolls(true);
		btnValidar.setBounds(454, 591, 141, 31);
		contentPane.add(btnValidar);
		
		JButton btnCrearusuario = new JButton("Crear usuario");
		btnCrearusuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ViewRegister viewRegister = new ViewRegister();
				viewRegister.setVisible(true);
			}
		});
		btnCrearusuario.setForeground(Color.BLACK);
		btnCrearusuario.setFont(new Font("Sylfaen", Font.BOLD, 17));
		btnCrearusuario.setBackground(SystemColor.info);
		btnCrearusuario.setAutoscrolls(true);
		btnCrearusuario.setBounds(752, 54, 141, 43);
		contentPane.add(btnCrearusuario);
	}
	
	public void decorationView() {
		Panel panel = new Panel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(752, 0, 232, 34);
		contentPane.add(panel);
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(615, 0, 141, 20);
		contentPane.add(panel_1);
		
		Panel panel_1_1 = new Panel();
		panel_1_1.setBackground(Color.LIGHT_GRAY);
		panel_1_1.setBounds(490, 0, 129, 10);
		contentPane.add(panel_1_1);
		
		Panel panel_2 = new Panel();
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(0, 677, 232, 34);
		contentPane.add(panel_2);
		
		Panel panel_1_2 = new Panel();
		panel_1_2.setBackground(Color.GRAY);
		panel_1_2.setBounds(232, 691, 141, 20);
		contentPane.add(panel_1_2);
		
		Panel panel_1_1_1 = new Panel();
		panel_1_1_1.setBackground(Color.LIGHT_GRAY);
		panel_1_1_1.setBounds(373, 701, 129, 10);
		contentPane.add(panel_1_1_1);
		
		Panel panel_1_1_1_1 = new Panel();
		panel_1_1_1_1.setBackground(Color.DARK_GRAY);
		panel_1_1_1_1.setBounds(0, 0, 10, 677);
		contentPane.add(panel_1_1_1_1);
		
		Panel panel_1_1_1_1_1 = new Panel();
		panel_1_1_1_1_1.setBackground(Color.DARK_GRAY);
		panel_1_1_1_1_1.setBounds(974, 34, 10, 677);
		contentPane.add(panel_1_1_1_1_1);
		
		
		
		
		
		
		
	}
}
