import static java.lang.IO.*;

void main() {

    //Entrada

    println("digite o turno do dia em que voce estuda (M, T ou N) ");
    String turno_de_estudo = readln();

    //Processo + Saida

    if (turno_de_estudo.equals("M")){
        println("bom dia");
    } else if (turno_de_estudo.equals("T")) {
        println("boa tarde");
    } else if (turno_de_estudo.equals("N")) {
        println("boa noite");
    } else{
        println("valor invalido");
    }
}