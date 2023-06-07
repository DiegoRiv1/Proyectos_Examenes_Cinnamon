package cinema_tracker_2.pkg0;

/**
 *
 * @author Diego
 */
public class Pelicula {
        private String nombrePelicula;
        private String genero;
        private String clasificacion;
        private String idioma;
        private int duracion;

        public Pelicula(String nombrePelicula, String genero, String clasificacion, String idioma, int duracion) {
            this.nombrePelicula = nombrePelicula;
            this.genero = genero;
            this.clasificacion = clasificacion;
            this.idioma = idioma;
            this.duracion = duracion;
        }

        public String getNombrePelicula() {
            return nombrePelicula;
        }

        public String getGenero() {
            return genero;
        }

        public String getClasificacion() {
            return clasificacion;
        }

        public String getIdioma() {
            return idioma;
        }

        public int getDuracion() {
            return duracion;
        }
}
