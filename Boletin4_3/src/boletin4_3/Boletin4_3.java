package boletin4_3;

/**
 *
 * @author finfanterodal
 */
public class Boletin4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Sin parámetros
        Circulo comprob3 = new Circulo();
        System.out.println("\nÁrea sin parámetros inicial = " + comprob3.cacularArea());
        comprob3.setRadio(50);
        System.out.println("\nÁrea sin parámetros = " + comprob3.cacularArea());
        System.out.println("\nLonxitude sin parámetros = " + comprob3.cacularLonxitude());
        //Con parámetros
        Circulo comprob4 = new Circulo(40);
        System.out.println("\nÁrea con parámetros = " + comprob4.cacularArea());
        System.out.println("\nLonxitude con parámetros = " + comprob4.cacularLonxitude());
    }

}
