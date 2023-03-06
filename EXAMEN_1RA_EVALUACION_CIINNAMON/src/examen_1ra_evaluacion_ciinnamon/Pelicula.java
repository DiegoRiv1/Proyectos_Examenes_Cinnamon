package examen_1ra_evaluacion_ciinnamon;

/**
 * @author Diego
 */
public class Pelicula {
    //ATRIBUTOS
    private String titulo;
    private String estudio;
    private int rating;
    
    //CONSTRUCTORES
    public Pelicula(){
        titulo = "";
        estudio = "";
        rating = 0;
    }
    public Pelicula(String name,
            String studio, int edad){
        titulo = name;
        estudio = studio;
        rating = edad;
    }
    
    //METODOS SET Y GET
    public void setTitulo(String nombre){
        titulo = nombre;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setEstudio(String studio){
        estudio = studio;
    }
    public String getEstudio(){
        return estudio;
    }public void setRating(int edad){
        rating = edad;
    }
    public int getRating(){
        return rating;
    }
    
    //METODO IMPRIMIR
    public void ImprimirDatos(){
        System.out.println("PELICULA:");
        System.out.println();
        System.out.println("Titulo: " + titulo);
        System.out.println("Del estudio: " + estudio);
        System.out.println("Rating de edad: +" + rating);
    }
    
    //Metodo para evaluar edad
    public void evluarEdad(int edad){
        if(edad >= rating)
            System.out.println("Puedes ver la pelicula");
        else
            System.out.println("No puedes ver la pelicula");
    }
}
