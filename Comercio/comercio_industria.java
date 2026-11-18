// Importa métodos estáticos de entrada e saída (recurso moderno do Java 23+)
import static java.lang.IO.*;

void main() {
    // Constantes das tarifas para facilitar manutenção e evitar "números mágicos"
    final double TARIFA_MINIMA = 44.95;
    final double TARIFA_FAIXA_2 = 8.75;  // De 11 a 20 m³
    final double TARIFA_FAIXA_3 = 16.76; // De 21 a 50 m³
    final double TARIFA_FAIXA_4 = 17.46; // Acima de 50 m³

    try {
        // Lê a entrada diretamente e aceita tanto ponto quanto vírgula (padrão brasileiro)
        String entrada = readln("Insira seu consumo mensal de água (em m³): ");
        double consumo = Double.parseDouble(entrada.trim().replace(",", "."));

        // Valida se o consumo não é um número negativo
        if (consumo < 0) {
            println("Erro: O consumo de água não pode ser negativo.");
            return;
        }

        // Calcula o valor total da conta de acordo com a faixa de consumo
        double valorConta;
        if (consumo <= 10) {
            valorConta = TARIFA_MINIMA;
        } else if (consumo <= 20) {
            valorConta = consumo * TARIFA_FAIXA_2;
        } else if (consumo <= 50) {
            valorConta = consumo * TARIFA_FAIXA_3;
        } else {
            valorConta = consumo * TARIFA_FAIXA_4;
        }

        // Formata a saída para exibir sempre duas casas decimais (padrão monetário)
        println(String.format("Consumo: %.2f m³ | Valor da conta: R$ %.2f", consumo, valorConta));

    } catch (NumberFormatException e) {
        // Evita quebra do programa caso o usuário digite letras ou deixe o campo vazio
        println("Erro: Entrada inválida! Informe um valor numérico válido.");
    }
}
