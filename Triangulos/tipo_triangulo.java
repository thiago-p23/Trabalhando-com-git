// Importa métodos estáticos de entrada e saída (recurso moderno do Java 23+)
import static java.lang.IO.*;

void main() {
    try {
        // Lê os três lados utilizando um método auxiliar que trata vírgulas e espaços
        double ladoA = lerLado("Informe o lado A: ");
        double ladoB = lerLado("Informe o lado B: ");
        double ladoC = lerLado("Informe o lado C: ");

        // Valida se todas as medidas são estritamente positivas
        if (ladoA <= 0 || ladoB <= 0 || ladoC <= 0) {
            println("Erro: Todos os lados devem ser maiores que zero.");
            return;
        }

        // Verifica a condição de existência de um triângulo (Desigualdade Triangular)
        if (!formaTriangulo(ladoA, ladoB, ladoC)) {
            println("Os valores informados não formam um triângulo.");
            return;
        }

        // Classifica o triângulo e exibe o resultado
        String classificacao = classificarTriangulo(ladoA, ladoB, ladoC);
        println("Resultado: " + classificacao);

    } catch (NumberFormatException e) {
        // Evita que o programa quebre caso o usuário digite letras ou deixe em branco
        println("Erro: Entrada inválida! Informe apenas valores numéricos.");
    }
}

// Método auxiliar para ler a entrada e converter para double (aceita vírgula ou ponto)
double lerLado(String mensagem) {
    String entrada = readln(mensagem);
    return Double.parseDouble(entrada.trim().replace(",", "."));
}

// Verifica se a soma de quaisquer dois lados é sempre maior que o terceiro lado
boolean formaTriangulo(double a, double b, double c) {
    return (a + b > c) && (a + c > b) && (b + c > a);
}

// Retorna o tipo do triângulo com base na igualdade de seus lados
String classificarTriangulo(double a, double b, double c) {
    if (a == b && b == c) {
        return "Triângulo Equilátero (todos os lados iguais).";
    } else if (a == b || a == c || b == c) {
        return "Triângulo Isósceles (dois lados iguais).";
    } else {
        return "Triângulo Escaleno (todos os lados diferentes).";
    }
}
