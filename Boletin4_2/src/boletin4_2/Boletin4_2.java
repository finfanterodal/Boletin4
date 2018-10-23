package boletin4_2;

/**
 *
 * @author finfanterodal
 */
public class Boletin4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //SATELITE
        System.out.println("\nCLASE SATELITE");
        //Sin parámetros
        Satelite comprob1 = new Satelite();
        System.out.println("\nSin Parámetros");
        System.out.println("\nInicial");
        comprob1.verPosicion();
        System.out.println("\nIntroduciendo parámetros con el nuevo método");
        comprob1.setDtierra(20);
        comprob1.setMeridiano(40);
        comprob1.setParalelo(60);
        comprob1.verPosicion();
        //Con parámetros
        Satelite combrob2 = new Satelite(200, 40, 50);
        System.out.println("\nCon Parámetros");
        combrob2.verPosicion();

    }

}
