package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		List<Employee> employee = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();

		for(int i = 1; i <= N; i++) {
			System.out.printf("Emplyoee #%d:\n", i);
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			System.out.println();
			
			employee.add(new Employee(id, name, salary));
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		
	//  Utiliza a expressão lambda em um predicado
		Employee emp = employee.stream().filter(register -> register.getId() == id).findFirst().orElse(null);
	/* 	A expressão a cima verifica se na lista existe um id igual ao que foi passado  *
	 *	e retorna o primeiro caso verdadeiro                                           */
	//  stream().filter(lambda) - predicate
		
		if (emp == null) {
			System.out.println("This id does not exist!\n");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			System.out.println();
			
			emp.salaryIncrease(percentage);
		}
		
		System.out.println("List of employees:");
		
		for (Employee register: employee) {
			System.out.println(register.toString());
		}
		
		sc.close();
	}
}