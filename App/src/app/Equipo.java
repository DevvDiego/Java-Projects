/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

public class Equipo {

    private
    String nombre;
    String pais;
    Tecnico tecnico;
    Portero portero;
    Defensa[] defensas;
    MedioCampo[] medioCampos;
    Delantero[] delanteros;

    public
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
        tecnico.printAll();
        portero.printAll();

        System.out.println("\n");

        for (Defensa defensa : defensas) {
            defensa.printAll();
        }
        System.out.println("\n");



        for (MedioCampo medioCampo : medioCampos) {
            medioCampo.printAll();
        }
        System.out.println("\n");



        for (Delantero delantero : delanteros) {
            delantero.printAll();
        }
        System.out.println("\n");

    }

}