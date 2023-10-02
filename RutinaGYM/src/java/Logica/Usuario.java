/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author JAIBER DÌAZ
 */
public class Usuario {

    private String nombreUsuario;
    private String numeroCelular;
    private String correoUsuario;
    private String sexo;
    private String edadUsuario;
    private int objetivo;
    private float estatura;
    private int peso;

    private float imc;


  

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEdadUsuario() {
        return edadUsuario + " Años";
    }

    public void setEdadUsuario(String edadUsuario) {
        this.edadUsuario = edadUsuario;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
        System.out.println("");
    }

    public String getImc() {
        return "El imc del usuario es: " + imc;
    }

    public void setImc(float estatura, int peso) {
        this.imc = peso/(estatura*estatura);

    }

    public int getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(int objetivo) {
        this.objetivo = objetivo;
    }
}

