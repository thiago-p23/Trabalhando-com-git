# Calculadora de Descontos Salariais (INSS e IRRF)

Programa de console desenvolvido em Java moderno (23+) que calcula os descontos de INSS e Imposto de Renda Retido na Fonte (IRRF) sobre o salário bruto informado, apresentando o detalhamento das deduções e o valor do salário líquido.

## Regras de Cálculo Aplicadas

- **INSS:** Alíquota fixa de 5% aplicada sobre o salário bruto.
- **IRRF:** Alíquota variável conforme a faixa salarial:

| Faixa Salarial Bruta | Alíquota de IRRF |
| :--- | :--- |
| Até R$ 2.500,00 | 7,5% |
| De R$ 2.500,01 a R$ 3.500,00 | 15,0% |
| De R$ 3.500,01 a R$ 4.500,00 | 22,5% |
| Acima de R$ 4.500,00 | 27,5% |

## Boas Práticas Aplicadas

- **Sintaxe Moderna (`java.lang.IO` e `void main()`):** Uso de métodos simplificados de entrada e saída no console.
- **Princípio DRY (Don't Repeat Yourself):** Remoção de cálculos e impressões duplicadas nos blocos condicionais, isolando apenas a regra de seleção da alíquota.
- **Modularização:** Separação entre validação/entrada (`main`), regra de negócio (`obterAliquotaIrrf`) e saída formatada (`exibirDemonstrativo`).
- **Text Blocks (`"""`) e `String.format`:** Exibição limpa do demonstrativo salarial com formatação monetária de duas casas decimais.
- **Tratamento de Entradas:** Validação contra valores menores ou iguais a zero, suporte a separador decimal com vírgula ou ponto e captura de `NumberFormatException`.

## Pré-requisitos

- **JDK 23** ou superior (utilize a flag `--enable-preview` nas versões 23 e 24, ou execute nativamente a partir do **JDK 25**).

## Como Executar

1. Salve o código em um arquivo chamado `DescontoSalarial.java`.
2. Abra o terminal na pasta do arquivo e execute:

   **Java 25 ou superior:**
   ```bash
   java DescontoSalarial.java
