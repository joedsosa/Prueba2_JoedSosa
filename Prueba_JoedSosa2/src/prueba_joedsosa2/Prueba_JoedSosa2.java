/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba_joedsosa2;

/**
 *
 * @author joeds
 */
import java.util.*;

public class Prueba_JoedSosa2 {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Figura> figuras = new ArrayList<Figura>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese la cantidad de figuras que se creeran:");
        int cantidad = sc.nextInt();
        for (int i = 0; i < cantidad; i++) {
            System.out.println("---------");
            System.out.println("\tFigura #" + (i + 1));
            System.out.println("1. Cuadrado  2. Rectangulo  3.Traingulo.\nIngrese una opcion para el tipo de Figura");
            int opcion = sc.nextInt();
            while (opcion < 0 || opcion > 3) {
                System.out.println("Ingrese una opcion valida del 1 al 3");
                opcion = sc.nextInt();
            }
            float ancho = 0, alto = 0, largo = 0;
            String tipoFigura = "";
            switch (opcion) {
                case 1:
                    tipoFigura = "cuadrado";
                    System.out.println("Ingrese el tamano de sus lados");
                    alto = sc.nextFloat();
                    largo = alto;
                    ancho = alto;
                    break;
                case 2:
                    tipoFigura = "rectangulo";
                    System.out.println("Ingrese el ancho");
                    ancho = sc.nextFloat();
                    System.out.println("Ingrese el largo");
                    largo = sc.nextFloat();
                    System.out.println("Ingrese el alto");
                    alto = sc.nextFloat();
                    break;
                case 3:
                    tipoFigura = "triangulo";
                    System.out.println("Ingrese el ancho");
                    ancho = sc.nextFloat();
                    System.out.println("Ingrese el largo");
                    largo = sc.nextFloat();
                    System.out.println("Ingrese el alto");
                    alto = sc.nextFloat();
                    break;
                default:
                    break;
            }

            Figura f = new Figura(largo, ancho, alto, tipoFigura);
            figuras.add(f);
            System.out.println("Se ha anadido existosamente la figura");
            System.out.println("______________________________________");
        }
        for (Figura f : figuras) { //for each para iterar y hacer el get implicito en cada iteracion
            System.out.println(f.toString());
            float volumenFigura = f.Volumen();
            float areaFigura = f.Area();
            System.out.println("Area ->" + areaFigura + "\tVolumen ->" + volumenFigura);
        }
    }

}
