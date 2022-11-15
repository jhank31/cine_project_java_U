package project.uniquindio.cine.models;

import java.util.ArrayList;

public class ModelUser {
@SuppressWarnings("rawtypes")
static ArrayList<ArrayList<Comparable>> datosPersona = new ArrayList<ArrayList<Comparable>>();
	
	
	
    
  
   
   
    
	@SuppressWarnings("rawtypes")
	public void addPersona(String cedula, String nombre, int basic, int recarga) {	
		int temp = 0;
		
		
		ArrayList<Comparable> name  = new ArrayList<Comparable>();
		name.add(cedula);       
		name.add(nombre); 
		name.add(basic); 
		name.add(recarga); 
		name.add(temp); //puntos
		name.add(temp); // visitas
		name.add("Historial: " );
		
		
		datosPersona.add(name);
	}
	
	
	
	public boolean estaEnBaseDatos (String cedula) {
		boolean bandera = false;
		for(int i = 0; i < datosPersona.size();  i++) {
		if(cedula.equals(datosPersona.get(i).get(0)) ) {
			bandera = true;
		}
	}
		return bandera;
}
	
	
	
	
public  String  getName (String cedula){
	String nombre = "";
	for(int i = 0; i < datosPersona.size();  i++) {
		if(cedula.equals(datosPersona.get(i).get(0))) {
			nombre = (String) datosPersona.get(i).get(1);
			System.out.println(nombre);
		}
	}
	return nombre;
   
}


public  int  getTipoTarjeta(String cedula){
	int datoTarjeta = 5;
	for(int i = 0; i < datosPersona.size();  i++) {
		if(cedula.equals(datosPersona.get(i).get(0))) {
			datoTarjeta = (int) datosPersona.get(i).get(2);
			System.out.println(datoTarjeta);
		}
	}
	return datoTarjeta;
   
}



public  int  getSaldo (String cedula ){
	int saldo = 0;
	for(int i = 0; i < datosPersona.size();  i++) {
		if(cedula.equals(datosPersona.get(i).get(0))) {
			saldo = (int) datosPersona.get(i).get(3);
			System.out.println(saldo);
		}
	}
	return saldo;
   
}



public  int  getPuntos (String cedula ){
	int puntos = 0;
	for(int i = 0; i < datosPersona.size();  i++) {
		if(cedula.equals(datosPersona.get(i).get(0))) {
			puntos = (int) datosPersona.get(i).get(4);
			System.out.println(puntos);
		}
	}
	return puntos;
   
}









public void addRecarga (String cedula, int montoRecargar) {
	int sumar;
	for(int i = 0; i < datosPersona.size();  i++) {
		if(cedula.equals(datosPersona.get(i).get(0))) {

        int saldo =(int) datosPersona.get(i).get(3);
           sumar = saldo + montoRecargar;
           datosPersona.get(i).set(3, sumar);
           
        System.out.println(datosPersona.get(i).get(3));		
}
		
		
	
}

}
}
