package ejercicio3;
import java.util.ArrayList;
import java.util.List;
/**
 * Representa un cliente del restaurante.
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
     * Lista de pedidos del cliente.
     */
    private List<Pedido> pedidos;

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
        this.pedidos = new ArrayList<>();
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
     * Añade un pedido a la lista de pedidos del cliente.
     * @param pedido Pedido a añadir.
     */
    public void addPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    /**
     * Devuelve la lista de pedidos del cliente.
     * @return Lista de pedidos del cliente.
     */
    public List<Pedido> getPedidos() {
        return pedidos;
    }
}