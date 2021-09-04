package exercicios.quatro;

import java.util.Arrays;
import java.util.Random;

public class exercicio2 {

	public static void main(String[] args) {
		int cont= 0;
		int soma = 0;
		int maior = 0;
		
		int vetor[] = new int[10];
		Random aleatorio = new Random();
		
		for(int i = 0; i < 10; i++) {
			vetor[i] = aleatorio.nextInt(10);
			soma += vetor[i];
			if(vetor[i] > maior) {
				maior = vetor[i];
				cont = 0;
			}
			if(vetor[i] == maior)
				cont++;
			
			}

		System.out.println("Valores sorteados de 0 até 10: " + Arrays.toString(vetor));
		System.out.println("Média dos valores: " +  (soma/10));
		System.out.println("O maior número foi: " + maior + " e foi lançado: " + cont + " vezes.");
	}

}
