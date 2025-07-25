import java.util.Scanner;

public class AparelhoTelefonico {

    public String fazerLigacao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número para qual deseja fazer sua ligação: ");
        String numero = scanner.nextLine();

        String s = "Você está ligando para " + numero;
        return s;
    }

    public String atenderLigacao() {
        String ligacao = "Ligação atendida";
        return ligacao;
    }

    public String iniciarCorreioDeVoz(){
        String correioDeVoz = "Após o sinal deixe sua mensagem";
        return correioDeVoz;
    }
}

