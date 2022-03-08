package CalculoArea;

public class Quadrado implements AreaCalculavel {

	double lado;

	Quadrado(double lado){
		this.lado = lado;
	}
	
	@Override
	public double calculoArea() {
		double areaQuadrado = lado * lado;
		return areaQuadrado;
	}

}
