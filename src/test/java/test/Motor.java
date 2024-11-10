package test;

public class Motor {
    int numeroCilindros;
	String tipo;
	int Registro;
	
public void cambiarRegistro(int registroNuevo) {
    	this.Registro=registroNuevo;
    }
public void asignarTipo(String tipoMotor) {
		if(tipoMotor=="electrico"||tipoMotor=="gasolina") {
			this.tipo=tipoMotor;
		}
		
	}
}

