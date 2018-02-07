package com.example.u2_controlesejerciciojugador;

/**
 * Created by Vicente FN on 07/02/2018.
 */

public class Jugador {

    //Atributos
    String nombre;
    int dorsal;
    String posicion;
    boolean tieneMundial;


    //Constructor


    public Jugador(String nombre, int dorsal, String posicion, boolean tieneMundial) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.posicion = posicion;
        this.tieneMundial = tieneMundial;
    }


    //Getters & Setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public boolean isTieneMundial() {
        return tieneMundial;
    }

    public void setTieneMundial(boolean tieneMundial) {
        this.tieneMundial = tieneMundial;
    }
}
