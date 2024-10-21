package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un aeropuerto.
 */
public class Aeropuerto {

    /**
     * Código del aeropuerto.
     */
    private String codigo;

    /**
     * Nombre del aeropuerto.
     */
    private String nombre;

    /**
     * Ciudad del aeropuerto.
     */
    private String ciudad;

    /**
     * Lista de vuelos del aeropuerto.
     */
    private List<Vuelo> vuelos;

    /**
     * Lista de aviones del aeropuerto.
     */
    private List<Avion> aviones;

    /**
     * Constructor de la clase Aeropuerto.
     * @param codigo Código del aeropuerto.
     * @param nombre Nombre del aeropuerto.
     * @param ciudad Ciudad del aeropuerto.
     */
    public Aeropuerto(String codigo, String nombre, String ciudad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.vuelos = new ArrayList<>();
        this.aviones = new ArrayList<>();
    }

    /**
     * Devuelve el código del aeropuerto.
     * @return Código del aeropuerto.
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Devuelve el nombre del aeropuerto.
     * @return Nombre del aeropuerto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve la ciudad del aeropuerto.
     * @return Ciudad del aeropuerto.
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Añade un vuelo a la lista de vuelos del aeropuerto.
     * @param vuelo Vuelo a añadir.
     */
    public void addVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
    }

    /**
     * Devuelve la lista de vuelos del aeropuerto.
     * @return Lista de vuelos del aeropuerto.
     */
    public List<Vuelo> getVuelos() {
        return vuelos;
    }

    /**
     * Añade un avión a la lista de aviones del aeropuerto.
     * @param avion Avión a añadir.
     */
    public void addAvion(Avion avion) {
        aviones.add(avion);
    }

    /**
     * Devuelve la lista de aviones del aeropuerto.
     * @return Lista de aviones del aeropuerto.
     */
    public List<Avion> getAviones() {
        return aviones;
    }
}
