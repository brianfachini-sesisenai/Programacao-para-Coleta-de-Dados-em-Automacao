import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercicio5 {
    public static void main(String[] args) {
        // Define o padrão de formatação de data e hora
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Abre o scanner para leitura do teclado
        Scanner input = new Scanner(System.in);

        // Pede o valor para o usuário com o timestamp do log
        System.out.print("[" + dtf.format(LocalDateTime.now()) + "] [INPUT] Valor a ser convertido: ");
        int valorBruto = input.nextInt();

        // Validação: Garante que o valor está dentro do limite do sensor (0 a 1023)
        if (valorBruto > 1023 || valorBruto < 0) {
            System.out.println("[" + dtf.format(LocalDateTime.now()) + "] [ALERTA] Valor inválido! Insira de 0 a 1023.");
        }
        else {
            // Se o valor for válido, chama o metodo de conversão
            double resultado = converterEscala(valorBruto);

            // Exibe o passo a passo do processamento
            System.out.println("[" + dtf.format(LocalDateTime.now()) + "] [PROCESS] Convertendo sinal analógico...");
            System.out.println("[" + dtf.format(LocalDateTime.now()) + "] [INFO] Valor Bruto: " + valorBruto);
            System.out.println("[" + dtf.format(LocalDateTime.now()) + "] [RESULT] Escala convertida: " + resultado + "%");
        }

        // Fecha o scanner para liberar a memória
        input.close();
    }

    // Metodo que faz o cálculo matemático da conversão
    public static double converterEscala(double valor) {
        // Regra de três: (valor atual / valor máximo) * 100
        return (valor / 1023.0) * 100;
    }
}