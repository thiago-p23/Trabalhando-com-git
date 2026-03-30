import static java.lang.IO.*;

void main() {

    //Entrada

    println("insira seu salario: ");
    double salario = Double.parseDouble(readln());

    //Processo + Saida

    if (salario<=1000){
        double aumento_valor = salario * 0.2;
        double reajuste = salario + aumento_valor;
        println("salrio digitado: R$ " + salario );
        println("aumento: 20% ");
        println("aumento: R$ " + aumento_valor);
        println("salario reajustado: R$ " + reajuste);
    } else if (salario<=1700) {
        double aumento_valor = salario * 0.15;
        double reajuste = salario + aumento_valor;
        println("salrio digitado: R$ " + salario);
        println("aumento: 15% ");
        println("aumento: R$ " + aumento_valor);
        println("salario reajustado: R$ " + reajuste);
    } else if (salario<=2300) {
        double aumento_valor = salario * 0.1;
        double reajuste = salario + aumento_valor;
        println("salrio digitado: R$ " + salario);
        println("aumento: 10% ");
        println("aumento: R$ " + aumento_valor);
        println("salario reajustado: R$ " + reajuste);
    } else {
        double aumento_valor = salario * 0.05;
        double reajuste = salario + aumento_valor;
        println("salrio digitado: R$ " + salario);
        println("aumento: 5% ");
        println("aumento: R$ " + aumento_valor);
        println("salario reajustado: R$ " + reajuste);
    }
}