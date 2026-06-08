/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio_6;

public class EJERCICIO_6 {

    public static void main(String[] args) {
        
        BibliotecaPersonal biblioteca = new BibliotecaPersonal();
        
        // Crear instancias
        Libro   libro1  = new Libro("Los Tres mosqueteros", "Alexandre Dumas",576, 5, Genero.OTROS, 1844);
        Libro   libro2  = new Libro("Principito", "Antoine de Saint-Exupery ",96, 10, Genero.OTROS, 1943);
        Libro   libro3  = new Libro("Cien anios de soledad", "Gabriel Garcia Marquez",496, 5, Genero.NOVELA, 1967);
        Comic   comic1  = new Comic("One Pice", "Eiichiro Oda", 22800, 10,"Eiichiro Oda", false);
        Comic   comic2  = new Comic("Watchmen", "Alan Moore", 416, 10,"Dave Gibbons", true);
        Revista revista1 = new Revista("Genio", "Varios autores",140, 7, 482, Tematica.ACTUALIDAD);
        
        biblioteca.agregarLectura(libro1);
        biblioteca.agregarLectura(libro2);
        biblioteca.agregarLectura(libro3);
        biblioteca.agregarLectura(comic1);
        biblioteca.agregarLectura(comic2);
        biblioteca.agregarLectura(revista1);
        
        System.out.println("\n Resumen:");
        biblioteca.mostrarResumenGeneral();
        
        System.out.println("\n CALIFICACIONES:");
        Lectura mejor = biblioteca.getMayorCalificacion();
        Lectura peor  = biblioteca.getMenorCalificacion();
        System.out.println("Mayor calificacion : " + mejor.getTitulo() + " - " + mejor.getCalificacion() );
        System.out.println("Menor calificacion : " + peor.getTitulo()  + " - " + peor.getCalificacion()  );
        
        System.out.println("\n ELIMINACIONES:");
        biblioteca.eliminarPorTitulo("Los Tres mosqueteros");
        biblioteca.eliminarPorAutor("Alan Moore");
        biblioteca.eliminarPorTitulo("Libro que no existe");
        
        // Resumen final tras eliminaciones
        System.out.println("\n RESUMEN TRAS ELIMINACIONES:");
        biblioteca.mostrarResumenGeneral();
    }
}