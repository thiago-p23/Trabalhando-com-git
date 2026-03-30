import static java.lang.IO.*;

void main() {

    //Entrada

    println("insira seu consumo mensal de agua no me em m3: ");
    float consumo = Float.parseFloat(readln());

    //Processo + Saida

    if (consumo <= 10) {
        println("a sua conta foi: R$ 7,59");
    } else if (consumo <= 20) {
        double custo = consumo * 1.32;
        println("a sua conta foi: R$ " + custo);
    } else if (consumo <= 30) {
        double custo = consumo * 4.64;
        println("a sua conta foi: R$ " + custo);
    } else if (consumo <= 50) {
        double custo = consumo * 6.62;
        println("a sua conta foi: R$ " + custo);
    } else {
        double custo = consumo * 9.64 ;
        println("a sua conta foi: R$ " + custo);
    }
}