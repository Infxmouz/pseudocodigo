package raizesequacao;
import java.util.Scanner;

public class RaizesEquacao {
    
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro: ");
        
        int num1 = teclado.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        int num2 = teclado.nextInt();

        int soma = num1 + num2;
        
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        double divisao = num2 != 0 ? (double) num1 / num2 : 0;
        int restoDivisao = num2 != 0 ? num1 % num2 : 0;

        
        System.out.println("Resultados das operações:");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        
        if (num2 != 0) {
            System.out.printf("Divisão: %.2f\n", divisao);
            System.out.println("Resto da divisão: " + restoDivisao);
        } else {
            System.out.println("Divisão: Indefinida (divisão por zero)");
            System.out.println("Resto da divisão: Indefinido (divisão por zero)");
        }
    }
    
//    //pseudocodigo
//    Iniciar Programa Operações_aritméticas
//    
//    Declarar num1, num2, soma, subtracao, multiplicacao, restoDivisao Como Inteiro
//    Declarar divisao Como Real
//
//    Escrever "Digite o primeiro número inteiro:"
//    Ler num1
//
//    Escrever "Digite o segundo número inteiro:"
//    Ler num2
//
//            
//    soma = num1 + num2
//    subtracao = num1 - num2
//    multiplicacao = num1 * num2
//
//    SE num2 != 0 Então
//        divisao = (num1 / num2)
//        restoDivisao = num1 % num2
//    senão
//        divisao = Indefinido
//        restoDivisao = Indefinido
//
//    escrever "Resultados das operações:"
//    escrever "Soma:", soma
//    escrever "Subtração:", subtracao
//    escrever "Multiplicação:", multiplicacao
//
//    se num2 != 0 Então
//        Escrever "Divisão:", divisao
//        Escrever "Resto da divisão:", restoDivisao
//    senão
//        Escrever "Divisão: Indefinida (divisão por zero)"
//        Escrever "Resto da divisão: Indefinido (divisão por zero)"
//
//Fim    
}

    


