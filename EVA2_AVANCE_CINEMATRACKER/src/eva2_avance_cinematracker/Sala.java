package eva2_avance_cinematracker;

/**
 *
 * @author Diego
 */

/*
Se asignara las salas que tiene el cine, asi como sus caracteristicas
*/
public class Sala {
    protected int numSala;
    private int capacidad;
    private String tipoSala; //Si es VIP, 3D, standard, etc.

    public Sala() {
    }

    public int getNumSala() {
        return numSala;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipoSala() {
        return tipoSala;
    }

    public void setTipoSala(String tipoSala) {
        this.tipoSala = tipoSala;
    }
    
}
