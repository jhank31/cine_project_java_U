package project.uniquindio.cine.models;

import java.util.ArrayList;

public class ModelUser {
	@SuppressWarnings("rawtypes")

	private static int posicionClienteLogueado = 0;
	private static int totalPagar = 0;
	private static int descuento = 0;
	private static int saldoActualPer = 0;
	private static int numeroSillas = 0;
	
	
	public static int getNumeroSillas() {
		return numeroSillas;
	}

	public static void setNumeroSillas(int numeroSillas) {
		ModelUser.numeroSillas = numeroSillas;
	}

	public static ArrayList<ArrayList<Comparable>> datosPersona = new ArrayList<ArrayList<Comparable>>();
	
	public static int getDescuento() {
		return descuento;
	}

	public static void setDescuento(int descuento) {
		ModelUser.descuento = descuento;
	}

	public static int getTotalPagar() {
		return totalPagar;
	}

	public static void setTotalPagar(int totalPagar) {
		ModelUser.totalPagar = totalPagar;
	}

	

	public static int getSaldoActualPer() {
		return saldoActualPer;
	}

	public static void setSaldoActualPer(int saldoActualPer) {
		ModelUser.saldoActualPer = saldoActualPer;
	}

	public static int getPosicionClienteLogueado() {
		return posicionClienteLogueado;
	}

	public static void setPosicionClienteLogueado(int posicionClienteLogueado) {
		ModelUser.posicionClienteLogueado = posicionClienteLogueado;
	}

	public static void datosQuemados() {
		ArrayList<Comparable> temp = new ArrayList<Comparable>();
		ArrayList<Comparable> temp2 = new ArrayList<Comparable>();
		temp.add("12345");
		temp.add("Joan");
		temp.add(0);
		temp.add(10);
		temp.add(600);
		temp.add(31);
		temp.add("Historial: ");
		datosPersona.add(temp);

		temp2.add("6789");
		temp2.add("Jhancarlos");
		temp2.add(1);
		temp2.add(1000000);
		temp2.add(0);
		temp2.add(20);
		temp2.add("Historial: ");

		datosPersona.add(temp2);
	}
	
	public static void descuentos (int total) {
		Integer membresia = Integer.parseInt(datosPersona.get(posicionClienteLogueado).get(2).toString());
		double descuentoTemp =  membresia == 1 ? (total * 0.05) : (total * 0.2);
		System.out.println("membresia es : " + membresia);
		System.out.println("descuento es : " + descuentoTemp);
		System.out.println("cliente es : " + posicionClienteLogueado);
		
		setDescuento((int) descuentoTemp);
		imprimir();
		setTotalPagar( (int) (total - descuentoTemp));
	}

	public static void imprimir() {
		for (int i = 0; i < datosPersona.size(); i++) {
			System.out.print("[");
			for (int j = 0; j < datosPersona.get(i).size(); j++) {
				if (j == datosPersona.get(i).size() - 1) {
					System.out.print(datosPersona.get(i).get(j));
					continue;
				}
				System.out.print(datosPersona.get(i).get(j) + ",");

			}
			System.out.print("]");
			System.out.println();
		}
	}

	@SuppressWarnings("rawtypes")
	public void addPersona(String cedula, String nombre, int basic, int recarga) {
		int temp = 0;

		ArrayList<Comparable> name = new ArrayList<Comparable>();
		name.add(cedula);
		name.add(nombre);
		name.add(basic);
		name.add(recarga);
		name.add(temp); // puntos
		name.add(temp); // visitas
		name.add("Historial: ");

		datosPersona.add(name);

	}

	public int getIndexPer(String cedula) {
		for (int i = 0; i < datosPersona.size(); i++) {
			if (cedula.equals(datosPersona.get(i).get(0))) {
				setPosicionClienteLogueado(i);
				return i;
			}

		}
		return 0;
	}

	public boolean estaEnBaseDatos(String cedula) {
		boolean bandera = false;
		for (int i = 0; i < datosPersona.size(); i++) {
			if (cedula.equals(datosPersona.get(i).get(0))) {
				bandera = true;
				setPosicionClienteLogueado(i);
				Integer temp = Integer.parseInt(datosPersona.get(i).get(5).toString());
				if (temp >= 30) {
					datosPersona.get(i).set(2, 2);

				}
			}
		}
		return bandera;
	}

	public String getName(String cedula) {
		String nombre = "";
		for (int i = 0; i < datosPersona.size(); i++) {
			if (cedula.equals(datosPersona.get(i).get(0))) {
				nombre = (String) datosPersona.get(i).get(1);
				System.out.println(nombre);
			}
		}
		return nombre;

	}

	public int getTipoTarjeta(String cedula) {
		int datoTarjeta = 5;
		for (int i = 0; i < datosPersona.size(); i++) {
			if (cedula.equals(datosPersona.get(i).get(0))) {
				datoTarjeta = (int) datosPersona.get(i).get(2);
				System.out.println(datoTarjeta);
			}
		}
		return datoTarjeta;

	}

	public int getSaldo(String cedula) {
		int saldo = 0;
		for (int i = 0; i < datosPersona.size(); i++) {
			if (cedula.equals(datosPersona.get(i).get(0))) {
				saldo = (int) datosPersona.get(i).get(3);
				System.out.println(saldo);
			}
		}
		return saldo;

	}

	public int getPuntos(String cedula) {
		int puntos = 0;
		for (int i = 0; i < datosPersona.size(); i++) {
			if (cedula.equals(datosPersona.get(i).get(0))) {
				puntos = (int) datosPersona.get(i).get(4);
				System.out.println(puntos);
			}
		}
		return puntos;

	}

	public void addRecarga(String cedula, int montoRecargar) {
		int sumar;
		for (int i = 0; i < datosPersona.size(); i++) {
			if (cedula.equals(datosPersona.get(i).get(0))) {

				int saldo = (int) datosPersona.get(i).get(3);
				sumar = saldo + montoRecargar;
				datosPersona.get(i).set(3, sumar);

				System.out.println(datosPersona.get(i).get(3));
			}

		}

	}

	
}
