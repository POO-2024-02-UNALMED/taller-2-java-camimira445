package test;

public class Asiento {
	String color;
	Integer precio;
	Integer registro;
	public void cambiarColor (String colorNuevo) {
		if(color=="rojo"||color=="verde"||color=="amarillo"||color=="negro"||color=="blanco") {
			this.color=colorNuevo;
		}
	}
  
}
