public class Portero extends Jugador {
    private
    int golesRecibidos;
    
    public
    Portero(String nombre, String apellido, int edad, Boolean esTitular, int golesRecibidos){
        super(nombre, apellido, edad, esTitular);
        this.golesRecibidos = golesRecibidos;
    }

    void printAll(){
        System.out.println(this.nombre + ", " + this.apellido + ", " + this.edad + ", " + this.get_esTitular()
        + ", " + this.get_golesRecibidos());
    }

    int get_golesRecibidos(){
        return this.golesRecibidos;
    }
}
