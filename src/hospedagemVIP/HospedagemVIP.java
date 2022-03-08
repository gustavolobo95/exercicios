package hospedagemVIP;

public class HospedagemVIP extends Hospedagem{

	HospedagemVIP(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	double valorAdicional = 500;

	@Override
	double printValor() {
		// TODO Auto-generated method stub
		return super.printValor() + valorAdicional;
	}

	
	
}
