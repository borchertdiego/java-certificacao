package application;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
	
	//	Delcarado matriz com tamanho fixo
		int[][] mat = new int[n][m];
		
	//  Percorre a matriz com mat.length (tamanho da coluna) e mat[i].length (tamanho da linha)
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					
					if (j-1 != -1) { //ou j > 0
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (j+1 < mat[i].length) { //j < mat[i].length-1
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i-1 != -1) { //ou i > 0
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (i+1 < mat.length) { //i < mat.length-1
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
				
		sc.close();
	}
}
