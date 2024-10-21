package ejercicio3;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa un restaurante.
 */
public class Restaurante {

    /**
     * Nombre del restaurante.
     */
    private String nombre;

    /**
     * Lista de platos del restaurante.
     */
    private List<Plato> platos;

    /**
     * Lista de mesas del restaurante.
     */
    private List<Mesa> mesas;

    /**
     * Constructor de la clase Restaurante.
     * @param nombre Nombre del restaurante.
     */
    public Restaurante(String nombre) {
        this.nombre = nombre;
        this.platos = new ArrayList<>();
        this.mesas = new ArrayList<>();
    }

    /**
     * Devuelve el nombre del restaurante.
     * @return Nombre del restaurante.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Añade un plato a la lista de platos del restaurante.
     * @param plato Plato a añadir.
     */
    public void addPlato(Plato plato) {
        platos.add(plato);
    }

    /**
     * Devuelve la lista de platos del restaurante.
     * @return Lista de platos del restaurante.
     */
    public List<Plato> getPlatos() {
        return platos;
    }

    /**
     * Añade una mesa a la lista de mesas del restaurante.
     * @param mesa Mesa a añadir.
     */
    public void addMesa(Mesa mesa) {
        mesas.add(mesa);
    }

    /**
     * Devuelve la lista de mesas del restaurante.
     * @return Lista de mesas del restaurante.
     */
    public List<Mesa> getMesas() {
        return mesas;
    }
}