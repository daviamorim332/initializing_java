
public class Aprovacao_aluno_simples {

	public static void main(String[] args) {
		
		calc( 7 , 9);
		
	}
	 static void calc(double x, double y) {
		 
	    double note1= x;
		double  note2= y;
		
		double media = ((note1+note2)/ 2);
		
     System.out.println("Sua Media é: " + media);
		
	if(media < 6) {
     if(media <= 2)System.out.println("Reprovado. Você precisava atingir pelo menos 2 pontos"
     		+ " para fazer a prova final.");
     else if (media >= 2) System.out.println("Recuperação.");
   }
      else { System.out.println("Aprovado.");}

	 }
}
