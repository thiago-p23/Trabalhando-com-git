// Importa métodos estáticos de entrada e saída (recurso moderno do Java 23+)
import static java.lang.IO.*;

void main() {
    // Constante para a alíquota fixa do INSS aplicada no cálculo
    final double ALIQUOTA_INSS = 0.05;

    try {
        // Lê o salário e aceita tanto vírgula quanto ponto como separador decimal
        String entrada = readln("Insira o seu salário bruto (R$): ");
        double salario = Double.parseDouble(entrada.trim().replace(",", "."));

        // Valida antecipadamente (Early Return) se o valor informado é válido
        if (salario <= 0) {
            println("Erro: O salário deve ser maior que zero.");
            return;
        }

        // Identifica a alíquota de IRRF conforme a faixa salarial
        double aliquotaIrrf = obterAliquotaIrrf(salario);

        // Realiza os cálculos uma única vez, eliminando repetição nos blocos condicionais
        double valorInss = salario * ALIQUOTA_INSS;
        double valorIrrf = salario * aliquotaIrrf;
        double descontoTotal = valorInss + valorIrrf;
        double salarioLiquido = salario - descontoTotal;

        // Exibe o demonstrativo detalhado e formatado
        exibirDemonstrativo(salario, valorInss, aliquotaIrrf, valorIrrf, descontoTotal, salarioLiquido);

    } catch (NumberFormatException e) {
        // Evita que o programa quebre caso o usuário digite letras ou deixe em branco
        println("Erro: Entrada inválida! Informe apenas valores numéricos.");
    }
}

// Retorna a alíquota do IRRF (em decimal) de acordo com a faixa salarial
double obterAliquotaIrrf(double salario) {
    if (salario <= 2500.0) return 0.075; // 7,5%
    if (salario <= 3500.0) return 0.150; // 15%
    if (salario <= 4500.0) return 0.225; // 22,5%
    return 0.275;                        // 27,5%
}

// Centraliza a impressão do demonstrativo usando Text Block (Java 15+) e String.format
void exibirDemonstrativo(double bruto, double inss, double aliquotaIrrf, double irrf, double totalDescontos, double liquido) {
    println(String.format("""
            
            ===== DEMONSTRATIVO DE DESCONTOS =====
            Salário Bruto:        R$ %.2f
            Desconto INSS (5%%):   R$ %.2f
            Desconto IRRF (%.1f%%): R$ %.2f
            --------------------------------------
            Total de Descontos:   R$ %.2f
            Salário Líquido:      R$ %.2f
            ======================================
            """, bruto, inss, aliquotaIrrf * 100, irrf, totalDescontos, liquido));
}
