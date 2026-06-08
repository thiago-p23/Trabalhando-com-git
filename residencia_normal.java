import static java.lang.IO.*;

void main() {

    println("Informe o consumo mensal de água (m³):");
    float consumo = Float.parseFloat(readln());

    double custo = 0;

    if (consumo < 0) {
        println("Consumo inválido.");
    } else {
        if (consumo <= 10) {
            custo = 7.59;
        } else if (consumo <= 20) {
            custo = consumo * 1.32;
        } else if (consumo <= 30) {
            custo = consumo * 4.64;
        } else if (consumo <= 50) {
            custo = consumo * 6.62;
        } else {
            custo = consumo * 9.64;
        }
        println("Valor da conta: R$ " + custo);
    }
}
