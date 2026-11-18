# Sistema de Boletim Escolar em Java

Programa de console desenvolvido em Java moderno (23+) que lê quatro notas bimestrais, calcula a média aritmética, classifica o desempenho do aluno em categorias (conceitos de A a E) e informa a situação final de aprovação.

## Critérios de Avaliação

| Faixa de Média | Categoria (Conceito) | Situação |
| :--- | :--- | :--- |
| 9,0 a 10,0 | A | Aprovado |
| 7,5 a 8,9 | B | Aprovado |
| 6,0 a 7,4 | C | Aprovado |
| 4,0 a 5,9 | D | Reprovado |
| 0,0 a 3,9 | E | Reprovado |

## Boas Práticas Aplicadas

- **Sintaxe Moderna (`java.lang.IO` e `void main()`):** Entrada e saída simplificadas no console.
- **Estruturas de Repetição e Arrays:** Uso de vetor (`double[]`) e laço `for` para leitura escalável das notas, evitando duplicação de código.
- **Validação de Dados:** Garantia de que todas as notas estejam entre 0 e 10, suporte a separador decimal com vírgula ou ponto e proteção contra `NumberFormatException`.
- **Text Blocks (`"""`) e `String.format`:** Exibição limpa e padronizada do boletim com arredondamento visual de uma casa decimal.
- **Modularização:** Divisão clara de responsabilidades entre leitura (`lerNotaValida`), classificação (`obterCategoria`) e exibição (`exibirBoletim`).

## Pré-requisitos

- **JDK 23** ou superior (utilize a flag `--enable-preview` nas versões 23 e 24, ou execute nativamente a partir do **JDK 25**).

## Como Executar

1. Salve o código em um arquivo chamado `BoletimEscolar.java`.
2. Abra o terminal na pasta do arquivo e execute:

   **Java 25 ou superior:**
   ```bash
   java BoletimEscolar.java
