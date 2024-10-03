public class App{
/*
 * 
 * Se requiere desarrollar un programa que modele la conformación 
 * de un equipo de futbol teniendo en cuenta las siguientes 
 * especificaciones: 
 * un equipo de futbol tiene de atributos como: 
 * nombre, país, un técnico, un portero, 
 * 4 defensas, 4 medio campos, y 2 delanteros.
 * 
 * Se requieren 2 constructores para el equipo: el primero recibe como 
 * parámetros el nombre del equipo y del país. el segundo invoca al 
 * primero e inicia a los jugadores que conforman al equipo, los 
 * técnicos y jugadores son personas. las personas tienen nombre, 
 * apellido y edad. 
 * 
 * 
 * Además, los jugadores tienen un atributo booleano 
 * para representar si son titulares o no en el equipo. los técnicos 
 * tienen como atributos los años de experiencia tipo (ENTERO) y si son 
 * nacionales o extranjeros (TIPO BOOLEANO). 
 * 
 * Los jugadores pueden ser, defensas, porteros, medio campos
 * o delanteros. Los porteros tienen como atributo propio 
 * la cantidad de goles recibidos y los jugadores medio campos tienen 
 * el número de asistencias realizadas. Los delanteros la cantidad de goles anotados.
 * Se requiere un método imprimir que muestre en pantalla los datos del equipo de 
 * futbol, su técnico y sus jugadores. 
 * 
 * 
 * 
 * Se debe realizar una clase prueba con un método main 
 * que cree un equipo de futbol de la selección mexicana. 
 * Con los siguientes datos
    Técnico: Carlos Quiroz, 66 años, 30 años de experiencia, extranjero
    Portero: David Espina, 30 años, 10 goles recibidos
    Defensas: Jerry Nina, 24 años, David Sánchez, 23 años, William Tecillo, 29 años, Cristopher Medina, 29 años
    Medio campos: Mateo Uribe, 28 años, 12 asistencias, Wilmar, 25 años, 12 asistencias, Juan Guillermo Cuadrado, 31 años, 10 asistencias, James Rodríguez, 28 años, 10 asistencias
    Delanteros: Radamel Falcao Garcia, 33 años, 15 goles, Duban Zapata, 28 años, 12 goles 
    *TODOS SON TITULARES
    
 */
    public static void main(String[] args){

        String nombre = "Changos de tolancingo";
        String pais = "Mexico";

        Tecnico tec1 = new Tecnico("Carlos", "Quiroz", 66, true, 30, true);
        Portero port1 = new Portero("David", "Espina", 30, true, 10);
        
        Defensa def1 = new Defensa("Jerry", "Nina", 24, true);
        Defensa def2 = new Defensa("David", "Sanchez", 23, true);
        Defensa def3 = new Defensa("William", "Tecillo", 29, true);
        Defensa def4 = new Defensa("Cristopher", "Medina", 29, true);
        
        Defensa defensas[] = new Defensa[4];
        defensas[0] = def1;
        defensas[1] = def2;
        defensas[2] = def3;
        defensas[3] = def4;

        //Medio campos:
        // Mateo Uribe, 28 años, 12 asistencias,
        // Wilmar, apellido????????, 25 años, 12 asistencias, 
        // Juan Guillermo Cuadrado, 31 años, 10 asistencias,
        // James Rodríguez, 28 años, 10 asistencias
        MedioCampo medCamp1 = new MedioCampo("Mateo", "Uribe", 28, true, 12);
        MedioCampo medCamp2 = new MedioCampo("Wilmar", "Sanchez", 25, true, 12);
        MedioCampo medCamp3 = new MedioCampo("Juan", "Guillermo Cuadrado", 31, true, 10);
        MedioCampo medCamp4 = new MedioCampo("James", "Rodriguez", 28, true, 10);
        
        MedioCampo medioCampos[] = new MedioCampo[4];
        medioCampos[0] = medCamp1;
        medioCampos[1] = medCamp2;
        medioCampos[2] = medCamp3;
        medioCampos[3] = medCamp4;




        //Delanteros: Radamel Falcao Garcia, 33 años, 15 goles,
        //Duban Zapata, 28 años, 12 goles 
        Delantero dela1 = new Delantero("Radamel", "Falcao Garcia", 33, true, 15);
        Delantero dela2 = new Delantero("Duban", "Zapata", 28, true, 12);

        Delantero delanteros[] = new Delantero[2];
        delanteros[0] = dela1;
        delanteros[1] = dela2;


        //inicializar equipo
        Equipo changos_de_tolancingo = new Equipo(nombre, pais, tec1, port1, defensas, medioCampos, delanteros);


        //! Crear metodos para cada tipo de jugador para mostrar sus valores interiores.
        /** Algo como:
         *  for (MedioCampo medioCampo : medioCampos) {
                System.out.print(medioCampo.printAll()); //notese el printAll
            }
            System.out.println("\n");

         * 
         */

        changos_de_tolancingo.printAll();

    }

}