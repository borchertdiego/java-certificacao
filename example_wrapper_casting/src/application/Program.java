package application;

import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int x = 20;
		
		Object obj = x; //o obj vai apontar para um local alocado na memória com o valor 20
		
		int y = (int) obj; //o y vai receber o valor para onde obj está apontado convertido para int
		
		System.out.println(obj + "" + y);
		
		Integer obj1 = x; //o Wrapper é uma classe que representa os valores primitivos da linguagem
						  //fazendo o boxing e unboxing naturais, admitindo valores nulos e utilizando funções
						  //da OO
		
		System.out.println(obj1);
		
		//for each
		
		String[] vect = new String[] {"Diego", "Chris", "Nicolle"};
		
		for (String names : vect) {
			
			System.out.println(names);
		}
	}

}
