import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RegistroCitas registroCitas = new RegistroCitas();

        while (true){
            System.out.println("1. Registrar nueve cita.");
            System.out.println("2. Ver citas.");
            System.out.println("3. Salir.");
            System.out.println("Seleccione una opcion: ");
            int opciones = scanner.nextByte();
            scanner.nextLine();

            if (opciones == 1){
                //nombre
                System.out.println("Nombre del paciente: ");
                String nombrePaciente = scanner.next();

                //Id de paciente
                System.out.println("Id del paciente:  ");
                String idPaciente = scanner.next();

                //DNI
                System.out.println("DNI del paciente");
                int dni = scanner.nextInt();
                scanner.nextLine();

                //Fecha de naciento
                System.out.println("Fecha de naciento del paciente (YYYY-MM-DD): ");
                String fecha = scanner.nextLine();

                //Edad
                System.out.println("Edad del paciente: ");
                int edad = scanner.nextInt();
                scanner.nextLine();

                //Telefono
                System.out.println("Telefono del paciente: ");
                String telefono = scanner.nextLine();

                //Correo
                System.out.println("Correo del paciente: ");
                String correo = scanner.nextLine();

                //Direccion
                System.out.println("Direccion del paciente: ");
                String direccion = scanner.nextLine();

                //sexo
                System.out.println("Sexo del paciente: ");
                String sexo = scanner.nextLine();

                //Seguro
                System.out.println("Tiene seguro el paciente?: ");
                boolean seguro = scanner.nextBoolean();
                scanner.nextLine();

                Paciente paciente = new Paciente(nombrePaciente, idPaciente, dni, LocalDateTime.parse(fecha), edad,telefono, correo
                , direccion, sexo, seguro);

                System.out.println("Nombre del medico: ");
                String nombreMedico = scanner.nextLine();
                System.out.println("Escialidad del medico: ");
                String especialidadMedico = scanner.nextLine();
                Medico medico = new Medico(nombreMedico, especialidadMedico);

                System.out.println("Fecha y hora de la cita (YYYY-MM-DDTHH:MM): ");
                String fechaHora = scanner.nextLine();
                LocalDateTime fechaHoraCita = LocalDateTime.parse(fechaHora);

                CitaMedica citaMedica = new CitaMedica(paciente, medico, fechaHoraCita);
                registroCitas.agregarCita(citaMedica);
            } else if (opciones == 2) {
                System.out.println("Cita registrada: ");
                for (CitaMedica cita : registroCitas.obtenerCitas()){
                    System.out.println(cita);
                }
            } else if (opciones == 3) {
                break;
            }else {
                System.out.println("Opcion invalida");
            }
        }
    }
}