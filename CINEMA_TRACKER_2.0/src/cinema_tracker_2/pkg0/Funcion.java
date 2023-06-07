package cinema_tracker_2.pkg0;

import java.util.Date;

/**
 *
 * @author Diego
 */
public class Funcion {
    private Pelicula pelicula;
    private Sala sala;
    private Date horario;

    public Funcion(Pelicula pelicula, Sala sala, Date horario) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.horario = horario;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public Date getHorario() {
        return horario;
    }
}
