/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallergrupal3;

/**
 *
 * @author admin
 */
public class Problema8_Cheques {
    public String nombreCliente;
    public String nombreBanco;
    public double valorCheque;
    public double comision;
    public Problema8_Cheques(){
    }
    public Problema8_Cheques(String nombreCliente,String nombreBanco,
            double valorCheque,double comision ){
        this.nombreCliente = nombreCliente;
        this.nombreBanco = nombreBanco;
        this.valorCheque = valorCheque;
        this.comision = comision;
        calcularComision(); 
    }

    public void calcularComision() {
        comision = valorCheque * 0.003; 
    }
    public String toString() {
        return String.format("""
                             Nombre del cliente: %s
                             Nombre del banco: %s
                             Valor del cheque: %.2f
                             Comision: %.2f
                             """, nombreCliente, nombreBanco,
                             valorCheque, comision);
    }
}
    

