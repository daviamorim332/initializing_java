import java.io.BufferedReader;
import java.io.FileReader;

public class ler_txt {

	public static void main(String[] args) {
		
		lerTXT();
		}

	public static void lerTXT() {
	
	try {
	    //leitura de arquivo
	    FileReader txt;
	    txt= new FileReader("arquivo");
	    BufferedReader bf = new BufferedReader(txt);
	    String linha = bf.readLine();
	    //printa 9 vezes o conteúdo do arquivo
	    for( int z = 0; z < 9; z ++) {
	    	
	    	System.out.println(linha);
        }
		
		
	}catch (Exception e) {
}
	}
}
