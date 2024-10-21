package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una aerolínea.
 */
class Aerolineas {

    /**
     * Código de la aerolínea.
     */
    private String codigo;

    /**
     * Nombre de la aerolínea.
     */
    private String nombre;

    /**
     * Lista de vuelos de la aerolínea.
     */
    private List<Vuelo> vuelos;

    /**
     * Constructor de la clase Aerolineas.
     * @param codigo Código de la aerolínea.
     * @param nombre Nombre de la aerolínea.
     */
    public Aerolineas(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.vuelos = new ArrayList<>();
    }

    /**
     * Devuelve el código de la aerolínea.
     * @return Código de la aerolínea.
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Devuelve el nombre de la aerolínea.
     * @return Nombre de la aerolínea.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Añade un vuelo a la lista de vuelos de la aerolínea.
     * @param vuelo Vuelo a añadir.
     */
    public void addVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
    }

    /**
     * Devuelve la lista de vuelos de la aerolínea.
     * @return Lista de vuelos de la aerolínea.
     */
    public List<Vuelo> getVuelos() {
        return vuelos;
    }
}
