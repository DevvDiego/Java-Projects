
package cuentasbancarias;


public class Token
{
    static int numeroAutomatico=0;
    private int numeroToken;
    private String operacion;
    private String cantidad;

    public Token( String operacion, String cantidad)
    {
        this.numeroToken = numeroAutomatico++;
        this.operacion = operacion;
        this.cantidad = cantidad;
    }

    public Token()
    {
    }
    
    public int getNumeroToken()
    {
        return numeroToken;
    }

    public void setNumeroToken(int numeroToken)
    {
        this.numeroToken = numeroToken;
    }

    public String getOperacion()
    {
        return operacion;
    }

    public void setOperacion(String operacion)
    {
        this.operacion = operacion;
    }

    public String getCantidad()
    {
        return cantidad;
    }

    public void setCantidad(String cantidad)
    {
        this.cantidad = cantidad;
    }
    
    public String consultarToken()
    {
        String datosToken= "Numero de token"+this.getNumeroToken();
        datosToken += " Operacion"+this.getOperacion();
        datosToken += " Cantidad"+this.getCantidad();
        
        return datosToken;
    }
    
}
