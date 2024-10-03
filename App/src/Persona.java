public class Persona {
/*
 * Se requieren 2 constructores para el equipo: el primero recibe como 
 * parámetros el nombre del equipo y del país. el segundo invoca al 
 * primero e inicia a los jugadores que conforman al equipo, los 
 * técnicos y jugadores son personas. las personas tienen nombre, 
 * apellido y edad. 
 * 
 * Además, los jugadores tienen un atributo booleano 
 * para representar si son titulares o no en el equipo. los técnicos 
 * tienen como atributos los años de experiencia tipo (ENTERO) y si son 
 * nacionales o extranjeros (TIPO BOOLEANO). 
*/
    
    public
    String nombre;
    String apellido;
    int edad;

    public
    Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

}
