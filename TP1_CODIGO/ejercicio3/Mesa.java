package ejercicio3;

/**
 * Representa una mesa del restaurante.
 */
class Mesa {

    /**
     * Número de la mesa.
     */
    private int numeroMesa;

    /**
     * Estado de la mesa.
     */
    private String estado;

    /**
     * Constructor de la clase Mesa.
     * @param numeroMesa Número de la mesa.
     * @param estado Estado de la mesa.
     */
    public Mesa(int numeroMesa, String estado) {
        this.numeroMesa = numeroMesa;
        this.estado = estado;
    }

    /**
     * Devuelve el número de la mesa.
     * @return Número de la mesa.
     */
    public int getNumeroMesa() {
        return numeroMesa;
    }

    /**
     * Devuelve el estado de la mesa.
     * @return Estado de la mesa.
     */
    public String getEstado() {
        return estado;
    }
}

