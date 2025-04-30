/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallergrupal3;

/**
 *
 * @author admin
 */
public class EjecutorCandidatoPresidencial {
      public static void main(String[] args) {
        Problema10_CandidatoPresidencial problema = 
                new Problema10_CandidatoPresidencial();

        Problema10_CandidatoPresidencial.CandidatoPresidencial candidato =
                problema.new CandidatoPresidencial(
                        "Ana Perez",
                        42,
                        "Partido Futuro",
                        "Educación, salud y empleo",
                        5,
                        35
                );

        System.out.println(candidato);

        if (candidato.evaluarEdadMinima(candidato.edadMinima)) {
            System.out.println("✅ El candidato cumple con la edad minima.");
        } else {
            System.out.println("❌ El candidato NO cumple con la edad minima.");
        }
    }
}