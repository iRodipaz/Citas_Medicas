package com.mycompany.citasmedicas;

/**
 *
 * @author seOxn
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Doctor {
    private String nombre;
    private String especialidad;
    private String turno;

    public Doctor(String nombre, String especialidad, String turno) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.turno = turno;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getTurno() {
        return turno;
    }

    public void guardarDoctor() {
        String archivo = "doctores.csv";
        try {
            FileWriter fileWriter = new FileWriter(archivo, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(nombre + "," + especialidad + "," + turno);
            printWriter.close();
        } catch (IOException e) {
            System.out.println("Error al guardar el doctor en el archivo.");
        }
    }
}