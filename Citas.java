package com.mycompany.citasmedicas;

/**
 *
 * @author seOxn
 */
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Citas {
private String paciente;
private String doctor;
private String fecha;
private String hora;

   public Citas(String paciente, String doctor, String fecha, String hora) {
    this.paciente = paciente;
    this.doctor = doctor;
    this.fecha = fecha;
    this.hora = hora;
}

public String getPaciente() {
    return paciente;
}

public String getDoctor() {
    return doctor;
}

public String getFecha() {
    return fecha;
}

public String getHora() {
    return hora;
}

public void guardarCita() {
    String archivo = "citas.csv";
    try {
        FileWriter fileWriter = new FileWriter(archivo, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(paciente + "," + doctor + "," + fecha + "," + hora);
        printWriter.close();
    } catch (IOException e) {
        System.out.println("Error al guardar la cita en el archivo.");
    }
}

public static void generarCita() {
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
