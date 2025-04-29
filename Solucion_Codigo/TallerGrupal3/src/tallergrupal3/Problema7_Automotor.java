
package tallergrupal3;
import java.time.LocalDate;

public class Problema7_Automotor {
    public int cedula;
    public String marcaVehiculo;
    public int anioFabricacion;
    public double valorVehiculo;
    public double valorMatricula;
    public int anioAntiguedad;
    
    public Problema7_Automotor(){}
    public Problema7_Automotor(int cedula, String marcaVehiculo, int anioFabricacion,
            double valorVehiculo,
            double valorMatricula, int anioAntiguedad) {
        this.cedula = cedula;
        this.marcaVehiculo = marcaVehiculo;
        this.anioFabricacion = anioFabricacion;
        this.valorVehiculo = valorVehiculo;
        this.valorMatricula = valorMatricula;
        this.anioAntiguedad = anioAntiguedad;
        calcularAnioAntiguedad();
        calcularValorMatricula();
    }

    public void calcularAnioAntiguedad() {
        int anioActual = LocalDate.now().getYear();
        anioAntiguedad = anioActual - anioFabricacion;
        calcularValorMatricula();
    }

    public void calcularValorMatricula() {
        valorMatricula = valorVehiculo * 0.002 * anioAntiguedad;
    }
    public String toString() {
        return String.format("""
                             Cedula del propietario: %d
                             Valor del vehiculo: %.2f
                             Anios de antiguedad: %d
                             Valor de la matricula: %.2f
                             """, cedula, valorVehiculo,
                             anioAntiguedad, valorMatricula);
    }
}
