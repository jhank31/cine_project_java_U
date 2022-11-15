package project.uniquindio.cine.models;

import java.util.ArrayList;

public class ModelConfiteria {
	public String nombre = "";
	public String cedula = "";
	public String planBasic = "";
	
	public ArrayList<ArrayList<String>> confiteria = new ArrayList<ArrayList<String>>();
	public ArrayList<String> selectConfiteria = new ArrayList<String>();
			
	public ArrayList<String> sillasSeleccionadas = new ArrayList<String>();
	public String peliculaSeleccionada = "";
	
	

	
	public  void clearSelectProducts() {
		selectConfiteria.clear();
	}
	public void establecerProductos() {
		confiteria.add(selectConfiteria);
	}
}
