package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un cliente.
 */
class Cliente {

    /**
     * DNI del cliente.
     */
    private int DNI;

    /**
     * Nombre del cliente.
     */
    private String nombre;

    /**
     * Apellido del cliente.
     */
    private String apellido;

    /**
     * Lista de reservas del cliente.
     */
    private List<Reserva> reservas;

    /**
     * Constructor de la clase Cliente.
     * @param DNI DNI del cliente.
     * @param nombre Nombre del cliente.
     * @param apellido Apellido del cliente.
     */
    public Cliente(int DNI, String nombre, String apellido) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.reservas = new ArrayList<>();
    }

    /**
     * Devuelve el DNI del cliente.
     * @return DNI del cliente.
     */
    public int getDNI() {
        return DNI;
    }

    /**
     * Devuelve el nombre del cliente.
     * @return Nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el apellido del cliente.
     * @return Apellido del cliente.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Añade una reserva a la lista de reservas del cliente.
     * @param reserva Reserva a añadir.
     */
    public void addReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    /**
     * Devuelve la lista de reservas del cliente.
     * @return Lista de reservas del cliente.
     */
    public List<Reserva> getReservas() {
        return reservas;
    }
}
