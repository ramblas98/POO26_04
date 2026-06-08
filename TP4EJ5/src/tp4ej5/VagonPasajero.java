package ejercicio5;

public class VagonPasajero extends Vagon{
    private int cantP;

    public VagonPasajero() {
    }
    public VagonPasajero(double largo, double ancho) {
        super(largo, ancho);
    }
    /*public VagonPasajero(int cantP) {
        this.cantP = cantP;
    }

    public VagonPasajero(double largo, double ancho, int cantP) {
        super(largo, ancho);
        this.cantP = cantP;
    }

    public int getCantP(){
        return this.cantP;
    }
    public void setCantP(int cantP) {
        this.cantP = cantP;
    }*/

    @Override
    public double pesoMaximo() {
        return this.cantidadPasajeros()*80;
    }

    @Override
    public boolean esLiviano() {
        return this.pesoMaximo()<2500;
    }

    @Override
    public int cantidadPasajeros() {
        //ancho útil
        if(super.getAncho()<=2.5){
            return (int) ((super.getLargo()*8));
        }
        return (int) ((super.getLargo()*10));
    }
    
}
