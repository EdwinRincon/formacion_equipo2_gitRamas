package com.formacion.adaptadorPattern;

public class Principal {

  public static void main(String[] args) {
    
    Conectable l1= new Lampara();
    encenderAparato(l1);
    
    Conectable o1= new Ordenador();
    encenderAparato(o1);
    
    
    // Funcionalidad del Adaptador
    Conectable l2= new AdaptadorLampara();
    encenderAparato(l2);

  }

  private static void encenderAparato(Conectable l) {
    l.encender();
    System.out.println(l.estaEncendida()+ "  -  " + l.getClass().toString());
  }

}