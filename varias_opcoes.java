import static java.lang.IO.*;

void main() {

    //Entrada

    println("1 - opecao 1");
    println("2 - opecao 2");
    println("3 - opecao 3");
    println("4 - sair");

    println("digite um falor de 1 a 4 ");
    String valor = readln();

    //Processo + Saida

    if (valor.equals("1")) {
        println("voce selecionou a opicao 1");
    } else if (valor.equals("2")) {
        println("voce selecionou a opicao 2");
    } else if (valor.equals("3")) {
        println("voce selecionou a opicao 3");
    } else if (valor.equals("4")) {
        println("voce selecionou sair");
    } else{
        println("valor invalido");
    }
    println("fim do programa");
}