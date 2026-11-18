// Importa métodos estáticos de entrada e saída (recurso moderno do Java 23+)
import static java.lang.IO.*;

void main() {
    // Constantes das tarifas para facilitar manutenção e evitar "números mágicos"
    final double TARIFA_MINIMA = 7.59; // Até 10 m³
    final double TARIFA_FAIXA_2 = 1.32; // De 10,01 a 20 m³
    final double TARIFA_FAIXA_3 = 4.64; // De 20,01 a 30 m³
    final double TARIFA_FAIXA_4 = 6.62; // De 30,01 a 50 m³
    final double TARIFA_FAIXA_5 = 9.64; // Acima de 50 m³

    try {
        // Lê a entrada diretamente e converte vírgula em ponto (ex: 25,5 -> 25.5)
        String entrada = readln("Informe o consumo mensal de água (m³): ");
        double consumo = Double.parseDouble(entrada.trim().replace(",", "."));

        // Valida antecipadamente (Early Return) para evitar aninhamento desnecessário
        if (consumo < 0) {
            println("Erro: Consumo inválido. O valor não pode ser negativo.");
            return;
        }

        // Calcula o valor total conforme as 5 faixas tarifárias
        double custo = calcularCusto(
                consumo,
                TARIFA_MINIMA,
                TARIFA_FAIXA_2,
                TARIFA_FAIXA_3,
                TARIFA_FAIXA_4,
                TARIFA_FAIXA_5
        );

        // Exibe o valor formatado com duas casas decimais (padrão monetário)
        println(String.format("Consumo: %.2f m³
