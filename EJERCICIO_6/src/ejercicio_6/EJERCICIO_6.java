/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Hp
 */
public class EJERCICIO_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BibliotecaPersonal biblioteca = new BibliotecaPersonal();
 
        // Crear instancias 
        Libro   libro1  = new Libro("Cien anios de soledad", "Gabriel Garcia Marquez",
                                    471, 9.5, "Realismo magico", 1967);
        Libro   libro2  = new Libro("El Problema de los Tres Cuerpos", "Liu Cixin",
                                    480, 8.8, "Ciencia ficcion", 2008);
        Comic   comic1  = new Comic("Maus", "Art Spiegelman", 296, 9.2,
                                    "Art Spiegelman", false);
        Comic   comic2  = new Comic("Watchmen", "Alan Moore", 416, 9.0,
                                    "Dave Gibbons", false);
        Revista revista = new Revista("National Geographic", "Varios autores",
                                      140, 7.5, 482, "Ciencia y naturaleza");
 
        // 1. Agregar lecturas 
        System.out.println(" Agregar ");
        biblioteca.agregar(libro1);
        biblioteca.agregar(libro2);
        biblioteca.agregar(comic1);
        biblioteca.agregar(comic2);
        biblioteca.agregar(revista);
        // Intento duplicado
        biblioteca.agregar(new Libro("Maus", "otro", 100, 5.0, "Drama", 2020));
 
        // 4. Resumen general
        System.out.println("\n── Resumen general");
        biblioteca.mostrarResumenGeneral();
 
        // 3. Mayor y menor calificacion
        System.out.println("── Calificaciones extremas ");
        Lectura mejor = biblioteca.getMayorCalificacion();
        Lectura peor  = biblioteca.getMenorCalificacion();
        System.out.println(" Mayor calificacion: " + (mejor != null ? mejor.resumen() : "-"));
        System.out.println(" Menor calificacion: " + (peor  != null ? peor.resumen()  : "-"));
 
        // ── 5. Tiempo total 
        System.out.println("\n── Tiempo total estimado");
        System.out.println("Horas totales: " + biblioteca.tiempoTotalEstimado() + " h");
 
        // ── 2. Eliminar 
        System.out.println("\n── Eliminar por titulo ");
        boolean eliminado = biblioteca.eliminarPorTitulo("Watchmen");
        System.out.println("¿Watchmen eliminado? " + eliminado);
 
        System.out.println("\n── Eliminar por autor ");
        int cantidad = biblioteca.eliminarPorAutor("Art Spiegelman");
        System.out.println("Obras eliminadas de Art Spiegelman: " + cantidad);
 
        System.out.println("\n── Biblioteca tras eliminaciones ");
        biblioteca.mostrarResumenGeneral();
        System.out.println("Tiempo total actualizado: " + biblioteca.tiempoTotalEstimado() + " h");
    }
    
}
