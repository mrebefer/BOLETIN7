/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maria
 */
public class Libro {

    //atributos
    private String titulo;
    private String autor;
    private int nLibros;
    private int nPrestados;

    //constructores
    public Libro() {
    }

    public Libro(String titulo, String autor, int nLibros, int nPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.nLibros = nLibros;
        this.nPrestados = nPrestados;
    }

    //METODOS DE ACCESO
    //setters y getters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getnLibros() {
        return nLibros;
    }

    public void setnLibros(int nLibros) {
        this.nLibros = nLibros;
    }

    public int getnPrestados() {
        return nPrestados;
    }

    public void setnPrestados(int nPrestados) {
        this.nPrestados = nPrestados;
    }

    public int ejemplaresDisponibles() {
        int nDisponibles = nLibros - nPrestados;
        return nDisponibles;
    }

    //mostrar contenido
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", nLibros="
                + nLibros + ", nPrestados=" + nPrestados + '}';
    }

    //METODOS DE CALCULO
//     incremente o atributo correspondente cada vez que se realice un préstamo do libro. 
//    Non se poderán prestar libros dos que non queden exemplares dispoñibles para prestar.
//            Devolve true se pudo realizar a operación e false en caso contrario.
    public boolean prestamo() {

        if (nLibros > nPrestados) {
            ++nPrestados;
            return true;
        } else {
            return false;
        }
    }

//    decremente o atributo correspondente cando se produza a devolución dun libro.
//            Non se poderán devolver libros que non se prestaron.
//         Devolve true si púidose realizar a operación e false en caso contrario.
    public boolean devolucion() {
        if (nPrestados != 0) {
            --nPrestados;
            return true;
        } else {
            return false;
        }
    }
}
