package Ejercicio2;

import java.util.Date;
/**
 * Representa una reserva.
 */
class Reserva {

    /**
     * Número de confirmación de la reserva.
     */
    private int numeroConfirmacion;

    /**
     * Fecha de la reserva.
     */
    private Date fechaReserva;

    /**
     * Hora de la reserva.
     */
    private Date horaReserva;

    /**
     * Asiento asignado en la reserva.
     */
    private int asientoAsignado;

    /**
     * Cliente de la reserva.
     */
    private Cliente cliente;

    /**
     * Constructor de la clase Reserva.
     * @param numeroConfirmacion Número de confirmación de la reserva.
     * @param fechaReserva Fecha de la reserva.
     * @param horaReserva Hora de la reserva.
     * @param asientoAsignado Asiento asignado en la reserva.
     * @param cliente Cliente de la reserva.
     */
    public Reserva(int numeroConfirmacion, Date fechaReserva, Date horaReserva, int asientoAsignado, Cliente cliente) {
        this.numeroConfirmacion = numeroConfirmacion;
        this.fechaReserva = fechaReserva;
        this.horaReserva = horaReserva;
        this.asientoAsignado = asientoAsignado;
        this.cliente = cliente;
    }

    /**
     * Devuelve el número de confirmación de la reserva.
     * @return Número de confirmación de la reserva.
     */
    public int getNumeroConfirmacion() {
        return numeroConfirmacion;
    }

    /**
     * Devuelve la fecha de la reserva.
     * @return Fecha de la reserva.
     */
    public Date getFechaReserva() {
        return fechaReserva;
    }

    /**
     * Devuelve la hora de la reserva.
     * @return Hora de la reserva.
     */
    public Date getHoraReserva() {
        return horaReserva;
    }

    /**
     * Devuelve el asiento asignado en la reserva.
     * @return Asiento asignado en la reserva.
     */
    public int getAsientoAsignado() {
        return asientoAsignado;
    }

    /**
     * Devuelve el cliente de la reserva.
     * @return Cliente de la reserva.
     */
    public Cliente getCliente() {
        return cliente;
    }
}