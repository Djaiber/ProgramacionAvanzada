/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author JAIBER DÌAZ
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;
public class Rutina {
    private String objetivo;
    private int dias;
    private int duracion;
    private int tiempoTotal;

 
    // Define listas de ejercicios para cada objetivo
    private List<String> ejerciciosCardio = new ArrayList<>();
    private List<String> ejerciciosFuerza = new ArrayList<>();
    private List<String> ejerciciosFlexibilidad = new ArrayList<>();

    {
        // Agrega ejercicios a las listas correspondientes
        // Ejercicios de cardio
        ejerciciosCardio.add("correr");
        ejerciciosCardio.add("saltarlaCuerda");
        ejerciciosCardio.add("ciclismo");
        ejerciciosCardio.add("natacion");
        ejerciciosCardio.add("zumba");
        ejerciciosCardio.add("escaleras");
        ejerciciosCardio.add("saltosDeTijera");
        ejerciciosCardio.add("entrenamientoEnIntervalos");
        ejerciciosCardio.add("spinning");
        ejerciciosCardio.add("boxeo");

        // Ejercicios de fuerza
        ejerciciosFuerza.add("pressDeBanca");
        ejerciciosFuerza.add("sentadillas");
        ejerciciosFuerza.add("flexionesDePecho");
        ejerciciosFuerza.add("plancha");
        ejerciciosFuerza.add("prensaDePiernas");
        ejerciciosFuerza.add("curlDeBiceps");
        ejerciciosFuerza.add("pressDeHombros");
        ejerciciosFuerza.add("pullUps");
        ejerciciosFuerza.add("deadlift");
        ejerciciosFuerza.add("russianTwists");

        // Ejercicios de flexibilidad
        ejerciciosFlexibilidad.add("estiramientoDePiernas");
        ejerciciosFlexibilidad.add("estiramientoDeEspalda");
        ejerciciosFlexibilidad.add("estiramientoDeCuello");
        ejerciciosFlexibilidad.add("estiramientoDeHombros");
        ejerciciosFlexibilidad.add("estiramientoDeBrazos");
        ejerciciosFlexibilidad.add("estiramientoDeTobillos");
        ejerciciosFlexibilidad.add("estiramientoDeCadera");
        ejerciciosFlexibilidad.add("estiramientoDeAbdomen");
        ejerciciosFlexibilidad.add("estiramientoDeMunecas");
        ejerciciosFlexibilidad.add("estiramientoDeDedos");
    }

    public List<String> generarRutinaAleatoria() {
        Random random = new Random();
        List<String> ejerciciosSeleccionados = new ArrayList<>();

        // Selecciona aleatoriamente 5 ejercicios según el objetivo
        List<String> listaEjercicios = null;
        switch (objetivo) {
            case "cardio":
                listaEjercicios = ejerciciosCardio;
                break;
            case "fuerza":
                listaEjercicios = ejerciciosFuerza;
                break;
            case "flexibilidad":
                listaEjercicios = ejerciciosFlexibilidad;
                break;
            default:
                System.out.println("Objetivo no válido.");
               
        }

        if (listaEjercicios != null) {
            for (int i = 0; i < 5; i++) {
                int index = random.nextInt(listaEjercicios.size());
                ejerciciosSeleccionados.add(listaEjercicios.get(index));
            }
        }

        // Calcula el tiempo total de la rutina
        // Supongamos que cada ejercicio dura "duracion" minutos

       
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". " + ejerciciosSeleccionados.get(i));
        }
       return ejerciciosSeleccionados;
    }
public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void setTiempoTotal(int tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
    }

    public List<String> getEjerciciosCardio() {
        return ejerciciosCardio;
    }

    public void setEjerciciosCardio(List<String> ejerciciosCardio) {
        this.ejerciciosCardio = ejerciciosCardio;
    }

    public List<String> getEjerciciosFuerza() {
        return ejerciciosFuerza;
    }

    public void setEjerciciosFuerza(List<String> ejerciciosFuerza) {
        this.ejerciciosFuerza = ejerciciosFuerza;
    }

    public List<String> getEjerciciosFlexibilidad() {
        return ejerciciosFlexibilidad;
    }

    public void setEjerciciosFlexibilidad(List<String> ejerciciosFlexibilidad) {
        this.ejerciciosFlexibilidad = ejerciciosFlexibilidad;
    }
      
    public List<String> getRandom5Ejercicios(String objetivo) {
         // Copy the original list
         List<String> random5Exercises = new ArrayList<>();
         switch (objetivo) {
            case "Cardio":
                random5Exercises = new ArrayList<>(ejerciciosCardio);
                break;
            case "Ganar Peso":
                random5Exercises = new ArrayList<>(ejerciciosFuerza);
                break;
            case "Ganar Flexibilidad":
                random5Exercises = new ArrayList<>(ejerciciosFlexibilidad);
                break;
            default:
                // Handle invalid objective
                System.out.println("Objetivo no válido");
                break;
        }
        // Shuffle the copied list
        Collections.shuffle(random5Exercises);

        // Limit the number of exercises to 5 or the size of the list, whichever is smaller
        int numberOfExercisesToShow = Math.min(5, random5Exercises.size());

        for (int i = 0; i < numberOfExercisesToShow; i++) {
            String exercise = random5Exercises.get(i);
            random5Exercises.set(i, "Exercise " + (i + 1) + ": " + exercise);
        }

        return random5Exercises.subList(0, numberOfExercisesToShow);
    }

}



