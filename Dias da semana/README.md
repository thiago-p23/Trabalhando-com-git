# Identificador de Dia da Semana em Java

Programa de console desenvolvido em Java moderno (23+) que recebe um número inteiro de 1 a 7 e exibe o dia da semana correspondente.

## Tabela de Correspondência

| Número Informado | Dia da Semana |
| :--- | :--- |
| 1 | Domingo |
| 2 | Segunda-feira |
| 3 | Terça-feira |
| 4 | Quarta-feira |
| 5 | Quinta-feira |
| 6 | Sexta-feira |
| 7 | Sábado |

## Boas Práticas Aplicadas

- **Sintaxe Moderna (`java.lang.IO` e `void main()`):** Uso de entrada e saída simplificada no console.
- **Switch Expressions (`case ->`):** Substituição de estruturas condicionais encadeadas (`if / else if`) por uma expressão direta que retorna o valor correspondente.
- **Tratamento de Entradas:** Remoção de espaços em branco com `.trim()` e verificação contra valores nulos antes da avaliação.
- **Convenções da Linguagem:** Uso de nomenclatura *camelCase* para variáveis.

## Pré-requisitos

- **JDK 23** ou superior (utilize a flag `--enable-preview` nas versões 23 e 24, ou execute nativamente a partir do **JDK 25**).

## Como Executar

1. Salve o código em um arquivo chamado `DiaDaSemana.java`.
2. Abra o terminal na pasta do arquivo e execute:

   **Java 25 ou superior:**
   ```bash
   java DiaDaSemana.java
