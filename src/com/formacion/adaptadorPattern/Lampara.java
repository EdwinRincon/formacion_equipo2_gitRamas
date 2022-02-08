package com.formacion.adaptadorPattern;

// Lampra enciende - apaga
public class Lampara implements Conectable {

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