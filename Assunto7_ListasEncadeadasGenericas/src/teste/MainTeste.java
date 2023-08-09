package teste;

import java.util.Scanner;

import listas.ListaIntCrescente;

public class MainTeste {

	public static void main(String[] args) {
		
		Scanner le = new Scanner(System.in);
		ListaIntCrescente lista = new ListaIntCrescente();
		System.out.print("Informe valor positivo para inserir ou negativo para encerrar: ");
		int valor = le.nextInt();
		while (valor>=0) {
			lista.insere(valor);
			lista.apresenta();
			System.out.print("Informe valor positivo para inserir ou negativo para encerrar: ");
			valor = le.nextInt();
		}
		
		System.out.print("\n\nInforme valor positivo para remover ou negativo para encerrar: ");
		valor = le.nextInt();
		while (valor>=0) {
			
			if(!lista.remove(valor)) {
				System.out.println("valor nao encontrado na lista");
			}
			else
				lista.apresenta();
			System.out.print("Informe valor positivo para remover ou negativo para encerrar: ");
			valor = le.nextInt();
		}
		
		le.close();

	}

}
