package boletin4_2;

/**
 *
 * @author finfanterodal
 */
public class Satelite {
    //Atributos 

    private double meridiano;
    private double paralelo;
    private double distanciaTerra;
//COnstructores

    public Satelite() {//SIN PARAMETROS
        meridiano = paralelo = distanciaTerra = 0;
    }

    public Satelite(double m, double p, double d) {//CON PARAMETROS

        meridiano = m;
        paralelo = p;
        distanciaTerra = d;

    }
//Métodos

    public void verPosicion() {
        System.out.println(" o satelite atopase  no paralelo " + paralelo + "meridiano" + meridiano + " a unha distancia da terra " + distanciaTerra);
    }
//Métodos para poner los tatos en el Constructor sin parámetros

    public void setParalelo(double p) {
        paralelo = p;
    }

    public void setMeridiano(double m) {
        meridiano = m;
    }

    public void setDtierra(double dt) {
        distanciaTerra = dt;
    }
}
