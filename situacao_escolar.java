import static java.lang.IO.*;

void main() {

    //Entrada

    println("digite a nota 1: ");
    float nota1 = Float.parseFloat(readln());

    println("digite a nota 2: ");
    float nota2 = Float.parseFloat(readln());

    println("digite a nota 3: ");
    float nota3 = Float.parseFloat(readln());

    println("digite a nota 4: ");
    float nota4 = Float.parseFloat(readln());

    //Processo + Saida

    float media_final = (nota1 + nota2 + nota3 + nota4) / 4;

    println(nota1 + "Nota 1: ");
    println(nota2 + "Nota 2: ");
    println(nota3 + "Nota 3: ");
    println(nota4 + "Nota 4: ");
    println("Sua media final foi : " + media_final);

    if (media_final <= 3.9) {
        println("categoria: E");
        println("voce esta reprovado");
    } else if (media_final <= 5.9) {
        println("categoria: D");
        println("voce esta reprovado");
    } else if (media_final <= 7.4) {
        println("categoria: C");
        println("voce esta aprovado");
    } else if (media_final <= 8.9) {
        println("categoria: B");
        println("voce esta aprovado");
    } else {
        println("categoria: A");
        println("voce esta aprovado");
    }
}