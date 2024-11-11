package test;

class Motor {
    int numeroCilindros;
	String tipo;
	int registro;
	
public void cambiarRegistro(int argumento) {
    	this.registro=argumento;
    }
void asignarTipo(String tipo) {
        

		if(tipo=="gasolina"||tipo=="electrico") {
		
			 
			this.tipo=tipo;
	
		}
	}
}

