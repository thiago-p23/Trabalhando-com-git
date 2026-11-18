// Importa métodos estáticos de entrada e saída (recurso moderno do Java 23+)
import static java.lang.IO.*;

void main() {
    // Lê a entrada diretamente com prompt integrado e trata espaços e letras minúsculas
    String entrada = readln("Digite o turno em que você estuda (M - Matutino, T - Vespertino, N - Noturno): ");
    
    // Normaliza o texto (remove espaços extras e converte para maiúscula) evitando NullPointerException
    String turno = (entrada != null) ? entrada.trim().toUpperCase() : "";

    // Switch Expression (Java 14+): retorna o valor diretamente, é mais limpo e dispensa o 'break'
    String mensagem = switch (turno) {
        case "M", "MATUTINO" -> "Bom dia! Ótimos estudos pela manhã.";
        case "T", "VESPERTINO", "TARDE" -> "Boa tarde! Ótimos estudos à tarde.";
        case "N", "NOTURNO", "NOITE" -> "Boa noite! Ótimos estudos à noite.";
        default -> "Erro: Turno inválido! Por favor, informe M, T ou N.";
    };

    // Saída única e centralizada
    println(mensagem);
}
