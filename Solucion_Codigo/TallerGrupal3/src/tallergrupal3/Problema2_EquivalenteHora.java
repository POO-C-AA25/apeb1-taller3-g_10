
package tallergrupal3;

import java.util.Random;

public class Problema2_EquivalenteHora {

    public int horas;
    public int minutos;
    public int segundos;
    public int dias;

 
    public Problema2_EquivalenteHora(){
    }
    public Problema2_EquivalenteHora(int horas) {
        this.horas = horas;
        
        calcularEquivalentes();
    }

    public void calcularEquivalentes() {
        minutos = horas * 60;
        segundos = horas * 3600;
        dias = horas / 24;
    }

    public String toString() {
        return String.format("Equivalente de %d horas:\nMinutos: "
                + "%d\nSegundos: %d\nDias: %d",
                horas, minutos, segundos, dias);
    }

  
}
