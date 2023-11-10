
package pkg9p1taller1jimenezfreddy;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("               ACTIVIDAD #1    ");
        System.out.println("===============================");
        System.out.println("Nombre: Freddy Jimenez");
        System.out.println("Fecha: 10/11/2023");
        System.out.println("Materia: Programacion Orientada a Objetos");
        System.out.println("Institucion: Universidad de las Fuerzas Armadas ESPE");
        System.out.println("===============================");
        System.out.println("CALCULADORA DE OPERACIONES BASICAS");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese el primer numero a operar: ");
        double nume1=scanner.nextDouble();
        System.out.print("Ingrese el segundo numero a operar: ");
        double nume2=scanner.nextDouble();
        double suma=nume1+nume2;
        double resta=nume1-nume2;
        double multiplicacion=nume1*nume2;
        double division=nume1/nume2;
        System.out.println("La suma de" +nume1+"y"+nume2+"es: "+suma);
        System.out.println("La resta de" +nume1+"y"+nume2+"es: "+resta);
        System.out.println("La multiplicacion de" +nume1+"y"+nume2+"es: "+multiplicacion);
        System.out.println("La division de" +nume1+"y"+nume2+"es: "+division);
    }
    
}
