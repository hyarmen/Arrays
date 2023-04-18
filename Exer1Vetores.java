package Arrays;

import java.util.Scanner;

public class Exer1Vetores {

	public static void main(String[] args) {
		int[] vetor = {2,5,1,3,4,9,7,8,10,6};
		int num, i;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o número que você quer encontrar: ");
		num = leia.nextInt();
		
		for(i=0;i<10;i++) {
			if(vetor[i]==num) {
				System.out.println("\nO número "+num+" está localizado na posição: "+i);
			} else {
				System.out.println("\nO número "+num+" não foi encontrado");
				break;
			}
		}
	}

}
