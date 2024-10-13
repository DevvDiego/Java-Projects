package cuentasbancarias;

public class Banco
{

    static int numeroAutomatico = 1;
    private int numBanco=1;
    private String nombreBanco;

    private Cliente arrCliente[] = new Cliente[0];

    public Banco()
    {
    }

    public Banco(int numBanco, String nombreBanco)
    {
        this.numBanco = numeroAutomatico++;
        this.nombreBanco = nombreBanco;
    }

    public int getNumBanco()
    {
        return numBanco;
    }

    public void setNumBanco(int numBanco)
    {
        this.numBanco = numBanco;
    }

    public String getNombreBanco()
    {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco)
    {
        this.nombreBanco = nombreBanco;
    }

    public static Banco[] agregaPosB(Banco arr[])
    {
        Banco nuevo[] = new Banco[arr.length + 1];
        System.arraycopy(arr, 0, nuevo, 0, arr.length);
        return nuevo;
    }
    public static Cliente[]agregaPos(Cliente arrC[])
    {
        Cliente nuevo[]=new Cliente [arrC.length+1];
        System.arraycopy(arrC, 0, nuevo, 0, arrC.length);
        return nuevo;
    }

    public String mostarDatosB()
    {
        String datosBanco = "\n"+this.getNumBanco()+"\t";
        datosBanco += this.getNombreBanco()+"\t";
        return datosBanco;
    }
    
    
    
    public static void bancosRegistrados(Banco arrB[])
    {
        if (arrB.length != 0)
        {
            System.out.printf("%12s %12S","NUMERO", "BANCO");
            for (Banco banco : arrB)
            {
                if (banco != null)
                {
                    System.out.printf("\n%12s %12s",banco.getNumBanco(),banco.getNombreBanco());
                }
            }
        }else
        {
            System.out.println("No hay bancos registrados");
        }
    }
    
    public static boolean validarBanco(String nombre, Banco arrB[])
    {
        boolean existe = false;
        for (int i = 0; i < arrB.length; i++)
        {
            if (arrB[i].getNombreBanco().equalsIgnoreCase(nombre))
            {
                existe = true;
                break;
            }
        }
        return existe;
    }

    public static boolean validarCliente(int clave, Cliente arrC[])
    {
        boolean existe = false;
        for (Cliente arrC1 : arrC)
        {
            if (arrC1.getClaveBancaria() == clave)
            {
                return true;
            }
        }
        return existe;
    }
    
    public Cliente[] getClientes()
    {
        return arrCliente;
    }

    public Cliente[] getArrCliente()
    {
        return arrCliente;
    }

    public void setArrCliente(Cliente[] arrCliente)
    {
        this.arrCliente = arrCliente;
    }
}
