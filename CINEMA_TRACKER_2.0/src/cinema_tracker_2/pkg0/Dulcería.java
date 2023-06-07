/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema_tracker_2.pkg0;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Dulcería {
    private List<Comida> listaProductos;

    public Dulcería() {
        listaProductos = new ArrayList<>();
    }
    
    public static class Comida {
        private String nombreProducto;
        private double precio;

        public Comida(String nombreProducto, double precio) {
            this.nombreProducto = nombreProducto;
            this.precio = precio;
        }

        public String getNombreProducto() {
            return nombreProducto;
        }

        public double getPrecio() {
            return precio;
        }
    }

    public void agregarProducto() {
        while(true){
            Scanner scn = new Scanner(System.in);
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.print("Ingrese el nombre del producto: ");
            String nombreProducto = scn.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            double precio = scn.nextDouble();

            Comida producto = new Comida(nombreProducto, precio);
            listaProductos.add(producto);
            System.out.println("Deseas continuar ingresando productos? Si(1)    No (0)");
            int keepGoing = scn.nextInt();
            if(keepGoing != 1)
                break;
        }
        
    }

    public void mostrarProductos() {
        System.out.println("Productos disponibles:");
        for (Comida producto : listaProductos) {
            System.out.println(producto.getNombreProducto() + " - $" + producto.getPrecio());
        }
    }

    public void seleccionarProductos() {
        Scanner scn = new Scanner(System.in);
        List<Comida> productosSeleccionados = new ArrayList<>();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Selecciona los productos ingresando su número:");
        mostrarProductos();
        System.out.println("Presiona '0' para finalizar la selección.");

        int opcion;
        do {
            opcion = scn.nextInt();
            if (opcion >= 1 && opcion <= listaProductos.size()) {
                Comida producto = listaProductos.get(opcion - 1);
                productosSeleccionados.add(producto);
                System.out.println("Producto '" + producto.getNombreProducto() + "' agregado.");
            } else if (opcion != 0) {
                System.out.println("Opción inválida. Por favor, selecciona un número válido.");
            }
        } while (opcion != 0);

        realizarCobro(productosSeleccionados);
    }

    public void realizarCobro(List<Comida> productosSeleccionados) {
        double total = 0;
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Productos seleccionados:");
        for (Comida producto : productosSeleccionados) {
            System.out.println(producto.getNombreProducto() + " - $" + producto.getPrecio());
            total += producto.getPrecio();
        }
        System.out.println("Total a pagar: $" + total);

        Scanner scn = new Scanner(System.in);
        System.out.print("Ingrese el monto pagado por el cliente: $");
        double montoPagado = scn.nextDouble();

        double cambio = montoPagado - total;
        System.out.println("Cambio a regresar: $" + cambio);

        // Generar el ticket en archivo de texto
        generarTicket(productosSeleccionados, total, montoPagado, cambio);
    }

    public void generarTicket(List<Comida> productosSeleccionados, double total, double montoPagado, double cambio) {
        String nombreArchivo = "ticket_" + generarNombreFecha() + ".txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(nombreArchivo))) {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date fechaActual = new Date();

            writer.println("CinemaTracker");
            writer.println("Fecha y hora:\n" + formatter.format(fechaActual));
            writer.println("--------------");

            writer.println("Productos:");
            for (Comida producto : productosSeleccionados) {
                writer.println(producto.getNombreProducto() + " - $" + producto.getPrecio());
            }

            writer.println("--------------");
            writer.println("Total a pagar: $" + total);
            writer.println("Monto pagado: $" + montoPagado);
            writer.println("Cambio: $" + cambio);

            System.out.println("Ticket generado exitosamente. Puede revisar el archivo " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al generar el ticket.");
            e.printStackTrace();
        }
    }


    public String generarNombreFecha() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd_HHmmss");
        Date fechaActual = new Date();
        return formatter.format(fechaActual);
    }
}
