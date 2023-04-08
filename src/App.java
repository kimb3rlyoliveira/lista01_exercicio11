import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int primeiro;
        int segundo;
        double terceiro;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira o 1° número Inteiro: ");
        primeiro = teclado.nextInt();

        System.out.print("Insira o 2° número Inteiro: ");
        segundo = teclado.nextInt();

        System.out.print("Insira o número real: ");
        terceiro = teclado.nextDouble();
        teclado.close();
        
        System.out.println(" ");
        System.out.println("O produto do dobro do primeiro com metade do segundo: " + ((primeiro*2)*(segundo/2)));
        System.out.println("A soma do triplo do primeiro com o terceiro: " + ((primeiro*3)+terceiro));
        System.out.println("O terceiro elevado ao cubo: " + terceiro*terceiro*terceiro);
    }
}