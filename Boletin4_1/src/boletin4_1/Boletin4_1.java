package boletin4_1;

/**
 *
 * @author finfanterodal
 */
public class Boletin4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //COCHE
        System.out.println("\nCLASE COCHE");
        Coche comprob = new Coche();
        System.out.println("\nVelocidade inicial = " + comprob.getVelocidade());
        comprob.acelerar(30);
        comprob.frenar(0);
        System.out.println("\nVelocidade = " + comprob.getVelocidade());

    }
    
}
