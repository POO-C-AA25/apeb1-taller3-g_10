/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallergrupal3;

/**
 *
 * @author admin
 */
public class Problema3_InstitucionesEducativas {

    public String nombre;
    public String tipoInstitucion;
    public int numAlumnos;
    public int numDocentes;
    public int numSedes;
    public double gastosEstudiantes;
    public double presupuesto;
    public Problema3_InstitucionesEducativas(){
    }

    public Problema3_InstitucionesEducativas(int numAlumnos, double presupuesto, double 
            gastosEstudiantes, String nombre, String tipoInstitucion,
            int numDocentes, int numSedes) {
        this.nombre = nombre;
        this.tipoInstitucion = tipoInstitucion;
        this.numAlumnos = numAlumnos;
        this.numDocentes = numDocentes;
        this.numSedes = numSedes;
        this.presupuesto = presupuesto;
        this.gastosEstudiantes = gastosEstudiantes;
        calcularPresupuesto();
    }

    public void calcularPresupuesto() {
        presupuesto = gastosEstudiantes * numAlumnos;
    }

    public void gastosEstudiantes(double presupuesto) {
        this.presupuesto = presupuesto;
        calcularPresupuesto();
    }
    public String toString() {
        return String.format("""
                             Nombre de la institucion: %s
                             Tipo de institucion: %s
                             Numero de alumnos: %d
                             Numero de docentes: %d
                             Numero de sedes: %d
                             Gasto de estudiantes: %.2f
                             Presupuesto: %.2f""",
                nombre, tipoInstitucion, numAlumnos,numDocentes,
                numSedes, gastosEstudiantes, presupuesto);
    }

}
