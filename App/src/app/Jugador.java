/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

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