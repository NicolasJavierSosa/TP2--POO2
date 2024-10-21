package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un avión.
 */
class Avion {

    /**
     * Modelo del avión.
     */
    private String modelo;

    /**
     * Capacidad máxima del avión.
     */
    private int capacidadMaxima;

    /**
     * Lista de vuelos del avión.
     */
    private List<Vuelo> vuelos;

    /**
     * Constructor de la clase Avion.
     * @param modelo Modelo del avión.
     * @param capacidadMaxima Capacidad máxima del avión.
     */
    public Avion(String modelo, int capacidadMaxima) {
        this.modelo = modelo;
        this.capacidadMaxima = capacidadMaxima;
        this.vuelos = new ArrayList<>();
    }

    /**
     * Devuelve el modelo del avión.
     * @return Modelo del avión.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Devuelve la capacidad máxima del avión.
     * @return Capacidad máxima del avión.
     */
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    /**
     * Añade un vuelo a la lista de vuelos del avión.
     * @param vuelo Vuelo a añadir.
     */
    public void addVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
    }

    /**
     * Devuelve la lista de vuelos del avión.
     * @return Lista de vuelos del avión.
     */
    public List<Vuelo> getVuelos() {
        return vuelos;
    }
}
