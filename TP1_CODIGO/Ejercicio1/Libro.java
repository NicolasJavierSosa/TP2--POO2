package Ejercicio1;

/**
 * Representa un libro
 */
public class Libro {
    private String titulo;
    private Autor autor;
    private int nroPaginas;
    private Estado estado;

    /**
     * Constructor de la clase Libro
     * @param titulo el titulo del libro
     * @param autor autor del libro
     * @param nroPaginas nro de páginas del libro
     */
    public Libro(String titulo, Autor autor, int nroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.nroPaginas = nroPaginas;
        this.estado = Estado.DISPONIBLE;
    }

    /**
     * Devuelve un titulo
     * @return titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Devuelve un autor
     * @return autor
     */
    public Autor getAutor() {
        return autor;
    }

    /**
     * Devuelve el nro de páginas
     * @return nrode páginas
     */
    public int getNroPaginas() {
        return nroPaginas;
    }

    /**
     * Devuelve el estado
     * @return estado
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * Cambia el estado del libro de disponible a prestado
     */
    public void prestar() {
        if (estado == Estado.DISPONIBLE) {
            estado = Estado.PRESTADO;
        }
    }

    /**
     * Cambia el estado del libro de prestado a disponible
     */
    public void devolver() {
        if (estado == Estado.PRESTADO) {
            estado = Estado.DISPONIBLE;
        }
    }
}
/**
 * Representa los posibles estados que puede tener un libro
 */
enum Estado {
    DISPONIBLE,
    PRESTADO
}

