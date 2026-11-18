// Importa métodos estáticos de entrada e saída (recurso moderno do Java 23+)
import static java.lang.IO.*;

void main() {
    // Constantes das tarifas para facilitar manutenção e evitar "números mágicos"
    final double TARIFA_MINIMA = 22.38;
    final double TARIFA_FAIXA_2 = 3.50; // De 10,01 a 20 m³
    final double TARIFA_FAIXA_3 = 8.75; // De 20,01 a 50 m³
    final double TARIFA_FAIXA_4 = 9.64; // Acima de 50 m³

    try {
        // Lê a entrada diretamente e converte vírgula em ponto (ex: 12,5 -> 12.5)
        String entrada = readln("Informe o consumo mensal de água (m³): ");
        double consumo = Double.parseDouble(entrada.trim().replace(",", "."));

        // Valida antecipadamente (Early Return) para evitar aninhamento desnecessário
        if (consumo < 0) {
            println("Erro: Consumo inválido. O valor não pode ser negativo.");
            return;
        }

        // Calcula o custo de acordo com a faixa de consumo
        double custo = calcularCusto(consumo, TARIFA_MINIMA, TARIFA_FAIXA_2, TARIFA_FAIXA_3, TARIFA_FAIXA_4);

        // Exibe o valor formatado com duas casas decimais (padrão monetário)
        println(String.format("Consumo: %.2f m³ | Valor da conta: R$ %.2f", consumo, custo));

    } catch (NumberFormatException e) {
        // Evita que o programa quebre caso o usuário digite letras ou deixe em branco
        println("Erro: Entrada inválida! Informe apenas valores numéricos.");
    }
}

// Isola a regra de negócio do cálculo tarifário em um método próprio
double calcularCusto(double consumo, double minima, double faixa2, double faixa3, double faixa4) {
    if (consumo <= 10) return minima;
    if (consumo <= 20) return consumo * faixa2;
    if (consumo <= 50) return consumo * faixa3;
    return consumo * faixa4;
}
