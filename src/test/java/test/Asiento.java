package test;

public class Asiento {
    String color;
	int precio;
	int registro;

public void cambiarColor (String colorNuevo) {
	if(color=="rojo"||color=="verde"||color=="amarillo"||color=="negro"||color=="blanco") {
			this.color=colorNuevo;
		}
	}
}
