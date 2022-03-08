package hospedagemVIP;

public class Teste {
	
	public static void main(String[] args) {
		Hospedagem hospedagem = new Hospedagem(2500);
		
		Hospedagem hospedagemVip = new HospedagemVIP(2500);
	
		System.out.println(hospedagem.printValor());
		System.out.println(hospedagemVip.printValor());
		
	}
	
}
