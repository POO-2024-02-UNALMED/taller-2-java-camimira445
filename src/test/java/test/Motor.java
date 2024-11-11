package test;

public class Motor {
    int numeroCilindros;
	String tipo;
	int Registro;
	
public void cambiarRegistro(int argumento) {
    	this.Registro=argumento;
    }
public void asignarTipo(String argumento) {
        

		if(argumento=="electrico") {
			this.tipo=argumento;
		}else if(argumento=="gasolina"){
			this.tipo=argumento;
		}else{
			 this.tipo = tipo;
		}
		
	}
}

