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
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Sala {
    private int numeroSala;
    private int tipoSala;
    private double precioBoleto;
    private boolean[][] asientos;

    public Sala(int numeroSala, int numColumnRow, int tipoSala, double precioBoleto) {
        this.numeroSala = numeroSala;
        this.tipoSala = tipoSala;
        this.precioBoleto = precioBoleto;
        this.asientos = new boolean[numColumnRow][numColumnRow];
        inicializarAsientos();
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public int getTipoSala() {
        return tipoSala;
    }

    public double getPrecioBoleto() {
        return precioBoleto;
    }

    public void mostrarAsientosDisponibles() {
        System.out.println("Estado de los asientos:");
        System.out.print("  "); // Espacio en blanco para alinear con los números de columna

        // Mostrar números de columna
        for (int j = 0; j < asientos[0].length; j++) {
            System.out.print(j + 1 + " ");
        }
        System.out.println(); // Nueva línea después de los números de columna

        // Mostrar filas con letras y estado de los asientos
        for (int i = 0; i < asientos.length; i++) {
            char fila = (char) ('A' + i); // Calcular la letra de la fila
            System.out.print(fila + " "); // Mostrar letra de la fila

            for (int j = 0; j < asientos[i].length; j++) {
                if (asientos[i][j]) {
                    System.out.print("O "); // Asiento libre
                } else {
                    System.out.print("X "); // Asiento ocupado
                }
            }
            System.out.println(); // Nueva línea después de cada fila
        }
    }

    public void venderAsiento() {
        int ventaBoleto = 0; // Variable que guarda cuántos boletos se vendieron para después realizar el cobro.
        double totalVenta = 0.0; // Variable que guarda el total de la venta.

        Scanner scn = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fechaHora = dateFormat.format(new Date());

        System.out.print("Ingrese la fila: ");
        char fila = scn.next().charAt(0);
        System.out.print("Ingrese la columna: ");
        int columna = scn.nextInt();

        int filaIndex = (int) (fila) - 65;
        int columnaIndex = columna - 1;

        if (filaIndex < 0 || filaIndex >= asientos.length || columnaIndex < 0 || columnaIndex >= asientos[0].length) {
            System.out.println("Asiento inválido. Por favor, seleccione un asiento válido.");
        } else if (!asientos[filaIndex][columnaIndex]) {
            System.out.println("El asiento ya ha sido vendido.");
        } else {
            ventaBoleto++;
            asientos[filaIndex][columnaIndex] = false;
            totalVenta += precioBoleto;

            System.out.println("Asiento vendido exitosamente.");
            System.out.println("Total a pagar: " + totalVenta);

            System.out.println("Ingrese el monto recibido del cliente: ");
            double montoRecibido = scn.nextDouble();
            double cambio = montoRecibido - totalVenta;

            System.out.println("Cambio: " + cambio);

            generarTicket(fila, columna, fechaHora, totalVenta);
        }
    }

    private void inicializarAsientos() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                asientos[i][j] = true;
            }
        }
    }

    private void generarTicket(char fila, int columna, String fechaHora, double totalVenta) {
        try {
            FileWriter fileWriter = new FileWriter("ticket.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println("Ticket de compra");
            printWriter.println("----------------");
            printWriter.println("Fecha y hora:\n" + fechaHora);
            printWriter.println("Sala: " + numeroSala);
            printWriter.println("Asiento: " + fila + columna);
            printWriter.println("Total a pagar: " + totalVenta);

            printWriter.close();
            System.out.println("Ticket generado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al generar el ticket: " + e.getMessage());
        }
    }
}

