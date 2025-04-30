/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallergrupal3;
    import java.time.LocalDate;

/**
 *
 * @author admin
 */
public class EjecutorEmprendimiento {

    public static void main(String[] args) {
        LocalDate fechaInicio = LocalDate.of(2020, 1, 15);  
        LocalDate fechaActual = LocalDate.now();  

        Problema9_Emprendimiento emprendimientoX = new Problema9_Emprendimiento(
            "Tech Innovations", 1234567890, "Tecnología", "Juan Pérez",
            "Quito, Ecuador", fechaActual, fechaInicio, 12000.00
        );

        System.out.println("Información del emprendimiento:");
        System.out.println(emprendimientoX);

        emprendimientoX.clasificarEmprendimiento();

        emprendimientoX.actualizarInformacion(
            "Tech Solutions", "Tecnología Avanzada", "Juan Pérez", 
            "Guayaquil, Ecuador", 25000.00
        );

        System.out.println("\nInformación del emprendimiento actualizada:");
        System.out.println(emprendimientoX);

        emprendimientoX.clasificarEmprendimiento();
    }
}

    

