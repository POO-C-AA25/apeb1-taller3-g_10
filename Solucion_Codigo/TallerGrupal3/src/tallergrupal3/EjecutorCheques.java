/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallergrupal3;
import java.util.Random;

public class EjecutorCheques {
     public static void main(String[] args) {
        double valorCheque = (Math.random() * 10000) ;
        Problema8_Cheques ChequesX = new Problema8_Cheques(
            "Luis Quito",
            "Banco del Pacífico",
            valorCheque,
            0.0  
        );
        System.out.println(ChequesX);
     }
     
    
}
