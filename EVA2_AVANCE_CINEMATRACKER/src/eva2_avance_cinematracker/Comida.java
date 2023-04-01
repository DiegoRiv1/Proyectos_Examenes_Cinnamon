package eva2_avance_cinematracker;

/**
 *
 * @author Diego
 */

//PRODUCTOS QUE SE VENDEN EN DULCERIA
public class Comida {
    private String nombre; //Combo1, Nachos, palomitas...
    private float precio;
    private float descuento; 

    public Comida() {
    }

    public Comida(String nombre, float precio, float descuento) {
        this.nombre = nombre;
        this.precio = precio;
        this.descuento = descuento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }
    
    
    
}
