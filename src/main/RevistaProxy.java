package main;

public class RevistaProxy implements Revista{

	private byte[] miniatura;
	private Revista revistaDeVerdad;
	
	@Override
	public void mostrarMiniatura() {
		System.out.println("mostrar la miniatura desde la revista proxy");
	}

	@Override
	public void mostrarPortada() {
		if( revistaDeVerdad == null) {
			revistaDeVerdad = new RevistaDeVerdad();
		}
		revistaDeVerdad.mostrarPortada();
		//System.out.println("mostrar la portada desde la revista proxy");		
	}

}
