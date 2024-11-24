public class VehiculoDetalles {

    public static void main(String[] args) {

        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");

        // Instancia para Vehiculo
        Vehiculo vehiculo = new Vehiculo("Yamaha", 130);

        // Instancia para Coche
        Coche coche = new Coche("Nissan", 315, 2);

        // Mostrar detalles del vehiculo
        vehiculo.mostrarDetalles();

        System.out.println("*********************************************");

        // Mostrar detalles del coche
        coche.mostrarDetalles();

        System.out.println("*********************************************");

    }
}
