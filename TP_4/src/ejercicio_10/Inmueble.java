package ejercicio_10;

public class Inmueble implements Rentable{
    private String direccion;
    private String tipo;
    private double valor;
    private int anios;

    @Override
    public void alquilar(int periodo){
        this.anios = periodo;
    }

    @Override
    public boolean alquilado() {
        return this.anios > 0;
    }

    @Override
    public void desocupar() {
        this.anios = 0;
    }

    public Inmueble(){
        this.direccion = "Alvarado";
        this.tipo = "Hotel";
        this.valor = 4000.500;
        this.anios = 0;
    }

    public Inmueble(String direccion, String tipo, double valor){
        this.direccion = direccion;
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public int getAnios() {
        return anios;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
