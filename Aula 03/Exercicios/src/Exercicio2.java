import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercicio2 {
    public static void main(String[] args) {
        // Define o padrão de formatação de data e hora
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Abre o scanner para leitura do teclado
        Scanner input = new Scanner(System.in);

        // Inicia um loop infinito (o programa rodará até ser encerrado manualmente)
        while(true) {

            // Leitura do nível do tanque
            System.out.print("[" + dtf.format(LocalDateTime.now()) + "] [SYSTEM] Informe o nível do tanque: ");
            int nivelTanque = input.nextInt();

            // Verificação de Nível Crítico (Igual ou acima de 90%)
            if (nivelTanque >= 90) {
                System.out.println("[" + dtf.format(LocalDateTime.now()) + "] [ALERTA]: Nível Crítico - Abrir Válvula de Escoamento!\n");
            }
            // Verificação de Nível Baixo (Abaixo de 10%)
            else if (nivelTanque < 10) {
                System.out.println("[" + dtf.format(LocalDateTime.now()) + "] [ALERTA]: Nível Baixo - Ativar Bomba de Enchimento!\n");
            }
            // Condição para níveis entre 10% e 89% (Segurança)
            else {
                System.out.println("[" + dtf.format(LocalDateTime.now()) + "] [INFO]: Sistema Estável - Nível em " + nivelTanque + "%\n");
            }
        }
    }
}