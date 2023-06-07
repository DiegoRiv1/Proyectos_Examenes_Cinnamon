/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema_tracker_2.pkg0;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Cine extends Cartelera {

    private List<Funcion> lis_funciones;
    private List<Sala> lis_Salas;

    public Cine() {
        lis_funciones = new ArrayList<>();
        lis_Salas = new ArrayList<>();
    }

    public List<Funcion> getLis_funciones() {
        return lis_funciones;
    }

    public List<Sala> getLis_Salas() {
        return lis_Salas;
    }

    public void agregarSala() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            //int numeroSala, int numColumnRow, boolean esVIP, double precioBoleto
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.print("Ingresa el numero de la sala: ");
            int numeroSala = sc.nextInt();
            System.out.println("Ingresa el numero de filas/columnas: ");
            int numColumnRow = sc.nextInt();
            System.out.println("Ingresa (1) si la sala es VIP y un (2) si la sala es estándar: ");
            int tipoSala = sc.nextInt();
            System.out.println("Ingresa el precio por boleto en la sala: ");
            double precioBoleto = sc.nextDouble();

            Sala sala = new Sala(numeroSala, numColumnRow, tipoSala, precioBoleto);
            lis_Salas.add(sala);

            System.out.println("Quieres ingresar otra sala? Si(1)   No(0)");
            int keepGoing = sc.nextInt();
            if (keepGoing != 1) {
                break;
            }
        }

    }

    public void programarFuncion() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Películas disponibles en cartelera:");
        for (int i = 0; i < cartelera.size(); i++) {
            System.out.println((i + 1) + ". " + cartelera.get(i).getNombrePelicula());
        }

        System.out.print("Selecciona el número de la película para programar la función: ");
        int peliculaIndex = sc.nextInt();

        System.out.println("Salas disponibles:");
        for (int i = 0; i < lis_Salas.size(); i++) {
            System.out.println((i + 1) + ". Sala " + lis_Salas.get(i).getNumeroSala());
        }

        System.out.print("Selecciona el número de la sala para programar la función: ");
        int salaIndex = sc.nextInt();
        Sala salaSeleccionada = lis_Salas.get(salaIndex - 1);

        System.out.print("Ingresa la fecha y hora de la función (formato: dd/MM/yyyy HH:mm): ");
        String fechaHoraStr = sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date fechaHora;
        try {
            fechaHora = dateFormat.parse(fechaHoraStr);
        } catch (ParseException e) {
            System.out.println("Formato de fecha y hora inválido. La función no ha sido programada.");
            return;
        }

        Pelicula peliculaSeleccionada = cartelera.get(peliculaIndex - 1);

        Funcion funcion = new Funcion(peliculaSeleccionada, salaSeleccionada, fechaHora);
        lis_funciones.add(funcion);

        System.out.println("Función programada exitosamente.");
    }

    public void seleccionarFuncion() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Funciones disponibles:");
        for (int i = 0; i < lis_funciones.size(); i++) {
            Funcion funcion = lis_funciones.get(i);
            System.out.println((i + 1) + ". Película: " + funcion.getPelicula().getNombrePelicula());
            System.out.println("   Sala: " + funcion.getSala().getNumeroSala());
            System.out.println("   Horario: " + funcion.getHorario());
            System.out.println("--------------------");
        }

        System.out.print("Selecciona el número de la función: ");
        int funcionIndex = sc.nextInt();
        Funcion funcionSeleccionada = lis_funciones.get(funcionIndex - 1);

        //int boletosVendidos = funcionSeleccionada.getSala().venderAsiento();
        //double totalVenta = boletosVendidos * funcionSeleccionada.getSala().getPrecioBoleto();
        //System.out.println("Boletos vendidos: " + boletosVendidos);
        //System.out.println("Total de venta: " + totalVenta);
    }

}
