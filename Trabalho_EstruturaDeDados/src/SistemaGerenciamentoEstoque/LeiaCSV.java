package SistemaGerenciamentoEstoque;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeiaCSV {
	
	//Função para ler o arquivo CSV
	public void run() {
		
		String arquivoCSV = "arquivo.csv";
		BufferedReader br = null;
		String linha = "";
		String csvDivisor = ";";
		try {
			
			br = new BufferedReader(new FileReader(arquivoCSV));
			Estoque estoque = new Estoque();
			
			while ((linha = br.readLine()) != null) {
				
				String[] item = linha.split(csvDivisor);
				
				/*System.out.println("Item: [codigo= " + item[0] + " , nome= " + item[1]
						+ ", preco= " + item[2] + ", quantidade= " + item[3] + "]");*/
				
				Produto p = new Produto(item[0],item[1],Double.parseDouble(item[2].replace(",", ".")),Integer.parseInt(item[3]));
				estoque.adicionaProduto(p);
			}
			
			//Metodos de impressão:
			
			System.out.println("Lista Original");
			estoque.imprimeLista();
			System.out.println("--------------------------------------------------------------------------------------------");

			System.out.println("Lista Ordenada por Nome");
			estoque.imprimeOrdNome();
			System.out.println("--------------------------------------------------------------------------------------------");

			System.out.println("Lista Ordenada por Codigo");
			estoque.imprimeOrdCodigo();
			System.out.println("--------------------------------------------------------------------------------------------");

			System.out.println("Lista Ordenada por Quantidade");
			estoque.imprimeOrdQuantidade();
			System.out.println("--------------------------------------------------------------------------------------------");

			System.out.println("Lista Ordenada por Preco");
			estoque.imprimeOrdPreco();
			System.out.println("--------------------------------------------------------------------------------------------");
			
			
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}	
	}
}