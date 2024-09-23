package restaurante;
import java.util.Scanner;
public class Restaurante {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor do gasto realizado pelo cliente (em reais): ");
        double valorGasto = teclado.nextDouble();

        double gorjeta = valorGasto * 0.10;

        double valorTotal = valorGasto + gorjeta;

        System.out.printf("O valor total a ser pago, incluindo os 10%% do garçom, é: R$ %.2f\n", valorTotal);
    }
// Pseudocódigo
//
// Iniciar Programa Restaurante_coma_bem
//
// Declarar valorGasto, gorjeta, valorTotal COMO REAL
//
// Escrever "Digite o valor do gasto realizado pelo cliente (em reais):"
//    
// Ler valorGasto
//
// gorjeta = valorGasto * 0.10
//
// valorTotal = valorGasto + gorjeta
//
// Escrever "O valor total a ser pago, incluindo os 10% do garçom, é: R$", valorTotal
//
//Fim
    
}
