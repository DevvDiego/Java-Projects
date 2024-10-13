package cuentasbancarias;

import java.time.LocalDate;
import java.util.Scanner;

public class Prb
{

    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        Banco arrBanco[] = new Banco[0];
        int op = 0;

        do
        {
            System.out.println("\n***************************");
            System.out.println("1.Registrar nuevo banco");
            System.out.println("2.Registrar nuevo cliente");
            System.out.println("3.Iniciar sesion");
            System.out.println("***************************");
            System.out.println("4.Salir");
            System.out.println("***************************");
            op = leer.nextInt();

            switch (op)
            {
                case 1:
                    arrBanco = registrarBanco(leer, arrBanco);
                    break;
                case 2:
                    arrBanco = registrarCliente(leer, arrBanco);
                    break;
                case 3:
                    arrBanco = iniciarSesion(leer, arrBanco);
                    break;
                case 4:

                    break;
                default:
                    System.out.println("\n---------------"
                            + "\nOPCION INVALIDA"
                            + "\n---------------");
            }
        } while (op != 4);
    }

    //Metodo para rgistrara los bancos
    public static Banco[] registrarBanco(Scanner leer, Banco arrB[])
    {
        System.out.println("\nIngrese el nombre del banco");
        String nombreBanco = leer.next().trim();

        if (!Banco.validarBanco(nombreBanco, arrB))
        {
            Banco banco = new Banco(1, nombreBanco);
            arrB = Banco.agregaPosB(arrB);
            for (int i = 0; i < arrB.length; i++)
            {
                if (arrB[i] == null)
                {
                    arrB[i] = banco;
                    System.out.println("\n------------------------------"
                            + "\nBANCO REGISTRADO CORRECTAMENTE"
                            + "\n------------------------------");
                    break;
                }
            }
        } else
        {
            System.out.println("\n-----------------------------"
                    + "\nESTE BANCO YA ESTA REGISTRADO"
                    + "\n-----------------------------");
        }
        return arrB;
    }

    public static Banco[] registrarCliente(Scanner leer, Banco arrB[])
    {
        if (arrB.length != 0)
        {
            Banco.bancosRegistrados(arrB);
            System.out.println("\n\nIntroduca el nombre del banco al que se desea registrar");
            String banco = leer.next().trim();

            for (Banco b : arrB)
            {
                if (b.getNombreBanco().equalsIgnoreCase(banco))
                {
                    b.setArrCliente(registrarCliente(leer, b.getArrCliente()));
                }
            }
            if (!Banco.validarBanco(banco, arrB))
            {
                System.out.println("\n----------------------------------------"
                        + "\nNO HAY BANCOS REGISTRADOS CON ESE NOMBRE"
                        + "\n----------------------------------------");
            }
        } else
        {
            System.out.println("\n-------------------------"
                    + "\nNO HAY BANCOS REGISTRADOS"
                    + "\n-------------------------");
        }
        return arrB;
    }

    public static Cliente[] registrarCliente(Scanner leer, Cliente arrCliente[])
    {
        System.out.println("Ingrese clave bancaria: ");
        int clave = leer.nextInt();

        if (Banco.validarCliente(clave, arrCliente))
        {
            System.out.println("\n----------------------------------"
                    + "\nYA EXISTE UN CLIENTE CON ESA CLAVE"
                    + "\n----------------------------------");
            return arrCliente;
        } else
        {
            System.out.println("Contrasenia: ");
            String contrasenia = leer.next().trim();
            System.out.println("Nombre: ");
            String nombreCli = leer.next().trim();
            System.out.println("Apellido Paterno: ");
            String apellidoP = leer.next().trim();
            System.out.println("Apellido Materno: ");
            String apellidoM = leer.next().trim();
            System.out.println("Ingrese la fecha de nacimeinto: ");
            int dia = 0, mes = 0, anio = 0;
            do
            {
                System.out.println("Dia: (dd)");
                dia = leer.nextInt();
            } while (dia < 0 || dia > 31);

            do
            {
                System.out.println("Mes:  (mm)");
                mes = leer.nextInt();

            } while (mes < 0 || mes > 12);

            do
            {
                System.out.println("Anio:  (aaaa)");
                anio = leer.nextInt();
            } while (anio < 1900 || anio > 2024);

            LocalDate fechaNac = LocalDate.of(anio, mes, dia);
            System.out.println("Saldo: 0 ");
            double saldo = 0;

            Cliente cliente = new Cliente(clave, contrasenia, nombreCli, apellidoP, apellidoM, fechaNac, saldo);
            arrCliente = Banco.agregaPos(arrCliente);
            for (int i = 0; i < arrCliente.length; i++)
            {
                if (arrCliente[i] == null)
                {
                    arrCliente[i] = cliente;
                    System.out.println("\n--------------------------------"
                            + "\nCLIENTE REGISTRADO CORRECTAMENTE"
                            + "\n--------------------------------");
                    break;
                }
            }
        }
        return arrCliente;
    }

    public static Banco[] iniciarSesion(Scanner leer, Banco arrB[])
    {
        if (arrB.length != 0)
        {
            Banco.bancosRegistrados(arrB);
            System.out.println("\n\nIntroduca el nombre del banco al que desea igresar");
            String banco = leer.next().trim();

            for (Banco b : arrB)
            {
                if (b.getNombreBanco().equalsIgnoreCase(banco))
                {
                    if (b.getClientes().length != 0)
                    {
                        boolean existe = false;
                        System.out.println("Ingrese la clave bancaria");
                        int clave = leer.nextInt();
                        System.out.println("Ingrese la contrasenia");
                        String contra = leer.next().trim();
                        for (Cliente c : b.getArrCliente())
                        {
                            if (c.getClaveBancaria() == clave && c.getContrasenia().equalsIgnoreCase(contra))
                            {
                                existe = true;
                                int op = 0;

                                double saldo = 0;
                                do
                                {
                                    System.out.println("\n****************************************************");
                                    System.out.println("\nBANCO: "+b.getNombreBanco()+"\t"+ c.mostarDatosC()+"\n");
                                    System.out.println("Bienvenido al SUBMENU");
                                    System.out.println("1.Ingresar saldo");
                                    System.out.println("2.Retirar saldo");
                                    System.out.println("3.Hacer transferencia");
                                    System.out.println("4.Consultar estado de cuenta");
                                    System.out.println("5.Cerrar sesion");
                                    System.out.println("****************************************************\n");

                                    op = leer.nextInt();

                                    switch (op)
                                    {
                                        case 1:
                                            System.out.println("Cantidad a ingresar: ");
                                            saldo = leer.nextDouble();
                                            c.ingrerarSaldo(saldo);
                                            
                                            break;
                                        case 2:
                                            if (saldo != 0)
                                            {
                                                System.out.println("Cantidad a retirar: ");
                                                saldo = leer.nextDouble();
                                                c.retirarSaldo(saldo);
                                            } else
                                            {
                                                System.out.println("\n-------------------------------"
                                                        + "\nNO CUENTAS CON SALDO DISPONIBLE"
                                                        + "\n-------------------------------");;
                                            }
                                            break;
                                        case 3:
                                            if (c.getSaldo() != 0)
                                            {
                                                Banco.bancosRegistrados(arrB);
                                                System.out.println("\n\nIngrese el nombre del banco al que desea hacer la transferencia");
                                                String banco1 = leer.next().trim();

                                                boolean existe1 = false;
                                                for (Banco b1 : arrB)
                                                {
                                                    if (b1.getNombreBanco().equalsIgnoreCase(banco1))
                                                    {
                                                        existe1 = true;
                                                        boolean existe2 = false;

                                                        System.out.println("Ingrese la clave bancaria");
                                                        int clave1 = leer.nextInt();
                                                        
                                                            for (Cliente c1 : b1.getArrCliente())
                                                            {
                                                                if (c1.getClaveBancaria() == clave1)
                                                                {
                                                                    existe2 = true;
                                                                    System.out.println("Ingrese la cantidad a transferir");
                                                                    saldo = leer.nextInt();                                                                   
                                                                    c.hacerTransferencia(saldo);
                                                                    if (saldo <= c.getSaldo())
                                                                    {
                                                                    c1.recibirTransferencia(saldo);
                                                                    }
                                                                    break;
                                                                    

                                                                }
                                                            }

                                                            if (!existe2)
                                                            {
                                                                System.out.println("\n-----------------------------------------"
                                                                        + "\nNO SE ENCONTRARON CLIENTES CON ESA CLAVE"
                                                                        + "\n-----------------------------------------");
                                                            }
                                                        
                                                    }
                                                }
                                                if (!existe1)
                                                {
                                                    System.out.println("\n----------------------------------------"
                                                            + "\nNO SE ENCONTRARON BANCOS CON ESE NOMBRE"
                                                            + "\n----------------------------------------");;
                                                }
                                            }else
                                            {
                                                System.out.println("\n-------------------------------"
                                                        + "\nNO CUENTAS CON SALDO DISPONIBLE"
                                                        + "\n-------------------------------");;
                                            }
                                            break;
                                        case 4:
                                            c.getToken(b.getArrCliente());
                                            break;
                                        case 5:

                                            break;
                                        default:
                                            System.out.println("\n----------------"
                                                    + "\nOPCION INVALIDA"
                                                    + "\n----------------");
                                    }
                                } while (op != 5);

                            }
                        }
                        if (!existe)
                        {
                            System.out.println("\n-----------------------------"
                                    + "\nDATOS INGRESADOOS INCORRECTOS"
                                    + "\n-----------------------------");
                        }
                    } else
                    {
                        System.out.println("\n---------------------------"
                                + "\nNO HAY CLIENTES REGISTRADOS"
                                + "\n---------------------------");
                    }

                }
            }
            if (!Banco.validarBanco(banco, arrB))
            {
                System.out.println("\n-----------------------------------------"
                        + "\nNO HAY BANCOS REGISTRADOS CON ESTE NOMBRE"
                        + "\n-----------------------------------------");

            }
        } else
        {
            System.out.println("\n-------------------------"
                    + "\nNO HAY BANCOS REGISTRADOS"
                    + "\n-------------------------");
        }
        return arrB;
    }
}
