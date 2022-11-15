package project.uniquindio.cine.models;

import java.util.ArrayList;

public class ModelMovie {
	public ArrayList<ArrayList<String>> getFuncions() {
		ArrayList<ArrayList<String>> funciones= new ArrayList<ArrayList<String>>();
		String hunted = "Hunted: 1Hr 27Min, Clasificacion +18, Sinopsis: La compañía del lobo es mejor que la del hombre. Érase una vez, en una época de locos, una mujer que conoció a un hombre. La mujer bailó con él. El hombre la besó y la agarró. La mujer se escapó. Él la persiguió. Nada del otro mundo. ¿O sí?";
		String enolaHolmes = "Enola Holmes 2, 2Hr 10Min, Clasificacion +7, Sinopsis: Enola Holmes asume su primer caso como detective, pero para desentrañar el misterio de una niña desaparecida necesitará la ayuda de sus amigos y de su hermano, Sherlock.";
		String men = "Men, 1Hr 40Min, Clasificacion +16, Sinopsis: Tras sufrir una tragedia personal, Harper (Jessie Buckley) se retira sola a la hermosa campiña inglesa, con la esperanza de haber encontrado el lugar ideal para curarse. Pero algo o alguien parece estar acechándola.";
		String tres = "4:00 PM";
		String cinco = "6:00 PM";
		String ocho = "9:00 PM";
		
		ArrayList<String> primeraFuncion = new ArrayList<String>();
		primeraFuncion.add("21");
		primeraFuncion.add("0");
		primeraFuncion.add(tres);
		primeraFuncion.add(hunted);
		primeraFuncion.add("hunted-200x300.jpg");
		primeraFuncion.add("Hunted");
		
		ArrayList<String> segundaFuncion = new ArrayList<String>();
		segundaFuncion.add("21");
		segundaFuncion.add("1");
		segundaFuncion.add(cinco);
		segundaFuncion.add(enolaHolmes);
		segundaFuncion.add("enolaHolmes-200x300.jpg");
		segundaFuncion.add("Enola Holmes");
		
		
		ArrayList<String> terceraFuncion = new ArrayList<String>();
		terceraFuncion.add("21	");
		terceraFuncion.add("2");
		terceraFuncion.add(ocho);
		terceraFuncion.add(men);
		terceraFuncion.add("men-200x300.jpg");
		terceraFuncion.add("Men");
	
		funciones.add(primeraFuncion);
		funciones.add(segundaFuncion);	
		funciones.add(terceraFuncion);	

		return funciones;
	}

	

	

	
}
