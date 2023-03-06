package examen_1ra_evaluacion_ciinnamon;

/**
 * @author Diego
 */
public class TestCovid {
    //ATRIBUTOS
    private int edad;
    private boolean enfermedad;
    private double peso;
    private double estatura;
    
    
    //CONSTRUCTORES
    public TestCovid(){
        edad = 0;
        enfermedad = false; 
        peso = 0;
        estatura = 0;
    }
    public TestCovid(
            int anos, boolean enfermo, double kg, double m){
        edad = anos;
        enfermedad = enfermo;
        peso = kg;
        estatura = m;
    }
    
    //METODOS
    public void setEdad(int anos){
        edad = anos;
    }
    public int getEdad(){
        return edad;
    }
    public void setEnermedad(boolean enfermo){
        enfermedad = enfermo;
    }
    public boolean getEnfermo(){
        return enfermedad;
    }
    public void setPeso(double masa){
        peso = masa;
    }
    public double getPeso(){
        return peso;
    }
    public void setEstatura(double altura){
        estatura = altura;
    }
    public double getEstatura(){
        return estatura;
    }
    
    //METODO PRINCIPAL
    public void calcularPersonaRiesgo(){
        double IMC = peso/(estatura*estatura);
        
        if(edad >= 65)
            System.out.println("PERSONA DE RIESGO");
        else if(enfermedad == true)
            System.out.println("PERSONA DE RIESGO");
        else if(IMC > 30)
            System.out.println("PERSONA DE RIESGO");
        else
            System.out.println("PERSONA SIN RIESGO");
    }
}
