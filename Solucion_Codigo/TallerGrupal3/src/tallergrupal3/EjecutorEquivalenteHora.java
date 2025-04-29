
package tallergrupal3;

import java.util.Random;

/**
 *
 * @author admin
 */
public class EjecutorEquivalenteHora {
     public static void main(String[] args) {
        Random random = new Random();
        int horasIngresadas = random.nextInt(1000);

        Problema2_EquivalenteHora equivalenteHoraX = new Problema2_EquivalenteHora(horasIngresadas);

        System.out.println("\n" + equivalenteHoraX);

    }
    
}
