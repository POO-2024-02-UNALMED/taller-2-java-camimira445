package test;
public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    public int cantidadAsientos() {
        int contador = 0;  

        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i] != null) { 
                contador++;
            }
        }

        return contador;  
    }

    public boolean verificarIntegridad() {
    
        if (motor == null || motor.registro != registro) {
            return false;
        }

        for (Asiento asiento : asientos) {
            if (asiento != null && asiento.registro != registro) {
                return false;
            }
        }

        return true; 
    }
}
