/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraconversor;

/**
 *
 * @author Acer
 */
public class operaciones {
    // Conversión de Kilogramos a Libras o viceversa
    public double convertirKilosLibras(double valor, boolean invertido) {
        if (invertido) {
            return valor / 2.20462;  // Libras a Kilogramos
        } else {
            return valor * 2.20462;  // Kilogramos a Libras
        }
    }

    // Conversión de Soles a Dólares o viceversa
    public double convertirSolDolar(double valor, boolean invertido) {
        if (invertido) {
            return valor / 3.77;  // Dólares a Soles
        } else {
            return valor * 3.77;  // Soles a Dólares
        }
    }

    // Conversión de grados Celsius a Fahrenheit o viceversa
    public double convertirGrados(double valor, boolean invertido) {
        if (invertido) {
            return (valor - 32) * 5 / 9;  // Fahrenheit a Celsius
        } else {
            return (valor * 9 / 5) + 32;  // Celsius a Fahrenheit
        }
    }

    // Conversión de Pies a Metros o viceversa
    public double convertirPiesMetros(double valor, boolean invertido) {
        if (invertido) {
            return valor / 0.3048;  // Metros a Pies
        } else {
            return valor * 0.3048;  // Pies a Metros
        }
    }
}
