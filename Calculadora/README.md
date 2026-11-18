# Calculadora Interativa em Java

Programa de console desenvolvido em Java moderno (23+) que realiza operações matemáticas básicas, cálculos de potência e raiz quadrada, além de verificar a paridade de números.

## Funcionalidades

- **Operações Básicas:** Adição, subtração, multiplicação e divisão (com validação contra divisão por zero).
- **Operações Avançadas:** Cálculo de potência (`Math.pow`) e raiz quadrada (`Math.sqrt`, com validação para números negativos).
- **Verificação de Paridade:** Identifica se um número informado é par ou ímpar.
- **Tratamento de Entradas:** Suporte a números decimais com ponto ou vírgula e captura de exceções (`NumberFormatException`) para entradas inválidas.

## Boas Práticas Aplicadas

- **Sintaxe Moderna (`java.lang.IO` e `void main()`):** Uso de métodos simplificados de entrada e saída no console.
- **Switch Expressions (`case ->`):** Substituição de longas cadeias de `if / else if` por expressões mais legíveis.
- **Text Blocks (`"""`):** Formatação clara e organizada do menu de opções.
- **Modularização:** Separação da lógica de exibição do menu e leitura de números em métodos auxiliares.

## Pré-requisitos

- **JDK 23** ou superior (utilize a flag `--enable-preview` nas versões 23 e 24, ou execute nativamente a partir do **JDK 25**).

## Como Executar

1. Salve o código em um arquivo chamado `Calculadora.java`.
2. Abra o terminal na pasta do arquivo e execute:

   **Java 25 ou superior:**
   ```bash
   java Calculadora.java
