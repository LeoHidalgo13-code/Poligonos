package Ejercicio9;
public class Pentagono extends Poligono{ //La clase Pentagono hereda los atributos de la clase Poligono
    private double lado1,apotema;

     public Pentagono(double lado1, double apotema) { //Constructor 
        super(5); //Numero de lados
        this.lado1 = lado1; 
        this.apotema = apotema;
    }
    public double getLado1() { //Getter
        return lado1;
    }
    public double getApotema() { //Getter
        return apotema;
    }
    @Override  //Polimorfismo con "to string" 
    public String toString() {
        return "Pentagono: \n " +super.toString()+ "\nlado1 = " + lado1 + ", apotema = " + apotema;
    }
    @Override  //Sobrescribimos los datos de la clase poligono en la clase pentagono
    public double area() //Metodo abstracto
    {
        double p = (lado1*5);
        return (p*apotema)/2;
    }
}
//