# Calculadora de Reajuste Salarial em Java

Programa de console desenvolvido em Java moderno (23+) que calcula o aumento salarial de um colaborador com base em sua faixa de remuneração atual, exibindo o percentual aplicado, o valor do acréscimo e o novo salário.

## Tabela de Faixas de Reajuste

| Faixa Salarial Atual | Percentual de Aumento |
| :--- | :--- |
| Até R$ 1.000,00 | 20% |
| De R$ 1.000,01 a R$ 1.700,00 | 15% |
| De R$ 1.700,01 a R$ 2.300,00 | 10% |
| Acima de R$ 2.300,00 | 5% |

## Boas Práticas Aplicadas

- **Sintaxe Moderna (`java.lang.IO` e `void main()`):** Uso de métodos simplificados de entrada e saída no console.
- **Princípio DRY (Don't Repeat Yourself):** Remoção de cálculos e impressões duplicadas nos blocos condicionais, isolando apenas a regra de obtenção da taxa.
- **Modularização:** Separação clara entre validação/leitura (`main`), regra de negócio (`obterPercentualReajuste`) e apresentação (`exibirResumo`).
- **Text Blocks (`"""`) e `String.format`:** Exibição limpa do relatório final com formatação monetária de duas casas decimais.
- **Tratamento de Entradas:** Validação contra valores menores ou iguais a zero, suporte a vírgula ou ponto e captura de `NumberFormatException`.

## Pré-requisitos

- **JDK 23** ou superior (utilize a flag `--enable-preview` nas versões 23 e 24, ou execute nativamente a partir do **JDK 25**).

## Como Executar

1. Salve o código em um arquivo chamado `ReajusteSalarial.java`.
2. Abra o terminal na pasta do arquivo e execute:

   **Java 25 ou superior:**
   ```bash
   java ReajusteSalarial.java
