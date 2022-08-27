//Calcular el gasto de agua de una vivienda dado el numero de m*3 de agua gastados, siendo el sistema de cobro el siguiente
//La cuota fija mensual es de $10000.
//Los primeros 50 m*3 son gratis.
//Entre 50 y 200 m* se cobra el m*3 a $2000.
//A partir de 200 m*3 se cobra el m*3 a $3000.

package Modelo;
import javax.swing.JOptionPane;

public class Gastoagua
{
    public static void main(String[] args) {
        int m3, precio = 10000;

        m3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el gasto en m3: "));

        if(m3<=50)
        {
            precio = 10000;
        }

        else if(m3>50 && m3<200)
        {
            m3 = m3 - 50;
            precio = precio + (m3*2000);
        }
        else
        {
            m3 = m3 - 50;
            precio = precio + (m3*3000);            
        }
        System.out.println("El gasto total de agua es de "+ precio);
        
    }
}
