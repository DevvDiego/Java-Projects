import javax.sound.sampled.Port;

public class Equipo {
/*
 * Se requiere desarrollar un programa que modele la conformación 
 * de un equipo de futbol teniendo en cuenta las siguientes 
 * especificaciones: 
 * un equipo de futbol tiene de atributos como: 
 * nombre, país, un técnico, un portero, 
 * 4 defensas, 4 medio campos, y 2 delanteros.
*/

    private
    String nombre;
    String pais;
    Tecnico tecnico;
    Portero portero;
    Defensa[] defensas;
    MedioCampo[] medioCampos;
    Delantero[] delanteros;

    public
/*
 *  * Se requieren 2 constructores para el equipo: el primero recibe como 
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

    Equipo(String nombre, String pais){
        this.nombre = nombre;
        this.pais = pais;
    }

    Equipo(String nombre, String pais, Tecnico tecnico, Portero portero,
    Defensa[] defensas, MedioCampo[] medioCampos, 
    Delantero[] delanteros){
        //llama al constructor que tiene parametros
        this(nombre, pais);

        //Inicia a los jugadores
        this.tecnico = tecnico;
        this.portero = portero;
        this.defensas = defensas;
        this.medioCampos = medioCampos;
        this.delanteros = delanteros;

    }
   


    void printAll(){
        System.out.println(nombre);
        System.out.println(pais);
        System.out.println(tecnico);
        System.out.println(portero);

        System.out.println("\n");

        for (Defensa defensa : defensas) {
            defensa.printAll();
        }
        System.out.println("\n");



        for (MedioCampo medioCampo : medioCampos) {
            System.out.println(medioCampo);
        }
        System.out.println("\n");



        for (Delantero delantero : delanteros) {
            System.out.println(delantero);
        }
        System.out.println("\n");

        // System.out.println(defensas.toString());
        // System.out.println(medioCampos.toString());
        // System.out.println(delanteros.toString());
    }

}
