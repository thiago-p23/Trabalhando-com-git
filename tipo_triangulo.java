import static java.lang.IO.*;

void main() {

    println("Informe o lado A:");
    float ladoA = Float.parseFloat(readln());

    println("Informe o lado B:");
    float ladoB = Float.parseFloat(readln());

    println("Informe o lado C:");
    float ladoC = Float.parseFloat(readln());

    if (ladoA <= 0 || ladoB <= 0 || ladoC <= 0) {
        println("Os lados devem ser maiores que zero.");
    } else if (ladoA + ladoB > ladoC &&
               ladoA + ladoC > ladoB &&
               ladoB + ladoC > ladoA) {
        if (ladoA == ladoB && ladoB == ladoC) {
            println("Triângulo Equilátero.");
        } else if (ladoA == ladoB ||
                   ladoA == ladoC ||
                   ladoB == ladoC) {
            println("Triângulo Isósceles.");
        } else {
            println("Triângulo Escaleno.");
        }
    } else {
        println("Os valores informados não formam um triângulo.");
    }
}
