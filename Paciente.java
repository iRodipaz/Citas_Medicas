package com.mycompany.citasmedicas;

/**
 *
 * @author seOxn
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Paciente {
    private String nombre;
    private String telefono;

    public Paciente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void guardarPaciente() {
        String archivo = "pacientes.csv";
        try {
            FileWriter fileWriter = new FileWriter(archivo, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(nombre + "," + telefono);
            printWriter.close();
        } catch (IOException e) {
            System.out.println("Error al guardar el paciente en el archivo.");
        }
    }
}

