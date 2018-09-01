package com.example.katiuskagonzalez.recyclerview;

public class Vehiculos {

    String Nombre;
    String Marca;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public Vehiculos(String nombre, String marca) {
        Nombre = nombre;
        Marca = marca;
    }
}
