package boletin4_3;

/**
 *
 * @author finfanterodal
 */
public class Circulo {

    //Atributos
    private double radio = 0;
    private final double PI = 3.14;

    //Constructores
    public Circulo() {     //Sin Parámetros
        radio = 0;
    }

    public Circulo(double r) {//Con Parámetros
        radio = r;
    }
    //Métodos

    public double cacularArea() {
        double area = PI * Math.pow(radio, 2);
        return area;
    }

    public double cacularLonxitude() {
        double lonxitude = 2 * PI * radio;
        return lonxitude;
    }
    //Métodos para escribir los datos en el Constructor sin parámetros

    public void setRadio(double r) {
        radio = r;
    }
}
