import static java.lang.IO.*;

void main() {

    println("1 - adicao");
    println("2 - subtracao");
    println("3 - multiplicacao");
    println("4 - divisao");
    println("5 - potencia");
    println("6 - raiz quadrada");
    println("7 - numero par");
    println("8 - numero impar");

    //Entrada

    println("insira o primeiro valor: ");
    float valor1 = Float.parseFloat(readln());

    println("insira o segundo valor: ");
    float valor2 = Float.parseFloat(readln());

    println("insira um valor das operacoes acima: ");
    String operaracao = readln();

    //Processo + Saida

    if (operaracao.equals("1")){
        float soma = valor1 + valor2;
        println(soma);
    } else if (operaracao.equals("2")) {
        float subtracao = valor1 - valor2;
        println(subtracao);
    } else if (operaracao.equals("3")) {
        float multiplicacao = valor1 * valor2;
        println(multiplicacao);
    } else if (operaracao.equals("4")) {
        float divisao = valor1 / valor2;
        println(divisao);
    } else if (operaracao.equals("5")) {
        double potencia = Math.pow(valor1 , valor2 );
        println(potencia);
    } else if (operaracao.equals("6")) {
        float soma2 = valor1 + valor2;
        double raiz_quadrada = Math.sqrt(soma2);
        println(raiz_quadrada);
    }
}