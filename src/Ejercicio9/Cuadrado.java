package Ejercicio9;
public class Cuadrado extends Poligono { //La clase Cuadrado hereda los atributos de la clase Poligono
    private double lado1;

    public Cuadrado(double lado1) { //Constructor 
        super(1);//Numero de lados
        this.lado1 = lado1;
    }
    public double getLado1() { //Getter
        return lado1;
    }
    @Override //Polimorfismo con "to string" 
    public String toString() {
        return "Cuadrado \n" +super.toString()+ "\nlado 1 = " + lado1 ;
    }
    @Override  //Sobrescribimos los datos de la clase Poligono en la clase Cuadrado
    public double area() //Metodo abstracto
    {
      return lado1*lado1;    
    }
}
