import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String filme = JOptionPane.showInputDialog(null, "Qual o seu filme preferido ate o momento?", "Title",
                JOptionPane.QUESTION_MESSAGE);
        String texto = JOptionPane.showInputDialog(null, "Digite um numero: ");
        int numero = Integer.parseInt(texto);
        JOptionPane.showMessageDialog(null, "diexa o like", "academia dos devs ",JOptionPane.INFORMATION_MESSAGE);
        System.out.println(filme);
        System.out.println(numero);
    }
}