package ejercicio3;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa un pedido del restaurante.
 */
class Pedido {

    /**
     * Número de pedido.
     */
    private int numeroPedido;

    /**
     * Estado del pedido.
     */
    private String estado;

    /**
     * Hora de creación del pedido.
     */
    private String horaCreacion;

    /**
     * Mesa a la que pertenece el pedido.
     */
    private Mesa mesa;

    /**
     * Lista de platos del pedido.
     */
    private List<Plato> platos;

    /**
     * Constructor de la clase Pedido.
     * @param numeroPedido Número de pedido.
     * @param estado Estado del pedido.
     * @param horaCreacion Hora de creación del pedido.
     * @param mesa Mesa a la que pertenece el pedido.
     */
    public Pedido(int numeroPedido, String estado, String horaCreacion, Mesa mesa) {
        this.numeroPedido = numeroPedido;
        this.estado = estado;
        this.horaCreacion = horaCreacion;
        this.mesa = mesa;
        this.platos = new ArrayList<>();
    }

    /**
     * Devuelve el número de pedido.
     * @return Número de pedido.
     */
    public int getNumeroPedido() {
        return numeroPedido;
    }

    /**
     * Devuelve el estado del pedido.
     * @return Estado del pedido.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Devuelve la hora de creación del pedido.
     * @return Hora de creación del pedido.
     */
    public String getHoraCreacion() {
        return horaCreacion;
    }

    /**
     * Devuelve la mesa a la que pertenece el pedido.
     * @return Mesa a la que pertenece el pedido.
     */
    public Mesa getMesa() {
        return mesa;
    }

    /**
     * Añade un plato al pedido.
     * @param plato Plato a añadir.
     */
    public void addPlato(Plato plato) {
        platos.add(plato);
    }

    /**
     * Devuelve la lista de platos del pedido.
     * @return Lista de platos del pedido.
     */
    public List<Plato> getPlatos() {
        return platos;
    }
}