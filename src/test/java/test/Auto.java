package test;

import java.util.ArrayList;

public class Auto {
    String modelo;
	int precio;
	ArrayList <Asiento> asientos =new ArrayList<Asiento>();
	String Marca;
	Motor motor;
	int registro;
	static String cantidadCreados;
	
public int cantidadAsientos(){
		return this.asientos.size();
	}
	
public String verificarIntegridad() {
	if(this.registro==motor.Registro) {
		for(int i=0;i<asientos.size();i++) {
			if(this.registro !=asientos.get(i).registro) {
				return "Las piezas no son originales";
				}
			}
		}return "Auto original";
	}
}
