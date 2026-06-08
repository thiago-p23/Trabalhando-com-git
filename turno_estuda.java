import static java.lang.IO.*;

void main() {

    // Entrada
    println("Digite o turno em que você estuda (M, T ou N): ");
    String turno = readln();

    // Processo + Saída
    switch (turno) {

        case "M":
            println("Bom dia!");
            break;

        case "T":
            println("Boa tarde!");
            break;

        case "N":
            println("Boa noite!");
            break;

        default:
            println("Valor inválido!");
    }
}
