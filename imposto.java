import static java.lang.IO.*;

void main() {

    //Entrada

    println("isira seu salario R$ ");
    double salario = Double.parseDouble(readln());
    double inss= salario * 0.05;

    //Processo + Saida

    if (salario <= 2500){
        double irrf = salario * 0.075;
        double desconto = irrf + inss ;
        println("o seus disconto no salario foi: R$ " + desconto);
    } else if (salario <= 3500) {
        double irrf = salario * 0.15;
        double desconto = irrf + inss;
        println("seu desconto foi: R$ " + desconto );
    } else if (salario <= 4500 ) {
        double irrf = salario * 0.225;
        double desconto = irrf + inss;
        println("seu desconto foi: R$ " + desconto );
    } else{
        double irrf = salario *  0.275;
        double desconto = irrf + inss;
        println("seu desconto foi de: R$ " + desconto  );
    }
}