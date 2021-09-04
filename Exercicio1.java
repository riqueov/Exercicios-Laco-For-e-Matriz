package exercicios.quatro;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		int numero[] = new int[5];
		int maior = 0;

		Scanner leia = new Scanner(System.in);
		
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Escreva o " + (i+1) + "º número");
			numero[i] =  leia.nextInt();
				
			if(numero[i] > maior)
				maior = numero[i];
			}
		
		leia.close();
	
		System.out.println("Maior número é: " + maior);

	}

}
