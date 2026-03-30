import static java.lang.IO.*;

void main() {

    //Entrada

    println("insira seu consumo mensal de agua no me em m3: ");
    float consumo = Float.parseFloat(readln());

    //Processo + Saida

    if (consumo <= 10) {
        println("a sua conta foi: R$ 44.95");
    } else if (consumo <= 20) {
        double custo = consumo * 8.75;
        println("a sua conta foi: R$ " + custo);
    } else if (consumo <= 50) {
        double custo = consumo * 16.76;
        println("a sua conta foi: R$ " + custo);
    } else {
        double custo = consumo * 17.46 ;
        println("a sua conta foi: R$ " + custo);
    }
}