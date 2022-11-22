package project.uniquindio.cine.models;

import java.util.ArrayList;

public class ModelSillas {
	 public static String puestosOcupados = "";
	 static ArrayList<Integer> datoSillas = new ArrayList<Integer>();
	 static ArrayList<Integer> datoSillas2 = new ArrayList<Integer>();
	 static ArrayList<Integer> datoSillas3 = new ArrayList<Integer>();



	 
	 
public void llenarArraylistSillas() {
	for (int i = 0; i<208; i++ ) {
		datoSillas.add(i, 0);
		datoSillas2.add(i, 0);
		datoSillas3.add(i, 0);
	}
}
	



public void enviarPuestosOcupados (int posicion, String sala) {
		if(sala.equals("0")){
			datoSillas.set(posicion, 1);
		}
		if(sala.equals("1")){
			datoSillas2.set(posicion, 1);
		}
		
		if(sala.equals("2")){
			datoSillas3.set(posicion, 1);
		}
	}
	
	
	
public  int getPosicionPuestos (int posicion, String sala) {
		int dato=5;
		if(sala.equals("0")){
			 dato = datoSillas.get(posicion);		}
		if(sala.equals("1")){
			 dato = datoSillas2.get(posicion);		}
		
		if(sala.equals("2")){
			 dato = datoSillas3.get(posicion);		}
		
		return dato;
	}




public static void add(String puesto) {
	puestosOcupados += puesto;
	
}
public static void remove(String puesto) {
	puestosOcupados = "";
	
}
	
	
	
	
	 
}



