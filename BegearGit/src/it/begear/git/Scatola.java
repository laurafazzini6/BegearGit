package it.begear.git;

public class Scatola<T> {

	private T contenuto;
	
	public Scatola(T t) {
		contenuto=t;
	}
	
	public T getContenuto() {
		return contenuto;
	}

	@Override
	public String toString() {
		return "Scatola [contenuto=" + contenuto + "]";
	}
	
}