package ejercicio3;

/**
 * Representa un plato del restaurante.
 */
class Plato {

    /**
     * Nombre del plato.
     */
    private String nombre;

    /**
     * Precio del plato.
     */
    private double precio;

    /**
     * Categoría del plato.
     */
    private String categoria;

    /**
     * Constructor de la clase Plato.
     * @param nombre Nombre del plato.
     * @param precio Precio del plato.
     * @param categoria Categoría del plato.
     */
    public Plato(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    /**
     * Devuelve el nombre del plato.
     * @return Nombre del plato.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el precio del plato.
     * @return Precio del plato.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Devuelve la categoría del plato.
     * @return Categoría del plato.
     */
    public String getCategoria() {
        return categoria;
    }
}