/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallergrupal3;

/**
 *
 * @author admin
 */
public final class Problema5_Calificaciones {
    public String nombre;
    public double calificacion1;
    public double calificacion2;
    public double calificacion3;
    public double promedioCalificaciones;
    public String estadoCalificaciones;
    public Problema5_Calificaciones(){
    }
    public Problema5_Calificaciones(String nombre, double calificacion1, 
            double calificacion2, double calificacion3) {
        this.nombre = nombre;
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
        this.calificacion3 = calificacion3;
        promedioCalificaciones();
        estadoCalificaciones();
    }

    public void promedioCalificaciones() {
        promedioCalificaciones = (calificacion1 + calificacion2 + 
                calificacion3) / 3;
        
    }

    public void estadoCalificaciones() {
        if (promedioCalificaciones >= 6.5) {
            estadoCalificaciones = "Aprobado";
        } else {
            estadoCalificaciones = "Reprobado";
        }
    }
    @Override
    public String toString() {
        return String.format("""
                             Nombre del estudiante: %s
                             Calificacion no1: %.2f
                             Calificacion no2: %.2f
                             Calificacion no3: %.2f
                             Promedio de las calificaciones: %.2f
                             Estado del alumno: %s
                             """,
                nombre, calificacion1, calificacion2, calificacion3,
                promedioCalificaciones, estadoCalificaciones);
    }
}