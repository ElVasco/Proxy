package main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Revista> revistas = new ArrayList<Revista>();
		
		revistas.add(new RevistaProxy());
		revistas.add(new RevistaProxy());
		revistas.add(new RevistaProxy());
		revistas.add(new RevistaProxy());
		
		for (Revista revista : revistas) {
			revista.mostrarMiniatura();
		}
		
		//el usuario selecciona la primera revista
		revistas.get(0).mostrarPortada();
	}

}
