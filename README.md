Este repositório reúne 9 programas de console desenvolvidos em **Java 23+**, abordando estruturas condicionais, laços de repetição, validação de entradas, tratamento de exceções e modularização de código.

---

## Sumário

1. [Visão Geral dos Programas](#visão-geral-dos-programas)
2. [Explicação Detalhada dos Métodos Criados](#explicação-detalhada-dos-métodos-criados)
3. [Métodos Nativos e Recursos do Java Utilizados](#métodos-nativos-e-recursos-do-java-utilizados)
4. [Pré-requisitos](#pré-requisitos)
5. [Como Executar](#como-executar)
6. [Licença](#licença)

---

## Visão Geral dos Programas

| Arquivo Sugerido | Descrição | Principais Estruturas |
| :--- | :--- | :--- |
| `MenuInterativo.java` | Menu de opções em loop com tratamento de entradas inválidas. | `do-while`, `switch`, `try-catch` |
| `TurnoEstudo.java` | Identifica o turno (M, T ou N) e exibe a saudação adequada. | `switch`, normalização de `String` |
| `Calculadora.java` | Realiza 8 operações matemáticas (básicas, potência, raiz e paridade). | `switch`, Regex, `Math` |
| `ContaAgua4Faixas.java` | Calcula fatura de água com base em 4 faixas de consumo em m³. | `if / else if`, constantes `final` |
| `ClassificadorTriangulo.java` | Valida a desigualdade triangular e classifica o tipo do triângulo. | Operadores lógicos, *Early Return* |
| `BoletimEscolar.java` | Lê 4 notas, valida o intervalo (0 a 10), calcula a média e define o conceito. | Arrays, laço `for`, `while` |
| `CalculoAguaSimples.java` | Calcula conta de água com tarifa mínima e faixas progressivas simples. | *Early Return*, `String.format` |
| `CalculoAgua5Faixas.java` | Calcula conta de água considerando 5 faixas tarifárias distintas. | Modularização, `String.format` |
| `ReajusteSalarial.java` | Aplica percentuais de aumento conforme a faixa salarial atual. | Princípio DRY, *Text Blocks* |
| `DescontoSalarial.java` | Calcula descontos de INSS (fixo) e IRRF (por faixa) e exibe o salário líquido. | Constantes, formatação monetária |
| `CalculadoraImc.java` | Calcula o Índice de Massa Corporal e retorna a classificação nutricional. | `Math.pow`, validação de entrada |
| `DiaDaSemana.java` | Converte um número inteiro (1 a 7) no dia da semana correspondente. | `switch` expression |

---

## Explicação Detalhada dos Métodos Criados

Para evitar código repetitivo e separar responsabilidades, a lógica dos programas foi dividida em métodos auxiliares específicos:

### 1. Entrada e Validação de Dados

- **`double lerNumero(String mensagem)`** *(Calculadora, Classificador de Triângulo e Calculadora de IMC)*
  - **Objetivo:** Centralizar a leitura de valores numéricos decimais.
  - **Funcionamento:** Exibe a mensagem passada por parâmetro usando `readln()`, remove espaços em branco nas extremidades com `.trim()`, substitui vírgulas por pontos com `.replace(",", ".")` (permitindo o padrão numérico brasileiro) e converte o texto para `double` via `Double.parseDouble()`.

- **`double lerNotaValida(String mensagem)`** *(Boletim Escolar)*
  - **Objetivo:** Garantir que a nota digitada esteja dentro do intervalo permitido.
  - **Funcionamento:** Utiliza um laço `while (true)` que só é encerrado pelo `return` quando o número convertido for maior ou igual a `0` e menor ou igual a `10`. Caso contrário, exibe um aviso e solicita a digitação novamente.

### 2. Regras de Negócio e Cálculos

- **`boolean formaTriangulo(double a, double b, double c)`** *(Classificador de Triângulo)*
  - **Objetivo:** Verificar a condição matemática de existência de um triângulo.
  - **Funcionamento:** Retorna `true` apenas se a soma de quaisquer dois lados for estritamente maior que o terceiro lado (`(a + b > c) && (a + c > b) && (b + c > a)`).

- **`String classificarTriangulo(double a, double b, double c)`** *(Classificador de Triângulo)*
  - **Objetivo:** Determinar o tipo do triângulo com base na igualdade de seus lados.
  - **Funcionamento:** Compara os três valores e retorna `"Triângulo Equilátero"` (todos iguais), `"Triângulo Isósceles"` (dois iguais) ou `"Triângulo Escaleno"` (todos diferentes).

- **`double calcularCusto(double consumo, ...)`** *(Calculadoras de Conta de Água)*
  - **Objetivo:** Isolar a regra tarifária da leitura e exibição de dados.
  - **Funcionamento:** Recebe o consumo em m³ e os valores das tarifas (passados como parâmetros), retornando a tarifa mínima fixa para consumos até 10 m³ ou multiplicando o consumo pela tarifa da faixa correspondente.

- **`String obterCategoria(double media)`** *(Boletim Escolar)*
  - **Objetivo:** Converter a média numérica em um conceito alfabético.
  - **Funcionamento:** Avalia a média de forma crescente (`< 4.0`, `< 6.0`, `< 7.5`, `< 9.0`) e retorna a letra correspondente (`E`, `D`, `C`, `B` ou `A`).

- **`double obterPercentualReajuste(double salario)`** *(Reajuste Salarial)*
  - **Objetivo:** Identificar a taxa de aumento aplicável ao salário.
  - **Funcionamento:** Retorna o fator decimal correspondente à faixa salarial (`0.20`, `0.15`, `0.10` ou `0.05`), eliminando a necessidade de repetir cálculos dentro dos blocos condicionais.

- **`double obterAliquotaIrrf(double salario)`** *(Desconto Salarial)*
  - **Objetivo:** Definir a alíquota do Imposto de Renda Retido na Fonte.
  - **Funcionamento:** Avalia o salário bruto e retorna o percentual decimal respectivo (`0.075`, `0.150`, `0.225` ou `0.275`).

- **`String classificarImc(double imc)`** *(Calculadora de IMC)*
  - **Objetivo:** Traduzir o índice numérico em uma faixa de classificação de saúde.
  - **Funcionamento:** Compara o valor do IMC contra os limites estabelecidos (de `< 16.0` até `>= 40.0`) e retorna a descrição correspondente (de *Magreza grave* a *Obesidade grau III*).

### 3. Exibição e Formatação de Saída

- **`void exibirMenu()`** *(Menu Interativo e Calculadora)*
  - **Objetivo:** Isolar a interface textual do menu principal.
  - **Funcionamento:** Utiliza um *Text Block* (`"""`) para imprimir as opções alinhadas no console sem a necessidade de múltiplas chamadas a `println()`.

- **`void exibirBoletim(double[] notas, double media, String categoria, String situacao)`** *(Boletim Escolar)*
  - **Objetivo:** Apresentar o relatório final do aluno de forma estruturada.
  - **Funcionamento:** Combina *Text Block* com `String.format()` para exibir as quatro notas e a média formatadas com uma casa decimal (`%.1f`), além da categoria e situação.

- **`void exibirResumo(...)` / `void exibirDemonstrativo(...)`** *(Reajuste Salarial e Desconto Salarial)*
  - **Objetivo:** Padronizar a saída financeira dos programas de folha de pagamento.
  - **Funcionamento:** Formata todos os valores monetários com duas casas decimais (`R$ %.2f`) e percentuais (`%.0f%%` ou `%.1f%%`), exibindo um quadro resumido no terminal.

---

## Métodos Nativos e Recursos do Java Utilizados

- **`java.lang.IO.println()` e `java.lang.IO.readln()`:** Métodos estáticos introduzidos nas versões modernas do Java (JEP 477 / JEP 495) para simplificar a escrita e leitura no console sem a necessidade de instanciar a classe `Scanner` ou escrever `System.out`.
- **`void main()` (Instance Main Methods):** Permite declarar o ponto de entrada do programa diretamente, dispensando a estrutura verbosa de `public class` e `public static void main(String[] args)`.
- **`Double.parseDouble()` e `Integer.parseInt()`:** Métodos das classes *Wrapper* responsáveis por converter cadeias de texto (`String`) em tipos primitivos numéricos (`double` e `int`). Lança `NumberFormatException` caso o texto não represente um número válido.
- **`String.trim()`:** Remove espaços em branco no início e no fim da entrada do usuário.
- **`String.toUpperCase()`:** Converte todos os caracteres de uma `String` para maiúsculo, facilitando comparações *case-insensitive*.
- **`String.replace(char oldChar, char newChar)`:** Substitui ocorrências de um caractere por outro (usado para trocar `,` por `.` em números decimais).
- **`String.matches(String regex)`:** Verifica se o texto corresponde a uma expressão regular (ex: `"[1-8]"` valida se a entrada é um único dígito entre 1 e 8).
- **`String.format(String format, Object... args)`:** Formata textos com marcadores específicos, como `%.2f` (duas casas decimais), `%.1f` (uma casa decimal), `%s` (texto) e `%%` (símbolo literal de porcentagem).
- **`Math.pow(double a, double b)`:** Calcula a potência de uma base `a` elevada a um expoente `b`.
- **`Math.sqrt(double a)`:** Retorna a raiz quadrada positiva de um número `double`.
- **Switch Expressions (`case valor -> resultado;`):** Sintaxe moderna do Java (14+) que permite retornar valores diretamente de um bloco `switch` e elimina o risco de execução acidental em cascata (*fall-through*), dispensando o comando `break`.
- **Text Blocks (`"""`):** Strings multilinha (Java 15+) que preservam a formatação visual e indentação diretamente no código-fonte.

---

## Pré-requisitos

- **JDK 23** ou superior.
  - Nas versões **23 e 24**, os recursos de entrada/saída simplificada e *Compact Source Files* exigem a flag `--enable-preview`.
  - A partir do **JDK 25**, esses recursos são nativos e não exigem flags adicionais.

---

## Como Executar

1. Salve o código desejado em um arquivo com extensão `.java` (por exemplo, `Calculadora.java`).
2. Abra o terminal no diretório onde o arquivo foi salvo.
3. Execute o comando correspondente à sua versão do Java:

   **Java 25 ou superior:**
   ```bash
   java NomeDoArquivo.java
