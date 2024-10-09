public class Jugador extends Persona{
    
    private
    Boolean esTitular;

    public
    Jugador(String nombre, String apellido, int edad, Boolean esTitular){
        super(nombre, apellido, edad);
        this.esTitular = esTitular;
    }

    String get_esTitular(){
        if(esTitular){
            return "Es titular";
        }

        return "No es titular";
    }
}
