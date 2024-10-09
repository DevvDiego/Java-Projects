public class App{
    
    public static void main(String[] args){

        String nombre = "Changos de tolancingo";
        String pais = "Mexico";
        Tecnico tec1 = new Tecnico("Carlos", "Quiroz", 66, 30, true);
        Portero port1 = new Portero("David", "Espina", 30, true, 10);


        Defensa defensas[] = new Defensa[5];
        defensas[0] = new Defensa("Jerry", "Nina", 24, true);
        defensas[1] = new Defensa("David", "Sanchez", 23, true);
        defensas[2] = new Defensa("William", "Tecillo", 29, true);
        defensas[3] = new Defensa("Cristopher", "Medina", 29, true);

        defensas[4] = new Defensa("Diego", "Garcia", 20, false);

        
        MedioCampo medioCampos[] = new MedioCampo[5];
        medioCampos[0] = new MedioCampo("Mateo", "Uribe", 28, true, 12);
        medioCampos[1] = new MedioCampo("Wilmar", "Sanchez", 25, true, 12);
        medioCampos[2] = new MedioCampo("Juan", "Guillermo Cuadrado", 31, true, 10);
        medioCampos[3] = new MedioCampo("James", "Rodriguez", 28, true, 10);

        medioCampos[4] = new MedioCampo("Jorge", "Benitez", 23, false, 6);


        Delantero delanteros[] = new Delantero[3];
        delanteros[0] = new Delantero("Radamel", "Falcao Garcia", 33, true, 15);
        delanteros[1] = new Delantero("Duban", "Zapata", 28, true, 12);

        delanteros[2] = new Delantero("Eduardo", "Zaragoza", 32, false, 3);


        Equipo changos_de_tolancingo = new Equipo(
                                        nombre, pais, tec1, 
                                        port1, defensas, 
                                        medioCampos, delanteros
                                        );

        changos_de_tolancingo.printAll();



        defensas[0].Salir();
        defensas[4].Entrar();
        
        medioCampos[0].Salir();
        medioCampos[4].Entrar();

        delanteros[0].Salir();
        defensas[2].Entrar();
        
        





    }

}