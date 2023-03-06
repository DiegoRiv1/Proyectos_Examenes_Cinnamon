package examen_1ra_evaluacion_ciinnamon;

/**
 * @author Diego
 */
public class Password {
    //Atributos
    private String user;
    private String password;
    
    //Constructores
    
        //default
    public Password(){
        user = "";
        password = "";
    }
        //con argumentos
    public Password(String nombre, String contra){
        user = nombre;
        password = contra;
    }
    
    //METODO VERIFICADOR DE ACCESO
    public void verificarAcceso(String usuario, String clave){
        boolean bool = false;
        
        if(user == usuario && password == clave)
            bool = true;
        
        System.out.println("Acceso es: " + bool);
    }
}
