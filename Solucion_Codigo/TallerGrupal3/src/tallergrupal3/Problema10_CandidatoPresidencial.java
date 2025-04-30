/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallergrupal3;

/**
 *
 * @author admin
 */
public class Problema10_CandidatoPresidencial {
    
    public class CandidatoPresidencial {
    public String nombre;
    public int edad;
    public int edadMinima;
    public String partidoPolitico;
    public String planGobierno;
    public int numPropuestasClave;

    public CandidatoPresidencial() {
    }

    public CandidatoPresidencial(String nombre, String partidoPolitico) {
        this.nombre = nombre;
        this.partidoPolitico = partidoPolitico;
    }

    public CandidatoPresidencial(String nombre, int edad, String partidoPolitico,
                  String planGobierno, int numPropuestasClave, int edadMinima) {
        this.nombre = nombre;
        this.edad = edad;
        this.partidoPolitico = partidoPolitico;
        this.planGobierno = planGobierno;
        this.numPropuestasClave = numPropuestasClave;
        this.edadMinima = edadMinima;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public void setPlanGobierno(String planGobierno) {
        this.planGobierno = planGobierno;
    }

    public void setNumPropuestasClave(int numPropuestasClave) {
        this.numPropuestasClave = numPropuestasClave;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public String getPlanGobierno() {
        return planGobierno;
    }

    public int getNumPropuestasClave() {
        return numPropuestasClave;
    }

    public boolean evaluarEdadMinima(int edadMinima) {
        return this.edad >= edadMinima;
    }

    @Override
    public String toString() {
        return "CandidatoPresidencial" +
                "Nombre=" + nombre + '\n' +
                "Edad=" + edad +'\n'+
                "Edad Minima Requerida=" + edadMinima +'\n'+
                "Partido Politico=" + partidoPolitico + '\n' +
                "Plan de Gobierno=" + planGobierno + '\n' +
                "Numero de Propuestas Clave=" + numPropuestasClave;
    }
}
    
    
}
