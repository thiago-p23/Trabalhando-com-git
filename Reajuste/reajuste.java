// Importa métodos estáticos de entrada e saída (recurso moderno do Java 23+)
import static java.lang.IO.*;

void main() {
    try {
        // Lê o salário e aceita tanto vírgula quanto ponto como separador decimal
        String entrada = readln("Insira o seu salário atual (R$): ");
        double salario = Double.parseDouble(entrada.trim().replace(",", "."));

        // Valida antecipadamente (Early Return) se o valor informado faz sentido
        if (salario <= 0) {
            println("Erro: O salário deve ser maior que zero.");
            return;
        }

        // Identifica o percentual de reajuste de acordo com a faixa salarial
        double percentual = obterPercentualReajuste(salario);

        // Realiza os cálculos uma única vez, evitando código repetido dentro dos 'if'
        double valorAumento = salario * percentual;
        double salarioReajustado = salario + valorAumento;

        // Exibe o resumo formatado com duas casas decimais (padrão monetário)
        exibirResumo(salario, percentual, valorAumento, salarioReajustado);

    } catch (NumberFormatException e) {
        // Evita que o programa quebre caso o usuário digite letras ou deixe vazio
        println("Erro: Entrada inválida! Informe apenas valores numéricos.");
    }
}

// Retorna o percentual de aumento (em formato decimal) conforme a faixa salarial
double obterPercentualReajuste(double salario) {
    if (salario <= 1000.0) return 0.20; // 20%
    if (salario <= 1700.0) return 0.15; // 15%
    if (salario <= 2300.0) return 0.10; // 10%
    return 0.05;                        // 5%
}

// Centraliza a impressão dos resultados usando Text Block (Java 15+) e String.format
void exibirResumo(double salario, double percentual, double aumento, double reajustado) {
    println(String.format("""
            
            ===== REAJUSTE SALARIAL =====
            Salário anterior:   R$ %.2f
            Percentual applied: %.0f%%
            Valor do aumento:   R$ %.2f
            Salário reajustado: R$ %.2f
            =============================
            """, salario, percentual * 100, aumento, reajustado));
}
