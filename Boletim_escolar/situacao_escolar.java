import static java.lang.IO.*;

void main() {

    println("Digite a nota 1:");
    float nota1 = Float.parseFloat(readln());

    println("Digite a nota 2:");
    float nota2 = Float.parseFloat(readln());

    println("Digite a nota 3:");
    float nota3 = Float.parseFloat(readln());

    println("Digite a nota 4:");
    float nota4 = Float.parseFloat(readln());

    float media = (nota1 + nota2 + nota3 + nota4) / 4;

    println("\n===== BOLETIM =====");
    println("Nota 1: " + nota1);
    println("Nota 2: " + nota2);
    println("Nota 3: " + nota3);
    println("Nota 4: " + nota4);
    println("Média final: " + media);

    if (media <= 3.9) {
        println("Categoria: E");
        println("Situação: Reprovado");
    } else if (media <= 5.9) {
        println("Categoria: D");
        println("Situação: Reprovado");
    } else if (media <= 7.4) {
        println("Categoria: C");
        println("Situação: Aprovado");
    } else if (media <= 8.9) {
        println("Categoria: B");
        println("Situação: Aprovado");
    } else {
        println("Categoria: A");
        println("Situação: Aprovado");
    }
}
