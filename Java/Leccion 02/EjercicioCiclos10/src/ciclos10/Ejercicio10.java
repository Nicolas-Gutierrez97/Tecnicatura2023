/*
Ejercicio 10:Pedir 10 números y escribir la suma 
total
Hacerlo con la clase Scanner y Joptionpane
 */
package ciclos10;

import javax.swing.JOptionPane;

public class Ejercicio10 {
    public static void main(String[] args) {
        int numero,suma=0;
        for(int i = 1;i <=10; i++){
            System.out.println("Digite un número: ");
            numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
            suma +=numero;
        }
        JOptionPane.showMessageDialog(null,"La suma de todos los números es: "+suma);
    }
    
}
