package curso;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		ArrayList<Moeda> lista = new ArrayList<Moeda>(); //criamos nossa lista de moedas
		
		System.out.println("Bem-vindo ao Cofrinho de João Paulo Carniel Fonseca - RU 4059818!"); //identificador pessoal
		
		while (true) { //abrimos um loop que só encerrara o progama quando a opção "break" for acionada.
			
			System.out.println("Menu principal:"); //a partir daqui listamos todas as opções do menu principal.
			System.out.println("1 - Adicionar moeda");
			System.out.println("2 - Remover moeda");
			System.out.println("3 - Listar moedas");
			System.out.println("4 - Converter valor total para Real");
			System.out.println("5 - Encerrar");
			System.out.println("Digite o número da opção desejada: ");
			
			Scanner entrada = new Scanner(System.in); //input para o usuário escolher a opção.
			
			int opcao = entrada.nextInt(); //dependendo do valor da constante "opcao" o programa segue os diferentes caminhos do menu principal.
			
			if (opcao == 1) {
				System.out.println("Opções: ");
				System.out.println("1 - Real");
				System.out.println("2 - Euro");
				System.out.println("3 - Dolar");
				System.out.println("Digite o número correspondente a moeda que deseja adicionar: ");
				
				int tipoMoeda = entrada.nextInt();
				
				switch (tipoMoeda) { //condicional de acordo com o valor do input do usuário, para escolher qual classe de moeda quer adicionar
				case 1:
					System.out.println("Digite o valor da moeda de Real: ");
					double valorMoedaReal = entrada.nextDouble(); //usuário entra no console com o valor da moeda que deseja depositar
					lista.add(new Real(valorMoedaReal)); //é adicionada na lista a moeda da classe e valor escolhido  
					System.out.println("Moeda depositada com sucesso no cofrinho!");
					break;
				
				case 2:
					System.out.println("Digite o valor da moeda de Euro: ");
					double valorMoedaEuro = entrada.nextDouble();
					lista.add(new Euro(valorMoedaEuro));
					System.out.println("Moeda depositada com sucesso no cofrinho!");
					break;
				
				case 3:
					System.out.println("Digite o valor da moeda de Dólar: ");
					double valorMoedaDolar = entrada.nextDouble();
					lista.add(new Dolar(valorMoedaDolar));
					System.out.println("Moeda depositada com sucesso no cofrinho!");
					break;
				
				default: //qualquer entrada diferente das opções disponibilizadas retorna pro menu principal
					System.out.println("Voltando pro menu principal.");
				}
			}
			
			else if (opcao == 2) { //nova condicional, com código basicamente igual ao da condicional anterior, mas nesse caso para remover as moedas
				System.out.println("Opções: ");
				System.out.println("1 - Real");
				System.out.println("2 - Euro");
				System.out.println("3 - Dolar");
				System.out.println("Digite o número correspondente a moeda que deseja remover: ");
				
				int tipoMoedaRemover = entrada.nextInt();
				
				switch (tipoMoedaRemover) {
				case 1: 
					System.out.println("Digite o valor da moeda de Real que deseja remover: ");
					double valorRealRemover = entrada.nextDouble(); 
					lista.remove(new Real(valorRealRemover));
					System.out.println("Moeda removida com sucesso do cofrinho!");
					break;	
				
				case 2: 
					System.out.println("Digite o valor da moeda de Euro que deseja remover: ");
					double valorEuroRemover = entrada.nextDouble(); 
					lista.remove(new Euro(valorEuroRemover));
					System.out.println("Moeda removida com sucesso do cofrinho!");
					break;	
				
				case 3: 
					System.out.println("Digite o valor da moeda de Dolar que deseja remover: ");
					double valorDolarRemover = entrada.nextDouble(); 
					lista.remove(new Dolar(valorDolarRemover));
					System.out.println("Moeda removida com sucesso do cofrinho!");
					break;	
				
				default:
					System.out.println("Voltando pro menu principal.");
				}
			}
			
			else if (opcao == 3) {
				for (Moeda m : lista) {
					m.info(); //invocamos o método "info" de cada moeda no Cofrinho para listá-las
				}
			}
			
			else if (opcao == 4 ) {
				double soma = 0; // váriavel referente ao valor total no Cofrinho
				for (Moeda m : lista) {
					soma += m.converter(); //invocamos o método "converter" de cada moeda na lista e somamos todos para descobrir o total em Real
				}
				System.out.println("Valor total em Real no Cofrinho: " + soma);
			}
			
			else if (opcao == 5) {
				System.out.println("Programa encerrado.");
				break; //opção break acionada para encerrar o loop e consequentemente o programa
			}
			
			else {
				System.out.println("Insira um comando válido!"); //caso o usuário entre com um dígito diferente dos disponíveis
			}
		}
	}
}
