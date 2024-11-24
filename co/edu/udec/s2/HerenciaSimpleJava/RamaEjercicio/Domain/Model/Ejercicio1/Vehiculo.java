public class Vehiculo {
    protected String marca;
    protected double velocidadMaxima;

    // Constructor
    public Vehiculo(String marca, double velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Metodo para imprimir los detalles
    public void mostrarDetalles() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad Maxima: " + velocidadMaxima + "KM/H");
    }
    
}
