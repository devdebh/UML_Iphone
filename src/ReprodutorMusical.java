import java.util.Scanner;

public class ReprodutorMusical {

    public String escolherMusica(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma música: ");
        String musica = scanner.nextLine();
        return "A música escolhida foi " + musica;
    }

    public String tocarMusica (){
        return "Tocando música";
    }

    public String pausarMusica (){
        return "A música foi pausada";
    }


}
