package com.formacion.adaptadorPattern;

// Clase diferente
// Un programador uso diferentes nombres a los metodos y no se puede llamar
// en el principal como -> l.encender();
public class LamparaInglesa {

	private boolean isOn;

	public boolean isOn() {
		return isOn;
	}

	// on() en vez de encender()
	public void on() {

		isOn = true;
	}

	public void off() {

		isOn = false;
	}
}