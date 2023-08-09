package exercicio;

import java.util.Scanner;

import entidades.Aluno;
import listas.ListaAlunos;

public class Planilha {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		ListaAlunos turma = new ListaAlunos();
		int rm;
		double media;
		
		int resp;
		do {
			System.out.println("\t RM: ");
			rm = le.nextInt();
			System.out.println("\t Media: ");
			media=le.nextDouble();
			Aluno aluno = new Aluno(rm,media);
			turma.insere(aluno);
			turma.apresenta();
			System.out.println("Deseja cadastrar mais 1 aluno? (1-sim)");
			resp = le.nextInt();
		}while (resp==1);
		
		le.close();

	}

}
