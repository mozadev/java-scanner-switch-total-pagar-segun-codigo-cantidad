/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montoapaga;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Montoapaga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int codigoP, cantidad, precio, total;
        // codigo producto(1,2,3,4)
        System.out.print("Ingrese el codigo del producto: ");
        codigoP = leer.nextInt();
        System.out.print("Ingrese cantidad a comprar: ");
        cantidad = leer.nextInt();
        precio = 0;
        // determinar el precio
        switch (codigoP) {
            case 1:
                precio = 10;
                break;
            case 2:
                precio = 20;
                break;
            case 3:
                precio = 30;
                break;
            case 4:
                precio = 40;
                break;
            default:
                System.out.println("Codigo de producto no valido");
                break;
        }
        // calculamos el total a pagar
        total = cantidad * precio;
        System.out.println("El total a pagar es : " + total);

    }

}
