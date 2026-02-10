# 🏭 Java for Automation: Industrial Logic Diagnostic

![Java](https://img.shields.io)
![Status](https://img.shields.io)

Este repositório contém a resolução da **Tarefa Diagnóstica de Lógica de Programação**, com foco em aplicações reais de automação industrial utilizando **Java**.

## 🚀 O Diferencial do Projeto
Diferente de implementações puramente acadêmicas, estes códigos foram desenvolvidos simulando o comportamento de sistemas **SCADA** e **IHMs**, apresentando:

*   **System Logs:** Saídas de terminal com *timestamps* reais (`dd-MM-yyyy HH:mm:ss`).
*   **Nomenclatura Técnica:** Variáveis baseadas em ativos industriais (sensores, válvulas, PLCs).
*   **Modularidade:** Métodos reutilizáveis para conversão de sinais analógicos.

---

## 🛠️ Exercícios Desenvolvidos

### 📡 01. Registro de Ativos (Input/Output)
Simula o provisionamento de um sensor no sistema, capturando nome, grandeza e valor de leitura.
- **Destaque:** Formatação de saída profissional.

### 🛡️ 02. Intertravamento de Tanque (Condicionais)
Lógica de segurança para controle de nível.
- **Crítico (>=90%):** Comando para abertura de válvula de escoamento.
- **Baixo (<10%):** Comando para ativação de bomba de enchimento.
- **Estável:** Monitoramento passivo.

### 📊 03. Eficiência de Turno (Loops)
Cálculo de produtividade horária para análise de OEE.
- **Processamento:** Coleta de dados de 5 horas de produção com cálculo automático de média decimal.

### 📈 04. Data Logger de Estados (Arrays)
Análise de histórico de funcionamento da máquina.
- **Lógica:** Percorre um vetor de estados binários (0/1) para determinar o tempo total de disponibilidade operacional.

### ⚡ 05. Normalização de Sinal Analógico (Métodos)
Conversão de dados brutos (Raw Data) de 10 bits.
- **Escala:** Transforma valores de `0-1023` (Padrão PLC/Arduino) para `0-100%`.
- **Segurança:** Inclui validação de Range Check.

---

## 💻 Como Rodar
Para compilar e executar qualquer um dos módulos, utilize os comandos abaixo no terminal:

```bash
# Compilar
javac Exercicio1.java

# Executar
java Exercicio1
