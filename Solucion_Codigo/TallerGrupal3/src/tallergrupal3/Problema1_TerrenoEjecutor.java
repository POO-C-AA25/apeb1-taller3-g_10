/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallergrupal3;

/**
 *
 * @author javiv
 */
public class Problema1_TerrenoEjecutor {
    public static Terreno terrenoX = new Terreno();

    public static void main(String[] args) {
        System.out.println("FORMA LARGA");

        double ancho = (Math.random() * 10) + 1;
        double largo = (Math.random() * 10) + 1;
        double valorMetro = (Math.random() * 10) + 1;

        terrenoX.setAncho(ancho);
        terrenoX.setLargo(largo);
        terrenoX.setValorMetro(valorMetro);

        terrenoX.calcularArea();
        terrenoX.calcularCostoTerreno();

        System.out.println("terrenoX: " + terrenoX.toString());

        System.out.println("FORMA EFICIENTE");
        Terreno miTerreno = new Terreno(2, 3, 6);
        miTerreno.calcularArea();
        miTerreno.calcularCostoTerreno();
        System.out.println("miTerreno: " + miTerreno.toString());    
    }
}

class Terreno {

    private double ancho;
    private double largo;
    private double valorMetro;
    private double area;
    private double costoTerreno;

    public Terreno() {
    }

    public Terreno(double ancho, double largo, double valorMetro) {
        this.ancho = ancho;
        this.largo = largo;
        this.valorMetro = valorMetro;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setValorMetro(double valorMetro) {
        this.valorMetro = valorMetro;
    }

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }

    public double getValorMetro() {
        return valorMetro;
    }

    public double getArea() {
        return area;
    }

    public double getCostoTerreno() {
        return costoTerreno;
    }

    public void calcularArea() {
        this.area = this.ancho * this.largo;
    }

    public void calcularCostoTerreno() {
        this.costoTerreno = this.area * this.valorMetro;
    }

   
    public String toString() {
        return "{Ancho: " + ancho +
               ", Largo: " + largo +
               ", Valor Metro: " + valorMetro +
               ", Area: " + area +
               ", Costo Terreno: " + costoTerreno + "}";
    }
}


