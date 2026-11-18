# 📋 Menu Interativo em Java Moderno

Um projeto simples e direto de menu de console desenvolvido para demonstrar recursos modernos do **Java 23+**, boas práticas de programação, tratamento de exceções e código limpo.

## ✨ Funcionalidades e Boas Práticas Aplicadas

* **Sintaxe Moderna (`java.lang.IO` e `void main()`):** Uso de métodos de entrada/saída simplificados e assinatura `main` enxuta (sem a verbosidade tradicional de classes e `public static void main`).
* **Switch Expressions (`case ->`):** Controle de fluxo mais seguro e legível, eliminando a necessidade de `break` e prevenindo falhas de *fall-through*.
* **Text Blocks (`"""`):** Formatação visual e limpa para a exibição do menu no terminal.
* **Tratamento de Erros (`try-catch`):** Proteção contra `NumberFormatException`, impedindo que o programa feche inesperadamente caso o usuário digite letras, símbolos ou deixe a entrada em branco.
* **Código Modular:** Separação de responsabilidades com método dedicado para exibição do menu e uso de constantes para evitar *magic numbers*.

## 🛠️ Pré-requisitos

Para compilar e executar este projeto, você precisa ter instalado:
* **JDK 23** ou superior (necessário para o suporte estável ao `import static java.lang.IO.*` e *Compact Source Files*).

> 💡 *Nota: Caso esteja utilizando o Java 23 ou 24 onde esses recursos ainda estavam em modo preview, lembre-se de adicionar a flag `--enable-preview` na compilação e execução. A partir do Java 25, funcionam nativamente.*
