package main;

public class RevistaDeVerdad implements Revista{

	private byte[] miniatura;
	private byte[] portada;
	
	public RevistaDeVerdad() {
		System.out.println("creando revista de verdad");
	}
	
	@Override
	public void mostrarMiniatura() {
		System.out.println("mostrando la miniatura desde revista de verdad");		
	}

	@Override
	public void mostrarPortada() {
		System.out.println("mostrando la portada desde revista de verdad");
		
	}
	
}
