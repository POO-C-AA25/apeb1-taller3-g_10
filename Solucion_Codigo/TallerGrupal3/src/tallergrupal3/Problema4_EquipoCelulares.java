/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallergrupal3;


public class Problema4_EquipoCelulares {
    public String sistemaOperativo;
    public int tamanioPantalla;
    public double costoInicial;
    public int iva;
    public double ivaCostoInicial;
    public double costoFinal;
    public int direccionMac;
    public int informacionIMEI;
    public Problema4_EquipoCelulares(String sistemaOperativo, int tamanioPantalla, 
            double costoInicial,int iva, double ivaCostoInicial, 
            double costoFinal, int direccionMac, int informacionIMEI) {
        this.sistemaOperativo = sistemaOperativo;
        this.tamanioPantalla = tamanioPantalla;
        this.costoInicial = costoInicial;
        this.iva = iva;
        this.ivaCostoInicial = ivaCostoInicial;
        this.costoFinal = costoFinal;
        this.direccionMac = direccionMac;
        this.informacionIMEI = informacionIMEI;
        calcularCostoFinal();
    }
    public void calcularCostoFinal(){
         ivaCostoInicial = (iva / 100.0) * costoInicial;
         costoFinal = costoInicial + ivaCostoInicial;
    }
    
    public String toString() {
        return String.format("""
                             Sistema operativo: %s
                             Direccion Mac: %s
                             Informacion IMEI: %d
                             Tamanio pantalla: %d
                             Iva: %d
                             Costo inicial: %.2f
                             Costo final: %.2f
                             """,
                sistemaOperativo, direccionMac, informacionIMEI,tamanioPantalla,
                iva, costoInicial, costoFinal);
    }
}
