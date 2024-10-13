package cuentasbancarias;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Cliente
{

    Scanner leer = new Scanner(System.in);
    private int claveBancaria;
    private String contrasenia;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private LocalDate fechaNac;
    private double saldo;

    Token arrToken[] = new Token[0];

    public Cliente(int claveBancaria, String contrasenia, String nombre, String apellidoP, String apellidoM, LocalDate fechaNac, double saldo)
    {
        this.claveBancaria = claveBancaria;
        this.contrasenia = contrasenia;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.fechaNac = fechaNac;
        this.saldo = saldo;
    }

    public int getClaveBancaria()
    {
        return claveBancaria;
    }

    public void setClaveBancaria(int claveBancaria)
    {
        this.claveBancaria = claveBancaria;
    }

    public String getContrasenia()
    {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia)
    {
        this.contrasenia = contrasenia;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellidoP()
    {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP)
    {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM()
    {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM)
    {
        this.apellidoM = apellidoM;
    }

    public LocalDate getFechaNac()
    {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac)
    {
        this.fechaNac = fechaNac;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }

    public void ingrerarSaldo(double saldo)
    {
        if (saldo > 0)
        {
            this.setSaldo(this.getSaldo() + saldo);
            System.out.println("\n----------------"
                    + "\nINGRESO CORRECTO"
                    + "\n----------------");
            String cantidad = "+" + saldo;
            generaToken("INGRESO + ", cantidad);
        } else
        {
            System.out.println("\n-----------------"
                    + "\nCANTIDAD INVALIDA"
                    + "\n-----------------");
        }
    }

    public void retirarSaldo(double saldo)
    {
        if (saldo > 0 && saldo < this.getSaldo())
        {
            this.setSaldo(this.getSaldo() - saldo);
            System.out.println("\n---------------"
                    + "\nRETIRO CORRECTO"
                    + "\n---------------");
            String cantidad = "-" + saldo;
            generaToken("RETIRO - ", cantidad);
        } else
        {
            System.out.println("\n-------------------------------------------------------------------"
                    + "\nLA CANTIDAD INGRESADA ES INVALIDA O NO CUENTAS CON SALDO DISPONIBLE"
                    + "\n-------------------------------------------------------------------");
        }

    }

    public void hacerTransferencia(double saldo)
    {

        if (saldo <= 0)
        {
            System.out.println("Ingrese una cantidad positiva");
        } else if (saldo <= this.getSaldo())
        {
            this.setSaldo(this.getSaldo() - saldo);
            System.out.println("-------------------------------------------------");
            System.out.println("OPERACION REALIZADA (SE ENVIO LA TRANSFERENCIA)");
            String cantidad = "-" + saldo;
            generaToken("TRANSFERENCIA", cantidad);
        } else
        {

            System.out.println("\n-------------------------------"
                    + "\nNO CUENTAS CON SALDO SUFICIENTE"
                    + "\n-------------------------------");
        }

    }

    public void recibirTransferencia(double saldo)
    {
        if (saldo <= 0)
        { 
            
        } else
        {
            this.setSaldo(this.getSaldo() + saldo);
            System.out.println("OPERACION REALIZADA (SE RECIBIO LA TRANSFERENCIA)");
            System.out.println("-------------------------------------------------");
            String cantidad = "+" + saldo;
            generaToken("TRANSFERENCIA", cantidad);
        }

    }

    private Token[] agregaPos(Token arrT[])
    {
        Token nuevo[] = new Token[arrT.length + 1];
        System.arraycopy(arrT, 0, nuevo, 0, arrT.length);
        return nuevo;
    }

    private Token[] generaToken(String operacion, String cantidad)
    {
        arrToken = agregaPos(arrToken);
        for (int i = 0; i < arrToken.length; i++)
        {
            if (arrToken[i] == null)
            {
                Token nuevo = new Token(operacion, cantidad);
                arrToken[i] = nuevo;
                break;
            }
        }
        return arrToken;
    }

    public void getToken(Cliente arrC[])
    {
        System.out.println("**************************************************************");
        System.out.printf("%20s %20s %20s", "NO. TOKEN", "OPERACION", "CANTIDAD\n");
        System.out.println("");
        for (int i = 0; i < arrToken.length; i++)
        {
            if (arrToken[i] != null)
            {
                System.out.printf("%20s %20s %20s", arrToken[i].getNumeroToken(), arrToken[i].getOperacion(), arrToken[i].getCantidad() + "\n");
            }
        }
        System.out.println("\n               SU SALDO ACTUAL ES DE " + saldo);
        System.out.println("**************************************************************");
    }

    public int calcularEdad()
    {
        LocalDate hoy = LocalDate.now();
        return Period.between(fechaNac, hoy).getYears();
    }

    public String mostarDatosC()
    {

        String datosCliente = "NOMBRE: " + this.getNombre() + " "+this.getApellidoP()+ " "+this.getApellidoM() +"\t";
        datosCliente += "CLAVE: " + this.getClaveBancaria() + "\t";
        datosCliente += "SALDO: " + this.getSaldo();
        return datosCliente;

    }
}
