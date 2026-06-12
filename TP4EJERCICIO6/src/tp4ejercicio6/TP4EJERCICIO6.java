/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4ejercicio6;

/**
 *
 * @author Pc
 */
public class TP4EJERCICIO6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
        BibliotecaPersonal b = new BibliotecaPersonal();
        
        Lectura libro1 = new Libro("LIBRO 1","AutorLibro1",545, 8, Genero.NOVELA, 1855 );
        Lectura libro2= new Libro("LIBRO 2","AutorLibro2",298, 5, Genero.ENSAYO, 1925);
        Lectura libro3= new Libro("LIBRO 3","AutorLibro3",793, 10, Genero.CIENCIA_FICCION, 2025);
        
        Lectura comic1 = new Comic("COMIC 1","AutorComic1",57, 7, "DibujanteComic1", true);
        Lectura comic2 = new Comic("COMIC 2","AutorComic2",80, 4, "DibujanteComic2", false);
        Lectura comic3 = new Comic("COMIC 3","AutorComic3",25, 8, "DibujanteComic3", false);
        
        Lectura revista1 = new Revista("REVISTA 1","AutorRevista1",101, 7, 1, Tematica.MODA);
        Lectura revista2 = new Revista("REVISTA 2","OtroAutor",120, 2, 3, Tematica.ACTUALIDAD);
        Lectura revista3 = new Revista("REVISTA 3","OtroAutor",60, 9, 2, Tematica.CIENCIA);
        
        b.agregarLectura(libro1);
        b.agregarLectura(libro2);
        b.agregarLectura(libro3);
        b.agregarLectura(comic1);
        b.agregarLectura(comic2);
        b.agregarLectura(comic3);
        b.agregarLectura(revista1);
        b.agregarLectura(revista2);
        b.agregarLectura(revista3);
        
        b.mostrarResumen();
        
        System.out.println("\nTiempo de lectura estimado de: "+ libro1.getTitulo() +": "+ libro1.tiempoEstimadoLectura()+" horas"); 
        System.out.println("\nTiempo de lectura estimado de: "+ libro2.getTitulo() +": "+ libro2.tiempoEstimadoLectura()+" horas");
        System.out.println("\nTiempo de lectura estimado de: "+ libro3.getTitulo() +": "+ libro3.tiempoEstimadoLectura()+" horas");
        
        
        System.out.println("\nTiempo total de lectura estimado: " + b.tiempoTotalEstimado() +" horas");
        b.eliminarObraPorTitulo("LIBRO 3");
        b.eliminarObraPorTitulo("El Principito");
        b.eliminarObraPorAutor("AutorComic2");
        b.eliminarObraPorAutor("OtroAutor");
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\nLectura con mayor clasificacion: " + b.obtenerLecturaMayor().resumen());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\nLectura con menor clasificacion: " + b.obtenerLecturaMenor().resumen());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        System.out.println("Resumen despues de eliminar obras: ");
        b.mostrarResumen();
       // b.agregarLectura(libro1);
//System.out.println("Tiempo total de lectura estimado despues de eliminar lectura: " + b.tiempoTotalEstimado() +" horas");
    }   
}
