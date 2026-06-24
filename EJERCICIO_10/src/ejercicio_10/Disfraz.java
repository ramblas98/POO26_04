/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package ejercicio_10;

public class Disfraz implements Rentable {
    private String personaje;
    private char   talle;      // 'S', 'M', 'L', 'X' (XL)
    private int    dias;       // días del período de alquiler estándar
    private double precio;     // precio por el período

    public Disfraz() {
    }

    public Disfraz(String personaje, char talle, int dias, double precio) {
        this.personaje = personaje;
        this.talle = talle;
        this.dias = dias;
        this.precio = precio;
    }
    
    // Getters y Setters
 
    public String getPersonaje()              { return personaje; }
    public void   setPersonaje(String p)      { this.personaje = p; }
 
    public char   getTalle()                  { return talle; }
    public void   setTalle(char t)            { this.talle = t; }
 
    public int    getDias()                   { return dias; }
    public void   setDias(int d)              { this.dias = d; }
 
    public double getPrecio()                 { return precio; }
    public void   setPrecio(double p)         { this.precio = p; }
 
    // Implementación de Rentable ─────────────────────────────────────────

     /* Alquila el disfraz por una cantidad de DÍAS.
     * Solo se puede alquilar si está disponible.
     * @param periodo cantidad de días del alquiler
     */
    @Override
    public void alquilar(int periodo) {
        if (alquilado()) {
            System.out.println("  [!] El disfraz de " + personaje + " ya esta alquilado.");
        } else {
            this.dias = periodo;
            System.out.println("  [OK] Disfraz de " + personaje
                    + " (talle " + talle + ") alquilado por " + periodo + " dia(s). $" + precio + ".");
        }
    }
 
    // @return true si el disfraz tiene un alquiler activo
    @Override
    public boolean alquilado() {
        return this.dias > 0;
    }
 
    
    // Libera el disfraz para que pueda alquilarse nuevamente.
    @Override
    public void desocupar() {
        if (!alquilado()) {
            System.out.println("  [!] El disfraz de " + personaje + " ya estaba disponible.");
        } else {
            System.out.println("  [OK] Disfraz de " + personaje + " devuelto. Disponible nuevamente.");
            this.dias = 0;
        }
    }
 
    // toString 
    @Override
    public String toString() {
        return "Disfraz { " + personaje + " | Talle: " + talle
             + " | $" + precio + " x " + dias + " dia(s)"
             + " | Estado: " + (alquilado() ? "ALQUILADO (" + this.dias + " dia/s)" : "LIBRE") + " }";
    }
}
