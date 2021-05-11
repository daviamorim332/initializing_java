
public class Expressoes {

    public static void main(String[] args) {
	//executa a função expressions
	   expressions();
}
//determina a função soma
static void expressions() {
//define as variaveis	
	double number1= 5;
	double number2= 8;
	double number3= 3;
    double number4= 4;
	//printa na tela as expressões
System.out.println (number1 + 2 + number3 - number4);
System.out.println ((number1 / number2) + (number3 * number4) );
System.out.println (number3 * number2 / (number1 - number4) );
System.out.println (number1 / (number2 + number3));

	}

}
