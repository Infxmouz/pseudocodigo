package dois.inteiros;
import java.util.Scanner;

public class DoisInteiros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        if (num2 == 0) {
            System.out.println("Erro: divisão por zero não é permitida.");
        } else {
            int resto = num1 % num2;

            System.out.println("O resto da divisão de " + num1 + " por " + num2 + " é: " + resto);
    }   
//Pseudocódigo
//Iniciar Programa Resto_divisão
//
//    Declarar num1, num2, resto Como Inteiro
//
//    // Entrada dos dois números inteiros
//    Escrever "Digite o primeiro número inteiro:"
//    Ler num1
//
//    Escrever "Digite o segundo número inteiro:"
//    Ler num2
//
//    Se num2 == 0 ENTÃO
//        ESCREVER "Erro: divisão por zero não é permitida."
//    Senão
//        resto = num1 % num2
//
//        Escrevr "O resto da divisão de ", num1, " por ", num2, " é: ", resto
//
//Fim
    }
}
