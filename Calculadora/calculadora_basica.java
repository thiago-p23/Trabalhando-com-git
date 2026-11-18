// Importa métodos estáticos de entrada e saída (recurso moderno do Java 23+)
import static java.lang.IO.*;

void main() {
    exibirMenu();

    try {
        // Lê a operação primeiro para saber se precisa pedir 1 ou 2 números
        String operacao = readln("Escolha uma operação (1 a 8): ").trim();

        // Verifica se a operação é válida antes de solicitar os valores
        if (!operacao.matches("[1-8]")) {
            println("Erro: Operação inválida! Escolha um número entre 1 e 8.");
            return;
        }

        // Lê o primeiro número (necessário para todas as operações)
        double valor1 = lerNumero("Insira o primeiro valor: ");

        // Operações de 1 a 5 precisam de dois números; de 6 a 8 usam apenas um
        double valor2 = 0;
        if (operacao.matches("[1-5]")) {
            valor2 = lerNumero("Insira o segundo valor: ");
        }

        // Switch Expression (Java 14+): mais limpo e legível do que vários 'if / else if'
        String resultado = switch (operacao) {
            case "1" -> "Resultado da adição: " + (valor1 + valor2);
            case "2" -> "Resultado da subtração: " + (valor1 - valor2);
            case "3" -> "Resultado da multiplicação: " + (valor1 * valor2);
            case "4" -> (valor2 == 0)
                    ? "Erro: Não é possível dividir por zero."
                    : "Resultado da divisão: " + (valor1 / valor2);
            case "5" -> "Resultado da potência: " + Math.pow(valor1, valor2);
            case "6" -> (valor1 < 0)
                    ? "Erro: Não existe raiz quadrada real de número negativo."
                    : "Raiz quadrada de " + valor1 + ": " + Math.sqrt(valor1);
            case "7" -> "O número " + valor1 + (valor1 % 2 == 0 ? " é PAR." : " NÃO é par.");
            case "8" -> "O número " + valor1 + (valor1 % 2 != 0 ? " é ÍMPAR." : " NÃO é ímpar.");
            default -> "Erro: Operação inválida.";
        };

        // Exibe o resultado final
        println(resultado);

    } catch (NumberFormatException e) {
        // Evita que o programa quebre se o usuário digitar letras ou deixar vazio
        println("Erro: Entrada inválida! Digite apenas valores numéricos (use ponto para decimais).");
    }
}

// Exibe o menu de operações utilizando Text Block (Java 15+)
void exibirMenu() {
    println("""
            ===== CALCULADORA =====
            1 - Adição
            2 - Subtração
            3 - Multiplicação
            4 - Divisão
            5 - Potência
            6 - Raiz quadrada
            7 - Verificar número par
            8 - Verificar número ímpar
            =======================
            """);
}

// Método auxiliar para ler e converter texto em número decimal (double)
double lerNumero(String mensagem) {
    String entrada = readln(mensagem);
    // Substitui vírgula por ponto caso o usuário digite no padrão brasileiro (ex: 5,5 -> 5.5)
    return Double.parseDouble(entrada.trim().replace(",", "."));
}
