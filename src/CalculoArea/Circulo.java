package CalculoArea;

public class Circulo implements AreaCalculavel {
	
	double raio;
	
	Circulo(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double calculoArea() {
		double areaCirculo =Math.PI * Math.pow(raio, 2) ;
		return areaCirculo;
	}

}
