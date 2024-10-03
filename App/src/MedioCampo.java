public class MedioCampo extends Jugador {
    private
    int asistenciasRealizadas;
    
    public
    MedioCampo(String nombre, String apellido, int edad, Boolean esTitular, int asistenciasRealizadas){
        super(nombre, apellido, edad, esTitular);
        this.asistenciasRealizadas = asistenciasRealizadas;
    }


    void printAll(){
        System.out.println(this.nombre + ", " + this.apellido + ", " + this.edad + ", " + this.get_esTitular()
        + ", " + this.get_asistenciasRealizadas());
    }


    int get_asistenciasRealizadas(){
        return this.asistenciasRealizadas;
    }

}
