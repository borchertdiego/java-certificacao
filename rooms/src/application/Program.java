package application;

import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	//	Declaração de um vetor com tamanho fixo
		Student[] rooms = new Student[10];
		int N;
		
		System.out.print("How many rooms will be rented? ");
		N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			System.out.printf("\nRent #%d:\n", i);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int numRoom = sc.nextInt();
			
			rooms[numRoom] = new Student(name, email);
		}
		
		System.out.println("\nBusy rooms:");
		
	//  Percorrendo um vetor com tamanho fixo
		for (int i = 1; i < rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.println(i + ": " + rooms[i]);
			}
		}
		
		sc.close();
	}
}
