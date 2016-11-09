package dia091116;

import java.util.Scanner;

public class Desafios {

	public Desafios() {
		//Exercicio0();
		//Exercicio1();
		Exercicio2();
		
		
		
	}
public void Exercicio0(){
	
	System.out.println("programa inserir valores e somar todos os numeros pares ate ao valor inserido" + "\n");
	// escreva um programa que insira um numero e some todos os numeros pares ate ao valor inserido
	int x = 0;
	int soma = 0;
	  System.out.println("insira um numero:\n");
      x = (new Scanner(System.in).nextInt());
	
	for (int i = 0; i <= x; i+=2) {
		soma += i;
		
		 System.out.println(soma);
		
	}
	 System.out.println("o resultado da soma de todos os numeros pares ate " + x + " é " + soma + "\n");
	
	
}
	
	public void Exercicio1(){
		// escreva um  programa que insira valores em um array
		int [] inserir = new int[5];
		System.out.println("programa inserir valores em um array" + "\n");
		
		for (int i = 0 ,x = 0; i < inserir.length; i++) {
			 System.out.println("insira um numero:\n");
	          inserir[i] = (new Scanner(System.in).nextInt());
			
		}
		
		for (int x = 0; x < inserir.length; x++) {
			System.out.println(inserir[x] + "\n");
			
		}
		
		
		
	}
	
	public void Exercicio2(){
		System.out.println("programa inserir  3 notas em um array do tipo float que mostre a soma e faça a sua media ");
		
		//escreva um programa que insira 3 notas em um array do tipo float que mostre a soma e faça a sua media 
		float [] notas = new float[3];
		float soma=0;
		float media=0;
		for (int i = 0 ,x = 0; i < notas.length; i++) {
			 System.out.println("insira um numero:\n");
	          notas[i] = (new Scanner(System.in).nextFloat());
		}
		
		
		
		for (int x = 0; x < notas.length; x++) {
			soma+=notas[x];
			
			
		}
		System.out.println("a soma das notas = "+soma + "\n");
		
		System.out.println("a media das notas = "+ soma/3 + "\n");
		
		
	}
	
	
}
