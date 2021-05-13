import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Criar_Escrever_TXT {

	public static void main(String[] args) {
		Insert_Txt();
}
       public static void Insert_Txt(){
    	   
  try { 
      FileWriter text;
      //cria o arquivo(true: não reseta a escrita a cada gravação)
      text= new FileWriter (new File ("/home/daviamorim/Documentos/texto.txt"),true  );
      //escreve no arquivo
      text.write ("teste escrita de arquivo1\n" + "222"); // "\n" quebra a linha
      //fecha o arquivo
      text.close();
      
  }catch (Exception e) {
 }
 }
}
