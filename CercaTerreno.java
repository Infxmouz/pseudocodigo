package cercaterreno;
import java.util.Scanner;

public class CercaTerreno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite comprimento do lado a(em metros - rua do sol): ");
        double a = scanner.nextDouble();
        
        System.out.println("Digite o comprimento do lado b(em metros - estrada dos passáros verdes):");
        double b = scanner.nextDouble();
        
        System.out.println("Digite o ângulo entre a e b(em gruas)");
        double anguloGraus = scanner.nextDouble();
        double anguloRadianos = Math.toRadians(anguloGraus);
        
        double c = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(anguloRadianos));
        System.out.printf("O agricultor precisará de %2f metros de cerca para fechar o triangulo.\n",c);
    }
    
   //pseudocodigo
//    Iniciar Programa Cerca_Triangulo
//
//    Declarar a, b, c Como Real
//    Declarar anguloGraus, anguloRadianos COMO REAL
//
//    Escrever "Digite comprimento do lado a (em metros - rua do sol):"
//    Ler a
//
//    Escrever "Digite o comprimento do lado b (em metros - estrada dos pássaros verdes):"
//    Ler b
//
//    Escrever "Digite o ângulo entre a e b (em graus):"
//    Ler anguloGraus
//
//    anguloRadianos = Converter Para Radians(anguloGraus)
//
//    c = Raiz(a * a + b * b - 2 * a * b * COS(anguloRadianos))
//
//    Escrever "O agricultor precisará de ", c, " metros de cerca para fechar o triângulo."
//
//Fim
}
