package test;

public class Motor {
    Integer numeroCilindros;
	String tipo;
	Integer Registro;
	
    public void cambiarRegistro(Integer registroNuevo) {
    	this.Registro=registroNuevo;
    }
	public void asignarTipo(String tipoMotor) {
		if(tipoMotor=="electrico"||tipoMotor=="gasolina") {
			this.tipo=tipoMotor;
		}
		
	}
}
