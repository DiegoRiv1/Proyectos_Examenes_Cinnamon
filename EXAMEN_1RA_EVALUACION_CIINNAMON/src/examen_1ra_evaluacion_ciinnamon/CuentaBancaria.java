package examen_1ra_evaluacion_ciinnamon;

/**
 * @author Diego
 */
public class CuentaBancaria {
    //Atributos
    private String n_cuenta;
    private String nomCliente;
    private double saldo;
    
    //Constructores
    public CuentaBancaria(){
        n_cuenta = "";
        nomCliente = "";
        saldo = 0;
    }
    public CuentaBancaria(
            String cuenta, String cliente, double dinero){
        n_cuenta = cuenta;
        nomCliente = cliente;
        saldo = dinero;
    }
    
    //Metodos SET y GET
    public void setCuenta(String cuenta){
        n_cuenta = cuenta;
    }
    public String getCuenta(){
        return n_cuenta;
    }
    public void setCliente(String cliente){
        n_cuenta = cliente;
    }
    public String getCliente(){
        return nomCliente;
    }
    
    //Otros metodos
    public void depositarEnCuenta(double ingreso){
        saldo += ingreso;
    }
    public void retirarDeCuenta(double retiro){
        if(saldo < retiro)
            saldo -= retiro;
        else
            System.out.println("Saldo insuficiente.");
    }
    public void imprimirDatos(){
        System.out.println();
        System.out.println();
        System.out.println("Cliente: "+ getCliente());
        System.out.println("No. Cuenta: "+getCuenta());
        System.out.println("Saldo: "+ saldo + "$");
    }
    
}
