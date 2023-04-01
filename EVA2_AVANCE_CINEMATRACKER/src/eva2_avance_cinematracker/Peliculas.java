package eva2_avance_cinematracker;

/**
 *
 * @author Diego
 */

/*
En esta clase se capturan todos los datos de las peliculas que se 
estaran reproduciendo en el cine.
*/
public class Peliculas {
    protected String nombre;
    private String Genero; 
    private String sinopsis;
    private int anio;
    private int duracion; //Se registrara en minutos.
    private String idioma;
    private int clasificacion; //si es B-15, PG-13, se asignara por menu

    public Peliculas() {
    }

    public Peliculas(String nombre, String Genero, String sinopsis, int anio, int duracion, String idioma, int clasificacion) {
        this.nombre = nombre;
        this.Genero = Genero;
        this.sinopsis = sinopsis;
        this.anio = anio;
        this.duracion = duracion;
        this.idioma = idioma;
        this.clasificacion = clasificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
    
    
}
