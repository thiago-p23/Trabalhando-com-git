# Calculadora de Conta de Água

Programa de console desenvolvido em Java moderno (23+) que calcula o valor mensal da conta de água com base no consumo em metros cúbicos (m³) e nas faixas tarifárias estabelecidas.

## Tabela de Tarifas Utilizada

| Faixa de Consumo (m³) | Regra de Cobrança |
| :--- | :--- |
| Até 10 m³ | Tarifa mínima fixa de R$ 44,95 |
| De 10,01 a 20 m³ | R$ 8,75 por m³ consumido |
| De 20,01 a 50 m³ | R$ 16,76 por m³ consumido |
| Acima de 50 m³ | R$ 17,46 por m³ consumido |

## Boas Práticas Aplicadas

- **Sintaxe Moderna (`java.lang.IO` e `void main()`):** Uso de métodos simplificados de entrada e saída no terminal.
- **Uso de Constantes (`final`):** Tarifas isoladas em constantes para facilitar a manutenção e leitura do código.
- **Validação e Tratamento de Erros:** Bloqueio de valores negativos, suporte a separador decimal com vírgula ou ponto e tratamento de `NumberFormatException`.
- **Formatação de Saída:** Exibição padronizada com duas casas decimais para valores monetários e de volume.

## Pré-requisitos

- **JDK 23** ou superior (utilize a flag `--enable-preview` nas versões 23 e 24, ou execute nativamente a partir do **JDK 25**).

## Como Executar

1. Salve o código em um arquivo chamado `ContaAgua.java`.
2. Abra o terminal na pasta do arquivo e execute:

   **Java 25 ou superior:**
   ```bash
   java ContaAgua.java
