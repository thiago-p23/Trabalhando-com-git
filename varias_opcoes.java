// Importa métodos estáticos de entrada e saída (recurso do Java 23+)
import static java.lang.IO.*;

// Método main simplificado (Compact Source Files / Instance Main Methods)
void main() {
    // Define uma constante para a opção de saída, facilitando a manutenção
    final int OPCAO_SAIR = 4;
    int opcao = 0;

    // O laço 'do-while' garante que o menu seja exibido pelo menos uma vez
    do {
        exibirMenu();

        try {
            // Lê a entrada do usuário e tenta converter para um número inteiro
            String entrada = readln("Digite uma opção: ");
            opcao = Integer.parseInt(entrada.trim()); // .trim() remove espaços acidentais

            // Switch Expression (Java 14+): mais limpo, seguro e dispensa o uso de 'break'
            switch (opcao) {
                case 1 -> println("-> Você selecionou a opção 1.");
                case 2 -> println("-> Você selecionou a opção 2.");
                case 3 -> println("-> Você selecionou a opção 3.");
                case OPCAO_SAIR -> println("-> Encerrando o programa...");
                default -> println("Erro: Opção inválida! Escolha um número entre 1 e 4.");
            }

        } catch (NumberFormatException e) {
            // Captura o erro caso o usuário digite letras ou deixe em branco
            println("Erro: Entrada inválida! Por favor, digite apenas números.");
            opcao = 0; // Garante que o loop continue rodando
        }

    } while (opcao != OPCAO_SAIR);

    println("Fim do programa.");
}

// Método auxiliar para isolar a responsabilidade de mostrar o menu
void exibirMenu() {
    // Text Block (Java 15+): facilita a formatação de textos com várias linhas
    println("""
            
            ===== MENU =====
            1 - Opção 1
            2 - Opção 2
            3 - Opção 3
            4 - Sair
            ================
            """);
}
