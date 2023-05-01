package entities;

import java.util.Random;

import aplication.Program;

public class Sequencial {
	
	public static long[] vetorSequencial(long qtd) {
		long[] vetor = new long[(int) qtd];
		for (long i = 0; i < qtd; i++) {
			vetor[(int) i] = i + 1;
		}
		Program.random = new Random();
		for (int i = vetor.length - 1; i > 0; i--) {
			long j = Program.random.nextLong(i + 1);
			long temp = vetor[i];
			vetor[i] = vetor[(int) j];
			vetor[(int) j] = temp;
		}

		return vetor;
	}
	
	public static long buscaSequencial(long num, long[] vetor) {
		long posicao = 0;
		for (long i : vetor) {
			if (i == num) {
				break;
			}
			posicao ++;
		}
		return posicao;
	}
}
