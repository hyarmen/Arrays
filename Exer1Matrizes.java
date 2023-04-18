package Arrays;

import java.util.Scanner;

public class Exer1Matrizes {

	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		int linha, coluna;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.println("\nEntre com um número: ");
				matriz[linha][coluna] = leia.nextInt();
			}
		}
		
		System.out.println("\nElementos da Diagonal Principal: "+matriz[0][0]+" "+matriz[1][1]+" "+matriz[2][2]);
		System.out.println("\nElementos da Diagonal Secundária: "+matriz[0][2]+" "+matriz[1][1]+" "+matriz[2][0]);
		System.out.println("\nSoma dos elementos da Diagonal Principal: "+(matriz[0][0]+matriz[1][1]+matriz[2][2]));
		System.out.println("\nSoma dos elementos da Diagonal Secundária: "+(matriz[0][2]+matriz[1][1]+matriz[2][0]));
	}

}
