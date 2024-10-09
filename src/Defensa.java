public class Defensa extends Jugador {
    
    public
    Defensa(String nombre, String apellido, int edad, Boolean esTitular){
        super(nombre, apellido, edad, esTitular);
    }

    void printAll(){
        System.out.println(this.nombre + ", " + this.apellido + ", " + this.edad + ", " + this.get_esTitular());
    }

    
    void Entrar(){
        System.out.println("\nDefensa: " + this.nombre + " entra.\n");
    }

    void Salir(){
        System.out.println("\nDefensa: " + this.nombre + " sale. \n");
    }

}
