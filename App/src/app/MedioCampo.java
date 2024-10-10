/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

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

    
    void Entrar(){
        System.out.println("\nDefensa: " + this.nombre + " entra.\n");
    }

    void Salir(){
        System.out.println("\nMC: " + this.nombre + " sale. \n");
    }

}
