package ligacao;

public class Telefone implements Phone {

	@Override
	public void ligar() {
		System.out.println("PHONE|TELEFONE: Ligação iniciada");
	}

	@Override
	public void atender() {
		System.out.println("PHONE|TELEFONE: Ligação atendida");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("PHONE|TELEFONE: Correio de voz iniciado");		
	}

}
