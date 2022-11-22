package project.uniquindio.cine.app;


import java.awt.EventQueue;

import project.uniquindio.cine.models.ModelSillas;
import project.uniquindio.cine.models.ModelUser;
import project.uniquindio.cine.views.ViewMovies;


public class Main {
static ModelSillas datosSillasModel;


 public static void main(String[] args) {
	 
	 datosSillasModel = new  ModelSillas();
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModelUser.datosQuemados();
					ModelUser.imprimir();
					ViewMovies frame = new ViewMovies(null,null);
					frame.setVisible(true);
					datosSillasModel.llenarArraylistSillas();
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}