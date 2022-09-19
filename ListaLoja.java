package ExercicioColecoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaLoja {

	public static void main(String[] args) {
		int op;
		Scanner ler = new Scanner(System.in);
		List<String> loja= new ArrayList();


		System.out.println("\nOpções da Loja");
		System.out.println("\n(1) Adicionar produtos");
		System.out.println("\n(3) Atualizar produtos");
		System.out.println("\n(2) Remover produtos");
		System.out.println("\n(4) Mostrar lista");
		System.out.println("\n(0) Encerrar programa");

		System.out.println("\nDigite a opção escolhida: ");
		op = ler.nextInt();


		while(op!=0) {
			if(op==1) {
				ler.nextLine();
				System.out.println("\nAdicione produto: ");
				String produto = ler.nextLine();
				loja.add(produto);
			}  

			else if (op==2) {
				ler.nextLine();
				System.out.println("\nDigite o produto que quer atualizar: ");
				String verificacao = ler.nextLine();
				System.out.println("\nDigite o nome do produto que substituirá "+verificacao+" : ");
				String atualizacao = ler.nextLine();
				if(loja.contains(verificacao)) {
					loja.remove(verificacao);
					loja.add(atualizacao);
				}else {
					System.out.println("\nProduto não existe");
				}
				System.out.println(loja);
			}
			else if (op==2) {
				ler.nextLine();
				System.out.println("\nRemover produto");
				String produto1 = ler.nextLine();
				if(loja.contains(produto1)) {//o método contains vai verificar se o produto1 está contido dentro do estoque
					loja.remove(produto1);

				}else {
					System.out.println("\nProduto não existe");
				}
				System.out.println(loja);
			}
			else if(op==4) {
				System.out.println("\nOs produtos do estoque são: ");
				System.out.println(loja);
			}
			else if (op==0) {
				System.out.println("\nMuito obrigada em utilizar do nosso sistema, volte sempre...");
			}
			else {
				System.out.println("\nOpção inválida!!!");
			}
			System.out.println("\nOpções da Loja");
			System.out.println("\n(1) Adicionar produtos");
			System.out.println("\n(3) Atualizar produtos");
			System.out.println("\n(2) Remover produtos");
			System.out.println("\n(4) Mostrar lista");
			System.out.println("\n(0) Encerrar programa");

			System.out.println("\nDigite a opção escolhida: ");
			op = ler.nextInt();

		}
	}
}


