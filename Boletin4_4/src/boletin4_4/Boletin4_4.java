/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_4;

/**
 *
 * @author finfanterodal
 */
public class Boletin4_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //COMIDA
        System.out.println("\n CLASE COMIDA");
        Comida comprob5 = new Comida();
        System.out.println("\nNúmero de clientes = " + comprob5.calcularCapacidad(100, 100));
        comprob5.engadirPatacas(20);
        comprob5.engadirPolbo(40);
        comprob5.amosarPatacas();
        comprob5.amosarPolbo();
    }
}
    

