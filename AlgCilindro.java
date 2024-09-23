package algcilindro;
import java.util.Scanner;

public class AlgCilindro {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double h, a = 0, v = 0;
        
        System.out.println("Escreva a altura:");
        h = entrada.nextDouble();
        System.out.println("Escreva o raio da base:");
        
        double r = entrada.nextDouble();


        a = Math.PI * Math.pow (r,2);
        v = a * h;
        System.out.println("O volume é = " + v);

    }
//pseudocodigo
//    iniciar CalculoCilindro
//
//    Declarar h, a, v COMO REAL
//    Declarar r como real
//
//    
//    Escrever "Escreva a altura"
//    Ler h
//
//    
//    Escrever "Escreva o raio da base"
//    Ler r
//
//    a = PI * r^2
//   
//    v = a * h
//
//    Escrever "O volume é = ", v
//
//Fim
}