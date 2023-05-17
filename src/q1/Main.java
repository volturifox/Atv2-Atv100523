package q1;
import java.util.Scanner;

//o que se vê aqui é só o que consegui fazer funcionar
//sim, eu estava fazendo essa questão enquanto fazia todas as outras
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Caminhao caminhao = null;
		PilhaPerecivel pilhap = new PilhaPerecivel();
		PilhaNaoPerecivel pilhanp = new PilhaNaoPerecivel();
		int opcao;
		do {
			
			System.out.println("Selecione uma opção: ");
			System.out.println("1- Cadastrar caminhão ");
			System.out.println("2- Ver próxima carga Perecível ");
			System.out.println("3- Ver próxima carga Não Perecível ");
			System.out.println("4- Sair");
			
			opcao = scan.nextInt();
			switch (opcao) {
				case 1:
					caminhao = cadastroCaminhao(scan);
					if (caminhao.isCargaPerecivel()) {
						pilhap.push(caminhao);
					} else {
						pilhanp.push(caminhao);
					}
					
					break;
				case 2:
					System.out.println(pilhap.top());
					break;
				case 3:
					System.out.println(pilhanp.top());
					break;
				case 4:
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Opção inválida. Tente de novo.");
					break;
			}
			
		
		}while (opcao != 4);
		scan.close();
	}
	
	private static Caminhao cadastroCaminhao(Scanner scan) {
		scan.nextLine();
		System.out.println("Diga a Placa do Caminhão: ");
		String placa = scan.nextLine();
			
		System.out.println("Diga o nome do Motorista: ");
		String motorista = scan.nextLine();
			
		System.out.println("A carga é perecível?: ");
		boolean cargaPerecivel = scan.nextBoolean();
			
		System.out.println("Qual o peso transportado? ");
		int pesoTransportado = scan.nextInt();
			
		
		System.out.println("Cadastro feito com sucesso!");

		return new Caminhao(placa,motorista,cargaPerecivel,pesoTransportado);
			
	}
	
		
}
