package fichabibliogrfica;

/**
 *
 * @author sofia
 */
public class FichaBibliografica {
    // Atributos
    private String autor;
    private String titulo;
    private String ciudad;
    private String editorial;
    private int anioPublicacion;
    
    // Constructores
    public FichaBibliografica() {
        this.autor = "Gabriel García Márquez";
        this.titulo = "Cien años de soledad";
        this.ciudad = "Buenos Aires";
        this.editorial = "Sudamericana";
        this.anioPublicacion = 1967;
    }
    
    public FichaBibliografica(String autor, String titulo, String ciudad, String editorial, int anioPublicacion) {
        this.autor = autor;
        this.titulo = titulo;
        this.ciudad = ciudad;
        this.editorial = editorial;
        this.anioPublicacion = anioPublicacion;
    }
    
    // Métodos get y set
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    
    // Método para imprimir la ficha bibliográfica en formato APA
    public void imprimirFicha() {
        System.out.println(autor + ". (" + anioPublicacion + "). " + titulo + ". " + ciudad + ": " + editorial + ".");
    }
}
