public class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche(String marca, double velocidadMaxima, int numeroPuertas) {
        super(marca, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Numero de puertas: " + numeroPuertas + " puertas");
    }

}
