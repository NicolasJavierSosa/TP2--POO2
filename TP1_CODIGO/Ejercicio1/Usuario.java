package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a un Usuario
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private List<Prestamo> prestamos;

    /**
     * Constructor de la clase Usuario
     * @param nombre nombre del usuario
     * @param apellido apellido del usuario
     */
    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.prestamos = new ArrayList<>();
    }

    /**
     * Devuelve el nombre del usuario
     * @return nombre de usuario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve su apellido
     * @return apellido del usuario
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Agrega un préstamo a la lista de préstamos del usuario.
     *
     * @param prestamo El préstamo que se desea agregar.
     */
    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    /**
     * Obtiene la lista de préstamos del usuario.
     *
     * @return La lista de préstamos.
     */
    public List<Prestamo> getPrestamos() {
        return prestamos;
    }
}
