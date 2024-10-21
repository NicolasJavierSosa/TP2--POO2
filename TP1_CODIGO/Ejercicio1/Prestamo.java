package Ejercicio1;

import java.util.Date;

/** Clase prestamo
 * 
 */
public class Prestamo {
    private Libro libro;
    private Date fechaPrestamo;
    private Date fechaDevolucion;

    /**
     * Constructor de la clase
     * @param libro
     * @param fechaPrestamo
     * @param fechaDevolucion
     */
    public Prestamo(Libro libro, Date fechaPrestamo, Date fechaDevolucion) {
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        libro.prestar();
    }

    /**
     * Devuelve un libro
     * @return libro
     */
    public Libro getLibro() {
        return libro;
    }

    /**
     * Devuelve la fecha que se prestó el libro
     * @return fecha de prestamo
     */
    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }
    /**
     * Devuelve la fecha de devolucion
     * @return fecha de devolución
     */

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }
/**
 * devuelve el libro
 */
    public void devolver() {
        libro.devolver();
    }
}
