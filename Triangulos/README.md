# Classificador de Triângulos em Java

Programa de console desenvolvido em Java moderno (23+) que valida se três medidas informadas podem formar um triângulo e, em caso afirmativo, classifica-o de acordo com o comprimento de seus lados.

## Regras Matemáticas Aplicadas

1. **Validação de Medida:** Todos os lados devem ser maiores que zero.
2. **Condição de Existência (Desigualdade Triangular):** A soma das medidas de quaisquer dois lados deve ser estritamente maior que a medida do terceiro lado ($A + B > C$, $A + C > B$ e $B + C > A$).
3. **Classificação:**
   - **Equilátero:** Três lados com medidas iguais.
   - **Isósceles:** Dois lados com medidas iguais e um diferente.
   - **Escaleno:** Três lados com medidas diferentes entre si.

## Boas Práticas Aplicadas

- **Sintaxe Moderna (`java.lang.IO` e `void main()`):** Uso de entrada e saída simplificada no console.
- **Modularização:** Separação de responsabilidades em métodos dedicados (`lerLado`, `formaTriangulo` e `classificarTriangulo`).
- **Early Return:** Validações antecipadas que evitam estruturas condicionais aninhadas.
- **Tratamento de Entradas:** Suporte a números decimais com vírgula ou ponto e proteção contra `NumberFormatException`.

## Pré-requisitos

- **JDK 23** ou superior (utilize a flag `--enable-preview` nas versões 23 e 24, ou execute nativamente a partir do **JDK 25**).

## Como Executar

1. Salve o código em um arquivo chamado `ClassificadorTriangulo.java`.
2. Abra o terminal na pasta do arquivo e execute:

   **Java 25 ou superior:**
   ```bash
   java ClassificadorTriangulo.java
