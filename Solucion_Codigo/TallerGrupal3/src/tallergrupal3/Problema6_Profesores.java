/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallergrupal3;

/**
 *
 * @author admin
 */
public class Problema6_Profesores {

    public String nombre;
    public String apellido;
    public double sueldoBasico;
    public double sueldoTotal;
    public int cedula;
    public Problema6_Profesores(){
    }
    public Problema6_Profesores(String nombre, String apellido, double sueldoBasico, 
            int cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
        this.cedula = cedula;
        calcularSueldoTotal();
    }

    public void calcularSueldoTotal() {
        sueldoTotal = sueldoBasico + (sueldoBasico * 0.20); 
    }
    public String toString() {
        return String.format("""
                             Nombre del docente: %s
                             Apellido del docente: %s
                             Numero de cedula: %d
                             Sueldo basico: %.2f
                             Sueldo total: %.2f
                             """,
                nombre, apellido, cedula, sueldoBasico,
                sueldoTotal);
    }
}
