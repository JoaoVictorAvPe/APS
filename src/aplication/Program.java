package aplication;

import java.util.Random;
import java.util.Scanner;

import entities.ArvoreBinaria;
import entities.Elemento;
import entities.Sequencial;

public class Program {
	public static Random random = new Random();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Busca Sequencial
		
		System.out.print("Qual o tamanho do vetor? ");
		long qtd = Long.parseLong(sc.nextLine());
		
		long tempoInicialCriacao = System.nanoTime();
		long[] vetor = Sequencial.vetorSequencial(qtd);
		long tempoFinalCriacao = System.nanoTime();
		
		long num = random.nextInt((int) qtd) + 1;
		
		System.out.println("Numero a ser procurado: " + num);
		
		
		long tempoInicialProcurar = System.nanoTime();
		long posicao = Sequencial.buscaSequencial(num, vetor);
		long tempoFinalProcurar = System.nanoTime();
		
		long tempoTotalCriacao = tempoFinalCriacao - tempoInicialCriacao;
		long tempoTotalProcurar = tempoFinalProcurar - tempoInicialProcurar;
		
		System.out.println("\n===== Resultados da Busca Sequencial =====\n");
		System.out.println("Tempo para a criacao do vetor:\n" + (double) tempoTotalCriacao/1000000 + " milissegundos\n" + (double) tempoTotalCriacao/1000000000 + " segundos");
		System.out.println();
		System.out.println("Tempo para encontrar o numero " + num +" no vetor:\n" + (double) tempoTotalProcurar/1000000 + " milissegundos\n" + (double) tempoTotalProcurar/1000000000 + " segundos");
		System.out.println("Posicao encontrada: " + posicao);

		//Busca na Arvore Binaria
		
		long tempoInicialCriacaoArvore = System.nanoTime();
		ArvoreBinaria arvore = new ArvoreBinaria();
		long raiz = vetor.length/2;
		arvore.setRaiz(new Elemento(raiz));
		for (long i : vetor) {
			if (i != raiz) {
			arvore.adicionar(i);
			}
		}
		long tempoFinalCriacaoArvore = System.nanoTime();
		
		long tempoInicialBuscaArvore = System.nanoTime();
		long qtdNos = arvore.buscar(num);
		long tempoFinalBuscaArvore = System.nanoTime();
		
		long tempoTotalCriacaoArvore = tempoFinalCriacaoArvore - tempoInicialCriacaoArvore;
		long tempoTotalBuscaArvore = tempoFinalBuscaArvore - tempoInicialBuscaArvore;
		
		System.out.println("\n===== Resultados da Busca na Arvore Binaria =====");
		System.out.println();
		System.out.println("Tempo para a criacao da arvore:\n" + (double) tempoTotalCriacaoArvore/1000000 + " milissegundos\n" + (double) tempoTotalCriacaoArvore/1000000000 + " segundos\n");
		System.out.println("Tempo para encontrar o numero " + num +" na arvore:\n" + (double) tempoTotalBuscaArvore/1000000 + " milissegundos\n" + (double) tempoTotalBuscaArvore/1000000000 + " segundos");
		System.out.println("Quantidade de Nos percorridos: " + qtdNos);

		
		sc.close();
	}

}
