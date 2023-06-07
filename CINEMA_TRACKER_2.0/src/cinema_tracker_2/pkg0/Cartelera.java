/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema_tracker_2.pkg0;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Cartelera {
    protected List<Pelicula> cartelera;

    public Cartelera() {
        cartelera = new ArrayList<>();
    }

    public List<Pelicula> getCartelera() {
        return cartelera;
    }
    
    public void agregarPelicula(){
        while(true){
            Scanner scn = new Scanner(System.in);
            
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");//simular que se limpia la pantalla
            System.out.print("Ingresa el nombre de la pelicula: ");
            String nombrePelicula = scn.nextLine();
            System.out.print("Ingresa el genero de la pelicula: ");
            String genero = scn.nextLine();
            System.out.print("Ingresa la clasificacion de edad: ");
            String clasificacion = scn.nextLine();
            System.out.print("Ingresa el idioma: ");
            String idioma = scn.nextLine();
                            
            int duracion;
            while (true) {
                try {
                    System.out.print("Ingresa la duracion en minutos de la pelicula: ");
                    duracion = Integer.parseInt(scn.next());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Duración inválida. Por favor, ingrese un valor numérico válido.");
                    continue;
                }
            }
            
            
            Pelicula peli = new Pelicula(nombrePelicula, genero, clasificacion, idioma, duracion);
            cartelera.add(peli);

            guardarPeliculas("Cartelera.txt");
            System.out.println("Deseas ingresar otra pelicula?  Si(1)    No (0)");
            int KeepGoing = scn.nextInt();
            if(KeepGoing != 1)
                break;
        }
    }
    
    
        
    public void guardarPeliculas(String nombreArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            writer.write("Lista de películas:\n");
            if (cartelera.isEmpty()) {
                writer.write("No hay películas disponibles.");
            } else {
                for (Pelicula i : cartelera) {
                    writer.write("Nombre: " + i.getNombrePelicula() + "\n");
                    writer.write("Género: " + i.getGenero() + "\n");
                    writer.write("Clasificación: " + i.getClasificacion() + "\n");
                    writer.write("Idioma: " + i.getIdioma() + "\n");
                    writer.write("Duración: " + i.getDuracion() + " minutos\n");
                    writer.write("--------------------\n");
                }
            }
            System.out.println("Archivo guardado exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }
}
