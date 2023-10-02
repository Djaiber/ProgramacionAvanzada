/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author JAIBER DÌAZ
 */
public class Fuerza extends Rutina {

  

    // Ejercicio 1: Press de Banca (series, repeticiones)
    public int pressDeBanca(int series, int repeticiones) {
        int tiempoPorRepeticion = 3; // segundos por repetición
        int duracion = series * repeticiones * tiempoPorRepeticion;
        return duracion;
    }

    // Ejercicio 2: Sentadillas (series, repeticiones)
    public int sentadillas(int series, int repeticiones) {
        int tiempoPorRepeticion = 2; // segundos por repetición
        int duracion = series * repeticiones * tiempoPorRepeticion;
        return duracion;
    }

    // Ejercicio 3: Flexiones de pecho (series, repeticiones)
    public int flexionesDePecho(int series, int repeticiones) {
        int tiempoPorRepeticion = 3; // segundos por repetición
        int duracion = series * repeticiones * tiempoPorRepeticion;
        return duracion;
    }

    // Ejercicio 4: Plancha (series, segundos)
    public int plancha(int series, int segundos) {
        int duracion = series * segundos;
        return duracion;
    }

    // Ejercicio 5: Prensa de piernas (series, repeticiones)
    public int prensaDePiernas(int series, int repeticiones) {
        int tiempoPorRepeticion = 2; // segundos por repetición
        int duracion = series * repeticiones * tiempoPorRepeticion;
        return duracion;
    }

    // Ejercicio 6: Curl de bíceps (series, repeticiones)
    public int curlDeBiceps(int series, int repeticiones) {
        int tiempoPorRepeticion = 2; // segundos por repetición
        int duracion = series * repeticiones * tiempoPorRepeticion;
        return duracion;
    }

    // Ejercicio 7: Press de hombros (series, repeticiones)
    public int pressDeHombros(int series, int repeticiones) {
        int tiempoPorRepeticion = 3; // segundos por repetición
        int duracion = series * repeticiones * tiempoPorRepeticion;
        return duracion;
    }

    // Ejercicio 8: Pull-ups (series, repeticiones)
    public int pullUps(int series, int repeticiones) {
        int tiempoPorRepeticion = 2; // segundos por repetición
        int duracion = series * repeticiones * tiempoPorRepeticion;
        return duracion;
    }

    // Ejercicio 9: Deadlift (series, repeticiones)
    public int deadlift(int series, int repeticiones) {
        int tiempoPorRepeticion = 4; // segundos por repetición
        int duracion = series * repeticiones * tiempoPorRepeticion;
        return duracion;
    }

    // Ejercicio 10: Russian twists (series, repeticiones)
    public int russianTwists(int series, int repeticiones) {
        int tiempoPorRepeticion = 2; // segundos por repetición
        int duracion = series * repeticiones * tiempoPorRepeticion;
        return duracion;
    }
}
