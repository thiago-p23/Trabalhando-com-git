import static java.lang.IO.*;

void main() {

    int opcao = 0;

    while (opcao != 4) {

        println("\n===== MENU =====");
        println("1 - Opção 1");
        println("2 - Opção 2");
        println("3 - Opção 3");
        println("4 - Sair");

        opcao = Integer.parseInt(readln("Digite uma opção: "));

        switch (opcao) {

            case 1:
                println("Você selecionou a opção 1.");
                break;

            case 2:
                println("Você selecionou a opção 2.");
                break;

            case 3:
                println("Você selecionou a opção 3.");
                break;

            case 4:
                println("Encerrando o programa...");
                break;

            default:
                println("Opção inválida!");
        }
    }
    println("Fim do programa.");
}
