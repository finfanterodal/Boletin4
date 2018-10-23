package boletin4_1;

/**
 *
 * @author finfanterodal
 */
public class Coche {
    //Atributos
    private int velocidade;

    //Constructor
    public Coche() {
        velocidade = 0;
    }
    //Métodos

    //Velocidade Actual
    public int getVelocidade() {
        return velocidade;
    }
    //Acelerar

    public void acelerar(int valor) {
        velocidade = velocidade + valor;
    }
    //Frenar              

    public void frenar(int menos) {
        velocidade = velocidade - menos;
    }
}
