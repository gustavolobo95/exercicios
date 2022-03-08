package CalculoArea;

public class Retangulo implements AreaCalculavel{
	
	double altura;
	double largura;
	
	Retangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}
	
	
	@Override
	public double calculoArea() {
		double areaRetangulo = altura * largura;
		return areaRetangulo;
	}

}
