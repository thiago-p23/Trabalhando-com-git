import static java.lang.IO.*;

void main() {

    //Entrada

    println("insira o valor do lado A: ");
    float ladoA = Float.parseFloat(readln());

    println("insira o valor do lado B: ");
    float ladoB = Float.parseFloat(readln());

    println("insira o valor do lado C: ");
    float ladoC = Float.parseFloat(readln());

    //Processo

    float somaAB = ladoA + ladoB;
    float somaAC = ladoA + ladoC;
    float somaBC = ladoC + ladoB;

    //Saida

    if (somaAB > ladoC && somaAC > ladoB && somaBC > ladoA ){
        if (ladoA == ladoB && ladoC == ladoB && ladoA == ladoC ){
            println("esse triangulo e um equilatero");
        } else if (ladoA == ladoB || ladoC == ladoB || ladoC == ladoA) {
            println("ele e isoceles");
        } else {
            println("isso e um triangulo escaleno");
        }
    } else {
        println("isso nao e um triangulo");
    }
}