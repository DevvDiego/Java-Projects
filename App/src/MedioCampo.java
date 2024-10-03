public class MedioCampo extends Jugador {
    private
    int asistenciasRealizadas;
    
    public
    MedioCampo(String nombre, String apellido, int edad, Boolean esTitular, int asistenciasRealizadas){
        super(nombre, apellido, edad, esTitular);
        this.asistenciasRealizadas = asistenciasRealizadas;
    }

    int get_asistenciasRealizadas(){
        return this.asistenciasRealizadas;
    }

}
