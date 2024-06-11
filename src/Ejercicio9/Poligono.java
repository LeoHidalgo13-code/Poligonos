package Ejercicio9;
public abstract class Poligono { //Super clase 
    private int Nlados;
    public Poligono(int Nlados) { //Constructor con el numero de lados
        this.Nlados = Nlados;
    }
    public int getNlados() { //Getter
        return Nlados;
    }
    @Override  //Polimordismo con "to string"
    public String toString() {
        return "El numero de lados es = " + Nlados;
    }
    public abstract double area(); //Metodo abstracto para poder calcular el area en el programa

}
