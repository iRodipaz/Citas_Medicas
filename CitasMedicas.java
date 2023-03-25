

package com.mycompany.citasmedicas;

/**
 *
 * @author seOxn
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CitasMedicas {
    
    private static final String DOCTORES_CSV = "doctores.csv";
    private static final String PACIENTES_CSV = "pacientes.csv";
    private static final String CITAS_CSV = "citas.csv";
    private static final String ADMIN_USER = "admin";
    private static final String ADMIN_PASS = "pass";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese usuario: ");
        String user = scanner.nextLine();
        System.out.print("Ingrese contraseña: ");
        String pass = scanner.nextLine();
        if (user.equals(ADMIN_USER) && pass.equals(ADMIN_PASS)) {
            System.out.println("¡Bienvenido al sistema de citas médicas!");
            while (true) {
                System.out.println("Seleccione una opción:");
                System.out.println("1. Dar de alta un paciente");
                System.out.println("2. Dar de alta un médico");
                System.out.println("3. Generar una cita");
                System.out.println("4. Salir");
                String opcion = scanner.nextLine();
                switch (opcion) {
                    case "1":
                        altaPaciente();
                        break;
                    case "2":
                        altaDoctor();
                        break;
                    case "3":
                        generarCita();
                        break;
                    case "4":
                        System.out.println("¡Hasta pronto!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opción inválida. Intente de nuevo.");
                        break;
                }
            }
        } else {
            System.out.println("Usuario o contraseña incorrectos. Adiós.");
        }
    }
    
    private static void altaPaciente() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del paciente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el teléfono del paciente: ");
        String telefono = scanner.nextLine();
        
        try {
            File file = new File(PACIENTES_CSV);
            boolean exists = file.exists();
            FileWriter fw = new FileWriter(file, true);
            if (!exists) {
                fw.write("nombre,telefono\n");
            }
            fw.write(nombre + "," + telefono + "\n");
            fw.close();
            System.out.println("Paciente agregado exitosamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al agregar el paciente.");
            e.printStackTrace();
        }
    }
    
    private static void altaDoctor() {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del médico: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la especialidad del médico: ");
        String especialidad = scanner.nextLine();
        System.out.print("Ingrese el turno del médico (mañana/tarde): ");
        String turno = scanner.nextLine();
        
        try {
            File file = new File(DOCTORES_CSV);
            boolean exists = file.exists();
            FileWriter fw = new FileWriter(file, true);
            if (!exists) {
                fw.write("nombre,especialidad,turno\n");
            }
            fw.write(nombre + "," + especialidad + "," + turno + "\n");
            fw.close();
            System.out.println("Médico agregado exitosamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al agregar el médico.");
            e.printStackTrace();
        }
    }
    
    private static void generarCita() {
       Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese el nombre del paciente:");
    String nombrePaciente = scanner.nextLine();
    System.out.println("Ingrese el teléfono del paciente:");
    String telefonoPaciente = scanner.nextLine();
    Paciente paciente = new Paciente(nombrePaciente, telefonoPaciente);
    paciente.guardarPaciente();

    System.out.println("Ingrese el nombre del doctor:");
    String nombreDoctor = scanner.nextLine();
    System.out.println("Ingrese la especialidad del doctor:");
    String especialidadDoctor = scanner.nextLine();
    System.out.println("Ingrese el turno del doctor (mañana/tarde):");
    String turnoDoctor = scanner.nextLine();
    Doctor doctor = new Doctor(nombreDoctor, especialidadDoctor, turnoDoctor);
    doctor.guardarDoctor();

    System.out.println("Ingrese la fecha de la cita (dd/mm/aaaa):");
    String fechaCita = scanner.nextLine();
    System.out.println("Ingrese la hora de la cita (hh:mm):");
    String horaCita = scanner.nextLine();
    Citas cita = new Citas(nombrePaciente, nombreDoctor, fechaCita, horaCita);
    cita.guardarCita();
    System.out.println("Cita generada con éxito.");
}
}
