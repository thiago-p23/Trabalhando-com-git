# Calculadora de IMC em Java

Programa de console desenvolvido em Java moderno (23+) que calcula o Índice de Massa Corporal (IMC) a partir da altura e do peso informados pelo usuário, exibindo o valor arredondado e a respectiva classificação nutricional.

## Tabela de Classificação Utilizada

| Faixa de IMC (kg/m²) | Classificação |
| :--- | :--- |
| Abaixo de 16,0 | Magreza grave |
| De 16,0 a 16,9 | Magreza moderada |
| De 17,0 a 18,4 | Magreza leve |
| De 18,5 a 24,9 | Saudável (peso normal) |
| De 25,0 a 29,9 | Sobrepeso |
| De 30,0 a 34,9 | Obesidade grau I |
| De 35,0 a 39,9 | Obesidade grau II (severa) |
| 40,0 ou acima | Obesidade grau III (mórbida) |

## Boas Práticas Aplicadas

- **Sintaxe Moderna (`java.lang.IO` e `void main()`):** Uso de métodos simplificados de entrada e saída no console.
- **Modularização:** Separação da leitura de dados (`lerNumero`) e da lógica de classificação (`classificarImc`) em métodos dedicados.
- **Validação de Dados:** Bloqueio de valores menores ou iguais a zero (prevenindo divisão por zero), suporte a separador decimal com vírgula ou ponto e tratamento de `NumberFormatException`.
- **Formatação de Saída:** Uso de `String.format` para exibir o índice com duas casas decimais.

## Pré-requisitos

- **JDK 23** ou superior (utilize a flag `--enable-preview` nas versões 23 e 24, ou execute nativamente a partir do **JDK 25**).

## Como Executar

1. Salve o código em um arquivo chamado `CalculadoraImc.java`.
2. Abra o terminal na pasta do arquivo e execute:

   **Java 25 ou superior:**
   ```bash
   java CalculadoraImc.java
