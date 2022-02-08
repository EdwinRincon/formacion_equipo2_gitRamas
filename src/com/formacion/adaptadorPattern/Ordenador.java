package com.formacion.adaptadorPattern;

// Ordenador enciende - apaga
public class Ordenador implements Conectable {

	private boolean encendida;
	
	public boolean estaEncendida() {
		return encendida;
	}

	public void encender() {
		encendida = true;
	}

	public void apagar() {
		encendida = false;
	}


}
