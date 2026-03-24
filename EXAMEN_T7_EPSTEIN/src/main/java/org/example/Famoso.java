package org.example;

public class Famoso {
    private String nombre;
    private String pais;
    private String profesion;
    private int edad;

    public Famoso(String nombre, String pais, String profesion, int edad) {
        this.nombre = nombre;
        this.pais = pais;
        this.profesion = profesion;
        this. edad = edad;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getProfesion() {
        return profesion;
    }

    @Override
    public String toString() {
        return "Famoso{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", profesion='" + profesion + '\'' +
                ", edad=" + edad +
                '}';
    }
}
