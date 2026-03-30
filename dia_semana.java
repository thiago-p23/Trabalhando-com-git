import static java.lang.IO.*;

void main() {

    //Entrada

    println("insira um numero de 1 a 7: ");
    String dia_semana = readln();

    //Processo + Saida

    if (dia_semana.equals("1")){
        println("domingo");
    } else if (dia_semana.equals("2")) {
        println("segunda");
    } else if (dia_semana.equals("3")) {
        println("terça");
    } else if (dia_semana.equals("4")) {
        println("quarta");
    } else if (dia_semana.equals("5")) {
        println("quinta");
    } else if (dia_semana.equals("6")) {
        println("sexta");
    } else if (dia_semana.equals("7")) {
        println("sabado");
    } else {
        println("valor invalido");
    }
}