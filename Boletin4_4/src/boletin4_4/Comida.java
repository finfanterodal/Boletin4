package boletin4_4;

/**
 *
 * @author finfanterodal
 */
public class Comida {

    //Atributos
    private int polbo, patacas;

    //Constructor
    public Comida() {
        polbo = 0;
        patacas = 0;
    }
    //Métodos

    public float calcularCapacidad(int p, int pat) {
        int numClientes = 0;
        while (p >= 2 && pat >= 1) {
            p = p - 2;
            pat = pat - 1;
            numClientes = numClientes + 3;
        }
        return numClientes;
    }

    public void engadirPolbo(int p) {// . Engade x kg de polbo a os xa existentes
        polbo = p;
    }

    public void engadirPatacas(int pat) {  // Engade x kg de patacas  ''       ''   
        patacas = pat;
    }
//Recoller datos privados

    public int getPolbo() {
        return polbo;
    }

    public int getPatacas() {
        return patacas;
    }

    public void amosarPolbo() {//Amosa por pantalla os kg de polbo que ten no almacen
        System.out.println("Kg de Polbo" + getPolbo());
    }

    public void amosarPatacas() {
        System.out.println("Kg de Patacas" + getPatacas());
    }

}
