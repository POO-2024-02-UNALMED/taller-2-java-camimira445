package test;
class Asiento{
  String color;
  int precio;
  int registro;
  void cambiarColor(String Argumento){
    if(Argumento=="rojo"||Argumento=="verde"||Argumento=="amarillo"||Argumento=="negro"||Argumento=="blanco")
    this.color=Argumento;
  }

}
