
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maria
 */
public class Boletin7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Inicializar objetos
        Libro libro = new Libro();

        //bandera
        System.out.println("Bienvenido al gestor de biblioteca.");

        int opcion;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    //MOSTRAR DATOS DE UN LIBRO
                    libro.toString();
                    break;
                case 2:
                    //PRESTAR LIBRO
                    libro.prestamo();
                    break;
                case 3:
                    //DEVOLVER LIBRO
                    libro.devolucion();
                    break;

                case 0:
                    System.out.println("\n\t Gracias por usar el getor de biblioteca.");
                    break;
                default:
                    System.out.println("La operación elegida no existe.");
                    break;
            }
        } while (opcion != 0);

    }

    private static int menu() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nQue operación desea realizar:"
                + "\n1=> Mostrar datos de un libro."
                + "\n2=> Prestamo de libro"
                + "\n3=> Devulución de libro"
                + "\n0=>Salir");

        return Integer.parseInt(teclado.nextLine());
    }

}
