// Importa métodos estáticos de entrada e saída (recurso moderno do Java 23+)
import static java.lang.IO.*;

void main() {
    try {
        // Lê altura e peso aceitando vírgula ou ponto como separador decimal
        double altura = lerNumero("Informe a sua altura em metros (ex: 1,75): ");
        double peso = lerNumero("Informe o seu peso em kg (ex: 70,5): ");

        // Valida antecipadamente (Early Return) para evitar divisão por zero ou valores irreais
        if (altura <= 0 || peso <= 0) {
            println("Erro: A altura e o peso devem ser maiores que zero.");
            return;
        }

        // Calcula o Índice de Massa Corporal: peso / altura²
        double imc = peso / Math.pow(altura, 2);

        // Obtém a classificação correspondente ao valor calculado
        String classificacao = classificarImc(imc);

        // Exibe o resultado formatado com 2 casas decimais
        println(String.format("\nSeu IMC é: %.2f kg/m² -> Classificação: %s", imc, classificacao));

    } catch (NumberFormatException e) {
        // Evita que o programa quebre caso o usuário digite letras ou deixe em branco
        println("Erro: Entrada inválida! Informe apenas valores numéricos.");
    }
}

// Lê uma entrada textual, normaliza vírgula para ponto e converte para double
double lerNumero(String mensagem) {
    String entrada = readln(mensagem);
    return Double.parseDouble(entrada.trim().replace(",", "."));
}

// Retorna a classificação oficial do IMC conforme as faixas de referência
String classificarImc(double imc) {
    if (imc < 16.0)  return "Magreza grave";
    if (imc < 17.0)  return "Magreza moderada";
    if (imc < 18.5)  return "Magreza leve";
    if (imc < 25.0)  return "Saudável (peso normal)";
    if (imc < 30.0)  return "Sobrepeso";
    if (imc < 35.0)  return "Obesidade grau I";
    if (imc < 40.0)  return "Obesidade grau II (severa)";
    return "Obesidade grau III (mórbida)";
}
