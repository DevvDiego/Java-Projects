/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

public class Tecnico extends Persona {

    private
    int añosExperiencia;
    Boolean esExtranjero;

    public
    Tecnico(String nombre, String apellido, int edad, int añosExperiencia, Boolean esExtranjero){
        super(nombre, apellido, edad);
        this.añosExperiencia = añosExperiencia;
        this.esExtranjero = esExtranjero;
    }

    void printAll(){
        System.out.println(this.nombre + ", " + this.apellido + ", " + this.edad + ", " + 
        ", " + this.get_añosExperiencia() + ", " + this.get_esExtranjero());
    }


    int get_añosExperiencia(){
        return this.añosExperiencia;
    }
    
    Boolean get_esExtranjero(){
        return this.esExtranjero;
    }

    
    // void Entrar(){
    //     System.out.println("\nDefensa: " + this.nombre + " entra.\n");
    // }

    // void Salir(){
    //     System.out.println("\n" + this.nombre + "sale. \n");
    // }
    

}