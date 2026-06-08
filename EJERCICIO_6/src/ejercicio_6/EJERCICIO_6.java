/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio_6;

public class EJERCICIO_6 {

    public static void main(String[] args) {
        
        BibliotecaPersonal biblioteca = new BibliotecaPersonal();
 
        // ── Crear instancias ─────────────────────────────────────────────────
        Libro   libro1  = new Libro("Los Tres mosqueteros", "Gabriel García Márquez",471, 9, "Realismo mágico", 1967);
        Libro   libro2  = new Libro("Principito", "Luis ",480, 8, "", 2008);
        Comic   comic1  = new Comic("Une Pice", "Art Spiegelman", 296, 9,"Art Spiegelman", false);
        Comic   comic2  = new Comic("", "Alan Moore", 416, 9,"Dave Gibbons", false);
        Revista revista1 = new Revista("Genio", "Varios autores",140, 7, 482, "Ciencia y naturaleza");
    }
    
}
