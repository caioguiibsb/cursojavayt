import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /**
         * int numero;
         * 
         * // Scaner -> classe
         * 
         * Scanner leitor = new Scanner(System.in);
         * System.out.println("Digite um numero: ");
         * numero = leitor.nextInt();
         * System.out.println("Numero e: "+ numero);
         * 
         * 
         * float num;
         * 
         * Scanner valor = new Scanner(System.in);
         * System.out.println("Digite um numero com virgula: ");
         * num = valor.nextFloat();
         * System.out.println("Numero e: "+ num);
         */

         String jogo;
         String joga;
         Scanner leitor = new Scanner(System.in);

         System.out.println("Qual o jogo do momento?");
         jogo = leitor.nextLine();
         System.out.println("Voce joga este jogo?");
         joga = leitor.nextLine();


         System.out.println("jogo e "+jogo);
         System.out.println("voce joga "+joga);
    }
}
