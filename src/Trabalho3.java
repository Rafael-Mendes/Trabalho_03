
import java.util.Locale;
import java.util.Scanner;

public class Trabalho3{
    /**
     * Impressão do Menu
     */
	public static void mostrarMenu() {
		System.out.println("1 – Imprimir tabela");
		System.out.println("2 – Pesquisar produto");
		System.out.println("3 – Mostrar dados do produto mais caro");
		System.out.println("4 – Mostrar código e descrição dos produtos cuja quantidade está abaixo de 10");
		System.out.println("5 – Ativo total do estoque **");
		System.out.println("6 – Efetuar uma venda ***");
		System.out.println("7 – Sair"); 
	
	
	}
	/**
	 * FUNÇÂO PARA IMPRESSÂO DA TABELA DE PRODUTOS:
	 * @param vetProduto- Vetor ja instanciado Com Nomes de diversos Produtos
	 * @param vetCodigo- vetor ja instaciado com o Codigo de diversos Produtos
	 * @param vetPreço- vetor instanciado com o Preço de diversos Produtos
	 * @param vetQuantidade- vetor instanciado com a quantidade de diversos Produtos
	 */
	public static void imprimirTabela(String[] vetProduto,int[] vetCodigo,double[] vetPreço,int[] vetQuantidade){
		int i = 0;
		System.out.println("Produto\t\tCódigo\t\tPreço\t\tQuantidade ");
		for (i = 0; i < vetProduto.length; i++) {
	    System.out.println(""+ vetProduto[i] + "\t\t" + vetCodigo[i] + "\t\t" + vetPreço[i] + "\t\t" + vetQuantidade[i]);
			
		}
	}
	/**
	 * FUNÇÃO UTILIZADA PARA FAZER A PESQUISA DE UM PRODUTO ATRAVEZ DO SEU CÓDIGO
	 * @param vetProduto- Vetor ja instanciado Com Nomes de diversos Produtos
	 * @param vetCodigo- vetor ja instaciado com o Codigo de diversos Produtos
	 * @param vetPreço- vetor instanciado com o Preço de diversos Produtos
	 * @param vetQuantidade- vetor instanciado com a quantidade de diversos Produtos
	 */
	public static void pesquisarProduto(String[] vetProduto,int[] vetCodigo,double[] vetPreço,int[] vetQuantidade){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int pos,codigo ;
		pos=0;
		System.out.print("Dígite o codigo do Produto: ");
		codigo = sc.nextInt();
		for(int i=0;i<vetProduto.length;i++){
			if(vetCodigo[i] == codigo){
				pos=i;
			}
		}
		System.out.println(""+ vetProduto[pos] + "\t\t" + vetCodigo[pos] + "\t\t" + vetPreço[pos] + "\t\t" + vetQuantidade[pos]);
	}
	
	/**
	 * FUNÇÃO UTILIZADA PARA A IMPRESSÃO DE DADOS DO PRODUTO MAIS CARO
	 * @param vetProduto- Vetor ja instanciado Com Nomes de diversos Produtos
	 * @param vetCodigo- vetor ja instaciado com o Codigo de diversos Produtos
	 * @param vetPreço- vetor instanciado com o Preço de diversos Produtos
	 * @param vetQuantidade- vetor instanciado com a quantidade de diversos Produtos
	 */
	public static void produtoMaisCaro(String[] vetProduto,int[] vetCodigo,double[] vetPreço,int[] vetQuantidade){
		double prodMaisCaro;
		int pos;
		prodMaisCaro = vetPreço[0];
		pos =0;
		for(int i=0;i<vetProduto.length;i++){
			if(prodMaisCaro < vetPreço[i]){
				prodMaisCaro = vetPreço[i];
				pos = 0 + i;
			}
		}
		System.out.println(""+ vetProduto[pos] + "\t\t" + vetCodigo[pos] + "\t\t" + vetPreço[pos] + "\t\t" + vetQuantidade[pos]);
	}
	/**
	 * FUNÇÃO UTILIZADA PARA IMPRESSÃO DE TODOS PRODUTOS COM A QUANTIDADE EM ESTOQUE ABAIXO DE 10;
	 * @param vetProduto Vetor ja instanciado Com Nomes de diversos Produtos;
	 * @param vetCodigo- vetor ja instaciado com o Codigo de diversos Produtos;
	 * @param vetPreço- vetor instanciado com o Preço de diversos Produtos;
	 * @param vetQuantidade- vetor instanciado com a quantidade de diversos Produtos;
	 */
	public static void prodAbaixodeDez(String[] vetProduto,int[] vetCodigo,double[] vetPreço,int[] vetQuantidade){
		for(int i=0;i<vetQuantidade.length;i++){
			if(vetQuantidade[i] < 10){
				System.out.println(""+ vetProduto[i] + "\t\t" + vetCodigo[i] + "\t\t" + vetPreço[i] + "\t\t" + vetQuantidade[i]);
			}
		}
	}
	/**
	 * FUNÇÃO UTILIZADA PARA A SOMA DE TODOS OS ITENS EM ESTOQUE E IMPRESSÃO DO VALOR TOTAL:
	 * @param vetProduto- Vetor ja instanciado Com Nomes de diversos Produtos
	 * @param vetCodigo- vetor ja instaciado com o Codigo de diversos Produtos
	 * @param vetPreço- vetor instanciado com o Preço de diversos Produtos
	 * @param vetQuantidade- vetor instanciado com a quantidade de diversos Produtos
	 */
	public static void somaTotalEstoque(String[] vetProduto,int[] vetCodigo,double[] vetPreço,int[] vetQuantidade){
		double valortotal,totalEstoque;
		valortotal = 0;
		totalEstoque =0;
		for(int i=0;i<vetProduto.length;i++){
			valortotal = vetPreço[i]*vetQuantidade[i];
			totalEstoque = totalEstoque + valortotal;
			}
		System.out.println("VALOR TOTAL DO ESTOQUE:");
		System.out.println("R$"+totalEstoque);
	}
	/**
	 * FUNÇÃO UTILIZADA PARA EFETUAR UMA VENDA ONDE O CLIENTE DIGITA O CODIGO E A QUANTIDADE DO PRODUTO QUE DESEJA COMPRAR
	 * @param vetCodigo- vetor ja instaciado com o Codigo de diversos Produtos
	 * @param vetQuantidade- vetor instanciado com a quantidade de diversos Produtos
	 */
	public static void venda(int[] vetCodigo,int[] vetQuantidade){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int codigo,pos=0;
		
		System.out.print("DIGITE O CODIGO DO PRODUTO QUE DESEJA COMPRAR: ");
		codigo = sc.nextInt();
		System.out.println("");
		System.out.println("QUANTIDADE DO PRODUTO EM ESTOQUE: ");
		for(int i=0;i<vetCodigo.length;i++){
			if(vetCodigo[i] == codigo){
				pos=i;
				System.out.println(vetQuantidade[pos]);
				if(vetCodigo[i] != codigo) {
					System.out.println(" Produto inexistente;");
				}
			}
			 
			
		}
		System.out.println("");
		System.out.println("DIGITE A QUANTIDADE DE PRODUTO QUE DESEJA COMPRAR:");
		int quantidade = sc.nextInt();
		if(quantidade > vetQuantidade[pos]){
			System.out.println("Estoque Insuficiente");
			System.out.println();
		}
		else if(quantidade<vetQuantidade[pos]){
			System.out.print("Venda realizada com sucesso!!");
			vetQuantidade[pos]= vetQuantidade[pos]-quantidade;
			System.out.println();
			
		}
		
	}
	
	
	public static void main (String args[]){
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		
		int N;
		
		System.out.print("Quantos produtos deseja digitar: ");
		N = sc.nextInt();
		
		String vetProduto[] = new String[N];
		int vetCodigo[] = new int [N];
		double vetPreço[] = new double [N];
		int vetQuantidade[] = new int [N];
		
		System.out.println("Digite os produtos a seguir: ");
		System.out.println();
		System.out.println("Produto|Código|Preço|Quantidade ");
		for(int i=0;i<N;i++){
			vetProduto [i]= sc.next();
			vetCodigo[i]=sc.nextInt();
			vetPreço[i]=sc.nextDouble();
			vetQuantidade[i]=sc.nextInt();
		}
		System.out.println("");
		
		
		int opçaoMenu ;
		mostrarMenu();
		System.out.println();
		System.out.println("DIGITE UMA OPÇÃO DO MENU:");
		opçaoMenu = sc.nextInt();
		
		while( opçaoMenu != 7){
			 switch (opçaoMenu) {
			 case 1: 
				 	imprimirTabela(vetProduto,vetCodigo,vetPreço,vetQuantidade);
				 	System.out.println();
	            	mostrarMenu();
	            	System.out.println();
	            	System.out.println("DIGITE UMA OPÇÃO DO MENU:");
	            	opçaoMenu = sc.nextInt();
	            	break;
			 
			 case 2:
				    pesquisarProduto(vetProduto,vetCodigo,vetPreço,vetQuantidade);
				    System.out.println();
	            	mostrarMenu();
	            	System.out.println();
	            	System.out.print("DIGITE UMA OPÇÃO DO MENU:");
	            	opçaoMenu = sc.nextInt();
	            	break;
	            	
			 case 3:
				    produtoMaisCaro(vetProduto,vetCodigo,vetPreço,vetQuantidade);
				    System.out.println();
	            	mostrarMenu();
	            	System.out.println();
	            	System.out.print("DIGITE UMA OPÇÃO DO MENU:");
	            	opçaoMenu = sc.nextInt();
	            	break;
	            	
			 case 4:
				   prodAbaixodeDez(vetProduto,vetCodigo,vetPreço,vetQuantidade);
				   System.out.println();
	               mostrarMenu();
	               System.out.println();
	               System.out.print("DIGITE UMA OPÇÃO DO MENU:");
	               opçaoMenu = sc.nextInt();
	               break;
	            	
			 case 5:
				   somaTotalEstoque(vetProduto,vetCodigo,vetPreço,vetQuantidade);
				   System.out.println();
	               mostrarMenu();
	               System.out.println();
	               System.out.print("DIGITE UMA OPÇÃO DO MENU:");
	               opçaoMenu = sc.nextInt();
	               break;
	               
			 case 6:
				   venda(vetCodigo,vetQuantidade);
				   System.out.println();
				   mostrarMenu();
		           System.out.println();
		           System.out.print("DIGITE UMA OPÇÃO DO MENU:");
		           opçaoMenu = sc.nextInt();
		           break;
				 
				   
				    
			 }
	            
			          
		}
			 
sc.close();
	}
}
		
	



	



	

