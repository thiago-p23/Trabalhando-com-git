# Calculadora de Conta de Água (5 Faixas Tarifárias)

Programa de console desenvolvido em Java moderno (23+) que calcula o valor mensal da fatura de água a partir do consumo informado em metros cúbicos (m³), aplicando a tarifa correspondente entre cinco faixas de consumo.

## Tabela de Tarifas

| Faixa de Consumo (m³) | Regra de Cobrança |
| :--- | :--- |
| Até 10 m³ | Tarifa mínima fixa de R$ 7,59 |
| De 10,01 a 20 m³ | R$ 1,32 por m³ consumido |
| De 20,01 a 30 m³ | R$ 4,64 por m³ consumido |
| De 30,01 a 50 m³ | R$ 6,62 por m³ consumido |
| Acima de 50 m³ | R$ 9,64 por m³ consumido |

## Boas Práticas Aplicadas

- **Sintaxe Moderna (`java.lang.IO` e `void main()`):** Uso de métodos simplificados de entrada e saída no terminal.
- **Early Return:** Validação antecipada de valores negativos para evitar estruturas condicionais aninhadas.
- **Uso de Constantes (`final`):** Tarifas definidas em constantes para facilitar a manutenção e leitura do código.
- **Modularização:** Regra de cálculo isolada em um método dedicado (`calcularCusto`).
- **Tratamento de Entradas e Saídas:** Suporte a separador decimal com vírgula ou ponto, tratamento de `NumberFormatException` e exibição formatada com duas casas decimais.

## Pré-requisitos

- **JDK 23** ou superior (utilize a flag `--enable-preview` nas versões 23 e 24, ou execute nativamente a partir do **JDK 25**).

## Como Executar

1. Salve o código em um arquivo chamado `CalculoAguaFaixas.java`.
2. Abra o terminal na pasta do arquivo e execute:

   **Java 25 ou superior:**
   ```bash
   java CalculoAguaFaixas.java
