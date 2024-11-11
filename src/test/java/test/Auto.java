package test;

class Auto {
    String modelo;
	int precio;
	Asiento[] asientos;
	String Marca;
	Motor motor;
	int registro;
	static String cantidadCreados;
	
public int cantidadAsientos(){
	int num1=0;
	for (int i =0; i<asientos.length;i++){
       if(asientos[i]!=null){
		num1++;
	   }
	 } 
	  return num1;
	}
	
public String verificarIntegridad() {
	if(this.registro==this.motor.Registro) {
		for(int i=0;i<asientos.length;i++) {
			if(asientos[i]!=null) {
				if(asientos[i].registro!= this.registro){
					return"Las piezas no son originales";
				  }
				}
			}
	  }return "Auto original";
	}
}
