# Saudação por Turno de Estudo

Programa de console desenvolvido em **Java Moderno (23+)** que identifica o turno em que o usuário estuda (Matutino, Vespertino ou Noturno) e exibe uma saudação personalizada.

## Recursos e Boas Práticas

* **Sintaxe Moderna (`java.lang.IO` e `void main()`):** Uso de entrada/saída simplificada e declaração enxuta de ponto de entrada.
* **Switch Expressions (`case ->`):** Avaliação limpa de múltiplos rótulos por caso (aceita tanto a inicial quanto o nome do turno).
* **Normalização de Entrada:** Tratamento automático com `.trim()` e `.toUpperCase()` para evitar erros por letras minúsculas ou espaços acidentais.
* **Prevenção de Falhas:** Verificação contra entradas nulas antes de manipular a `String`.

## Pré-requisitos

* **JDK 23** ou superior (com `--enable-preview` nas versões 23 e 24, ou nativamente a partir do **JDK 25**).

## Como Executar

Execute no terminal:

   **Java 25 ou superior:**
   ```bash
   java TurnoEstudo.java
