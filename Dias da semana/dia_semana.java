// Importa métodos estáticos de entrada e saída (recurso moderno do Java 23+)
import static java.lang.IO.*;

void main() {
    // Lê a entrada diretamente com o prompt integrado
    String entrada = readln("Insira um número de 1 a 7: ");
    
    // Remove espaços acidentais e protege contra entrada nula (ex: Ctrl+D no terminal)
    String diaNumero = (entrada != null) ? entrada.trim() : "";

    // Switch Expression (Java 14+): substitui a cadeia de 'if / else if' de forma limpa e direta
    String diaSemana = switch (diaNumero) {
        case "1" -> "Domingo";
        case "2" -> "Segunda-feira";
        case "3" -> "Terça-feira";
        case "4" -> "Quarta-feira";
        case "5" -> "Quinta-feira";
        case "6" -> "Sexta-feira";
        case "7" -> "Sábado";
        default -> "Erro: Valor inválido! Digite um número inteiro entre 1 e 7.";
    };

    // Exibe o resultado uma única vez
    println(diaSemana);
}
