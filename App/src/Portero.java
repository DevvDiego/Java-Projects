public class Portero extends Jugador {
    private
    int golesRecibidos;
    
    public
    Portero(String nombre, String apellido, int edad, Boolean esTitular, int golesRecibidos){
        super(nombre, apellido, edad, esTitular);
        this.golesRecibidos = golesRecibidos;
    }

    int get_golesRecibidos(){
        return this.golesRecibidos;
    }
}
