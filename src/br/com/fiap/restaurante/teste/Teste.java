package br.com.fiap.restaurante.teste;

import java.util.Scanner;

import br.com.fiap.restaurante.model.Cardapio;
import br.com.fiap.restaurante.model.Prato;

public class Teste {

	public static void main(String[] args) {
		
		try {
			Cardapio cardapio = new Cardapio();
			System.out.println("###### CARDÁPIO ######");
			
			for (Prato prato : cardapio.getPratos().values()) {
				prato.exibirPrato();
			}
			
			System.out.println("Escolha o seu prato");
			Scanner entrada = new Scanner(System.in);
			Prato prato = cardapio.getPratos().get(entrada.nextInt());
			
			System.out.println("O prato escolhido é: ");
			prato.exibirPrato();
			
			entrada.close();
		}
		catch (ArithmeticException e) {
			System.out.println("Erro de cálculo: " + e.getMessage());
		}
		catch (NullPointerException e) {
			System.out.println("Erro de objeto null: " + e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Erro geral: " + e.getMessage());
		}
	}

}
