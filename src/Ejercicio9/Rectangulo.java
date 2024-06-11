package Ejercicio9;
public class Rectangulo extends Poligono { //La clase Triangulo hereda los atributos de la clase Poligono
    private double lado1;
    private double lado2;
    public Rectangulo(double lado1, double lado2) { //Constructor
        super(2); //Numero de lados
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public double getLado1() { //Getter
        return lado1;
    }
    public double getLado2() { //Getter
        return lado2;
    }
    @Override  //Polimorfismo con "to string" 
    public String toString() {
        return "Rectangulo:  \n " + super.toString()+ "\nlado 1 = " + lado1 + ", lado 2 = " + lado2 ;
    }
    @Override //Sobrescribimos los datos de la clase Poligono en la clase Triangulo
    public double area() //Metodo abstracto
    {
         return lado1*lado2;
    }
}
