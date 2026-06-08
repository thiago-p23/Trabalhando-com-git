import static java.lang.IO.*;

void main() {

    println("Informe o consumo mensal de água (m³):");
    float consumo = Float.parseFloat(readln());

    double custo;

    if (consumo < 0) {
        println("Consumo inválido.");
    } else {
        if (consumo <= 10) {
            custo = 22.38;
        } else if (consumo <= 20) {
            custo = consumo * 3.50;
        } else if (consumo <= 50) {
            custo = consumo * 8.75;
        } else {
            custo = consumo * 9.64;
        }
        println("Valor da conta: R$ " + custo);
    }
}
