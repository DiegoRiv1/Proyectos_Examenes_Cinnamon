package eva2_avance_cinematracker;

/**
 *
 * @author Diego
 */
public class Funcion {
    private int horario;
    //De el dia de funcion.
    private int dia;
    private int mes;
    private int sala;

    public Funcion() {
    }

    public Funcion(int horario, int dia, int mes, int sala) {
        this.horario = horario;
        this.dia = dia;
        this.mes = mes;
        this.sala = sala;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }
    
    
}
