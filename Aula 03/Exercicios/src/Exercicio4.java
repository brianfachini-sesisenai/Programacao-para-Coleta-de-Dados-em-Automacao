import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercicio4 {
    public static void main(String[] args) {
        // Define o padrão de formatação de data e hora
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Simulação de estados da máquina (1 = Ligada, 0 = Desligada)
        int[] historico = {1, 0, 1, 1};

        // Variável para guardar a contagem
        int contadorOperacao = 0;

        System.out.println("[" + dtf.format(LocalDateTime.now()) + "] [INFO]: Iniciando leitura do histórico...");

        // Percorre cada item da lista (historico)
        for (int estado : historico) {
            // Se o estado for igual a 1, soma no contador
            if (estado == 1) {
                contadorOperacao++;
            }
        }

        // Mostra o resultado final com o horário
        System.out.println("[" + dtf.format(LocalDateTime.now()) + "] [RESULTADO]: A máquina operou " + contadorOperacao + " vezes.");
    }
}