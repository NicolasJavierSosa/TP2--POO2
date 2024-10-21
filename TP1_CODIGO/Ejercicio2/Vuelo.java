package Ejercicio2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * Representa un vuelo.
 */
class Vuelo {

    /**
     * Número de vuelo.
     */
    private int numeroVuelo;

    /**
     * Fecha de llegada del vuelo.
     */
    private Date fechaLlegado;

    /**
     * Hora de llegada del vuelo.
     */
    private Date horaLlegado;

    /**
     * Fecha de salida del vuelo.
     */
    private Date fechaSalida;

    /**
     * Hora de salida del vuelo.
     */
    private Date horaSalida;

    /**
     * Aerolínea del vuelo.
     */
    private Aerolineas aerolineas;

    /**
     * Lista de clientes del vuelo.
     */
    private List<Cliente> clientes;

    /**
     * Constructor de la clase Vuelo.
     * @param numeroVuelo Número de vuelo.
     * @param fechaLlegado Fecha de llegada del vuelo.
     * @param horaLlegado Hora de llegada del vuelo.
     * @param fechaSalida Fecha de salida del vuelo.
     * @param horaSalida Hora de salida del vuelo.
     * @param aerolineas Aerolínea del vuelo.
     */
    public Vuelo(int numeroVuelo, Date fechaLlegado, Date horaLlegado, Date fechaSalida, Date horaSalida, Aerolineas aerolineas) {
        this.numeroVuelo = numeroVuelo;
        this.fechaLlegado = fechaLlegado;
        this.horaLlegado = horaLlegado;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
        this.aerolineas = aerolineas;
        this.clientes = new ArrayList<>();
    }

    /**
     * Devuelve el número de vuelo.
     * @return Número de vuelo.
     */
    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    /**
     * Devuelve la fecha de llegada del vuelo.
     * @return Fecha de llegada del vuelo.
     */
    public Date getFechaLlegado() {
        return fechaLlegado;
    }

    /**
     * Devuelve la hora de llegada del vuelo.
     * @return Hora de llegada del vuelo.
     */
    public Date getHoraLlegado() {
        return horaLlegado;
    }

    /**
     * Devuelve la fecha de salida del vuelo.
     * @return Fecha de salida del vuelo.
     */
    public Date getFechaSalida() {
        return fechaSalida;
    }

    /**
     * Devuelve la hora de salida del vuelo.
     * @return Hora de salida del vuelo.
     */
    public Date getHoraSalida() {
        return horaSalida;
    }

    /**
     * Devuelve la aerolínea del vuelo.
     * @return Aerolínea del vuelo.
     */
    public Aerolineas getAerolineas() {
        return aerolineas;
    }

    /**
     * Añade un cliente a la lista de clientes del vuelo.
     * @param cliente Cliente a añadir.
     */
    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    /**
     * Devuelve la lista de clientes del vuelo.
     * @return Lista de clientes del vuelo.
     */
    public List<Cliente> getClientes() {
        return clientes;
    }
}
