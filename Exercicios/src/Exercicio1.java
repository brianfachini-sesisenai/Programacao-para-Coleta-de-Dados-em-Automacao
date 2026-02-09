import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercicio1 {
    public static void main(String[] args) {
        // Define o padrão de formatação de data e hora
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Abre o scanner para leitura do teclado
        Scanner input = new Scanner(System.in);

        // Inicio estilo Log do Sistema
        System.out.println("[" + dtf.format(LocalDateTime.now()) + "] [SYSTEM] Iniciando núcleo de configuração...");
        System.out.println("[" + dtf.format(LocalDateTime.now()) + "] [INFO] Aguardando parâmetros do usuário.\n");

        // Leitura do nome do sensor
        System.out.print("Digite o nome do sensor: ");
        String nomeSensor = input.nextLine();

        // Leitura da grandeza que será utilizada
        System.out.print("Digite a grandeza medida: ");
        String Grandeza = input.nextLine();

        // Leitura do valor do sensor
        System.out.print("Digite o valor da leitura: ");
        double valorLeitura = input.nextDouble();

        // Exibição da mensagem
        System.out.println("\n[" + dtf.format(LocalDateTime.now()) + "] [INFO] SENSOR REGISTRADO\nNome: " + nomeSensor + " registado\nValor: " + valorLeitura + "\nGrandeza utilizada: " + Grandeza);

        input.close();
    }
}