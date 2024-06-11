package Ejercicio9;
public class Triangulo extends Poligono { //La clase Triangulo hereda los atributos de la clase Poligono
    private double lado1,lado2,lado3;
    public Triangulo(double lado1, double lado2, double lado3) { //Constructor
        super(3); //Numero de lados
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    public double getLado1() { //Getter
        return lado1;
    }
    public double getLado2() { //Getter
        return lado2;
    }
    public double getLado3() { //Getter
        return lado3;
    }
    @Override  //Polimorfismo con "to string" 
    public String toString() {
        return "Triangulo \n" + super.toString() + "\n lado 1 = " + lado1 + ", lado 2 = " + lado2 + ", lado 3 = " + lado3 ;
    }
    @Override //Sobrescribimos los datos de la clase Poligono en la clase Triangulo
    public double area() //Metodo abstracto
    {
        double p=(lado1+lado2+lado3)/2;
        return Math.sqrt((p*(p-lado1)*(p-lado2)*(p-lado3)));
    }
}
