import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class formatToDitto {

	public static void Formata(String file, String delimiter, int ultimaColuna, String path) throws IOException {
		BufferedReader conteudoCsv = new BufferedReader(new FileReader(file));
		FileWriter arquivo = new FileWriter(path+"test.txt");
		PrintWriter gravar = new PrintWriter(arquivo);
				
		String line = "";
		int col = 0;
 	   	int lin = 0;
 	   	int contLine =0;
 	   	String[] colunaAtributo = null;
		try {
			while ((line = conteudoCsv.readLine()) != null) {
	   		   //String[] coluna = line.split(delimiter, -1);
		   		   String[] coluna = line.split(delimiter);

				// grava na copia as colunas
	              while(col <= ultimaColuna) { // para imprimir todas colunas
	           	   //copia cabecalho da primeira linha
	           	   if(lin == 0) {
	           		   colunaAtributo = line.split(delimiter);
	           		   removeLeftRight(colunaAtributo);
	           		   break;
	           	   }
	           	   //altera colunas
	           	   else {
	           		//colunaAtributo[1];
	           		   if(col > 0 && col < ultimaColuna) {
		           		   System.out.print("COL " + colunaAtributo[col] + " ");
		           		   gravar.print("COL " + colunaAtributo[col] + " ");
	
		           		   //remove aspas duplas do inicio e fim
		           		   if(coluna[col].length() > 0 && coluna[col].charAt(0) == '"' && coluna[col].charAt(coluna[col].length()-1) == '"') {
		            		   //cria t sem aspas duplas
	           			   		coluna[col] = coluna[col].substring(1, coluna[col].length()-2);
			            	}
	           				System.out.print("VAL " + coluna[col]+ " ");
	           		   		gravar.print("VAL " + coluna[col]+ " ");
	           		   }
	           		   if(col == ultimaColuna) {
	           			   //System.out.print("COL " + colunaAtributo[0] + " ");
		           		   //gravar.print("COL " + colunaAtributo[0] + " ");
		           		   
		           		   //System.out.print("VAL " + coluna[0] + " ");
		           		   //gravar.print("VAL " + coluna[0] + " ");
	           			   
	           			   System.out.print(coluna[0]);
		           		   gravar.print(coluna[0]);
	           		   }   	            	   
	           	   }
	           	   // insere \t
	           	   	if(col == (ultimaColuna-1)/2 || col == ultimaColuna-1) { // para não imprimir ';' na última coluna
	           	   		System.out.print("\t");
	           	   		gravar.print("\t");
	           	   	}
	          			col++; 
	              }
	              if(lin != 0) {
	            	  gravar.println("");
	            	  System.out.println();
	              }
	              
	              col = 0;
	              lin = 1;
	              contLine++;
	   	   	}
			System.out.println(" FIM " + contLine);
	    	   arquivo.close();
	    	   conteudoCsv.close();
		} catch (FileNotFoundException e) {
    	   System.out.println("erro");
       }/*finally {
    	   System.out.println("erro2");
		}*/
	}
	public static void removeLeftRight(String [] str) {
		for(int i = 0; i < str.length; i++) {
			if(str[i].length() > 4 && str[i].substring(0, 5).equals("left_")) {
				str[i] = str[i].replace("left_", "");
			}
			else if(str[i].length() > 5 && str[i].substring(0, 6).equals("right_")) {
				str[i] = str[i].replace("right_", "");
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		//String path = "/home/paulo/Documents/TesteErros/TesteErrosLabel/Erros6_10/Datasets/Dirty/DBLP-ACM/";
		//String path = "/home/paulo/Documents/TesteErros/TesteErrosLabel/Erros3_5/Datasets/Dirty/DBLP-ACM/";
		//String path = "/home/paulo/Documents/TesteErros/TesteErrosLabel/Erros1_2/Datasets/Dirty/DBLP-ACM/";
				
		//String path = "/home/paulo/Documents/TesteErros/TesteErrosLabel/Erros6_10/Datasets/Dirty/DBLP-GoogleScholar/";
		//String path = "/home/paulo/Documents/TesteErros/TesteErrosLabel/Erros3_5/Datasets/Dirty/DBLP-GoogleScholar/";
		//String path = "/home/paulo/Documents/TesteErros/TesteErrosLabel/Erros1_2/Datasets/Dirty/DBLP-GoogleScholar/";
				

		String path = "/home/paulo/Documents/TesteErros/TesteErrosLabel/Erros6_10/Datasets/Structured/Amazon-Google/";
		//String path = "/home/paulo/Documents/TesteErros/TesteErrosLabel/Erros3_5/Datasets/Structured/Amazon-Google/";
		//String path = "/home/paulo/Documents/TesteErros/TesteErrosLabel/Erros1_2/Datasets/Structured/Amazon-Google/";

		//String path = "/home/paulo/Documents/TesteErros/TesteErrosLabel/Erros6_10/Datasets/Structured/Beer/";
		//String path = "/home/paulo/Documents/TesteErros/TesteErrosLabel/Erros3_5/Datasets/Structured/Beer/";
		//String path = "/home/paulo/Documents/TesteErros/TesteErrosLabel/Erros1_2/Datasets/Structured/Beer/";
		
		//String path = "/home/paulo/Documents/TesteErros/TesteErrosLabel/Erros6_10/Datasets/Structured/DBLP-ACM/";
		//String path = "/home/paulo/Documents/TesteErros/TesteErrosLabel/Erros3_5/Datasets/Structured/DBLP-ACM/";
		//String path = "/home/paulo/Documents/TesteErros/TesteErrosLabel/Erros1_2/Datasets/Structured/DBLP-ACM/";
						
		//String path = "/home/paulo/Documents/TesteErros/TesteErrosLabel/Erros6_10/Datasets/Structured/DBLP-GoogleScholar/";
		//String path = "/home/paulo/Documents/TesteErros/TesteErrosLabel/Erros3_5/Datasets/Structured/DBLP-GoogleScholar/";
		//String path = "/home/paulo/Documents/TesteErros/TesteErrosLabel/Erros1_2/Datasets/Structured/DBLP-GoogleScholar/";
		
		//String path = "/home/paulo/Documents/TesteErros/TesteErrosLabel/Erros6_10/Datasets/Structured/Walmart-Amazon/";
		//String path = "/home/paulo/Documents/TesteErros/TesteErrosLabel/Erros3_5/Datasets/Structured/Walmart-Amazon/";
		//String path = "/home/paulo/Documents/TesteErros/TesteErrosLabel/Erros1_2/Datasets/Structured/Walmart-Amazon/";
		
		
		//String path = "/home/paulo/Documents/TesteErros/TesteErrosLabel/Erros6_10/Datasets/Textual/Abt-Buy/";
		//String path = "/home/paulo/Documents/TesteErros/TesteErrosLabel/Erros3_5/Datasets/Textual/Abt-Buy/";		
		//String path = "/home/paulo/Documents/TesteErros/TesteErrosLabel/Erros1_2/Datasets/Textual/Abt-Buy/";
		
		String delimiter = ",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)";
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Total de colunas: ");
		int ultimaColuna = ler.nextInt();
		Formata(path+"joined_test_error.csv", delimiter, ultimaColuna-1, path);
	}

}
