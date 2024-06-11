package Ejercicio9; //Nombre de la paqueteria del proyecto
import java.util.*; //Importacion de las librerias que usemos
public class princi { 
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>(); //Arreglo donde de almacenan los poligonos
    static Scanner l = new Scanner(System.in); //Scanner para poder pedir datos por teclado
    public static void main (String[]args) //Clase Main
    {
       Llenarpoli(); //Metodo para llenar los poligonos
       mostrarResu(); //Metodo para mostrar resultados
    }
    public static void Llenarpoli() //Metodo donde llenamos los poligonos
    {
        int opcion; //Variable que se usa en la eleccion de poligonos
        char r; //Variable que se usa en la eleccion de otro poligono
        do{ //Ciclo do while para que se repita las opciones de poligono
            do{ //Cilco do while que se utiliza en la seleccion de otro poligono
                System.out.println("Ingresa que poligono deseas ");   
                System.out.println("*1*Triangulo");
                System.out.println("*2*Rectangulo");
                System.out.println("*3*Cuadrado");
                System.out.println("*4*Pentagono");
                System.out.println("Opcion: ");
                opcion=l.nextInt(); //Ingreso de variable opcion
            }while(opcion<1 || opcion>4);
            
            switch(opcion){ //Switch para determinar el tipo de poligono
                case 1: //Triangulo 
                    llenartriangulo();
                    break;
                case 2: //Rectangulo
                    llenarectangulo();
                    break;
                case 3: //Cuadrado
                    llenarcuadrado();
                    break;          
                case 4: //Pentagono
                    llenarpentagono();
                    break;
            }
            System.out.println("\n ¿Desea ingresar otro poligono (S/N): ");
            r=l.next().charAt(0);//Ingreso de variable r
            System.out.println("");
        }while(r=='S'|| r=='s');
    } 
    public static void llenartriangulo() //Metodo para llenar los datos del triangulo
    {
        double lado1,lado2,lado3;
        System.out.println("Ingresa el lado 1: ");
        lado1 = l.nextDouble();
        System.out.println("Ingresa el lado 2: ");
        lado2 = l.nextDouble();
        System.out.println("Ingresa el lado 3: ");
        lado3 = l.nextDouble(); 
        Triangulo t = new Triangulo(lado1,lado2,lado3); //Creacion del objeto "t" en la clase Triangulo
        poligono.add(t); //Guardamos el triangulo dentro del arreglo
    }
    public static void llenarectangulo() //Metodo para llenar los datos del rectangulo
    {
        double lado1,lado2;
        System.out.println("Ingresa el lado 1: ");
        lado1 = l.nextDouble();
        System.out.println("Ingresa el lado 2: ");
        lado2 = l.nextDouble();
        Rectangulo r = new Rectangulo(lado1,lado2); //Creacion del objeto "r" en la clase Rectangulo
        poligono.add(r); //Guardamos el rectangulo dentro del arreglo
    }
    public static void llenarcuadrado() //Metodo para llenar los datos del cuadrado
    {
        double lado1;
        System.out.println("Ingresa el lado 1: ");
        lado1 = l.nextDouble();
       Cuadrado c = new Cuadrado(lado1); //Creacion del objeto "c" en la clase Cuadrado
       poligono.add(c); //Guardamos el cuadrado dentro del arreglo
    }
    public static void llenarpentagono() //Metodo para llenar los datos del pentagono
    {
        double lado1,apotema; 
        System.out.println("Ingresa el lado 1: ");
        lado1= l.nextDouble();
        System.out.println("Ingrese el apotema: ");
        apotema = l.nextDouble();
        Pentagono p = new Pentagono(lado1,apotema); //Creacion del objeto "p" en la clase Pentagono
        poligono.add(p); //Guardamos el pentagono dentro del arreglo
                
    }
    public static void mostrarResu() //Metodo para mostrar los datos de los poligonos
    {
        for(Poligono po: poligono )
        {
            System.out.println(po.toString());
            System.out.println("Area = " + po.area());
        }
    }
        
   
}
