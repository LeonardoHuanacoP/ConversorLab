/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraconversor;
import javax.swing.JFrame;

public class CalculadoraConversor {

    public static void main(String[] args) {
        // Crear el frame que contendrá el panel
        JFrame frame = new JFrame("Calculadora Conversor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Crear una instancia del panel
        PantallaaConversor pantalla = new PantallaaConversor();
        
        // Agregar el panel al frame
        frame.add(pantalla);
        
        // Ajustar tamaño del frame según el contenido
        frame.pack();
        
        // Hacer visible el frame
        frame.setVisible(true);
    }

}
