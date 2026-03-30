import static java.lang.IO.*;

void main() {

    //Entrada

    println("imforme a sua altura em metros: ");
    float altura = Float.parseFloat(readln());

    println("imforme o seu peso: ");
    float peso = Float.parseFloat(readln());

    double IMC = peso / (Math.pow(altura, 2));

    //Processo + Saida

    if (IMC < 16) {
        println(IMC + " magresa estrema");
    } else if (IMC <= 17) {
        println(IMC + " magresa moderada");
    } else if (IMC <=18.5) {
        println(IMC + " magresa moderada");
    } else if (IMC <=25) {
        println(IMC + " saudavel");
    } else if (IMC <=30) {
        println(IMC + " sobrepeso");
    } else if (IMC <=35) {
        println(IMC + " obesidade grau I");
    } else if (IMC <=40) {
        println(IMC + " obesidade grau II");
    } else {
        println(IMC + " obesidade grau III");
    }
}