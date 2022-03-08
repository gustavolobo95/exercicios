package CalculoArea;

public class Teste {
	public static void main(String[] args) {
		
		Quadrado quadrado = new Quadrado(25);
		
		Retangulo retangulo = new Retangulo(15, 20);
		
		Circulo circulo = new Circulo(50);
		
		System.out.println(quadrado.calculoArea());
		
		System.out.println(retangulo.calculoArea());
		
		System.out.println(circulo.calculoArea());
		
	}
	
	
	
}
