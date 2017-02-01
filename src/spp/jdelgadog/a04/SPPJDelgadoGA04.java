/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jdelgadog.a04;
import java.util.Scanner;
/**
 *
 * @author GILDARDO
 */
public class SPPJDelgadoGA04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
    int opEntrada;
    double angulo;
    Scanner teclado=new Scanner (System.in);
    //Desplegamos el menú.
        System.out.println("Calculador de funciones trigonométricas");
        System.out.println("Introduce la opción deseada");
        System.out.println("1.Calcular seno del ángulo");
        System.out.println("2.Calcular coseno del ángulo");
        System.out.println("3.Calcular tangente del ángulo");
        System.out.println("4.Salir");
        opEntrada=teclado.nextInt();
     
        switch (opEntrada){
            case 1:
                System.out.println("Bienvenido al cálculo de seno del ángulo");
                angulo= mensajePedirDatos();
                System.out.println("El seno del ángulo es "+Math.sin(angulo));
                 break;
                 case 2:
                System.out.println("Bienvenido al cálculo de coseno del ángulo");
                angulo= mensajePedirDatos();
                     System.out.println("El coseno del ángulo es "+Math.cos(angulo));
                 break;
                 case 3:
                System.out.println("Bienvenido al cálculo de tangente del ángulo");
                angulo= mensajePedirDatos();
                     System.out.println("la tangente del ángulo es "+Math.tan(angulo));
                 break;
                 default:
                     System.out.println("Adiós");
                       
        }
        
        
    }
    static double mensajePedirDatos(){
        //Variables
        double angulo;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce el ángulo");
        angulo=teclado.nextDouble();
        angulo=Math.toRadians(angulo);
        return angulo;
    }
}
