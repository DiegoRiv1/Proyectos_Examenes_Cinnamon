package cinema_tracker_2.pkg0;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class CINEMA_TRACKER_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String user = JOptionPane.showInputDialog("Ingresa usuario:");
        String key = JOptionPane.showInputDialog("Ingresa tu contraseña: ");
        
        if("Diego".equals(user) && "1234".equals(key)){
            boolean power = true;
            while(power == true){
                Cartelera car = new Cartelera();
                Cine cine = new Cine();
                Dulcería dulce  = new Dulcería();
                Sala sala = new Sala(1, 5, 1, 70);

                                
                int ele = Integer.parseInt(JOptionPane.showInputDialog("Que deseas hacer? "
                        + "\n1. Ingresar pelicula"
                        + "\n2. Registrar sala"
                        + "\n3. Taquilla"
                        + "\n4. Dulcería"
                        + "\n5. Salir"));
                
                switch(ele){
                    case 1:
                        car.agregarPelicula();
                        break;
                        
                    case 2:
                        cine.agregarSala();
                        break;
                        
                    case 3:
                        sala.mostrarAsientosDisponibles();
                        sala.venderAsiento();
                        sala.mostrarAsientosDisponibles();
                        break;
                        
                    case 4:
                        dulce.agregarProducto();
                        dulce.seleccionarProductos();
                        break;
                        
                    case 5:
                        JOptionPane.showMessageDialog(null, "Gracias por usar CinemaTracker:)");
                        power = false;
                        break; 
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Error. numero ingresado invalido");
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null , "Usuario y/o contraseña incorrectos");
        }
    }
    
}
