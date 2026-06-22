package ejercicio_10;

public class Disfraz implements Rentable{
    private String personaje;
    private char talle;
    private int dias;
    private double precio;

    @Override
    public void alquilar(int periodo) {
        this.dias = periodo;
    }

    @Override
    public boolean alquilado() {
        return this.dias > 0;
    }

    @Override
    public void desocupar() {
        this.dias = 0;
    }

    public Disfraz(){
        this.personaje = "Goku";
        this.talle = 'M';
        this.precio = 10000.101;
        this.dias = 0;
    }

    public Disfraz(String personaje, char talle, double precio){
        this.personaje = personaje;
        this.talle = talle;
        this.precio = precio;
        this.dias = 0;
    }

    public char getTalle() {
        return talle;
    }

    public String getPersonaje() {
        return personaje;
    }

    public double getPrecio() {
        return precio;
    }

    public int getDias() {
        return dias;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public void setTalle(char talle) {
        this.talle = talle;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
