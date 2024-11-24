import Domain.Model.Ejercicio2.Estudiante;

public class EstudianteInformacion {

    public static void main(String[] args) {

        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");

        Estudiante estudiante = new Estudiante("Daniel Torres", 17, "2024-2");

        estudiante.mostrarInformacion();

        System.out.println("*********************************************");

    }
}
