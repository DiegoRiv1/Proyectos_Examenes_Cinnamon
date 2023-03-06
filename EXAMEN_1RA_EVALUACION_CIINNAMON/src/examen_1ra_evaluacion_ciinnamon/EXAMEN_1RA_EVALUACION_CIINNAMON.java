package examen_1ra_evaluacion_ciinnamon;

/**
 *
 * @author Cinnamon
 */
public class EXAMEN_1RA_EVALUACION_CIINNAMON {

    
    public static void main(String[] args) {

        DatosIntegrantes.imprimirDatosEquipo();
        DatosIntegrantes.imprimirProblemasResueltos();
        
        CuentaBancaria cuenta1 = new CuentaBancaria(
                "2267L", "Diego Rivera", 34.5);
        cuenta1.depositarEnCuenta(7500);
        //cuenta1.imprimirDatos();
        
        Password user = new Password("Diego", "1234");
        //user.verificarAcceso("Diego", "1234");
        
        TestCovid covid = new TestCovid(18, false, 65, 1.65);
        //covid.calcularPersonaRiesgo();
        
        Pelicula peli = new Pelicula("The Joker",
                "Warner Brothers", 18);
        //peli.ImprimirDatos();
        //peli.evluarEdad(18);
    }
    
}
