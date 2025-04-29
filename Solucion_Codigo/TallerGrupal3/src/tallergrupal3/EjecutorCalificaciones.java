/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallergrupal3;

import java.util.Random;

/**
 *
 * @author admin
 */
public class EjecutorCalificaciones {


        public static void main(String[] args) {
            Random random = new Random();
            double calificacion1 = random.nextDouble() * 10;
            double calificacion2 = random.nextDouble() * 10;
            double calificacion3 = random.nextDouble() * 10;

            Problema5_Calificaciones calificacionesX = 
                    new Problema5_Calificaciones(
                    "Javier Vinan",
                    calificacion1,
                    calificacion2,
                    calificacion3
            );
            System.out.println(calificacionesX);
        }
    }


