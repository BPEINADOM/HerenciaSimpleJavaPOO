import Domain.Model.Ejercicio3.Empleado;
import Domain.Model.Ejercicio3.Gerente;

public class EmpleadoDetalles {

    public static void main(String[] args) {

        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");

        Empleado empleado = new Empleado("Julio Cesar", 1500000.0);
        Gerente gerente = new Gerente("Marco Antonio", 5600000.0, "Seguridad");

        System.out.println("- Empleado:");
        empleado.mostrarDetalles();

        System.out.println("*********************************************");

        System.out.println("- Gerente:");
        gerente.mostrarDetalles();

        System.out.println("*********************************************");

    }
}
