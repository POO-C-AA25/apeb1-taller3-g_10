/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallergrupal3;
import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author admin
 */
public class Problema9_Emprendimiento {

    public String nombreComercial;
    public int RUC;
    public String sectorEconomico;
    public String propietario;
    public String ubicacion;
    public LocalDate fechaActual;
    public LocalDate fechaInicio;
    public double capitalInicial;

    public Problema9_Emprendimiento() {
    }

    public Problema9_Emprendimiento(String nombreComercial, int RUC, 
            String sectorEconomico,String propietario, String ubicacion,
            LocalDate fechaActual, LocalDate fechaInicio, double capitalInicial)
    {
        this.nombreComercial = nombreComercial;
        this.RUC = RUC;
        this.sectorEconomico = sectorEconomico;
        this.propietario = propietario;
        this.ubicacion = ubicacion;
        this.fechaActual = fechaActual;
        this.fechaInicio = fechaInicio;
        this.capitalInicial = capitalInicial;
    }

    public void actualizarInformacion(String nombreComercial, 
            String sectorEconomico,
        String propietario, String ubicacion, double capitalInicial) 
    {
        this.nombreComercial = nombreComercial;
        this.sectorEconomico = sectorEconomico;
        this.propietario = propietario;
        this.ubicacion = ubicacion;
        this.capitalInicial = capitalInicial;
    }

    public int calcularAntiguedadAnios() {
        return Period.between(fechaInicio, fechaActual).getYears();
    }

    public String determinarTipoNegocio() {
        if (capitalInicial < 5000) {
            return "Negocio Pequeño";
        } else if (capitalInicial < 20000) {
            return "Negocio Mediano";
        } else {
            return "Negocio Grande";
        }
    }

    public void clasificarEmprendimiento() {
        System.out.println("Clasificación realizada: " + determinarTipoNegocio());
    }

    @Override
    public String toString() {
        return String.format("""
                             nombreComercial: %s
                             RUC: %d
                             sectorEconomico: %s
                             propietario: %s
                             ubicacion: %s
                             fechaInicio: %s
                             capitalInicial: %.2f
                             antiguedadAnios: %d
                             tipoNegocio: %s
                             """,
                nombreComercial, RUC, sectorEconomico, propietario, ubicacion,
                fechaInicio.toString(), capitalInicial,
                calcularAntiguedadAnios(), determinarTipoNegocio());
    }
}


