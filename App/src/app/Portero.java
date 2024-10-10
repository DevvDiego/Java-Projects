/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

public class Portero extends Jugador {
    
    private
    int golesRecibidos;
    
    public
    Portero(String nombre, String apellido, int edad, Boolean esTitular, int golesRecibidos){
        super(nombre, apellido, edad, esTitular);
        this.golesRecibidos = golesRecibidos;
    }

    void printAll(){
        System.out.println(this.nombre + ", " + this.apellido + ", " + this.edad + ", " + this.get_esTitular()
        + ", " + this.get_golesRecibidos());
    }

    int get_golesRecibidos(){
        return this.golesRecibidos;
    }

    
    // void Entrar(){
    //     System.out.println("\nDefensa: " + this.nombre + " entra.\n");
    // }

    // void Salir(){
    //     System.out.println("\n" + this.nombre + "sale. \n");
    // }
    
}
