import java.net.SocketImpl;

public class App {
    public static void main(String[] args) throws Exception {
        String filme = "Vingadores"; //%s
        int anoLancamento = 2015; //%d
        int duracao = 240;
        float notaCritica = 8.7f; //%f
        char letraInicial = 'V'; //%c
        boolean foiSucesso = true; //%b


        System.out.println("O filme " + filme);
        System.out.println("Ano de lancamento: " + anoLancamento);
        System.out.println("Nota media: " + notaCritica);
        System.out.println("letra inicial: " + letraInicial);
        System.out.println("foi um sucesso: " + foiSucesso);



        // O filme <filme> lancado em <ano> tem uma duracao de <duracao. minutos.

        System.out.println("O filme "+ filme + " lancado em " + anoLancamento+ " tem uma duracao de "+ duracao + " minutos");
        System.out.format("O filme %s lancado em %d tem uma duracao de %d. minutos.\n", filme, anoLancamento, duracao);
        

        String canal = "academia dos devs";
        String mensagem= "se increva no canal";
        String msg2= "obrigado ";
        System.out.format("%s %s %s",canal, mensagem, msg2);
    }
}
