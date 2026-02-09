import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercicio3 {
    public static void main(String[] args) {
        // Define o padrão de formatação de data e hora
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Abre o scanner para leitura do teclado
        Scanner input = new Scanner(System.in);

        int somaProducao = 0;

        // Cabeçalho do processo de coleta
        System.out.println("[" + dtf.format(LocalDateTime.now()) + "] [SYSTEM] Iniciando coleta de dados de produção (Turno: 5h)...\n");

        // Loop definido para 5 iterações (representando 5 horas de trabalho)
        for (int hora = 1; hora <= 5; hora++) {

            // Solicita a produção da hora específica com estilo de LOG
            System.out.print("[" + dtf.format(LocalDateTime.now()) + "] [INPUT] Produção da Hora " + hora + ": ");
            int producaoHora = input.nextInt();

            // Soma o valor lido na variável somaProducao
            somaProducao += producaoHora;
        }

        // Calcula a média (divisão por 5.0 para garantir resultado decimal)
        double media = somaProducao / 5.0;

        // Exibição dos resultados finais estilo relatório de fechamento
        System.out.println("\n--------------------------------------------------");
        System.out.println("[" + dtf.format(LocalDateTime.now()) + "] [REPORT] RESUMO DA PRODUÇÃO:");
        System.out.println("> Total acumulado: " + somaProducao + " unidades.");
        System.out.println("> Eficiência média: " + media + " unidades/hora.");
        System.out.println("--------------------------------------------------");

        input.close(); // Fecha o scanner, liberando memória
    }
}