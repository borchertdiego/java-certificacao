package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
	// 	Declarando uma lista
		List<String> list = new ArrayList<>();
		
		list.add("Diego");
		list.add("Maria");
		list.add("João");
		list.add("Marcio");
		
		for (String name: list) {
			System.out.println(name);
		}
		
		System.out.println("---------------");
		
	//	Utilizando predicado com lambda para retornar todos nomes começas em M utilizando o Collectors
		List<String> filter = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		
		for (String name: filter) {
			System.out.println(name);
		}
		
		System.out.println("---------------");
		
	//	Utilizando o predicado com lambda para remover o primerio nome com M
		list.removeIf(name -> name.charAt(0) == 'M');
		
		for (String name: list) {
			System.out.println(name);
		}
	}
}